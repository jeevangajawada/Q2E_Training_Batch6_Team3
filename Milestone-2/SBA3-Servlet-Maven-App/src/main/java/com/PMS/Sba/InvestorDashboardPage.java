package com.PMS.Sba;
public class InvestorDashboardPage

{
	private boolean CurrentPortfoliovalues;
	private boolean RecentlyViewedCompanies;
	private int AmountInvestedasonDate;
	private int AmountEarnedasonDate;
	private boolean TrendingChart;
	private boolean SelectCurrencyofTrading;
	private boolean Searchcompanyandaccessprofile;
	private boolean Choosecompanyandcomparesharevalue;
	private boolean BuyStocks;
	private boolean SellStocks;
	private int DepositAmount;
	private int WithdrawAmount;
	private boolean GeneratePortfolioReport;
	
	
	public InvestorDashboardPage() {
		super();
	}

	public InvestorDashboardPage(boolean currentPortfoliovalues, boolean recentlyViewedCompanies,
			int amountInvestedasonDate, int amountEarnedasonDate, boolean trendingChart,
			boolean selectCurrencyofTrading, boolean searchcompanyandaccessprofile,
			boolean choosecompanyandcomparesharevalue, boolean buyStocks, boolean sellStocks, int depositAmount,
			int withdrawAmount, boolean generatePortfolioReport) {
		super();
		CurrentPortfoliovalues = currentPortfoliovalues;
		RecentlyViewedCompanies = recentlyViewedCompanies;
		AmountInvestedasonDate = amountInvestedasonDate;
		AmountEarnedasonDate = amountEarnedasonDate;
		TrendingChart = trendingChart;
		SelectCurrencyofTrading = selectCurrencyofTrading;
		Searchcompanyandaccessprofile = searchcompanyandaccessprofile;
		Choosecompanyandcomparesharevalue = choosecompanyandcomparesharevalue;
		BuyStocks = buyStocks;
		SellStocks = sellStocks;
		DepositAmount = depositAmount;
		WithdrawAmount = withdrawAmount;
		GeneratePortfolioReport = generatePortfolioReport;
	}

	public boolean isCurrentPortfoliovalues() {
		return CurrentPortfoliovalues;
	}
	public void setCurrentPortfoliovalues(boolean currentPortfoliovalues) {
		CurrentPortfoliovalues = currentPortfoliovalues;
	}
	public boolean isRecentlyViewedCompanies() {
		return RecentlyViewedCompanies;
	}
	public void setRecentlyViewedCompanies(boolean recentlyViewedCompanies) {
		RecentlyViewedCompanies = recentlyViewedCompanies;
	}
	public int getAmountInvestedasonDate() {
		return AmountInvestedasonDate;
	}
	public void setAmountInvestedasonDate(int amountInvestedasonDate) {
		AmountInvestedasonDate = amountInvestedasonDate;
	}
	public int getAmountEarnedasonDate() {
		return AmountEarnedasonDate;
	}
	public void setAmountEarnedasonDate(int amountEarnedasonDate) {
		AmountEarnedasonDate = amountEarnedasonDate;
	}
	public boolean isTrendingChart() {
		return TrendingChart;
	}
	public void setTrendingChart(boolean trendingChart) {
		TrendingChart = trendingChart;
	}
	public boolean isSelectCurrencyofTrading() {
		return SelectCurrencyofTrading;
	}
	public void setSelectCurrencyofTrading(boolean selectCurrencyofTrading) {
		SelectCurrencyofTrading = selectCurrencyofTrading;
	}
	public boolean isSearchcompanyandaccessprofile() {
		return Searchcompanyandaccessprofile;
	}
	public void setSearchcompanyandaccessprofile(boolean searchcompanyandaccessprofile) {
		Searchcompanyandaccessprofile = searchcompanyandaccessprofile;
	}
	public boolean isChoosecompanyandcomparesharevalue() {
		return Choosecompanyandcomparesharevalue;
	}
	public void setChoosecompanyandcomparesharevalue(boolean choosecompanyandcomparesharevalue) {
		Choosecompanyandcomparesharevalue = choosecompanyandcomparesharevalue;
	}
	public boolean isBuyStocks() {
		return BuyStocks;
	}
	public void setBuyStocks(boolean buyStocks) {
		BuyStocks = buyStocks;
	}
	public boolean isSellStocks() {
		return SellStocks;
	}
	public void setSellStocks(boolean sellStocks) {
		SellStocks = sellStocks;
	}
	public int getDepositAmount() {
		return DepositAmount;
	}
	public void setDepositAmount(int depositAmount) {
		DepositAmount = depositAmount;
	}
	public int getWithdrawAmount() {
		return WithdrawAmount;
	}
	public void setWithdrawAmount(int withdrawAmount) {
		WithdrawAmount = withdrawAmount;
	}
	public boolean isGeneratePortfolioReport() {
		return GeneratePortfolioReport;
	}
	public void setGeneratePortfolioReport(boolean generatePortfolioReport) {
		GeneratePortfolioReport = generatePortfolioReport;
	}
}

/*
 * we have to create similar class as below for other functionalities as well
 * and extend class InvestorDashboardPage
 */
class SellStocks extends InvestorDashboardPage

{
	
}