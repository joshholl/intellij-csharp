package com.github.joshholl.intellij.csharp;

import com.intellij.lang.Language;

public class CSharpLanguage extends Language {
    public static CSharpLanguage INSTANCE = new CSharpLanguage();

    private CSharpLanguage() {
        super("CSharp");
    }

}
