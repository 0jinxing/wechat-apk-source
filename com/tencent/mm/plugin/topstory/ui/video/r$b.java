package com.tencent.mm.plugin.topstory.ui.video;

import com.tencent.mars.cdn.CdnLogic;
import com.tencent.mars.cdn.CdnLogic.C2CDownloadRequest;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.al.e;
import com.tencent.mm.modelvideo.b.a;
import com.tencent.mm.protocal.protobuf.chx;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.Map;

final class r$b
  implements com.tencent.mm.modelvideo.b
{
  private chx sFG;

  private r$b(r paramr)
  {
  }

  public final void a(b.a parama)
  {
  }

  public final void dV(String paramString)
  {
    AppMethodBeat.i(1833);
    com.tencent.mm.modelvideo.o.alm().m(paramString, null);
    AppMethodBeat.o(1833);
  }

  public final boolean isVideoDataAvailable(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(1835);
    if ((this.sFG != null) && (paramInt1 + paramInt2 <= this.sFG.xhj));
    for (boolean bool1 = true; ; bool1 = false)
    {
      if ((paramInt1 == 0) && (bool1) && (this.sFC.sDo != null))
      {
        com.tencent.mm.plugin.topstory.a.b.a locala = this.sFC.sDo.cFR().sFp;
        if ((locala != null) && (locala.sAU == 0L))
        {
          locala.sAU = (System.currentTimeMillis() - locala.sAE);
          locala.sAV = paramInt1;
          locala.sAW = (paramInt1 + paramInt2);
          ab.i("MicroMsg.TopStory.TopStoryVideoViewMgr", "firstDataAvailable %d %d %d", new Object[] { Long.valueOf(locala.sAR), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        }
      }
      boolean bool2 = bool1;
      if (!bool1)
        bool2 = com.tencent.mm.modelvideo.o.alm().isVideoDataAvailable(paramString, paramInt1, paramInt2);
      AppMethodBeat.o(1835);
      return bool2;
    }
  }

  public final void r(String paramString1, String paramString2, String paramString3)
  {
    AppMethodBeat.i(1832);
    ab.i("MicroMsg.TopStory.TopStoryVideoViewMgr", "startHttpStream %s %s", new Object[] { paramString1, paramString2 });
    Object localObject1 = this.sFC.sDo.cFU();
    Object localObject2 = ((m)localObject1).sDo.cFR().sFp;
    Object localObject3;
    boolean bool;
    if (localObject2 != null)
    {
      if (!((m)localObject1).sET.containsKey(paramString1))
        break label458;
      localObject3 = (chx)((m)localObject1).sET.get(paramString1);
      if (((chx)localObject3).xhk >= 5L)
      {
        ab.i("MicroMsg.TopStory.TopStoryPreloadMgr", "hit preload cache %s percent %d offset %s", new Object[] { paramString1, Long.valueOf(((chx)localObject3).xhk), bo.my(((chx)localObject3).xhj) });
        ((com.tencent.mm.plugin.topstory.a.b.a)localObject2).sAM = 1L;
        ((com.tencent.mm.plugin.topstory.a.b.a)localObject2).sAN = ((chx)localObject3).xhk;
        ((com.tencent.mm.plugin.topstory.a.b.a)localObject2).sAO = ((chx)localObject3).xhj;
        com.tencent.mm.plugin.websearch.api.a.a.kT(25);
        this.sFG = ((chx)localObject3);
        localObject2 = new r.a(this.sFC, (byte)0);
        if (this.sFG == null)
          break label511;
        localObject3 = new long[2];
        if (this.sFG.xhk >= 100L)
          break label490;
        com.tencent.mm.modelvideo.o.alm().a(r.a(paramString1, paramString3, paramString2, (r.a)localObject2), false);
        localObject1 = new CdnLogic.C2CDownloadRequest();
        ((CdnLogic.C2CDownloadRequest)localObject1).fileKey = paramString1;
        ((CdnLogic.C2CDownloadRequest)localObject1).fileType = 90;
        ((CdnLogic.C2CDownloadRequest)localObject1).url = paramString3;
        ((CdnLogic.C2CDownloadRequest)localObject1).savePath = paramString2;
        bool = CdnLogic.queryVideoMoovInfo((CdnLogic.C2CDownloadRequest)localObject1, (long[])localObject3);
        label274: ab.i("MicroMsg.TopStory.TopStoryVideoViewMgr", "moov check mediaId %s ret %b", new Object[] { paramString1, Boolean.valueOf(bool) });
        if ((bool) && (!((r.a)localObject2).sFD))
          ((r.a)localObject2).onMoovReady(paramString1, (int)localObject3[0], (int)localObject3[1]);
        if (r.ab(this.sFG.xhk, this.sFG.xhj))
          ((r.a)localObject2).cHa();
        if (this.sFG.xhk == 100L)
        {
          ((r.a)localObject2).h(paramString1, (int)this.sFG.xhj, (int)this.sFG.xha);
          ((r.a)localObject2).a(paramString1, 0, null);
        }
        AppMethodBeat.o(1832);
      }
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.TopStory.TopStoryPreloadMgr", "hit preload cache %s but preload percent too small %d offset %s", new Object[] { paramString1, Long.valueOf(((chx)localObject3).xhk), bo.my(((chx)localObject3).xhj) });
      ((com.tencent.mm.plugin.topstory.a.b.a)localObject2).sAM = 3L;
      while (true)
      {
        ((m)localObject1).cGP();
        localObject3 = null;
        break;
        label458: localObject3 = new chx();
        ((chx)localObject3).cHr = paramString1;
        ((m)localObject1).sET.put(paramString1, localObject3);
      }
      label490: bool = true;
      localObject3[0] = new com.tencent.mm.plugin.a.b().vB(paramString2);
      break label274;
      label511: com.tencent.mm.modelvideo.o.alm().a(r.a(paramString1, paramString3, paramString2, (r.a)localObject2), false);
      AppMethodBeat.o(1832);
    }
  }

  public final void requestVideoData(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(1834);
    if ((this.sFG != null) && (paramInt1 + paramInt2 <= this.sFG.xhj))
      AppMethodBeat.o(1834);
    while (true)
    {
      return;
      com.tencent.mm.modelvideo.o.alm();
      e.k(paramString, paramInt1, paramInt2);
      AppMethodBeat.o(1834);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.r.b
 * JD-Core Version:    0.6.2
 */