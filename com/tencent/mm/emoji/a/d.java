package com.tencent.mm.emoji.a;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.vfs.e;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/emoji/model/EmojiUploadLogic;", "", "emojiInfo", "Lcom/tencent/mm/storage/emotion/EmojiInfo;", "attachedEmojiMD5", "", "", "imitateMd5", "callback", "Lcom/tencent/mm/emoji/model/EmojiUploadLogic$EmojiUploadCallback;", "(Lcom/tencent/mm/storage/emotion/EmojiInfo;Ljava/util/List;Ljava/lang/String;Lcom/tencent/mm/emoji/model/EmojiUploadLogic$EmojiUploadCallback;)V", "getAttachedEmojiMD5", "()Ljava/util/List;", "getCallback", "()Lcom/tencent/mm/emoji/model/EmojiUploadLogic$EmojiUploadCallback;", "setCallback", "(Lcom/tencent/mm/emoji/model/EmojiUploadLogic$EmojiUploadCallback;)V", "getEmojiInfo", "()Lcom/tencent/mm/storage/emotion/EmojiInfo;", "setEmojiInfo", "(Lcom/tencent/mm/storage/emotion/EmojiInfo;)V", "emojiMgr", "Lcom/tencent/mm/pluginsdk/defimpl/IEmojiMgr;", "kotlin.jvm.PlatformType", "getImitateMd5", "()Ljava/lang/String;", "dealSaveSuccess", "", "gifMd5", "doUpload", "preCheck", "", "Companion", "EmojiUploadCallback", "plugin-emojisdk_release"})
public final class d
{
  public static final d.a eyZ;
  EmojiInfo exP;
  final String eyL;
  private final com.tencent.mm.pluginsdk.a.d eyW;
  final List<String> eyX;
  d.b eyY;

  static
  {
    AppMethodBeat.i(63248);
    eyZ = new d.a((byte)0);
    AppMethodBeat.o(63248);
  }

  public d(EmojiInfo paramEmojiInfo, List<String> paramList, String paramString, d.b paramb)
  {
    AppMethodBeat.i(63247);
    this.exP = paramEmojiInfo;
    this.eyX = paramList;
    this.eyL = paramString;
    this.eyY = paramb;
    paramEmojiInfo = g.M(com.tencent.mm.plugin.emoji.b.d.class);
    j.o(paramEmojiInfo, "plugin(IPluginEmoji::class.java)");
    this.eyW = ((com.tencent.mm.plugin.emoji.b.d)paramEmojiInfo).getEmojiMgr();
    int i;
    if (!e.ct(this.exP.dve()))
    {
      paramEmojiInfo = this.eyY;
      if (paramEmojiInfo != null)
        paramEmojiInfo.f(10, null, null);
      i = 0;
    }
    while (true)
    {
      if (i != 0)
      {
        ab.i("MicroMsg.EmojiUploadLogic", "start upload emoji");
        g.RS().aa((Runnable)new d.c(this));
      }
      AppMethodBeat.o(63247);
      return;
      if (e.asZ(this.exP.dve()) > this.eyW.d(this.exP, true))
      {
        paramEmojiInfo = this.eyY;
        if (paramEmojiInfo != null)
          paramEmojiInfo.f(2, null, null);
        i = 0;
      }
      else
      {
        paramEmojiInfo = b.eyD;
        if (b.OF())
        {
          if (5 > this.exP.dva())
          {
            this.exP.dvb();
            paramEmojiInfo = g.M(com.tencent.mm.plugin.emoji.b.d.class);
            j.o(paramEmojiInfo, "MMKernel.plugin(IPluginEmoji::class.java)");
            ((com.tencent.mm.plugin.emoji.b.d)paramEmojiInfo).getEmojiMgr().updateEmojiInfo(this.exP);
            paramEmojiInfo = this.eyY;
            if (paramEmojiInfo != null)
              paramEmojiInfo.f(3, null, null);
          }
          while (true)
          {
            i = 0;
            break;
            paramEmojiInfo = this.eyY;
            if (paramEmojiInfo != null)
              paramEmojiInfo.f(9, null, null);
          }
        }
        i = 1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.a.d
 * JD-Core Version:    0.6.2
 */