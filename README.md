# evidence_lyzi

Projekt PujcovnaLyzi a v něm vytvořte dvě třídy: Lyze a Zakaznik.

Třída Zakaznik bude mít tři datové atributy, všechny typu String: jmeno, prijmeni a adresa. Napište konstruktor, kterým 
zadáte všechny tři údaje, getry na všechny tři údaje a setr na adresu. Metodu toString() naimplementujte tak, že bude vracet jméno a příjmení zákazníka.

Třída Lyže bude mít atributy inventarniCislo typu int, typLyzi typu String, delka typu int a zakaznik typu Zakaznik. 
Konstruktor, kterým bude zadáno identifikační číslo, typ a délka. Hodnota datového atributu zakaznik bude po vytvoření nových lyží null. 
Napište getry na všechny atributy a setr na zakaznika. Metoda toString() bude vracet text obsahující inventární číslo, typ lyží.

Do třídy Lyze přidejte metody equals() a hashCode() implementované tak, že dvoje lyže jsou stejné, pokud mají stejné inventární číslo.

Dále přidejte do projektu třídu EvidenceLyzi s těmito metodami:

public boolean vlozLyze(Lyze lyze) - která přidá lyže do evidence a to pouze v případě, že v seznamu ještě nejsou lyže se stejným inventárním číslem. 
Metoda vrací true, pokud lyže byly do seznamu vloženy a false, jestliže již v seznamu byly a tudíž je znovu nelze vložit.

public Collection<Lyze> vratSeznam() - vrátí seznam všech lyží s evidence, metoda vrací vždy seznam, třeba i prázdný, nikdy hodnotu null.

public Collection<Lyze> vratSeznamVolnychLyzi() - vrátí seznam lyzi s evidence které nejsou půjčené(zakaznik je null), pokud v seznamu žádné 
volné lyže nejsou, vrátí prázdný seznam.

public Lyze vratLyze(int inventarniCislo) - najde v evidenci lyže se zadaným inventárním číslem a vrátí na ně odkaz, pokud takové lyže v 
evidenci nejsou, vrátí hodnotu null.

Vašim úkolem je napsat k této třídě testy i implementaci.
