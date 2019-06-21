package com.tencent.mm.ui.conversation;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.recentview.AppBrandRecentView.e;
import com.tencent.mm.sdk.platformtools.ab;

final class ConversationWithAppBrandListView$5
  implements AppBrandRecentView.e
{
  ConversationWithAppBrandListView$5(ConversationWithAppBrandListView paramConversationWithAppBrandListView)
  {
  }

  public final void qs(int paramInt)
  {
    AppMethodBeat.i(34270);
    ab.i("MicroMsg.ConversationWithAppBrandListView", "alvinluo onDone RecentAppBrand size: %d", new Object[] { Integer.valueOf(paramInt) });
    if (paramInt <= 0)
      ConversationWithAppBrandListView.c(this.ztq, true);
    while (true)
    {
      ConversationWithAppBrandListView.a(this.ztq, paramInt);
      AppMethodBeat.o(34270);
      return;
      ConversationWithAppBrandListView.c(this.ztq, false);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.ConversationWithAppBrandListView.5
 * JD-Core Version:    0.6.2
 */