package com.github.joshholl.intellij.csharp;

import com.intellij.openapi.fileTypes.LanguageFileType;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public class CSharpFileTypes extends LanguageFileType {
    public static CSharpFileTypes INSTANCE = new CSharpFileTypes();

    public CSharpFileTypes() {
        super(CSharpLanguage.INSTANCE);
    }

    @NotNull
    @Override
    public String getName() {
        return "C# File";
    }

    @NotNull
    @Override
    public String getDescription() {
        return "Source file for the C# language";
    }

    @NotNull
    @Override
    public String getDefaultExtension() {
        return "cs";
    }

    @Nullable
    @Override
    public Icon getIcon() {
        return CSharpIcon.FILE;
    }
}
