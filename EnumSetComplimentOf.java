package com.keyword;

import java.util.EnumSet;
import java.util.Set;

enum JavaIDE{ECLIPSE,NET_BEANS,INTELLIJ}
public class EnumSetComplimentOf
{
    public static void main(String[] args)
    {
        EnumSet<JavaIDE> set1 = EnumSet.of(JavaIDE.INTELLIJ);
        System.out.println("The Set is "+set1);
        EnumSet<JavaIDE> set2 = EnumSet.complementOf(set1);
        System.out.println("After Complimenting, the Set is "+set2);
    }
}
