package com.tencent.mm.plugin.fav.ui.d;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.a.y;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abh;
import com.tencent.mm.protocal.protobuf.abl;
import com.tencent.mm.protocal.protobuf.abo;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.MMImageView;

public final class l extends a
{
  private final int moM;
  private final String mpi;

  public l(com.tencent.mm.plugin.fav.ui.l paraml)
  {
    super(paraml);
    AppMethodBeat.i(74648);
    this.moM = com.tencent.mm.bz.a.al(paraml.context, 2131427656);
    this.mpi = "";
    AppMethodBeat.o(74648);
  }

  public final View a(View paramView, ViewGroup paramViewGroup, com.tencent.mm.plugin.fav.a.g paramg)
  {
    AppMethodBeat.i(74649);
    Context localContext = paramViewGroup.getContext();
    if (paramView == null)
    {
      paramViewGroup = new l.a();
      paramView = a(View.inflate(localContext, 2130969506, null), paramViewGroup, paramg);
      paramViewGroup.mlG = ((MMImageView)paramView.findViewById(2131821479));
      paramViewGroup.gnB = ((TextView)paramView.findViewById(2131820619));
      paramViewGroup.gnC = ((TextView)paramView.findViewById(2131820602));
      paramViewGroup.moL = ((TextView)paramView.findViewById(2131820615));
      paramViewGroup.moL.setVisibility(0);
      a(paramViewGroup, paramg);
      abo localabo = paramg.field_favProto.whE;
      if (localabo == null)
        break label218;
      paramViewGroup.gnB.setText(bo.nullAsNil(localabo.title));
      paramViewGroup.gnC.setText(bo.nullAsNil(localabo.desc));
    }
    while (true)
    {
      paramViewGroup.moL.setText(bo.bc(b.getAppName(localContext, paramg.field_favProto.wit.appId), this.mpi));
      this.mhy.a(paramViewGroup.mlG, null, paramg, 2131230813, this.moM, this.moM);
      AppMethodBeat.o(74649);
      return paramView;
      paramViewGroup = (l.a)paramView.getTag();
      break;
      label218: paramViewGroup.gnB.setText("");
      paramViewGroup.gnC.setText("");
    }
  }

  public final void a(View paramView, abh paramabh)
  {
    AppMethodBeat.i(74650);
    l.a locala = (l.a)paramView.getTag();
    paramView = paramView.getContext();
    ((y)com.tencent.mm.kernel.g.K(y.class)).a(paramView, locala.mgf, paramabh);
    AppMethodBeat.o(74650);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.d.l
 * JD-Core Version:    0.6.2
 */