package com.tencent.mm.emoji.loader.c;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.emoji.loader.d.h.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.emotion.EmojiInfo;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"com/tencent/mm/emoji/loader/fetcher/EmojiCoverFetcher$fetch$1", "Lcom/tencent/mm/emoji/loader/request/Request$Callback;", "onResult", "", "success", "", "plugin-emojisdk_release"})
public final class b$b
  implements h.a
{
  public b$b(EmojiInfo paramEmojiInfo, a.f.a.b paramb)
  {
  }

  public final void bV(boolean paramBoolean)
  {
    AppMethodBeat.i(63177);
    ab.i("MicroMsg.EmojiCoverFetcher", "onResult: " + this.exH.Aq() + ", " + paramBoolean);
    Object localObject;
    if (paramBoolean)
    {
      localObject = b.exG;
      if (b.a.d(this.exH))
      {
        localObject = this.exI;
        if (localObject != null)
        {
          ((a.f.a.b)localObject).am(Boolean.TRUE);
          AppMethodBeat.o(63177);
        }
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(63177);
      continue;
      localObject = this.exI;
      if (localObject != null)
      {
        ((a.f.a.b)localObject).am(Boolean.FALSE);
        AppMethodBeat.o(63177);
      }
      else
      {
        AppMethodBeat.o(63177);
        continue;
        localObject = this.exI;
        if (localObject != null)
        {
          ((a.f.a.b)localObject).am(Boolean.FALSE);
          AppMethodBeat.o(63177);
        }
        else
        {
          AppMethodBeat.o(63177);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.loader.c.b.b
 * JD-Core Version:    0.6.2
 */