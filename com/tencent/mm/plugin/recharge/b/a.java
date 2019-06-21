package com.tencent.mm.plugin.recharge.b;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.platformtools.v;
import com.tencent.mm.platformtools.v.a;
import com.tencent.mm.platformtools.v.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;
import java.io.File;
import java.io.IOException;

public final class a
  implements v
{
  private static final String kdH;
  private String url;

  static
  {
    AppMethodBeat.i(44420);
    kdH = e.eSn + "wallet";
    AppMethodBeat.o(44420);
  }

  public a(String paramString)
  {
    this.url = paramString;
  }

  public final void V(String paramString, boolean paramBoolean)
  {
  }

  public final Bitmap a(Bitmap paramBitmap, v.a parama, String paramString)
  {
    AppMethodBeat.i(44419);
    if (v.a.ghm == parama);
    try
    {
      d.a(paramBitmap, 100, Bitmap.CompressFormat.PNG, anJ(), false);
      ab.d("MicroMsg.WalletGetPicStrategy", "get bitmap, from %s", new Object[] { parama.toString() });
      AppMethodBeat.o(44419);
      return paramBitmap;
    }
    catch (IOException paramString)
    {
      while (true)
        try
        {
          paramString = new java/io/File;
          paramString.<init>(kdH);
          if (!paramString.exists())
            paramString.mkdir();
          ab.w("MicroMsg.WalletGetPicStrategy", " retry saving bitmap");
          d.a(paramBitmap, 100, Bitmap.CompressFormat.PNG, anJ(), false);
        }
        catch (IOException paramString)
        {
          ab.printErrStackTrace("MicroMsg.WalletGetPicStrategy", paramString, "", new Object[0]);
          ab.w("MicroMsg.WalletGetPicStrategy", "save bitmap fail");
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
    AppMethodBeat.i(44418);
    String str = this.url;
    if (bo.isNullOrNil(str))
    {
      ab.w("MicroMsg.WalletGetPicStrategy", "getStoragePath: but url is null");
      str = null;
      AppMethodBeat.o(44418);
    }
    while (true)
    {
      return str;
      str = String.format("%s/%s", new Object[] { kdH, g.x(str.getBytes()) });
      AppMethodBeat.o(44418);
    }
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.recharge.b.a
 * JD-Core Version:    0.6.2
 */