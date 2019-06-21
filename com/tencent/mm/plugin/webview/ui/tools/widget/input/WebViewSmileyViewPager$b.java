package com.tencent.mm.plugin.webview.ui.tools.widget.input;

import android.support.v4.view.p;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.SoftReference;

final class WebViewSmileyViewPager$b extends p
{
  SparseArray<SoftReference<View>> jiR;
  private boolean jiS;
  c uKz;

  WebViewSmileyViewPager$b()
  {
    AppMethodBeat.i(10120);
    this.jiR = new SparseArray();
    this.jiS = false;
    AppMethodBeat.o(10120);
  }

  public final void destroyItem(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    AppMethodBeat.i(10124);
    paramViewGroup.removeView((View)paramObject);
    AppMethodBeat.o(10124);
  }

  public final int getCount()
  {
    AppMethodBeat.i(10123);
    int i = this.uKz.ddb().getPageCount();
    AppMethodBeat.o(10123);
    return i;
  }

  public final int getItemPosition(Object paramObject)
  {
    AppMethodBeat.i(10121);
    int i;
    if (this.jiS)
    {
      i = -2;
      AppMethodBeat.o(10121);
    }
    while (true)
    {
      return i;
      i = super.getItemPosition(paramObject);
      AppMethodBeat.o(10121);
    }
  }

  public final Object instantiateItem(ViewGroup paramViewGroup, int paramInt)
  {
    AppMethodBeat.i(10125);
    View localView = null;
    if (this.jiR.get(paramInt) != null)
      localView = (View)((SoftReference)this.jiR.get(paramInt)).get();
    if (localView == null)
    {
      localView = this.uKz.ddb().qN(paramInt);
      if (localView != null)
      {
        paramViewGroup.addView(localView, 0);
        this.jiR.put(paramInt, new SoftReference(localView));
        AppMethodBeat.o(10125);
      }
    }
    while (true)
    {
      return localView;
      ab.e("MicroMsg.WebViewSmileyViewPagerAdapter", "contentView == null!");
      break;
      if (localView.getParent() != null)
        ((ViewGroup)localView.getParent()).removeView(localView);
      paramViewGroup.addView(localView, 0);
      AppMethodBeat.o(10125);
    }
  }

  public final boolean isViewFromObject(View paramView, Object paramObject)
  {
    if (paramView == paramObject);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void notifyDataSetChanged()
  {
    AppMethodBeat.i(10122);
    this.jiS = true;
    super.notifyDataSetChanged();
    this.jiS = false;
    AppMethodBeat.o(10122);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.widget.input.WebViewSmileyViewPager.b
 * JD-Core Version:    0.6.2
 */