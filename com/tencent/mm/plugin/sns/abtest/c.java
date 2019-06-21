package com.tencent.mm.plugin.sns.abtest;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.a.e;
import com.tencent.mm.model.a.f;
import com.tencent.mm.model.a.g;
import com.tencent.mm.plugin.sns.ui.item.BaseTimeLineItem.BaseViewHolder;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.HashSet;
import java.util.Set;

public final class c
{
  private static String qCS;
  private static Set<Long> qCT;
  private static View.OnClickListener qCU;
  private static boolean qCh;
  private static com.tencent.mm.sdk.b.c qCq;

  static
  {
    AppMethodBeat.i(35687);
    qCS = "0";
    qCT = new HashSet();
    qCq = new c.1();
    qCh = false;
    AppMethodBeat.o(35687);
  }

  public static void b(View paramView, BaseTimeLineItem.BaseViewHolder paramBaseViewHolder)
  {
    AppMethodBeat.i(35684);
    if (qCh)
    {
      paramBaseViewHolder.rIa = false;
      paramBaseViewHolder.rHY = ((ViewStub)paramView.findViewById(2131827912));
      paramBaseViewHolder.rHY.setVisibility(8);
    }
    AppMethodBeat.o(35684);
  }

  public static void cmb()
  {
    AppMethodBeat.i(35682);
    if (g.aaK().oP("6") != null)
    {
      qCS = g.aaK().oP("6").value;
      ab.d("MicroMsg.SellerABTestManager", "startABTest, value:%s", new Object[] { qCS });
      qCh = true;
      a.xxA.c(qCq);
      qCU = new c.2();
    }
    AppMethodBeat.o(35682);
  }

  public static void cmc()
  {
    AppMethodBeat.i(35683);
    qCU = null;
    a.xxA.d(qCq);
    if (qCh)
    {
      g.aaK().oP("6").fob = 2L;
      g.aaK().oP("6").result = qCT.size();
      f.a(g.aaK().oP("6"));
      ab.d("MicroMsg.SellerABTestManager", "endABTestWhenExitTimeline, scene:%d, result:%s", new Object[] { Integer.valueOf(2), qCT.size() });
    }
    qCS = "0";
    qCh = false;
    qCT.clear();
    AppMethodBeat.o(35683);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.abtest.c
 * JD-Core Version:    0.6.2
 */