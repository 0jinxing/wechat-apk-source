package com.tencent.mm.modelvideo;

import android.os.HandlerThread;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public final class y$a
  implements f, t.a
{
  private static int cqX = 0;
  Queue<String> cqQ;
  Queue<String> cqR;
  Map<String, g.a> cqS;
  boolean cqT;
  private boolean cqU;
  int cqV;
  private long cqW;
  g.a cqZ;
  private ap cra;
  private VideoTransPara fWR;
  private VideoTransPara fWS;
  HandlerThread fXH;
  ak fXI;
  boolean fXJ;
  private List<w> fXK;
  Queue<String> fXL;
  Queue<String> fXM;
  d fXN;
  g fXO;
  private HashMap<String, t.a> fXP;
  private boolean running;

  public y$a()
  {
    AppMethodBeat.i(50873);
    this.fXH = com.tencent.mm.sdk.g.d.ek("VideoService_runThread", 0);
    this.fXJ = false;
    this.cra = null;
    this.fWR = null;
    this.fWS = null;
    this.fXK = new ArrayList();
    this.cqQ = new LinkedList();
    this.cqR = new LinkedList();
    this.fXL = new LinkedList();
    this.fXM = new LinkedList();
    this.cqS = new HashMap();
    this.cqT = false;
    this.cqU = false;
    this.running = false;
    this.cqV = 0;
    this.cqW = 0L;
    this.fXN = null;
    this.fXO = null;
    this.cqZ = new g.a();
    this.fXP = new HashMap();
    com.tencent.mm.kernel.g.Rg().a(149, this);
    com.tencent.mm.kernel.g.Rg().a(150, this);
    o.all().a(this, Looper.getMainLooper());
    this.fXH.start();
    this.fXJ = true;
    this.fXI = new ak(this.fXH.getLooper());
    this.cra = new ap(this.fXH.getLooper(), new y.a.1(this), false);
    ab.i("MicroMsg.VideoService", "create VideoService, start video send thread");
    AppMethodBeat.o(50873);
  }

  private void Fb()
  {
    AppMethodBeat.i(50877);
    this.cqS.clear();
    this.cqQ.clear();
    this.cqR.clear();
    this.fXL.clear();
    this.fXM.clear();
    this.cqU = false;
    this.cqT = false;
    this.running = false;
    ab.i("MicroMsg.VideoService", "Finish service use time(ms):" + this.cqZ.Mr());
    AppMethodBeat.o(50877);
  }

  public final void a(t.a.a parama)
  {
    AppMethodBeat.i(50883);
    Object localObject = (t.a)this.fXP.get(parama.fileName);
    if (localObject != null)
      ((t.a)localObject).a(parama);
    localObject = u.ut(parama.fileName);
    if ((localObject != null) && (((s)localObject).status == 199))
      this.fXP.remove(parama.fileName);
    AppMethodBeat.o(50883);
  }

  public final void a(w paramw)
  {
    AppMethodBeat.i(50874);
    ab.c("MicroMsg.VideoService", "addVideoMsgSendCallback %s", new Object[] { paramw });
    if ((paramw != null) && (this.fXK != null) && (!this.fXK.contains(paramw)))
      this.fXK.add(paramw);
    AppMethodBeat.o(50874);
  }

  public final void a(String paramString, t.a parama)
  {
    AppMethodBeat.i(50882);
    this.fXP.put(paramString, parama);
    com.tencent.mm.kernel.g.RS().aa(new y.a.4(this, paramString));
    AppMethodBeat.o(50882);
  }

  public final boolean alG()
  {
    AppMethodBeat.i(50879);
    boolean bool;
    if (this.fXN != null)
    {
      com.tencent.mm.kernel.g.Rg().c(this.fXN);
      bool = true;
      this.running = false;
    }
    while (true)
    {
      this.cqS.clear();
      this.cqQ.clear();
      this.cqR.clear();
      this.fXL.clear();
      this.fXM.clear();
      AppMethodBeat.o(50879);
      return bool;
      bool = false;
    }
  }

  public final void alH()
  {
    AppMethodBeat.i(50880);
    com.tencent.mm.kernel.g.Rg().c(this.fXN);
    Fb();
    AppMethodBeat.o(50880);
  }

  public final void b(w paramw)
  {
    AppMethodBeat.i(50875);
    if ((paramw != null) && (this.fXK != null))
      this.fXK.remove(paramw);
    AppMethodBeat.o(50875);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(50876);
    if ((this.fXH == null) || (!this.fXJ) || (this.fXI == null))
    {
      ab.e("MicroMsg.VideoService", "onSceneEnd error!, handler or thread is null!");
      AppMethodBeat.o(50876);
    }
    while (true)
    {
      return;
      this.fXI.post(new y.a.2(this, paramm, paramInt1, paramInt2));
      AppMethodBeat.o(50876);
    }
  }

  public final void run()
  {
    AppMethodBeat.i(50878);
    if ((this.fXH == null) || (!this.fXJ) || (this.fXI == null))
    {
      ab.e("MicroMsg.VideoService", "run error!, handler or thread is null!");
      AppMethodBeat.o(50878);
    }
    while (true)
    {
      return;
      this.fXI.post(new y.a.3(this));
      AppMethodBeat.o(50878);
    }
  }

  public final void uC(String paramString)
  {
    AppMethodBeat.i(50881);
    this.cqS.remove(paramString);
    AppMethodBeat.o(50881);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvideo.y.a
 * JD-Core Version:    0.6.2
 */