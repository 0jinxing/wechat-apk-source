package com.tencent.mm.ui.conversation;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ConversationWithAppBrandListView$22
  implements AdapterView.OnItemClickListener
{
  ConversationWithAppBrandListView$22(ConversationWithAppBrandListView paramConversationWithAppBrandListView, AdapterView.OnItemClickListener paramOnItemClickListener)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(34290);
    if (this.ztv != null)
      this.ztv.onItemClick(paramAdapterView, paramView, paramInt, paramLong);
    if (!ConversationWithAppBrandListView.b(this.ztq))
      AppMethodBeat.o(34290);
    while (true)
    {
      return;
      if (this.ztq.getFirstVisiblePosition() == 0)
        this.ztq.J(500L, 8);
      AppMethodBeat.o(34290);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.ConversationWithAppBrandListView.22
 * JD-Core Version:    0.6.2
 */