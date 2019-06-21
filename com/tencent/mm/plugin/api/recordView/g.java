package com.tencent.mm.plugin.api.recordView;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class g
  implements View.OnTouchListener
{
  private long gMr = -1L;
  private float gMs = -1.0F;
  private int gMt = 0;
  g.a gMu;

  private float x(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(76385);
    try
    {
      if (this.gMt >= 2)
      {
        float f1 = paramMotionEvent.getX(0);
        f2 = paramMotionEvent.getY(0);
        float f3 = paramMotionEvent.getX(1);
        float f4 = paramMotionEvent.getY(1);
        f3 = Math.abs(f1 - f3);
        f2 = Math.abs(f2 - f4);
        f2 = f3 + f2;
        AppMethodBeat.o(76385);
        return f2;
      }
    }
    catch (Exception paramMotionEvent)
    {
      while (true)
      {
        ab.e("MicroMsg.MMSightRecordViewTouchListener", "pointerDistance error: %s", new Object[] { paramMotionEvent.getMessage() });
        float f2 = 0.0F;
        AppMethodBeat.o(76385);
      }
    }
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(76384);
    switch (paramMotionEvent.getAction() & 0xFF)
    {
    case 3:
    case 4:
    default:
    case 0:
    case 5:
    case 6:
    case 1:
    case 2:
    }
    float f;
    do
    {
      do
      {
        do
          while (true)
          {
            AppMethodBeat.o(76384);
            return true;
            ab.d("MicroMsg.MMSightRecordViewTouchListener", "ACTION_DOWN");
            if ((this.gMr > 0L) && (SystemClock.elapsedRealtime() - this.gMr < 400L))
              if (this.gMu == null);
            while (true)
            {
              this.gMr = SystemClock.elapsedRealtime();
              this.gMs = -1.0F;
              this.gMt += 1;
              break;
              if (this.gMu != null)
              {
                paramView = this.gMu;
                paramMotionEvent.getX();
                paramMotionEvent.getY();
                paramView.asw();
              }
            }
            ab.d("MicroMsg.MMSightRecordViewTouchListener", "ACTION_POINTER_DOWN");
            this.gMt += 1;
            continue;
            ab.d("MicroMsg.MMSightRecordViewTouchListener", "ACTION_POINTER_UP");
            this.gMt -= 1;
            continue;
            ab.d("MicroMsg.MMSightRecordViewTouchListener", "ACTION_UP");
            this.gMs = -1.0F;
            this.gMt = 0;
          }
        while (this.gMt < 2);
        f = x(paramMotionEvent);
        ab.v("MicroMsg.MMSightRecordViewTouchListener", "distance: %s", new Object[] { Float.valueOf(f) });
      }
      while (f <= 0.0F);
      if (this.gMs <= 0.0F)
        break;
    }
    while (Math.abs(f - this.gMs) <= 15.0F);
    if (f > this.gMs)
    {
      ab.d("MicroMsg.MMSightRecordViewTouchListener", "zoom out");
      if (this.gMu != null)
        this.gMu.asx();
    }
    while (true)
    {
      this.gMs = f;
      break;
      ab.d("MicroMsg.MMSightRecordViewTouchListener", "zoom in");
      if (this.gMu != null)
        this.gMu.asy();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.api.recordView.g
 * JD-Core Version:    0.6.2
 */