package com.tencent.mm.plugin.brandservice.ui;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bp.d;
import com.tencent.mm.plugin.brandservice.b;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.ui.base.n.d;

final class EnterpriseBizContactListUI$2$2
  implements n.d
{
  EnterpriseBizContactListUI$2$2(EnterpriseBizContactListUI.2 param2)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(13944);
    switch (paramMenuItem.getItemId())
    {
    default:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      AppMethodBeat.o(13944);
      while (true)
      {
        return;
        paramMenuItem = new Intent();
        paramMenuItem.putExtra("Select_Talker_Name", this.jLS.jLR.jLN);
        paramMenuItem.putExtra("Select_block_List", this.jLS.jLR.jLN);
        paramMenuItem.putExtra("Select_Send_Card", true);
        paramMenuItem.putExtra("Select_Conv_Type", 3);
        d.b(this.jLS.jLR, ".ui.transmit.SelectConversationUI", paramMenuItem, 1);
        AppMethodBeat.o(13944);
        continue;
        paramMenuItem = new Intent(this.jLS.jLR, EnterpriseBizContactPlainListUI.class);
        paramMenuItem.putExtra("enterprise_biz_name", this.jLS.jLR.jLN);
        paramMenuItem.putExtra("enterprise_scene", 2);
        this.jLS.jLR.startActivity(paramMenuItem);
        AppMethodBeat.o(13944);
      }
      paramMenuItem = new Intent();
      paramMenuItem.putExtra("Contact_User", this.jLS.jLR.jLN);
      b.gkE.c(paramMenuItem, this.jLS.jLR);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.ui.EnterpriseBizContactListUI.2.2
 * JD-Core Version:    0.6.2
 */