package com.tencent.mm.plugin.profile.ui;

import android.content.Intent;
import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.kernel.g;
import com.tencent.mm.pluginsdk.n;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.ad;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n.d;

final class c$2
  implements n.d
{
  c$2(c paramc)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(23458);
    switch (paramMenuItem.getItemId())
    {
    default:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    }
    while (true)
    {
      AppMethodBeat.o(23458);
      while (true)
      {
        return;
        c localc = this.pmK;
        paramMenuItem = new Intent();
        paramMenuItem.putExtra("Select_Talker_Name", localc.ehM.field_username);
        paramMenuItem.putExtra("Select_block_List", localc.ehM.field_username);
        paramMenuItem.putExtra("Select_Send_Card", true);
        paramMenuItem.putExtra("Select_Conv_Type", 3);
        paramMenuItem.putExtra("mutil_select_is_ret", true);
        com.tencent.mm.plugin.profile.b.gkE.a(paramMenuItem, localc.crP);
        AppMethodBeat.o(23458);
        continue;
        this.pmK.crP.getString(2131299938, new Object[] { this.pmK.ehM.Oj() });
        com.tencent.mm.ui.base.h.d(this.pmK.crP, this.pmK.crP.getString(2131298459), "", this.pmK.crP.getString(2131298458), this.pmK.crP.getString(2131296868), new c.2.1(this), null);
        AppMethodBeat.o(23458);
        continue;
        this.pmK.caX();
        AppMethodBeat.o(23458);
        continue;
        paramMenuItem = this.pmK;
        ((com.tencent.mm.pluginsdk.h)g.K(com.tencent.mm.pluginsdk.h.class)).a(paramMenuItem.pkW, paramMenuItem.crP, paramMenuItem.ehM, true, new c.3(paramMenuItem));
        AppMethodBeat.o(23458);
      }
      paramMenuItem = this.pmK;
      ab.d("MicroMsg.ContactWidgetBizInfo", "dealAddShortcut, username = " + paramMenuItem.ehM.field_username);
      com.tencent.mm.plugin.base.model.b.aa(paramMenuItem.crP, paramMenuItem.ehM.field_username);
      al.n(new c.8(paramMenuItem), 1000L);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.c.2
 * JD-Core Version:    0.6.2
 */