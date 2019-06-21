package com.tencent.mm.plugin.fav.b.e;

import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.plugin.fav.a.ac;
import com.tencent.mm.plugin.fav.a.aj;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public final class e
  implements f, ac
{
  private static Map<Long, g.a> cqS;
  private static Map<Long, Integer> mhg;
  private static Set<Long> mhi;
  private Queue<com.tencent.mm.plugin.fav.a.g> cqQ;
  private boolean cqU;
  public int cqV;
  private long cqW;
  public ap cra;
  private boolean running;

  static
  {
    AppMethodBeat.i(5401);
    cqS = new HashMap();
    mhg = new HashMap();
    mhi = new HashSet();
    AppMethodBeat.o(5401);
  }

  public e()
  {
    AppMethodBeat.i(5394);
    this.running = false;
    this.cqV = 0;
    this.cqW = 0L;
    this.cqU = false;
    this.cqQ = new LinkedList();
    this.cra = new ap(com.tencent.mm.kernel.g.RS().oAl.getLooper(), new e.3(this), false);
    com.tencent.mm.kernel.g.Rg().a(401, this);
    AppMethodBeat.o(5394);
  }

  public static void startSync()
  {
    AppMethodBeat.i(5398);
    aj localaj = new aj();
    com.tencent.mm.kernel.g.Rg().a(localaj, 0);
    AppMethodBeat.o(5398);
  }

  public final void Fb()
  {
    AppMethodBeat.i(5397);
    ab.i("MicroMsg.Fav.FavSendService", "on finish");
    this.cqQ.clear();
    cqS.clear();
    this.running = false;
    this.cqU = false;
    mhg.clear();
    AppMethodBeat.o(5397);
  }

  public final boolean ame()
  {
    return this.cqU;
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(5395);
    ab.i("MicroMsg.Fav.FavSendService", "on scene end, errType %d, errCode %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    com.tencent.mm.kernel.g.RS().aa(new e.1(this, paramm, paramInt1, paramInt2));
    AppMethodBeat.o(5395);
  }

  public final void run()
  {
    AppMethodBeat.i(5396);
    com.tencent.mm.kernel.g.RS().aa(new e.2(this));
    AppMethodBeat.o(5396);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.b.e.e
 * JD-Core Version:    0.6.2
 */