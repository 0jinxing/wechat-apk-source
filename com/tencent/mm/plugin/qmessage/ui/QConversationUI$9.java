package com.tencent.mm.plugin.qmessage.ui;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.at;
import com.tencent.mm.plugin.qmessage.a;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.storage.ak;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

final class QConversationUI$9
  implements AdapterView.OnItemClickListener
{
  QConversationUI$9(QConversationUI paramQConversationUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(24135);
    paramView = (ak)QConversationUI.b(this.ptk).getItem(paramInt);
    paramAdapterView = new Intent();
    paramAdapterView.addFlags(67108864);
    paramAdapterView.putExtra("Chat_User", paramView.field_username);
    paramAdapterView.putExtra("key_need_send_video", false);
    a.gkE.d(paramAdapterView, this.ptk.mController.ylL);
    AppMethodBeat.o(24135);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qmessage.ui.QConversationUI.9
 * JD-Core Version:    0.6.2
 */