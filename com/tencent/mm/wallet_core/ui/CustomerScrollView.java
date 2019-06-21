package com.tencent.mm.wallet_core.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.ScrollView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class CustomerScrollView extends ScrollView
{
  private float AgR;
  private float AgS;
  private float AgT;
  private float AgU;

  public CustomerScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public CustomerScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(49180);
    boolean bool;
    switch (paramMotionEvent.getAction())
    {
    case 1:
    default:
      bool = super.onInterceptTouchEvent(paramMotionEvent);
      AppMethodBeat.o(49180);
    case 0:
    case 2:
    }
    while (true)
    {
      return bool;
      this.AgS = 0.0F;
      this.AgR = 0.0F;
      this.AgT = paramMotionEvent.getX();
      this.AgU = paramMotionEvent.getY();
      break;
      float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      this.AgR += Math.abs(f1 - this.AgT);
      this.AgS += Math.abs(f2 - this.AgU);
      this.AgT = f1;
      this.AgU = f2;
      if (this.AgR <= this.AgS)
        break;
      bool = false;
      AppMethodBeat.o(49180);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.ui.CustomerScrollView
 * JD-Core Version:    0.6.2
 */