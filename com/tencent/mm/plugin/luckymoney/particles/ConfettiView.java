package com.tencent.mm.plugin.luckymoney.particles;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.particles.a.b;
import java.util.Iterator;
import java.util.List;

public class ConfettiView extends View
  implements View.OnLayoutChangeListener
{
  List<b> nZJ;
  private boolean oas;
  private b oat;
  boolean terminated;

  public ConfettiView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public static ConfettiView es(Context paramContext)
  {
    AppMethodBeat.i(42451);
    ConfettiView localConfettiView = new ConfettiView(paramContext, null);
    localConfettiView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
    if (Build.VERSION.SDK_INT >= 21)
      localConfettiView.setElevation(paramContext.getResources().getDimensionPixelOffset(2131428252));
    AppMethodBeat.o(42451);
    return localConfettiView;
  }

  public final void bLM()
  {
    AppMethodBeat.i(42452);
    if (!this.terminated)
    {
      this.terminated = true;
      getParent().requestLayout();
    }
    AppMethodBeat.o(42452);
  }

  protected void onAttachedToWindow()
  {
    AppMethodBeat.i(42453);
    super.onAttachedToWindow();
    ViewGroup localViewGroup = (ViewGroup)getParent();
    localViewGroup.removeOnLayoutChangeListener(this);
    localViewGroup.addOnLayoutChangeListener(this);
    if (this.nZJ == null)
      bLM();
    AppMethodBeat.o(42453);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(42455);
    super.onDraw(paramCanvas);
    if (!this.terminated)
    {
      paramCanvas.save();
      Iterator localIterator = this.nZJ.iterator();
      while (localIterator.hasNext())
      {
        b localb = (b)localIterator.next();
        if (localb.oaP)
        {
          float f1 = localb.oaR;
          float f2 = localb.oaT;
          float f3 = localb.oaS;
          localb.a(paramCanvas, f2 + f1, localb.oaU + f3, localb.oaN, localb.oaK);
        }
        else if ((localb.oaO) && (!localb.terminated))
        {
          localb.a(paramCanvas, localb.oaL, localb.oaM, localb.oaN, localb.oaK);
        }
      }
      paramCanvas.restore();
    }
    AppMethodBeat.o(42455);
  }

  public void onLayoutChange(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    AppMethodBeat.i(42454);
    if (this.terminated)
    {
      paramView = getParent();
      if ((paramView != null) && ((paramView instanceof ViewGroup)))
      {
        paramView = (ViewGroup)paramView;
        paramView.removeViewInLayout(this);
        paramView.removeOnLayoutChangeListener(this);
        paramView.invalidate();
      }
    }
    AppMethodBeat.o(42454);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(42456);
    if (this.oas);
    int i;
    switch (paramMotionEvent.getAction())
    {
    default:
      i = 0;
      label50: if ((i != 0) || (super.onTouchEvent(paramMotionEvent)))
        AppMethodBeat.o(42456);
      break;
    case 0:
    case 2:
    case 1:
    case 3:
    }
    for (boolean bool = true; ; bool = false)
    {
      return bool;
      Iterator localIterator = this.nZJ.iterator();
      label265: label268: 
      while (true)
      {
        if (!localIterator.hasNext())
          break label270;
        localb = (b)localIterator.next();
        float f1 = paramMotionEvent.getX();
        float f2 = paramMotionEvent.getY();
        if ((localb.oaL <= f1) && (f1 <= localb.oaL + localb.getWidth()) && (localb.oaM <= f2) && (f2 <= localb.oaM + localb.getHeight()))
        {
          i = 1;
          label176: if (i == 0)
            break label265;
          localb.oaP = true;
          localb.oaR = f1;
          localb.oaS = f2;
          localb.oaT = (localb.oaL - f1);
          localb.oaU = (localb.oaM - f2);
          localb.oaQ = VelocityTracker.obtain();
          localb.oaQ.addMovement(paramMotionEvent);
        }
        for (i = 1; ; i = 0)
        {
          if (i == 0)
            break label268;
          this.oat = localb;
          i = 1;
          break;
          i = 0;
          break label176;
        }
      }
      label270: i = 0;
      break label50;
      if (this.oat == null)
        break;
      b localb = this.oat;
      localb.oaR = paramMotionEvent.getX();
      localb.oaS = paramMotionEvent.getY();
      localb.oaQ.addMovement(paramMotionEvent);
      i = 1;
      break label50;
      if (this.oat == null)
        break;
      localb = this.oat;
      localb.oaQ.addMovement(paramMotionEvent);
      localb.oaQ.computeCurrentVelocity(1);
      localb.oaz = -1L;
      localb.oaA = (paramMotionEvent.getX() + localb.oaT);
      localb.oaB = (paramMotionEvent.getY() + localb.oaU);
      localb.oaC = localb.oaQ.getXVelocity();
      localb.oaD = localb.oaQ.getYVelocity();
      localb.oaG = localb.oaN;
      localb.oaQ.recycle();
      localb.i(localb.nZP);
      localb.oaP = false;
      this.oat = null;
      i = 1;
      break label50;
      AppMethodBeat.o(42456);
    }
  }

  public void setTouchEnabled(boolean paramBoolean)
  {
    this.oas = paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.particles.ConfettiView
 * JD-Core Version:    0.6.2
 */