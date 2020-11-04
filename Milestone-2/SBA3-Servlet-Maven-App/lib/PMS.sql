
create table investordata
(
	UserName varchar(15) unique not null,
    Password varchar(20) not null,
    FirstName varchar(25) not null,
    LastName varchar(25) not null,
	PAN varchar(10) unique not null,
    Gender varchar(10) not null,
    Age int not null,
    Place varchar (50),
    Address varchar (60),
    MobileNum varchar(10),
    primary key(PAN)    
);

create table commodities(

CommodityType varchar (50),
CommodityName varchar (50),
CommodityPrice decimal (5,2),
primary key (CommodityName)
);

create table companyprofile(

CompanyCode varchar (50) unique not null,
CompanyTitle varchar (50),
Operations varchar (50),
ShareCount int ,
OpenSharePrice decimal(10,2),
sector varchar(50),
Currency decimal (10,2),
Turnover decimal(10,2),
primary key (CompanyCode)
);

create table stockdata(
CompanyCode varchar(50) unique not null,
StockExchangePrice decimal (10,2),
CurrentPrice decimal (10,2),
Dateadded date,
Timeadded time,
primary key(CompanyCode)
);

create table commissionreport(

PAN varchar(10) not null,
CompanyCode varchar(50),
TransactionType varchar(20),
Commission decimal(10,20),
TransactionDate date,

foreign key (PAN) references investordata(PAN)
);

create table investorprofile(

PAN varchar(10) not null,
PortfolioWallet decimal(10,2),
CurrentPortfolioValue decimal(10,2),
InvestedAmount decimal(10,2),
EarnedAmount decimal (10,2),
DepositedAmount decimal (10,2),
WithdrawnAmount decimal (10,2),
ProfileDate date
);

create table investortransaction(
PAN varchar(10) not null,
CompanyCode varchar(50),
CurrentPrice decimal(10,2),
HoldPrice decimal(10,2),
BuyCount int,
SellCount int,

foreign key(PAN) references investordata(PAN)

);