package com.tencent.mm.plugin.topstory.ui.video;

import android.app.Activity;
import android.content.Context;
import android.media.AudioManager;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.b.a;

final class k$2 extends GestureDetector.SimpleOnGestureListener
{
  k$2(k paramk)
  {
  }

  public final boolean onDoubleTap(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(1734);
    this.sEG.iaw.removeCallbacks(this.sEG.iaD);
    this.sEG.sED.aFj();
    AppMethodBeat.o(1734);
    return true;
  }

  public final boolean onScroll(MotionEvent paramMotionEvent1, MotionEvent paramMotionEvent2, float paramFloat1, float paramFloat2)
  {
    float f1 = 1.0F;
    float f2 = 0.0F;
    AppMethodBeat.i(1735);
    if ((paramMotionEvent1 == null) || (paramMotionEvent2 == null))
    {
      AppMethodBeat.o(1735);
      return true;
    }
    if (this.sEG.sEC == k.a.sEH)
    {
      if (Math.abs(paramFloat1) <= Math.abs(paramFloat2))
        break label157;
      this.sEG.sEC = k.a.sEK;
    }
    float f3;
    while (true)
    {
      paramFloat1 = paramMotionEvent2.getX();
      paramFloat2 = paramMotionEvent1.getX();
      f3 = paramMotionEvent2.getY() - paramMotionEvent1.getY();
      paramMotionEvent2 = this.sEG;
      if (paramMotionEvent2.sEC != k.a.sEK)
        break label204;
      if (paramMotionEvent2.iaB == -1)
      {
        paramMotionEvent2.sED.aFk();
        paramMotionEvent2.iaB = paramMotionEvent2.sED.getCurrentPosition();
      }
      paramMotionEvent2.iaC = paramMotionEvent2.sED.be(paramFloat1 - paramFloat2);
      label148: AppMethodBeat.o(1735);
      break;
      label157: if (paramMotionEvent1.getX() < this.sEG.iaw.getMeasuredWidth() / 2)
        this.sEG.sEC = k.a.sEJ;
      else
        this.sEG.sEC = k.a.sEI;
    }
    label204: if ((paramMotionEvent2.sEC == k.a.sEJ) && (paramMotionEvent2.sEF))
    {
      paramFloat1 = f3 * -1.0F / paramMotionEvent2.iaw.getMeasuredHeight() * 1.2F + paramMotionEvent2.hXK;
      if (paramFloat1 < 0.0F)
        paramFloat1 = f2;
    }
    label323: label492: label495: 
    while (true)
    {
      label253: paramMotionEvent1 = paramMotionEvent2.mContext;
      if ((paramMotionEvent1 instanceof Activity))
      {
        if (paramFloat1 >= 0.01F)
          break label323;
        paramFloat2 = 0.01F;
      }
      while (true)
      {
        paramMotionEvent2 = (Activity)paramMotionEvent1;
        paramMotionEvent1 = paramMotionEvent2.getWindow().getAttributes();
        paramMotionEvent1.screenBrightness = paramFloat2;
        paramMotionEvent2.getWindow().setAttributes(paramMotionEvent1);
        AppMethodBeat.o(1735);
        break;
        if (paramFloat1 <= 1.0F)
          break label495;
        paramFloat1 = 1.0F;
        break label253;
        paramFloat2 = f1;
        if (paramFloat1 <= 1.0F)
          paramFloat2 = paramFloat1;
      }
      if ((paramMotionEvent2.sEC != k.a.sEI) || (!paramMotionEvent2.sEE))
        break label148;
      paramFloat1 = f3 * -1.0F;
      paramFloat2 = paramFloat1 / paramMotionEvent2.iaw.getMeasuredHeight();
      paramMotionEvent1 = (AudioManager)paramMotionEvent2.mContext.getSystemService("audio");
      int i = paramMotionEvent1.getStreamMaxVolume(3);
      paramFloat2 = 1.2F * (paramFloat2 * i);
      int j = (int)paramFloat2;
      if ((j == 0) && (Math.abs(paramFloat2) > 0.2F))
        if (paramFloat1 > 0.0F)
          j = 1;
      while (true)
      {
        int k = j + paramMotionEvent2.JB;
        if (k < 0)
          j = 0;
        while (true)
        {
          a.b(paramMotionEvent1, 3, j);
          break;
          if (paramFloat1 >= 0.0F)
            break label492;
          j = -1;
          break label435;
          j = k;
          if (k >= i)
            j = i;
        }
      }
    }
  }

  public final boolean onSingleTapUp(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(1733);
    this.sEG.iaw.postDelayed(this.sEG.iaD, 200L);
    AppMethodBeat.o(1733);
    return true;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.k.2
 * JD-Core Version:    0.6.2
 */