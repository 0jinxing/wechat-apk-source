package com.tencent.mm.plugin.fav.ui.d;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.t;
import com.tencent.mm.plugin.fav.a.y;
import com.tencent.mm.plugin.fav.ui.l;
import com.tencent.mm.plugin.messenger.foundation.a.a.h;
import com.tencent.mm.plugin.messenger.foundation.a.j;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.protocal.protobuf.aar;
import com.tencent.mm.protocal.protobuf.abh;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ad;
import com.tencent.mm.storage.bd;
import com.tencent.mm.storage.bi.a;

public final class b extends a
{
  public b(l paraml)
  {
    super(paraml);
  }

  private static String a(bi.a parama)
  {
    int i = 1;
    int j = 0;
    AppMethodBeat.i(74617);
    String str = parama.dFl;
    if (bo.isNullOrNil(str))
    {
      str = parama.svN;
      if ((!ad.aoA(str)) && (!t.mX(str)));
    }
    for (j = 1; ; j = 0)
    {
      if ((j == 0) && (!((j)com.tencent.mm.kernel.g.K(j.class)).XM().aoJ(str)))
        j = i;
      while (true)
      {
        boolean bool = t.kv(parama.ufB);
        if ((j != 0) || (bool))
        {
          parama = "";
          AppMethodBeat.o(74617);
        }
        while (true)
        {
          return parama;
          AppMethodBeat.o(74617);
          parama = str;
        }
      }
    }
  }

  public final View a(View paramView, ViewGroup paramViewGroup, com.tencent.mm.plugin.fav.a.g paramg)
  {
    AppMethodBeat.i(74615);
    Context localContext = paramViewGroup.getContext();
    if (paramView == null)
    {
      paramViewGroup = new b.a();
      paramView = a(View.inflate(localContext, 2130969506, null), paramViewGroup, paramg);
      paramViewGroup.iqT = ((ImageView)paramView.findViewById(2131821479));
      paramViewGroup.gnB = ((TextView)paramView.findViewById(2131820619));
      paramViewGroup.gnB.setSingleLine(false);
      paramViewGroup.gnB.setMaxLines(2);
      paramViewGroup.gnC = ((TextView)paramView.findViewById(2131820602));
      paramViewGroup.moL = ((TextView)paramView.findViewById(2131820615));
      a(paramViewGroup, paramg);
      paramg = com.tencent.mm.plugin.fav.a.b.c(paramg);
      paramg = ((j)com.tencent.mm.kernel.g.K(j.class)).bOr().Rn(paramg.desc);
      if ((paramg.svN == null) || (paramg.svN.length() <= 0))
        ab.e("MicroMsg.FavCardListItem", "parse possible friend msg failed");
      if (!bo.isNullOrNil(a(paramg)))
        break label241;
      paramViewGroup.gnC.setVisibility(8);
      label183: paramViewGroup.moL.setText(2131299644);
      paramViewGroup.moL.setVisibility(0);
      paramViewGroup = paramViewGroup.iqT;
      paramg = paramg.svN;
      if (!bo.isNullOrNil(paramg))
        break label255;
      paramViewGroup.setImageResource(2130838444);
    }
    while (true)
    {
      AppMethodBeat.o(74615);
      return paramView;
      paramViewGroup = (b.a)paramView.getTag();
      break;
      label241: paramViewGroup.gnC.setText(a(paramg));
      break label183;
      label255: a.b.b(paramViewGroup, paramg);
    }
  }

  public final void a(View paramView, abh paramabh)
  {
    AppMethodBeat.i(74616);
    b.a locala = (b.a)paramView.getTag();
    paramView = paramView.getContext();
    ((y)com.tencent.mm.kernel.g.K(y.class)).a(paramView, locala.mgf, paramabh);
    AppMethodBeat.o(74616);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.d.b
 * JD-Core Version:    0.6.2
 */