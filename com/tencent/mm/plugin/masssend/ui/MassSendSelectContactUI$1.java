package com.tencent.mm.plugin.masssend.ui;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashSet;
import java.util.List;

final class MassSendSelectContactUI$1
  implements MenuItem.OnMenuItemClickListener
{
  MassSendSelectContactUI$1(MassSendSelectContactUI paramMassSendSelectContactUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(22874);
    ab.i("MicroMsg.MassSendSelectContactUI", "Click Next Btn");
    paramMenuItem = bo.P((String[])MassSendSelectContactUI.a(this.opp).toArray(new String[0]));
    boolean bool;
    if (paramMenuItem == null)
    {
      ab.e("MicroMsg.MassSendSelectContactUI", "no choosed anyone");
      AppMethodBeat.o(22874);
      bool = false;
    }
    while (true)
    {
      return bool;
      paramMenuItem.remove(r.Yz());
      String str = bo.c(paramMenuItem, ";");
      paramMenuItem = new Intent(this.opp, MassSendMsgUI.class);
      paramMenuItem.putExtra("mass_send_contact_list", str);
      this.opp.startActivity(paramMenuItem);
      bool = true;
      AppMethodBeat.o(22874);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.masssend.ui.MassSendSelectContactUI.1
 * JD-Core Version:    0.6.2
 */