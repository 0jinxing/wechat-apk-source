package com.tencent.mm.plugin.appbrand.appusage.a;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelgeo.b.a;
import com.tencent.mm.modelgeo.d;
import com.tencent.mm.plugin.appbrand.s.e;
import com.tencent.mm.pointers.PBool;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.concurrent.TimeUnit;

public final class c
{
  private static float hba = 0.0F;
  private static float hbb = 0.0F;
  private static volatile long hbc = 0L;
  private boolean hbd = false;
  private c.a hbe;

  public static boolean axT()
  {
    boolean bool = false;
    AppMethodBeat.i(129740);
    if ((hbb == -85.0F) || (hba == -1000.0F))
      AppMethodBeat.o(129740);
    while (true)
    {
      return bool;
      if (bo.anU() - hbc < 300000L);
      for (int i = 1; ; i = 0)
      {
        if (i != 0)
          break label65;
        AppMethodBeat.o(129740);
        break;
      }
      label65: AppMethodBeat.o(129740);
      bool = true;
    }
  }

  public static float getLatitude()
  {
    return hbb;
  }

  public static float getLongitude()
  {
    return hba;
  }

  public final void a(c.a parama)
  {
    this.hbe = parama;
  }

  public final boolean axS()
  {
    if (this.hbe != null);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void axU()
  {
    AppMethodBeat.i(129741);
    if (this.hbd)
      AppMethodBeat.o(129741);
    while (true)
    {
      return;
      ab.i("MicroMsg.Recommend.AppBrandRecommendLocationGet", "startLocation");
      this.hbd = true;
      PBool localPBool1 = new PBool();
      PBool localPBool2 = new PBool();
      localPBool1.value = false;
      localPBool2.value = false;
      Object localObject = new ap(Looper.getMainLooper(), new c.1(this, localPBool2, localPBool1), false);
      long l = TimeUnit.SECONDS.toMillis(20L);
      ((ap)localObject).ae(l, l);
      localObject = (b.a)e.bB(new c.2(this, localPBool1, localPBool2));
      d.agz().b((b.a)localObject, false);
      AppMethodBeat.o(129741);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.a.c
 * JD-Core Version:    0.6.2
 */