package com.tencent.mm.emoji.loader.e;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.emoji.loader.c.g;
import com.tencent.mm.storage.emotion.EmojiInfo;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/emoji/loader/task/EmojiLoadTask;", "Lcom/tencent/mm/emoji/loader/task/IEmojiLoadTask;", "emojiInfo", "Lcom/tencent/mm/storage/emotion/EmojiInfo;", "(Lcom/tencent/mm/storage/emotion/EmojiInfo;)V", "TAG", "", "getTAG", "()Ljava/lang/String;", "checkCache", "", "getTaskKey", "run", "", "plugin-emojisdk_release"})
public final class b extends c
{
  final String TAG;

  public b(EmojiInfo paramEmojiInfo)
  {
    super(paramEmojiInfo);
    AppMethodBeat.i(63224);
    this.TAG = "MicroMsg.EmojiLoadTask";
    AppMethodBeat.o(63224);
  }

  public final String OA()
  {
    AppMethodBeat.i(63222);
    String str = this.exP.Aq();
    j.o(str, "emojiInfo.md5");
    AppMethodBeat.o(63222);
    return str;
  }

  public final void run()
  {
    AppMethodBeat.i(63223);
    super.run();
    if (this.exP.duP())
    {
      bV(true);
      AppMethodBeat.o(63223);
    }
    while (true)
    {
      return;
      g localg = g.exW;
      g.a(this.exP, (a.f.a.b)new b.a(this));
      AppMethodBeat.o(63223);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.loader.e.b
 * JD-Core Version:    0.6.2
 */