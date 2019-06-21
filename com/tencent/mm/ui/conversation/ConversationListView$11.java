package com.tencent.mm.ui.conversation;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class ConversationListView$11
  implements AdapterView.OnItemClickListener
{
  ConversationListView$11(ConversationListView paramConversationListView)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(34220);
    ab.i("MicroMsg.ConversationListView", "alvinluo onItemClick isCanClose: %b", new Object[] { Boolean.valueOf(ConversationListView.b(this.zsw)) });
    if ((ConversationListView.d(this.zsw) != null) && (!ConversationListView.b(this.zsw)))
      ConversationListView.d(this.zsw).onItemClick(paramAdapterView, paramView, paramInt, paramLong);
    AppMethodBeat.o(34220);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.ConversationListView.11
 * JD-Core Version:    0.6.2
 */