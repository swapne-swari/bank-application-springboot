<!DOCTYPE html>
<html>
    <head><title>Check Account Balance</title></head>
    <body background=""> 
        
        <div><center> <nav>
        <h1>Welcome to BANK</h1>
        <h1 >BANK</h1>
        <h3 style="box-sizing: border-box; background-color:#90EE90"> <a href="/">Home</a> &nbsp; &nbsp;
            <a href="/newAccount">New Account</a> &nbsp; &nbsp;
            <a href="/balance">Balance</a>  &nbsp;&nbsp;
            <a href="/deposit">Deposit</a> &nbsp;&nbsp;
            <a href="/withdraw">Withdraw</a> &nbsp;&nbsp;
            <a href="/transfer">Transfer</a> &nbsp;&nbsp;
            <a href="/closeAccount">Close Account</a> &nbsp;&nbsp;
            <a href="/about">AboutUs</a></h3>
    </nav>
        </center></div>
        <center>
        <fieldset style="width: 300px;">
        <legend>Deposit Amount</legend>
        <form action="/depositCode" method="post">
            Account Number: <input type="text" name="account_number"><p></p>
            Name: <input type="text" name="user_name"><p></p>
            Password: <input type="password" name="password"><p></p>
            Amount: <input type="text" name="deposit"> <br><br>
            &nbsp;&nbsp;&nbsp;&nbsp;<input type="submit">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="reset" value="clear">
        </form></fieldset></center>

</html>