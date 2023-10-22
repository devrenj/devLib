class Components extends HTMLElement {
  constructor() {
    super();
    
    const shadow = this.attachShadow({mode: "open"})
    shadow.appendChild(this.componentBody());
    shadow.appendChild(this.componentStyle());

  }

  componentBody() {
    const componentRoot = dceId(componentRoot, 'header', 'menuDev');

    const olMenuTopo = dceClass(olMenuTopo, 'ol', 'menuTopo');

    const liGithubIcone = dceCLass(liGithubIcone, 'li', 'githubIcone');

    const liCaminho = dceId(liCaminho, 'li','caminho');

    const liCaminho1 = dceId(liCaminho1, 'li', 'caminho1');

    const liCaminho2 = dceId(liCaminho2, 'li', 'caminho2');

    const liLocal = dceId(liLocal, 'li', 'local');
    const aLink = dce('a');
    const aLink = dce
TODO check

    const gitImg = dce('img');

    return componentRoot;

  }

  componentStyle() {
    const style = dce('style');
    style.textContent = `
    * {
    font-family: 'Roboto', sans-serif;
    margin: 0;
    padding: 0;
    box-sizing: border-box;  
    }
  
    #menuDev {
      background: linear-gradient(rgba(132, 0, 255, 0.5), rgb(132, 0, 255), blueviolet, blueviolet, #000000fa);
    }
  
    .menuTopo {
      display: flex;
      flex-direction: row;
      justify-content: center;
      align-items: center;
    }
  
    .menuTopo li {
      list-style-type: none;
      margin: 2px;
      padding: 1px 10px 0px 10px;
      border: 2px solid white;
      border-radius: 20px;
      color: rgba(192, 192, 192, 0.507);
    }
  
    .menuTopo li a:hover {
      color: cadetblue;
    }
  
    .menuTopo li a {
      color: rgba(192, 192, 192, 0.507);
      text-decoration: none;
    }
  
    #githubIcone {
      display: flex;
      flex-direction: row;
      justify-content: center;
      align-items: center;
      margin: 2px;
      padding: 1px 10px 0px 10px;
      color: black
    }
  
    #githubIcone a {
      text-decoration: none;
    }
  
    #githubIcone img {
      width: 30px;
      height: 30px;
    }
    
    #local, #caminho, #caminho1, #caminho2 {
      color: rgb(255, 255, 255);
      font-weight: bold;
      border: 0;
    }
    `
    return style;
  }
}

/**
 * Document Create Element (simples)
 * 
 * Faz o trabalho de espelhar a variável ao elemento HTML
 * @param {*} variable 
 */
function dce (variable) {
  document.createElement(variable);
}

/**
 * Document Create Element - Class
 * 
 * Faz o trabalho de espelhar a variável ao elemento HTML e atribui uma classe instantaneamente
 * @param variable Variável que será modificada
 * @param {*} html Elemento HTML a ser atribuído
 * @param {*} name Define e atribui um nome de classe
 */
function dceClass (variable, html, name) {
  document.createElement(input);
  variable.setAttribute('class', input)
}

/**
 * Document Create Element - ID
 * 
 * Faz o trabalho de espelhar a variável ao elemento HTML e atribui um ID instantaneamente
 * @param variable Variável que será modificada
 * @param {*} html Elemento HTML a ser atribuído
 * @param {*} name Define e atribui um nome de ID
 */
function dceId (variable, html, name) {
  document.createElement(input);
  variable.setAttribute('id', input)
}

TODO check
/**
 * Document Create Element - Link
 * 
 * Faz o trabalho de espelhar a variável ao elemento HTML e atribui um Link instantaneamente
 * @param variable Variável que será modificada
 * @param {*} html Elemento HTML a ser atribuído
 * @param {*} name Define e atribui um nome de Link
 */
function dceId (variable, html, name) {
  document.createElement(input);
  variable.setAttribute('id', input)
}

customElements.define('devrenj-menubar', Components);