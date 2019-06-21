package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.support.v4.widget.NestedScrollView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

public class SnsAdNativeLandingPagesScrollView extends NestedScrollView
{
  private int rnF;
  private int rnG;
  private int rnH;
  private am rnI;
  private long rnJ;
  private Runnable rnK;

  public SnsAdNativeLandingPagesScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(38615);
    this.rnF = 0;
    this.rnG = 0;
    this.rnH = 50;
    this.rnI = null;
    this.rnJ = System.currentTimeMillis();
    this.rnK = new SnsAdNativeLandingPagesScrollView.1(this);
    AppMethodBeat.o(38615);
  }

  public SnsAdNativeLandingPagesScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(38614);
    this.rnF = 0;
    this.rnG = 0;
    this.rnH = 50;
    this.rnI = null;
    this.rnJ = System.currentTimeMillis();
    this.rnK = new SnsAdNativeLandingPagesScrollView.1(this);
    AppMethodBeat.o(38614);
  }

  public final void fling(int paramInt)
  {
    AppMethodBeat.i(38619);
    super.fling(paramInt / 3);
    AppMethodBeat.o(38619);
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(38620);
    boolean bool = super.onInterceptTouchEvent(paramMotionEvent);
    AppMethodBeat.o(38620);
    return bool;
  }

  public void onScrollChanged(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(38616);
    super.onScrollChanged(paramInt1, paramInt2, paramInt3, paramInt4);
    ab.w("SnsAdNativeLandingPagesScrollView", "onScrollChanged x %d,y %d,oldx %d,oldy %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(paramInt4) });
    AppMethodBeat.o(38616);
  }

  public void scrollBy(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(38618);
    super.scrollBy(paramInt1, paramInt2);
    AppMethodBeat.o(38618);
  }

  public void scrollTo(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(38617);
    super.scrollTo(paramInt1, paramInt2);
    AppMethodBeat.o(38617);
  }

  public void setScrollViewListener(am paramam)
  {
    this.rnI = paramam;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsAdNativeLandingPagesScrollView
 * JD-Core Version:    0.6.2
 */