package com.tencent.mm.plugin.setting.ui.setting;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.report.service.h;
import java.util.ArrayList;

final class SettingsChattingUI$2$2
  implements DialogInterface.OnClickListener
{
  SettingsChattingUI$2$2(SettingsChattingUI.2 param2, ArrayList paramArrayList)
  {
  }

  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    AppMethodBeat.i(127211);
    h.pYm.e(14553, new Object[] { Integer.valueOf(5), Integer.valueOf(4), "" });
    SettingsChattingUI.a(this.qnc.qnb, true);
    if (this.qnd.size() <= 1)
    {
      paramDialogInterface = new Intent();
      paramDialogInterface.putExtra("Chat_User", (String)this.qnd.get(0));
      paramDialogInterface.addFlags(67108864);
      d.f(this.qnc.qnb, ".ui.chatting.ChattingUI", paramDialogInterface);
      AppMethodBeat.o(127211);
    }
    while (true)
    {
      return;
      paramDialogInterface = new Intent();
      paramDialogInterface.putStringArrayListExtra("key_conversation_list", this.qnd);
      d.f(this.qnc.qnb, ".ui.conversation.SettingCheckUnProcessWalletConvUI", paramDialogInterface);
      AppMethodBeat.o(127211);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.ui.setting.SettingsChattingUI.2.2
 * JD-Core Version:    0.6.2
 */