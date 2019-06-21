package com.tencent.mm.plugin.appbrand.jsapi.coverview;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.container.AppBrandNativeContainerView;
import com.tencent.mm.plugin.appbrand.jsapi.s.f;

public class CoverViewContainer extends AppBrandNativeContainerView
  implements f
{
  private View aph;
  private int eHE;
  private float hIW;
  private int hIX;
  private Paint hIY;
  private float nJ;

  public CoverViewContainer(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(91049);
    this.hIY = new Paint();
    init();
    AppMethodBeat.o(91049);
  }

  public CoverViewContainer(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(91050);
    this.hIY = new Paint();
    init();
    AppMethodBeat.o(91050);
  }

  public CoverViewContainer(Context paramContext, View paramView)
  {
    super(paramContext);
    AppMethodBeat.i(91052);
    this.hIY = new Paint();
    setTargetView(paramView);
    init();
    AppMethodBeat.o(91052);
  }

  private void init()
  {
    AppMethodBeat.i(91053);
    this.hIY.setStyle(Paint.Style.STROKE);
    this.hIY.setAntiAlias(true);
    setWillNotDraw(false);
    AppMethodBeat.o(91053);
  }

  public void addView(View paramView, int paramInt)
  {
    AppMethodBeat.i(91056);
    int i;
    if (paramInt < 0)
      i = 0;
    while (true)
    {
      super.addView(paramView, i + 1);
      AppMethodBeat.o(91056);
      return;
      i = paramInt;
      if (paramInt > getChildCount() - 1)
        i = getChildCount() - 1;
    }
  }

  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    AppMethodBeat.i(91057);
    int i;
    if (paramInt < 0)
      i = 0;
    while (true)
    {
      super.addView(paramView, i + 1, paramLayoutParams);
      AppMethodBeat.o(91057);
      return;
      i = paramInt;
      if (paramInt > getChildCount() - 1)
        i = getChildCount() - 1;
    }
  }

  public final <T> T ah(Class<T> paramClass)
  {
    AppMethodBeat.i(91055);
    try
    {
      if (paramClass.isAssignableFrom(this.aph.getClass()))
      {
        paramClass = this.aph;
        AppMethodBeat.o(91055);
        return paramClass;
      }
    }
    catch (Exception paramClass)
    {
      while (true)
      {
        paramClass = null;
        AppMethodBeat.o(91055);
      }
    }
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = false;
    AppMethodBeat.i(91060);
    float f1;
    float f2;
    double d1;
    float f3;
    float f4;
    double d2;
    int i;
    if (paramMotionEvent.getActionMasked() == 0)
    {
      f1 = paramMotionEvent.getX();
      f2 = paramMotionEvent.getY();
      if (this.hIW > 0.0F)
      {
        d1 = Math.pow(this.hIW, 2.0D);
        f3 = getWidth();
        f4 = getHeight();
        if (f1 < this.hIW)
          if (f2 < this.hIW)
          {
            d2 = Math.pow(this.hIW - f1, 2.0D);
            if (Math.pow(this.hIW - f2, 2.0D) + d2 <= d1)
              break label325;
            i = 0;
            if (i != 0)
              break label331;
            AppMethodBeat.o(91060);
          }
      }
    }
    while (true)
    {
      return bool;
      if (f2 > f4 - this.hIW)
      {
        d2 = Math.pow(this.hIW - f1, 2.0D);
        if (Math.pow(this.hIW + f2 - f4, 2.0D) + d2 > d1)
        {
          i = 0;
          break;
          if (f1 > f3 - this.hIW)
          {
            if (f2 < this.hIW)
            {
              d2 = Math.pow(f1 + this.hIW - f3, 2.0D);
              if (Math.pow(this.hIW - f2, 2.0D) + d2 <= d1)
                break label325;
              i = 0;
              break;
            }
            if (f2 > f4 - this.hIW)
            {
              d2 = Math.pow(f1 + this.hIW - f3, 2.0D);
              if (Math.pow(this.hIW + f2 - f4, 2.0D) + d2 > d1)
              {
                i = 0;
                break;
              }
            }
          }
        }
      }
      label325: i = 1;
      break;
      label331: bool = super.dispatchTouchEvent(paramMotionEvent);
      AppMethodBeat.o(91060);
    }
  }

  public void draw(Canvas paramCanvas)
  {
    float f1 = 0.0F;
    AppMethodBeat.i(91054);
    int i;
    if (this.hIW > 0.0F)
    {
      i = 1;
      if (i != 0)
      {
        paramCanvas.save();
        localPath = new Path();
        localPath.addRoundRect(new RectF(0.0F, 0.0F, getWidth(), getHeight()), this.hIW, this.hIW, Path.Direction.CW);
        paramCanvas.clipPath(localPath);
      }
      if (this.eHE != 0)
        paramCanvas.drawColor(this.eHE);
      if (this.nJ <= 0.0F)
        break label295;
      float f2 = this.nJ / 2.0F;
      paramCanvas.drawRoundRect(new RectF(f2, f2, getWidth() - f2, getHeight() - f2), this.hIW, this.hIW, this.hIY);
      if (i != 0)
        paramCanvas.restore();
      paramCanvas.save();
      Path localPath = new Path();
      f2 = f1;
      if (this.hIW > 0.0F)
      {
        f2 = f1;
        if (this.hIW - this.nJ > 0.0F)
          f2 = this.hIW - this.nJ;
      }
      localPath.addRoundRect(new RectF(this.nJ, this.nJ, getWidth() - this.nJ, getHeight() - this.nJ), f2, f2, Path.Direction.CW);
      paramCanvas.clipPath(localPath);
      i = 1;
    }
    label295: 
    while (true)
    {
      super.draw(paramCanvas);
      if (i != 0)
        paramCanvas.restore();
      AppMethodBeat.o(91054);
      return;
      i = 0;
      break;
    }
  }

  public void setBgColor(int paramInt)
  {
    this.eHE = paramInt;
  }

  public void setBorderColor(int paramInt)
  {
    AppMethodBeat.i(91058);
    this.hIX = paramInt;
    this.hIY.setColor(paramInt);
    AppMethodBeat.o(91058);
  }

  public void setBorderRadius(float paramFloat)
  {
    this.hIW = paramFloat;
  }

  public void setBorderWidth(float paramFloat)
  {
    AppMethodBeat.i(91059);
    this.nJ = paramFloat;
    this.hIY.setStrokeWidth(paramFloat);
    AppMethodBeat.o(91059);
  }

  public void setTargetView(View paramView)
  {
    AppMethodBeat.i(91051);
    this.aph = paramView;
    super.addView(paramView, 0, new ViewGroup.LayoutParams(-1, -1));
    AppMethodBeat.o(91051);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.coverview.CoverViewContainer
 * JD-Core Version:    0.6.2
 */