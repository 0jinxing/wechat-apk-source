package com.tencent.mm.plugin.qqmail.ui;

import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.qqmail.stub.ReadMailProxy;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;

final class ReadMailUI$7
  implements View.OnClickListener
{
  ReadMailUI$7(ReadMailUI paramReadMailUI)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(68426);
    switch (ReadMailUI.w(this.pzZ))
    {
    default:
    case 0:
    case 1:
    case 2:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(68426);
      while (true)
      {
        return;
        ReadMailUI.a(this.pzZ, 2);
        if ((!bo.isNullOrNil(ReadMailUI.x(this.pzZ))) && (!bo.isNullOrNil(ReadMailUI.y(this.pzZ))))
        {
          ReadMailUI.z(this.pzZ);
          AppMethodBeat.o(68426);
        }
        else
        {
          ReadMailUI.A(this.pzZ);
          AppMethodBeat.o(68426);
          continue;
          ReadMailUI.a(this.pzZ, 1);
          int i = ((Integer)new ReadMailProxy(ReadMailUI.l(this.pzZ), null).REMOTE_CALL("removeDownloadQQMailAppTask", new Object[] { Long.valueOf(ReadMailUI.B(this.pzZ)) })).intValue();
          if (i == -1)
          {
            ab.e("MicroMsg.ReadMailUI", "cancel_download_task:fail_apilevel_too_low downloadId = %d", new Object[] { Long.valueOf(ReadMailUI.B(this.pzZ)) });
            AppMethodBeat.o(68426);
          }
          else if (i <= 0)
          {
            ab.e("MicroMsg.ReadMailUI", "cancel_download_task:fail downloadId = %d", new Object[] { Long.valueOf(ReadMailUI.B(this.pzZ)) });
            AppMethodBeat.o(68426);
          }
          else
          {
            ab.i("MicroMsg.ReadMailUI", "cancel_download_task:ok downloadId = %d", new Object[] { Long.valueOf(ReadMailUI.B(this.pzZ)) });
            ReadMailUI.C(this.pzZ).stopTimer();
            ReadMailUI.b(this.pzZ, 0);
            ReadMailUI.D(this.pzZ);
            ReadMailUI.p(this.pzZ);
            AppMethodBeat.o(68426);
            continue;
            ReadMailUI.a(this.pzZ, 3);
            ReadMailUI.E(this.pzZ);
            AppMethodBeat.o(68426);
          }
        }
      }
      ReadMailUI.a(this.pzZ, 4);
      ReadMailUI.F(this.pzZ);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.ui.ReadMailUI.7
 * JD-Core Version:    0.6.2
 */