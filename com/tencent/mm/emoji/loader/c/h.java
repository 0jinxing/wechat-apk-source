package com.tencent.mm.emoji.loader.c;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.emoji.a.e;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.emotion.EmojiInfo;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"checkUseCdn", "", "fetcherType", "", "checkUseEncrypt", "emojiInfo", "Lcom/tencent/mm/storage/emotion/EmojiInfo;", "checkUseTpUrl", "checkUseWxam", "plugin-emojisdk_release"})
public final class h
{
  public static final boolean f(EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(63194);
    j.p(paramEmojiInfo, "emojiInfo");
    boolean bool;
    if (!bo.isNullOrNil(paramEmojiInfo.field_tpurl))
    {
      bool = true;
      AppMethodBeat.o(63194);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(63194);
    }
  }

  public static final boolean g(EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(63195);
    j.p(paramEmojiInfo, "emojiInfo");
    boolean bool;
    if ((e.OQ()) && (!bo.isNullOrNil(paramEmojiInfo.field_externUrl)) && (!bo.isNullOrNil(paramEmojiInfo.field_aeskey)))
    {
      bool = true;
      AppMethodBeat.o(63195);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(63195);
    }
  }

  public static final boolean h(EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(63196);
    j.p(paramEmojiInfo, "emojiInfo");
    boolean bool;
    if ((!bo.isNullOrNil(paramEmojiInfo.field_encrypturl)) && (!bo.isNullOrNil(paramEmojiInfo.field_aeskey)))
    {
      bool = true;
      AppMethodBeat.o(63196);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(63196);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.loader.c.h
 * JD-Core Version:    0.6.2
 */