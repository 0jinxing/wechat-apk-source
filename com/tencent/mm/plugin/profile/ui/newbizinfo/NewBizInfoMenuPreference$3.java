package com.tencent.mm.plugin.profile.ui.newbizinfo;

import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.c.ap;
import com.tencent.mm.plugin.profile.ui.newbizinfo.b.c;
import com.tencent.mm.plugin.profile.ui.newbizinfo.b.e;
import com.tencent.mm.plugin.profile.ui.newbizinfo.c.b;
import com.tencent.mm.ui.base.n.d;
import java.util.List;

final class NewBizInfoMenuPreference$3
  implements n.d
{
  NewBizInfoMenuPreference$3(NewBizInfoMenuPreference paramNewBizInfoMenuPreference, e parame)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(23872);
    paramMenuItem = (e)this.pqc.pqE.get(paramInt);
    if (paramMenuItem.type == 2)
    {
      c.a(paramMenuItem, NewBizInfoMenuPreference.b(this.pqd), NewBizInfoMenuPreference.a(this.pqd).field_username);
      b.b(NewBizInfoMenuPreference.a(this.pqd).field_username, this.pqc.id, this.pqc.key, b.pqI, this.pqc.name, b.fa(NewBizInfoMenuPreference.c(this.pqd).indexOf(this.pqc), paramInt), this.pqc.cRS);
      AppMethodBeat.o(23872);
    }
    while (true)
    {
      return;
      if (paramMenuItem.type == 5)
      {
        c.b(paramMenuItem, NewBizInfoMenuPreference.b(this.pqd), NewBizInfoMenuPreference.a(this.pqd).field_username);
        b.b(NewBizInfoMenuPreference.a(this.pqd).field_username, this.pqc.id, this.pqc.key, b.pqI, this.pqc.name, b.fa(NewBizInfoMenuPreference.c(this.pqd).indexOf(this.pqc), paramInt), this.pqc.value);
      }
      AppMethodBeat.o(23872);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.profile.ui.newbizinfo.NewBizInfoMenuPreference.3
 * JD-Core Version:    0.6.2
 */