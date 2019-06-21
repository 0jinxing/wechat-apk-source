package com.tencent.mm.ui.conversation;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.at;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ak;
import com.tencent.mm.ui.chatting.ChattingUI;

final class NewBizConversationUI$18
  implements AdapterView.OnItemClickListener
{
  NewBizConversationUI$18(NewBizConversationUI paramNewBizConversationUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(34553);
    NewBizConversationUI.a(this.zvm, (ak)NewBizConversationUI.e(this.zvm).getItem(paramInt));
    NewBizConversationUI.a(this.zvm, NewBizConversationUI.g(this.zvm).field_username);
    paramAdapterView = NewBizConversationUI.g(this.zvm);
    if (paramAdapterView == null)
    {
      ab.e("MicroMsg.NewBizConversationUI", "user should not be null. position:%d, size:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(NewBizConversationUI.e(this.zvm).getCount()) });
      NewBizConversationUI.e(this.zvm).notifyDataSetChanged();
      AppMethodBeat.o(34553);
    }
    while (true)
    {
      return;
      paramView = new Intent(this.zvm, ChattingUI.class);
      paramView.putExtra("Chat_User", paramAdapterView.field_username);
      paramView.putExtra("finish_direct", true);
      paramView.putExtra("biz_click_item_unread_count", NewBizConversationUI.g(this.zvm).field_unReadCount);
      paramView.putExtra("biz_click_item_position", paramInt + 1);
      paramView.putExtra("KOpenArticleSceneFromScene", 92);
      paramView.putExtra("specific_chat_from_scene", 6);
      this.zvm.startActivity(paramView);
      NewBizConversationUI.e(this.zvm).a(paramAdapterView, paramInt);
      AppMethodBeat.o(34553);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.NewBizConversationUI.18
 * JD-Core Version:    0.6.2
 */