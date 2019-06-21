package com.tencent.mm.ui.widget.sortlist;

import android.content.Context;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView.LayoutParams;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class b extends ViewGroup
{
  private int Hu;

  public b(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(113018);
    this.Hu = 48;
    setLayoutParams(new AbsListView.LayoutParams(-1, -2));
    AppMethodBeat.o(113018);
  }

  public int getGravity()
  {
    return this.Hu;
  }

  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    AppMethodBeat.i(113019);
    View localView = getChildAt(0);
    if (localView == null)
      AppMethodBeat.o(113019);
    while (true)
    {
      return;
      if (this.Hu == 48)
      {
        localView.layout(0, 0, getMeasuredWidth(), localView.getMeasuredHeight());
        AppMethodBeat.o(113019);
      }
      else
      {
        localView.layout(0, getMeasuredHeight() - localView.getMeasuredHeight(), getMeasuredWidth(), getMeasuredHeight());
        AppMethodBeat.o(113019);
      }
    }
  }

  protected void onMeasure(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(113020);
    int i = View.MeasureSpec.getSize(paramInt2);
    int j = View.MeasureSpec.getSize(paramInt1);
    paramInt2 = View.MeasureSpec.getMode(paramInt2);
    View localView = getChildAt(0);
    if (localView == null)
    {
      setMeasuredDimension(0, j);
      AppMethodBeat.o(113020);
      return;
    }
    if (localView.isLayoutRequested())
      measureChild(localView, paramInt1, View.MeasureSpec.makeMeasureSpec(0, 0));
    paramInt1 = i;
    ViewGroup.LayoutParams localLayoutParams;
    if (paramInt2 == 0)
    {
      localLayoutParams = getLayoutParams();
      if (localLayoutParams.height <= 0)
        break label107;
    }
    label107: for (paramInt1 = localLayoutParams.height; ; paramInt1 = localView.getMeasuredHeight())
    {
      setMeasuredDimension(j, paramInt1);
      AppMethodBeat.o(113020);
      break;
    }
  }

  public void setGravity(int paramInt)
  {
    this.Hu = paramInt;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.sortlist.b
 * JD-Core Version:    0.6.2
 */