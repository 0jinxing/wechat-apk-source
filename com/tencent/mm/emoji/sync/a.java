package com.tencent.mm.emoji.sync;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.emoji.decode.MMGIFJNIFactory;
import com.tencent.mm.emoji.decode.MMGIFJNIFactory.Companion;
import com.tencent.mm.emoji.loader.c.g;
import com.tencent.mm.loader.g.c;
import com.tencent.mm.loader.g.h;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.emotion.d;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/emoji/sync/EmojiDownLoadTask;", "Lcom/tencent/mm/loader/loader/IWorkTask;", "emojiInfo", "Lcom/tencent/mm/storage/emotion/EmojiInfo;", "(Lcom/tencent/mm/storage/emotion/EmojiInfo;)V", "getEmojiInfo", "()Lcom/tencent/mm/storage/emotion/EmojiInfo;", "call", "", "checkUpdate", "uniqueId", "", "Companion", "plugin-emojisdk_release"})
public final class a extends c
{
  private static final String TAG = "MicroMsg.EmojiDownLoadTask";
  public static final a.a ezo;
  final EmojiInfo exP;

  static
  {
    AppMethodBeat.i(63257);
    ezo = new a.a((byte)0);
    TAG = "MicroMsg.EmojiDownLoadTask";
    AppMethodBeat.o(63257);
  }

  public a(EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(63256);
    this.exP = paramEmojiInfo;
    AppMethodBeat.o(63256);
  }

  private final void Pb()
  {
    AppMethodBeat.i(63254);
    int i = 0;
    Object localObject1 = at.dsZ();
    j.o(localObject1, "EmojiStorageMgr.getInstance()");
    localObject1 = ((at)localObject1).aUp().aqi(this.exP.Aq());
    if (localObject1 == null)
      AppMethodBeat.o(63254);
    while (true)
    {
      return;
      if (((EmojiInfo)localObject1).getState() != EmojiInfo.yat)
      {
        ((EmojiInfo)localObject1).setState(EmojiInfo.yat);
        i = 1;
      }
      int j;
      Object localObject2;
      if (((EmojiInfo)localObject1).field_width > 0)
      {
        j = i;
        if (((EmojiInfo)localObject1).field_width > 0);
      }
      else
      {
        localObject2 = MMGIFJNIFactory.Companion.getDecoder((EmojiInfo)localObject1);
        if (MMGIFJNIFactory.Companion.isValid((com.tencent.mm.emoji.decode.b)localObject2))
        {
          ((EmojiInfo)localObject1).field_width = ((com.tencent.mm.emoji.decode.b)localObject2).Ou();
          ((EmojiInfo)localObject1).field_height = ((com.tencent.mm.emoji.decode.b)localObject2).Ov();
          i = 1;
        }
        ((com.tencent.mm.emoji.decode.b)localObject2).destroy();
        j = i;
      }
      if (j != 0)
      {
        localObject2 = at.dsZ();
        j.o(localObject2, "EmojiStorageMgr.getInstance()");
        ((at)localObject2).aUp().G((EmojiInfo)localObject1);
        if (j.j(this.exP.awa(), "capture"))
          com.tencent.mm.emoji.a.a.OB().cd(true);
      }
      AppMethodBeat.o(63254);
    }
  }

  public final void Pa()
  {
    AppMethodBeat.i(63253);
    if (this.exP.duP())
    {
      ab.i(TAG, this + ' ' + this.exP.Aq() + ": already load");
      Pb();
      a(h.eRj);
      AppMethodBeat.o(63253);
    }
    while (true)
    {
      return;
      g localg = g.exW;
      g.a(this.exP, (a.f.a.b)new a.b(this));
      AppMethodBeat.o(63253);
    }
  }

  public final String Pc()
  {
    AppMethodBeat.i(63255);
    String str = this.exP.Aq();
    j.o(str, "emojiInfo.md5");
    AppMethodBeat.o(63255);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.sync.a
 * JD-Core Version:    0.6.2
 */