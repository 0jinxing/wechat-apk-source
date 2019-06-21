package com.tencent.mm.pluginsdk.ui.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.plugin.a.c;
import com.tencent.mm.plugin.sight.base.SightVideoJNI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;

public final class a extends com.tencent.mm.ui.tools.b.a
{
  private String ien;
  public int mSize = 104857600;
  private a vpV;

  private a(String paramString)
  {
    this.ien = paramString;
  }

  public static a ajK(String paramString)
  {
    AppMethodBeat.i(28012);
    paramString = new a(paramString);
    AppMethodBeat.o(28012);
    return paramString;
  }

  public final int aAa()
  {
    int i = 10485760;
    int j = 1;
    AppMethodBeat.i(28013);
    if (bo.isNullOrNil(this.ien))
      ab.w("MicroMsg.VideoBoundaryCheck", "dz[check video but path is null or nil]");
    boolean bool1 = at.is2G(ah.getContext());
    boolean bool2 = c.vC(this.ien);
    double d;
    if (bool2)
    {
      String str = this.ien;
      if (bool1)
      {
        if (!bool1)
          break label212;
        d = 60000.0D;
        label68: i = SightVideoJNI.shouldRemuxing(str, 660, 500, i, d, 1000000);
        label85: ab.i("MicroMsg.VideoBoundaryCheck", "check should remuxing, ret %d, isMp4 %b", new Object[] { Integer.valueOf(i), Boolean.valueOf(bool2) });
        switch (i)
        {
        default:
          ab.e("MicroMsg.VideoBoundaryCheck", "unknown check type %d", new Object[] { Integer.valueOf(i) });
          AppMethodBeat.o(28013);
          i = j;
        case 0:
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
        case -1:
        case -6:
        case -5:
        case -4:
        case -3:
        case -2:
        }
      }
    }
    while (true)
    {
      return i;
      i = this.mSize;
      break;
      label212: d = this.mSize;
      break label68;
      int k = e.cs(this.ien);
      if (bool1);
      for (i = 10485760; ; i = 26214400)
      {
        if (k <= i)
          break label255;
        i = -1;
        break;
      }
      label255: i = 1;
      break label85;
      AppMethodBeat.o(28013);
      i = 0;
      continue;
      AppMethodBeat.o(28013);
      i = 2;
      continue;
      AppMethodBeat.o(28013);
      i = j;
    }
  }

  public final void dkS()
  {
    AppMethodBeat.i(28014);
    if (this.vpV == null)
    {
      ab.w("MicroMsg.VideoBoundaryCheck", "dz[callback is null]");
      AppMethodBeat.o(28014);
    }
    while (true)
    {
      return;
      aAa();
      AppMethodBeat.o(28014);
    }
  }

  public static abstract interface a
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.c.a
 * JD-Core Version:    0.6.2
 */