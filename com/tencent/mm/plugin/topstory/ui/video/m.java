package com.tencent.mm.plugin.topstory.ui.video;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.al.f;
import com.tencent.mm.plugin.topstory.a.g;
import com.tencent.mm.protocal.protobuf.chv;
import com.tencent.mm.protocal.protobuf.chx;
import com.tencent.mm.sdk.g.d;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class m
{
  b sDo;
  String sES;
  Map<String, chx> sET;
  Set<String> sEU;
  private int sEV;

  public m()
  {
    AppMethodBeat.i(1751);
    this.sEV = 0;
    this.sET = Collections.synchronizedMap(new HashMap());
    this.sEU = Collections.synchronizedSet(new HashSet());
    AppMethodBeat.o(1751);
  }

  static long aa(long paramLong1, long paramLong2)
  {
    long l = 0L;
    if (paramLong2 != 0L)
      l = 100L * paramLong1 / paramLong2;
    return l;
  }

  public final void aEX()
  {
    AppMethodBeat.i(1753);
    this.sEV -= 1;
    ab.i("MicroMsg.TopStory.TopStoryPreloadMgr", "onUIDestroy %d", new Object[] { Integer.valueOf(this.sEV) });
    if (this.sEV <= 0)
    {
      cGP();
      this.sEU.clear();
      d.post(new m.b(this, this.sES), "TopStory.DeleteVideoFolderTask");
      this.sDo = null;
    }
    AppMethodBeat.o(1753);
  }

  public final void cGP()
  {
    AppMethodBeat.i(1754);
    Iterator localIterator = this.sEU.iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      f.afx().rO(str);
    }
    AppMethodBeat.o(1754);
  }

  public final void d(b paramb)
  {
    AppMethodBeat.i(1752);
    this.sEV += 1;
    ab.i("MicroMsg.TopStory.TopStoryPreloadMgr", "onUICreate %d", new Object[] { Integer.valueOf(this.sEV) });
    this.sDo = paramb;
    this.sES = g.abz(paramb.cFT().xgj);
    AppMethodBeat.o(1752);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.m
 * JD-Core Version:    0.6.2
 */