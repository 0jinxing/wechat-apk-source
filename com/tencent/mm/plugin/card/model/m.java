package com.tencent.mm.plugin.card.model;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.platformtools.v;
import com.tencent.mm.platformtools.v.a;
import com.tencent.mm.platformtools.v.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.d;
import java.io.File;
import java.io.IOException;

public final class m
  implements v
{
  public static final String kdH;
  public static final String kdI;
  private final String TAG = "MicroMsg.CardSimpleGetPicStrategy";
  private String mPicUrl = null;

  static
  {
    AppMethodBeat.i(87853);
    kdH = e.eSn + "card";
    kdI = kdH + File.separator + "video";
    AppMethodBeat.o(87853);
  }

  public m(String paramString)
  {
    this.mPicUrl = paramString;
  }

  public static String Gz(String paramString)
  {
    AppMethodBeat.i(87850);
    paramString = String.format("%s/%s", new Object[] { kdH, g.x(paramString.getBytes()) });
    AppMethodBeat.o(87850);
    return paramString;
  }

  public final void V(String paramString, boolean paramBoolean)
  {
  }

  public final Bitmap a(Bitmap paramBitmap, v.a parama, String paramString)
  {
    AppMethodBeat.i(87852);
    if (v.a.ghm == parama);
    try
    {
      d.a(paramBitmap, 100, Bitmap.CompressFormat.PNG, anJ(), false);
      ab.d("MicroMsg.CardSimpleGetPicStrategy", "get bitmap, from %s", new Object[] { parama.toString() });
      AppMethodBeat.o(87852);
      return paramBitmap;
    }
    catch (IOException paramString)
    {
      while (true)
        try
        {
          paramString = new java/io/File;
          paramString.<init>(anJ());
          if (!paramString.exists())
            paramString.mkdirs();
          ab.w("MicroMsg.CardSimpleGetPicStrategy", " retry saving bitmap");
          d.a(paramBitmap, 100, Bitmap.CompressFormat.PNG, anJ(), false);
        }
        catch (IOException paramString)
        {
          ab.printErrStackTrace("MicroMsg.CardSimpleGetPicStrategy", paramString, "", new Object[0]);
          ab.w("MicroMsg.CardSimpleGetPicStrategy", "save bitmap fail");
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
    AppMethodBeat.i(87849);
    String str = String.format("%s/%s", new Object[] { kdH, g.x(this.mPicUrl.getBytes()) });
    AppMethodBeat.o(87849);
    return str;
  }

  public final String anK()
  {
    return this.mPicUrl;
  }

  public final String anL()
  {
    return this.mPicUrl;
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
    AppMethodBeat.i(87851);
    ab.d("MicroMsg.CardSimpleGetPicStrategy", "no sd card!");
    AppMethodBeat.o(87851);
    return null;
  }

  public final void anP()
  {
  }

  public final String getCacheKey()
  {
    return this.mPicUrl;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.m
 * JD-Core Version:    0.6.2
 */