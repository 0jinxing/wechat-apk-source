package com.tencent.mm.plugin.voiceprint.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.voiceprint.model.p;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.bo;

final class BaseVoicePrintUI$10
  implements View.OnTouchListener
{
  private long nOa = 0L;
  private boolean sLX = false;

  BaseVoicePrintUI$10(BaseVoicePrintUI paramBaseVoicePrintUI)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(26140);
    switch (paramMotionEvent.getAction())
    {
    case 2:
    default:
    case 0:
    case 1:
    case 3:
    }
    while (true)
    {
      AppMethodBeat.o(26140);
      return false;
      BaseVoicePrintUI.a(this.sLV, false);
      if (!bo.isNullOrNil(this.sLV.sLs))
      {
        this.nOa = System.currentTimeMillis();
        BaseVoicePrintUI.f(this.sLV).setPressed(true);
        BaseVoicePrintUI.l(this.sLV);
        this.sLV.cHS();
        BaseVoicePrintUI.m(this.sLV).sendEmptyMessageDelayed(1, 300L);
        ab.i("MicroMsg.BaseVoicePrintUI", "mic press down");
        continue;
        BaseVoicePrintUI.f(this.sLV).setPressed(false);
        BaseVoicePrintUI.m(this.sLV).removeMessages(1);
        if (System.currentTimeMillis() - this.nOa < 300L)
        {
          ab.d("MicroMsg.BaseVoicePrintUI", "just little touch the button, set touchDown to false");
          BaseVoicePrintUI.a(this.sLV, false);
        }
        while (true)
        {
          ab.i("MicroMsg.BaseVoicePrintUI", "mic press up %d, hasTouchDown:%b", new Object[] { Integer.valueOf(paramMotionEvent.getAction()), Boolean.valueOf(BaseVoicePrintUI.n(this.sLV)) });
          BaseVoicePrintUI.g(this.sLV).stop();
          BaseVoicePrintUI.e(this.sLV).stopTimer();
          BaseVoicePrintUI.a(this.sLV).EH();
          if (BaseVoicePrintUI.n(this.sLV))
            break label293;
          BaseVoicePrintUI.c(this.sLV).setErr(2131304297);
          BaseVoicePrintUI.c(this.sLV).cIg();
          break;
          BaseVoicePrintUI.a(this.sLV, true);
        }
        label293: paramView = this.sLV;
        ab.d("MicroMsg.BaseVoicePrintUI", "releaseMic");
        if (!paramView.sLN.sLD)
        {
          paramView.sLT.stopTimer();
          paramView.sLM.setErr(2131304297);
          paramView.sLM.cIg();
          paramView.sLO = null;
        }
        paramView.sLK.setVisibility(8);
        paramView.sLM.cIe();
        paramView.sLM.setTipText(paramView.sLs);
        ab.d("MicroMsg.BaseVoicePrintUI", "localMsgFileName %s", new Object[] { BaseVoicePrintUI.d(this.sLV) });
        if (!bo.isNullOrNil(BaseVoicePrintUI.d(this.sLV)))
          this.sLV.cHU();
        this.nOa = 0L;
        this.sLX = false;
        BaseVoicePrintUI.a(this.sLV, false);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voiceprint.ui.BaseVoicePrintUI.10
 * JD-Core Version:    0.6.2
 */