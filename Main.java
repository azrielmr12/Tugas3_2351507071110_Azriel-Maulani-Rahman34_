class Main {
    public static void main(String[] args) {
        PegawaiTetap pegawaiTetap = new PegawaiTetap("Azriel Maulani", "3507281271283", 5000000);
        PegawaiHarian pegawaiHarian = new PegawaiHarian("Eko", "3507288727271", 10000, 50);
        Sales sales = new Sales("Budi", "3507281271283", 500, 5000);

        System.out.println(pegawaiTetap);
        System.out.println();

        System.out.println(pegawaiHarian);
        System.out.println();

        System.out.println(sales);
    }
}