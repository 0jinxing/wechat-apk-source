package com.tencent.mm.plugin.appbrand.game.d;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.support.v7.widget.AppCompatButton;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class a extends AppCompatButton
{
  private RectF hrv;
  private boolean hrw;
  private float hrx;
  private float hry;

  public a(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(130152);
    setGravity(17);
    setText("vConsole");
    setTextColor(-1);
    float f = getContext().getResources().getDisplayMetrics().density;
    setPadding((int)(13.0F * f), (int)(4.0F * f), (int)(13.0F * f), (int)(f * 6.0F));
    setBackgroundDrawable(new a.a(this, (byte)0));
    AppMethodBeat.o(130152);
  }

  private boolean H(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(130153);
    boolean bool;
    if (this.hrv == null)
    {
      bool = false;
      AppMethodBeat.o(130153);
    }
    while (true)
    {
      return bool;
      bool = this.hrv.contains(paramFloat1, paramFloat2);
      AppMethodBeat.o(130153);
    }
  }

  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(130154);
    switch (paramMotionEvent.getAction())
    {
    default:
    case 0:
    case 2:
    case 1:
    }
    while (true)
    {
      this.hrx = paramMotionEvent.getRawX();
      this.hry = paramMotionEvent.getRawY();
      AppMethodBeat.o(130154);
      return true;
      this.hrv = new RectF(getX(), getY(), getX() + getWidth(), getY() + getHeight());
      this.hrw = false;
      continue;
      if ((this.hrw) || (!H(paramMotionEvent.getRawX(), paramMotionEvent.getRawY())))
      {
        setX(getX() + (paramMotionEvent.getRawX() - this.hrx));
        setY(getY() + (paramMotionEvent.getRawY() - this.hry));
        requestLayout();
        this.hrw = true;
        continue;
        if ((!this.hrw) && (H(paramMotionEvent.getRawX(), paramMotionEvent.getRawY())))
          performClick();
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.game.d.a
 * JD-Core Version:    0.6.2
 */