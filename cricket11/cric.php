
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Cricketer's List</title>
  <style>
    
    @import url('https://fonts.googleapis.com/css2?family=Bree+Serif&family=Caveat:wght@400;700&family=Lobster&family=Monoton&family=Open+Sans:ital,wght@0,400;0,700;1,400;1,700&family=Playfair+Display+SC:ital,wght@0,400;0,700;1,700&family=Playfair+Display:ital,wght@0,400;0,700;1,700&family=Roboto:ital,wght@0,400;0,700;1,400;1,700&family=Source+Sans+Pro:ital,wght@0,400;0,700;1,700&family=Work+Sans:ital,wght@0,400;0,700;1,700&display=swap');
    
  form {
    width: 28%;
    margin: 40px auto;
    padding: 20px;
    border: 1px solid #ccc;
    border-radius: 10px;
    box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
    align-items: center;
    padding-top: 30px;
    
  }
  
  label {
    display: block;
    margin-bottom: 10px;
    color: rgb(233, 238, 235);
  }
  
  input[type="text"] {
    width: 100%;
    height: 30px;
    border-radius: 5px;
  }
  
  input[type="number"] {
    width: 100%;
    height: 30px;
    border-radius: 5px;
  }

  select {
    width: 100%;
    height: 30px;
    border-radius: 5px;
  }

  input[type="submit"] {
    width: 100%;
    height: 40px;
    background-color: orange;
    color: #fff;
    padding: 10px;
    border: none;
    border-radius: 5px;
    cursor: pointer;
  }
  
  input[type="submit"]:hover {
    background-color: rgb(227, 178, 86);
  }

  .bg_im{
    background-image: url(bg_im3.webp);
    height: 100vh;
    width: 100vw;
    background-size: cover;
    background-position: center;
  }

  h1{
    text-align: center;
    color:whitesmoke;
    text-shadow: 1px;
    font-size: 60px;
    font-family: cursive;

  }
  </style>
</head>
<body>
  <div class="bg_im">
  <h1>Player Details</h1>
  <form method="post" action="db.php" method="post">
    <label for="player_name">Player Name:</label>
    <input type="text" id="player_name" name="player_name"><br><br>
    <label for="batting_style">Batting Style:</label>
    <select id="batting_style" name="batting_style">
      <option value="">Select</option>
      <option value="Right-handed">Right-handed</option>
      <option value="Left-handed">Left-handed</option>
      <option value="none">none</option>
    </select><br><br>
    <label for="batting_order">Batting Order:</label>
    <input type="number" id="batting_order" name="batting_order"><br><br>
    <label for="bowling_style">Bowling Style:</label>
    <select id="bowling_style" name="bowling_style">
      <option value="">Select</option>
      <option value="Right-arm fast">Right-arm fast</option>
      <option value="Left-arm fast">Left-arm fast</option>
      <option value="Right-arm spin">Right-arm spin</option>
      <option value="Left-arm spin">Left-arm spin</option>
      <option value="none">none</option>
    </select><br><br>
    <label for="additional_responsibility">Additional Responsibility:</label>
    <input type="text" id="additional_responsibility" name="additional_responsibility"><br><br>
    <input type="submit" name="submit" value="Submit">
  </form>
  <?php
  include ("db.php");
  ?>
  </div>
  
  <script src="script.js"></script>
</body>
</html>

