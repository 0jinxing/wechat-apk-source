package com.tencent.mm.plugin.appbrand.widget.input.autofill;

import android.content.Context;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class AutoFillListPopupWindowBase$a extends ListView
{
  private boolean aid;
  private boolean aie;

  public AutoFillListPopupWindowBase$a(Context paramContext, boolean paramBoolean)
  {
    super(paramContext, null, 2130772192);
    AppMethodBeat.i(123909);
    this.aie = paramBoolean;
    setCacheColorHint(0);
    AppMethodBeat.o(123909);
  }

  final int dt(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(123914);
    int i = getListPaddingTop();
    int j = getListPaddingBottom();
    getListPaddingLeft();
    getListPaddingRight();
    int k = getDividerHeight();
    Object localObject = getDivider();
    ListAdapter localListAdapter = getAdapter();
    if (localListAdapter == null)
    {
      paramInt2 = i + j;
      AppMethodBeat.o(123914);
      return paramInt2;
    }
    i = j + i;
    label76: int n;
    label94: int i2;
    if ((k > 0) && (localObject != null))
    {
      int m = localListAdapter.getCount();
      j = 0;
      n = 0;
      localObject = null;
      if (j >= m)
        break label233;
      int i1 = localListAdapter.getItemViewType(j);
      i2 = n;
      if (i1 != n)
      {
        i2 = i1;
        localObject = null;
      }
      localObject = localListAdapter.getView(j, (View)localObject, this);
      n = ((View)localObject).getLayoutParams().height;
      if (n <= 0)
        break label213;
      n = View.MeasureSpec.makeMeasureSpec(n, 1073741824);
      label168: ((View)localObject).measure(paramInt1, n);
      if (j <= 0)
        break label243;
      i += k;
    }
    label213: label233: label243: 
    while (true)
    {
      i = ((View)localObject).getMeasuredHeight() + i;
      if (i >= paramInt2)
      {
        AppMethodBeat.o(123914);
        break;
        k = 0;
        break label76;
        n = View.MeasureSpec.makeMeasureSpec(0, 0);
        break label168;
      }
      j++;
      n = i2;
      break label94;
      AppMethodBeat.o(123914);
      paramInt2 = i;
      break;
    }
  }

  public final boolean hasFocus()
  {
    AppMethodBeat.i(123913);
    boolean bool;
    if ((this.aie) || (super.hasFocus()))
    {
      bool = true;
      AppMethodBeat.o(123913);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(123913);
    }
  }

  public final boolean hasWindowFocus()
  {
    AppMethodBeat.i(123911);
    boolean bool;
    if ((this.aie) || (super.hasWindowFocus()))
    {
      bool = true;
      AppMethodBeat.o(123911);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(123911);
    }
  }

  public final boolean isFocused()
  {
    AppMethodBeat.i(123912);
    boolean bool;
    if ((this.aie) || (super.isFocused()))
    {
      bool = true;
      AppMethodBeat.o(123912);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(123912);
    }
  }

  public final boolean isInTouchMode()
  {
    AppMethodBeat.i(123910);
    boolean bool;
    if (((this.aie) && (this.aid)) || (super.isInTouchMode()))
    {
      bool = true;
      AppMethodBeat.o(123910);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(123910);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.autofill.AutoFillListPopupWindowBase.a
 * JD-Core Version:    0.6.2
 */