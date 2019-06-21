package com.tencent.mm.plugin.aa.ui;

import android.view.MenuItem;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.n.d;

final class AAQueryListUI$4$2
  implements n.d
{
  AAQueryListUI$4$2(AAQueryListUI.4 param4)
  {
  }

  public final void onMMMenuItemSelected(MenuItem paramMenuItem, int paramInt)
  {
    AppMethodBeat.i(40732);
    switch (paramMenuItem.getItemId())
    {
    default:
    case 1:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(40732);
      while (true)
      {
        return;
        ab.i("MicroMsg.AAQueryListUI", "go to launch list: %d", new Object[] { Integer.valueOf(AAQueryListUI.e(this.gnu.gnt)) });
        if (AAQueryListUI.e(this.gnu.gnt) == 1)
        {
          AppMethodBeat.o(40732);
        }
        else
        {
          AAQueryListUI.a(this.gnu.gnt, 1);
          this.gnu.gnt.setMMTitle(2131296368);
          AAQueryListUI.f(this.gnu.gnt).mode = AAQueryListUI.e(this.gnu.gnt);
          AAQueryListUI.f(this.gnu.gnt).aot();
          AAQueryListUI.f(this.gnu.gnt).notifyDataSetChanged();
          AAQueryListUI.a(this.gnu.gnt, true, AAQueryListUI.e(this.gnu.gnt));
          AppMethodBeat.o(40732);
          continue;
          ab.i("MicroMsg.AAQueryListUI", "go to pay query list: %d", new Object[] { Integer.valueOf(AAQueryListUI.e(this.gnu.gnt)) });
          if (AAQueryListUI.e(this.gnu.gnt) != 2)
            break;
          AppMethodBeat.o(40732);
        }
      }
      this.gnu.gnt.setMMTitle(2131296371);
      AAQueryListUI.f(this.gnu.gnt).mode = AAQueryListUI.e(this.gnu.gnt);
      AAQueryListUI.f(this.gnu.gnt).aot();
      AAQueryListUI.f(this.gnu.gnt).notifyDataSetChanged();
      AAQueryListUI.a(this.gnu.gnt, 2);
      AAQueryListUI.a(this.gnu.gnt, true, AAQueryListUI.e(this.gnu.gnt));
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.ui.AAQueryListUI.4.2
 * JD-Core Version:    0.6.2
 */