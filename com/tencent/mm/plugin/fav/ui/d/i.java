package com.tencent.mm.plugin.fav.ui.d;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.a.y;
import com.tencent.mm.plugin.fav.ui.l;
import com.tencent.mm.protocal.protobuf.abe;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abh;
import com.tencent.mm.protocal.protobuf.abl;
import com.tencent.mm.sdk.platformtools.bo;

public final class i extends a
{
  private final int moM;
  private final String mpi;

  public i(l paraml)
  {
    super(paraml);
    AppMethodBeat.i(74636);
    this.moM = com.tencent.mm.bz.a.al(paraml.context, 2131427656);
    this.mpi = paraml.context.getString(2131299691);
    AppMethodBeat.o(74636);
  }

  public final View a(View paramView, ViewGroup paramViewGroup, com.tencent.mm.plugin.fav.a.g paramg)
  {
    AppMethodBeat.i(74637);
    Context localContext = paramViewGroup.getContext();
    if (paramView == null)
    {
      paramViewGroup = new i.a();
      paramView = a(View.inflate(localContext, 2130969506, null), paramViewGroup, paramg);
      paramViewGroup.iqT = ((ImageView)paramView.findViewById(2131821479));
      paramViewGroup.gnB = ((TextView)paramView.findViewById(2131820619));
      paramViewGroup.gnC = ((TextView)paramView.findViewById(2131820602));
      paramViewGroup.gnC.setVisibility(8);
      paramViewGroup.moL = ((TextView)paramView.findViewById(2131820615));
      paramViewGroup.moL.setVisibility(0);
    }
    while (true)
    {
      a(paramViewGroup, paramg);
      abe localabe = paramg.field_favProto.whC;
      paramViewGroup.gnB.setText(bo.nullAsNil(localabe.title));
      paramViewGroup.moL.setText(bo.bc(b.getAppName(localContext, paramg.field_favProto.wit.appId), this.mpi));
      this.mhy.a(paramViewGroup.iqT, null, paramg, 2131230813, this.moM, this.moM);
      AppMethodBeat.o(74637);
      return paramView;
      paramViewGroup = (i.a)paramView.getTag();
    }
  }

  public final void a(View paramView, abh paramabh)
  {
    AppMethodBeat.i(74638);
    i.a locala = (i.a)paramView.getTag();
    paramView = paramView.getContext();
    ((y)com.tencent.mm.kernel.g.K(y.class)).a(paramView, locala.mgf, paramabh);
    AppMethodBeat.o(74638);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.d.i
 * JD-Core Version:    0.6.2
 */