package com.tencent.mm.plugin.scanner.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.v;
import com.tencent.mm.platformtools.v.a;
import com.tencent.mm.platformtools.v.b;
import com.tencent.mm.plugin.scanner.e;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.d;
import java.io.IOException;

final class h$a
  implements v
{
  private String mPicUrl = null;

  public h$a(String paramString)
  {
    this.mPicUrl = paramString;
  }

  public final void V(String paramString, boolean paramBoolean)
  {
  }

  public final Bitmap a(Bitmap paramBitmap, v.a parama, String paramString)
  {
    AppMethodBeat.i(81059);
    if (v.a.ghm == parama);
    try
    {
      d.a(paramBitmap, 100, Bitmap.CompressFormat.PNG, anJ(), false);
      AppMethodBeat.o(81059);
      return paramBitmap;
    }
    catch (IOException parama)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.ProductGridPreference", parama, "", new Object[0]);
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
    AppMethodBeat.i(81058);
    String str = e.cgy().fQ(this.mPicUrl, "@S");
    AppMethodBeat.o(81058);
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
    return false;
  }

  public final boolean anN()
  {
    return false;
  }

  public final Bitmap anO()
  {
    AppMethodBeat.i(81060);
    Bitmap localBitmap;
    if (ah.getContext() == null)
    {
      localBitmap = null;
      AppMethodBeat.o(81060);
    }
    while (true)
    {
      return localBitmap;
      localBitmap = BitmapFactory.decodeResource(ah.getContext().getResources(), 2130839707);
      AppMethodBeat.o(81060);
    }
  }

  public final void anP()
  {
  }

  public final String getCacheKey()
  {
    return this.mPicUrl;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.h.a
 * JD-Core Version:    0.6.2
 */