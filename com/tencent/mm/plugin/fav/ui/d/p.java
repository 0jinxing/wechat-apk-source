package com.tencent.mm.plugin.fav.ui.d;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.a.y;
import com.tencent.mm.plugin.fav.ui.j;
import com.tencent.mm.plugin.fav.ui.l;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abh;
import java.util.LinkedList;

public final class p extends a
{
  final int moM;

  public p(l paraml)
  {
    super(paraml);
    AppMethodBeat.i(74658);
    this.moM = com.tencent.mm.bz.a.al(paraml.context, 2131427657);
    AppMethodBeat.o(74658);
  }

  public final View a(View paramView, ViewGroup paramViewGroup, com.tencent.mm.plugin.fav.a.g paramg)
  {
    AppMethodBeat.i(74659);
    Object localObject = paramViewGroup.getContext();
    if (paramView == null)
    {
      paramViewGroup = new p.a();
      paramView = a(View.inflate((Context)localObject, 2130969513, null), paramViewGroup, paramg);
      paramViewGroup.moN = ((ImageView)paramView.findViewById(2131823917));
      paramViewGroup.mps = ((TextView)paramView.findViewById(2131823925));
      paramViewGroup.mps.setVisibility(0);
      LinkedList localLinkedList = paramg.field_favProto.wiv;
      if ((localLinkedList.size() <= 0) || (((aar)localLinkedList.getFirst()).duration <= 0))
        break label180;
      paramViewGroup.mps.setText(j.B((Context)localObject, ((aar)localLinkedList.getFirst()).duration));
    }
    while (true)
    {
      a(paramViewGroup, paramg);
      localObject = b.c(paramg);
      this.mhy.a(paramViewGroup.moN, (aar)localObject, paramg, 2131230817, this.moM, this.moM);
      AppMethodBeat.o(74659);
      return paramView;
      paramViewGroup = (p.a)paramView.getTag();
      break;
      label180: paramViewGroup.mps.setText("");
    }
  }

  public final void a(View paramView, abh paramabh)
  {
    AppMethodBeat.i(74660);
    p.a locala = (p.a)paramView.getTag();
    paramView = paramView.getContext();
    ((y)com.tencent.mm.kernel.g.K(y.class)).a(paramView, locala.mgf, paramabh);
    AppMethodBeat.o(74660);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.d.p
 * JD-Core Version:    0.6.2
 */