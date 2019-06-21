package com.tencent.mm.audio.b;

import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public final class i
  implements f
{
  private static int cqX = 0;
  public static boolean cqY = true;
  Queue<String> cqQ;
  Queue<com.tencent.mm.modelvoice.p> cqR;
  Map<String, g.a> cqS;
  private boolean cqT;
  private boolean cqU;
  public int cqV;
  private long cqW;
  g.a cqZ;
  private ap cra;
  private boolean running;

  public i()
  {
    AppMethodBeat.i(116523);
    this.cqQ = new LinkedList();
    this.cqR = new LinkedList();
    this.cqS = new HashMap();
    this.cqT = false;
    this.cqU = false;
    this.running = false;
    this.cqV = 0;
    this.cqW = 0L;
    this.cqZ = new g.a();
    this.cra = new ap(g.RS().oAl.getLooper(), new i.3(this), false);
    g.Rg().a(127, this);
    g.Rg().a(128, this);
    AppMethodBeat.o(116523);
  }

  private void Fb()
  {
    AppMethodBeat.i(116525);
    this.cqS.clear();
    this.cqQ.clear();
    this.cqR.clear();
    this.cqU = false;
    this.cqT = false;
    this.running = false;
    ab.i("MicroMsg.SceneVoiceService", "Finish service use time(ms):" + this.cqZ.Mr());
    AppMethodBeat.o(116525);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(116524);
    g.RS().aa(new i.1(this, paramm, paramInt1, paramInt2));
    AppMethodBeat.o(116524);
  }

  public final void run()
  {
    AppMethodBeat.i(116526);
    g.RS().aa(new i.2(this));
    AppMethodBeat.o(116526);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.audio.b.i
 * JD-Core Version:    0.6.2
 */