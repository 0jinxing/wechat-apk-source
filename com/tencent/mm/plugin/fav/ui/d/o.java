package com.tencent.mm.plugin.fav.ui.d;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.plugin.fav.a.y;
import com.tencent.mm.plugin.fav.ui.l;
import com.tencent.mm.pluginsdk.d;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.abf;
import com.tencent.mm.protocal.protobuf.abh;
import com.tencent.mm.protocal.protobuf.abu;
import com.tencent.mm.sdk.platformtools.bo;

public final class o extends a
{
  private final int moM;

  public o(l paraml)
  {
    super(paraml);
    AppMethodBeat.i(74655);
    this.moM = com.tencent.mm.bz.a.al(paraml.context, 2131427656);
    AppMethodBeat.o(74655);
  }

  public final View a(View paramView, ViewGroup paramViewGroup, com.tencent.mm.plugin.fav.a.g paramg)
  {
    AppMethodBeat.i(74656);
    paramViewGroup = paramViewGroup.getContext();
    Object localObject1;
    aar localaar1;
    Object localObject2;
    TextView localTextView;
    if (paramView == null)
    {
      localObject1 = new o.a();
      paramViewGroup = a(View.inflate(paramViewGroup, 2130969506, null), (a.b)localObject1, paramg);
      ((o.a)localObject1).iqT = ((ImageView)paramViewGroup.findViewById(2131821479));
      ((o.a)localObject1).gnB = ((TextView)paramViewGroup.findViewById(2131820619));
      ((o.a)localObject1).gnB.setMaxLines(2);
      a((a.b)localObject1, paramg);
      localaar1 = b.c(paramg);
      localObject2 = paramg.field_favProto.whA;
      localTextView = ((o.a)localObject1).gnB;
      aar localaar2 = b.c(paramg);
      paramView = "";
      if (localObject2 != null)
        paramView = ((abu)localObject2).title;
      localObject2 = paramView;
      if (bo.isNullOrNil(paramView))
      {
        localObject2 = paramView;
        if (localaar2 != null)
          localObject2 = localaar2.title;
      }
      if (!bo.isNullOrNil((String)localObject2))
        break label242;
      localTextView.setVisibility(8);
    }
    while (true)
    {
      int i = d.ail(localaar1.wgo);
      paramView = this.mhy;
      localObject1 = ((o.a)localObject1).iqT;
      int j = i;
      if (i == d.dgO())
        j = 2131230820;
      paramView.a((ImageView)localObject1, localaar1, paramg, j, this.moM, this.moM);
      AppMethodBeat.o(74656);
      return paramViewGroup;
      localObject1 = (o.a)paramView.getTag();
      paramViewGroup = paramView;
      break;
      label242: localTextView.setText((CharSequence)localObject2);
      localTextView.setVisibility(0);
    }
  }

  public final void a(View paramView, abh paramabh)
  {
    AppMethodBeat.i(74657);
    o.a locala = (o.a)paramView.getTag();
    paramView = paramView.getContext();
    ((y)com.tencent.mm.kernel.g.K(y.class)).a(paramView, locala.mgf, paramabh);
    AppMethodBeat.o(74657);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.d.o
 * JD-Core Version:    0.6.2
 */