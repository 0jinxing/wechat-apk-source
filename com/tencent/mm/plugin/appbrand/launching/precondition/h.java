package com.tencent.mm.plugin.appbrand.launching.precondition;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.tencent.luggage.sdk.config.AppBrandInitConfigLU;
import com.tencent.luggage.sdk.launching.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.LaunchParamsOptional;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.config.f;
import com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI;
import com.tencent.mm.plugin.appbrand.launching.params.AppBrandWeishiParams;
import com.tencent.mm.plugin.appbrand.launching.params.LaunchParcel;
import com.tencent.mm.plugin.appbrand.report.quality.QualitySession;
import com.tencent.mm.plugin.appbrand.report.quality.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class h extends a
{
  private static long ijU = 0L;

  public final boolean b(Context paramContext, LaunchParcel paramLaunchParcel)
  {
    boolean bool1 = true;
    AppMethodBeat.i(132077);
    String str = g.a(paramLaunchParcel);
    Object localObject1 = paramLaunchParcel.appId;
    int i = paramLaunchParcel.har;
    Object localObject2 = localObject1;
    if (bo.isNullOrNil((String)localObject1))
      localObject2 = f.ayD().bK(paramLaunchParcel.username);
    if ((!bo.isNullOrNil((String)localObject2)) && (i == 0) && (com.tencent.mm.plugin.appbrand.task.h.bu((String)localObject2, i)))
    {
      localObject1 = f.ayD().yY((String)localObject2);
      if ((localObject1 != null) && (((AppBrandInitConfigWC)localObject1).gVs == i))
      {
        paramLaunchParcel.c((AppBrandInitConfigLU)localObject1);
        ((AppBrandInitConfigWC)localObject1).hgN = new QualitySession(str, (AppBrandInitConfigWC)localObject1, paramLaunchParcel.ijy);
        ((AppBrandInitConfigWC)localObject1).hgO = false;
        j.b(paramContext, (AppBrandInitConfigWC)localObject1, paramLaunchParcel.ijy);
        AppMethodBeat.o(132077);
      }
    }
    for (boolean bool2 = bool1; ; bool2 = false)
    {
      return bool2;
      if (Math.abs(System.currentTimeMillis() - ijU) >= 200L)
        break;
      ab.w("MicroMsg.AppBrand.Precondition.MMLaunchEntry", "start in 200 ms, just return");
      AppMethodBeat.o(132077);
    }
    ijU = bo.anU();
    ab.v("MicroMsg.AppBrand.Precondition.MMLaunchEntry", "[applaunch] start entered %s %d", new Object[] { localObject2, Integer.valueOf(i) });
    boolean bool3 = "wxfe02ecfe70800f46".equalsIgnoreCase((String)localObject2);
    localObject1 = "Token@" + h.class.hashCode() + "#" + System.nanoTime();
    if (!bool3);
    for (bool2 = true; ; bool2 = false)
    {
      new d(paramContext, (String)localObject1, bool2).a(paramLaunchParcel, str);
      ab.v("MicroMsg.AppBrand.Precondition.MMLaunchEntry", "start we app with username(%s) and appId(%s) and statObj(%s)", new Object[] { paramLaunchParcel.username, localObject2, paramLaunchParcel.ijy });
      localObject2 = new Intent(paramContext, AppBrandLaunchProxyUI.class);
      if (!(paramContext instanceof Activity))
        ((Intent)localObject2).addFlags(268435456);
      ((Intent)localObject2).putExtra("extra_from_mm", true);
      ((Intent)localObject2).putExtra("extra_entry_token", (String)localObject1);
      if ((bool3) && (paramLaunchParcel.ijz != null) && (paramLaunchParcel.ijz.bQj != null))
      {
        ((Intent)localObject2).putExtra("extra_launch_weishi_video", true);
        ((Intent)localObject2).putExtra("extra_launch_thumb_url", paramLaunchParcel.ijz.bQj.thumbUrl);
        ((Intent)localObject2).putExtra("extra_launch_thumb_path", paramLaunchParcel.ijz.bQj.ijv);
      }
      paramContext.startActivity((Intent)localObject2);
      AppMethodBeat.o(132077);
      bool2 = bool1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.precondition.h
 * JD-Core Version:    0.6.2
 */