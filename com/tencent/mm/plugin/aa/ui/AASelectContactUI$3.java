package com.tencent.mm.plugin.aa.ui;

import android.content.Intent;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

final class AASelectContactUI$3
  implements MenuItem.OnMenuItemClickListener
{
  AASelectContactUI$3(AASelectContactUI paramAASelectContactUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(40751);
    if (AASelectContactUI.b(this.gnL).size() > AASelectContactUI.d(this.gnL))
    {
      com.tencent.mm.ui.base.h.b(this.gnL.mController.ylL, this.gnL.getString(2131300919, new Object[] { Long.valueOf(AASelectContactUI.d(this.gnL)) }), "", true);
      com.tencent.mm.plugin.report.service.h.pYm.e(13721, new Object[] { Integer.valueOf(2), Integer.valueOf(8) });
      com.tencent.mm.plugin.report.service.h.pYm.e(13722, new Object[] { Integer.valueOf(3) });
      AppMethodBeat.o(40751);
    }
    while (true)
    {
      return true;
      if (AASelectContactUI.b(this.gnL).size() <= 0)
      {
        com.tencent.mm.ui.base.h.b(this.gnL.mController.ylL, this.gnL.getString(2131296379, new Object[] { Integer.valueOf(1) }), "", true);
        com.tencent.mm.plugin.report.service.h.pYm.e(13721, new Object[] { Integer.valueOf(2), Integer.valueOf(9) });
        AppMethodBeat.o(40751);
      }
      else
      {
        paramMenuItem = new LinkedList();
        paramMenuItem.addAll(AASelectContactUI.b(this.gnL));
        paramMenuItem = bo.c(paramMenuItem, ",");
        this.gnL.setResult(-1, this.gnL.getIntent().putExtra("Select_Contact", paramMenuItem));
        this.gnL.finish();
        this.gnL.aqX();
        com.tencent.mm.plugin.report.service.h.pYm.e(13721, new Object[] { Integer.valueOf(2), Integer.valueOf(8) });
        AppMethodBeat.o(40751);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.AASelectContactUI.3
 * JD-Core Version:    0.6.2
 */