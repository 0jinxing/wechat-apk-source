package com.tencent.mm.view;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class ScrollRectRecyclerView extends RecyclerView
{
  public int scrollX;
  public int scrollY;
  private int zZX;

  public ScrollRectRecyclerView(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }

  public ScrollRectRecyclerView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(62895);
    this.zZX = getResources().getDimensionPixelSize(2131428368);
    AppMethodBeat.o(62895);
  }

  public final void ap(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(62896);
    super.ap(paramInt1, paramInt2);
    this.scrollX += paramInt1;
    this.scrollY += paramInt2;
    AppMethodBeat.o(62896);
  }

  public void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(62897);
    super.onMeasure(paramInt1, View.MeasureSpec.makeMeasureSpec(this.zZX, 1073741824));
    AppMethodBeat.o(62897);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.view.ScrollRectRecyclerView
 * JD-Core Version:    0.6.2
 */