package com.tencent.mm.plugin.fav.ui.d;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.y;
import com.tencent.mm.plugin.fav.ui.l;
import com.tencent.mm.protocal.protobuf.abe;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abh;
import com.tencent.mm.sdk.platformtools.bo;

public final class f extends a
{
  private final int moM;

  public f(l paraml)
  {
    super(paraml);
    AppMethodBeat.i(74625);
    this.moM = com.tencent.mm.bz.a.al(paraml.context, 2131427656);
    AppMethodBeat.o(74625);
  }

  public final View a(View paramView, ViewGroup paramViewGroup, com.tencent.mm.plugin.fav.a.g paramg)
  {
    AppMethodBeat.i(74626);
    Object localObject = paramViewGroup.getContext();
    if (paramView == null)
    {
      paramViewGroup = new f.a();
      paramView = a(View.inflate((Context)localObject, 2130969506, null), paramViewGroup, paramg);
      paramViewGroup.iqT = ((ImageView)paramView.findViewById(2131821479));
      paramViewGroup.gnB = ((TextView)paramView.findViewById(2131820619));
      paramViewGroup.gnC = ((TextView)paramView.findViewById(2131820602));
      paramViewGroup.moL = ((TextView)paramView.findViewById(2131820615));
      paramViewGroup.moL.setVisibility(8);
    }
    while (true)
    {
      a(paramViewGroup, paramg);
      localObject = paramg.field_favProto.whC;
      paramViewGroup.gnB.setText(bo.nullAsNil(((abe)localObject).title));
      paramViewGroup.gnC.setText(bo.nullAsNil(((abe)localObject).desc));
      paramViewGroup.gnB.setSingleLine(false);
      paramViewGroup.gnB.setMaxLines(2);
      this.mhy.a(paramViewGroup.iqT, null, paramg, 2131230813, this.moM, this.moM);
      AppMethodBeat.o(74626);
      return paramView;
      paramViewGroup = (f.a)paramView.getTag();
    }
  }

  public final void a(View paramView, abh paramabh)
  {
    AppMethodBeat.i(74627);
    f.a locala = (f.a)paramView.getTag();
    paramView = paramView.getContext();
    ((y)com.tencent.mm.kernel.g.K(y.class)).a(paramView, locala.mgf, paramabh);
    AppMethodBeat.o(74627);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.d.f
 * JD-Core Version:    0.6.2
 */