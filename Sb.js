<!DOCTYPE html>
<html>
<body>

<h2>Bonus & Salary Calculator</h2>
<h4>Task 1</h4>

<p id="demo"></p>

<script>
let year = parseInt(prompt("What is your year of birth (YYYY): "));
let salary = parseInt(prompt("What is your current salary (please enter numbers only): "));

if(year>2000 && year<2004){
    salary = ((5/100)*salary)+salary;
    document.write("Your expected bonus and salary is "+ salary);
}
else if(year>1990 && year<2001){
    salary = ((10/100)*salary)+salary;
    document.write("Your expected bonus and salary is "+ salary);
}
else if (year>1970 && year<1991){
    salary = ((20/100)*salary)+salary;
    document.write("Your expected bonus and salary is "+ salary);
}
else{
    document.write("Unfortunately, you do not qualify for the bonus");
}

</script>

</body>
</html>
