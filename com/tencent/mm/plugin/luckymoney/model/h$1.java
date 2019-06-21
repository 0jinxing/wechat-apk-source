package com.tencent.mm.plugin.luckymoney.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class h$1
  implements t.a
{
  h$1(h paramh)
  {
  }

  public final void aS(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(42286);
    if (paramBoolean)
    {
      ab.i("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "the download image data is success! filePath:".concat(String.valueOf(paramString)));
      AppMethodBeat.o(42286);
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.LuckyMoneyC2CNYPredownloadImgListener", "download image fail!  filePath:".concat(String.valueOf(paramString)));
      AppMethodBeat.o(42286);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.luckymoney.model.h.1
 * JD-Core Version:    0.6.2
 */