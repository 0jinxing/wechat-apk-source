package com.tencent.mm.plugin.masssend.ui;

import android.content.res.Resources;
import android.widget.Toast;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.ui.chat.ChatFooter;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.bo;

final class b$4
  implements ap.a
{
  b$4(b paramb)
  {
  }

  public final boolean BI()
  {
    boolean bool = false;
    AppMethodBeat.i(22770);
    if (this.ooz.miD == -1L)
      this.ooz.miD = bo.yz();
    long l = bo.az(this.ooz.miD);
    int i;
    if ((l >= 50000L) && (l <= 60000L))
    {
      if (this.ooz.miE == null)
      {
        i = (int)((60000L - l) / 1000L);
        this.ooz.miE = Toast.makeText(this.ooz.ooq, this.ooz.ooq.getResources().getQuantityString(2131361794, i, new Object[] { Integer.valueOf(i) }), 0);
        this.ooz.miE.show();
      }
    }
    else
    {
      if (l < 60000L)
        break label257;
      ab.v("MicroMsg.MassSendFooterEventImpl", "record stop on countdown");
      if (this.ooz.oos.EH())
        this.ooz.bNH();
      this.ooz.oor.bvH();
      ay.au(this.ooz.ooq, 2131304062);
      AppMethodBeat.o(22770);
    }
    while (true)
    {
      return bool;
      i = (int)((60000L - l) / 1000L);
      this.ooz.miE.setText(this.ooz.ooq.getResources().getQuantityString(2131361794, i, new Object[] { Integer.valueOf(i) }));
      break;
      label257: AppMethodBeat.o(22770);
      bool = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.masssend.ui.b.4
 * JD-Core Version:    0.6.2
 */