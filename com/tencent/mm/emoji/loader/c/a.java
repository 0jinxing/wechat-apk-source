package com.tencent.mm.emoji.loader.c;

import a.f.b.j;
import a.l;
import a.y;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.al.f;
import com.tencent.mm.i.g;
import com.tencent.mm.i.g.a;
import com.tencent.mm.storage.emotion.EmojiInfo;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/emoji/loader/fetcher/EmojiCdnFetcher;", "Lcom/tencent/mm/emoji/loader/fetcher/EmojiFetcher;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "callback", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "success", "", "cdnCallback", "com/tencent/mm/emoji/loader/fetcher/EmojiCdnFetcher$cdnCallback$1", "Lcom/tencent/mm/emoji/loader/fetcher/EmojiCdnFetcher$cdnCallback$1;", "fetcherConfig", "Lcom/tencent/mm/emoji/loader/fetcher/EmojiFetcherConfig;", "createCdnTask", "Lcom/tencent/mm/cdn/keep_TaskInfo;", "fetch", "plugin-emojisdk_release"})
public final class a
  implements c
{
  final String TAG;
  private d exC;
  private a.f.a.b<? super Boolean, y> exD;
  private final a.a exE;

  public a()
  {
    AppMethodBeat.i(63174);
    this.TAG = "MicroMsg.EmojiLoader.EmojiFetcher";
    this.exE = new a.a(this);
    AppMethodBeat.o(63174);
  }

  public final void a(d paramd, a.f.a.b<? super Boolean, y> paramb)
  {
    AppMethodBeat.i(63173);
    j.p(paramd, "fetcherConfig");
    this.exC = paramd;
    this.exD = paramb;
    paramd = f.afx();
    paramb = new g();
    d locald = this.exC;
    if (locald == null)
      j.avw("fetcherConfig");
    paramb.field_authKey = locald.exQ;
    paramb.field_fileType = 19;
    StringBuilder localStringBuilder = new StringBuilder().append(c.a.Ox());
    locald = this.exC;
    if (locald == null)
      j.avw("fetcherConfig");
    paramb.field_mediaId = locald.exP.Aq();
    locald = this.exC;
    if (locald == null)
      j.avw("fetcherConfig");
    paramb.field_fullpath = locald.path;
    locald = this.exC;
    if (locald == null)
      j.avw("fetcherConfig");
    paramb.egm = locald.url;
    paramb.egl = ((g.a)this.exE);
    paramd.d(paramb);
    AppMethodBeat.o(63173);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.emoji.loader.c.a
 * JD-Core Version:    0.6.2
 */