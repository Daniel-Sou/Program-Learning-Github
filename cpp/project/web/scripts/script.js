var incomeMOP = document.getElementById("income-mop");
var incomeHKD = document.getElementById("income-hkd");
var incomeUSD = document.getElementById("income-usd");
var wealthMOP = document.getElementById("wealth");
var taxSUM = document.getElementById("tax");
var mopEx = document.getElementById("mopex");

incomeMOP.addEventListener("input", calculate);
wealthMOP.addEventListener("input", calculate);
mopEx.addEventListener("input",calculate);

function double(a) {
    return a * 2;
}

// Function to calculate MOP tax
function incomeTaxMOP(a) {
    if (a <= 0) {
        return 0;
    } else if (a <= 164000) {
        return a * 0.07;
    } else if (a <= 184000) {
        return a * 0.08;
    } else if (a <= 224000) {
        return a * 0.09;
    } else if (a <= 304000) {
        return a * 0.1;
    } else if (a <= 424000) {
        return a * 0.11;
    } else {
        return a * 0.12;
    }
}

// Function to calculate HKD tax
function incomeTaxHKD(TaxableIncomeHKD) {
    if (TaxableIncomeHKD <= 0) {
        return 0;
    } else if (TaxableIncomeHKD <= 50000) {
        return TaxableIncomeHKD * 0.02;
    } else if (TaxableIncomeHKD <= 100000) {
        return 50000 * 0.02 + (TaxableIncomeHKD - 50000) * 0.06;
    } else if (TaxableIncomeHKD <= 150000) {
        return 50000 * 0.02 + 50000 * 0.06 + (TaxableIncomeHKD - 100000) * 0.1;
    } else if (TaxableIncomeHKD <= 200000) {
        return 50000 * 0.02 + 50000 * 0.06 + 50000 * 0.1 + (TaxableIncomeHKD - 150000) * 0.14;
    } else {
        return 50000 * 0.02 + 50000 * 0.06 + 50000 * 0.1 + 50000 * 0.14 + (TaxableIncomeHKD - 200000) * 0.17;
    }
}

// function to calculate USD in household country, exchange
function exchangeUSD(ex = 1) {
    var incomeUSD = incomeMOP.value / ex;
    return incomeUSD;
}

// Function with updated by ISOM3029 Required - Main function
function calculate() {
    // Implement the Macau Tax
    var mopTax = incomeTaxMOP(incomeMOP.value);
    // Implement the HK Tax
    var hkdTax = incomeTaxHKD(incomeHKD.value);
    var wealthTax;

    incomeUSD.value = exchangeUSD(mopEx.value);

    var wealthTax = 0.25 * wealthMOP.value;
    var tax = mopTax + wealthTax + hkdTax;

    // round with 2 decimal places
    taxSUM.value = Math.round(tax * 100) / 100;
}
