package com.tencent.mm.emoji.decode;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.emoji.PluginEmoji;
import com.tencent.mm.plugin.gif.MMGIFException;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.r;
import com.tencent.mm.storage.emotion.EmojiGroupInfo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.io.InputStream;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/emoji/decode/MMGIFJNIFactory$Companion;", "", "()V", "getDecoder", "Lcom/tencent/mm/emoji/decode/IGIFDecoder;", "emojiInfo", "Lcom/tencent/mm/storage/emotion/EmojiInfo;", "isValid", "", "decoder", "plugin-emojisdk_release"})
public final class MMGIFJNIFactory$Companion
{
  public final b getDecoder(EmojiInfo paramEmojiInfo)
  {
    AppMethodBeat.i(63145);
    j.p(paramEmojiInfo, "emojiInfo");
    try
    {
      Object localObject1;
      if ((paramEmojiInfo.getGroup() == EmojiGroupInfo.yad) || (paramEmojiInfo.getGroup() == EmojiInfo.yak) || (paramEmojiInfo.getGroup() == EmojiInfo.yaj))
      {
        localObject1 = new com/tencent/mm/emoji/decode/c;
        ((c)localObject1).<init>(paramEmojiInfo.w(ah.getContext(), 300));
        localObject1 = (b)localObject1;
        paramEmojiInfo = (EmojiInfo)localObject1;
      }
      while (paramEmojiInfo == null)
      {
        paramEmojiInfo = (b)new a();
        AppMethodBeat.o(63145);
        return paramEmojiInfo;
        Object localObject2;
        if (paramEmojiInfo.duS())
        {
          localObject2 = new com/tencent/mm/emoji/decode/d;
          localObject1 = EmojiInfo.bJ(ah.getContext(), paramEmojiInfo.getName());
          j.o(localObject1, "EmojiInfo.getEmojiFile(M…ontext(), emojiInfo.name)");
          ((d)localObject2).<init>((InputStream)localObject1);
          localObject1 = (b)localObject2;
          paramEmojiInfo = (EmojiInfo)localObject1;
        }
        else
        {
          localObject1 = g.M(PluginEmoji.class);
          j.o(localObject1, "MMKernel.plugin(PluginEmoji::class.java)");
          localObject1 = ((PluginEmoji)localObject1).getProvider().l(paramEmojiInfo);
          if (localObject1 == null)
            break label269;
          if (r.bU((byte[])localObject1))
          {
            localObject2 = new com/tencent/mm/emoji/decode/e;
            ((e)localObject2).<init>((byte[])localObject1);
            localObject1 = (b)localObject2;
            paramEmojiInfo = (EmojiInfo)localObject1;
          }
          else
          {
            localObject2 = new com/tencent/mm/emoji/decode/d;
            ((d)localObject2).<init>((byte[])localObject1);
            localObject1 = (b)localObject2;
            paramEmojiInfo = (EmojiInfo)localObject1;
          }
        }
      }
    }
    catch (MMGIFException localMMGIFException)
    {
      while (true)
        if (localMMGIFException.getErrorCode() == 103)
        {
          com.tencent.mm.kernel.b.a locala = g.M(PluginEmoji.class);
          j.o(locala, "MMKernel.plugin(PluginEmoji::class.java)");
          paramEmojiInfo = ((PluginEmoji)locala).getProvider().l(paramEmojiInfo);
          if (paramEmojiInfo != null)
          {
            paramEmojiInfo = (b)new c(paramEmojiInfo);
            continue;
            AppMethodBeat.o(63145);
            continue;
          }
        }
        else
        {
          label269: paramEmojiInfo = null;
        }
    }
  }

  public final boolean isValid(b paramb)
  {
    if ((paramb != null) && (!(paramb instanceof a)));
    for (boolean bool = true; ; bool = false)
      return bool;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.decode.MMGIFJNIFactory.Companion
 * JD-Core Version:    0.6.2
 */