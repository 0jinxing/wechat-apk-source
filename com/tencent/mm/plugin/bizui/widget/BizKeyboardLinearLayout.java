package com.tencent.mm.plugin.bizui.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.KeyboardLinearLayout;

public class BizKeyboardLinearLayout extends KeyboardLinearLayout
{
  private boolean jED;
  private int jEE;
  private int jEF;
  private int jEG;
  private boolean mHasInit = false;
  private int mHeight;

  public BizKeyboardLinearLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public BizKeyboardLinearLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public final int getKeyBoardHeight()
  {
    return this.jEF;
  }

  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(70045);
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    AppMethodBeat.o(70045);
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(70046);
    super.onMeasure(paramInt1, paramInt2);
    AppMethodBeat.o(70046);
  }

  public final void rP(int paramInt)
  {
    AppMethodBeat.i(70047);
    ab.d("MicroMsg.WebViewKeyboardLinearLayout", "onLayout : b: " + paramInt + " mHasInit: " + this.mHasInit + " mHasKeyboard: " + this.jED);
    Rect localRect = new Rect();
    getWindowVisibleDisplayFrame(localRect);
    int i = getRootView().getHeight();
    if (!this.mHasInit)
    {
      this.mHasInit = true;
      this.mHeight = paramInt;
      ab.i("MicroMsg.WebViewKeyboardLinearLayout", "init height:%d", new Object[] { Integer.valueOf(this.mHeight) });
      sD(-1);
      this.jEG = (i - localRect.bottom);
    }
    ab.d("MicroMsg.WebViewKeyboardLinearLayout", "onLayout, current rect = %s", new Object[] { localRect.toString() });
    int j = localRect.height();
    this.mHeight = j;
    ab.d("MicroMsg.WebViewKeyboardLinearLayout", "onLayout, usableHeightNow = %d, previousUsableHeight = %d", new Object[] { Integer.valueOf(j), Integer.valueOf(this.jEE) });
    if (this.jEE != j)
    {
      int k = getRootView().getHeight() - this.jEG - localRect.top;
      i = k - j;
      if (i <= k / 4)
        break label298;
      this.jED = true;
      this.jEF = i;
      sD(-3);
      ab.w("MicroMsg.WebViewKeyboardLinearLayout", "onLayout, show keyboard!! mHeight: " + this.mHeight + " b: " + paramInt + " mKBHeight: " + this.jEF);
    }
    while (true)
    {
      this.jEE = j;
      AppMethodBeat.o(70047);
      return;
      label298: this.jED = false;
      sD(-2);
      ab.w("MicroMsg.WebViewKeyboardLinearLayout", "onLayout, hide keyboard!! mHeight: " + this.mHeight + " b: " + paramInt);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.bizui.widget.BizKeyboardLinearLayout
 * JD-Core Version:    0.6.2
 */