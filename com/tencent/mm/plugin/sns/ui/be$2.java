package com.tencent.mm.plugin.sns.ui;

import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

final class be$2
  implements Runnable
{
  int offset = 0;

  be$2(be parambe)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(39887);
    int i;
    if ((this.rDV.nDp != null) && (this.rDV.nDp.getCount() > this.rDV.position))
    {
      this.rDV.rro = this.rDV.rhq.getTop();
      i = this.rDV.rro - this.rDV.rDO - this.rDV.rDM;
      ab.d("MicroMsg.TimeLineScrollAnimation", "itemH:" + this.rDV.rDM + " footerTop" + this.rDV.rro + " list.bottom:" + this.rDV.nDp.getBottom() + " position: " + this.rDV.position + " topselection: " + i);
      ab.d("MicroMsg.TimeLineScrollAnimation", "list.getTop(): " + this.rDV.nDp.getTop() + " marginTop: " + this.rDV.rDO + " footerTop " + this.rDV.rro);
      if (i == this.offset)
      {
        this.rDV.nDp.setSelectionFromTop(this.rDV.position + this.rDV.nDp.getHeaderViewsCount(), i);
        this.offset = 0;
        this.rDV.rDQ = 0;
        AppMethodBeat.o(39887);
      }
    }
    while (true)
    {
      return;
      if (be.a(this.rDV) > 0)
      {
        new ak().postDelayed(this, 100L);
        this.offset = i;
        AppMethodBeat.o(39887);
      }
      else
      {
        this.offset = 0;
        this.rDV.rDQ = 0;
        AppMethodBeat.o(39887);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.be.2
 * JD-Core Version:    0.6.2
 */