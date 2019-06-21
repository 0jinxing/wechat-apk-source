package com.tencent.xweb.extension.video;

import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class d$4
  implements Runnable
{
  d$4(d paramd, double paramDouble, double[] paramArrayOfDouble)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(84578);
    c localc = d.l(this.AOs);
    double d1 = this.AOw;
    Object localObject = this.AOx;
    double d2 = 0.0D;
    int i = 0;
    while (i < localObject.length)
    {
      double d3 = d2;
      if (localObject.length > i + 1)
      {
        d3 = d2;
        if (localObject[i] / d1 * 100.0D <= localc.Yn)
        {
          d3 = d2;
          if (localObject[(i + 1)] / d1 * 100.0D > localc.Yn)
            d3 = localObject[(i + 1)] / d1 * 100.0D;
        }
      }
      i += 2;
      d2 = d3;
    }
    localObject = (FrameLayout.LayoutParams)localc.hZC.getLayoutParams();
    ((FrameLayout.LayoutParams)localObject).width = ((int)(d2 / 100.0D * localc.qym.getWidth()));
    localc.hZC.setLayoutParams((ViewGroup.LayoutParams)localObject);
    localc.hZC.requestLayout();
    AppMethodBeat.o(84578);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.xweb.extension.video.d.4
 * JD-Core Version:    0.6.2
 */