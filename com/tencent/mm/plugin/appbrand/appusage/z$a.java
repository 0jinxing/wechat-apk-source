package com.tencent.mm.plugin.appbrand.appusage;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.cda;
import com.tencent.mm.protocal.protobuf.cdb;
import com.tencent.mm.sdk.platformtools.f;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/appusage/CgiUpdateWxaStarRecord$Companion;", "", "()V", "UpdateWxaRecordReason_CloseStarList", "", "UpdateWxaRecordReason_CloseTask", "UpdateWxaRecordReason_FromHistory", "UpdateWxaRecordReason_Timeout", "legalReasons", "", "add", "Lcom/tencent/mm/protocal/protobuf/StarWxaSortOperation;", "self", "Lcom/tencent/mm/protocal/protobuf/StarWxaInfo;", "prev", "next", "checkParams", "", "delete", "move", "op", "plugin-appbrand-integration_release"})
public final class z$a
{
  private static cdb a(int paramInt, cda paramcda1, cda paramcda2, cda paramcda3)
  {
    AppMethodBeat.i(134546);
    cdb localcdb = new cdb();
    localcdb.xcI = paramcda1;
    localcdb.xcL = paramInt;
    localcdb.xcJ = paramcda2;
    localcdb.xcK = paramcda3;
    AppMethodBeat.o(134546);
    return localcdb;
  }

  public static cdb a(cda paramcda1, cda paramcda2, cda paramcda3)
  {
    AppMethodBeat.i(134544);
    j.p(paramcda1, "self");
    paramcda1 = a(1, paramcda1, paramcda2, paramcda3);
    AppMethodBeat.o(134544);
    return paramcda1;
  }

  static boolean axN()
  {
    if (f.IS_FLAVOR_RED);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static cdb b(cda paramcda)
  {
    AppMethodBeat.i(134545);
    j.p(paramcda, "self");
    paramcda = a(2, paramcda, null, null);
    AppMethodBeat.o(134545);
    return paramcda;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.z.a
 * JD-Core Version:    0.6.2
 */