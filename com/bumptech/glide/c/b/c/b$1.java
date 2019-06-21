package com.bumptech.glide.c.b.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class b$1
  implements FilenameFilter
{
  b$1(Pattern paramPattern)
  {
  }

  public final boolean accept(File paramFile, String paramString)
  {
    AppMethodBeat.i(92026);
    boolean bool = this.aDK.matcher(paramString).matches();
    AppMethodBeat.o(92026);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.b.c.b.1
 * JD-Core Version:    0.6.2
 */