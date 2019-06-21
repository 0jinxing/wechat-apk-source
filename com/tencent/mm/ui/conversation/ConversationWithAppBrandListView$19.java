package com.tencent.mm.ui.conversation;

import android.widget.RelativeLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.ak;

final class ConversationWithAppBrandListView$19
  implements Runnable
{
  ConversationWithAppBrandListView$19(ConversationWithAppBrandListView paramConversationWithAppBrandListView, RelativeLayout.LayoutParams paramLayoutParams)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(34286);
    this.ztu.topMargin = ak.de(this.ztq.getContext());
    ab.i("MicroMsg.ConversationWithAppBrandListView", "[initLayoutParams]2 ActionBar height:%s", new Object[] { Integer.valueOf(this.ztu.topMargin) });
    AppMethodBeat.o(34286);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.ConversationWithAppBrandListView.19
 * JD-Core Version:    0.6.2
 */