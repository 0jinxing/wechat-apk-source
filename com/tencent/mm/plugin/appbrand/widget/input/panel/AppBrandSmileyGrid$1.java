package com.tencent.mm.plugin.appbrand.widget.input.panel;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cb.e;

final class AppBrandSmileyGrid$1
  implements AdapterView.OnItemClickListener
{
  AppBrandSmileyGrid$1(AppBrandSmileyGrid paramAppBrandSmileyGrid)
  {
  }

  public final void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    AppMethodBeat.i(134307);
    if (paramInt == AppBrandSmileyGrid.a(this.jiC).getCount() - 1)
    {
      if (AppBrandSmileyGrid.b(this.jiC).jiK != null)
        AppBrandSmileyGrid.b(this.jiC).jiK.aRg();
      AppMethodBeat.o(134307);
    }
    while (true)
    {
      return;
      if (AppBrandSmileyGrid.c(this.jiC) * (AppBrandSmileyGrid.d(this.jiC) - 1) + paramInt >= AppBrandSmileyGrid.e(this.jiC))
      {
        AppMethodBeat.o(134307);
      }
      else
      {
        int i = AppBrandSmileyGrid.c(this.jiC);
        int j = AppBrandSmileyGrid.d(this.jiC);
        if (AppBrandSmileyGrid.b(this.jiC).jiK != null)
          AppBrandSmileyGrid.b(this.jiC).jiK.append(AppBrandSmileyGrid.b(this.jiC).aRr().qL(i * (j - 1) + paramInt));
        AppMethodBeat.o(134307);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.input.panel.AppBrandSmileyGrid.1
 * JD-Core Version:    0.6.2
 */