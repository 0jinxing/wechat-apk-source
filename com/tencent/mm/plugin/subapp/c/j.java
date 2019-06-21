package com.tencent.mm.plugin.subapp.c;

import android.os.HandlerThread;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.compatible.util.g.a;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

public final class j
  implements f
{
  private static int cqX = 0;
  Queue<String> cqQ;
  Queue<String> cqR;
  Map<String, g.a> cqS;
  private boolean cqT;
  private boolean cqU;
  int cqV;
  private long cqW;
  g.a cqZ;
  private ap cra;
  private boolean running;

  public j()
  {
    AppMethodBeat.i(25310);
    this.cqQ = new LinkedList();
    this.cqR = new LinkedList();
    this.cqS = new HashMap();
    this.cqT = false;
    this.cqU = false;
    this.running = false;
    this.cqV = 0;
    this.cqW = 0L;
    this.cqZ = new g.a();
    this.cra = new ap(aw.RS().oAl.getLooper(), new j.3(this), false);
    aw.Rg().a(329, this);
    AppMethodBeat.o(25310);
  }

  private void Fb()
  {
    AppMethodBeat.i(25312);
    this.cqS.clear();
    this.cqQ.clear();
    this.cqR.clear();
    this.cqU = false;
    this.cqT = false;
    this.running = false;
    ab.d("MicroMsg.VoiceRemindService", "Finish service use time(ms):" + this.cqZ.Mr());
    AppMethodBeat.o(25312);
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(25311);
    aw.RS().aa(new j.1(this, paramm, paramInt1, paramInt2));
    AppMethodBeat.o(25311);
  }

  public final void run()
  {
    AppMethodBeat.i(25313);
    aw.RS().aa(new j.2(this));
    AppMethodBeat.o(25313);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.c.j
 * JD-Core Version:    0.6.2
 */