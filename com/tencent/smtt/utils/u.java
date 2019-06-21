package com.tencent.smtt.utils;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.FileFilter;

final class u
  implements FileFilter
{
  public final boolean accept(File paramFile)
  {
    AppMethodBeat.i(65300);
    paramFile = paramFile.getName();
    boolean bool;
    if ((!TextUtils.isEmpty(paramFile)) && (paramFile.endsWith(".dex")))
    {
      bool = true;
      AppMethodBeat.o(65300);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(65300);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.smtt.utils.u
 * JD-Core Version:    0.6.2
 */