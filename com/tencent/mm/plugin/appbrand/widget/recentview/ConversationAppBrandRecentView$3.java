package com.tencent.mm.plugin.appbrand.widget.recentview;

import android.support.v7.widget.RecyclerView.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;

final class ConversationAppBrandRecentView$3
  implements Runnable
{
  ConversationAppBrandRecentView$3(ConversationAppBrandRecentView paramConversationAppBrandRecentView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(134363);
    Object localObject = this.joa;
    if (((BaseAppBrandRecentView)localObject).jnC)
    {
      int i = ((BaseAppBrandRecentView)localObject).jny.size();
      if ((i - 1 < ((BaseAppBrandRecentView)localObject).iJL.size()) && ((a)((BaseAppBrandRecentView)localObject).iJL.get(i - 1) != null))
      {
        ab.i("MicroMsg.BaseAppBrandRecentView", "alvinluo addCacheItemAtLast pos: %d", new Object[] { Integer.valueOf(i) });
        ((BaseAppBrandRecentView)localObject).jny.add(i, ((BaseAppBrandRecentView)localObject).iJL.get(i - 1));
        ((BaseAppBrandRecentView)localObject).getAdapter().ch(i);
        ((BaseAppBrandRecentView)localObject).getAdapter().ar(i, 5);
      }
    }
    if (this.joa.getOnDataChangedListener() != null)
    {
      localObject = this.joa.getOnDataChangedListener();
      this.joa.getPreviewItemList().size();
      ((AppBrandRecentView.d)localObject).aQf();
    }
    AppMethodBeat.o(134363);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.recentview.ConversationAppBrandRecentView.3
 * JD-Core Version:    0.6.2
 */