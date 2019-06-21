package com.tencent.mm.plugin.scanner.ui;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class i$3
  implements View.OnTouchListener
{
  private float qey;
  private float qez = 400.0F;

  i$3(i parami)
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(81156);
    int i = paramMotionEvent.getActionMasked();
    int j = paramMotionEvent.getActionIndex();
    ab.d("MicroMsg.scanner.ScanMode", "pointIndex:%d", new Object[] { Integer.valueOf(j) });
    switch (i)
    {
    case 3:
    case 4:
    default:
    case 0:
    case 5:
    case 1:
    case 6:
    case 2:
    }
    float f;
    do
    {
      do
        while (true)
        {
          this.qex.lCs.onTouchEvent(paramMotionEvent);
          AppMethodBeat.o(81156);
          return true;
          ab.d("MicroMsg.scanner.ScanMode", "first down,pointer:%d,x:%f,y:%f", new Object[] { Integer.valueOf(j), Float.valueOf(paramMotionEvent.getX()), Float.valueOf(paramMotionEvent.getY()) });
          continue;
          ab.d("MicroMsg.scanner.ScanMode", "down,pointer:%d,x:%f,y:%f", new Object[] { Integer.valueOf(j), Float.valueOf(paramMotionEvent.getX(j)), Float.valueOf(paramMotionEvent.getY(j)) });
          if (paramMotionEvent.getPointerCount() == 2)
          {
            this.qey = ((float)(Math.pow(paramMotionEvent.getX(0) - paramMotionEvent.getX(1), 2.0D) + Math.pow(paramMotionEvent.getY(0) - paramMotionEvent.getY(1), 2.0D)));
            continue;
            ab.d("MicroMsg.scanner.ScanMode", "last up,pointer:%d,x:%f,y:%f", new Object[] { Integer.valueOf(j), Float.valueOf(paramMotionEvent.getX()), Float.valueOf(paramMotionEvent.getY()) });
            if (paramMotionEvent.getPointerCount() == 2)
            {
              this.qey = ((float)(Math.pow(paramMotionEvent.getX(0) - paramMotionEvent.getX(1), 2.0D) + Math.pow(paramMotionEvent.getY(0) - paramMotionEvent.getY(1), 2.0D)));
              continue;
              ab.d("MicroMsg.scanner.ScanMode", "up,pointer:%d,x:%f,y:%f", new Object[] { Integer.valueOf(j), Float.valueOf(paramMotionEvent.getX(j)), Float.valueOf(paramMotionEvent.getY(j)) });
              if (paramMotionEvent.getPointerCount() == 2)
                this.qey = ((float)(Math.pow(paramMotionEvent.getX(0) - paramMotionEvent.getX(1), 2.0D) + Math.pow(paramMotionEvent.getY(0) - paramMotionEvent.getY(1), 2.0D)));
            }
          }
        }
      while (paramMotionEvent.getPointerCount() != 2);
      ab.d("MicroMsg.scanner.ScanMode", "move,pointer:0,x:%f,y:%f", new Object[] { Float.valueOf(paramMotionEvent.getX(0)), Float.valueOf(paramMotionEvent.getY(0)) });
      ab.d("MicroMsg.scanner.ScanMode", "move,pointer:1,x:%f,y:%f", new Object[] { Float.valueOf(paramMotionEvent.getX(1)), Float.valueOf(paramMotionEvent.getY(1)) });
      f = (float)(Math.pow(paramMotionEvent.getX(0) - paramMotionEvent.getX(1), 2.0D) + Math.pow(paramMotionEvent.getY(0) - paramMotionEvent.getY(1), 2.0D));
      ab.d("MicroMsg.scanner.ScanMode", "distance:%f,lastDistance:%f,min move:%f", new Object[] { Float.valueOf(f), Float.valueOf(this.qey), Float.valueOf(this.qez) });
    }
    while (Math.abs(f - this.qey) <= this.qez);
    if (this.qex.qev)
      this.qex.qev = false;
    if (f - this.qey > 0.0F)
      this.qex.qet.ah(2, 2, 100);
    while (true)
    {
      this.qey = f;
      break;
      this.qex.qet.ah(3, 2, 100);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.i.3
 * JD-Core Version:    0.6.2
 */