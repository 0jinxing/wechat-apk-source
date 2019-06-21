package com.tencent.mm.ui.conversation;

import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class ConversationWithAppBrandListView$a
  implements Runnable
{
  ConversationWithAppBrandListView$a(ConversationWithAppBrandListView paramConversationWithAppBrandListView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(34293);
    View localView = this.ztq.getChildAt(0);
    if ((this.ztq.getFirstVisiblePosition() == 0) && (localView != null))
      if (localView.getTop() >= 0)
        AppMethodBeat.o(34293);
    while (true)
    {
      return;
      ab.i("MicroMsg.ConversationWithAppBrandListView", "[UpAppBrandHeaderTask] run...");
      if (localView.getBottom() >= ConversationWithAppBrandListView.r(this.ztq))
      {
        ConversationWithAppBrandListView.s(this.ztq);
        AppMethodBeat.o(34293);
      }
      else
      {
        ConversationWithAppBrandListView.t(this.ztq);
        AppMethodBeat.o(34293);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.ConversationWithAppBrandListView.a
 * JD-Core Version:    0.6.2
 */