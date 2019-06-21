package com.tencent.mm.plugin.mmsight.ui.progressbar;

import android.animation.ValueAnimator;
import android.os.Looper;
import android.os.Message;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.List;

final class MMSightProgressBar$1 extends ak
{
  MMSightProgressBar$1(MMSightProgressBar paramMMSightProgressBar, Looper paramLooper)
  {
    super(paramLooper);
  }

  public final void handleMessage(Message paramMessage)
  {
    AppMethodBeat.i(55335);
    if ((paramMessage.what == 233) && (MMSightProgressBar.a(this.oDO)) && (MMSightProgressBar.b(this.oDO).size() > 0) && (MMSightProgressBar.b(this.oDO).size() < 5))
    {
      a locala = (a)MMSightProgressBar.b(this.oDO).get(MMSightProgressBar.b(this.oDO).size() - 1);
      int i = MMSightProgressBar.bvK()[MMSightProgressBar.b(this.oDO).size()];
      paramMessage = new a(MMSightProgressBar.b(this.oDO).size(), MMSightProgressBar.c(this.oDO), MMSightProgressBar.d(this.oDO), i);
      MMSightProgressBar.a(this.oDO, new b(locala, paramMessage, new MMSightProgressBar.1.1(this)));
      paramMessage = MMSightProgressBar.g(this.oDO);
      paramMessage.jcQ = ValueAnimator.ofFloat(new float[] { 0.0F, 100.0F });
      paramMessage.jcQ.addUpdateListener(new b.1(paramMessage));
      paramMessage.jcQ.addListener(new b.2(paramMessage));
      paramMessage.jcQ.setInterpolator(new AccelerateDecelerateInterpolator());
      paramMessage.jcQ.setDuration(2000L);
      paramMessage.jcQ.start();
    }
    AppMethodBeat.o(55335);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.progressbar.MMSightProgressBar.1
 * JD-Core Version:    0.6.2
 */