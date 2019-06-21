package com.tencent.mm.emoji.loader;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.remoteservice.f;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.EmojiInfo;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/emoji/loader/EmojiLoaderProxy;", "Lcom/tencent/mm/remoteservice/BaseClientRequest;", "serverProxy", "Lcom/tencent/mm/remoteservice/RemoteServiceProxy;", "(Lcom/tencent/mm/remoteservice/RemoteServiceProxy;)V", "getServerProxy", "()Lcom/tencent/mm/remoteservice/RemoteServiceProxy;", "load", "", "emojiInfo", "Lcom/tencent/mm/storage/emotion/EmojiInfo;", "loadRemote", "md5", "", "Companion", "plugin-emojisdk_release"})
public final class EmojiLoaderProxy extends com.tencent.mm.remoteservice.a
{
  private static EmojiLoaderProxy exu;
  private static int exv;
  private static boolean exw;
  public static final EmojiLoaderProxy.a exx;
  private final com.tencent.mm.remoteservice.d ext;

  static
  {
    AppMethodBeat.i(63164);
    exx = new EmojiLoaderProxy.a((byte)0);
    exu = new EmojiLoaderProxy(new com.tencent.mm.remoteservice.d(ah.getContext()));
    exw = true;
    AppMethodBeat.o(63164);
  }

  public EmojiLoaderProxy(com.tencent.mm.remoteservice.d paramd)
  {
    super(paramd);
    this.ext = paramd;
  }

  public final com.tencent.mm.remoteservice.d getServerProxy()
  {
    return this.ext;
  }

  public final void load(EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(63162);
    j.p(paramEmojiInfo, "emojiInfo");
    ab.i("MicroMsg.EmojiLoaderProxy", "load: " + paramEmojiInfo.Aq());
    REMOTE_CALL("loadRemote", new Object[] { paramEmojiInfo.Aq() });
    AppMethodBeat.o(63162);
  }

  @f
  public final void loadRemote(String paramString)
  {
    AppMethodBeat.i(63163);
    j.p(paramString, "md5");
    ab.i("MicroMsg.EmojiLoaderProxy", "loadRemote: ".concat(String.valueOf(paramString)));
    Object localObject = at.dsZ();
    j.o(localObject, "EmojiStorageMgr.getInstance()");
    paramString = ((at)localObject).aUp().aqi(paramString);
    if (paramString == null)
      AppMethodBeat.o(63163);
    while (true)
    {
      return;
      localObject = a.exs;
      a.c(paramString);
      AppMethodBeat.o(63163);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.loader.EmojiLoaderProxy
 * JD-Core Version:    0.6.2
 */