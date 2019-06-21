package com.tencent.mm.plugin.wenote.ui.nativenote.b;

import android.util.SparseArray;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class g
{
  public static final int uUv = 2130970316;
  public static final int uUw = 2130970315;
  public static final int uUx = 2130970313;
  public SparseArray<Integer> uUy;

  public g()
  {
    AppMethodBeat.i(27161);
    this.uUy = new SparseArray();
    this.uUy.put(1, Integer.valueOf(uUv));
    this.uUy.put(2, Integer.valueOf(uUw));
    this.uUy.put(4, Integer.valueOf(uUw));
    this.uUy.put(3, Integer.valueOf(uUw));
    this.uUy.put(5, Integer.valueOf(uUw));
    this.uUy.put(6, Integer.valueOf(uUw));
    this.uUy.put(0, Integer.valueOf(uUw));
    this.uUy.put(-1, Integer.valueOf(uUw));
    this.uUy.put(-3, Integer.valueOf(uUx));
    this.uUy.put(-2, Integer.valueOf(uUw));
    this.uUy.put(-4, Integer.valueOf(uUw));
    this.uUy.put(20, Integer.valueOf(uUw));
    AppMethodBeat.o(27161);
  }

  public static a a(int paramInt, View paramView, com.tencent.mm.plugin.wenote.model.nativenote.manager.k paramk)
  {
    AppMethodBeat.i(27162);
    switch (paramInt)
    {
    case 7:
    case 8:
    case 9:
    case 10:
    case 11:
    case 12:
    case 13:
    case 14:
    case 15:
    case 16:
    case 17:
    case 18:
    case 19:
    default:
      paramView = null;
      AppMethodBeat.o(27162);
    case 1:
    case 0:
    case 2:
    case 4:
    case 3:
    case 5:
    case 6:
    case -1:
    case -3:
    case -2:
    case -4:
    case 20:
    }
    while (true)
    {
      return paramView;
      paramView = new l(paramView, paramk);
      AppMethodBeat.o(27162);
      continue;
      paramView = new m(paramView, paramk);
      AppMethodBeat.o(27162);
      continue;
      paramView = new f(paramView, paramk);
      AppMethodBeat.o(27162);
      continue;
      paramView = new o(paramView, paramk);
      AppMethodBeat.o(27162);
      continue;
      paramView = new h(paramView, paramk);
      AppMethodBeat.o(27162);
      continue;
      paramView = new d(paramView, paramk);
      AppMethodBeat.o(27162);
      continue;
      paramView = new n(paramView, paramk);
      AppMethodBeat.o(27162);
      continue;
      paramView = new k(paramView, paramk);
      AppMethodBeat.o(27162);
      continue;
      paramView = new e(paramView, paramk);
      AppMethodBeat.o(27162);
      continue;
      paramView = new b(paramView, paramk);
      AppMethodBeat.o(27162);
      continue;
      paramView = new j(paramView, paramk);
      AppMethodBeat.o(27162);
      continue;
      paramView = new c(paramView, paramk);
      AppMethodBeat.o(27162);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.b.g
 * JD-Core Version:    0.6.2
 */