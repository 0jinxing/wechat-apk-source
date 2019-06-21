package com.tencent.mm.plugin.mall.b;

import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.g;
import com.tencent.mm.at.a.a.c;
import com.tencent.mm.at.a.a.c.a;
import com.tencent.mm.at.o;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.g.a.su;
import com.tencent.mm.sdk.platformtools.bo;
import java.text.SimpleDateFormat;

public final class a
{
  private static SimpleDateFormat krM;
  private static SimpleDateFormat krN;
  private static final String onW;

  static
  {
    AppMethodBeat.i(43283);
    krM = null;
    krN = null;
    onW = e.eSn + "wallet/mall";
    AppMethodBeat.o(43283);
  }

  private static String Qq(String paramString)
  {
    AppMethodBeat.i(43282);
    if (bo.isNullOrNil(paramString))
    {
      paramString = null;
      AppMethodBeat.o(43282);
    }
    while (true)
    {
      return paramString;
      paramString = String.format("%s/%s", new Object[] { onW, g.x(paramString.getBytes()) });
      AppMethodBeat.o(43282);
    }
  }

  public static void bNu()
  {
    AppMethodBeat.i(43279);
    su localsu = new su();
    localsu.cOT.cOU = false;
    com.tencent.mm.sdk.b.a.xxA.m(localsu);
    AppMethodBeat.o(43279);
  }

  public static void d(ImageView paramImageView, String paramString, int paramInt)
  {
    AppMethodBeat.i(43281);
    if (paramImageView == null)
      AppMethodBeat.o(43281);
    while (true)
    {
      return;
      paramImageView.setImageBitmap(null);
      if (!bo.isNullOrNil(paramString))
      {
        Object localObject = new c.a();
        ((c.a)localObject).ePK = Qq(paramString);
        ((c.a)localObject).ePH = true;
        ((c.a)localObject).ePZ = true;
        ((c.a)localObject).eQf = false;
        if (paramInt != 0)
          ((c.a)localObject).ePT = paramInt;
        localObject = ((c.a)localObject).ahG();
        o.ahp().a(paramString, paramImageView, (c)localObject);
        AppMethodBeat.o(43281);
      }
      else
      {
        if (paramInt != 0)
          paramImageView.setImageResource(paramInt);
        AppMethodBeat.o(43281);
      }
    }
  }

  public static void n(ImageView paramImageView, String paramString)
  {
    AppMethodBeat.i(43280);
    d(paramImageView, paramString, 0);
    AppMethodBeat.o(43280);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mall.b.a
 * JD-Core Version:    0.6.2
 */