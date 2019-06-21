package com.tencent.mm.plugin.sns.ui;

import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;

final class SnsTagDetailUI$5
  implements MenuItem.OnMenuItemClickListener
{
  SnsTagDetailUI$5(SnsTagDetailUI paramSnsTagDetailUI)
  {
  }

  public final boolean onMenuItemClick(MenuItem paramMenuItem)
  {
    AppMethodBeat.i(39348);
    if (((this.rxD.rxA + " " + bo.c(this.rxD.kPL, ",")).equals(this.rxD.cvZ)) && (this.rxD.qJQ != 0L))
    {
      this.rxD.finish();
      AppMethodBeat.o(39348);
    }
    while (true)
    {
      return true;
      h.a(this.rxD, 2131303785, 2131297061, new SnsTagDetailUI.5.1(this), null);
      AppMethodBeat.o(39348);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsTagDetailUI.5
 * JD-Core Version:    0.6.2
 */