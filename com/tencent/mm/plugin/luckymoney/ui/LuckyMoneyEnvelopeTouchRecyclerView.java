package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class LuckyMoneyEnvelopeTouchRecyclerView extends RecyclerView
{
  public LuckyMoneyEnvelopeTouchRecyclerView.a oeF;

  public LuckyMoneyEnvelopeTouchRecyclerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }

  public LuckyMoneyEnvelopeTouchRecyclerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
  }

  public boolean onInterceptTouchEvent(MotionEvent paramMotionEvent)
  {
    AppMethodBeat.i(42720);
    if (this.oeF != null)
      this.oeF.onInterceptTouchEvent(paramMotionEvent);
    boolean bool = super.onInterceptTouchEvent(paramMotionEvent);
    AppMethodBeat.o(42720);
    return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyEnvelopeTouchRecyclerView
 * JD-Core Version:    0.6.2
 */