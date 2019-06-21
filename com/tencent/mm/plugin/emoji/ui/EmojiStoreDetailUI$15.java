package com.tencent.mm.plugin.emoji.ui;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.pluginsdk.model.h.a;
import com.tencent.mm.pluginsdk.model.n;
import com.tencent.mm.sdk.platformtools.ab;
import java.math.BigDecimal;
import java.util.ArrayList;

final class EmojiStoreDetailUI$15
  implements h.a
{
  EmojiStoreDetailUI$15(EmojiStoreDetailUI paramEmojiStoreDetailUI)
  {
  }

  public final void A(ArrayList<n> paramArrayList)
  {
    AppMethodBeat.i(53432);
    int i;
    if (paramArrayList == null)
    {
      i = 0;
      ab.i("MicroMsg.emoji.EmojiStoreDetailUI", "[onQueryFinish] %s", new Object[] { Integer.valueOf(i) });
      EmojiStoreDetailUI.B(this.lbG);
      if ((paramArrayList != null) && (paramArrayList.size() > 0))
      {
        paramArrayList = (n)paramArrayList.get(0);
        ab.i("MicroMsg.emoji.EmojiStoreDetailUI", "onQueryFinish: %s", new Object[] { paramArrayList });
        if (paramArrayList.vbt != 10232)
          break label175;
        EmojiStoreDetailUI.a(this.lbG, 4);
        EmojiStoreDetailUI.a(this.lbG, paramArrayList.vbq);
        EmojiStoreDetailUI.b(this.lbG, paramArrayList.vbr);
        paramArrayList = new BigDecimal(paramArrayList.vbs).divide(new BigDecimal(1000000));
        EmojiStoreDetailUI.c(this.lbG, paramArrayList.toString());
      }
    }
    while (true)
    {
      this.lbG.uh(1002);
      AppMethodBeat.o(53432);
      return;
      i = paramArrayList.size();
      break;
      label175: EmojiStoreDetailUI.a(this.lbG, 10);
      EmojiStoreDetailUI.b(this.lbG, paramArrayList.vbt);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.EmojiStoreDetailUI.15
 * JD-Core Version:    0.6.2
 */