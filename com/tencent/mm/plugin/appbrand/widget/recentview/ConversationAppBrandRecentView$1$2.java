package com.tencent.mm.plugin.appbrand.widget.recentview;

import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.appbrand.appusage.LocalUsageInfo;
import com.tencent.mm.plugin.appbrand.appusage.af;
import com.tencent.mm.plugin.appbrand.appusage.ag;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.n.d;

final class ConversationAppBrandRecentView$1$2
  implements n.d
{
  ConversationAppBrandRecentView$1$2(ConversationAppBrandRecentView.1 param1, a parama)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(134357);
    if (ConversationAppBrandRecentView.c(this.job.joa) != null)
      ConversationAppBrandRecentView.c(this.job.joa).a(paramMenuItem, this.jaX.position, this.jaX);
    if ((paramMenuItem.getItemId() == 1) && (this.jaX.position >= 0))
    {
      ConversationAppBrandRecentView.d(this.job.joa);
      ab.i("MicroMsg.ConversationAppBrandRecentView", "[onItemLongClick] Delete position:%s, mType: %s", new Object[] { Integer.valueOf(this.jaX.position), this.job.joa.jax });
      if (this.job.joa.jax != AppBrandRecentView.f.jmH)
        break label223;
      ((ag)g.K(ag.class)).aE(this.jaX.iXW.username, this.jaX.iXW.har);
    }
    while (true)
    {
      ab.i("MicroMsg.ConversationAppBrandRecentView", "alvinluo Delete %s, pos: %d", new Object[] { this.jaX.iXW.nickname, Integer.valueOf(this.jaX.position) });
      this.job.joa.qW(this.jaX.position);
      AppMethodBeat.o(134357);
      return;
      label223: if (this.job.joa.jax == AppBrandRecentView.f.jmI)
        ((af)g.K(af.class)).aD(this.jaX.iXW.username, this.jaX.iXW.har);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.recentview.ConversationAppBrandRecentView.1.2
 * JD-Core Version:    0.6.2
 */