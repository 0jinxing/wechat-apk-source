package com.bumptech.glide.c.a.a;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.bumptech.glide.c.a;
import com.bumptech.glide.c.a.d.a;
import com.bumptech.glide.c.b.a.b;
import com.bumptech.glide.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public final class c
  implements com.bumptech.glide.c.a.d<InputStream>
{
  private final Uri azA;
  private final e azB;
  private InputStream azC;

  private c(Uri paramUri, e parame)
  {
    this.azA = paramUri;
    this.azB = parame;
  }

  public static c a(Context paramContext, Uri paramUri, d paramd)
  {
    AppMethodBeat.i(91738);
    b localb = com.bumptech.glide.c.ae(paramContext).awk;
    paramContext = new c(paramUri, new e(com.bumptech.glide.c.ae(paramContext).awj.lF(), paramd, localb, paramContext.getContentResolver()));
    AppMethodBeat.o(91738);
    return paramContext;
  }

  public final void a(com.bumptech.glide.g paramg, d.a<? super InputStream> parama)
  {
    AppMethodBeat.i(91739);
    try
    {
      paramg = this.azB.j(this.azA);
      if (paramg != null)
      {
        i = this.azB.i(this.azA);
        if (i != -1)
        {
          com.bumptech.glide.c.a.g localg = new com/bumptech/glide/c/a/g;
          localg.<init>(paramg, i);
          paramg = localg;
          this.azC = paramg;
          parama.S(this.azC);
          AppMethodBeat.o(91739);
          return;
        }
      }
    }
    catch (FileNotFoundException paramg)
    {
      while (true)
      {
        Log.isLoggable("MediaStoreThumbFetcher", 3);
        parama.b(paramg);
        AppMethodBeat.o(91739);
        continue;
        continue;
        int i = -1;
      }
    }
  }

  public final void cancel()
  {
  }

  public final void cleanup()
  {
    AppMethodBeat.i(91740);
    if (this.azC != null);
    while (true)
    {
      try
      {
        this.azC.close();
        AppMethodBeat.o(91740);
        return;
      }
      catch (IOException localIOException)
      {
      }
      AppMethodBeat.o(91740);
    }
  }

  public final Class<InputStream> mg()
  {
    return InputStream.class;
  }

  public final a mh()
  {
    return a.ayD;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.c.a.a.c
 * JD-Core Version:    0.6.2
 */