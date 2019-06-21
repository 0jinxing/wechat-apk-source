package com.tencent.mm.plugin.location.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bg.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.bo;

final class k$7
  implements View.OnTouchListener
{
  k$7(k paramk)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(113537);
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    case 2:
    case 1:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(113537);
      return false;
      this.nNE.nNt = true;
      this.nNE.nNo.setVisibility(0);
      this.nNE.nNn.reset();
      paramView = this.nNE.nNn;
      if (!paramView.nOg)
      {
        paramView.fAA = true;
        paramView.bKh();
      }
      this.nNE.nNm.setPressed(true);
      if (this.nNE.nNt)
      {
        ay.a(ah.getContext(), 2131304021, new k.7.1(this));
        this.nNE.nNu = 1;
        ab.i("MicroMsg.TalkMgr", "micBtn pressed down");
        this.nNE.nNw = bo.yz();
        this.nNE.nNA.akz();
        this.nNE.bKa();
        continue;
        if (this.nNE.nNt)
        {
          continue;
          this.nNE.nNm.setPressed(false);
          this.nNE.nNo.setVisibility(8);
          this.nNE.nNn.reset();
          this.nNE.nNn.fAA = false;
          if (this.nNE.nNt)
          {
            this.nNE.nNt = false;
            if (this.nNE.nNu == 5)
            {
              ab.i("MicroMsg.TalkMgr", "cancel during seize-success prepare time");
              this.nNE.nNx.stopTimer();
              this.nNE.nNy.stopTimer();
            }
            this.nNE.nNu = 0;
            this.nNE.nNC.stopTimer();
            this.nNE.nNA.akA();
            ay.au(ah.getContext(), 2131304024);
            this.nNE.bKa();
            if (this.nNE.nNB != null)
              this.nNE.nNB.bJW();
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.k.7
 * JD-Core Version:    0.6.2
 */