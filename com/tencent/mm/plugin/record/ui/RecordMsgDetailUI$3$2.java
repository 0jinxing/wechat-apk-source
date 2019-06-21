package com.tencent.mm.plugin.record.ui;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.pluginsdk.model.e;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.ui.base.n.d;

final class RecordMsgDetailUI$3$2
  implements n.d
{
  RecordMsgDetailUI$3$2(RecordMsgDetailUI.3 param3)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(24237);
    switch (paramMenuItem.getItemId())
    {
    default:
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(24237);
      while (true)
      {
        return;
        paramMenuItem = new Intent();
        paramMenuItem.putExtra("Select_Conv_Type", 3);
        paramMenuItem.putExtra("select_is_ret", true);
        paramMenuItem.putExtra("mutil_select_is_ret", true);
        paramMenuItem.putExtra("Retr_Msg_Type", 10);
        paramMenuItem.putExtra("Retr_Msg_Id", RecordMsgDetailUI.c(this.pKE.pKD));
        d.b(this.pKE.pKD, ".ui.transmit.SelectConversationUI", paramMenuItem, 1001);
        AppMethodBeat.o(24237);
        continue;
        AppMethodBeat.o(24237);
      }
      paramMenuItem = new cl();
      e.a(paramMenuItem, RecordMsgDetailUI.c(this.pKE.pKD));
      paramMenuItem.cvA.cvH = 9;
      paramMenuItem.cvA.activity = this.pKE.pKD;
      a.xxA.m(paramMenuItem);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.ui.RecordMsgDetailUI.3.2
 * JD-Core Version:    0.6.2
 */