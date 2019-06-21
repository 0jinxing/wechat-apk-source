package com.bumptech.glide.c.c;

import android.content.Context;
import android.net.Uri;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.File;

public final class k$a
  implements o<Uri, File>
{
  private final Context context;

  public k$a(Context paramContext)
  {
    this.context = paramContext;
  }

  public final n<Uri, File> a(r paramr)
  {
    AppMethodBeat.i(92086);
    paramr = new k(this.context);
    AppMethodBeat.o(92086);
    return paramr;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.c.k.a
 * JD-Core Version:    0.6.2
 */