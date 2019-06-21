package com.tencent.mm.plugin.shake.e;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.v;
import com.tencent.mm.platformtools.v.a;
import com.tencent.mm.platformtools.v.b;
import com.tencent.mm.plugin.shake.b.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.d;
import java.io.IOException;

public final class b
  implements v
{
  private c.a qwR = null;
  private String thumburl = "";

  public b(c.a parama)
  {
    this.qwR = parama;
  }

  public b(String paramString)
  {
    this.thumburl = paramString;
  }

  public final void V(String paramString, boolean paramBoolean)
  {
  }

  public final Bitmap a(Bitmap paramBitmap, v.a parama, String paramString)
  {
    AppMethodBeat.i(24951);
    if (v.a.ghm == parama);
    try
    {
      d.a(paramBitmap, 100, Bitmap.CompressFormat.PNG, anJ(), false);
      AppMethodBeat.o(24951);
      return paramBitmap;
    }
    catch (IOException parama)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.TVImgGetStrategy", parama, "", new Object[0]);
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
    AppMethodBeat.i(24948);
    String str;
    if ((this.qwR != null) && (this.qwR.field_thumburl != null))
    {
      str = m.fQ(this.qwR.field_thumburl, "@S");
      AppMethodBeat.o(24948);
    }
    while (true)
    {
      return str;
      if (this.thumburl != null)
      {
        str = m.fQ(this.thumburl, "@S");
        AppMethodBeat.o(24948);
      }
      else
      {
        str = "";
        AppMethodBeat.o(24948);
      }
    }
  }

  public final String anK()
  {
    if ((this.qwR != null) && (this.qwR.field_thumburl != null));
    for (String str = this.qwR.field_thumburl; ; str = this.thumburl)
      return str;
  }

  public final String anL()
  {
    AppMethodBeat.i(24949);
    String str = anK() + "_tv";
    AppMethodBeat.o(24949);
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
    AppMethodBeat.i(24952);
    Bitmap localBitmap;
    if (ah.getContext() == null)
    {
      localBitmap = null;
      AppMethodBeat.o(24952);
    }
    while (true)
    {
      return localBitmap;
      localBitmap = BitmapFactory.decodeResource(ah.getContext().getResources(), 2130839707);
      AppMethodBeat.o(24952);
    }
  }

  public final void anP()
  {
  }

  public final String getCacheKey()
  {
    AppMethodBeat.i(24950);
    String str = anK() + "_tv";
    AppMethodBeat.o(24950);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.e.b
 * JD-Core Version:    0.6.2
 */