package com.tencent.mm.plugin.emoji.ui.fts;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emoji.e.f;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.pluginsdk.ui.tools.n;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.d;
import com.tencent.mm.vfs.e;

final class FTSEmojiDetailPageUI$4
  implements Runnable
{
  FTSEmojiDetailPageUI$4(FTSEmojiDetailPageUI paramFTSEmojiDetailPageUI)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(53538);
    Object localObject = j.getEmojiStorageMgr().xYn.aqi(FTSEmojiDetailPageUI.a(this.lcK).Aq());
    if (localObject != null)
      FTSEmojiDetailPageUI.a(this.lcK, (EmojiInfo)localObject);
    if (f.bjK().m(FTSEmojiDetailPageUI.a(this.lcK)))
    {
      String str = FTSEmojiDetailPageUI.a(this.lcK).dve() + "_decode";
      if (e.ct(str))
        e.deleteFile(str);
      e.atc(str);
      localObject = f.bjK().l(FTSEmojiDetailPageUI.a(this.lcK));
      e.b(str, (byte[])localObject, localObject.length);
      n.j(str, this.lcK);
      e.deleteFile(str);
      AppMethodBeat.o(53538);
    }
    while (true)
    {
      return;
      if (e.ct(FTSEmojiDetailPageUI.f(this.lcK)))
        n.j(FTSEmojiDetailPageUI.f(this.lcK), this.lcK);
      AppMethodBeat.o(53538);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.ui.fts.FTSEmojiDetailPageUI.4
 * JD-Core Version:    0.6.2
 */