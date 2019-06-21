package com.tencent.mm.plugin.aa.a.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.plugin.aa.a.c;
import com.tencent.mm.plugin.aa.a.i;
import com.tencent.mm.plugin.aa.a.j;
import com.tencent.mm.sdk.platformtools.ab;

public class f extends com.tencent.mm.vending.app.a
{
  c gmN;
  com.tencent.mm.plugin.aa.a.g gmO;
  j gmP;

  public f()
  {
    AppMethodBeat.i(40694);
    this.gmN = new c();
    this.gmO = new com.tencent.mm.plugin.aa.a.g();
    this.gmP = new j();
    AppMethodBeat.o(40694);
  }

  public final String mJ(String paramString)
  {
    AppMethodBeat.i(40697);
    String str = this.zXe.getStringExtra("chatroom");
    paramString = ((com.tencent.mm.plugin.messenger.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.messenger.a.b.class)).getDisplayName(paramString, str);
    AppMethodBeat.o(40697);
    return paramString;
  }

  public final void onCreate()
  {
    AppMethodBeat.i(40695);
    super.onCreate();
    Object localObject = this.gmN.aof();
    ab.i("MicroMsg.AAGetPaylistDetailLogic", "init");
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(1695, (com.tencent.mm.ai.f)localObject);
    localObject = this.gmO.aol();
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.a(1629, (com.tencent.mm.ai.f)localObject);
    this.gmP.aoo().init();
    AppMethodBeat.o(40695);
  }

  public final void onDestroy()
  {
    AppMethodBeat.i(40696);
    super.onDestroy();
    Object localObject = this.gmN.aof();
    ab.i("MicroMsg.AAGetPaylistDetailLogic", "unInit");
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.b(1695, (com.tencent.mm.ai.f)localObject);
    localObject = this.gmO.aol();
    com.tencent.mm.kernel.g.RQ();
    com.tencent.mm.kernel.g.RO().eJo.b(1629, (com.tencent.mm.ai.f)localObject);
    this.gmP.aoo().aon();
    AppMethodBeat.o(40696);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.aa.a.c.f
 * JD-Core Version:    0.6.2
 */