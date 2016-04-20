package makhluk2;
/**
 * A class that being used to instantiate a class into an object
 * 
 * @author Hendricus
 */
class Factory
{
    /**
     * Instantiate Tumbuhan class becoming a Pohon object
     * @param t is a Tumbuhan class
     */
    public static void makePohon(Tumbuhan t)
    {
            t.setPredator(0,'g');
            t.setPredator(1,'u');

            t.set_batas_umur(99);
            t.set_DNA('!');
            t.set_ulang_tahun(1);
    }
    /**
     * Instantiate Tumbuhan class becoming a Rumput object
     * @param t is a Tumbuhan class
     */
    public static void makeRumput(Tumbuhan t)
    {
            t.setPredator(0,'u');
            t.setPredator(1,'g');
            t.setPredator(2,'C');
            t.setPredator(3,'H');
            t.setPredator(4,'m');
            t.setPredator(5,'b');
            t.setPredator(6,'h');
            t.setPredator(7,'y');

            t.set_batas_umur(73);
            t.set_DNA('^');
            t.set_ulang_tahun(1);
    }
    /**
     * Instantiate Herbivora class becoming a Gajah object
     * @param h is a Herbivora class
     */
    public static void makeGajah(Herbivora h)
    {
            h.setPredator(0,'H');
            h.setPredator(1,'h');
            h.setPredator(2,'y');
            h.setPredator(3,'b');

            h.setTarget(0,'!');
            h.setTarget(1,'^');
            h.setTarget(2,'u');

            h.set_batas_umur(76);
            h.set_DNA('g');
            h.set_ulang_tahun(3);
            h.set_maks_tingkat_kekenyangan(9);
            h.set_tingkat_kekenyangan(9);
            h.set_Kecepatan(2);
            h.set_deltaKecepatan(2);
    }
    /**
     * Instantiate Herbivora class becoming a BurungUnta object
     * @param h is a Herbivora class
     */
    public static void makeUnta(Herbivora h)
    {
            h.setPredator(0,'H');
            h.setPredator(1,'h');
            h.setPredator(2,'y');
            h.setPredator(3,'b');
            h.setPredator(4,'g');


            h.setTarget(0,'!');
            h.setTarget(1,'^');


            h.set_batas_umur(80);
            h.set_DNA('u');
            h.set_ulang_tahun(2);
            h.set_maks_tingkat_kekenyangan(9);
            h.set_tingkat_kekenyangan(9);
            h.set_Kecepatan(5);
            h.set_deltaKecepatan(2);
    }
    /**
     * Instantiate Karnivora class becoming a Harimau object
     * @param k is a Karnivora class
     */
    public static void makeHarimau(Karnivora k)
    {
        k.setPredator(0,'H');
        k.setPredator(1,'!');

        k.setTarget(0,'u');
        k.setTarget(1,'g');
        k.setTarget(2,'b');
        k.setTarget(3,'m');
        k.setTarget(4,'y');
        k.setTarget(5,'^');
        k.setTarget(6,'C');

        k.set_batas_umur(99);
            k.set_DNA('h');
            k.set_ulang_tahun(2);
            k.set_maks_tingkat_kekenyangan(70);
            k.set_tingkat_kekenyangan(70);
            k.set_Kecepatan(3);
            k.setDeltaKecepatan(2);
            k.set_Arah(1);
    }
    /**
     * Instantiate Karnivora class becoming a Hyena object
     * @param k is a Karnivora class
     */
    public static void makeHyena(Karnivora k)
    {
        k.setPredator(0,'!');
        k.setPredator(1,'h');
        k.setPredator(2,'H');

        k.setTarget(0,'u');
        k.setTarget(1,'g');
        k.setTarget(2,'b');
        k.setTarget(3,'m');
        k.setTarget(4,'^');
        k.setTarget(5,'C');

        k.set_batas_umur(70);
        k.set_DNA('y');
        k.set_ulang_tahun(3);
        k.set_maks_tingkat_kekenyangan(90);
        k.set_tingkat_kekenyangan(90);
        k.set_Kecepatan(4);
        k.setDeltaKecepatan(3);
        k.set_Arah(1);
    }
    /**
     * Instantiate Omnivora class becoming a Beruang object
     * @param o is an Omnivora class
     */
    public static void makeBeruang(Omnivora o)
    {
            o.setPredator(0,'h');
        o.setPredator(1,'y');
        o.setPredator(2,'H');

        o.setTarget(0,'u');
        o.setTarget(1,'g');
        o.setTarget(2,'^');
        o.setTarget(3,'!');
        o.setTarget(4,'m');
        o.setTarget(5,'C');

        o.set_batas_umur(39);
        o.set_DNA('b');
        o.set_ulang_tahun(5);
        o.set_maks_tingkat_kekenyangan(70);
        o.set_tingkat_kekenyangan(70);
        o.set_Kecepatan(4);
        o.set_Arah(1);
    }
    /**
     * Instantiate Omnivora class becoming a Mandril object
     * @param o is an Omnivora class
     */
    public static void makeMandril(Omnivora o)
    {
        o.setPredator(0,'h');
        o.setPredator(1,'y');
        o.setPredator(2,'H');
        o.setPredator(3,'b');

        o.setTarget(0,'u');
        o.setTarget(1,'g');
        o.setTarget(2,'^');
        o.setTarget(3,'!');
        o.setTarget(4,'C');

        o.set_batas_umur(87);
        o.set_DNA('b');
        o.set_ulang_tahun(4);
        o.set_maks_tingkat_kekenyangan(25);
        o.set_tingkat_kekenyangan(25);
        o.set_Kecepatan(3);
        o.set_Arah(1);
    }
}