package com.tencent.smtt.utils;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;

final class m
  implements k.a
{
  public final boolean a(File paramFile1, File paramFile2)
  {
    AppMethodBeat.i(65220);
    boolean bool;
    if ((paramFile1.length() == paramFile2.length()) && (paramFile1.lastModified() == paramFile2.lastModified()))
    {
      bool = true;
      AppMethodBeat.o(65220);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(65220);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.utils.m
 * JD-Core Version:    0.6.2
 */