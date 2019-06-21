package com.tencent.mm.plugin.fav.ui.d;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.a.y;
import com.tencent.mm.plugin.fav.ui.l;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.abh;

public final class q extends a
{
  public q(l paraml)
  {
    super(paraml);
  }

  public final View a(View paramView, ViewGroup paramViewGroup, com.tencent.mm.plugin.fav.a.g paramg)
  {
    AppMethodBeat.i(74661);
    Context localContext = paramViewGroup.getContext();
    int i;
    if (paramView == null)
    {
      paramViewGroup = new q.a();
      paramView = a(View.inflate(localContext, 2130969516, null), paramViewGroup, paramg);
      paramViewGroup.gnB = ((TextView)paramView.findViewById(2131820619));
      a(paramViewGroup, paramg);
      i = (int)b.fY(b.c(paramg).duration);
      paramg = paramViewGroup.gnB;
      paramViewGroup = this.mhy.context;
      if (i > 0)
        break label130;
    }
    label130: for (paramViewGroup = paramViewGroup.getString(2131299763, new Object[] { Integer.valueOf(0) }); ; paramViewGroup = paramViewGroup.getString(2131299763, new Object[] { Integer.valueOf(i) }))
    {
      paramg.setText(paramViewGroup);
      AppMethodBeat.o(74661);
      return paramView;
      paramViewGroup = (q.a)paramView.getTag();
      break;
    }
  }

  public final void a(View paramView, abh paramabh)
  {
    AppMethodBeat.i(74662);
    q.a locala = (q.a)paramView.getTag();
    paramView = paramView.getContext();
    ((y)com.tencent.mm.kernel.g.K(y.class)).a(paramView, locala.mgf, paramabh);
    AppMethodBeat.o(74662);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.d.q
 * JD-Core Version:    0.6.2
 */