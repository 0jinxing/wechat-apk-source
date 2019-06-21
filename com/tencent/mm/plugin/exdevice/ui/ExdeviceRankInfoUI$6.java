package com.tencent.mm.plugin.exdevice.ui;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ExdeviceRankInfoUI$6
  implements View.OnClickListener
{
  ExdeviceRankInfoUI$6(ExdeviceRankInfoUI paramExdeviceRankInfoUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(20140);
    com.tencent.mm.plugin.sport.a.d.kT(24);
    paramView = new Intent();
    paramView.putExtra("Select_Talker_Name", "gh_43f2581f6fd6");
    paramView.putExtra("Select_block_List", "gh_43f2581f6fd6");
    paramView.putExtra("Select_Conv_Type", 3);
    paramView.putExtra("mutil_select_is_ret", true);
    paramView.putExtra("Select_Send_Card", true);
    com.tencent.mm.bp.d.b(this.lDC, ".ui.transmit.SelectConversationUI", paramView, 3);
    AppMethodBeat.o(20140);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.ui.ExdeviceRankInfoUI.6
 * JD-Core Version:    0.6.2
 */