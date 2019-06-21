package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import android.content.res.Resources;
import android.view.View;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.cf.d;
import com.tencent.mm.g.a.tn;
import com.tencent.mm.plugin.sns.a.b.g;
import com.tencent.mm.plugin.sns.ui.view.SnsStoryHeaderView;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ah;
import com.tencent.mm.ui.q;

final class SnsUIAction$9
  implements AbsListView.OnScrollListener
{
  SnsUIAction$9(SnsUIAction paramSnsUIAction)
  {
  }

  public final void onScroll(AbsListView paramAbsListView, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(39648);
    System.currentTimeMillis();
    this.rCe.rBO = (paramInt1 + paramInt2 - 1);
    if ((this.rCe.nDp.getLastVisiblePosition() == this.rCe.nDp.getCount() - 1) && (this.rCe.nDp.getCount() != SnsUIAction.f(this.rCe)))
    {
      ab.d("MicroMsg.SnsActivity", "now refresh count: %s", new Object[] { Integer.valueOf(this.rCe.nDp.getCount()) });
      SnsUIAction.a(this.rCe, this.rCe.nDp.getCount());
      SnsUIAction.g(this.rCe);
    }
    if (paramAbsListView.getChildCount() == 0)
    {
      AppMethodBeat.o(39648);
      return;
    }
    int i = com.tencent.mm.bz.a.fromDPToPix(SnsUIAction.a(this.rCe), 20);
    paramInt2 = 0;
    float f1 = 1.0F;
    int j = 1;
    paramInt3 = 0;
    label184: int k;
    int m;
    int n;
    label231: Object localObject;
    label277: int i1;
    label388: float f2;
    if ((SnsUIAction.a(this.rCe) instanceof SnsTimeLineUI))
    {
      paramInt3 = com.tencent.mm.bz.a.fromDPToPix(SnsUIAction.a(this.rCe), 245);
      k = paramInt3 - com.tencent.mm.bz.a.fromDPToPix(SnsUIAction.a(this.rCe), 30);
      m = paramInt3 - com.tencent.mm.bz.a.fromDPToPix(SnsUIAction.a(this.rCe), 10);
      paramAbsListView = paramAbsListView.getChildAt(0);
      if (paramAbsListView != null)
        break label797;
      n = 0;
      if (paramInt1 <= SnsUIAction.h(this.rCe))
        break label806;
      this.rCe.rBZ = SnsUIAction.aUn();
      if (paramAbsListView != null)
      {
        localObject = this.rCe;
        ((SnsUIAction)localObject).iZo += paramAbsListView.getHeight();
      }
      this.rCe.rCb = (-n + this.rCe.iZo);
      SnsUIAction.b(this.rCe, paramInt1);
      SnsUIAction.c(this.rCe, n);
      if (this.rCe.rCa != this.rCe.rBZ)
      {
        this.rCe.start = this.rCe.rCb;
        this.rCe.rCc = false;
      }
      if (paramInt1 != 0)
        break label1044;
      i1 = -paramAbsListView.getTop();
      this.rCe.rCb = i1;
      if ((i1 < 0) || (i1 > k))
        break label932;
      f1 = 1.0F;
      if ((i1 < 0) || (i1 > paramInt3))
        break label986;
      paramInt2 = 0;
      j = 0;
      f2 = 0.0F;
      label408: if (this.rCe.iVh != null)
      {
        ab.d("MicroMsg.SnsActivity", "dancy text totalScrollY:%s, top:%s, viewHeight:%s ", new Object[] { Integer.valueOf(this.rCe.rCb), Integer.valueOf(n), Integer.valueOf(this.rCe.iZo) });
        if (this.rCe.rCb <= paramInt3)
          break label1053;
        this.rCe.iVh.setVisibility(8);
      }
      label487: this.rCe.rBW = this.rCe.rCb;
      this.rCe.rCa = this.rCe.rBZ;
      if (!(SnsUIAction.a(this.rCe) instanceof SnsTimeLineUI))
        break label1067;
      paramAbsListView = (SnsTimeLineUI)SnsUIAction.a(this.rCe);
    }
    while (true)
    {
      label539: if (paramAbsListView != null)
      {
        if (this.rCe.omW != paramInt2)
        {
          if (paramInt2 > 0)
            break label1094;
          paramAbsListView.xE(SnsUIAction.a(this.rCe).getResources().getColor(2131690597));
          label577: if ((SnsUIAction.a(this.rCe) instanceof SnsTimeLineUI))
          {
            if (j == 0)
              break label1120;
            paramAbsListView.Na(2131231445);
          }
        }
        label601: SnsUIAction.c(this.rCe).fA(paramInt1, paramInt2);
        if (this.rCe.rBY != f2)
        {
          localObject = paramAbsListView.mController;
          if (((q)localObject).ylQ != null)
            ((q)localObject).ylQ.setAlpha(f2);
        }
        if (this.rCe.rBX != f1)
        {
          paramAbsListView = paramAbsListView.mController;
          if (paramAbsListView.ylR != null)
          {
            paramAbsListView.ylR.setAlpha(f1);
            if (f1 != 0.0F)
              break label1129;
            paramAbsListView.ylR.setEnabled(false);
          }
          label701: if (paramAbsListView.yeP != null)
          {
            paramAbsListView.yeP.setAlpha(f1);
            if (f1 != 0.0F)
              break label1140;
            paramAbsListView.yeP.setEnabled(false);
          }
        }
      }
      while (true)
      {
        this.rCe.omW = paramInt2;
        this.rCe.rBX = f1;
        this.rCe.rBY = f2;
        AppMethodBeat.o(39648);
        break;
        if (!(SnsUIAction.a(this.rCe) instanceof SnsUserUI))
          break label184;
        paramInt3 = com.tencent.mm.bz.a.fromDPToPix(SnsUIAction.a(this.rCe), 199);
        break label184;
        label797: n = paramAbsListView.getTop();
        break label231;
        label806: if (paramInt1 < SnsUIAction.h(this.rCe))
        {
          this.rCe.rBZ = SnsUIAction.alV();
          if (this.rCe.iZo < paramAbsListView.getHeight())
            break label277;
          localObject = this.rCe;
          ((SnsUIAction)localObject).iZo -= paramAbsListView.getHeight();
          break label277;
        }
        if (Math.abs(n - SnsUIAction.i(this.rCe)) <= 1)
          break label277;
        if (n < SnsUIAction.i(this.rCe))
        {
          this.rCe.rBZ = SnsUIAction.aUn();
          break label277;
        }
        if (n <= SnsUIAction.i(this.rCe))
          break label277;
        this.rCe.rBZ = SnsUIAction.alV();
        break label277;
        label932: if (i1 <= m)
        {
          f1 = 1.0F - (i1 - k) / (m - k);
          break label388;
        }
        if (i1 > paramInt3 + i)
          break label388;
        f1 = (i1 - paramInt3) * 1.0F / i;
        break label388;
        label986: if (i1 <= paramInt3 + i)
        {
          paramInt2 = (i1 - paramInt3) * 100 / i;
          f2 = (i1 - paramInt3) * 1.0F / i;
          break label408;
        }
        if (i1 > i + paramInt3)
          paramInt2 = 100;
        f2 = 1.0F;
        break label408;
        label1044: f2 = 1.0F;
        paramInt2 = 100;
        break label408;
        label1053: this.rCe.iVh.setVisibility(0);
        break label487;
        label1067: if (!(SnsUIAction.a(this.rCe) instanceof SnsUserUI))
          break label1151;
        paramAbsListView = (SnsUserUI)SnsUIAction.a(this.rCe);
        break label539;
        label1094: paramAbsListView.xE(ah.dJ(SnsUIAction.a(this.rCe).getResources().getColor(2131690310), paramInt2));
        break label577;
        label1120: paramAbsListView.Na(2131231403);
        break label601;
        label1129: paramAbsListView.ylR.setEnabled(true);
        break label701;
        label1140: paramAbsListView.yeP.setEnabled(true);
      }
      label1151: paramAbsListView = null;
    }
  }

  public final void onScrollStateChanged(AbsListView paramAbsListView, int paramInt)
  {
    AppMethodBeat.i(39647);
    SnsUIAction.c(this.rCe).Eh(paramInt);
    if (paramInt == 0)
    {
      paramAbsListView = new tn();
      paramAbsListView.cPI.type = 5;
      paramAbsListView.cPI.cPJ = this.rCe.nDp.getFirstVisiblePosition();
      paramAbsListView.cPI.cPK = this.rCe.nDp.getLastVisiblePosition();
      paramAbsListView.cPI.cPL = this.rCe.nDp.getHeaderViewsCount();
      com.tencent.mm.sdk.b.a.xxA.m(paramAbsListView);
      if (((SnsUIAction.a(this.rCe) instanceof SnsTimeLineUI)) && (((SnsTimeLineUI)SnsUIAction.a(this.rCe)).rqn != null))
        ((SnsTimeLineUI)SnsUIAction.a(this.rCe)).rqn.kH(true);
      if (this.rCe.qQt != null)
      {
        paramAbsListView = this.rCe.qQt;
        if ((paramAbsListView.rrU != null) && (paramAbsListView.rrU.rsk != null))
          paramAbsListView.rrU.rsk.cvt();
      }
    }
    if (paramInt == 2)
    {
      d.dvV().ev(SnsUIAction.class.getName() + SnsUIAction.c(this.rCe).getType() + ".Listview", 4);
      this.rCe.ln(true);
      AppMethodBeat.o(39647);
    }
    while (true)
    {
      return;
      this.rCe.ln(false);
      AppMethodBeat.o(39647);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsUIAction.9
 * JD-Core Version:    0.6.2
 */