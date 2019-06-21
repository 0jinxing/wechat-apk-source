package com.tencent.mm.plugin.collect.model;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.v;
import com.tencent.mm.platformtools.v.a;
import com.tencent.mm.platformtools.v.b;
import com.tencent.mm.plugin.wallet_core.d.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.d;
import java.io.IOException;

public final class c
  implements v
{
  private v.b kBF;
  private String url;

  public c(String paramString)
  {
    AppMethodBeat.i(40923);
    this.kBF = new c.1(this);
    this.url = paramString;
    AppMethodBeat.o(40923);
  }

  public final void V(String paramString, boolean paramBoolean)
  {
  }

  public final Bitmap a(Bitmap paramBitmap, v.a parama, String paramString)
  {
    AppMethodBeat.i(40925);
    if (v.a.ghm == parama);
    try
    {
      d.a(paramBitmap, 100, Bitmap.CompressFormat.PNG, b.UK(this.url), false);
      AppMethodBeat.o(40925);
      return paramBitmap;
    }
    catch (IOException parama)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.WalletGetPicStrategy", parama, "", new Object[0]);
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
    AppMethodBeat.i(40924);
    String str = b.UK(this.url);
    AppMethodBeat.o(40924);
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

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.model.c
 * JD-Core Version:    0.6.2
 */