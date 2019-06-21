package com.tencent.mm.plugin.appbrand.ui.recents;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.launching.AppBrandLaunchProxyUI;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.protocal.protobuf.cxi;
import com.tencent.mm.sdk.platformtools.ab;

final class j$3
  implements View.OnClickListener
{
  j$3(j paramj, cxi paramcxi)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(133472);
    ab.i("MicroMsg.AppBrandListRecentsListWAGameHeader", "Invoke WxApp click listener, invoke wxapp");
    paramView = new AppBrandStatObject();
    AppBrandLaunchProxyUI.a(this.iOB.gNy, this.iOD.username, this.iOD.path, 0, this.iOD.vOP, paramView, null, null);
    AppMethodBeat.o(133472);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.recents.j.3
 * JD-Core Version:    0.6.2
 */