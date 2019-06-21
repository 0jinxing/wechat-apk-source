package com.tencent.mm.plugin.shake.d.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.platformtools.v;
import com.tencent.mm.platformtools.v.a;
import com.tencent.mm.platformtools.v.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.d;
import java.io.IOException;

final class a$a
  implements v
{
  private String qud;

  public a$a(String paramString)
  {
    this.qud = paramString;
  }

  public final void V(String paramString, boolean paramBoolean)
  {
  }

  public final Bitmap a(Bitmap paramBitmap, v.a parama, String paramString)
  {
    AppMethodBeat.i(24683);
    if (v.a.ghm == parama);
    try
    {
      d.a(paramBitmap, 100, Bitmap.CompressFormat.PNG, a.UK(this.qud), false);
      ab.d("MicroMsg.ShakeAvatarDrawable", "get bitmap, from %s", new Object[] { parama.toString() });
      AppMethodBeat.o(24683);
      return paramBitmap;
    }
    catch (IOException paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.ShakeAvatarDrawable", paramString, "", new Object[0]);
        ab.w("MicroMsg.ShakeAvatarDrawable", "save bitmap fail");
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
    AppMethodBeat.i(24681);
    String str = a.UK(this.qud);
    AppMethodBeat.o(24681);
    return str;
  }

  public final String anK()
  {
    return this.qud;
  }

  public final String anL()
  {
    return this.qud;
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
    AppMethodBeat.i(24682);
    Bitmap localBitmap = BitmapFactory.decodeResource(ah.getContext().getResources(), 2130839707);
    AppMethodBeat.o(24682);
    return localBitmap;
  }

  public final void anP()
  {
  }

  public final String getCacheKey()
  {
    return this.qud;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.shake.d.b.a.a
 * JD-Core Version:    0.6.2
 */