package com.tencent.mm.plugin.appbrand.ui;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.h;
import android.support.v7.widget.RecyclerView.s;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;

final class AppBrandProfileUI$18 extends RecyclerView.h
{
  AppBrandProfileUI$18(AppBrandProfileUI paramAppBrandProfileUI)
  {
  }

  public final void a(Rect paramRect, View paramView, RecyclerView paramRecyclerView, RecyclerView.s params)
  {
    AppMethodBeat.i(133043);
    int i = a.al(this.iIf, 2131428059);
    int j = a.al(this.iIf, 2131428054);
    if (RecyclerView.bo(paramView) == 0);
    for (paramRect.left = i; ; paramRect.left = 0)
    {
      paramRect.right = j;
      AppMethodBeat.o(133043);
      return;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandProfileUI.18
 * JD-Core Version:    0.6.2
 */