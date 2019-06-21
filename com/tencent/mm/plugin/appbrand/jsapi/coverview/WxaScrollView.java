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
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.s.f;

public class WxaScrollView extends FrameLayout
  implements n, o, f
{
  private int eHE;
  private float hIW;
  private int hIX;
  private Paint hIY;
  private FrameLayout hJg;
  private ScrollView hJh;
  private m hJi;
  private boolean hJj;
  private boolean hJk;
  private float nJ;

  public WxaScrollView(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(126323);
    this.hJj = true;
    this.hJk = true;
    this.hIY = new Paint();
    init();
    AppMethodBeat.o(126323);
  }

  public WxaScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(126324);
    this.hJj = true;
    this.hJk = true;
    this.hIY = new Paint();
    init();
    AppMethodBeat.o(126324);
  }

  public WxaScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(126325);
    this.hJj = true;
    this.hJk = true;
    this.hIY = new Paint();
    init();
    AppMethodBeat.o(126325);
  }

  private void init()
  {
    AppMethodBeat.i(126326);
    this.hJh = new WxaScrollView.1(this, getContext());
    this.hJg = new FrameLayout(getContext());
    super.addView(this.hJh, 0, new ViewGroup.LayoutParams(-1, -1));
    this.hJh.addView(this.hJg, 0, new ViewGroup.LayoutParams(-1, -2));
    this.hIY.setStyle(Paint.Style.STROKE);
    this.hIY.setAntiAlias(true);
    setWillNotDraw(false);
    AppMethodBeat.o(126326);
  }

  public void addView(View paramView, int paramInt)
  {
    AppMethodBeat.i(126329);
    this.hJg.addView(paramView, paramInt);
    AppMethodBeat.o(126329);
  }

  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    AppMethodBeat.i(126330);
    this.hJg.addView(paramView, paramInt, paramLayoutParams);
    AppMethodBeat.o(126330);
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    boolean bool = false;
    AppMethodBeat.i(126334);
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
            AppMethodBeat.o(126334);
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
      AppMethodBeat.o(126334);
    }
  }

  public void draw(Canvas paramCanvas)
  {
    float f1 = 0.0F;
    AppMethodBeat.i(126327);
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
        break label307;
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
    label307: 
    while (true)
    {
      int j = paramCanvas.save();
      super.draw(paramCanvas);
      paramCanvas.restoreToCount(j);
      if (i != 0)
        paramCanvas.restore();
      AppMethodBeat.o(126327);
      return;
      i = 0;
      break;
    }
  }

  public ViewGroup getTargetView()
  {
    return this.hJg;
  }

  public int getTargetViewChildCount()
  {
    AppMethodBeat.i(126328);
    int i = this.hJg.getChildCount();
    AppMethodBeat.o(126328);
    return i;
  }

  public void removeView(View paramView)
  {
    AppMethodBeat.i(126331);
    this.hJg.removeView(paramView);
    AppMethodBeat.o(126331);
  }

  public void scrollTo(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(126335);
    this.hJh.scrollTo(paramInt1, paramInt2);
    invalidate();
    AppMethodBeat.o(126335);
  }

  public void setBgColor(int paramInt)
  {
    this.eHE = paramInt;
  }

  public void setBorderColor(int paramInt)
  {
    AppMethodBeat.i(126332);
    this.hIX = paramInt;
    this.hIY.setColor(paramInt);
    AppMethodBeat.o(126332);
  }

  public void setBorderRadius(float paramFloat)
  {
    this.hIW = paramFloat;
  }

  public void setBorderWidth(float paramFloat)
  {
    AppMethodBeat.i(126333);
    this.nJ = paramFloat;
    this.hIY.setStrokeWidth(paramFloat);
    AppMethodBeat.o(126333);
  }

  public void setOnScrollChangedListener(m paramm)
  {
    this.hJi = paramm;
  }

  public void setScrollHorizontal(boolean paramBoolean)
  {
    this.hJk = paramBoolean;
  }

  public void setScrollVertical(boolean paramBoolean)
  {
    this.hJj = paramBoolean;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.coverview.WxaScrollView
 * JD-Core Version:    0.6.2
 */