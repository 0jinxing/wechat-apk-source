package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sns.model.af;
import com.tencent.mm.plugin.sns.storage.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.p.a;

final class SnsMsgUI$15
  implements p.a
{
  SnsMsgUI$15(SnsMsgUI paramSnsMsgUI)
  {
  }

  public final void apt()
  {
    AppMethodBeat.i(39081);
    ab.v("MicroMsg.SnsMsgUI", "total count:" + SnsMsgUI.e(this.rub).enb + " unread:" + af.cnK().baS() + "  showcount:" + SnsMsgUI.e(this.rub).kmW);
    if (SnsMsgUI.e(this.rub).getCount() == 0)
    {
      SnsMsgUI.c(this.rub).setVisibility(8);
      SnsMsgUI.d(this.rub).setVisibility(0);
      this.rub.enableOptionMenu(false);
    }
    while (true)
    {
      if (((SnsMsgUI.e(this.rub).bdn()) && (af.cnK().baS() == 0)) || (af.cnK().baS() == af.cnK().cqG()))
        SnsMsgUI.f(this.rub).setVisibility(8);
      AppMethodBeat.o(39081);
      return;
      SnsMsgUI.c(this.rub).setVisibility(0);
      SnsMsgUI.d(this.rub).setVisibility(8);
      this.rub.enableOptionMenu(true);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsMsgUI.15
 * JD-Core Version:    0.6.2
 */