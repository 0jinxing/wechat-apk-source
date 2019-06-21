package com.tencent.mm.plugin.radar.ui;

import a.f;
import a.f.a.a;
import a.f.b.j;
import a.g;
import a.k;
import a.l;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"unsafeLazy", "Lkotlin/Lazy;", "T", "initializer", "Lkotlin/Function0;", "bind", "Landroid/view/View;", "Landroid/app/Activity;", "idRes", "", "plugin-radar_release"})
public final class i
{
  public static final <T extends View> f<T> aa(View paramView, int paramInt)
  {
    AppMethodBeat.i(103140);
    j.p(paramView, "receiver$0");
    paramView = (a)new i.b(paramView, paramInt);
    paramView = g.a(k.AUn, paramView);
    AppMethodBeat.o(103140);
    return paramView;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.radar.ui.i
 * JD-Core Version:    0.6.2
 */