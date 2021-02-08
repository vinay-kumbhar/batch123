package com.crts.app.sme.main.controller;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import javax.imageio.ImageIO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.crts.app.sme.main.model.BranchAddress;
import com.crts.app.sme.main.model.Branch;
import com.crts.app.sme.main.model.Role;
import com.crts.app.sme.main.model.User;
import com.crts.app.sme.main.model.UserAddress;

import com.crts.app.sme.main.service.UserServiceI;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.LuminanceSource;
import com.google.zxing.MultiFormatReader;
import com.google.zxing.NotFoundException;
import com.google.zxing.Result;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.qrcode.QRCodeWriter;

@RestController
public class UserController 
{
	private ResourceLoader resourceLoader;
	
	/*
	 * @Autowired RestTemplate getrst;
	 */
	
	@Autowired
	UserServiceI hs;
	
	
	
	@RequestMapping("/")
	public User demo()
	{
		
		Role role=new Role();
		role.setRoleName("Prajakta");
		role.setRoleStatusCode(1);
		
		
		 BranchAddress addr=new BranchAddress(); 
		 addr.setHouseNo("A-202");
		 addr.setStreetName("XYZ"); 
		 addr.setArea("Karvenagar");
		 addr.setLandMark("BNMKL");
		 addr.setCity("Pune"); 
		 addr.setTaluka("Haveli");
		 addr.setDistrict("ghdgff"); 
		 addr.setState("Mh"); 
		 addr.setCountry("India");
		 addr.setPincode("510");
		 
		
		Branch branch=new Branch();
		branch.setBranchName("CJC");
		branch.setBranchType("ABC");
		branch.setIfscCode("1223");
		branch.setMicrCode(12345);
		branch.setBranchCode(123);
		branch.setBranchContactno(987654);
		branch.setBranchEmailid("prajakta@gmail.com");
		branch.setBranchAddress(addr);
		
		UserAddress usaddr=new UserAddress();
		usaddr.setHouseNo("User-201");
		usaddr.setStreetName("PPPPPP"); 
		usaddr.setArea("PIMPRI");
		usaddr.setLandMark("TEMPLE");
		usaddr.setCity("MUMBAI"); 
		usaddr.setTaluka("Haveli");
		usaddr.setDistrict("KDJDJDJ"); 
		usaddr.setState("MAHARASHTRA"); 
		usaddr.setCountry("India");
		usaddr.setPincode("412008");
		
		
		List<UserAddress> addrl = new ArrayList<UserAddress>();
		
		addrl.add(usaddr);
		
		List<UserAddress> addrp = new ArrayList<UserAddress>();
		
		addrp.add(usaddr);
		
		User u=new User();
		u.setFullName("Devyani");
		u.setUserLaddress(addrl);
		u.setUserPaddress(addrp);
		u.setUserMobno(9922269);
		u.setUserAmobno(87654);
		u.setUserEmail("priyanka@gmail.com");
		u.setUserGender("female");
		u.setUserName("Harshala");
		u.setPassWord("harshu");
		u.setUserRole(role);
		u.setUserBranch(branch);
		u.setUserDob("12/10/2000");
		u.setUserDoj("10/2/2020");
		u.setUserStatusCode(1);
		
		
		
		return u;			
	}
	
	
	  @PostMapping("/saveuser") 
	  public void saveuser(@RequestBody User user) 
	  {
	 hs.savedata(user); }
	 
	@GetMapping("/getUser")
	public List<User> getUserData()
	{ 	
		return hs.getdata();
	}
	
	 
	  @RequestMapping("/createAccount") 
	  public String createNewAccount(@RequestBody User request,Model model ) throws WriterException, IOException 
	  { 
		 // hs.savedata(request);
		  //System.out.println(request.getFullName());
		  String qrCodePath =writeQR(request); 
		  //model.addAttribute("code", qrCodePath); 
		  System.out.println(request.getFullName());
		  
		  //si.saveQRCode(request);
		  //srequest.getFullName();
		  return qrCodePath; 
		  }
	  
	  @GetMapping("/readQR") 
	  public String verifyQR(@RequestParam("qrImage") String qrImage, Model model) throws Exception 
	  { 
		  String qrcode=(String)readQR(qrImage);
	  //model.addAttribute("content",readQR(qrImage)); 
	 // model.addAttribute("code", qrImage); 
	  return qrcode;

	 }
	  
	  
	private Object readQR(String qrImage) throws IOException, NotFoundException 
	{
		
		 final Resource fileResource = resourceLoader.getResource("classpath:static/" + qrImage);
		 
		 File QRfile = fileResource.getFile();
		 
		 BufferedImage bufferedImg = ImageIO.read(QRfile); LuminanceSource source = new
		 BufferedImageLuminanceSource(bufferedImg);
		 
		 BinaryBitmap bitmap = new BinaryBitmap(new HybridBinarizer(source)); 
		 
		 Result result = new MultiFormatReader().decode(bitmap); 
		 
		 System.out.println("Barcode Format: " + result.getBarcodeFormat()); 
		 System.out.println("Content: " + result.getText()); 
		
		 return result.getText();

	}

	private String writeQR(User request) throws WriterException, IOException 
	{
		 String qcodePath = "src/main/resources/static/images/" + request.getFullName() + "-QRCode.png"; 
		 
		 QRCodeWriter qrCodeWriter = new QRCodeWriter(); 
		 
		 BitMatrix bitMatrix = qrCodeWriter.encode(request.getFullName() +"\n"+request.getUserPaddress()+"\n"+
		 request.getUserMobno() + "\n" + request.getUserEmail() + "\n"+ request.getUserGender() +"\n"+ 
		 request.getUserRole() + "\n" + request.getPassWord() +"\n"+ request.getUserName() +"\n"+ request.getUserDob()+"\n"+
		 request.getUserBranch(), BarcodeFormat.QR_CODE, 350, 350); 
		 
		 Path path =FileSystems.getDefault().getPath(qcodePath);
	     
		 MatrixToImageWriter.writeToPath(bitMatrix, "PNG", path);
	     
	     return "/images/" + request.getFullName() + "-QRCode.png"; 
		
	}

}
