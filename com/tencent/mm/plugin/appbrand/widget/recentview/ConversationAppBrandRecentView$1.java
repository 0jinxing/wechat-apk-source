package com.tencent.mm.plugin.appbrand.widget.recentview;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.appbrand.service.e;
import com.tencent.mm.sdk.platformtools.ab;

final class ConversationAppBrandRecentView$1
  implements AppBrandRecentView.b
{
  ConversationAppBrandRecentView$1(ConversationAppBrandRecentView paramConversationAppBrandRecentView)
  {
  }

  public final boolean a(View paramView, a parama, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(134358);
    if (ConversationAppBrandRecentView.a(this.joa) != null)
      ConversationAppBrandRecentView.a(this.joa).a(paramView, parama, paramFloat1, paramFloat2);
    if (parama.type == 0)
    {
      ((com.tencent.mm.plugin.appbrand.service.g)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.appbrand.service.g.class)).b(this.joa.getContext(), 13, false);
      AppMethodBeat.o(134358);
      return false;
    }
    this.joa.setLayoutFrozen(true);
    paramView = new AppBrandStatObject();
    if (this.joa.jax == AppBrandRecentView.f.jmI);
    for (int i = 1104; ; i = 1089)
    {
      paramView.scene = i;
      ((e)com.tencent.mm.kernel.g.K(e.class)).a(this.joa.getContext(), parama.iXW.username, null, parama.iXW.har, -1, null, paramView);
      break;
    }
  }

  public final boolean b(View paramView, a parama, float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(134359);
    if (ConversationAppBrandRecentView.a(this.joa) != null)
      ConversationAppBrandRecentView.a(this.joa).b(paramView, parama, paramFloat1, paramFloat2);
    ab.i("MicroMsg.ConversationAppBrandRecentView", "[onItemLongClick] x:%s", new Object[] { Float.valueOf(paramFloat1) });
    if (parama.type != 0)
      new com.tencent.mm.ui.widget.b.a(this.joa.getContext()).a(paramView, new ConversationAppBrandRecentView.1.1(this), new ConversationAppBrandRecentView.1.2(this, parama), (int)paramFloat1, (int)paramFloat2);
    AppMethodBeat.o(134359);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.recentview.ConversationAppBrandRecentView.1
 * JD-Core Version:    0.6.2
 */