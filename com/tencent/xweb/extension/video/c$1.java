package com.tencent.xweb.extension.video;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class c$1
  implements View.OnTouchListener
{
  c$1(c paramc)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    float f1 = 0.0F;
    AppMethodBeat.i(84564);
    if (paramMotionEvent.getAction() == 0)
    {
      this.ANv.ANt = false;
      this.ANv.ztc = paramMotionEvent.getX();
      if (this.ANv.ANs != null)
        this.ANv.ANs.aFw();
      AppMethodBeat.o(84564);
      return true;
    }
    float f2;
    if (paramMotionEvent.getAction() == 2)
    {
      f2 = paramMotionEvent.getX();
      float f3 = this.ANv.qyl.getWidth();
      f2 = (int)(f2 - this.ANv.ztc + f3);
      if (f2 >= 0.0F);
    }
    while (true)
    {
      this.ANv.ANu = (f1 * 100.0F / this.ANv.qym.getWidth());
      this.ANv.c(this.ANv.ANu, true);
      if (this.ANv.ANs != null)
        this.ANv.ANs.aFw();
      this.ANv.ANt = true;
      break;
      if (f2 > this.ANv.qym.getWidth())
      {
        f1 = this.ANv.qym.getWidth();
        continue;
        if ((this.ANv.ANt) && (this.ANv.ANs != null))
          this.ANv.ANs.bw(this.ANv.ANu);
        this.ANv.ANt = false;
        break;
      }
      f1 = f2;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.extension.video.c.1
 * JD-Core Version:    0.6.2
 */