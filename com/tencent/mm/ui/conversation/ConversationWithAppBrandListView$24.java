package com.tencent.mm.ui.conversation;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.header.a.a;
import com.tencent.mm.plugin.appbrand.widget.recentview.AppBrandRecentView;
import com.tencent.mm.sdk.platformtools.ab;

final class ConversationWithAppBrandListView$24
  implements Runnable
{
  ConversationWithAppBrandListView$24(ConversationWithAppBrandListView paramConversationWithAppBrandListView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(34292);
    if (ConversationWithAppBrandListView.c(this.ztq) != null)
    {
      ab.d("MicroMsg.ConversationWithAppBrandListView", "alvinluo resetToFirstPage");
      ConversationWithAppBrandListView.c(this.ztq).aQb();
    }
    if (ConversationWithAppBrandListView.d(this.ztq) != null)
      ConversationWithAppBrandListView.d(this.ztq).smoothScrollToPosition(0);
    View localView = this.ztq.getChildAt(0);
    if (localView == null);
    for (int i = 0; ; i = localView.getBottom())
    {
      if (i != 0)
        this.ztq.smoothScrollBy(i, 0);
      this.ztq.setSelection(0);
      ConversationWithAppBrandListView.e(this.ztq);
      AppMethodBeat.o(34292);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.ConversationWithAppBrandListView.24
 * JD-Core Version:    0.6.2
 */