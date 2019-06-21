package com.tencent.mm.plugin.story.ui.view.gallery;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.b.a.ar;
import com.tencent.mm.i.h.a;
import com.tencent.mm.modelcontrol.d;
import com.tencent.mm.plugin.story.e.c.a;
import com.tencent.mm.plugin.story.h.k;
import com.tencent.mm.plugin.story.model.d.i;
import com.tencent.mm.plugin.story.model.j.a;
import com.tencent.mm.plugin.story.model.s;
import com.tencent.mm.protocal.protobuf.cek;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Arrays;
import java.util.Map;

@a.l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryVideoViewMgr$VideoPlayProxy;", "Lcom/tencent/mm/modelvideo/IOnlineVideoProxy;", "(Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryVideoViewMgr;)V", "TAG", "", "engineCallback", "Lcom/tencent/mm/modelvideo/IOnlineVideoProxy$IEngineCallback;", "item", "Lcom/tencent/mm/plugin/story/model/gallery/StoryVideoItem;", "preloadFinish", "", "getPreloadFinish", "()Z", "setPreloadFinish", "(Z)V", "preloadSize", "", "getPreloadSize", "()I", "setPreloadSize", "(I)V", "videoCache", "Lcom/tencent/mm/plugin/story/storage/StoryVideoCache;", "createReportRptTips", "", "", "()[Ljava/lang/Object;", "createVideoPlayCDNTask", "Lcom/tencent/mm/cdn/keep_VideoTaskInfo;", "mediaId", "url", "path", "callback", "Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryVideoViewMgr$VideoPlayCdnCallback;", "Lcom/tencent/mm/plugin/story/ui/view/gallery/StoryVideoViewMgr;", "isVideoDataAvailable", "offset", "length", "requestVideoData", "", "setIEngineCallback", "setStoryVideoItem", "startHttpStream", "stop", "plugin-story_release"})
final class p$b
  implements com.tencent.mm.modelvideo.b
{
  final String TAG = "MicroMsg.VideoPlayProxy";
  int cFa;
  private com.tencent.mm.modelvideo.b.a hYm;
  boolean sqx;
  i sqy;
  com.tencent.mm.plugin.story.h.n srk;

  public final void a(com.tencent.mm.modelvideo.b.a parama)
  {
    this.hYm = parama;
  }

  public final void dV(String paramString)
  {
    int i = 2;
    int j = 1;
    i locali = null;
    AppMethodBeat.i(110973);
    a.f.b.j.p(paramString, "mediaId");
    ab.i(this.TAG, "this: " + this + " stop " + paramString + ' ' + bo.dpG());
    Object[] arrayOfObject = new Object[17];
    Object localObject1 = this.srl.sqW;
    label123: int k;
    if (localObject1 != null)
    {
      localObject1 = Integer.valueOf(((StoryVideoView)localObject1).getCurrPosMs());
      arrayOfObject[0] = localObject1;
      localObject1 = this.srl.sqW;
      if (localObject1 == null)
        break label593;
      localObject1 = Integer.valueOf((int)((StoryVideoView)localObject1).getFirstPlayWaitTime());
      arrayOfObject[1] = localObject1;
      localObject1 = this.srl.sqW;
      if (localObject1 == null)
        break label599;
      localObject1 = Integer.valueOf(((StoryVideoView)localObject1).cCZ());
      label153: arrayOfObject[2] = localObject1;
      localObject1 = this.srl.sqW;
      if (localObject1 == null)
        break label605;
      localObject1 = Integer.valueOf(((StoryVideoView)localObject1).cDa());
      label183: arrayOfObject[3] = localObject1;
      localObject1 = this.srl.sqW;
      if (localObject1 == null)
        break label611;
      localObject1 = Integer.valueOf(((StoryVideoView)localObject1).cDb());
      label213: arrayOfObject[4] = localObject1;
      localObject1 = this.srl.sqW;
      if (localObject1 == null)
        break label617;
      localObject1 = Integer.valueOf(((StoryVideoView)localObject1).getStayTime());
      label243: arrayOfObject[5] = localObject1;
      localObject1 = this.srl.sqW;
      if (localObject1 == null)
        break label623;
      localObject1 = Integer.valueOf(((StoryVideoView)localObject1).getErrorCode());
      label273: arrayOfObject[6] = localObject1;
      arrayOfObject[7] = Integer.valueOf(this.cFa);
      if (this.cFa <= 0)
        break label629;
      k = 2;
      label302: arrayOfObject[8] = Integer.valueOf(k);
      k = i;
      if (this.sqx)
        k = 3;
      arrayOfObject[9] = Integer.valueOf(k);
      localObject1 = com.tencent.mm.plugin.story.e.c.rRS;
      localObject1 = this.srl.sqW;
      if (localObject1 != null)
      {
        localObject2 = ((StoryVideoView)localObject1).getFilePath();
        localObject1 = localObject2;
        if (localObject2 != null);
      }
      else
      {
        localObject1 = "";
      }
      arrayOfObject[10] = c.a.aak((String)localObject1);
      Object localObject2 = this.sqy;
      localObject1 = locali;
      if (localObject2 != null)
        localObject1 = Long.valueOf(((i)localObject2).rUJ);
      arrayOfObject[11] = localObject1;
      localObject1 = com.tencent.mm.plugin.story.g.h.scu;
      arrayOfObject[12] = Long.valueOf(com.tencent.mm.plugin.story.g.h.cAs().FF());
      localObject1 = com.tencent.mm.plugin.story.g.h.scu;
      arrayOfObject[13] = Long.valueOf(com.tencent.mm.plugin.story.g.h.cAs().FH());
      localObject1 = com.tencent.mm.plugin.story.g.h.scu;
      if (com.tencent.mm.plugin.story.g.h.cAs().FK() != 1L)
        break label635;
      k = j;
      label473: arrayOfObject[14] = Integer.valueOf(k);
      localObject1 = com.tencent.mm.plugin.story.model.j.rST;
      localObject1 = j.a.cxT();
      locali = this.sqy;
      if (locali == null)
        break label641;
    }
    label641: for (long l = locali.rUJ; ; l = 0L)
    {
      arrayOfObject[15] = Integer.valueOf(((k)localObject1).ly(l));
      arrayOfObject[16] = Integer.valueOf(this.srl.srh);
      ab.i(this.TAG, "reportTips: " + Arrays.toString(arrayOfObject));
      com.tencent.mm.modelvideo.o.alm().l(paramString, arrayOfObject);
      AppMethodBeat.o(110973);
      return;
      localObject1 = Integer.valueOf(0);
      break;
      label593: localObject1 = null;
      break label123;
      label599: localObject1 = null;
      break label153;
      label605: localObject1 = null;
      break label183;
      label611: localObject1 = null;
      break label213;
      label617: localObject1 = null;
      break label243;
      label623: localObject1 = null;
      break label273;
      label629: k = 1;
      break label302;
      label635: k = 0;
      break label473;
    }
  }

  public final boolean isVideoDataAvailable(String paramString, int paramInt1, int paramInt2)
  {
    String str1 = null;
    String str2 = null;
    AppMethodBeat.i(110975);
    a.f.b.j.p(paramString, "mediaId");
    Object localObject1 = this.sqy;
    Object localObject2;
    boolean bool;
    if (localObject1 != null)
    {
      localObject2 = s.rTV;
      this.srk = s.a((i)localObject1);
      localObject1 = this.srk;
      if ((localObject1 != null) && (((com.tencent.mm.plugin.story.h.n)localObject1).Jo() == true))
      {
        str1 = this.TAG;
        localObject1 = new StringBuilder("isVideoDataAvailable ").append(paramString).append(", ").append(paramInt1).append(", ").append(paramInt2).append(", download finish cacheSize:");
        localObject2 = this.srk;
        paramString = str2;
        if (localObject2 != null)
          paramString = Integer.valueOf(((com.tencent.mm.plugin.story.h.n)localObject2).field_cacheSize);
        ab.i(str1, paramString + " this:" + this);
        AppMethodBeat.o(110975);
        bool = true;
      }
    }
    while (true)
    {
      return bool;
      bool = com.tencent.mm.modelvideo.o.alm().isVideoDataAvailable(paramString, paramInt1, paramInt2);
      str2 = this.TAG;
      localObject1 = new StringBuilder("isVideoDataAvailable ").append(paramString).append(", ").append(paramInt1).append(", ").append(paramInt2).append(", available:").append(bool).append(" cacheSize:");
      localObject2 = this.srk;
      paramString = str1;
      if (localObject2 != null)
        paramString = Integer.valueOf(((com.tencent.mm.plugin.story.h.n)localObject2).field_cacheSize);
      ab.i(str2, paramString + " this:" + this);
      AppMethodBeat.o(110975);
    }
  }

  public final void p(i parami)
  {
    AppMethodBeat.i(110971);
    a.f.b.j.p(parami, "item");
    this.sqy = parami;
    s locals = s.rTV;
    this.srk = s.a(parami);
    ab.i(this.TAG, "setStoryVideoItem " + parami + " videoCache " + this.srk);
    AppMethodBeat.o(110971);
  }

  public final void r(String paramString1, String paramString2, String paramString3)
  {
    int i = 0;
    Object localObject1 = null;
    AppMethodBeat.i(110972);
    ab.i(this.TAG, "startHttpStream " + paramString1 + ' ' + paramString2 + ' ' + paramString3 + " this:" + this);
    Object localObject2;
    Object localObject3;
    Object localObject4;
    boolean bool;
    if (this.sqy != null)
    {
      localObject2 = s.rTV;
      localObject2 = this.sqy;
      if (localObject2 == null)
        a.f.b.j.dWJ();
      this.srk = s.a((i)localObject2);
      localObject2 = this.srk;
      if ((localObject2 != null) && (!com.tencent.mm.vfs.e.ct(((com.tencent.mm.plugin.story.h.n)localObject2).field_filePath)))
      {
        localObject3 = com.tencent.mm.plugin.story.model.l.rTg;
        localObject3 = ((com.tencent.mm.plugin.story.h.n)localObject2).field_filePath;
        a.f.b.j.o(localObject3, "it.field_filePath");
        com.tencent.mm.plugin.story.model.l.aay((String)localObject3);
        ab.i(this.TAG, "startHttpStream error downloadFinish " + ((com.tencent.mm.plugin.story.h.n)localObject2).Jo() + " ret:" + com.tencent.mm.vfs.e.ct(((com.tencent.mm.plugin.story.h.n)localObject2).field_filePath) + " path:" + ((com.tencent.mm.plugin.story.h.n)localObject2).field_filePath);
        ((com.tencent.mm.plugin.story.h.n)localObject2).cCe();
        localObject3 = com.tencent.mm.plugin.story.model.j.rST;
        j.a.cxX().b((com.tencent.mm.plugin.story.h.n)localObject2);
      }
      localObject2 = this.srl.srb;
      long l;
      if (localObject2 != null)
      {
        localObject3 = com.tencent.mm.plugin.story.g.c.sbQ;
        com.tencent.mm.plugin.story.g.c.czW();
        localObject3 = com.tencent.mm.plugin.story.g.b.sbw;
        l = ((i)localObject2).rUJ;
        if (com.tencent.mm.plugin.story.g.b.aiG())
        {
          ab.v("MicroMsg.StoryBrowseDetailIDKeyStat", "startHttp storyId ".concat(String.valueOf(l)));
          if (com.tencent.mm.plugin.story.g.b.sbi.containsKey(Long.valueOf(l)))
          {
            localObject2 = (com.tencent.mm.plugin.story.g.b.a)com.tencent.mm.plugin.story.g.b.sbi.get(Long.valueOf(l));
            if (localObject2 != null)
              ((com.tencent.mm.plugin.story.g.b.a)localObject2).sbA = true;
          }
        }
      }
      localObject2 = this.sqy;
      if (localObject2 == null)
        break label880;
      localObject2 = ((i)localObject2).rWj;
      if (localObject2 == null)
        break label880;
      localObject2 = ((cek)localObject2).Url;
      if (!bo.isNullOrNil((String)localObject2))
      {
        localObject2 = this.srl;
        ((p)localObject2).srh += 1;
        localObject2 = ((p)localObject2).sqW;
        if (localObject2 != null)
          ((StoryVideoView)localObject2).setNeedShowLoading(true);
        localObject2 = new p.a(this.srl);
        ((p.a)localObject2).hYm = this.hYm;
        ((p.a)localObject2).a(this.srk, this.sqy);
        localObject3 = new com.tencent.mm.i.h();
        localObject4 = new p.a(this.srl);
        ((p.a)localObject4).hYm = this.hYm;
        ((p.a)localObject4).a(this.srk, this.sqy);
        ((com.tencent.mm.i.h)localObject3).field_mediaId = paramString1;
        ((com.tencent.mm.i.h)localObject3).url = paramString3;
        ((com.tencent.mm.i.h)localObject3).egD = 1;
        ((com.tencent.mm.i.h)localObject3).egy = 6;
        ((com.tencent.mm.i.h)localObject3).concurrentCount = 4;
        ((com.tencent.mm.i.h)localObject3).field_fullpath = paramString2;
        ((com.tencent.mm.i.h)localObject3).egK = ((h.a)localObject2);
        ((com.tencent.mm.i.h)localObject3).field_fileType = com.tencent.mm.i.a.efK;
        ((com.tencent.mm.i.h)localObject3).field_requestVideoFormat = d.v(1, paramString2);
        paramString2 = n.sqi;
        paramString2 = this.sqy;
        if (paramString2 == null)
          a.f.b.j.dWJ();
        n.h(paramString2);
        paramString2 = this.srl.srb;
        if (paramString2 != null)
        {
          paramString3 = com.tencent.mm.plugin.story.g.b.sbw;
          l = paramString2.rUJ;
          if (this.srk != null)
          {
            paramString2 = this.srk;
            if ((paramString2 == null) || (paramString2.field_cacheSize != 0))
              break label886;
          }
          bool = true;
          label612: com.tencent.mm.plugin.story.g.b.z(l, bool);
        }
        com.tencent.mm.modelvideo.o.alm().a((com.tencent.mm.i.h)localObject3);
        if ((this.sqy != null) && (paramString1 != null))
        {
          paramString2 = n.sqi;
          paramString2 = this.sqy;
          if (paramString2 == null)
            a.f.b.j.dWJ();
          paramString3 = n.i(paramString2);
          if ((paramString3.sqw) && (!((p.a)localObject2).sqw))
          {
            localObject3 = this.TAG;
            localObject4 = new StringBuilder("checkPreloadOnVideoPlay ").append(paramString1).append(", moovReady, offset:").append(paramString3.xb).append(", length:").append(paramString3.bgY).append(", cacheSize:");
            paramString2 = this.srk;
            if (paramString2 == null)
              break label892;
          }
        }
      }
    }
    label880: label886: label892: for (paramString2 = Integer.valueOf(paramString2.field_cacheSize); ; paramString2 = null)
    {
      localObject4 = ((StringBuilder)localObject4).append(paramString2).append(", totalSize:");
      com.tencent.mm.plugin.story.h.n localn = this.srk;
      paramString2 = localObject1;
      if (localn != null)
        paramString2 = Integer.valueOf(localn.field_totalSize);
      ab.i((String)localObject3, paramString2 + ", preloadFinish:" + paramString3.sqx);
      if ((paramString3.xb > 0L) && (paramString3.bgY > 0L))
      {
        ((p.a)localObject2).onMoovReady(paramString1, (int)paramString3.xb, (int)paramString3.bgY);
        paramString1 = this.srk;
        if (paramString1 != null)
          i = paramString1.field_cacheSize;
        this.cFa = i;
        this.sqx = paramString3.sqx;
      }
      AppMethodBeat.o(110972);
      return;
      localObject2 = null;
      break;
      bool = false;
      break label612;
    }
  }

  public final void requestVideoData(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(110974);
    a.f.b.j.p(paramString, "mediaId");
    com.tencent.mm.ab.b.a((a.f.a.a)new p.b.a(this, paramString, paramInt1, paramInt2));
    AppMethodBeat.o(110974);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.story.ui.view.gallery.p.b
 * JD-Core Version:    0.6.2
 */