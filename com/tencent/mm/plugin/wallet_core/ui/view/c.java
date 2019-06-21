package com.tencent.mm.plugin.wallet_core.ui.view;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.v;
import com.tencent.mm.platformtools.v.a;
import com.tencent.mm.platformtools.v.b;
import com.tencent.mm.plugin.wallet_core.d.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.vfs.e;
import java.io.IOException;

public final class c
  implements v
{
  private v.b kBF;
  private String url;

  public c(String paramString)
  {
    AppMethodBeat.i(47905);
    this.kBF = new c.1(this);
    this.url = paramString;
    AppMethodBeat.o(47905);
  }

  public final void V(String paramString, boolean paramBoolean)
  {
  }

  public final Bitmap a(Bitmap paramBitmap, v.a parama, String paramString)
  {
    AppMethodBeat.i(47907);
    if (v.a.ghm == parama)
      if ((paramBitmap != null) && (paramBitmap.getNinePatchChunk() != null))
      {
        ab.v("MicroMsg.WalletGetPicStrategy", " get the ninePathchChunk");
        e.y(paramString, b.UK(this.url));
        AppMethodBeat.o(47907);
      }
    while (true)
    {
      return paramBitmap;
      try
      {
        d.a(paramBitmap, 100, Bitmap.CompressFormat.PNG, b.UK(this.url), false);
        ab.d("MicroMsg.WalletGetPicStrategy", "get bitmap, from %s", new Object[] { parama.toString() });
        AppMethodBeat.o(47907);
      }
      catch (IOException paramString)
      {
        while (true)
          try
          {
            e.tf(b.cRb());
            ab.w("MicroMsg.WalletGetPicStrategy", " retry saving bitmap");
            d.a(paramBitmap, 100, Bitmap.CompressFormat.PNG, b.UK(this.url), false);
          }
          catch (IOException paramString)
          {
            ab.printErrStackTrace("MicroMsg.WalletGetPicStrategy", paramString, "", new Object[0]);
            ab.w("MicroMsg.WalletGetPicStrategy", "save bitmap fail");
          }
      }
    }
  }

  public final void a(v.a parama, String paramString)
  {
  }

  public final v.b anI()
  {
    return this.kBF;
  }

  public final String anJ()
  {
    AppMethodBeat.i(47906);
    String str = b.UK(this.url);
    AppMethodBeat.o(47906);
    return str;
  }

  public final String anK()
  {
    return this.url;
  }

  public final String anL()
  {
    return this.url;
  }

  public final boolean anM()
  {
    return true;
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
    return this.url;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.ui.view.c
 * JD-Core Version:    0.6.2
 */