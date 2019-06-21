package com.tencent.mm.plugin.record;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.b.f;
import com.tencent.mm.kernel.e.c;
import com.tencent.mm.plugin.record.b.h;
import com.tencent.mm.plugin.record.b.i;
import com.tencent.mm.plugin.record.b.j;
import com.tencent.mm.plugin.record.b.m;
import com.tencent.mm.plugin.record.b.q;
import com.tencent.mm.plugin.record.b.r;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.File;

public class PluginRecord extends f
  implements com.tencent.mm.kernel.a.b.b, com.tencent.mm.kernel.api.bucket.c, com.tencent.mm.plugin.record.a.a
{
  private com.tencent.mm.plugin.record.a.g pIZ;
  private com.tencent.mm.plugin.record.a.e pJa;
  private q pJb;
  private i pJc;
  private r pJd;
  private com.tencent.mm.sdk.b.c pJe;

  public PluginRecord()
  {
    AppMethodBeat.i(135610);
    this.pJb = null;
    this.pJc = null;
    this.pJd = new r();
    this.pJe = new PluginRecord.1(this);
    AppMethodBeat.o(135610);
  }

  private static void checkDir()
  {
    AppMethodBeat.i(135611);
    Object localObject = new StringBuilder();
    com.tencent.mm.kernel.g.RQ();
    localObject = new File(com.tencent.mm.kernel.g.RP().eJM + "record/");
    if ((!((File)localObject).exists()) || (!((File)localObject).isDirectory()))
    {
      ab.d("MicroMsg.PluginRecord", "record stg dir[%s] not exsit, create it");
      ((File)localObject).mkdirs();
    }
    AppMethodBeat.o(135611);
  }

  public void execute(com.tencent.mm.kernel.b.g paramg)
  {
  }

  public i getRecordMsgCDNService()
  {
    AppMethodBeat.i(135616);
    com.tencent.mm.kernel.g.RN().QU();
    if (this.pJc == null)
      this.pJc = new i();
    i locali = this.pJc;
    AppMethodBeat.o(135616);
    return locali;
  }

  public com.tencent.mm.plugin.record.a.e getRecordMsgCDNStorage()
  {
    return this.pJa;
  }

  public com.tencent.mm.plugin.record.a.g getRecordMsgInfoStorage()
  {
    return this.pIZ;
  }

  public q getRecordMsgService()
  {
    AppMethodBeat.i(135615);
    com.tencent.mm.kernel.g.RN().QU();
    if (this.pJb == null)
      this.pJb = new q();
    q localq = this.pJb;
    AppMethodBeat.o(135615);
    return localq;
  }

  public com.tencent.mm.plugin.record.a.g getRecordMsgStorage()
  {
    AppMethodBeat.i(135614);
    com.tencent.mm.plugin.record.a.g localg = getRecordMsgInfoStorage();
    AppMethodBeat.o(135614);
    return localg;
  }

  public void onAccountInitialized(e.c paramc)
  {
    AppMethodBeat.i(135612);
    this.pIZ = new m(com.tencent.mm.kernel.g.RP().eJN);
    this.pJa = new j(com.tencent.mm.kernel.g.RP().eJN);
    ab.i("MicroMsg.PluginRecord", "on account post reset");
    com.tencent.mm.sdk.b.a.xxA.c(this.pJd);
    com.tencent.mm.sdk.b.a.xxA.c(this.pJe);
    checkDir();
    getRecordMsgService().a(null);
    ab.i("MicroMsg.PluginRecord", "onAccountInitialized start recordMsgSendService");
    AppMethodBeat.o(135612);
  }

  public void onAccountRelease()
  {
    AppMethodBeat.i(135613);
    ab.d("MicroMsg.PluginRecord", "on account post release");
    com.tencent.mm.sdk.b.a.xxA.d(this.pJd);
    com.tencent.mm.sdk.b.a.xxA.d(this.pJe);
    if (this.pJb != null)
    {
      q localq = this.pJb;
      localq.finish();
      com.tencent.mm.kernel.g.RO().eJo.b(632, localq);
      ((com.tencent.mm.plugin.record.a.a)com.tencent.mm.kernel.g.M(com.tencent.mm.plugin.record.a.a.class)).getRecordMsgCDNStorage().b(localq);
    }
    if (this.pJc != null)
      this.pJc.finish();
    AppMethodBeat.o(135613);
  }

  public void parallelsDependency()
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.PluginRecord
 * JD-Core Version:    0.6.2
 */