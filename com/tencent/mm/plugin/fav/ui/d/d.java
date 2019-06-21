package com.tencent.mm.plugin.fav.ui.d;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.a.y;
import com.tencent.mm.plugin.fav.ui.l;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.abh;

public final class d extends a
{
  private static int moM;

  public d(l paraml)
  {
    super(paraml);
    AppMethodBeat.i(74620);
    moM = com.tencent.mm.bz.a.al(paraml.context, 2131427657);
    AppMethodBeat.o(74620);
  }

  public final View a(View paramView, ViewGroup paramViewGroup, com.tencent.mm.plugin.fav.a.g paramg)
  {
    AppMethodBeat.i(74621);
    Object localObject = paramViewGroup.getContext();
    if (paramView == null)
    {
      paramViewGroup = new a();
      paramView = a(View.inflate((Context)localObject, 2130969511, null), paramViewGroup, paramg);
      paramViewGroup.moN = ((ImageView)paramView.findViewById(2131823917));
    }
    while (true)
    {
      a(paramViewGroup, paramg);
      localObject = b.c(paramg);
      paramViewGroup = paramViewGroup.moN;
      int i = moM;
      l.a(paramViewGroup, (aar)localObject, paramg, false, i, i);
      AppMethodBeat.o(74621);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
    }
  }

  public final void a(View paramView, abh paramabh)
  {
    AppMethodBeat.i(74622);
    a locala = (a)paramView.getTag();
    paramView = paramView.getContext();
    ((y)com.tencent.mm.kernel.g.K(y.class)).a(paramView, locala.mgf, paramabh);
    AppMethodBeat.o(74622);
  }

  public static final class a extends a.b
  {
    ImageView moN;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.d.d
 * JD-Core Version:    0.6.2
 */