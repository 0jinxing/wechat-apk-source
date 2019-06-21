package com.tencent.mm.pluginsdk.ui.tools;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.sight.decode.ui.b;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.sdk.platformtools.ab;

final class VideoPlayerSeekBar$1
  implements View.OnTouchListener
{
  VideoPlayerSeekBar$1(VideoPlayerSeekBar paramVideoPlayerSeekBar)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(117962);
    if (paramMotionEvent.getAction() == 0)
    {
      ab.i("MicroMsg.VideoPlayerSeekBar", "ontouch down");
      VideoPlayerSeekBar.a(this.vvo);
      VideoPlayerSeekBar.a(this.vvo, paramMotionEvent.getX());
      if (VideoPlayerSeekBar.b(this.vvo) != null)
        VideoPlayerSeekBar.c(this.vvo).aFw();
    }
    while (true)
    {
      AppMethodBeat.o(117962);
      return true;
      int i;
      if (paramMotionEvent.getAction() == 2)
      {
        float f = paramMotionEvent.getX();
        paramMotionEvent = (FrameLayout.LayoutParams)VideoPlayerSeekBar.d(this.vvo).getLayoutParams();
        paramView = this.vvo;
        i = paramMotionEvent.leftMargin;
        int j = VideoPlayerSeekBar.a(paramView, (int)(f - VideoPlayerSeekBar.e(this.vvo)) + i, VideoPlayerSeekBar.f(this.vvo));
        paramMotionEvent.leftMargin = j;
        VideoPlayerSeekBar.g(this.vvo).setLayoutParams(paramMotionEvent);
        i = VideoPlayerSeekBar.f(this.vvo).value;
        if (VideoPlayerSeekBar.h(this.vvo) > 0)
        {
          paramView = (FrameLayout.LayoutParams)VideoPlayerSeekBar.i(this.vvo).getLayoutParams();
          paramView.width = j;
          VideoPlayerSeekBar.j(this.vvo).setLayoutParams(paramView);
        }
        VideoPlayerSeekBar.k(this.vvo).setText(VideoPlayerSeekBar.oy(i / 60) + ":" + VideoPlayerSeekBar.oy(i % 60));
        VideoPlayerSeekBar.l(this.vvo);
      }
      else
      {
        i = VideoPlayerSeekBar.m(this.vvo);
        if (VideoPlayerSeekBar.n(this.vvo))
          i = VideoPlayerSeekBar.a(this.vvo, VideoPlayerSeekBar.f(this.vvo).value);
        if (VideoPlayerSeekBar.o(this.vvo) != null)
        {
          ab.i("MicroMsg.VideoPlayerSeekBar", "current time : ".concat(String.valueOf(i)));
          VideoPlayerSeekBar.p(this.vvo).oA(i);
        }
        VideoPlayerSeekBar.q(this.vvo);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.VideoPlayerSeekBar.1
 * JD-Core Version:    0.6.2
 */