package com.bumptech.glide.c.c.a;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.c.c.n;
import com.bumptech.glide.c.c.o;
import com.bumptech.glide.c.c.r;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.InputStream;

public final class c$a
  implements o<Uri, InputStream>
{
  private final Context context;

  public c$a(Context paramContext)
  {
    this.context = paramContext;
  }

  public final n<Uri, InputStream> a(r paramr)
  {
    AppMethodBeat.i(92166);
    paramr = new c(this.context);
    AppMethodBeat.o(92166);
    return paramr;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.c.a.c.a
 * JD-Core Version:    0.6.2
 */