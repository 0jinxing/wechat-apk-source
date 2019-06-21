package com.tencent.mm.ui.chatting;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ChatFooterCustom$4
  implements AdapterView.OnItemClickListener
{
  ChatFooterCustom$4(ChatFooterCustom paramChatFooterCustom)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(30466);
    this.yHI.onClick(paramView);
    AppMethodBeat.o(30466);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.ChatFooterCustom.4
 * JD-Core Version:    0.6.2
 */