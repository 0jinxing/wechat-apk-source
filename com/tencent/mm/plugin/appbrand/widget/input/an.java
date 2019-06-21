package com.tencent.mm.plugin.appbrand.widget.input;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class an
  implements View.OnTouchListener
{
  private static final int LN;
  private final Handler jho;
  private float jhp;
  private float jhq;
  private boolean jhr;

  static
  {
    AppMethodBeat.i(123871);
    LN = ViewConfiguration.getLongPressTimeout();
    AppMethodBeat.o(123871);
  }

  public an()
  {
    AppMethodBeat.i(123867);
    this.jho = new an.1(this, Looper.getMainLooper());
    this.jhr = false;
    AppMethodBeat.o(123867);
  }

  private void cU(View paramView)
  {
    AppMethodBeat.i(123869);
    paramView.setPressed(false);
    this.jhr = false;
    this.jho.removeMessages(1);
    this.jho.removeMessages(2);
    AppMethodBeat.o(123869);
  }

  protected void aFi()
  {
  }

  protected void aQX()
  {
  }

  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(123868);
    switch (paramMotionEvent.getActionMasked())
    {
    default:
    case 3:
    case 1:
    case 2:
    case 0:
    }
    while (true)
    {
      AppMethodBeat.o(123868);
      return true;
      cU(paramView);
      continue;
      if ((!this.jhr) && (this.jho.hasMessages(1)))
        aFi();
      cU(paramView);
      continue;
      int i = ViewConfiguration.get(paramView.getContext()).getScaledTouchSlop();
      float f1 = paramMotionEvent.getX();
      float f2 = paramMotionEvent.getY();
      if ((-i > f1) || (f1 > paramView.getWidth() + i) || (-i > f2) || (f2 > i + paramView.getHeight()))
      {
        this.jhr = true;
        continue;
        paramView.setPressed(true);
        this.jho.sendMessageDelayed(Message.obtain(this.jho, 1), LN);
        this.jhp = paramMotionEvent.getX();
        this.jhq = paramMotionEvent.getY();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.an
 * JD-Core Version:    0.6.2
 */