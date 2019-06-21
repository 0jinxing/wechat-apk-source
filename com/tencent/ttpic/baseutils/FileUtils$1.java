package com.tencent.ttpic.baseutils;

import android.text.TextUtils;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.FilenameFilter;

final class FileUtils$1
  implements FilenameFilter
{
  FileUtils$1(String paramString)
  {
  }

  public final boolean accept(File paramFile, String paramString)
  {
    AppMethodBeat.i(49671);
    boolean bool;
    if (TextUtils.isEmpty(this.val$suffix))
    {
      bool = true;
      AppMethodBeat.o(49671);
    }
    while (true)
    {
      return bool;
      bool = paramString.endsWith(this.val$suffix);
      AppMethodBeat.o(49671);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.baseutils.FileUtils.1
 * JD-Core Version:    0.6.2
 */