package com.tencent.mm.plugin.luckymoney.scaledLayout;

import android.support.v7.widget.RecyclerView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class d
{
  public static void a(RecyclerView paramRecyclerView, ViewPagerLayoutManager paramViewPagerLayoutManager, int paramInt)
  {
    AppMethodBeat.i(42484);
    paramInt = paramViewPagerLayoutManager.qY(paramInt);
    if (paramViewPagerLayoutManager.mOrientation == 1)
    {
      paramRecyclerView.a(0, paramInt, null);
      AppMethodBeat.o(42484);
    }
    while (true)
    {
      return;
      paramRecyclerView.a(paramInt, 0, null);
      AppMethodBeat.o(42484);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.scaledLayout.d
 * JD-Core Version:    0.6.2
 */