package com.tencent.mm.plugin.sns.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;

final class ac$6
  implements Runnable
{
  ac$6(ac paramac)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(38344);
    ab.i("MicroMsg.SightWidget", "showProgress");
    ac localac = this.rkS;
    MMActivity localMMActivity = this.rkS.crP;
    this.rkS.crP.getString(2131297061);
    localac.ehJ = h.b(localMMActivity, this.rkS.crP.getString(2131303775), false, new ac.6.1(this));
    AppMethodBeat.o(38344);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.ac.6
 * JD-Core Version:    0.6.2
 */