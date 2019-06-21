package com.tencent.mm.plugin.luckymoney.ui;

import android.view.MotionEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.scaledLayout.a;

final class LuckyMoneyPickEnvelopeUI$8
  implements LuckyMoneyEnvelopeTouchRecyclerView.a
{
  LuckyMoneyPickEnvelopeUI$8(LuckyMoneyPickEnvelopeUI paramLuckyMoneyPickEnvelopeUI)
  {
  }

  public final boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(42908);
    if (paramMotionEvent.getAction() == 0)
    {
      paramMotionEvent = this.ogX;
      LuckyMoneyPickEnvelopeUI.d(this.ogX);
      LuckyMoneyPickEnvelopeUI.a(paramMotionEvent, a.h(LuckyMoneyPickEnvelopeUI.c(this.ogX)));
      LuckyMoneyPickEnvelopeUI.d(this.ogX).oaV = LuckyMoneyPickEnvelopeUI.e(this.ogX);
    }
    AppMethodBeat.o(42908);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI.8
 * JD-Core Version:    0.6.2
 */