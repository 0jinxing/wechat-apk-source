package com.tencent.mm.emoji.loader.e;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.emoji.loader.EmojiLoaderProxy;
import com.tencent.mm.remoteservice.d;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.emotion.EmojiInfo;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/emoji/loader/task/ProcessTask;", "Lcom/tencent/mm/emoji/loader/task/IEmojiLoadTask;", "emojiInfo", "Lcom/tencent/mm/storage/emotion/EmojiInfo;", "(Lcom/tencent/mm/storage/emotion/EmojiInfo;)V", "getTaskKey", "", "onResult", "", "success", "", "run", "plugin-emojisdk_release"})
public final class e extends c
{
  public e(EmojiInfo paramEmojiInfo)
  {
    super(paramEmojiInfo);
    AppMethodBeat.i(63228);
    AppMethodBeat.o(63228);
  }

  public final String OA()
  {
    AppMethodBeat.i(63225);
    String str = this.exP.Aq();
    j.o(str, "emojiInfo.md5");
    AppMethodBeat.o(63225);
    return str;
  }

  public final void bV(boolean paramBoolean)
  {
    AppMethodBeat.i(63227);
    super.bV(paramBoolean);
    Object localObject = EmojiLoaderProxy.exx;
    EmojiLoaderProxy.access$setRequestCount$cp(EmojiLoaderProxy.access$getRequestCount$cp() - 1);
    if (EmojiLoaderProxy.access$getRequestCount$cp() <= 0)
    {
      EmojiLoaderProxy.access$setNeedCreate$cp(true);
      localObject = EmojiLoaderProxy.access$getInstance$cp().getServerProxy();
      if (localObject != null)
      {
        ((d)localObject).release();
        AppMethodBeat.o(63227);
      }
    }
    while (true)
    {
      return;
      AppMethodBeat.o(63227);
    }
  }

  public final void run()
  {
    AppMethodBeat.i(63226);
    super.run();
    Object localObject = EmojiLoaderProxy.exx;
    EmojiLoaderProxy.access$setRequestCount$cp(EmojiLoaderProxy.access$getRequestCount$cp() + 1);
    if (EmojiLoaderProxy.access$getNeedCreate$cp())
    {
      EmojiLoaderProxy.access$setNeedCreate$cp(false);
      localObject = new EmojiLoaderProxy(new d(ah.getContext()));
      j.p(localObject, "<set-?>");
      EmojiLoaderProxy.access$setInstance$cp((EmojiLoaderProxy)localObject);
    }
    localObject = EmojiLoaderProxy.exx;
    EmojiLoaderProxy.access$getInstance$cp().load(this.exP);
    AppMethodBeat.o(63226);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.loader.e.e
 * JD-Core Version:    0.6.2
 */