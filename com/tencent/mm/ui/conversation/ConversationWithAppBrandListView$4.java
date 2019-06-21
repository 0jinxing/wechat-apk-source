package com.tencent.mm.ui.conversation;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.recentview.AppBrandRecentView.e;
import com.tencent.mm.sdk.platformtools.ab;

final class ConversationWithAppBrandListView$4
  implements AppBrandRecentView.e
{
  ConversationWithAppBrandListView$4(ConversationWithAppBrandListView paramConversationWithAppBrandListView)
  {
  }

  public final void qs(int paramInt)
  {
    AppMethodBeat.i(34269);
    ab.i("MicroMsg.ConversationWithAppBrandListView", "alvinluo onDone MyAppBrand size: %d", new Object[] { Integer.valueOf(paramInt) });
    if (paramInt <= 0)
      ConversationWithAppBrandListView.b(this.ztq, true);
    while (true)
    {
      ConversationWithAppBrandListView.a(this.ztq, paramInt);
      AppMethodBeat.o(34269);
      return;
      ConversationWithAppBrandListView.b(this.ztq, false);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.ConversationWithAppBrandListView.4
 * JD-Core Version:    0.6.2
 */