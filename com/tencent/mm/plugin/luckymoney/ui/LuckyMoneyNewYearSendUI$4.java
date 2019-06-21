package com.tencent.mm.plugin.luckymoney.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.emoji.d.a;
import com.tencent.mm.emoji.d.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.EmojiInfo.a;
import com.tencent.mm.storage.emotion.d;

final class LuckyMoneyNewYearSendUI$4
  implements a
{
  LuckyMoneyNewYearSendUI$4(LuckyMoneyNewYearSendUI paramLuckyMoneyNewYearSendUI)
  {
  }

  public final void a(long paramLong, boolean paramBoolean, String paramString)
  {
    int i = 0;
    AppMethodBeat.i(42811);
    ab.i("MicroMsg.LuckyMoneyNewYearSendUI", "onResult() mTimeEnter:%s  timeEnter:%s  success:%s  md5:%s", new Object[] { Long.valueOf(LuckyMoneyNewYearSendUI.j(this.ogn)), Long.valueOf(paramLong), Boolean.valueOf(paramBoolean), paramString });
    if (bo.af(LuckyMoneyNewYearSendUI.j(this.ogn), paramLong))
    {
      if (!paramBoolean)
        break label114;
      LuckyMoneyNewYearSendUI.a(this.ogn, paramString);
    }
    while (true)
    {
      LuckyMoneyNewYearSendUI.a(this.ogn, true);
      paramString = b.ezV;
      b.b(LuckyMoneyNewYearSendUI.j(this.ogn), LuckyMoneyNewYearSendUI.z(this.ogn));
      AppMethodBeat.o(42811);
      return;
      label114: if (bo.gW(LuckyMoneyNewYearSendUI.x(this.ogn), 0))
      {
        paramLong = LuckyMoneyNewYearSendUI.j(this.ogn);
        paramString = at.dsZ().xYn.mU(paramLong);
        int j = i;
        if (paramString != null)
        {
          j = i;
          if (paramString.duZ() == EmojiInfo.a.yaG)
          {
            paramString = paramString.dvc();
            switch (com.tencent.mm.plugin.emoji.h.b.1.lgJ[paramString.ordinal()])
            {
            default:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            }
          }
        }
        for (j = i; ; j = 1)
        {
          if (j == 0)
            break label263;
          LuckyMoneyNewYearSendUI.y(this.ogn);
          LuckyMoneyNewYearSendUI.a(this.ogn, 3);
          AppMethodBeat.o(42811);
          break;
        }
      }
      label263: LuckyMoneyNewYearSendUI.a(this.ogn, 5);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.ui.LuckyMoneyNewYearSendUI.4
 * JD-Core Version:    0.6.2
 */