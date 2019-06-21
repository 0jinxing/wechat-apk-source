package com.tencent.mm.emoji.loader.c;

import a.f.b.j;
import a.l;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.emoji.d.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.vfs.e;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/emoji/loader/fetcher/EmojiHttpFetcher;", "Lcom/tencent/mm/emoji/loader/fetcher/EmojiFetcher;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "callback", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "success", "", "fetcherConfig", "Lcom/tencent/mm/emoji/loader/fetcher/EmojiFetcherConfig;", "fetch", "getEmojiData", "Lcom/tencent/mm/modelimage/loader/model/Response;", "reportResult", "reportStart", "plugin-emojisdk_release"})
public final class f
  implements c
{
  private final String TAG = "MicroMsg.EmojiLoader.EmojiHttpFetcher";
  private d exC;
  private a.f.a.b<? super Boolean, y> exD;

  private final void bW(boolean paramBoolean)
  {
    AppMethodBeat.i(63190);
    d locald = this.exC;
    if (locald != null)
      if (paramBoolean)
      {
        com.tencent.mm.plugin.emoji.c.hF(2L);
        AppMethodBeat.o(63190);
      }
    while (true)
    {
      return;
      com.tencent.mm.plugin.emoji.c.hF(3L);
      switch (locald.exR)
      {
      default:
      case 0:
      case 1:
      case 2:
      }
      while (true)
      {
        AppMethodBeat.o(63190);
        break;
        com.tencent.mm.plugin.emoji.c.a(locald.exP.Aq(), 4, 1, 1, locald.exP.awa(), 1, locald.exP.field_designerID);
        AppMethodBeat.o(63190);
        break;
        com.tencent.mm.plugin.emoji.c.a(locald.exP.Aq(), 2, 1, 1, locald.exP.awa(), 1, locald.exP.field_designerID);
        AppMethodBeat.o(63190);
        break;
        com.tencent.mm.plugin.emoji.c.a(locald.exP.Aq(), 4, 1, 1, locald.exP.awa(), 1, locald.exP.field_designerID);
      }
      AppMethodBeat.o(63190);
    }
  }

  public final void a(d paramd, a.f.a.b<? super Boolean, y> paramb)
  {
    AppMethodBeat.i(63189);
    j.p(paramd, "fetcherConfig");
    this.exC = paramd;
    this.exD = paramb;
    Object localObject = this.exC;
    if (localObject != null);
    label84: label93: int i;
    switch (((d)localObject).exR)
    {
    default:
      localObject = this.exC;
      if (localObject != null)
      {
        localObject = new a().sE(((d)localObject).url);
        if (localObject == null)
          break label194;
        localObject = ((com.tencent.mm.at.a.d.b)localObject).data;
        if (localObject != null)
        {
          if (localObject.length != 0)
            break label199;
          i = 1;
          label105: if (i == 0)
            break label213;
        }
        ab.i(this.TAG, "download fail " + paramd.exP.Aq());
        bW(false);
        if (paramb == null)
          break label205;
        paramb.am(Boolean.FALSE);
        AppMethodBeat.o(63189);
      }
      break;
    case 0:
    case 1:
    case 2:
    }
    while (true)
    {
      return;
      com.tencent.mm.plugin.emoji.c.hF(1L);
      break;
      com.tencent.mm.plugin.emoji.c.hF(6L);
      break;
      com.tencent.mm.plugin.emoji.c.hF(10L);
      break;
      localObject = null;
      break label84;
      label194: localObject = null;
      break label93;
      label199: i = 0;
      break label105;
      label205: AppMethodBeat.o(63189);
      continue;
      label213: ab.i(this.TAG, "download success " + paramd.exP.Aq() + ", " + paramd.path);
      new com.tencent.mm.vfs.b(paramd.path).dMC().mkdirs();
      e.q(paramd.path, (byte[])localObject);
      bW(true);
      if (paramb != null)
      {
        paramb.am(Boolean.TRUE);
        AppMethodBeat.o(63189);
      }
      else
      {
        AppMethodBeat.o(63189);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.loader.c.f
 * JD-Core Version:    0.6.2
 */