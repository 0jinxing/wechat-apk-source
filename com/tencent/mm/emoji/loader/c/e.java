package com.tencent.mm.emoji.loader.c;

import a.f.a.a;
import a.f.b.j;
import a.l;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.emoji.c;
import com.tencent.mm.protocal.protobuf.hv;
import com.tencent.mm.protocal.protobuf.xx;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.emotion.EmojiInfo;
import java.util.Collection;
import java.util.LinkedList;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/emoji/loader/fetcher/EmojiFetcherConfigRetriever;", "Lcom/tencent/mm/modelbase/IOnSceneEnd;", "emojiInfo", "Lcom/tencent/mm/storage/emotion/EmojiInfo;", "callback", "Lkotlin/Function2;", "", "Lkotlin/ParameterName;", "name", "success", "Lcom/tencent/mm/emoji/loader/fetcher/EmojiFetcherConfig;", "config", "", "(Lcom/tencent/mm/storage/emotion/EmojiInfo;Lkotlin/jvm/functions/Function2;)V", "TAG", "", "getCallback", "()Lkotlin/jvm/functions/Function2;", "getEmojiInfo", "()Lcom/tencent/mm/storage/emotion/EmojiInfo;", "scene", "Lcom/tencent/mm/plugin/emoji/net/NetSceneBatchEmojiDownLoad;", "createFetcherConfig", "onSceneEnd", "errType", "", "errCode", "errMsg", "Lcom/tencent/mm/modelbase/NetSceneBase;", "plugin-emojisdk_release"})
public final class e
  implements f
{
  private final String TAG;
  private final EmojiInfo exP;
  private final com.tencent.mm.plugin.emoji.f.e exS;
  final a.f.a.m<Boolean, d, y> exT;

  public e(EmojiInfo paramEmojiInfo, a.f.a.m<? super Boolean, ? super d, y> paramm)
  {
    AppMethodBeat.i(63188);
    this.exP = paramEmojiInfo;
    this.exT = paramm;
    this.TAG = "MicroMsg.EmojiFetcherConfigRetriever";
    paramEmojiInfo = new LinkedList();
    paramEmojiInfo.add(this.exP.Aq());
    this.exS = new com.tencent.mm.plugin.emoji.f.e(paramEmojiInfo);
    paramEmojiInfo = e(this.exP);
    int i;
    if (((CharSequence)paramEmojiInfo.url).length() > 0)
    {
      i = 1;
      if (i == 0)
        break label124;
      this.exT.m(Boolean.TRUE, paramEmojiInfo);
      AppMethodBeat.o(63188);
    }
    while (true)
    {
      return;
      i = 0;
      break;
      label124: ab.i(this.TAG, "config retriever: db url is empty");
      c.hF(9L);
      paramEmojiInfo = g.RO();
      j.o(paramEmojiInfo, "network()");
      paramEmojiInfo.Rg().a(697, (f)this);
      paramEmojiInfo = g.RO();
      j.o(paramEmojiInfo, "MMKernel.network()");
      paramEmojiInfo.Rg().d((com.tencent.mm.ai.m)this.exS);
      AppMethodBeat.o(63188);
    }
  }

  private final d e(EmojiInfo paramEmojiInfo)
  {
    int i = 0;
    AppMethodBeat.i(63186);
    String str1 = paramEmojiInfo.dve() + "_temp";
    String str2;
    if (h.f(paramEmojiInfo))
    {
      ab.i(this.TAG, "createFetcherConfig: " + paramEmojiInfo.Aq() + " use tp url");
      str2 = paramEmojiInfo.field_tpurl;
      j.o(str2, "emojiInfo.field_tpurl");
      i = 3;
      if (paramEmojiInfo.field_tpauthkey != null)
        break label299;
    }
    label299: for (String str3 = ""; ; str3 = paramEmojiInfo.field_tpauthkey)
    {
      j.o(str3, "if (null == emojiInfo.fi…emojiInfo.field_tpauthkey");
      paramEmojiInfo = new d(paramEmojiInfo, str2, str1, str3, i);
      AppMethodBeat.o(63186);
      return paramEmojiInfo;
      if (h.g(paramEmojiInfo))
      {
        ab.i(this.TAG, "createFetcherConfig: " + paramEmojiInfo.Aq() + " use wxam");
        str2 = paramEmojiInfo.field_externUrl;
        j.o(str2, "emojiInfo.field_externUrl");
        i = 2;
        break;
      }
      if (h.h(paramEmojiInfo))
      {
        ab.i(this.TAG, "createFetcherConfig: " + paramEmojiInfo.Aq() + " use encrypt");
        str2 = paramEmojiInfo.field_encrypturl;
        j.o(str2, "emojiInfo.field_encrypturl");
        i = 1;
        break;
      }
      if (!bo.isNullOrNil(paramEmojiInfo.field_cdnUrl))
      {
        ab.i(this.TAG, "createFetcherConfig: " + paramEmojiInfo.Aq() + " use cdn url");
        str2 = paramEmojiInfo.field_cdnUrl;
        j.o(str2, "emojiInfo.field_cdnUrl");
        break;
      }
      str2 = "";
      break;
    }
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(63187);
    j.p(paramm, "scene");
    int i = paramm.getType();
    ab.i(this.TAG, "onSceneEnd: " + paramInt1 + ", " + paramInt2 + ", " + i);
    if ((i == 697) && (j.j(paramm, this.exS)))
    {
      paramString = g.RO();
      j.o(paramString, "network()");
      paramString.Rg().b(697, (f)this);
      paramm = this.exS.bku();
      if (paramm != null)
      {
        paramString = paramm.vKl;
        paramString = (Collection)paramString;
        if ((paramString != null) && (!paramString.isEmpty()))
          break label199;
        paramInt1 = 1;
        label148: if (paramInt1 == 0)
          break label204;
        ab.i(this.TAG, "onSceneEnd: response list is empty");
        com.tencent.mm.plugin.report.service.h.pYm.z(164L, 11L);
        this.exT.m(Boolean.FALSE, null);
        AppMethodBeat.o(63187);
      }
    }
    while (true)
    {
      return;
      paramString = null;
      break;
      label199: paramInt1 = 0;
      break label148;
      label204: com.tencent.mm.plugin.emoji.h.b.a((xx)paramm.vKl.get(0), this.exP);
      paramString = e(this.exP);
      if (((CharSequence)paramString.url).length() > 0);
      for (paramInt1 = 1; ; paramInt1 = 0)
      {
        if (paramInt1 == 0)
          break label319;
        paramm = g.M(com.tencent.mm.plugin.emoji.b.d.class);
        j.o(paramm, "MMKernel.plugin(IPluginEmoji::class.java)");
        ((com.tencent.mm.plugin.emoji.b.d)paramm).getProvider().updateEmojiInfo(this.exP);
        com.tencent.mm.ab.b.a("EmojiFetcherConfigRetriever_onSceneEnd", (a)new e.a(this, paramString));
        AppMethodBeat.o(63187);
        break;
      }
      label319: this.exT.m(Boolean.FALSE, null);
      AppMethodBeat.o(63187);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.loader.c.e
 * JD-Core Version:    0.6.2
 */