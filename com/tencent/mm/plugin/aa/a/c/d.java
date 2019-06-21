package com.tencent.mm.plugin.aa.a.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.aa.a.e;
import com.tencent.mm.plugin.aa.a.l;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vending.app.a;

public final class d extends a
{
  l gmG;
  e gmH;

  public d()
  {
    AppMethodBeat.i(40684);
    this.gmG = new l();
    this.gmH = new e();
    AppMethodBeat.o(40684);
  }

  public final void onCreate()
  {
    AppMethodBeat.i(40685);
    super.onCreate();
    ab.i("MicroMsg.LaunchAAInteractor", "LaunchAAInteractor, onCreate");
    Object localObject = this.gmG.aop();
    g.RQ();
    g.RO().eJo.a(1624, (f)localObject);
    g.RQ();
    g.RO().eJo.a(1655, (f)localObject);
    localObject = this.gmH.aok();
    ab.i("MicroMsg.AAOperationData", "init");
    g.RQ();
    g.RO().eJo.a(1698, (f)localObject);
    AppMethodBeat.o(40685);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(40686);
    super.onDestroy();
    ab.i("MicroMsg.LaunchAAInteractor", "LaunchAAInteractor, onDestroy");
    Object localObject = this.gmG.aop();
    g.RQ();
    g.RO().eJo.b(1624, (f)localObject);
    g.RQ();
    g.RO().eJo.b(1655, (f)localObject);
    localObject = this.gmH.aok();
    ab.i("MicroMsg.AAOperationData", "uninit");
    g.RQ();
    g.RO().eJo.b(1698, (f)localObject);
    AppMethodBeat.o(40686);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.a.c.d
 * JD-Core Version:    0.6.2
 */