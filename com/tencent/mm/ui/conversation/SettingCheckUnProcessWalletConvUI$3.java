package com.tencent.mm.ui.conversation;

import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.c.at;

final class SettingCheckUnProcessWalletConvUI$3
  implements AdapterView.OnItemClickListener
{
  SettingCheckUnProcessWalletConvUI$3(SettingCheckUnProcessWalletConvUI paramSettingCheckUnProcessWalletConvUI)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(34612);
    paramAdapterView = SettingCheckUnProcessWalletConvUI.b(this.zvJ).Py(paramInt);
    if (paramAdapterView == null)
      AppMethodBeat.o(34612);
    while (true)
    {
      return;
      paramView = new Intent();
      paramView.putExtra("Chat_User", paramAdapterView.field_username);
      paramView.putExtra("chat_from_scene", 4);
      d.f(this.zvJ, ".ui.chatting.ChattingUI", paramView);
      AppMethodBeat.o(34612);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.conversation.SettingCheckUnProcessWalletConvUI.3
 * JD-Core Version:    0.6.2
 */