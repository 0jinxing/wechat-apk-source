package com.tencent.mm.plugin.profile.ui.b;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.platformtools.v;
import com.tencent.mm.platformtools.v.a;
import com.tencent.mm.platformtools.v.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.d;
import java.io.IOException;

final class c$1
  implements v
{
  c$1(c paramc)
  {
  }

  public final void V(String paramString, boolean paramBoolean)
  {
  }

  public final Bitmap a(Bitmap paramBitmap, v.a parama, String paramString)
  {
    AppMethodBeat.i(23964);
    if (v.a.ghm == parama);
    try
    {
      d.a(paramBitmap, 100, Bitmap.CompressFormat.PNG, anJ(), false);
      ab.d("MicroMsg.UrlDrawable", "get bitmap, from %s", new Object[] { parama.toString() });
      AppMethodBeat.o(23964);
      return paramBitmap;
    }
    catch (IOException paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.UrlDrawable", paramString, "", new Object[0]);
        ab.w("MicroMsg.UrlDrawable", "save bitmap fail");
      }
    }
  }

  public final void a(v.a parama, String paramString)
  {
  }

  public final v.b anI()
  {
    return null;
  }

  public final String anJ()
  {
    AppMethodBeat.i(23965);
    Object localObject = new StringBuilder();
    aw.ZK();
    localObject = com.tencent.mm.model.c.Yf() + ag.ck(c.a(this.pqJ));
    AppMethodBeat.o(23965);
    return localObject;
  }

  public final String anK()
  {
    AppMethodBeat.i(23967);
    String str = c.a(this.pqJ);
    AppMethodBeat.o(23967);
    return str;
  }

  public final String anL()
  {
    AppMethodBeat.i(23966);
    String str = c.a(this.pqJ);
    AppMethodBeat.o(23966);
    return str;
  }

  public final boolean anM()
  {
    return false;
  }

  public final boolean anN()
  {
    return false;
  }

  public final Bitmap anO()
  {
    return null;
  }

  public final void anP()
  {
  }

  public final String getCacheKey()
  {
    AppMethodBeat.i(23968);
    String str = c.a(this.pqJ);
    AppMethodBeat.o(23968);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.b.c.1
 * JD-Core Version:    0.6.2
 */