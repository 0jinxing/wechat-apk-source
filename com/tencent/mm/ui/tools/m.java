package com.tencent.mm.ui.tools;

import android.content.Context;
import android.view.View;
import android.widget.ScrollView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class m
{
  public static void a(Context paramContext, ScrollView paramScrollView, View paramView1, View paramView2, View paramView3)
  {
    AppMethodBeat.i(107752);
    if (paramView3 == null)
      AppMethodBeat.o(107752);
    while (true)
    {
      return;
      paramScrollView.post(new m.1(paramView3, paramContext, paramView1, paramView2, paramScrollView));
      AppMethodBeat.o(107752);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.tools.m
 * JD-Core Version:    0.6.2
 */