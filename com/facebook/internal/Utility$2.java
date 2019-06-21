package com.facebook.internal;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

final class Utility$2
  implements FilenameFilter
{
  public final boolean accept(File paramFile, String paramString)
  {
    AppMethodBeat.i(72491);
    boolean bool = Pattern.matches("cpu[0-9]+", paramString);
    AppMethodBeat.o(72491);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.facebook.internal.Utility.2
 * JD-Core Version:    0.6.2
 */