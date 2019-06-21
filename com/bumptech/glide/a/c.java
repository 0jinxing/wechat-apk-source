package com.bumptech.glide.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;

final class c
{
  static final Charset US_ASCII;
  static final Charset UTF_8;

  static
  {
    AppMethodBeat.i(51813);
    US_ASCII = Charset.forName("US-ASCII");
    UTF_8 = Charset.forName("UTF-8");
    AppMethodBeat.o(51813);
  }

  static void closeQuietly(Closeable paramCloseable)
  {
    AppMethodBeat.i(51812);
    try
    {
      paramCloseable.close();
      AppMethodBeat.o(51812);
      return;
    }
    catch (RuntimeException paramCloseable)
    {
      AppMethodBeat.o(51812);
      throw paramCloseable;
    }
    catch (Exception paramCloseable)
    {
      while (true)
        AppMethodBeat.o(51812);
    }
  }

  static void l(File paramFile)
  {
    AppMethodBeat.i(51811);
    File[] arrayOfFile = paramFile.listFiles();
    if (arrayOfFile == null)
    {
      paramFile = new IOException("not a readable directory: ".concat(String.valueOf(paramFile)));
      AppMethodBeat.o(51811);
      throw paramFile;
    }
    int i = arrayOfFile.length;
    for (int j = 0; j < i; j++)
    {
      paramFile = arrayOfFile[j];
      if (paramFile.isDirectory())
        l(paramFile);
      if (!paramFile.delete())
      {
        paramFile = new IOException("failed to delete file: ".concat(String.valueOf(paramFile)));
        AppMethodBeat.o(51811);
        throw paramFile;
      }
    }
    AppMethodBeat.o(51811);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.a.c
 * JD-Core Version:    0.6.2
 */