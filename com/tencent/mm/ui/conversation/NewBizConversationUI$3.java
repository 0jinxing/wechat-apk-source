package com.tencent.mm.ui.conversation;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.at;
import com.tencent.mm.storage.ak;
import com.tencent.mm.ui.widget.b.a;

final class NewBizConversationUI$3
  implements AdapterView.OnItemLongClickListener
{
  NewBizConversationUI$3(NewBizConversationUI paramNewBizConversationUI)
  {
  }

  public final boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(34534);
    NewBizConversationUI.a(this.zvm, (ak)NewBizConversationUI.e(this.zvm).getItem(paramInt));
    NewBizConversationUI.a(this.zvm, NewBizConversationUI.g(this.zvm).field_username);
    NewBizConversationUI.k(this.zvm).a(paramView, paramInt, paramLong, this.zvm, NewBizConversationUI.h(this.zvm), NewBizConversationUI.i(this.zvm), NewBizConversationUI.j(this.zvm));
    AppMethodBeat.o(34534);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.NewBizConversationUI.3
 * JD-Core Version:    0.6.2
 */