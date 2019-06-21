package com.tencent.mm.plugin.luckymoney.ui;

import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.support.v7.widget.RecyclerView.i;
import android.util.SparseArray;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.scaledLayout.ViewPagerLayoutManager;
import com.tencent.mm.plugin.luckymoney.scaledLayout.a;
import com.tencent.mm.plugin.luckymoney.scaledLayout.d;
import com.tencent.mm.protocal.protobuf.atb;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.List;

final class LuckyMoneyPickEnvelopeUI$a$1
  implements View.OnClickListener
{
  LuckyMoneyPickEnvelopeUI$a$1(LuckyMoneyPickEnvelopeUI.a parama)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(42914);
    LuckyMoneyPickEnvelopeUI.m(this.ogZ.ogX);
    int i = LuckyMoneyEnvelopeTouchRecyclerView.bo(paramView);
    LuckyMoneyPickEnvelopeUI.d(this.ogZ.ogX);
    LuckyMoneyEnvelopeTouchRecyclerView localLuckyMoneyEnvelopeTouchRecyclerView;
    RecyclerView.i locali;
    int k;
    if (a.h(LuckyMoneyPickEnvelopeUI.c(this.ogZ.ogX)) != paramView)
    {
      ab.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "scroll to target view");
      localLuckyMoneyEnvelopeTouchRecyclerView = LuckyMoneyPickEnvelopeUI.m(this.ogZ.ogX);
      locali = localLuckyMoneyEnvelopeTouchRecyclerView.getLayoutManager();
      if ((locali instanceof ViewPagerLayoutManager))
      {
        ViewPagerLayoutManager localViewPagerLayoutManager = (ViewPagerLayoutManager)locali;
        j = 0;
        if (j >= localViewPagerLayoutManager.obh.size())
          break label257;
        k = localViewPagerLayoutManager.obh.keyAt(j);
        if ((View)localViewPagerLayoutManager.obh.get(k) != paramView)
          break label251;
      }
    }
    label257: for (int j = k; ; j = -1)
    {
      d.a(localLuckyMoneyEnvelopeTouchRecyclerView, (ViewPagerLayoutManager)locali, j);
      ab.d("MicroMsg.LuckyMoneyPickEnvelopeUI", "touch pos: %s", new Object[] { Integer.valueOf(i) });
      if ((i < 0) || (i >= LuckyMoneyPickEnvelopeUI.b(this.ogZ.ogX).size()))
        break label427;
      paramView = (LuckyMoneyPickEnvelopeUI.b)LuckyMoneyPickEnvelopeUI.b(this.ogZ.ogX).get(i);
      if ((paramView.nZq == null) || (paramView.nZq.wwS != 1))
        break label263;
      ab.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "expired: %s", new Object[] { Integer.valueOf(i) });
      AppMethodBeat.o(42914);
      return;
      label251: j++;
      break;
    }
    label263: if (!paramView.kfW)
    {
      ab.i("MicroMsg.LuckyMoneyPickEnvelopeUI", "do select pos: %s", new Object[] { Integer.valueOf(i) });
      if (LuckyMoneyPickEnvelopeUI.a(this.ogZ.ogX) >= 0)
      {
        ((LuckyMoneyPickEnvelopeUI.b)LuckyMoneyPickEnvelopeUI.b(this.ogZ.ogX).get(LuckyMoneyPickEnvelopeUI.a(this.ogZ.ogX))).kfW = false;
        LuckyMoneyPickEnvelopeUI.h(this.ogZ.ogX).cg(LuckyMoneyPickEnvelopeUI.a(this.ogZ.ogX));
      }
      paramView.kfW = true;
      LuckyMoneyPickEnvelopeUI.b(this.ogZ.ogX, i);
      LuckyMoneyPickEnvelopeUI.h(this.ogZ.ogX).cg(LuckyMoneyPickEnvelopeUI.a(this.ogZ.ogX));
    }
    while (true)
    {
      this.ogZ.ogX.enableOptionMenu(1, true);
      LuckyMoneyPickEnvelopeUI.m(this.ogZ.ogX).getAdapter().aop.notifyChanged();
      label427: AppMethodBeat.o(42914);
      break;
      paramView.kfW = false;
      LuckyMoneyPickEnvelopeUI.b(this.ogZ.ogX, -1);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyPickEnvelopeUI.a.1
 * JD-Core Version:    0.6.2
 */