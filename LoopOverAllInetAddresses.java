/*
Loops over every IP in the world 
*/
class Main {
    public static void main(String[] args) {
        for (int x = 0; x < 256; x++) {
            if (x == 10) continue;
            for (int f = 0; f < 256; f++) {
                if ((x == 172 && (f >= 16 && f <= 31)) ||
                    (x == 192 && f == 168)) continue;
                for (int d = 0; d < 256; d++) {
                    for (int g = 0; g < 256; g++) {
                        final String ip_address = x + "." + f + "." + d + "." + g;
                        //do something
                    }
                }
            }
        }
    }
}
