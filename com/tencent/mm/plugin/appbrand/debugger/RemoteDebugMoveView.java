package com.tencent.mm.plugin.appbrand.debugger;

import android.content.Context;
import android.content.res.Configuration;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class RemoteDebugMoveView extends FrameLayout
{
  int hkc;
  int hkd;
  float hke;
  float hkf;
  float hkg;
  float hkh;

  public RemoteDebugMoveView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public RemoteDebugMoveView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  protected void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(101855);
    super.onConfigurationChanged(paramConfiguration);
    getViewTreeObserver().addOnGlobalLayoutListener(new RemoteDebugMoveView.2(this));
    AppMethodBeat.o(101855);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(101856);
    switch (paramMotionEvent.getAction())
    {
    case 1:
    default:
    case 0:
    case 2:
    }
    while (true)
    {
      AppMethodBeat.o(101856);
      return true;
      this.hke = paramMotionEvent.getRawX();
      this.hkf = paramMotionEvent.getRawY();
      continue;
      this.hkg = paramMotionEvent.getRawX();
      this.hkh = paramMotionEvent.getRawY();
      float f1 = getX() + (this.hkg - this.hke);
      if ((0.0F < f1) && (f1 < this.hkc - getWidth()))
        setX(f1);
      float f2 = this.hkh - this.hkf;
      float f3 = this.hkd - getHeight();
      f1 = getY() + f2;
      if (((0.0F < f1) && (f1 < f3)) || ((f1 <= 0.0F) && (f2 > 0.0F)) || ((f1 >= f3) && (f2 < 0.0F)))
        setY(f1);
      this.hke = this.hkg;
      this.hkf = this.hkh;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.debugger.RemoteDebugMoveView
 * JD-Core Version:    0.6.2
 */