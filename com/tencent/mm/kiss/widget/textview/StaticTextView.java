package com.tencent.mm.kiss.widget.textview;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Point;
import android.text.Layout;
import android.text.Selection;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.List;

public class StaticTextView extends View
  implements a
{
  protected g eNP;

  public StaticTextView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(105716);
    this.eNP = new g(this, SQ());
    this.eNP.init();
    AppMethodBeat.o(105716);
  }

  public StaticTextView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(105717);
    this.eNP = new g(this, SQ());
    this.eNP.init();
    AppMethodBeat.o(105717);
  }

  protected com.tencent.mm.kiss.widget.textview.a.a SQ()
  {
    AppMethodBeat.i(105718);
    com.tencent.mm.kiss.widget.textview.a.a locala = new com.tencent.mm.kiss.widget.textview.a.a();
    AppMethodBeat.o(105718);
    return locala;
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

  public f getLayoutWrapper()
  {
    AppMethodBeat.i(105737);
    f localf;
    if (this.eNP == null)
    {
      localf = null;
      AppMethodBeat.o(105737);
    }
    while (true)
    {
      return localf;
      localf = this.eNP.getLayoutWrapper();
      AppMethodBeat.o(105737);
    }
  }

  public int getLineCount()
  {
    AppMethodBeat.i(105738);
    int i = this.eNP.getLineCount();
    AppMethodBeat.o(105738);
    return i;
  }

  public int getLineHeight()
  {
    AppMethodBeat.i(105739);
    int i = this.eNP.getLineHeight();
    AppMethodBeat.o(105739);
    return i;
  }

  public int getMaxLines()
  {
    AppMethodBeat.i(105725);
    int i = this.eNP.getMaxLines();
    AppMethodBeat.o(105725);
    return i;
  }

  public int getOrientation()
  {
    AppMethodBeat.i(105751);
    int i = getResources().getConfiguration().orientation;
    ab.i("MicroMsg.StaticTextView", "test test getOrientation ".concat(String.valueOf(i)));
    AppMethodBeat.o(105751);
    return i;
  }

  public int getSelectionEnd()
  {
    AppMethodBeat.i(105741);
    int i = this.eNP.getSelectionEnd();
    AppMethodBeat.o(105741);
    return i;
  }

  public int getSelectionStart()
  {
    AppMethodBeat.i(105740);
    int i = this.eNP.getSelectionStart();
    AppMethodBeat.o(105740);
    return i;
  }

  public CharSequence getText()
  {
    AppMethodBeat.i(105733);
    CharSequence localCharSequence = this.eNP.getText();
    AppMethodBeat.o(105733);
    return localCharSequence;
  }

  public int getTextColor()
  {
    AppMethodBeat.i(105735);
    int i = this.eNP.getTextColor();
    AppMethodBeat.o(105735);
    return i;
  }

  public float getTextSize()
  {
    AppMethodBeat.i(105734);
    float f = this.eNP.getTextSize();
    AppMethodBeat.o(105734);
    return f;
  }

  public Layout getTvLayout()
  {
    AppMethodBeat.i(105736);
    Layout localLayout = this.eNP.getTvLayout();
    AppMethodBeat.o(105736);
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
    AppMethodBeat.i(105747);
    super.onAttachedToWindow();
    AppMethodBeat.o(105747);
  }

  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    AppMethodBeat.i(105752);
    super.onConfigurationChanged(paramConfiguration);
    AppMethodBeat.o(105752);
  }

  protected void onDetachedFromWindow()
  {
    AppMethodBeat.i(105748);
    super.onDetachedFromWindow();
    AppMethodBeat.o(105748);
  }

  protected void onDraw(Canvas paramCanvas)
  {
    AppMethodBeat.i(105745);
    super.onDraw(paramCanvas);
    if (this.eNP != null)
      this.eNP.onDraw(paramCanvas);
    AppMethodBeat.o(105745);
  }

  public void onFinishTemporaryDetach()
  {
    AppMethodBeat.i(105750);
    super.onFinishTemporaryDetach();
    AppMethodBeat.o(105750);
  }

  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    AppMethodBeat.i(105755);
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    if (paramAccessibilityEvent.getEventType() == 8192)
    {
      paramAccessibilityEvent.setFromIndex(Selection.getSelectionStart(getText()));
      paramAccessibilityEvent.setToIndex(Selection.getSelectionEnd(getText()));
      if (!bo.ac(getText()))
        paramAccessibilityEvent.setItemCount(getText().length());
    }
    AppMethodBeat.o(105755);
  }

  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    AppMethodBeat.i(105754);
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    if (!bo.ac(getText()))
    {
      paramAccessibilityNodeInfo.addAction(256);
      paramAccessibilityNodeInfo.addAction(512);
      paramAccessibilityNodeInfo.setMovementGranularities(31);
      if (d.iW(18))
        paramAccessibilityNodeInfo.addAction(131072);
    }
    if ((isFocused()) && (d.iW(18)))
    {
      paramAccessibilityNodeInfo.addAction(16384);
      paramAccessibilityNodeInfo.addAction(32768);
      paramAccessibilityNodeInfo.addAction(65536);
    }
    if ((d.iW(19)) && (this.eNP.getMaxLines() > 1))
      paramAccessibilityNodeInfo.setMultiLine(true);
    AppMethodBeat.o(105754);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(105746);
    if (this.eNP == null)
    {
      super.onMeasure(paramInt1, paramInt2);
      AppMethodBeat.o(105746);
    }
    while (true)
    {
      return;
      Point localPoint = this.eNP.ce(paramInt1, paramInt2);
      if (localPoint != null)
      {
        setMeasuredDimension(localPoint.x, localPoint.y);
        AppMethodBeat.o(105746);
      }
      else
      {
        super.onMeasure(paramInt1, paramInt2);
        AppMethodBeat.o(105746);
      }
    }
  }

  public void onPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    AppMethodBeat.i(105753);
    super.onPopulateAccessibilityEvent(paramAccessibilityEvent);
    if (!bo.ac(getText()))
      paramAccessibilityEvent.getText().add(getText());
    AppMethodBeat.o(105753);
  }

  public void onStartTemporaryDetach()
  {
    AppMethodBeat.i(105749);
    super.onStartTemporaryDetach();
    AppMethodBeat.o(105749);
  }

  public boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(105743);
    boolean bool1;
    if (getTvLayout() == null)
    {
      bool1 = false;
      AppMethodBeat.o(105743);
    }
    while (true)
    {
      return bool1;
      boolean bool2 = this.eNP.t(paramMotionEvent);
      bool1 = super.onTouchEvent(paramMotionEvent);
      if (bool2)
      {
        bool1 = true;
        AppMethodBeat.o(105743);
      }
      else
      {
        AppMethodBeat.o(105743);
      }
    }
  }

  public boolean performClick()
  {
    boolean bool = false;
    AppMethodBeat.i(105744);
    if (this.eNP == null)
      AppMethodBeat.o(105744);
    while (true)
    {
      return bool;
      if (!this.eNP.performClick())
      {
        AppMethodBeat.o(105744);
      }
      else
      {
        bool = super.performClick();
        AppMethodBeat.o(105744);
      }
    }
  }

  public void setClickable(boolean paramBoolean)
  {
    AppMethodBeat.i(105742);
    super.setClickable(paramBoolean);
    if (this.eNP != null)
      this.eNP.eNX = paramBoolean;
    AppMethodBeat.o(105742);
  }

  protected void setConfig(com.tencent.mm.kiss.widget.textview.a.a parama)
  {
    this.eNP.eNR = parama;
  }

  public void setGravity(int paramInt)
  {
    AppMethodBeat.i(105723);
    this.eNP.setGravity(paramInt);
    AppMethodBeat.o(105723);
  }

  public void setHandleClickableSpan(boolean paramBoolean)
  {
    this.eNP.eNY = paramBoolean;
  }

  public void setLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    AppMethodBeat.i(105731);
    if (this.eNP != null)
      this.eNP.SR();
    super.setLayoutParams(paramLayoutParams);
    AppMethodBeat.o(105731);
  }

  public void setLines(int paramInt)
  {
    AppMethodBeat.i(105727);
    this.eNP.setLines(paramInt);
    AppMethodBeat.o(105727);
  }

  public void setMaxLines(int paramInt)
  {
    AppMethodBeat.i(105724);
    this.eNP.setMaxLines(paramInt);
    AppMethodBeat.o(105724);
  }

  public void setMinLines(int paramInt)
  {
    AppMethodBeat.i(105726);
    this.eNP.setMinLines(paramInt);
    AppMethodBeat.o(105726);
  }

  public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(105732);
    if (this.eNP != null)
      this.eNP.SR();
    super.setPadding(paramInt1, paramInt2, paramInt3, paramInt4);
    AppMethodBeat.o(105732);
  }

  public void setSingleLine(boolean paramBoolean)
  {
    AppMethodBeat.i(105728);
    this.eNP.setSingleLine(paramBoolean);
    AppMethodBeat.o(105728);
  }

  public void setText(CharSequence paramCharSequence)
  {
    AppMethodBeat.i(105730);
    setText(paramCharSequence, true);
    AppMethodBeat.o(105730);
  }

  public final void setText(CharSequence paramCharSequence, boolean paramBoolean)
  {
    AppMethodBeat.i(105729);
    this.eNP.setText(paramCharSequence, paramBoolean);
    setContentDescription(paramCharSequence);
    AppMethodBeat.o(105729);
  }

  public void setTextColor(int paramInt)
  {
    AppMethodBeat.i(105722);
    this.eNP.setTextColor(paramInt);
    AppMethodBeat.o(105722);
  }

  public void setTextLayout(f paramf)
  {
    AppMethodBeat.i(105721);
    this.eNP.setTextLayout(paramf);
    AppMethodBeat.o(105721);
  }

  public void setTextSize(float paramFloat)
  {
    AppMethodBeat.i(105719);
    this.eNP.setTextSize(0, paramFloat);
    AppMethodBeat.o(105719);
  }

  public final void setTextSize$255e752(float paramFloat)
  {
    AppMethodBeat.i(105720);
    this.eNP.setTextSize(1, paramFloat);
    AppMethodBeat.o(105720);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.kiss.widget.textview.StaticTextView
 * JD-Core Version:    0.6.2
 */