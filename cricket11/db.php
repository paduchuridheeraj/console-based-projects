<?php
  $conn = new mysqli('localhost', 'root', '', 'cricket');
  if (isset($_POST['submit'])) {
    $player_name = $_POST['player_name'];
    $batting_style = $_POST['batting_style'];
    $batting_order = $_POST['batting_order'];
    $bowling_style = $_POST['bowling_style'];
    $additional_responsibility = $_POST['additional_responsibility'];
  
    $query = "INSERT INTO cricket_players (player_name, batting_style, batting_order, bowling_style, additional_responsibility) VALUES ('$player_name', '$batting_style', '$batting_order', '$bowling_style', '$additional_responsibility')";
    $result = mysqli_query($conn, $query);
    echo "<h3>players details are successfully inserted to the database</h3>";
    
    $conn->close();
  }
  ?>