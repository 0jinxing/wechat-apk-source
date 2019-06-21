package com.tencent.mm.plugin.nearby.ui;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.model.bp;
import com.tencent.mm.plugin.messenger.foundation.a.a.i;
import com.tencent.mm.plugin.messenger.foundation.a.a.j.a;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.sdk.platformtools.bo;

final class NearbyPersonalInfoUI$2
  implements MenuItem.OnMenuItemClickListener
{
  NearbyPersonalInfoUI$2(NearbyPersonalInfoUI paramNearbyPersonalInfoUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(55484);
    if (NearbyPersonalInfoUI.a(this.oQH) != -1)
    {
      paramMenuItem = bp.aao();
      paramMenuItem.dtS = NearbyPersonalInfoUI.a(this.oQH);
      bp.a(paramMenuItem);
    }
    paramMenuItem = bp.aap();
    if (paramMenuItem == null)
      NearbyPersonalInfoUI.b(this.oQH);
    while (true)
    {
      AppMethodBeat.o(55484);
      return true;
      String str = bo.nullAsNil(paramMenuItem.getProvince());
      bo.nullAsNil(paramMenuItem.getCity());
      int i = paramMenuItem.dtS;
      if ((bo.isNullOrNil(str)) || (i == 0))
      {
        NearbyPersonalInfoUI.b(this.oQH);
      }
      else
      {
        this.oQH.startActivity(new Intent(this.oQH, NearbyFriendsUI.class));
        paramMenuItem = bp.aao();
        if (i != -1)
          paramMenuItem.dtS = i;
        ((j)g.K(j.class)).XL().c(new j.a(1, bp.a(paramMenuItem)));
        this.oQH.finish();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.nearby.ui.NearbyPersonalInfoUI.2
 * JD-Core Version:    0.6.2
 */