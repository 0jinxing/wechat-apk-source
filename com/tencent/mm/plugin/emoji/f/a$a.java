package com.tencent.mm.plugin.emoji.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emoji.model.e;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;

public final class a$a
  implements ap.a
{
  public a$a()
  {
    AppMethodBeat.i(53085);
    a.access$002(0);
    AppMethodBeat.o(53085);
  }

  public final boolean BI()
  {
    boolean bool = false;
    AppMethodBeat.i(53086);
    if (a.access$000() >= 100)
    {
      a.access$002(0);
      ab.d("MicroMsg.emoji.EmojiTuziTool", "insert tuzi");
      com.tencent.mm.storage.emotion.a locala = j.getEmojiStorageMgr().xYo;
      EmojiGroupInfo localEmojiGroupInfo = new EmojiGroupInfo();
      localEmojiGroupInfo.field_productID = com.tencent.mm.plugin.emoji.h.a.bmu();
      localEmojiGroupInfo.field_packName = "emoji_custom_all";
      localEmojiGroupInfo.field_type = EmojiGroupInfo.TYPE_SYSTEM;
      localEmojiGroupInfo.field_sort = 1;
      localEmojiGroupInfo.field_idx = 0;
      localEmojiGroupInfo.field_packType = 4;
      localEmojiGroupInfo.field_packFlag = 1;
      localEmojiGroupInfo.field_lastUseTime = System.currentTimeMillis();
      locala.c(localEmojiGroupInfo);
      j.bkn().g(com.tencent.mm.plugin.emoji.h.a.bmu(), 7, a.access$000(), "");
      a.removeListener();
      AppMethodBeat.o(53086);
    }
    while (true)
    {
      return bool;
      j.bkn().g(com.tencent.mm.plugin.emoji.h.a.bmu(), 6, a.access$000(), "");
      a.access$002(a.access$000() + 2);
      AppMethodBeat.o(53086);
      bool = true;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.f.a.a
 * JD-Core Version:    0.6.2
 */