package com.bumptech.glide.c.c;

import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;

public final class u<Data>
  implements n<String, Data>
{
  private final n<Uri, Data> aEG;

  public u(n<Uri, Data> paramn)
  {
    this.aEG = paramn;
  }

  private static Uri ab(String paramString)
  {
    AppMethodBeat.i(92137);
    paramString = Uri.fromFile(new File(paramString));
    AppMethodBeat.o(92137);
    return paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.c.u
 * JD-Core Version:    0.6.2
 */