<!DOCTYPE html>
<html>
    <head><title>New Account opening form</title></head>
    <body> 
        
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
    
    <div style="ruby-align: center;"> <center><fieldset style="width: 500px; text-align: center; padding: 10px; margin: 10px;">
    <legend>New Account opening form</legend>
        <form action="/saveAccount" method="post">
            
            Account Number: <input type="text" name="account_number" required><p></p>
            Name: <input type="text" name="user_name" required><p></p>
            Password: <input type="password" name="password" required>
            <p></p>
            Confirm Password: <input type="password" name="confirm_password" required><p></p>
            Amount: <input type="text" name="amount" min="500" max="10000" required><p></p>
            Address: <input type="text" name="address" required><p></p>
            Email:<input type="email" name="email" required><p></p>
            Mobile Number: <input type="text" name="mobile_number" pattern="[0-9]{10}" title="Please enter a 10-digit phone number" required><p></p>
            <input type="submit" value="Submit"> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input type="reset">
        </form></center>
    </fieldset>
       </div>
    </body>
</html>