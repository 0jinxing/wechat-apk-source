package com.tencent.mm.ui.conversation;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.at;
import com.tencent.mm.storage.ak;
import com.tencent.mm.ui.tools.j;

final class AppBrandServiceConversationUI$AppBrandServiceConversationFmUI$10
  implements AdapterView.OnItemLongClickListener
{
  AppBrandServiceConversationUI$AppBrandServiceConversationFmUI$10(AppBrandServiceConversationUI.AppBrandServiceConversationFmUI paramAppBrandServiceConversationFmUI)
  {
  }

  public final boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(33995);
    AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.access$402(this.zqn, (ak)AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.access$100(this.zqn).getItem(paramInt));
    AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.access$502(this.zqn, AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.access$400(this.zqn).field_username);
    AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.access$700(this.zqn).a(paramView, paramInt, paramLong, this.zqn, this.zqn);
    AppMethodBeat.o(33995);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.AppBrandServiceConversationUI.AppBrandServiceConversationFmUI.10
 * JD-Core Version:    0.6.2
 */