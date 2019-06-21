package com.tencent.mm.plugin.sns.ui;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.ou;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.ui.base.h;

final class SnsTimeLineUI$24
  implements Runnable
{
  SnsTimeLineUI$24(SnsTimeLineUI paramSnsTimeLineUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(39492);
    h.d(this.rzs, this.rzs.getString(2131301806), "", this.rzs.getString(2131301807), this.rzs.getString(2131296868), new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        AppMethodBeat.i(39490);
        paramAnonymousDialogInterface = new ou();
        a.xxA.m(paramAnonymousDialogInterface);
        AppMethodBeat.o(39490);
      }
    }
    , new SnsTimeLineUI.24.2(this));
    AppMethodBeat.o(39492);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsTimeLineUI.24
 * JD-Core Version:    0.6.2
 */