package ru.job4j.ex;

public class FindEl {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException {
        int rsl = -1;
        for (int i = 0; i < value.length; i++) {
            if (value[i].equals(key)) {
                rsl = i;
            }
        }
        if (rsl == -1) {
            throw new ElementNotFoundException("no element");
        }
        return rsl;
    }

    public static void main(String[] args) {
        String[] a = new String[3];
        a[0] = "mama";
        a[1] = "mila";
        a[2] = "ramu";
        try {
            indexOf(a, "amu");
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }
}
