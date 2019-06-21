package com.tencent.mm.plugin.emoji.ui.v2;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.at;
import com.tencent.mm.ui.MMTabView;

final class EmojiStoreV2TabView$2$1
  implements Runnable
{
  EmojiStoreV2TabView$2$1(EmojiStoreV2TabView.2 param2)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(53799);
    try
    {
      if (EmojiStoreV2TabView.b(this.lfY.lfX) != null)
        if (j.getEmojiStorageMgr().dta())
        {
          EmojiStoreV2TabView.b(this.lfY.lfX).setText(2131299118);
          AppMethodBeat.o(53799);
        }
      while (true)
      {
        return;
        EmojiStoreV2TabView.b(this.lfY.lfX).setText(2131299117);
        AppMethodBeat.o(53799);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.emoji.EmojiStoreV2TabView", localException, "event update error", new Object[0]);
        AppMethodBeat.o(53799);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.v2.EmojiStoreV2TabView.2.1
 * JD-Core Version:    0.6.2
 */