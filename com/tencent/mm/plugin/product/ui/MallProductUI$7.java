package com.tencent.mm.plugin.product.ui;

import android.content.res.Resources;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.product.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.q;
import java.util.ArrayList;
import java.util.List;

final class MallProductUI$7
  implements MenuItem.OnMenuItemClickListener
{
  MallProductUI$7(MallProductUI paramMallProductUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(44164);
    paramMenuItem = this.pke.getResources().getStringArray(2131755035);
    ArrayList localArrayList = new ArrayList();
    for (int i = 0; i < paramMenuItem.length; i++)
      localArrayList.add(paramMenuItem[i]);
    if ((this.pke.piK.bZF().piG & 0x1) > 0);
    for (boolean bool = true; ; bool = false)
    {
      ab.d("MicroMsg.MallProductConfig", "isShowSellerEntry, ret = ".concat(String.valueOf(bool)));
      if (bool)
        localArrayList.add(this.pke.getString(2131301362));
      h.a(this.pke.mController.ylL, null, (String[])localArrayList.toArray(new String[localArrayList.size()]), null, false, new MallProductUI.7.1(this));
      AppMethodBeat.o(44164);
      return true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.product.ui.MallProductUI.7
 * JD-Core Version:    0.6.2
 */