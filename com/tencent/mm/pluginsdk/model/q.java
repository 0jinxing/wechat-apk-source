package com.tencent.mm.pluginsdk.model;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.BitmapFactory;
import android.util.DisplayMetrics;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.a;
import com.tencent.mm.platformtools.v;
import com.tencent.mm.platformtools.v.a;
import com.tencent.mm.platformtools.v.b;
import com.tencent.mm.plugin.i.c;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.d;

public final class q
  implements v
{
  private boolean cAy;
  private long fVx = 0L;
  private long fVy = 0L;
  private String size;
  private int type;
  private String url;
  private boolean vbA;

  public q(String paramString1, int paramInt, String paramString2)
  {
    this.url = paramString1;
    this.type = paramInt;
    this.size = paramString2;
    this.cAy = false;
  }

  public static String v(String paramString1, int paramInt, String paramString2)
  {
    AppMethodBeat.i(105499);
    if (com.tencent.mm.kernel.g.RN().QY())
    {
      String str = c.bGF();
      StringBuilder localStringBuilder = new StringBuilder();
      com.tencent.mm.kernel.g.RN();
      paramString1 = String.format("%s%d%s_%s", new Object[] { str, Integer.valueOf(paramInt), paramString2, com.tencent.mm.a.g.x((a.QG() + paramString1).getBytes()) });
      AppMethodBeat.o(105499);
    }
    while (true)
    {
      return paramString1;
      paramString1 = "";
      AppMethodBeat.o(105499);
    }
  }

  public final void V(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(105505);
    this.fVy = bo.anU();
    int i = 0;
    int j = i;
    if (com.tencent.mm.at.q.ahs())
    {
      j = i;
      if (!bo.isNullOrNil(paramString))
      {
        j = i;
        if (com.tencent.mm.at.q.sz(anK()))
        {
          j = i;
          if (paramString.equals("image/webp"))
            j = 1;
        }
      }
    }
    if (this.vbA)
      if (!paramBoolean)
      {
        ab.d("MicroMsg.ReaaderAppGetPicStrategy", "afterGetPicFromNet, download biz image failed");
        h.pYm.a(86L, 2L, 1L, false);
        if (j == 0)
          break label211;
        ab.d("MicroMsg.ReaaderAppGetPicStrategy", "afterGetPicFromNet, download biz webp image failed");
        h.pYm.a(86L, 15L, 1L, false);
        AppMethodBeat.o(105505);
      }
    while (true)
    {
      return;
      long l = this.fVy - this.fVx;
      ab.d("MicroMsg.ReaaderAppGetPicStrategy", "afterGetPicFromNet, download biz image success, used %d", new Object[] { Long.valueOf(l) });
      h.pYm.a(86L, 4L, l, false);
      if (j != 0)
      {
        ab.d("MicroMsg.ReaaderAppGetPicStrategy", "afterGetPicFromNet, download biz webp image success");
        h.pYm.a(86L, 17L, l, false);
        h.pYm.a(86L, 13L, 1L, false);
      }
      label211: AppMethodBeat.o(105505);
    }
  }

  public final Bitmap a(Bitmap paramBitmap, v.a parama, String paramString)
  {
    AppMethodBeat.i(105503);
    String str;
    int i;
    int j;
    if (v.a.ghm == parama)
    {
      str = this.size;
      a locala = new a();
      Object localObject = ah.getContext();
      paramString = null;
      parama = paramString;
      if (localObject != null)
      {
        localObject = ((Context)localObject).getResources();
        parama = paramString;
        if (localObject != null)
          parama = ((Resources)localObject).getDisplayMetrics();
      }
      if (parama != null)
        if ("@T".equals(str))
        {
          i = (int)(parama.widthPixels - 60.0F * parama.density);
          j = (int)(parama.density * 167.0F);
          locala.w = i;
          locala.h = j;
          ab.d("MicroMsg.ReaaderAppGetPicStrategy", locala.toString());
          paramBitmap = d.b(paramBitmap, locala.w, locala.h, true);
        }
    }
    while (true)
    {
      try
      {
        ab.d("MicroMsg.ReaaderAppGetPicStrategy", "handlerBitmap, path:%s", new Object[] { anJ() });
        d.a(paramBitmap, 100, Bitmap.CompressFormat.PNG, anJ(), false);
        AppMethodBeat.o(105503);
        return paramBitmap;
        i = (int)(parama.density * 50.0F);
        j = i;
        break;
        if ("@T".equals(str))
        {
          j = 334;
          i = 2147483647;
          break;
        }
        j = 100;
        i = 100;
      }
      catch (Exception parama)
      {
        ab.printErrStackTrace("MicroMsg.ReaaderAppGetPicStrategy", parama, "", new Object[0]);
        ab.e("MicroMsg.ReaaderAppGetPicStrategy", "save image %s fail", new Object[] { this.url });
        continue;
      }
      AppMethodBeat.o(105503);
    }
  }

  public final void a(v.a parama, String paramString)
  {
    AppMethodBeat.i(105506);
    if ((parama == v.a.ghm) && (this.vbA) && (com.tencent.mm.at.q.ahs()) && (!bo.isNullOrNil(paramString)) && (com.tencent.mm.at.q.sz(anK())) && (paramString.equals("image/webp")))
    {
      ab.d("MicroMsg.ReaaderAppGetPicStrategy", "decode download webp picture failed");
      h.pYm.a(86L, 14L, 1L, false);
    }
    AppMethodBeat.o(105506);
  }

  public final v.b anI()
  {
    return null;
  }

  public final String anJ()
  {
    AppMethodBeat.i(105500);
    String str = v(this.url, this.type, this.size);
    AppMethodBeat.o(105500);
    return str;
  }

  public final String anK()
  {
    AppMethodBeat.i(105501);
    if (com.tencent.mm.at.q.ahs());
    for (String str = com.tencent.mm.at.q.sy(this.url); ; str = this.url)
    {
      AppMethodBeat.o(105501);
      return str;
    }
  }

  public final String anL()
  {
    return this.url;
  }

  public final boolean anM()
  {
    return false;
  }

  public final boolean anN()
  {
    return this.cAy;
  }

  public final Bitmap anO()
  {
    AppMethodBeat.i(105507);
    Bitmap localBitmap = BitmapFactory.decodeResource(ah.getContext().getResources(), 2130839707);
    AppMethodBeat.o(105507);
    return localBitmap;
  }

  public final void anP()
  {
    AppMethodBeat.i(105504);
    this.fVx = bo.anU();
    if (this.vbA)
    {
      ab.d("MicroMsg.ReaaderAppGetPicStrategy", "beforeGetPicFromNet, from biz msg");
      h.pYm.a(86L, 0L, 1L, false);
    }
    AppMethodBeat.o(105504);
  }

  public final String getCacheKey()
  {
    AppMethodBeat.i(105502);
    String str = this.url + this.size;
    AppMethodBeat.o(105502);
    return str;
  }

  public static final class a
  {
    public int h;
    public int w;
    public int x;
    public int y;

    public final String toString()
    {
      AppMethodBeat.i(105498);
      String str = String.format("crop area[x=%d,y=%d,h=%d,w=%d]", new Object[] { Integer.valueOf(this.x), Integer.valueOf(this.y), Integer.valueOf(this.h), Integer.valueOf(this.w) });
      AppMethodBeat.o(105498);
      return str;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.model.q
 * JD-Core Version:    0.6.2
 */