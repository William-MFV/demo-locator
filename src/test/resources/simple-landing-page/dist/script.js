//ON SCROLL SHOW MENU BAR
if (window.matchMedia("(max-width: 700px)").matches === false) {
    window.onscroll = function() { scrollFunction() };

    function scrollFunction() {
        if (document.body.scrollTop > 80 || document.documentElement.scrollTop > 80) {
            document.getElementsByTagName("nav")[0].className = "full_nav";
        } else {
            document.getElementsByTagName("nav")[0].className = "";
        }
    }

    //Detect menu button click
    function nav() {
        document.getElementsByTagName("nav")[0].className = "";
    }
}

/*
  1. Using a normal HTML element, but attaching a Shadow DOM
*/
let myElement = document.querySelector('#shadow-el');
let shadow = myElement.attachShadow({
    mode: 'open'
});
shadow.innerHTML = `
  <style>
    p {
      color: red;
    }
  </style>

  <button id= "dom_button" style="background-color:lightgreen" type="button">Element with Shadow DOM</button>
`;


/*
  2. Using a custom element
*/
class AnotherElement extends HTMLElement {
    constructor() {
        super();

    }
}