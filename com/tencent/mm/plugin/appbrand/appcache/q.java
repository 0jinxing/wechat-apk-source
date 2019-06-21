package com.tencent.mm.plugin.appbrand.appcache;

import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.d.c;
import com.tencent.mm.sdk.d.d;
import com.tencent.mm.sdk.platformtools.ab;

public final class q extends d
  implements Runnable
{
  private final int gSF;
  private final String gSG;
  private final c gSH;
  private final c gSI;
  final c gSJ;

  public q(int paramInt, String paramString)
  {
    super("LibIncrementalTestCase", Looper.getMainLooper());
    AppMethodBeat.i(129358);
    this.gSH = new q.1(this);
    this.gSI = new q.2(this);
    this.gSJ = new q.3(this);
    this.gSF = paramInt;
    this.gSG = paramString;
    AppMethodBeat.o(129358);
  }

  public final void avC()
  {
    AppMethodBeat.i(129360);
    super.avC();
    ab.i("MicroMsg.LibIncrementalTestCase[incremental]", "TestCase onQuitting");
    AppMethodBeat.o(129360);
  }

  public final void run()
  {
    AppMethodBeat.i(129359);
    a(this.gSH);
    a(this.gSI);
    a(this.gSJ);
    b(this.gSH);
    start();
    AppMethodBeat.o(129359);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appcache.q
 * JD-Core Version:    0.6.2
 */