package com.tencent.mm.plugin.topstory.ui.video;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.topstory.PluginTopStory;
import com.tencent.mm.plugin.topstory.a.b.a;
import com.tencent.mm.plugin.topstory.a.f;
import com.tencent.mm.plugin.topstory.c;
import com.tencent.mm.protocal.protobuf.chv;
import com.tencent.mm.protocal.protobuf.chw;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public final class o
{
  private chw sAX;
  private b sDo;
  private int sEV;
  Map<String, com.tencent.mm.plugin.topstory.a.b.b> sFn;
  public int sFo;
  public a sFp;

  public o()
  {
    AppMethodBeat.i(1792);
    this.sFo = 2;
    this.sFn = new HashMap();
    AppMethodBeat.o(1792);
  }

  public final void a(chw paramchw, int paramInt, String paramString)
  {
    AppMethodBeat.i(1797);
    this.sAX = paramchw;
    this.sFp = new a();
    this.sFp.sAE = System.currentTimeMillis();
    this.sFp.sAM = 2L;
    this.sFp.sAL = this.sFo;
    this.sFp.position = (paramInt + 1);
    chv localchv = this.sDo.cFT();
    this.sFp.fjS = (localchv.scene + "_" + localchv.hlm + "_" + localchv.xgG);
    if (this.sDo.isFullscreenMode())
      this.sFp.sAK = 1L;
    this.sFo = 2;
    ab.i("MicroMSsg.TopStory.TopStoryVideoReportMgr", "startVideoPlay %s %s %s reportInfo: %d %d", new Object[] { paramString, paramchw.xgS, paramchw.title, Long.valueOf(this.sFp.sAL), Long.valueOf(this.sFp.sAM) });
    AppMethodBeat.o(1797);
  }

  public final void aEX()
  {
    AppMethodBeat.i(1794);
    this.sEV -= 1;
    ab.i("MicroMSsg.TopStory.TopStoryVideoReportMgr", "onUIDestroy %d", new Object[] { Integer.valueOf(this.sEV) });
    if (this.sEV <= 0)
    {
      cGS();
      this.sDo = null;
    }
    AppMethodBeat.o(1794);
  }

  public final void b(chv paramchv)
  {
    AppMethodBeat.i(1798);
    ((PluginTopStory)g.M(PluginTopStory.class)).getReporter();
    c.a(paramchv, this.sAX, this.sFp);
    this.sAX = null;
    this.sFp = null;
    AppMethodBeat.o(1798);
  }

  public final void cGS()
  {
    AppMethodBeat.i(1796);
    HashSet localHashSet = new HashSet();
    Iterator localIterator = this.sFn.values().iterator();
    while (localIterator.hasNext())
    {
      com.tencent.mm.plugin.topstory.a.b.b localb = (com.tencent.mm.plugin.topstory.a.b.b)localIterator.next();
      if (!localb.pZZ)
      {
        localHashSet.add(localb);
        localb.pZZ = true;
      }
    }
    if (this.sDo != null)
      ((com.tencent.mm.plugin.topstory.a.b)g.M(com.tencent.mm.plugin.topstory.a.b.class)).getReporter().a(this.sDo.cFT(), localHashSet);
    AppMethodBeat.o(1796);
  }

  public final void d(b paramb)
  {
    this.sEV += 1;
    this.sDo = paramb;
  }

  public final void e(chw paramchw)
  {
    AppMethodBeat.i(1793);
    if (paramchw == null)
      ab.i("MicroMSsg.TopStory.TopStoryVideoReportMgr", "setVideoInfoExpose null");
    com.tencent.mm.plugin.topstory.a.b.b localb = new com.tencent.mm.plugin.topstory.a.b.b(paramchw);
    if (!this.sFn.containsKey(localb.sAX.xgS))
    {
      this.sFn.put(localb.sAX.xgS, localb);
      ab.i("MicroMSsg.TopStory.TopStoryVideoReportMgr", "setVideoInfoExpose %s", new Object[] { paramchw });
      AppMethodBeat.o(1793);
    }
    while (true)
    {
      return;
      ((com.tencent.mm.plugin.topstory.a.b.b)this.sFn.get(localb.sAX.xgS)).sAX = paramchw;
      AppMethodBeat.o(1793);
    }
  }

  public final void f(chw paramchw)
  {
    AppMethodBeat.i(1795);
    e(paramchw);
    ((com.tencent.mm.plugin.topstory.a.b.b)this.sFn.get(paramchw.xgS)).sAY = true;
    AppMethodBeat.o(1795);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.o
 * JD-Core Version:    0.6.2
 */