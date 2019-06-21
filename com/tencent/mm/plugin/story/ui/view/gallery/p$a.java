package com.tencent.mm.plugin.story.ui.view.gallery;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.al.f;
import com.tencent.mm.g.b.a.an;
import com.tencent.mm.i.h.a;
import com.tencent.mm.modelvideo.b.a;
import com.tencent.mm.plugin.story.g.h;
import com.tencent.mm.plugin.story.model.d.i;
import com.tencent.mm.sdk.platformtools.ab;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryVideoViewMgr$VideoPlayCdnCallback;", "Lcom/tencent/mm/cdn/keep_VideoTaskInfo$IVideoCdnCallback;", "(Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryVideoViewMgr;)V", "TAG", "", "engineCallback", "Lcom/tencent/mm/modelvideo/IOnlineVideoProxy$IEngineCallback;", "isMoovReady", "", "item", "Lcom/tencent/mm/plugin/story/model/gallery/StoryVideoItem;", "videoCache", "Lcom/tencent/mm/plugin/story/storage/StoryVideoCache;", "onDataAvailable", "", "mediaId", "offset", "", "length", "onFinish", "ret", "sceneResult", "Lcom/tencent/mm/cdn/keep_SceneResult;", "onMoovReady", "onProgress", "total", "setIEngineCallback", "callback", "setVideoCache", "vitem", "plugin-story_release"})
final class p$a
  implements h.a
{
  final String TAG = "MicroMsg.VideoPlayProxy";
  b.a hYm;
  volatile boolean sqw;
  i sqy;
  com.tencent.mm.plugin.story.h.n srk;

  public final void a(com.tencent.mm.plugin.story.h.n paramn, i parami)
  {
    this.srk = paramn;
    this.sqy = parami;
  }

  public final void a(String paramString, int paramInt, com.tencent.mm.i.d paramd)
  {
    int i = 0;
    Object localObject1 = null;
    AppMethodBeat.i(110969);
    j.p(paramString, "mediaId");
    Object localObject2 = this.TAG;
    Object localObject3 = new StringBuilder("onFinish, mediaId:").append(paramString).append(", ret:").append(paramInt).append(", sceneResult:");
    int j;
    label106: long l;
    if (paramd != null)
    {
      j = paramd.field_retCode;
      StringBuilder localStringBuilder = ((StringBuilder)localObject3).append(j).append(" this:").append(this).append(" currVideoItem:");
      localObject3 = this.srl.srb;
      if (localObject3 == null)
        break label550;
      localObject3 = ((i)localObject3).username;
      ab.i((String)localObject2, (String)localObject3);
      localObject3 = this.sqy;
      if (localObject3 != null)
      {
        localObject2 = com.tencent.mm.plugin.story.g.b.sbw;
        com.tencent.mm.plugin.story.g.b.lk(((i)localObject3).rUJ);
        n.sqi.lB(((i)localObject3).rUJ);
      }
      localObject3 = this.srk;
      if (localObject3 == null)
        break label556;
      localObject3 = ((com.tencent.mm.plugin.story.h.n)localObject3).field_filePath;
      label174: localObject3 = com.tencent.mm.plugin.sight.base.d.WR((String)localObject3);
      if (localObject3 != null)
      {
        localObject2 = h.scu;
        h.cAE().bq(((com.tencent.mm.plugin.sight.base.a)localObject3).eWK);
        localObject2 = h.scu;
        h.cAE().br(((com.tencent.mm.plugin.sight.base.a)localObject3).videoBitrate);
        localObject2 = h.scu;
        h.cAE().bs(((com.tencent.mm.plugin.sight.base.a)localObject3).fzS);
        localObject2 = h.scu;
        h.cAE().bt(((com.tencent.mm.plugin.sight.base.a)localObject3).eTk);
        localObject2 = h.scu;
        h.cAE().bu(((com.tencent.mm.plugin.sight.base.a)localObject3).width);
        localObject2 = h.scu;
        h.cAE().bv(((com.tencent.mm.plugin.sight.base.a)localObject3).height);
        localObject2 = h.scu;
        h.cAE().bw(((com.tencent.mm.plugin.sight.base.a)localObject3).qwV);
      }
      localObject3 = h.scu;
      localObject2 = h.cAE();
      if (this.srk == null)
        break label562;
      localObject3 = this.srk;
      if (localObject3 == null)
        j.dWJ();
      l = ((com.tencent.mm.plugin.story.h.n)localObject3).field_totalSize;
      label351: ((an)localObject2).bp(l);
      localObject3 = h.scu;
      localObject2 = h.cAE();
      localObject3 = this.srk;
      if (localObject3 == null)
        break label568;
      localObject3 = ((com.tencent.mm.plugin.story.h.n)localObject3).field_url;
      label387: ((an)localObject2).ft((String)localObject3);
      localObject3 = h.scu;
      localObject2 = h.cAE();
      f.afy();
      localObject3 = this.srk;
      if (localObject3 == null)
        break label574;
    }
    label550: label556: label562: label568: label574: for (localObject3 = ((com.tencent.mm.plugin.story.h.n)localObject3).field_filePath; ; localObject3 = null)
    {
      ((an)localObject2).fu(com.tencent.mm.al.a.rJ((String)localObject3));
      if (paramd != null)
      {
        localObject3 = h.scu;
        h.cAE().bn(paramd.field_startTime);
        localObject3 = h.scu;
        h.cAE().bo(paramd.field_endTime);
      }
      localObject3 = localObject1;
      if (paramd != null)
        localObject3 = paramd.field_usedSvrIps;
      if (localObject3 == null)
        break label596;
      localObject3 = new StringBuffer();
      paramd = paramd.field_usedSvrIps;
      int k = paramd.length;
      for (j = i; j < k; j++)
        ((StringBuffer)localObject3).append(paramd[j]).append("|");
      j = 0;
      break;
      localObject3 = null;
      break label106;
      localObject3 = null;
      break label174;
      l = 0L;
      break label351;
      localObject3 = null;
      break label387;
    }
    paramd = h.scu;
    h.cAE().fv(((StringBuffer)localObject3).toString());
    label596: if (this.srl.sqX != null)
    {
      paramd = h.scu;
      localObject3 = h.cAE();
      paramd = this.srl.sqX;
      if (paramd == null)
        j.dWJ();
      ((an)localObject3).bx(paramd.cFa);
      paramd = h.scu;
      paramd = h.cAE();
      localObject3 = this.srl.sqX;
      if (localObject3 == null)
        j.dWJ();
      if (!((p.b)localObject3).sqx)
        break label715;
      l = 3L;
    }
    while (true)
    {
      paramd.by(l);
      paramd = h.scu;
      h.cAF();
      com.tencent.mm.ab.b.a((a.f.a.a)new p.a.b(this, paramString, paramInt));
      AppMethodBeat.o(110969);
      return;
      label715: localObject3 = this.srl.sqX;
      if (localObject3 == null)
        j.dWJ();
      if (((p.b)localObject3).cFa > 0)
        l = 2L;
      else
        l = 1L;
    }
  }

  public final void h(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(110968);
    j.p(paramString, "mediaId");
    String str = this.TAG;
    StringBuilder localStringBuilder = new StringBuilder("onProgress, mediaId:").append(paramString).append(", offset:").append(paramInt1).append(", total:").append(paramInt2).append(" this:").append(this).append(" currVideoItem:");
    Object localObject = this.srl.srb;
    if (localObject != null);
    for (localObject = ((i)localObject).username; ; localObject = null)
    {
      ab.i(str, (String)localObject);
      com.tencent.mm.ab.b.a((a.f.a.a)new p.a.d(this, paramString, paramInt1, paramInt2));
      AppMethodBeat.o(110968);
      return;
    }
  }

  public final void onDataAvailable(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(110967);
    j.p(paramString, "mediaId");
    String str = this.TAG;
    StringBuilder localStringBuilder = new StringBuilder("onDataAvailable, mediaId:").append(paramString).append(", offset:").append(paramInt1).append(", length:").append(paramInt2).append(" this:").append(this).append(" currVideoItem:");
    Object localObject = this.srl.srb;
    if (localObject != null);
    for (localObject = ((i)localObject).username; ; localObject = null)
    {
      ab.i(str, (String)localObject);
      com.tencent.mm.ab.b.a((a.f.a.a)new p.a.a(this, paramString, paramInt1, paramInt2));
      AppMethodBeat.o(110967);
      return;
    }
  }

  public final void onMoovReady(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(110966);
    j.p(paramString, "mediaId");
    String str = this.TAG;
    StringBuilder localStringBuilder = new StringBuilder("onMoovReady, mediaId:").append(paramString).append(", offset:").append(paramInt1).append(", length:").append(paramInt2).append(", isMoovReady:").append(this.sqw).append(" this:").append(this).append(" currVideoItem:");
    Object localObject = this.srl.srb;
    if (localObject != null)
    {
      localObject = ((i)localObject).username;
      ab.i(str, (String)localObject);
      if (!this.sqw)
        break label137;
      AppMethodBeat.o(110966);
    }
    while (true)
    {
      return;
      localObject = null;
      break;
      label137: this.sqw = true;
      com.tencent.mm.ab.b.a((a.f.a.a)new p.a.c(this, paramString, paramInt1, paramInt2));
      AppMethodBeat.o(110966);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.p.a
 * JD-Core Version:    0.6.2
 */