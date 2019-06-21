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
import com.tencent.mm.sdk.platformtools.al;
import java.util.HashSet;
import java.util.LinkedList;

public final class k extends a
{
  final int moM;
  private HashSet<Long> mpq;

  public k(l paraml)
  {
    super(paraml);
    AppMethodBeat.i(74645);
    this.moM = com.tencent.mm.bz.a.al(paraml.context, 2131427657);
    this.mpq = new HashSet();
    AppMethodBeat.o(74645);
  }

  public final View a(View paramView, ViewGroup paramViewGroup, com.tencent.mm.plugin.fav.a.g paramg)
  {
    AppMethodBeat.i(74646);
    Object localObject = paramViewGroup.getContext();
    if (paramView == null)
    {
      paramViewGroup = new k.a();
      paramView = a(View.inflate((Context)localObject, 2130969513, null), paramViewGroup, paramg);
      paramViewGroup.moN = ((ImageView)paramView.findViewById(2131823917));
      paramViewGroup.mps = ((TextView)paramView.findViewById(2131823925));
      LinkedList localLinkedList = paramg.field_favProto.wiv;
      if (localLinkedList.size() <= 0)
        break label231;
      int i = ((aar)localLinkedList.getFirst()).duration;
      paramViewGroup.mps.setText(j.B((Context)localObject, i));
      if ((paramg != null) && (i <= 1))
        break label180;
      label118: paramViewGroup.mps.setVisibility(0);
    }
    while (true)
    {
      a(paramViewGroup, paramg);
      localObject = b.c(paramg);
      this.mhy.a(paramViewGroup.moN, (aar)localObject, paramg, 2131230817, this.moM, this.moM);
      AppMethodBeat.o(74646);
      return paramView;
      paramViewGroup = (k.a)paramView.getTag();
      break;
      label180: if (this.mpq.contains(Long.valueOf(paramg.field_localId)))
        break label118;
      this.mpq.add(Long.valueOf(paramg.field_localId));
      com.tencent.mm.kernel.g.RS().aa(new k.1(this, paramg));
      break label118;
      label231: paramViewGroup.mps.setVisibility(8);
    }
  }

  public final void a(View paramView, abh paramabh)
  {
    AppMethodBeat.i(74647);
    k.a locala = (k.a)paramView.getTag();
    paramView = paramView.getContext();
    ((y)com.tencent.mm.kernel.g.K(y.class)).a(paramView, locala.mgf, paramabh);
    AppMethodBeat.o(74647);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.d.k
 * JD-Core Version:    0.6.2
 */