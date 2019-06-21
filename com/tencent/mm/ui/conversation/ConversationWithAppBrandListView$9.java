package com.tencent.mm.ui.conversation;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.header.a.a;
import com.tencent.mm.sdk.platformtools.ab;

final class ConversationWithAppBrandListView$9
  implements Runnable
{
  ConversationWithAppBrandListView$9(ConversationWithAppBrandListView paramConversationWithAppBrandListView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(34275);
    if (ConversationWithAppBrandListView.c(this.ztq) != null)
    {
      ab.i("MicroMsg.ConversationWithAppBrandListView", "alvinluo scrollToFirstPage");
      ConversationWithAppBrandListView.c(this.ztq).aQb();
    }
    AppMethodBeat.o(34275);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.ConversationWithAppBrandListView.9
 * JD-Core Version:    0.6.2
 */