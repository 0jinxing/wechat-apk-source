package com.tencent.mm.pluginsdk.ui.chat;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View.MeasureSpec;
import android.widget.ScrollView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.R.a;

public class MaxHeightScrollView extends ScrollView
{
  private int dj;

  public MaxHeightScrollView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(27951);
    init(paramContext, paramAttributeSet);
    AppMethodBeat.o(27951);
  }

  public MaxHeightScrollView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(27952);
    init(paramContext, paramAttributeSet);
    AppMethodBeat.o(27952);
  }

  private void init(Context paramContext, AttributeSet paramAttributeSet)
  {
    int i = 0;
    AppMethodBeat.i(27953);
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, R.a.MaxHeightScrollView, 0, 0);
    try
    {
      int j = paramContext.getIndexCount();
      while (i < j)
      {
        int k = paramContext.getIndex(i);
        if (k == 0)
          setMaxHeight(paramContext.getDimensionPixelSize(k, -1));
        i++;
      }
      return;
    }
    finally
    {
      paramContext.recycle();
      AppMethodBeat.o(27953);
    }
    throw paramAttributeSet;
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(27954);
    if (this.dj > 0)
      paramInt2 = View.MeasureSpec.makeMeasureSpec(this.dj, -2147483648);
    super.onMeasure(paramInt1, paramInt2);
    AppMethodBeat.o(27954);
  }

  public void setMaxHeight(int paramInt)
  {
    this.dj = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.chat.MaxHeightScrollView
 * JD-Core Version:    0.6.2
 */