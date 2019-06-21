package com.tencent.mm.plugin.account.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.s;
import com.tencent.mm.ui.base.h;

final class RegByMobileSetNickUI$1
  implements MenuItem.OnMenuItemClickListener
{
  RegByMobileSetNickUI$1(RegByMobileSetNickUI paramRegByMobileSetNickUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(125429);
    paramMenuItem = RegByMobileSetNickUI.a(this.gGx).getText().toString().trim();
    if ((paramMenuItem == null) || (paramMenuItem.length() <= 0))
    {
      h.g(this.gGx, 2131304226, 2131302287);
      AppMethodBeat.o(125429);
    }
    while (true)
    {
      return true;
      this.gGx.aqX();
      Object localObject1 = this.gGx.getIntent().getExtras().getString("regbymobile_pwd");
      Object localObject2 = this.gGx.getIntent().getExtras().getString("regbymobile_ticket");
      localObject2 = new s("", (String)localObject1, paramMenuItem, 0, "", RegByMobileSetNickUI.b(this.gGx), (String)localObject2, 4);
      g.Rg().a((m)localObject2, 0);
      localObject1 = this.gGx;
      paramMenuItem = this.gGx;
      this.gGx.getString(2131297061);
      RegByMobileSetNickUI.a((RegByMobileSetNickUI)localObject1, h.b(paramMenuItem, this.gGx.getString(2131302326), true, new RegByMobileSetNickUI.1.1(this, (s)localObject2)));
      AppMethodBeat.o(125429);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegByMobileSetNickUI.1
 * JD-Core Version:    0.6.2
 */