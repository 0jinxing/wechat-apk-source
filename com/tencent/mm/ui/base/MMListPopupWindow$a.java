package com.tencent.mm.ui.base;

import android.content.Context;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class MMListPopupWindow$a extends ListView
{
  private boolean aid;
  private boolean aie;

  private MMListPopupWindow$a(Context paramContext, boolean paramBoolean)
  {
    super(paramContext, null, 2130772192);
    AppMethodBeat.i(112507);
    this.aie = paramBoolean;
    setCacheColorHint(0);
    AppMethodBeat.o(112507);
  }

  final int dt(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(112512);
    int i = getListPaddingTop();
    int j = getListPaddingBottom();
    int k = getDividerHeight();
    Object localObject = getDivider();
    ListAdapter localListAdapter = getAdapter();
    if (localListAdapter == null)
    {
      paramInt2 = i + j;
      AppMethodBeat.o(112512);
      return paramInt2;
    }
    i += j;
    label66: int n;
    label84: int i1;
    if ((k > 0) && (localObject != null))
    {
      int m = localListAdapter.getCount();
      n = 0;
      j = 0;
      localObject = null;
      if (n >= m)
        break label244;
      i1 = localListAdapter.getItemViewType(n);
      if (i1 == j)
        break label254;
      localObject = null;
      j = i1;
    }
    label138: label228: label238: label244: label254: 
    while (true)
    {
      localObject = localListAdapter.getView(n, (View)localObject, this);
      if (localObject == null)
      {
        i1 = 0;
        if (i1 <= 0)
          break label228;
      }
      for (i1 = View.MeasureSpec.makeMeasureSpec(i1, 1073741824); ; i1 = View.MeasureSpec.makeMeasureSpec(0, 0))
      {
        if (localObject != null)
          ((View)localObject).measure(paramInt1, i1);
        i1 = i;
        if (n > 0)
          i1 = i + k;
        i = i1;
        if (localObject != null)
          i = i1 + ((View)localObject).getMeasuredHeight();
        if (i < paramInt2)
          break label238;
        AppMethodBeat.o(112512);
        break;
        k = 0;
        break label66;
        i1 = ((View)localObject).getLayoutParams().height;
        break label138;
      }
      n++;
      break label84;
      AppMethodBeat.o(112512);
      paramInt2 = i;
      break;
    }
  }

  public final boolean hasFocus()
  {
    AppMethodBeat.i(112511);
    boolean bool;
    if ((this.aie) || (super.hasFocus()))
    {
      bool = true;
      AppMethodBeat.o(112511);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(112511);
    }
  }

  public final boolean hasWindowFocus()
  {
    AppMethodBeat.i(112509);
    boolean bool;
    if ((this.aie) || (super.hasWindowFocus()))
    {
      bool = true;
      AppMethodBeat.o(112509);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(112509);
    }
  }

  public final boolean isFocused()
  {
    AppMethodBeat.i(112510);
    boolean bool;
    if ((this.aie) || (super.isFocused()))
    {
      bool = true;
      AppMethodBeat.o(112510);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(112510);
    }
  }

  public final boolean isInTouchMode()
  {
    AppMethodBeat.i(112508);
    boolean bool;
    if (((this.aie) && (this.aid)) || (super.isInTouchMode()))
    {
      bool = true;
      AppMethodBeat.o(112508);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(112508);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.base.MMListPopupWindow.a
 * JD-Core Version:    0.6.2
 */