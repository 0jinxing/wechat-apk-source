package com.tencent.mm.kiss.widget.textview;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.Layout;
import android.text.Selection;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStructure;
import android.widget.TextView;
import android.widget.TextView.BufferType;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.reflect.Field;

public class SysTextView extends TextView
  implements a
{
  private static boolean eOd = false;
  private static Field eOe = null;
  private g eNP;

  public SysTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(105777);
    this.eNP = new g(this, new com.tencent.mm.kiss.widget.textview.a.a());
    init();
    AppMethodBeat.o(105777);
  }

  public SysTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(105778);
    this.eNP = new g(this, new com.tencent.mm.kiss.widget.textview.a.a());
    init();
    AppMethodBeat.o(105778);
  }

  private void SS()
  {
    AppMethodBeat.i(105780);
    if (eOd)
      AppMethodBeat.o(105780);
    while (true)
    {
      return;
      try
      {
        if (eOe == null)
        {
          Field localField = TextView.class.getDeclaredField("mSingleLine");
          eOe = localField;
          localField.setAccessible(true);
        }
        if (eOe.getBoolean(this))
          this.eNP.eNR.maxLines = 1;
        AppMethodBeat.o(105780);
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.SysPLTextView", "initSingleLine error: %s", new Object[] { localException.getMessage() });
        eOd = true;
        AppMethodBeat.o(105780);
      }
    }
  }

  private void init()
  {
    AppMethodBeat.i(105779);
    super.setText(" ", TextView.BufferType.SPANNABLE);
    this.eNP.eNR = new com.tencent.mm.kiss.widget.textview.a.a();
    this.eNP.eNR.textColor = super.getTextColors().getDefaultColor();
    this.eNP.eNR.eND = super.getEllipsize();
    this.eNP.eNR.gravity = super.getGravity();
    this.eNP.eNR.eOg = super.getTextSize();
    SS();
    AppMethodBeat.o(105779);
  }

  public void dispatchProvideStructure(ViewStructure paramViewStructure)
  {
  }

  public int getBaseline()
  {
    AppMethodBeat.i(105813);
    try
    {
      i = super.getBaseline();
      AppMethodBeat.o(105813);
      return i;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SysPLTextView", localThrowable, "", new Object[0]);
        int i = -1;
        AppMethodBeat.o(105813);
      }
    }
  }

  public com.tencent.mm.kiss.widget.textview.a.a getConfig()
  {
    if (this.eNP == null);
    for (com.tencent.mm.kiss.widget.textview.a.a locala = null; ; locala = this.eNP.eNR)
      return locala;
  }

  public int getHorizontalDrawOffset()
  {
    if (this.eNP == null);
    for (int i = 0; ; i = this.eNP.eNU)
      return i;
  }

  protected f getLayoutWrapper()
  {
    AppMethodBeat.i(105781);
    f localf;
    if (this.eNP == null)
    {
      localf = null;
      AppMethodBeat.o(105781);
    }
    while (true)
    {
      return localf;
      localf = this.eNP.getLayoutWrapper();
      AppMethodBeat.o(105781);
    }
  }

  public int getLineCount()
  {
    AppMethodBeat.i(105799);
    int i;
    if (this.eNP == null)
    {
      i = 0;
      AppMethodBeat.o(105799);
    }
    while (true)
    {
      return i;
      i = this.eNP.getLineCount();
      AppMethodBeat.o(105799);
    }
  }

  public int getLineHeight()
  {
    AppMethodBeat.i(105800);
    int i;
    if (this.eNP == null)
    {
      i = 0;
      AppMethodBeat.o(105800);
    }
    while (true)
    {
      return i;
      i = this.eNP.getLineHeight();
      AppMethodBeat.o(105800);
    }
  }

  public int getSelectionEnd()
  {
    AppMethodBeat.i(105802);
    int i;
    if (getText() == null)
    {
      i = -1;
      AppMethodBeat.o(105802);
    }
    while (true)
    {
      return i;
      i = Selection.getSelectionEnd(getText());
      AppMethodBeat.o(105802);
    }
  }

  public int getSelectionStart()
  {
    AppMethodBeat.i(105801);
    int i;
    if (getText() == null)
    {
      i = -1;
      AppMethodBeat.o(105801);
    }
    while (true)
    {
      return i;
      i = Selection.getSelectionStart(getText());
      AppMethodBeat.o(105801);
    }
  }

  public CharSequence getText()
  {
    AppMethodBeat.i(105795);
    CharSequence localCharSequence;
    if (this.eNP == null)
    {
      localCharSequence = null;
      AppMethodBeat.o(105795);
    }
    while (true)
    {
      return localCharSequence;
      localCharSequence = this.eNP.getText();
      AppMethodBeat.o(105795);
    }
  }

  public int getTextColor()
  {
    AppMethodBeat.i(105797);
    int i = this.eNP.getTextColor();
    AppMethodBeat.o(105797);
    return i;
  }

  public float getTextSize()
  {
    AppMethodBeat.i(105796);
    float f;
    if (this.eNP == null)
    {
      f = 0.0F;
      AppMethodBeat.o(105796);
    }
    while (true)
    {
      return f;
      f = this.eNP.getTextSize();
      AppMethodBeat.o(105796);
    }
  }

  public Layout getTvLayout()
  {
    AppMethodBeat.i(105798);
    Layout localLayout = this.eNP.getTvLayout();
    AppMethodBeat.o(105798);
    return localLayout;
  }

  public int getVerticalDrawOffset()
  {
    if (this.eNP == null);
    for (int i = 0; ; i = this.eNP.eNV)
      return i;
  }

  protected void onAttachedToWindow()
  {
    AppMethodBeat.i(105808);
    super.onAttachedToWindow();
    AppMethodBeat.o(105808);
  }

  protected void onDetachedFromWindow()
  {
    AppMethodBeat.i(105809);
    super.onDetachedFromWindow();
    AppMethodBeat.o(105809);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(105806);
    try
    {
      g localg = this.eNP;
      if (localg == null)
        AppMethodBeat.o(105806);
      while (true)
      {
        return;
        this.eNP.onDraw(paramCanvas);
        AppMethodBeat.o(105806);
      }
    }
    catch (Throwable paramCanvas)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SysPLTextView", paramCanvas, "", new Object[0]);
        AppMethodBeat.o(105806);
      }
    }
  }

  public void onFinishTemporaryDetach()
  {
    AppMethodBeat.i(105811);
    super.onFinishTemporaryDetach();
    AppMethodBeat.o(105811);
  }

  public void onHoverChanged(boolean paramBoolean)
  {
  }

  public boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    return false;
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(105807);
    try
    {
      Point localPoint = this.eNP.ce(paramInt1, paramInt2);
      if (localPoint != null)
      {
        setMeasuredDimension(localPoint.x, localPoint.y);
        AppMethodBeat.o(105807);
        return;
      }
    }
    catch (Throwable localThrowable)
    {
      while (true)
        try
        {
          super.onMeasure(paramInt1, paramInt2);
          AppMethodBeat.o(105807);
          continue;
          localThrowable = localThrowable;
          ab.printErrStackTrace("MicroMsg.SysPLTextView", localThrowable, "", new Object[0]);
          AppMethodBeat.o(105807);
        }
        catch (Exception localException)
        {
          ab.printErrStackTrace("MicroMsg.SysPLTextView", localException, "onMeasure error: %s", new Object[] { localException.getMessage() });
          AppMethodBeat.o(105807);
        }
    }
  }

  public boolean onPreDraw()
  {
    return true;
  }

  public void onProvideStructure(ViewStructure paramViewStructure)
  {
    AppMethodBeat.i(105812);
    try
    {
      super.onProvideStructure(paramViewStructure);
      AppMethodBeat.o(105812);
      return;
    }
    catch (Exception paramViewStructure)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.SysPLTextView", paramViewStructure, "onProvideStructure error: %s", new Object[] { paramViewStructure.getMessage() });
        AppMethodBeat.o(105812);
      }
    }
  }

  public void onStartTemporaryDetach()
  {
    AppMethodBeat.i(105810);
    super.onStartTemporaryDetach();
    AppMethodBeat.o(105810);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(105804);
    boolean bool1;
    if (getTvLayout() == null)
    {
      bool1 = false;
      AppMethodBeat.o(105804);
    }
    while (true)
    {
      return bool1;
      boolean bool2 = this.eNP.t(paramMotionEvent);
      bool1 = super.onTouchEvent(paramMotionEvent);
      if (bool2)
      {
        bool1 = true;
        AppMethodBeat.o(105804);
      }
      else
      {
        AppMethodBeat.o(105804);
      }
    }
  }

  public boolean performClick()
  {
    boolean bool = false;
    AppMethodBeat.i(105805);
    if (this.eNP == null)
      AppMethodBeat.o(105805);
    while (true)
    {
      return bool;
      if (!this.eNP.performClick())
      {
        AppMethodBeat.o(105805);
      }
      else
      {
        bool = super.performClick();
        AppMethodBeat.o(105805);
      }
    }
  }

  public void setClickable(boolean paramBoolean)
  {
    AppMethodBeat.i(105803);
    super.setClickable(paramBoolean);
    if (this.eNP == null)
      AppMethodBeat.o(105803);
    while (true)
    {
      return;
      this.eNP.eNX = paramBoolean;
      AppMethodBeat.o(105803);
    }
  }

  public void setGravity(int paramInt)
  {
    AppMethodBeat.i(105790);
    if (this.eNP == null)
      AppMethodBeat.o(105790);
    while (true)
    {
      return;
      this.eNP.setGravity(paramInt);
      AppMethodBeat.o(105790);
    }
  }

  public void setHandleClickableSpan(boolean paramBoolean)
  {
    this.eNP.eNY = paramBoolean;
  }

  public void setLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    AppMethodBeat.i(105793);
    if (this.eNP != null)
      this.eNP.SR();
    super.setLayoutParams(paramLayoutParams);
    AppMethodBeat.o(105793);
  }

  public void setLines(int paramInt)
  {
    AppMethodBeat.i(105783);
    if (this.eNP == null)
      AppMethodBeat.o(105783);
    while (true)
    {
      return;
      this.eNP.setLines(paramInt);
      AppMethodBeat.o(105783);
    }
  }

  public void setMaxLines(int paramInt)
  {
    AppMethodBeat.i(105791);
    if (this.eNP == null)
      AppMethodBeat.o(105791);
    while (true)
    {
      return;
      this.eNP.setMaxLines(paramInt);
      AppMethodBeat.o(105791);
    }
  }

  public void setMinLines(int paramInt)
  {
    AppMethodBeat.i(105792);
    if (this.eNP == null)
      AppMethodBeat.o(105792);
    while (true)
    {
      return;
      this.eNP.setMinLines(paramInt);
      AppMethodBeat.o(105792);
    }
  }

  public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(105794);
    if (this.eNP != null)
      this.eNP.SR();
    super.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
    AppMethodBeat.o(105794);
  }

  public void setSingleLine(boolean paramBoolean)
  {
    AppMethodBeat.i(105782);
    if (this.eNP == null)
      AppMethodBeat.o(105782);
    while (true)
    {
      return;
      this.eNP.setSingleLine(paramBoolean);
      AppMethodBeat.o(105782);
    }
  }

  public void setText(CharSequence paramCharSequence, TextView.BufferType paramBufferType)
  {
    AppMethodBeat.i(105784);
    setText$609c24db(paramCharSequence);
    AppMethodBeat.o(105784);
  }

  public final void setText$609c24db(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(105785);
    if (this.eNP == null)
    {
      super.setText("");
      AppMethodBeat.o(105785);
    }
    while (true)
    {
      return;
      this.eNP.setText(paramCharSequence, false);
      AppMethodBeat.o(105785);
    }
  }

  public void setTextColor(int paramInt)
  {
    AppMethodBeat.i(105789);
    if (this.eNP == null)
      AppMethodBeat.o(105789);
    while (true)
    {
      return;
      this.eNP.setTextColor(paramInt);
      AppMethodBeat.o(105789);
    }
  }

  public void setTextLayout(f paramf)
  {
    AppMethodBeat.i(105788);
    if (this.eNP == null)
      AppMethodBeat.o(105788);
    while (true)
    {
      return;
      this.eNP.setTextLayout(paramf);
      AppMethodBeat.o(105788);
    }
  }

  public void setTextSize(float paramFloat)
  {
    AppMethodBeat.i(105786);
    setTextSize(0, paramFloat);
    AppMethodBeat.o(105786);
  }

  public void setTextSize(int paramInt, float paramFloat)
  {
    AppMethodBeat.i(105787);
    if (this.eNP == null)
      AppMethodBeat.o(105787);
    while (true)
    {
      return;
      this.eNP.setTextSize(paramInt, paramFloat);
      AppMethodBeat.o(105787);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.kiss.widget.textview.SysTextView
 * JD-Core Version:    0.6.2
 */