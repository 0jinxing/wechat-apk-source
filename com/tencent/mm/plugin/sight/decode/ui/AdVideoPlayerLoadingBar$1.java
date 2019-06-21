package com.tencent.mm.plugin.sight.decode.ui;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class AdVideoPlayerLoadingBar$1
  implements View.OnTouchListener
{
  AdVideoPlayerLoadingBar$1(AdVideoPlayerLoadingBar paramAdVideoPlayerLoadingBar)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(117915);
    if (paramMotionEvent.getAction() == 0)
    {
      ab.i("MicroMsg.VideoPlayerLoadingBar", "ontouch down");
      this.qyz.hOy = false;
      this.qyz.qyu = paramMotionEvent.getX();
      if (this.qyz.qyk != null)
        this.qyz.qyk.aFw();
    }
    while (true)
    {
      AppMethodBeat.o(117915);
      return true;
      int i;
      if (paramMotionEvent.getAction() == 2)
      {
        float f = paramMotionEvent.getX();
        paramView = (FrameLayout.LayoutParams)this.qyz.qyn.getLayoutParams();
        i = paramView.leftMargin;
        int j = (int)(f - this.qyz.qyu);
        paramView.leftMargin = AdVideoPlayerLoadingBar.a(this.qyz, j + i);
        this.qyz.qyn.setLayoutParams(paramView);
        i = this.qyz.getCurrentTimeByBarPoint();
        if (this.qyz.qyr > 0)
        {
          paramView = (FrameLayout.LayoutParams)this.qyz.qyl.getLayoutParams();
          paramView.width = ((int)(i * 1.0D / this.qyz.qyr * this.qyz.getBarLen()));
          this.qyz.qyl.setLayoutParams(paramView);
        }
        this.qyz.qyp.setText(AdVideoPlayerLoadingBar.oy(i / 60) + ":" + AdVideoPlayerLoadingBar.oy(i % 60));
        this.qyz.hOy = true;
      }
      else if (this.qyz.hOy)
      {
        i = this.qyz.getCurrentTimeByBarPoint();
        if (this.qyz.qyk != null)
        {
          ab.i("MicroMsg.VideoPlayerLoadingBar", "current time : ".concat(String.valueOf(i)));
          this.qyz.qyk.oA(i);
        }
        this.qyz.hOy = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sight.decode.ui.AdVideoPlayerLoadingBar.1
 * JD-Core Version:    0.6.2
 */