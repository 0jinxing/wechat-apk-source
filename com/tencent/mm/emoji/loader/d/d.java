package com.tencent.mm.emoji.loader.d;

import a.l;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.storage.emotion.EmojiInfo;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/emoji/loader/request/EmojiFileRequest;", "Lcom/tencent/mm/emoji/loader/request/Request;", "", "emojiInfo", "Lcom/tencent/mm/storage/emotion/EmojiInfo;", "callback", "Lcom/tencent/mm/emoji/loader/request/Request$Callback;", "(Lcom/tencent/mm/storage/emotion/EmojiInfo;Lcom/tencent/mm/emoji/loader/request/Request$Callback;)V", "onLoad", "success", "", "plugin-emojisdk_release"})
public final class d extends h<y>
{
  private final h.a eyf;

  public d(EmojiInfo paramEmojiInfo, h.a parama)
  {
    super(paramEmojiInfo);
    AppMethodBeat.i(63209);
    this.eyf = parama;
    AppMethodBeat.o(63209);
  }

  public final void bX(boolean paramBoolean)
  {
    AppMethodBeat.i(63208);
    h.a locala = this.eyf;
    if (locala != null)
    {
      locala.bV(paramBoolean);
      AppMethodBeat.o(63208);
    }
    while (true)
    {
      return;
      AppMethodBeat.o(63208);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.loader.d.d
 * JD-Core Version:    0.6.2
 */