package com.tencent.mm.plugin.account.bind.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.EditText;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.au.b;
import com.tencent.mm.kernel.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.base.h;

final class BindMContactUI$3
  implements MenuItem.OnMenuItemClickListener
{
  BindMContactUI$3(BindMContactUI paramBindMContactUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    int i = 0;
    int j = 0;
    int k = 0;
    int m = 0;
    int n = 0;
    AppMethodBeat.i(13463);
    BindMContactUI.a(this.grK, BindMContactUI.d(this.grK).getText().toString().trim() + bo.PA(BindMContactUI.b(this.grK).getText().toString()));
    if ((!com.tencent.mm.pluginsdk.a.aij(BindMContactUI.e(this.grK))) || (bo.PA(BindMContactUI.b(this.grK).getText().toString()).length() <= 0))
    {
      h.g(this.grK, 2131297554, 2131297061);
      AppMethodBeat.o(13463);
      return true;
    }
    int i1 = BindMContactUI.f(this.grK);
    ab.i("MicroMsg.BindMContactUI", "nextStep %d", new Object[] { Integer.valueOf(i1) });
    switch (i1)
    {
    default:
    case 0:
    case 1:
    case 2:
    case 3:
    case 4:
    case 5:
    case 6:
    case 7:
    }
    while (true)
    {
      AppMethodBeat.o(13463);
      break;
      h.b(this.grK, this.grK.getString(2131297567), "", true);
      continue;
      ab.i("MicroMsg.BindMContactUI", "do next, send sms to self");
      BindMContactUI.b(this.grK, BindMContactUI.e(this.grK));
      continue;
      Object localObject1 = b.m(this.grK, BindMContactUI.c(this.grK), this.grK.getString(2131298789));
      boolean bool = ((Boolean)g.RP().Ry().get(ac.a.xVf, Boolean.FALSE)).booleanValue();
      Object localObject2 = this.grK;
      paramMenuItem = aa.dor();
      if (bool);
      for (n = 1; ; n = 0)
      {
        paramMenuItem = ((BindMContactUI)localObject2).getString(2131305909, new Object[] { paramMenuItem, localObject1, "setting", Integer.valueOf(1), Integer.valueOf(n) });
        com.tencent.mm.plugin.account.a.b.a.b(this.grK, paramMenuItem, 30767, true);
        break;
      }
      localObject2 = b.m(this.grK, BindMContactUI.c(this.grK), this.grK.getString(2131298789));
      bool = ((Boolean)g.RP().Ry().get(ac.a.xVf, Boolean.FALSE)).booleanValue();
      paramMenuItem = this.grK;
      localObject1 = aa.dor();
      if (bool)
        n = 1;
      paramMenuItem = paramMenuItem.getString(2131305909, new Object[] { localObject1, localObject2, "login", Integer.valueOf(1), Integer.valueOf(n) });
      com.tencent.mm.plugin.account.a.b.a.b(this.grK, paramMenuItem, 30766, true);
      continue;
      localObject2 = b.m(this.grK, BindMContactUI.c(this.grK), this.grK.getString(2131298789));
      bool = ((Boolean)g.RP().Ry().get(ac.a.xVf, Boolean.FALSE)).booleanValue();
      paramMenuItem = this.grK;
      localObject1 = aa.dor();
      n = i;
      if (bool)
        n = 1;
      paramMenuItem = paramMenuItem.getString(2131305909, new Object[] { localObject1, localObject2, "bindMobileA", Integer.valueOf(1), Integer.valueOf(n) });
      com.tencent.mm.plugin.account.a.b.a.b(this.grK, paramMenuItem, 30767, true);
      continue;
      paramMenuItem = b.m(this.grK, BindMContactUI.c(this.grK), this.grK.getString(2131298789));
      bool = ((Boolean)g.RP().Ry().get(ac.a.xVf, Boolean.FALSE)).booleanValue();
      localObject2 = this.grK;
      localObject1 = aa.dor();
      n = j;
      if (bool)
        n = 1;
      paramMenuItem = ((BindMContactUI)localObject2).getString(2131305909, new Object[] { localObject1, paramMenuItem, "bindMobileB", Integer.valueOf(1), Integer.valueOf(n) });
      com.tencent.mm.plugin.account.a.b.a.b(this.grK, paramMenuItem, 30767, true);
      continue;
      localObject2 = b.m(this.grK, BindMContactUI.c(this.grK), this.grK.getString(2131298789));
      bool = ((Boolean)g.RP().Ry().get(ac.a.xVf, Boolean.FALSE)).booleanValue();
      localObject1 = this.grK;
      paramMenuItem = aa.dor();
      n = k;
      if (bool)
        n = 1;
      paramMenuItem = ((BindMContactUI)localObject1).getString(2131305909, new Object[] { paramMenuItem, localObject2, "bindMobileC", Integer.valueOf(1), Integer.valueOf(n) });
      com.tencent.mm.plugin.account.a.b.a.b(this.grK, paramMenuItem, 30767, true);
      continue;
      localObject1 = b.m(this.grK, BindMContactUI.c(this.grK), this.grK.getString(2131298789));
      bool = ((Boolean)g.RP().Ry().get(ac.a.xVf, Boolean.FALSE)).booleanValue();
      localObject2 = this.grK;
      paramMenuItem = aa.dor();
      n = m;
      if (bool)
        n = 1;
      paramMenuItem = ((BindMContactUI)localObject2).getString(2131305909, new Object[] { paramMenuItem, localObject1, "bindMobileD", Integer.valueOf(1), Integer.valueOf(n) });
      com.tencent.mm.plugin.account.a.b.a.b(this.grK, paramMenuItem, 30767, true);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.bind.ui.BindMContactUI.3
 * JD-Core Version:    0.6.2
 */