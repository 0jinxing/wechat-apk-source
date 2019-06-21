package com.tencent.mm.plugin.fav.ui.d;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.a.y;
import com.tencent.mm.plugin.fav.ui.l;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.abh;
import java.util.HashSet;
import java.util.Set;

public final class g extends a
{
  private final int moM;
  private Set<ImageView> moO;
  private View.OnClickListener moP;

  public g(l paraml)
  {
    super(paraml);
    AppMethodBeat.i(74629);
    this.moP = new g.1(this);
    this.moM = com.tencent.mm.bz.a.al(paraml.context, 2131427656);
    this.moO = new HashSet();
    AppMethodBeat.o(74629);
  }

  public final View a(View paramView, ViewGroup paramViewGroup, com.tencent.mm.plugin.fav.a.g paramg)
  {
    AppMethodBeat.i(74630);
    Object localObject = paramViewGroup.getContext();
    if (paramView == null)
    {
      paramViewGroup = new g.a();
      paramView = a(View.inflate((Context)localObject, 2130969506, null), paramViewGroup, paramg);
      paramViewGroup.iqT = ((ImageView)paramView.findViewById(2131821479));
      paramViewGroup.gnB = ((TextView)paramView.findViewById(2131820619));
      paramViewGroup.gnC = ((TextView)paramView.findViewById(2131820602));
      paramViewGroup.moR = ((ImageView)paramView.findViewById(2131821480));
      paramViewGroup.moL = ((TextView)paramView.findViewById(2131820615));
      paramViewGroup.moL.setVisibility(8);
      paramViewGroup.moR.setOnClickListener(this.moP);
      paramViewGroup.moR.setVisibility(0);
      this.moO.add(paramViewGroup.moR);
      a(paramViewGroup, paramg);
      localObject = b.c(paramg);
      paramViewGroup.gnB.setText(((aar)localObject).title);
      paramViewGroup.gnC.setText(((aar)localObject).desc);
      paramViewGroup.gnC.setVisibility(0);
      this.mhy.a(paramViewGroup.iqT, (aar)localObject, paramg, 2131230800, this.moM, this.moM);
      paramViewGroup.moR.setTag(paramg);
      if (!b.e((aar)localObject))
        break label256;
      paramViewGroup.moR.setImageResource(2130839637);
    }
    while (true)
    {
      AppMethodBeat.o(74630);
      return paramView;
      paramViewGroup = (g.a)paramView.getTag();
      break;
      label256: paramViewGroup.moR.setImageResource(2130839639);
    }
  }

  public final void a(View paramView, abh paramabh)
  {
    AppMethodBeat.i(74631);
    g.a locala = (g.a)paramView.getTag();
    paramView = paramView.getContext();
    ((y)com.tencent.mm.kernel.g.K(y.class)).a(paramView, locala.mgf, paramabh);
    AppMethodBeat.o(74631);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.d.g
 * JD-Core Version:    0.6.2
 */