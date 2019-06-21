package com.tencent.mm.plugin.appbrand.weishi;

import android.app.Activity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.AppBrandInitConfigWC;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.ui.AppBrandPluginUI;
import com.tencent.mm.plugin.appbrand.ui.n;
import com.tencent.mm.sdk.platformtools.ab;

public class AppBrandWeishiUI extends AppBrandPluginUI
{
  public final void e(AppBrandInitConfigWC paramAppBrandInitConfigWC, AppBrandStatObject paramAppBrandStatObject)
  {
    AppMethodBeat.i(133638);
    ab.i("MicroMsg.AppBrandWeishiUI", "initAppBrandUIOpenAnimation, weishi animation");
    d.b(this, paramAppBrandInitConfigWC);
    AppMethodBeat.o(133638);
  }

  public void onDetachedFromWindow()
  {
    AppMethodBeat.i(133639);
    super.onDetachedFromWindow();
    AppMethodBeat.o(133639);
  }

  public void onResume()
  {
    AppMethodBeat.i(133637);
    super.onResume();
    ab.i("MicroMsg.AppBrandWeishiUI", "onResume");
    n.c(getWindow(), true);
    AppMethodBeat.o(133637);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.weishi.AppBrandWeishiUI
 * JD-Core Version:    0.6.2
 */