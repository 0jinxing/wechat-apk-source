package com.tencent.mm.ui.conversation;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.at;
import com.tencent.mm.storage.ak;
import com.tencent.mm.ui.tools.j;

final class EnterpriseConversationUI$EnterpriseConversationFmUI$5
  implements AdapterView.OnItemLongClickListener
{
  EnterpriseConversationUI$EnterpriseConversationFmUI$5(EnterpriseConversationUI.EnterpriseConversationFmUI paramEnterpriseConversationFmUI)
  {
  }

  public final boolean onItemLongClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(34421);
    paramAdapterView = (ak)EnterpriseConversationUI.EnterpriseConversationFmUI.f(this.zut).getItem(paramInt);
    EnterpriseConversationUI.EnterpriseConversationFmUI.c(this.zut, paramAdapterView.field_username);
    EnterpriseConversationUI.EnterpriseConversationFmUI.i(this.zut).a(paramView, paramInt, paramLong, this.zut, EnterpriseConversationUI.EnterpriseConversationFmUI.h(this.zut));
    AppMethodBeat.o(34421);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.EnterpriseConversationUI.EnterpriseConversationFmUI.5
 * JD-Core Version:    0.6.2
 */