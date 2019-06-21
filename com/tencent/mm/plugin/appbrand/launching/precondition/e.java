package com.tencent.mm.plugin.appbrand.launching.precondition;

import android.content.ContextWrapper;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI;
import com.tencent.mm.plugin.appbrand.ui.n;

public final class e extends ContextWrapper
  implements g
{
  public e(AppBrandLaunchProxyUI paramAppBrandLaunchProxyUI)
  {
    super(paramAppBrandLaunchProxyUI);
  }

  public final void E(Intent paramIntent)
  {
    AppMethodBeat.i(132074);
    n.a(((AppBrandLaunchProxyUI)super.getBaseContext()).getWindow());
    n.a(((AppBrandLaunchProxyUI)super.getBaseContext()).getWindow(), true);
    paramIntent = d.Cn(paramIntent.getStringExtra("extra_entry_token"));
    if (paramIntent == null)
    {
      ((AppBrandLaunchProxyUI)super.getBaseContext()).finish();
      AppMethodBeat.o(132074);
    }
    while (true)
    {
      return;
      paramIntent.setBaseContext((AppBrandLaunchProxyUI)super.getBaseContext());
      AppMethodBeat.o(132074);
    }
  }

  public final boolean aHO()
  {
    return true;
  }

  public final void onDestroy()
  {
  }

  public final void onPause()
  {
  }

  public final void onResume()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.launching.precondition.e
 * JD-Core Version:    0.6.2
 */