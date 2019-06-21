package com.tencent.mm.plugin.mmsight.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.wcdb.support.Log;

public class MMSightCaptureTouchView extends RelativeLayout
{
  private float gMs;
  private int gMt;
  private GestureDetector lCs;
  private long oAE;
  private MMSightCaptureTouchView.a oAF;

  public MMSightCaptureTouchView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public MMSightCaptureTouchView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(55076);
    this.oAE = 0L;
    this.gMs = -1.0F;
    this.gMt = 0;
    this.lCs = new GestureDetector(getContext(), new MMSightCaptureTouchView.1(this));
    this.lCs.setIsLongpressEnabled(false);
    AppMethodBeat.o(55076);
  }

  private float x(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(55078);
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
        AppMethodBeat.o(55078);
        return f2;
      }
    }
    catch (Exception paramMotionEvent)
    {
      while (true)
      {
        Log.e("MicroMsg.MMSightCaptureTouchView", "pointerDistance error: %s", new Object[] { paramMotionEvent.getMessage() });
        float f2 = 0.0F;
        AppMethodBeat.o(55078);
      }
    }
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(55077);
    this.lCs.onTouchEvent(paramMotionEvent);
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
            AppMethodBeat.o(55077);
            return true;
            Log.d("MicroMsg.MMSightCaptureTouchView", "ACTION_DOWN");
            this.gMs = -1.0F;
            this.gMt += 1;
            continue;
            Log.d("MicroMsg.MMSightCaptureTouchView", "ACTION_POINTER_DOWN");
            this.gMt += 1;
            continue;
            Log.d("MicroMsg.MMSightCaptureTouchView", "ACTION_POINTER_UP");
            this.gMt -= 1;
            continue;
            Log.d("MicroMsg.MMSightCaptureTouchView", "ACTION_UP");
            this.gMs = -1.0F;
            this.gMt = 0;
          }
        while (this.gMt < 2);
        f = x(paramMotionEvent);
        Log.v("MicroMsg.MMSightCaptureTouchView", "distance: %s", new Object[] { Float.valueOf(f) });
      }
      while (f <= 0.0F);
      if (this.gMs <= 0.0F)
        break;
    }
    while (Math.abs(f - this.gMs) <= 15.0F);
    if (f > this.gMs)
    {
      Log.d("MicroMsg.MMSightCaptureTouchView", "zoom out");
      if (this.oAF != null)
        this.oAF.asx();
    }
    while (true)
    {
      this.gMs = f;
      break;
      Log.d("MicroMsg.MMSightCaptureTouchView", "zoom in");
      if (this.oAF != null)
        this.oAF.asy();
    }
  }

  public void setTouchCallback(MMSightCaptureTouchView.a parama)
  {
    this.oAF = parama;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.mmsight.ui.MMSightCaptureTouchView
 * JD-Core Version:    0.6.2
 */