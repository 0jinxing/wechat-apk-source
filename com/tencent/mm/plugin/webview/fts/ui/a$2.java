package com.tencent.mm.plugin.webview.fts.ui;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a$2 extends GestureDetector.SimpleOnGestureListener
{
  a$2(a parama)
  {
  }

  public final boolean onDoubleTap(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(5817);
    this.ugI.iaw.removeCallbacks(this.ugI.iaD);
    this.ugI.ugH.aFj();
    AppMethodBeat.o(5817);
    return true;
  }

  public final boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    float f1 = 1.0F;
    float f2 = 0.0F;
    AppMethodBeat.i(5818);
    if ((paramMotionEvent1 == null) || (paramMotionEvent2 == null))
    {
      AppMethodBeat.o(5818);
      return true;
    }
    if (this.ugI.ugG == a.a.ugJ)
    {
      if (Math.abs(paramFloat1) <= Math.abs(paramFloat2))
        break label161;
      this.ugI.ugG = a.a.ugM;
    }
    while (true)
    {
      float f3 = paramMotionEvent2.getX();
      paramFloat1 = paramMotionEvent1.getX();
      paramFloat2 = paramMotionEvent2.getY() - paramMotionEvent1.getY();
      paramMotionEvent1 = this.ugI;
      if (paramMotionEvent1.ugG != a.a.ugM)
        break label208;
      if (paramMotionEvent1.iaB == -1)
      {
        paramMotionEvent1.ugH.aFk();
        paramMotionEvent1.iaB = paramMotionEvent1.ugH.getCurrentPosition();
      }
      paramMotionEvent1.iaC = paramMotionEvent1.ugH.i(paramMotionEvent1.iaB, f3 - paramFloat1);
      AppMethodBeat.o(5818);
      break;
      label161: if (paramMotionEvent1.getX() < this.ugI.iaw.getMeasuredWidth() / 2)
        this.ugI.ugG = a.a.ugL;
      else
        this.ugI.ugG = a.a.ugK;
    }
    label208: if (paramMotionEvent1.ugG == a.a.ugL)
    {
      paramFloat1 = paramFloat2 * -1.0F / paramMotionEvent1.iaw.getMeasuredHeight() * 1.2F + paramMotionEvent1.hXK;
      if (paramFloat1 < 0.0F)
        paramFloat1 = f2;
    }
    label250: label507: label510: 
    while (true)
    {
      paramMotionEvent2 = paramMotionEvent1.mContext;
      if ((paramMotionEvent2 instanceof Activity))
      {
        if (paramFloat1 >= 0.01F)
          break label327;
        paramFloat2 = 0.01F;
      }
      while (true)
      {
        paramMotionEvent2 = (Activity)paramMotionEvent2;
        WindowManager.LayoutParams localLayoutParams = paramMotionEvent2.getWindow().getAttributes();
        localLayoutParams.screenBrightness = paramFloat2;
        paramMotionEvent2.getWindow().setAttributes(localLayoutParams);
        paramMotionEvent1.ugH.ar(paramFloat1);
        break;
        if (paramFloat1 <= 1.0F)
          break label510;
        paramFloat1 = 1.0F;
        break label250;
        paramFloat2 = f1;
        if (paramFloat1 <= 1.0F)
          paramFloat2 = paramFloat1;
      }
      if (paramMotionEvent1.ugG != a.a.ugK)
        break;
      paramFloat1 = paramFloat2 * -1.0F;
      paramFloat2 = paramFloat1 / paramMotionEvent1.iaw.getMeasuredHeight();
      paramMotionEvent2 = (AudioManager)paramMotionEvent1.mContext.getSystemService("audio");
      int i = paramMotionEvent2.getStreamMaxVolume(3);
      paramFloat2 = 1.2F * (paramFloat2 * i);
      int j = (int)paramFloat2;
      if ((j == 0) && (Math.abs(paramFloat2) > 0.2F))
        if (paramFloat1 > 0.0F)
          j = 1;
      while (true)
      {
        int k = j + paramMotionEvent1.JB;
        if (k < 0)
          j = 0;
        while (true)
        {
          com.tencent.mm.compatible.b.a.b(paramMotionEvent2, 3, j);
          paramFloat1 = j / i;
          paramMotionEvent1.ugH.aq(paramFloat1);
          break;
          if (paramFloat1 >= 0.0F)
            break label507;
          j = -1;
          break label432;
          j = k;
          if (k >= i)
            j = i;
        }
      }
    }
  }

  public final boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(5816);
    this.ugI.iaw.postDelayed(this.ugI.iaD, 200L);
    AppMethodBeat.o(5816);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.fts.ui.a.2
 * JD-Core Version:    0.6.2
 */