package com.tencent.mm.ui.conversation;

import android.content.res.Resources;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.widget.header.a;

final class ConversationListView$4
  implements a
{
  ConversationListView$4(ConversationListView paramConversationListView, a parama)
  {
  }

  public final void a(float paramFloat, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(34213);
    int i = (int)(255.0F * paramFloat) << 24 | this.zsw.getResources().getColor(2131690310) & 0xFFFFFF;
    this.zsw.setBackgroundColor(i);
    if (ConversationListView.f(this.zsw) != null)
      ConversationListView.f(this.zsw).setBackgroundColor(i);
    if (this.zsx != null)
      this.zsx.a(paramFloat, paramInt1, paramInt2, paramInt3);
    AppMethodBeat.o(34213);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.ConversationListView.4
 * JD-Core Version:    0.6.2
 */