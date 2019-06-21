package com.tencent.mm.plugin.luckymoney.ui;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.y;
import com.tencent.mm.g.b.a.z;
import com.tencent.mm.plugin.emoji.h.b;
import com.tencent.mm.pluginsdk.ui.applet.q.a;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.s;
import com.tencent.mm.ui.q;

final class LuckyMoneyDetailUI$9
  implements q.a
{
  LuckyMoneyDetailUI$9(LuckyMoneyDetailUI paramLuckyMoneyDetailUI)
  {
  }

  public final void a(boolean paramBoolean, String paramString, int paramInt)
  {
    paramInt = 1;
    AppMethodBeat.i(42655);
    this.oeA.aqX();
    LuckyMoneyDetailUI.a(this.oeA, new y());
    if (paramBoolean)
    {
      LuckyMoneyDetailUI.w(this.oeA).cVT = 5L;
      LuckyMoneyDetailUI.a(this.oeA, new z());
      if ((LuckyMoneyDetailUI.x(this.oeA) == 0) || (LuckyMoneyDetailUI.x(this.oeA) == 2))
        if (b.x(LuckyMoneyDetailUI.y(this.oeA)))
        {
          LuckyMoneyDetailUI.z(this.oeA).cYk = paramInt;
          LuckyMoneyDetailUI.z(this.oeA).eV(LuckyMoneyDetailUI.y(this.oeA).Aq());
          if (!bo.isNullOrNil(paramString))
            break label292;
          LuckyMoneyDetailUI.z(this.oeA).cYm = 1L;
          label146: LuckyMoneyDetailUI.z(this.oeA).ajK();
          LuckyMoneyDetailUI.a(this.oeA, LuckyMoneyDetailUI.A(this.oeA), paramString, LuckyMoneyDetailUI.y(this.oeA).Aq());
          LuckyMoneyDetailUI.b(this.oeA, 3);
          s.a(this.oeA.mController.ylL.getResources().getString(2131300520), this.oeA.mController.ylL);
          al.n(new LuckyMoneyDetailUI.9.1(this), 500L);
        }
    }
    while (true)
    {
      LuckyMoneyDetailUI.w(this.oeA).ajK();
      AppMethodBeat.o(42655);
      return;
      if (b.w(LuckyMoneyDetailUI.y(this.oeA)))
      {
        paramInt = 3;
        break;
      }
      paramInt = 2;
      break;
      if (LuckyMoneyDetailUI.x(this.oeA) == 1)
        break;
      paramInt = 0;
      break;
      label292: LuckyMoneyDetailUI.z(this.oeA).cYm = 2L;
      break label146;
      LuckyMoneyDetailUI.w(this.oeA).cVT = 6L;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyDetailUI.9
 * JD-Core Version:    0.6.2
 */