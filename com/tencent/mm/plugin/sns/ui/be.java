package com.tencent.mm.plugin.sns.ui;

import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;

public final class be
{
  ListView nDp;
  int position;
  int rDM;
  int rDN;
  public int rDO;
  boolean rDP;
  int rDQ;
  protected long rDR;
  Runnable rDS;
  Runnable rDT;
  Runnable rDU;
  SnsCommentFooter rhq;
  public int rpW;
  int rro;

  public be(ListView paramListView, SnsCommentFooter paramSnsCommentFooter)
  {
    AppMethodBeat.i(39889);
    this.position = -1;
    this.rDM = -1;
    this.rDN = -1;
    this.rpW = -1;
    this.rDO = 0;
    this.rro = -1;
    this.rDP = false;
    this.rDS = new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(39886);
        if ((be.this.nDp != null) && (be.this.nDp.getCount() > be.this.position))
        {
          int i = be.this.rhq.getTop();
          ab.d("MicroMsg.TimeLineScrollAnimation", "limitCount: " + be.this.rDQ + " footerHeight:" + be.this.rhq.getHeight() + " listOriginalBottom: " + be.this.rpW);
          if ((be.a(be.this) > 0) && ((be.this.rro != i) || (i > be.this.rpW - 200) || (be.this.nDp.getBottom() > be.this.rpW - be.this.rhq.getHeight() - 150)))
          {
            j = 10;
            if (be.this.rDQ == 0)
              j = 200;
            new ak().postDelayed(this, j);
          }
          be.this.rro = i;
          int j = be.this.rro - be.this.rDO - be.this.rDM;
          ab.d("MicroMsg.TimeLineScrollAnimation", "itemH:" + be.this.rDM + " footerTop" + be.this.rro + " list.bottom:" + be.this.nDp.getBottom() + " position: " + be.this.position + " topselection: " + j);
          ab.d("MicroMsg.TimeLineScrollAnimation", "list.getTop(): " + be.this.nDp.getTop() + " marginTop: " + be.this.rDO + " footerTop " + be.this.rro);
          be.this.nDp.setSelectionFromTop(be.this.position + be.this.nDp.getHeaderViewsCount(), j);
        }
        AppMethodBeat.o(39886);
      }
    };
    this.rDT = new be.2(this);
    this.rDU = new Runnable()
    {
      public final void run()
      {
        AppMethodBeat.i(39888);
        ab.d("MicroMsg.TimeLineScrollAnimation", "originalTop:" + be.this.rDN + " position:" + be.this.position + " list.bottom:" + be.this.nDp.getBottom());
        AppMethodBeat.o(39888);
      }
    };
    this.nDp = paramListView;
    this.rhq = paramSnsCommentFooter;
    AppMethodBeat.o(39889);
  }

  public final void cuJ()
  {
    AppMethodBeat.i(39890);
    this.rDP = true;
    new ak().postDelayed(this.rDS, 30L);
    this.rDQ = 10;
    ab.e("MicroMsg.TimeLineScrollAnimation", "footerTop when up :" + this.rhq.getTop());
    this.rDR = bo.yz();
    AppMethodBeat.o(39890);
  }

  public final void cuK()
  {
    AppMethodBeat.i(39891);
    this.rDP = true;
    this.rDQ = 20;
    new ak().postDelayed(this.rDT, 100L);
    AppMethodBeat.o(39891);
  }

  public final void cuL()
  {
    AppMethodBeat.i(39892);
    if (!this.rDP)
      AppMethodBeat.o(39892);
    while (true)
    {
      return;
      this.rDP = false;
      new ak().postDelayed(this.rDU, 30L);
      this.rDQ = 10;
      AppMethodBeat.o(39892);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.be
 * JD-Core Version:    0.6.2
 */