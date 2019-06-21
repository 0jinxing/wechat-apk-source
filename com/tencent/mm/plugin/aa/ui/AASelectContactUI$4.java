package com.tencent.mm.plugin.aa.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.r;
import java.util.HashSet;

final class AASelectContactUI$4
  implements MenuItem.OnMenuItemClickListener
{
  AASelectContactUI$4(AASelectContactUI paramAASelectContactUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(40754);
    if ((AASelectContactUI.b(this.gnL) != null) && (AASelectContactUI.b(this.gnL).size() > 0) && (AASelectContactUI.b(this.gnL).size() <= AASelectContactUI.d(this.gnL)) && ((AASelectContactUI.b(this.gnL).size() != 1) || (!AASelectContactUI.b(this.gnL).contains(r.Yz()))))
      com.tencent.mm.ui.base.h.a(this.gnL, this.gnL.getString(2131296374), null, this.gnL.getString(2131296378), this.gnL.getString(2131296377), false, new AASelectContactUI.4.1(this), new AASelectContactUI.4.2(this));
    while (true)
    {
      com.tencent.mm.plugin.report.service.h.pYm.e(13721, new Object[] { Integer.valueOf(2), Integer.valueOf(7) });
      AppMethodBeat.o(40754);
      return true;
      this.gnL.finish();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.AASelectContactUI.4
 * JD-Core Version:    0.6.2
 */