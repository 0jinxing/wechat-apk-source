package com.tencent.mm.ui.conversation;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.at;
import com.tencent.mm.storage.ak;
import com.tencent.mm.ui.widget.b.a;

final class BizConversationUI$BizConversationFmUI$3
  implements AdapterView.OnItemLongClickListener
{
  BizConversationUI$BizConversationFmUI$3(BizConversationUI.BizConversationFmUI paramBizConversationFmUI)
  {
  }

  public final boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(34118);
    BizConversationUI.BizConversationFmUI.a(this.zqR, (ak)BizConversationUI.BizConversationFmUI.e(this.zqR).getItem(paramInt));
    BizConversationUI.BizConversationFmUI.a(this.zqR, BizConversationUI.BizConversationFmUI.f(this.zqR).field_username);
    BizConversationUI.BizConversationFmUI.j(this.zqR).a(paramView, paramInt, paramLong, this.zqR, BizConversationUI.BizConversationFmUI.g(this.zqR), BizConversationUI.BizConversationFmUI.h(this.zqR), BizConversationUI.BizConversationFmUI.i(this.zqR));
    AppMethodBeat.o(34118);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.BizConversationUI.BizConversationFmUI.3
 * JD-Core Version:    0.6.2
 */