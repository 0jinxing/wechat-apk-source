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
import com.tencent.mm.plugin.scanner.util.o.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.d;
import java.io.IOException;

public final class ProductUI$a
  implements v
{
  private o.a qdc;

  public ProductUI$a(o.a parama)
  {
    this.qdc = parama;
  }

  public final void V(String paramString, boolean paramBoolean)
  {
  }

  public final Bitmap a(Bitmap paramBitmap, v.a parama, String paramString)
  {
    AppMethodBeat.i(81101);
    if (v.a.ghm == parama);
    try
    {
      d.a(paramBitmap, 100, Bitmap.CompressFormat.PNG, anJ(), false);
      AppMethodBeat.o(81101);
      return paramBitmap;
    }
    catch (IOException parama)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.scanner.ProductUI", parama, "", new Object[0]);
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
    AppMethodBeat.i(81100);
    String str = e.cgy().fQ(this.qdc.field_thumburl, "@S");
    AppMethodBeat.o(81100);
    return str;
  }

  public final String anK()
  {
    if (this.qdc == null);
    for (String str = ""; ; str = this.qdc.field_thumburl)
      return str;
  }

  public final String anL()
  {
    if (this.qdc == null);
    for (String str = ""; ; str = this.qdc.field_thumburl)
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
    AppMethodBeat.i(81102);
    Bitmap localBitmap;
    if (ah.getContext() == null)
    {
      localBitmap = null;
      AppMethodBeat.o(81102);
    }
    while (true)
    {
      return localBitmap;
      localBitmap = BitmapFactory.decodeResource(ah.getContext().getResources(), 2130839707);
      AppMethodBeat.o(81102);
    }
  }

  public final void anP()
  {
  }

  public final String getCacheKey()
  {
    if (this.qdc == null);
    for (String str = ""; ; str = this.qdc.field_thumburl)
      return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.ProductUI.a
 * JD-Core Version:    0.6.2
 */