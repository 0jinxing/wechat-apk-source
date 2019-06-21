package com.tencent.mm.plugin.webview.ui.tools.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class MailMMWebView extends MMWebViewWithJsApi
  implements h
{
  private float hke;
  private float hkf;
  private View qpI;
  private boolean uJM;
  private View uJN;
  private boolean uJO;
  private boolean uJP;

  public MailMMWebView(Context paramContext)
  {
    this(paramContext, null, 0);
  }

  public MailMMWebView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public MailMMWebView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  private int getViewHeightWithTitleBar()
  {
    AppMethodBeat.i(10051);
    int i = getHeight();
    int j = i;
    if (isHorizontalScrollBarEnabled())
    {
      j = i;
      if (!overlayHorizontalScrollbar())
        j = i - getHorizontalScrollbarHeight();
    }
    AppMethodBeat.o(10051);
    return j;
  }

  private void setEmbeddedTitleBarSinceJellyBean(View paramView)
  {
    AppMethodBeat.i(10052);
    if (paramView != null)
    {
      if (this.uJN != null)
        removeView(this.uJN);
      if (paramView.getParent() != null)
        ((ViewGroup)paramView.getParent()).removeView(paramView);
      FrameLayout.LayoutParams localLayoutParams1 = new FrameLayout.LayoutParams(-1, -2);
      this.uJN = new MailMMWebView.a(this, getContext());
      FrameLayout.LayoutParams localLayoutParams2 = new FrameLayout.LayoutParams(-1, -2);
      ((MailMMWebView.a)this.uJN).addView(paramView, localLayoutParams2);
      this.uJN.setBackgroundColor(-1);
      addView(this.uJN, localLayoutParams1);
    }
    AppMethodBeat.o(10052);
  }

  public int computeVerticalScrollExtent()
  {
    AppMethodBeat.i(10043);
    int i = getViewHeightWithTitleBar();
    int j = getVisibleTitleBarHeight();
    AppMethodBeat.o(10043);
    return i - j;
  }

  public int computeVerticalScrollOffset()
  {
    AppMethodBeat.i(10044);
    int i = Math.max(getWebScrollY() - getTitleHeight(), 0);
    AppMethodBeat.o(10044);
    return i;
  }

  public final boolean dcQ()
  {
    return this.uJM;
  }

  public final void dcR()
  {
    this.uJM = false;
  }

  public final void dcS()
  {
    AppMethodBeat.i(10049);
    int i = (int)(getTitleHeight() / getScale());
    evaluateJavascript("javascript:_updateTitleBarHeight(" + i + ");", null);
    AppMethodBeat.o(10049);
  }

  public final void dcT()
  {
    AppMethodBeat.i(10050);
    int i = (int)(getBottomHeight() / getScale());
    evaluateJavascript("javascript:_updateBottomBarHeight(" + i + ");", null);
    AppMethodBeat.o(10050);
  }

  public boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(10040);
    float f1 = paramMotionEvent.getX();
    float f2 = paramMotionEvent.getY();
    int i = getWebScrollY();
    boolean bool;
    switch (paramMotionEvent.getAction() & 0xFF)
    {
    case 1:
    default:
      if ((this.uJO) && (this.uJN != null))
      {
        paramMotionEvent.setLocation(f1, f2 + i);
        bool = this.uJN.dispatchTouchEvent(paramMotionEvent);
        AppMethodBeat.o(10040);
      }
      break;
    case 0:
    case 2:
    }
    while (true)
    {
      return bool;
      this.hke = f1;
      this.hkf = f2;
      if ((this.uJN != null) && ((int)this.hkf < getVisibleTitleBarHeight()))
      {
        this.uJO = true;
        break;
      }
      if ((this.qpI == null) || (this.qpI.getVisibility() != 0) || (this.hkf + getBottomHeight() <= getHeight()))
        break;
      this.uJP = true;
      break;
      if ((Math.abs(f2 - this.hkf) <= 50.0F) || (!this.uJO))
        break;
      paramMotionEvent.setAction(3);
      paramMotionEvent.setLocation(this.hke, this.hkf + i);
      this.uJN.dispatchTouchEvent(paramMotionEvent);
      paramMotionEvent.setAction(0);
      paramMotionEvent.setLocation(this.hke, this.hkf);
      super.dispatchTouchEvent(paramMotionEvent);
      paramMotionEvent.setAction(2);
      paramMotionEvent.setLocation(f1, f2);
      break;
      if ((this.uJP) && (this.qpI != null))
      {
        paramMotionEvent.setLocation(f1, f2 + getBottomHeight() - getHeight());
        bool = this.qpI.dispatchTouchEvent(paramMotionEvent);
        AppMethodBeat.o(10040);
      }
      else
      {
        bool = super.dispatchTouchEvent(paramMotionEvent);
        AppMethodBeat.o(10040);
      }
    }
  }

  public boolean drawChild(Canvas paramCanvas, View paramView, long paramLong)
  {
    AppMethodBeat.i(10046);
    boolean bool;
    if (paramView == this.uJN)
    {
      int i = getWebScrollY();
      paramCanvas.save();
      paramCanvas.translate(0.0F, -i);
      bool = super.drawChild(paramCanvas, paramView, paramLong);
      paramCanvas.restore();
    }
    while (true)
    {
      AppMethodBeat.o(10046);
      return bool;
      bool = super.drawChild(paramCanvas, paramView, paramLong);
    }
  }

  public int getBottomHeight()
  {
    AppMethodBeat.i(10048);
    int i;
    if (this.qpI != null)
    {
      i = this.qpI.getHeight();
      AppMethodBeat.o(10048);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(10048);
    }
  }

  public int getTitleHeight()
  {
    AppMethodBeat.i(10047);
    int i;
    if (this.uJN != null)
    {
      i = this.uJN.getHeight();
      AppMethodBeat.o(10047);
    }
    while (true)
    {
      return i;
      i = 0;
      AppMethodBeat.o(10047);
    }
  }

  public int getVisibleTitleBarHeight()
  {
    AppMethodBeat.i(10045);
    int i = Math.max(getTitleHeight() - getWebScrollY(), 0);
    AppMethodBeat.o(10045);
    return i;
  }

  public void loadDataWithBaseURL(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5)
  {
    AppMethodBeat.i(10039);
    this.uJM = true;
    super.loadDataWithBaseURL(paramString1, paramString2, paramString3, paramString4, paramString5);
    AppMethodBeat.o(10039);
  }

  public final void oe(boolean paramBoolean)
  {
    AppMethodBeat.i(10053);
    if (this.qpI != null)
      if (paramBoolean)
      {
        this.qpI.setVisibility(0);
        AppMethodBeat.o(10053);
      }
    while (true)
    {
      return;
      this.qpI.setVisibility(4);
      AppMethodBeat.o(10053);
    }
  }

  public void onWebViewScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(10041);
    int i = (int)(getContentHeight() * getScale());
    int j = getHeight() + paramInt2;
    super.onWebViewScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    invalidate();
    if (i - j < getBottomHeight())
    {
      if (Math.abs(i - j) <= 20)
        break label92;
      dcT();
      oe(false);
    }
    while (true)
    {
      if (getVisibleTitleHeight() == 0)
        dcS();
      AppMethodBeat.o(10041);
      return;
      label92: oe(true);
    }
  }

  public void setEmbeddedBottomBar(View paramView)
  {
    AppMethodBeat.i(10054);
    if (paramView != null)
    {
      if (this.qpI != null)
        removeView(this.qpI);
      if (paramView.getParent() != null)
        ((ViewGroup)paramView.getParent()).removeView(paramView);
      FrameLayout.LayoutParams localLayoutParams1 = new FrameLayout.LayoutParams(-1, -2, 80);
      this.qpI = new MailMMWebView.a(this, getContext());
      FrameLayout.LayoutParams localLayoutParams2 = (FrameLayout.LayoutParams)paramView.getLayoutParams();
      FrameLayout.LayoutParams localLayoutParams3 = new FrameLayout.LayoutParams(-1, -2);
      localLayoutParams3.setMargins(localLayoutParams2.leftMargin, localLayoutParams2.topMargin, localLayoutParams2.rightMargin, localLayoutParams2.bottomMargin);
      ((MailMMWebView.a)this.qpI).addView(paramView, localLayoutParams3);
      addView(this.qpI, localLayoutParams1);
      this.qpI.setVisibility(4);
    }
    AppMethodBeat.o(10054);
  }

  public void setEmbeddedTitleBarCompat(View paramView)
  {
    AppMethodBeat.i(10042);
    setEmbeddedTitleBarSinceJellyBean(paramView);
    AppMethodBeat.o(10042);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.widget.MailMMWebView
 * JD-Core Version:    0.6.2
 */