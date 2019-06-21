package com.tencent.mm.media.editor.view;

import a.f.a.b;
import a.f.b.j;
import a.h.a;
import a.h.d;
import a.h.e;
import a.l;
import a.y;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/media/editor/view/TextColorSelector;", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "TAG", "", "colorArray", "", "colorSelectedCallback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "index", "", "getColorSelectedCallback", "()Lkotlin/jvm/functions/Function1;", "setColorSelectedCallback", "(Lkotlin/jvm/functions/Function1;)V", "dotInterval", "", "outerColor", "paint", "Landroid/graphics/Paint;", "radiusNormalInner", "radiusNormalOuter", "radiusSelectInner", "radiusSelectOuter", "selectedIndex", "touchDownIndex", "getNearestIndex", "x", "y", "onDraw", "canvas", "Landroid/graphics/Canvas;", "onTouchEvent", "", "event", "Landroid/view/MotionEvent;", "setColorList", "setSelected", "select", "plugin-mediaeditor_release"})
public final class TextColorSelector extends View
{
  private final String TAG;
  private Paint aFY;
  private int biG;
  private final int eVh;
  private float eVi;
  private int[] eVj;
  private int eVk;
  private float eVl;
  private float eVm;
  private float eVn;
  private float eVo;
  private b<? super Integer, y> eVp;

  public TextColorSelector(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public TextColorSelector(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(12930);
    this.TAG = "TextColorSelector";
    this.eVh = -1;
    this.aFY = new Paint(1);
    this.eVj = new int[0];
    this.eVk = -1;
    this.biG = -1;
    this.eVl = getResources().getDimension(2131428311);
    this.eVm = getResources().getDimension(2131428312);
    this.eVn = getResources().getDimension(2131428313);
    this.eVo = getResources().getDimension(2131428314);
    this.aFY.setStyle(Paint.Style.FILL);
    AppMethodBeat.o(12930);
  }

  private final int E(float paramFloat1, float paramFloat2)
  {
    AppMethodBeat.i(12929);
    int i;
    if (e.a((a)new d(0, getMeasuredHeight()), paramFloat2))
    {
      i = Math.round((paramFloat1 - getPaddingLeft() - this.eVm) / this.eVi);
      if ((i >= 0) && (i < this.eVj.length))
        AppMethodBeat.o(12929);
    }
    while (true)
    {
      return i;
      i = -1;
      AppMethodBeat.o(12929);
    }
  }

  public final b<Integer, y> getColorSelectedCallback()
  {
    return this.eVp;
  }

  protected final void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(12927);
    j.p(paramCanvas, "canvas");
    super.onDraw(paramCanvas);
    this.eVi = ((getWidth() - getPaddingLeft() - getPaddingRight() - this.eVm * 2.0F) / (this.eVj.length - 1));
    float f1 = getHeight() / 2.0F;
    int i = 0;
    int j = this.eVj.length;
    if (i < j)
    {
      float f2 = this.eVi * i + this.eVm + getPaddingLeft();
      this.aFY.setColor(this.eVh);
      if (i == this.biG)
      {
        paramCanvas.drawCircle(f2, f1, this.eVo, this.aFY);
        label129: this.aFY.setColor(this.eVj[i]);
        if (i != this.biG)
          break label189;
        paramCanvas.drawCircle(f2, f1, this.eVn, this.aFY);
      }
      while (true)
      {
        i++;
        break;
        paramCanvas.drawCircle(f2, f1, this.eVm, this.aFY);
        break label129;
        label189: paramCanvas.drawCircle(f2, f1, this.eVl, this.aFY);
      }
    }
    AppMethodBeat.o(12927);
  }

  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(12928);
    j.p(paramMotionEvent, "event");
    switch (paramMotionEvent.getActionMasked())
    {
    case 2:
    default:
    case 0:
    case 3:
    case 1:
    }
    while (true)
    {
      AppMethodBeat.o(12928);
      return true;
      this.eVk = E(paramMotionEvent.getX(), paramMotionEvent.getY());
      continue;
      this.eVk = -1;
      continue;
      int i = E(paramMotionEvent.getX(), paramMotionEvent.getY());
      if ((i >= 0) && (i == this.eVk))
      {
        this.biG = i;
        paramMotionEvent = this.eVp;
        if (paramMotionEvent != null)
          paramMotionEvent.am(Integer.valueOf(this.biG));
      }
      this.eVk = -1;
      postInvalidate();
    }
  }

  public final void setColorList(int[] paramArrayOfInt)
  {
    AppMethodBeat.i(12926);
    j.p(paramArrayOfInt, "colorArray");
    this.eVj = paramArrayOfInt;
    AppMethodBeat.o(12926);
  }

  public final void setColorSelectedCallback(b<? super Integer, y> paramb)
  {
    this.eVp = paramb;
  }

  public final void setSelected(int paramInt)
  {
    this.biG = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.media.editor.view.TextColorSelector
 * JD-Core Version:    0.6.2
 */