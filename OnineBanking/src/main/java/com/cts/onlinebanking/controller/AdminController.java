package com.cts.onlinebanking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cts.onlinebanking.model.CurrentAccount;
import com.cts.onlinebanking.model.Deposit;
import com.cts.onlinebanking.model.SavingsAccount;
import com.cts.onlinebanking.model.TransferOthersAccount;
import com.cts.onlinebanking.model.UserDetailsList;
import com.cts.onlinebanking.model.Withdraw;
import com.cts.onlinebanking.service.AdminService;

@Controller
@RequestMapping("/admin")
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	
	@GetMapping("/home")
	public String showHome()
	{
		return "admin";
	}
	
	@GetMapping("/users")
	public String showUsers(Model model)
	{
		List<SavingsAccount> savingDetail = adminService.getSavingDetail();
		List<CurrentAccount> currentDetail = adminService.getCurrentDetail();
		adminService.saveUserDetails(savingDetail, currentDetail);
		List<UserDetailsList> list = adminService.getUserDetails();
		model.addAttribute("details", list);
		return "users";
	}
	
	@GetMapping("/deposit")
	public String showDepositTransaction(Model model)
	{
		List<Deposit> list = adminService.getDepositTransaction();
		model.addAttribute("details", list);
		return "depositTransaction";
	}
	
	@GetMapping("/withdraw")
	public String showWithdrawTransaction(Model model)
	{
		List<Withdraw> list = adminService.getWithdrawTransaction();
		model.addAttribute("details", list);
		return "withdrawTransaction";
	}
	
	
	@GetMapping("/transaction")
	public String showTransferTransaction(Model model)
	{
		List<TransferOthersAccount> list = adminService.getTransferTransaction();
		model.addAttribute("details", list);
		return "transferTransaction";
	}
	
	@GetMapping("/delete/{userName}")
	public String removeUser(@PathVariable String userName)
	{
		adminService.removeUser(userName);
		return "redirect:/admin/users";
	}
}
