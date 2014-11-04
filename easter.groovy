import java.text.DateFormat

Date easter(int y){
/* ΜΑΘΗΜΑΤΙΚΟΣ ΤΥΠΟΣ ΥΠΟΛΟΓΙΣΜΟΥ ΤΗΣ ΗΜΕΡΟΜΗΝΙΑΣ ΤΟΥ ΟΘΡΟΔΟΞΟΥ ΠΑΣΧΑ
(Χ = χρόνος που θέλουμε να βρούμε το Πάσχα).
Χ: 19                   το υπόλοιπο από τη διαίρεση = α   
Χ: 4                     το υπόλοιπο από τη διαίρεση = β
Χ: 7                     το υπόλοιπο από τη διαίρεση = γ
{(αΧ19)+15}: 30           το υπόλοιπο από τη διαίρεση = δ
{2β+4γ+6δ+6}: 7          το υπόλοιπο από τη διαίρεση = ε
Πάσχα = δ+ε+4 Απριλίου (Μαΐου αν ο αριθμός>30)
*/
    
    int a=y%19;
    int b=y%4;
    int c=y%7;
    int d=((a*19)+15)%30;
    int e=(((2*b)+(4*c)+(6*d)+6)%7)
    int P=d+e+4;
    int easterMonth =4;
    int easterDay= P;
    if (P>30) {
        easterDay=P-30;
        easterMonth=5;
    }
     def easter = y+"-"+easterMonth+"-"+easterDay
     return new Date().parse("yyyy-M-d", easter)    
}

//Example
println easter(2010)
println easter(2011)
println easter(2012)
println easter(2013)
println easter(2014)
println easter(2015)
println easter(2077)
