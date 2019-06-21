package com.tencent.mm.plugin.voip.model;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import java.lang.ref.WeakReference;

public final class p
{
  public static p sSH;
  private boolean sSA;
  private WeakReference<p.a> sSB;
  int sSC;
  boolean sSD;
  private int sSE;
  public int sSF;
  public int sSG;
  ap sSI;
  v2protocal sSz;

  private p()
  {
    AppMethodBeat.i(4571);
    this.sSA = false;
    this.sSC = -1;
    this.sSD = false;
    this.sSE = 0;
    this.sSI = new ap(Looper.getMainLooper(), new p.1(this), true);
    this.sSz = new v2protocal(new ak(Looper.getMainLooper()));
    AppMethodBeat.o(4571);
  }

  public static p cJR()
  {
    AppMethodBeat.i(4570);
    if (sSH == null)
      sSH = new p();
    p localp = sSH;
    AppMethodBeat.o(4570);
    return localp;
  }

  public final void a(p.a parama)
  {
    AppMethodBeat.i(4572);
    this.sSB = new WeakReference(parama);
    AppMethodBeat.o(4572);
  }

  public final void cJS()
  {
    AppMethodBeat.i(4573);
    ab.d("MicroMsg.VoipNetStatusChecker", "startNetStatusCheck");
    this.sSC = -1;
    this.sSD = true;
    this.sSG = 0;
    this.sSF = 0;
    al.n(new p.2(this), 3000L);
    AppMethodBeat.o(4573);
  }

  public final void cJT()
  {
    AppMethodBeat.i(4574);
    ab.d("MicroMsg.VoipNetStatusChecker", "stopNetStatusCheck");
    this.sSC = -1;
    this.sSA = false;
    this.sSD = false;
    this.sSG = 0;
    this.sSF = 0;
    al.d(new p.3(this));
    AppMethodBeat.o(4574);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.p
 * JD-Core Version:    0.6.2
 */