package com.tencent.mm.ui.conversation;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.NinePatchDrawable;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.d;

final class ConversationListView$1
  implements Runnable
{
  ConversationListView$1(ConversationListView paramConversationListView)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(34210);
    ConversationListView.a(this.zsw, d.v(this.zsw.getContext().getResources().getDrawable(2131230844)));
    ConversationListView.a(this.zsw, (NinePatchDrawable)this.zsw.getResources().getDrawable(2130837721));
    AppMethodBeat.o(34210);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.ConversationListView.1
 * JD-Core Version:    0.6.2
 */