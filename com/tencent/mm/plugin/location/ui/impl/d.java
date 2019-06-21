package com.tencent.mm.plugin.location.ui.impl;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.k.a;
import com.tencent.mm.plugin.location_soso.SoSoProxyUI;
import com.tencent.mm.plugin.location_soso.api.SoSoMapView;
import com.tencent.mm.sdk.platformtools.ab;

public final class d
  implements com.tencent.mm.plugin.k.c
{
  public static Intent P(Activity paramActivity)
  {
    AppMethodBeat.i(113645);
    paramActivity = new Intent(paramActivity, SoSoProxyUI.class);
    AppMethodBeat.o(113645);
    return paramActivity;
  }

  public static View ep(Context paramContext)
  {
    AppMethodBeat.i(113646);
    paramContext = new SoSoMapView(paramContext);
    paramContext.setId(2131820622);
    AppMethodBeat.o(113646);
    return paramContext;
  }

  public final a d(Activity paramActivity, int paramInt)
  {
    AppMethodBeat.i(113647);
    switch (paramInt)
    {
    case 3:
    default:
      paramActivity = null;
      AppMethodBeat.o(113647);
      return paramActivity;
    case 2:
      paramActivity = new c(paramActivity);
    case 4:
    case 5:
    }
    while (true)
    {
      AppMethodBeat.o(113647);
      break;
      paramActivity = new h(paramActivity);
      continue;
      ab.i("MicroMsg.MapFactoryImp", "share map");
      paramActivity = new g(paramActivity);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.impl.d
 * JD-Core Version:    0.6.2
 */