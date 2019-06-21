package com.tencent.mm.plugin.masssend.ui;

import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.ui.base.p;

final class MassSendMsgUI$5$1
  implements Runnable
{
  MassSendMsgUI$5$1(MassSendMsgUI.5 param5, String paramString1, String paramString2, int paramInt)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(22828);
    if (MassSendMsgUI.a(this.opi.opf, this.chW, this.oph))
    {
      al.d(new MassSendMsgUI.5.1.1(this));
      AppMethodBeat.o(22828);
    }
    while (true)
    {
      return;
      al.d(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(22827);
          Toast.makeText(MassSendMsgUI.5.1.this.opi.opf, MassSendMsgUI.5.1.this.opi.opf.getString(2131304249), 0).show();
          if (MassSendMsgUI.e(MassSendMsgUI.5.1.this.opi.opf) != null)
          {
            MassSendMsgUI.e(MassSendMsgUI.5.1.this.opi.opf).dismiss();
            MassSendMsgUI.f(MassSendMsgUI.5.1.this.opi.opf);
          }
          AppMethodBeat.o(22827);
        }
      });
      AppMethodBeat.o(22828);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.masssend.ui.MassSendMsgUI.5.1
 * JD-Core Version:    0.6.2
 */