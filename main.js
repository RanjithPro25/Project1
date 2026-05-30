function showWelcome(){
  alert("Welcome! Start learning music theory and instruments.");
}

function showInstrument(name){
  alert(name + " is an important musical instrument.");
}

function checkAnswer(){
  let ans = document.getElementById("answer").value;

  if(ans == "7"){
    document.getElementById("result").innerHTML = "Correct Answer!";
    document.getElementById("result").style.color = "green";
  }
  else{
    document.getElementById("result").innerHTML = "Wrong Answer! Correct answer is 7.";
    document.getElementById("result").style.color = "red";
  }
}