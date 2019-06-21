package com.tencent.ttpic.baseutils;

import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;

final class FileUtils$2
  implements FileUtils.AssetFileComparator
{
  public final boolean equals(Context paramContext, String paramString, File paramFile)
  {
    AppMethodBeat.i(49672);
    long l = FileUtils.access$000(paramContext, paramString);
    boolean bool;
    if ((l != -1L) && (l == paramFile.length()))
    {
      bool = true;
      AppMethodBeat.o(49672);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(49672);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.baseutils.FileUtils.2
 * JD-Core Version:    0.6.2
 */