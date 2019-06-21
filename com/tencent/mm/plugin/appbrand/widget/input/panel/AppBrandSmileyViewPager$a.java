package com.tencent.mm.plugin.appbrand.widget.input.panel;

import android.support.v4.view.p;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.ref.SoftReference;

final class AppBrandSmileyViewPager$a extends p
{
  SparseArray<SoftReference<View>> jiR;
  private boolean jiS;
  c jir;

  AppBrandSmileyViewPager$a()
  {
    AppMethodBeat.i(134333);
    this.jiR = new SparseArray();
    this.jiS = false;
    AppMethodBeat.o(134333);
  }

  public final void destroyItem(ViewGroup paramViewGroup, int paramInt, Object paramObject)
  {
    AppMethodBeat.i(134337);
    paramViewGroup.removeView((View)paramObject);
    AppMethodBeat.o(134337);
  }

  public final int getCount()
  {
    AppMethodBeat.i(134336);
    int i = this.jir.aRH().getPageCount();
    AppMethodBeat.o(134336);
    return i;
  }

  public final int getItemPosition(Object paramObject)
  {
    AppMethodBeat.i(134334);
    int i;
    if (this.jiS)
    {
      i = -2;
      AppMethodBeat.o(134334);
    }
    while (true)
    {
      return i;
      i = super.getItemPosition(paramObject);
      AppMethodBeat.o(134334);
    }
  }

  public final Object instantiateItem(ViewGroup paramViewGroup, int paramInt)
  {
    AppMethodBeat.i(134338);
    View localView = null;
    if (this.jiR.get(paramInt) != null)
      localView = (View)((SoftReference)this.jiR.get(paramInt)).get();
    if (localView == null)
    {
      localView = this.jir.aRH().qN(paramInt);
      if (localView != null)
      {
        paramViewGroup.addView(localView, 0);
        this.jiR.put(paramInt, new SoftReference(localView));
        AppMethodBeat.o(134338);
      }
    }
    for (paramViewGroup = localView; ; paramViewGroup = localView)
    {
      return paramViewGroup;
      ab.e("MicroMsg.AppBrandSmileyViewPagerAdapter", "contentView == null!");
      break;
      if (localView.getParent() != null)
        ((ViewGroup)localView.getParent()).removeView(localView);
      paramViewGroup.addView(localView, 0);
      AppMethodBeat.o(134338);
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
    AppMethodBeat.i(134335);
    this.jiS = true;
    super.notifyDataSetChanged();
    this.jiS = false;
    AppMethodBeat.o(134335);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.panel.AppBrandSmileyViewPager.a
 * JD-Core Version:    0.6.2
 */