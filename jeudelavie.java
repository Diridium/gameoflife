void main(){

//Creation du tableau
int tab = 150;
int r = tab/2;
reset(r, r);

int [][] tableau = new int[tab][tab];

//Genere les cellules aleatoirement
for(int i=0; i<tab; i++){
for(int j=0; j<tab; j++){

setPixel(i,j,255);
tableau[i][j] = random(1,5);
if(tableau [i][j]==1) {
setPixel(i-r,j-r,0);}}}

//recherche des voisins
int[][] tableau2 = new int[tab][tab];

int a = 3000;
int n = 0;
while (n!= a){
for(int i=0; i<tab i++){
for(int j=0; j<tab; j++){

//si il y a une cellule dans la case
int etat = getPixel(i-r,j-r);

//recherche des couleurs des voisins
int voisin1 = getPixel(i-1-r,j+1-r);
int voisin2 = getPixel(i-r,j+1-r);
int voisin3 = getPixel(i+1-r,j+1-r);
int voisin4 = getPixel(i-1-r,j-r);
int voisin5 = getPixel(i+1-r,j-r);
int voisin6 = getPixel(i-1-r,j-1-r);
int voisin7 = getPixel(i-r,j-1-r);
int voisin8 = getPixel(i+1-r,j-1-r);
int total = voisin1 + voisin2 + voisin 3 + voisin 4 + voisin5 + voisin6 + voisin7 + voisin8;

//si il y a une cellule
if(etat == 0){
    if(total == 1530){tableau2[i][j] = 1;}else{if(total == 1275){tableau2[i][j]=0;} }
}

//si il n'y a pas de cellule
else{if (total == 1275){tableau2[i][j]=1;}else{ tableau2[i][j]=0;}
}
}}
//clear
for(int i=0; i<tab; i++){
for(int j=0, j<tab; j++){
setPixel(i-r,j-r,255);
}}

//Remplacer tableau1 par tableau2
for(int i=0; i<tab; i++){
for (int j=0; j<tab; j++){
if(tableau2[i][j]==1){
setPixel(i=r,j-r,0;)}
}}
int o = 0;
while (o != 100) {o=o+1;}
n=n+1;
}
}

//           .-/ \                                 / =-\-.
//       _.-~ /   \___  ______ __  _    _     _   /___| ~-._
//       \ /  -~||  __||_  __//  || |  | |  /| | / __/| .\ /
//        / . . ||  __| | |\ / ' || |__| |_/ | || (_/ |   \
//       / / ~| ||____| |_| /_/|_||____|____||_| \___\| |\ \
//      / /   |-~\    \ \ \ | || ||    |    // / /   /~-| \ \
//     / /__ / \  \____\|\_\|_/|_||____|___//_/\/___/  / __\ \
//    /  .-~\   \-~                                 ~-/\/~-.  \
//   /.-~    \                                         /    ~-.\
//  /~      .-                                         -.      ~\    
//  \    .-~                                             ~-.    /
//   \.-~                                                   ~-./