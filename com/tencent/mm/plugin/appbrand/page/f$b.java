package com.tencent.mm.plugin.appbrand.page;

import a.l;
import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.g.d;
import com.tencent.mm.plugin.appbrand.i;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/tencent/mm/plugin/appbrand/page/AppBrandModularizingErrorReplayView$3$2"})
final class f$b
  implements View.OnClickListener
{
  f$b(f paramf, Context paramContext)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(134760);
    paramView = f.b(this.ire);
    if (paramView != null)
    {
      paramView = paramView.getRuntime();
      if (paramView != null)
      {
        g.a(paramView.getAppId(), g.d.gNm);
        paramView.close();
        AppMethodBeat.o(134760);
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(134760);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.page.f.b
 * JD-Core Version:    0.6.2
 */