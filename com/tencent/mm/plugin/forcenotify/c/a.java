package com.tencent.mm.plugin.forcenotify.c;

import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.protocal.protobuf.aiz;
import com.tencent.mm.protocal.protobuf.aja;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/forcenotify/model/CgiGetForceNotifyInfoList;", "Lcom/tencent/mm/modelbase/Cgi;", "Lcom/tencent/mm/protocal/protobuf/GetForcePushResponse;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "onCgiBack", "", "errType", "", "errCode", "errMsg", "resp", "scene", "Lcom/tencent/mm/modelbase/NetSceneBase;", "plugin-force-notify_release"})
public final class a extends com.tencent.mm.ai.a<aja>
{
  private final String TAG;

  public a()
  {
    AppMethodBeat.i(51052);
    this.TAG = "MicroMsg.CgiGetForceNotifyInfoList";
    b.a locala = new b.a();
    locala.a((com.tencent.mm.bt.a)new aiz());
    locala.b((com.tencent.mm.bt.a)new aja());
    locala.qq("/cgi-bin/micromsg-bin/getforcepush");
    locala.kU(691);
    locala.kV(0);
    locala.kW(0);
    a(locala.acD());
    AppMethodBeat.o(51052);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.forcenotify.c.a
 * JD-Core Version:    0.6.2
 */