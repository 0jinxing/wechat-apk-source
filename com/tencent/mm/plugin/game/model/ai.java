package com.tencent.mm.plugin.game.model;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.platformtools.v;
import com.tencent.mm.platformtools.v.a;
import com.tencent.mm.platformtools.v.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.d;
import java.io.File;
import java.io.IOException;

public final class ai
  implements v
{
  protected String mPicUrl;

  public ai(String paramString)
  {
    AppMethodBeat.i(111409);
    this.mPicUrl = paramString;
    paramString = new File(e.euT);
    if (!paramString.exists())
      paramString.mkdir();
    AppMethodBeat.o(111409);
  }

  public final void V(String paramString, boolean paramBoolean)
  {
  }

  public final Bitmap a(Bitmap paramBitmap, v.a parama, String paramString)
  {
    AppMethodBeat.i(111414);
    if (v.a.ghn == parama)
      AppMethodBeat.o(111414);
    while (true)
    {
      return paramBitmap;
      try
      {
        d.a(paramBitmap, 100, Bitmap.CompressFormat.PNG, anJ(), false);
        AppMethodBeat.o(111414);
      }
      catch (IOException parama)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.GetGamePicStrategy", parama, "", new Object[0]);
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
    AppMethodBeat.i(111410);
    String str = e.euT + g.x(this.mPicUrl.getBytes());
    AppMethodBeat.o(111410);
    return str;
  }

  public final String anK()
  {
    return this.mPicUrl;
  }

  public final String anL()
  {
    AppMethodBeat.i(111411);
    String str = this.mPicUrl.hashCode();
    AppMethodBeat.o(111411);
    return str;
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
    AppMethodBeat.i(111413);
    Bitmap localBitmap = BitmapFactory.decodeResource(ah.getContext().getResources(), 2130839707);
    AppMethodBeat.o(111413);
    return localBitmap;
  }

  public final void anP()
  {
  }

  public final String getCacheKey()
  {
    AppMethodBeat.i(111412);
    String str = this.mPicUrl.hashCode();
    AppMethodBeat.o(111412);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.model.ai
 * JD-Core Version:    0.6.2
 */