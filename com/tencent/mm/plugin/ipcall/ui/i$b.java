package com.tencent.mm.plugin.ipcall.ui;

import android.support.v4.view.p;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.LinkedList;

public final class i$b extends p
{
  int mCount;
  View.OnClickListener nFP;
  LinkedList<Integer> nFU;
  ArrayList<View> nFV;

  public i$b(i parami)
  {
    AppMethodBeat.i(22349);
    this.nFV = new ArrayList();
    this.mCount = 0;
    AppMethodBeat.o(22349);
  }

  public final void destroyItem(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    AppMethodBeat.i(22350);
    ab.v("MicroMsg.IPCallShareDialog", "destroy item: %d", new Object[] { Integer.valueOf(paramInt) });
    paramViewGroup.removeView((View)paramObject);
    AppMethodBeat.o(22350);
  }

  public final int getCount()
  {
    return this.mCount;
  }

  public final int getItemPosition(Object paramObject)
  {
    AppMethodBeat.i(22352);
    int i = super.getItemPosition(paramObject);
    AppMethodBeat.o(22352);
    return i;
  }

  public final Object instantiateItem(ViewGroup paramViewGroup, int paramInt)
  {
    AppMethodBeat.i(22351);
    if (this.nFV.get(paramInt) != null);
    for (View localView = (View)this.nFV.get(paramInt); ; localView = null)
    {
      if (localView != null)
      {
        if (localView.getParent() != null)
          ((ViewGroup)localView.getParent()).removeView(localView);
        if (paramViewGroup != null)
          paramViewGroup.addView(localView, 0);
      }
      AppMethodBeat.o(22351);
      return localView;
    }
  }

  public final boolean isViewFromObject(View paramView, Object paramObject)
  {
    if (paramView == paramObject);
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.i.b
 * JD-Core Version:    0.6.2
 */