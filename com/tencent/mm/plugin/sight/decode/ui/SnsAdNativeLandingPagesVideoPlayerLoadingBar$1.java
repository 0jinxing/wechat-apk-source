package com.tencent.mm.plugin.sight.decode.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class SnsAdNativeLandingPagesVideoPlayerLoadingBar$1
  implements View.OnTouchListener
{
  SnsAdNativeLandingPagesVideoPlayerLoadingBar$1(SnsAdNativeLandingPagesVideoPlayerLoadingBar paramSnsAdNativeLandingPagesVideoPlayerLoadingBar)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(70291);
    if (paramMotionEvent.getAction() == 0)
    {
      ab.i("MicroMsg.SnsAdNativeLandingPagesVideoPlayerLoadingBar", "ontouch down");
      SnsAdNativeLandingPagesVideoPlayerLoadingBar.a(this.qyV, false);
      SnsAdNativeLandingPagesVideoPlayerLoadingBar.a(this.qyV, paramMotionEvent.getX());
      if (SnsAdNativeLandingPagesVideoPlayerLoadingBar.a(this.qyV) != null)
        SnsAdNativeLandingPagesVideoPlayerLoadingBar.a(this.qyV).aFw();
    }
    while (true)
    {
      AppMethodBeat.o(70291);
      return true;
      int i;
      if (paramMotionEvent.getAction() == 2)
      {
        float f = paramMotionEvent.getX();
        paramView = (FrameLayout.LayoutParams)SnsAdNativeLandingPagesVideoPlayerLoadingBar.b(this.qyV).getLayoutParams();
        i = paramView.leftMargin;
        int j = (int)(f - SnsAdNativeLandingPagesVideoPlayerLoadingBar.c(this.qyV));
        paramView.leftMargin = SnsAdNativeLandingPagesVideoPlayerLoadingBar.a(this.qyV, j + i);
        SnsAdNativeLandingPagesVideoPlayerLoadingBar.b(this.qyV).setLayoutParams(paramView);
        i = SnsAdNativeLandingPagesVideoPlayerLoadingBar.d(this.qyV);
        if (SnsAdNativeLandingPagesVideoPlayerLoadingBar.e(this.qyV) > 0)
        {
          paramView = (FrameLayout.LayoutParams)SnsAdNativeLandingPagesVideoPlayerLoadingBar.f(this.qyV).getLayoutParams();
          paramView.width = ((int)(i * 1.0D / SnsAdNativeLandingPagesVideoPlayerLoadingBar.e(this.qyV) * SnsAdNativeLandingPagesVideoPlayerLoadingBar.g(this.qyV)));
          SnsAdNativeLandingPagesVideoPlayerLoadingBar.f(this.qyV).setLayoutParams(paramView);
        }
        SnsAdNativeLandingPagesVideoPlayerLoadingBar.h(this.qyV).setText(SnsAdNativeLandingPagesVideoPlayerLoadingBar.oy(i / 60) + ":" + SnsAdNativeLandingPagesVideoPlayerLoadingBar.oy(i % 60));
        SnsAdNativeLandingPagesVideoPlayerLoadingBar.a(this.qyV, true);
      }
      else if (SnsAdNativeLandingPagesVideoPlayerLoadingBar.i(this.qyV))
      {
        i = SnsAdNativeLandingPagesVideoPlayerLoadingBar.d(this.qyV);
        if (SnsAdNativeLandingPagesVideoPlayerLoadingBar.a(this.qyV) != null)
        {
          ab.i("MicroMsg.SnsAdNativeLandingPagesVideoPlayerLoadingBar", "current time : ".concat(String.valueOf(i)));
          SnsAdNativeLandingPagesVideoPlayerLoadingBar.a(this.qyV).oA(i);
        }
        SnsAdNativeLandingPagesVideoPlayerLoadingBar.a(this.qyV, false);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.decode.ui.SnsAdNativeLandingPagesVideoPlayerLoadingBar.1
 * JD-Core Version:    0.6.2
 */