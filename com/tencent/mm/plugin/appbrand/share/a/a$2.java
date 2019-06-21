package com.tencent.mm.plugin.appbrand.share.a;

import android.view.View;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelappbrand.f;
import com.tencent.mm.plugin.appbrand.dynamic.widget.IPCDynamicPageView;
import com.tencent.mm.plugin.appbrand.share.widget.WxaShareMessagePage;
import com.tencent.mm.ui.widget.ThreeDotsLoadingView;

final class a$2
  implements f
{
  a$2(a parama, WxaShareMessagePage paramWxaShareMessagePage)
  {
  }

  public final void F(View paramView, int paramInt)
  {
    AppMethodBeat.i(132740);
    switch (paramInt)
    {
    case 2:
    case 3:
    default:
      this.iDQ.getLoadingView().dKT();
      this.iDQ.getLoadingView().setVisibility(4);
      this.iDQ.getErrorImageView().setVisibility(0);
      this.iDQ.getWidgetPageView().setVisibility(4);
      this.iDQ.getErrorImageView().setImageResource(2131230877);
      AppMethodBeat.o(132740);
    case 0:
    case 1:
    case 4:
    }
    while (true)
    {
      return;
      this.iDQ.getLoadingView().setVisibility(0);
      this.iDQ.getErrorImageView().setVisibility(4);
      this.iDQ.getWidgetPageView().setVisibility(4);
      this.iDQ.getLoadingView().dKS();
      AppMethodBeat.o(132740);
      continue;
      this.iDQ.getLoadingView().dKT();
      this.iDQ.getLoadingView().setVisibility(4);
      this.iDQ.getErrorImageView().setVisibility(0);
      this.iDQ.getWidgetPageView().setVisibility(4);
      this.iDQ.getErrorImageView().setImageResource(2131231220);
      AppMethodBeat.o(132740);
      continue;
      this.iDQ.getLoadingView().setVisibility(4);
      this.iDQ.getErrorImageView().setVisibility(4);
      this.iDQ.getWidgetPageView().setVisibility(0);
      AppMethodBeat.o(132740);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.share.a.a.2
 * JD-Core Version:    0.6.2
 */