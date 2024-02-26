self.addEventListener("install", (e) => { 
    console.log("installed");
  });
  self.addEventListener("activate", (e) => { 
    console.log("activated");
  });
  self.addEventListener("fetch", (e) => { 
    console.log("fetched");
    // Fetching user data from the GitHub API
    fetch("https://api.github.com/users/Jayasimhasr")
      .then((response) => {
        return response.json();
      })
      .then((json) => {
        console.log(json);
      })
      .catch((error) => {
        console.log(error);
      });
  });