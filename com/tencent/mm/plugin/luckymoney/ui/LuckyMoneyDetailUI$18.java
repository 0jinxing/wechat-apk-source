package com.tencent.mm.plugin.luckymoney.ui;

import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.luckymoney.particles.a;
import com.tencent.mm.plugin.luckymoney.particles.b;
import com.tencent.mm.plugin.luckymoney.particles.c;
import com.tencent.mm.plugin.luckymoney.particles.d;
import com.tencent.mm.plugin.luckymoney.particles.e;

final class LuckyMoneyDetailUI$18
  implements Runnable
{
  LuckyMoneyDetailUI$18(LuckyMoneyDetailUI paramLuckyMoneyDetailUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(42667);
    ViewGroup localViewGroup = LuckyMoneyDetailUI.J(this.oeA);
    Object localObject = LuckyMoneyDetailUI.K(this.oeA);
    a locala = new a(localViewGroup);
    localObject = new c(localViewGroup.getContext(), (b)localObject, new d(-100, localViewGroup.getHeight() / 2), localViewGroup).R(600.0F, 150.0F).S(-1000.0F, 250.0F).aG(-200.0F).aH(1500.0F);
    ((c)localObject).oal = 600.0F;
    ((c)localObject).oam = 300.0F;
    localObject = ((c)localObject).bLH();
    ((c)localObject).nZO = e.bLQ();
    locala.nZD = ((c)localObject).bLI().bLJ();
    locala.P(100, 400L);
    localViewGroup = LuckyMoneyDetailUI.J(this.oeA);
    localObject = LuckyMoneyDetailUI.K(this.oeA);
    locala = new a(localViewGroup);
    localObject = new c(localViewGroup.getContext(), (b)localObject, new d(localViewGroup.getWidth() + 100, localViewGroup.getHeight() / 2), localViewGroup).R(-600.0F, 150.0F).S(-1000.0F, 250.0F).aG(200.0F).aH(1500.0F);
    ((c)localObject).oal = 600.0F;
    ((c)localObject).oam = 300.0F;
    localObject = ((c)localObject).bLH();
    ((c)localObject).nZO = e.bLQ();
    locala.nZD = ((c)localObject).bLI().bLJ();
    locala.P(100, 400L);
    AppMethodBeat.o(42667);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI.18
 * JD-Core Version:    0.6.2
 */