package com.tencent.mm.ui.base;

import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import java.lang.ref.WeakReference;

public final class MMViewPager$k extends ak
{
  long mSL;
  WeakReference<MMViewPager> yyI;

  public MMViewPager$k(WeakReference<MMViewPager> paramWeakReference)
  {
    this.yyI = paramWeakReference;
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(106920);
    super.handleMessage(paramMessage);
    removeMessages(paramMessage.what);
    MMViewPager localMMViewPager;
    if (this.yyI != null)
    {
      localMMViewPager = (MMViewPager)this.yyI.get();
      if ((localMMViewPager != null) && (paramMessage.what == 1))
        if ((MMViewPager.v(localMMViewPager) != null) && (!MMViewPager.v(localMMViewPager).bCR()))
        {
          MMViewPager.v(localMMViewPager).play();
          sendEmptyMessageDelayed(paramMessage.what, this.mSL);
          AppMethodBeat.o(106920);
        }
    }
    while (true)
    {
      return;
      MMViewPager.w(localMMViewPager);
      AppMethodBeat.o(106920);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMViewPager.k
 * JD-Core Version:    0.6.2
 */