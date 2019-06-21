package com.tencent.mm.plugin.appbrand.widget.input.panel;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView.LayoutParams;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.cb.e;
import com.tencent.mm.ui.v;

final class AppBrandSmileyGrid$a extends BaseAdapter
{
  private AppBrandSmileyGrid$a(AppBrandSmileyGrid paramAppBrandSmileyGrid)
  {
  }

  public final int getCount()
  {
    AppMethodBeat.i(134308);
    int i = AppBrandSmileyGrid.d(this.jiC);
    AppMethodBeat.o(134308);
    return i;
  }

  public final Object getItem(int paramInt)
  {
    return null;
  }

  public final long getItemId(int paramInt)
  {
    return paramInt;
  }

  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    AppMethodBeat.i(134309);
    if ((paramView == null) || (paramView.getTag() == null))
    {
      paramView = v.hu(new ContextThemeWrapper(this.jiC.getContext(), 2131493184)).inflate(2130968771, null);
      paramView.setLayoutParams(new AbsListView.LayoutParams(-1, (AppBrandSmileyGrid.b(this.jiC).jiL - a.al(this.jiC.getContext(), 2131427786) - a.al(this.jiC.getContext(), 2131428368)) / AppBrandSmileyGrid.f(this.jiC)));
      paramViewGroup = new AppBrandSmileyGrid.b(paramView);
      paramView.setTag(paramViewGroup);
      if (paramInt != getCount() - 1)
        break label168;
      paramViewGroup.iqT.setImageResource(2130838450);
      paramViewGroup.iqT.setContentDescription(this.jiC.getContext().getString(2131298865));
    }
    while (true)
    {
      AppMethodBeat.o(134309);
      return paramView;
      paramViewGroup = (AppBrandSmileyGrid.b)paramView.getTag();
      break;
      label168: paramInt = (AppBrandSmileyGrid.d(this.jiC) - 1) * AppBrandSmileyGrid.c(this.jiC) + paramInt;
      if (paramInt > AppBrandSmileyGrid.e(this.jiC) - 1)
      {
        paramViewGroup.iqT.setImageDrawable(null);
      }
      else
      {
        Drawable localDrawable = AppBrandSmileyGrid.b(this.jiC).aRr().qJ(paramInt);
        paramViewGroup.iqT.setImageDrawable(localDrawable);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.panel.AppBrandSmileyGrid.a
 * JD-Core Version:    0.6.2
 */