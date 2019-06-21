package com.tencent.mm.plugin.fav.b.e;

import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.network.n;
import com.tencent.mm.plugin.fav.a.r;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.at;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public final class b
  implements f, r
{
  private static Map<Long, g.a> cqS;
  private Queue<com.tencent.mm.plugin.fav.a.g> cqQ;
  private boolean cqU;
  private long cqW;
  public ap cra;
  public n fyJ;
  private boolean mgU;
  private boolean running;

  static
  {
    AppMethodBeat.i(5361);
    cqS = new HashMap();
    AppMethodBeat.o(5361);
  }

  public b()
  {
    AppMethodBeat.i(5356);
    this.running = false;
    this.cqW = 0L;
    this.cqU = false;
    this.cqQ = new LinkedList();
    this.fyJ = new b.2(this);
    this.cra = new ap(com.tencent.mm.kernel.g.RS().oAl.getLooper(), new b.4(this), false);
    this.mgU = at.isWifi(ah.getContext());
    com.tencent.mm.kernel.g.RO().a(this.fyJ);
    com.tencent.mm.kernel.g.Rg().a(404, this);
    AppMethodBeat.o(5356);
  }

  public final void Fb()
  {
    AppMethodBeat.i(5359);
    this.cqQ.clear();
    cqS.clear();
    this.running = false;
    this.cqU = false;
    AppMethodBeat.o(5359);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(5357);
    com.tencent.mm.kernel.g.RS().aa(new b.1(this, paramm, paramInt1));
    AppMethodBeat.o(5357);
  }

  public final void run()
  {
    AppMethodBeat.i(5358);
    com.tencent.mm.kernel.g.RS().aa(new b.3(this));
    AppMethodBeat.o(5358);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.b.e.b
 * JD-Core Version:    0.6.2
 */