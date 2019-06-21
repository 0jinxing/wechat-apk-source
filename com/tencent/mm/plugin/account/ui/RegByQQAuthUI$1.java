package com.tencent.mm.plugin.account.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.widget.EditText;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelsimple.s;
import com.tencent.mm.ui.base.h;

final class RegByQQAuthUI$1
  implements MenuItem.OnMenuItemClickListener
{
  RegByQQAuthUI$1(RegByQQAuthUI paramRegByQQAuthUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(125499);
    RegByQQAuthUI.a(this.gHj, RegByQQAuthUI.a(this.gHj).getText().toString().trim());
    if (RegByQQAuthUI.b(this.gHj).equals(""))
    {
      h.g(this.gHj, 2131304226, 2131296904);
      AppMethodBeat.o(125499);
    }
    while (true)
    {
      return true;
      s locals = new s("", RegByQQAuthUI.c(this.gHj), RegByQQAuthUI.b(this.gHj), RegByQQAuthUI.d(this.gHj), "", "", RegByQQAuthUI.e(this.gHj), 2);
      g.Rg().a(locals, 0);
      paramMenuItem = this.gHj;
      RegByQQAuthUI localRegByQQAuthUI = this.gHj;
      this.gHj.getString(2131297061);
      RegByQQAuthUI.a(paramMenuItem, h.b(localRegByQQAuthUI, this.gHj.getString(2131302326), true, new RegByQQAuthUI.1.1(this, locals)));
      AppMethodBeat.o(125499);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.ui.RegByQQAuthUI.1
 * JD-Core Version:    0.6.2
 */