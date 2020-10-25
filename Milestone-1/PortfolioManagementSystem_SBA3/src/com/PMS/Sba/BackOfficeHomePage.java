package com.PMS.Sba;
public class BackOfficeHomePage

{
	private boolean CreateCompany;
	private boolean ModifyCompany;
	private boolean AddStockPrices;
	private boolean CreateCommodities;
	private boolean ModifyCommodities;
	private boolean AddCommodityPrice;
	private boolean GenerateCommissionReport;
	
	public BackOfficeHomePage() {
		super();
	}
	
	public BackOfficeHomePage(boolean createCompany, boolean modifyCompany, boolean addStockPrices,
			boolean createCommodities, boolean modifyCommodities, boolean addCommodityPrice,
			boolean generateCommissionReport) {
		super();
		CreateCompany = createCompany;
		ModifyCompany = modifyCompany;
		AddStockPrices = addStockPrices;
		CreateCommodities = createCommodities;
		ModifyCommodities = modifyCommodities;
		AddCommodityPrice = addCommodityPrice;
		GenerateCommissionReport = generateCommissionReport;
	}
	public boolean isCreateCompany() {
		return CreateCompany;
	}
	public void setCreateCompany(boolean createCompany) {
		CreateCompany = createCompany;
	}
	public boolean isModifyCompany() {
		return ModifyCompany;
	}
	public void setModifyCompany(boolean modifyCompany) {
		ModifyCompany = modifyCompany;
	}
	public boolean isAddStockPrices() {
		return AddStockPrices;
	}
	public void setAddStockPrices(boolean addStockPrices) {
		AddStockPrices = addStockPrices;
	}
	public boolean isCreateCommodities() {
		return CreateCommodities;
	}
	public void setCreateCommodities(boolean createCommodities) {
		CreateCommodities = createCommodities;
	}
	public boolean isModifyCommodities() {
		return ModifyCommodities;
	}
	public void setModifyCommodities(boolean modifyCommodities) {
		ModifyCommodities = modifyCommodities;
	}
	public boolean isAddCommodityPrice() {
		return AddCommodityPrice;
	}
	public void setAddCommodityPrice(boolean addCommodityPrice) {
		AddCommodityPrice = addCommodityPrice;
	}
	public boolean isGenerateCommissionReport() {
		return GenerateCommissionReport;
	}
	public void setGenerateCommissionReport(boolean generateCommissionReport) {
		GenerateCommissionReport = generateCommissionReport;
	}
	
}

/*
 * we have to create similar class as below for other functionalities as well
 * and extend class InvestorDashboardPage
 */
class CreateNewCompany extends BackOfficeHomePage

{
	
}