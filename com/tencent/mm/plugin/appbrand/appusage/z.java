package com.tencent.mm.plugin.appbrand.appusage;

import a.a.e;
import a.aa;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.protocal.protobuf.cda;
import com.tencent.mm.protocal.protobuf.cdb;
import com.tencent.mm.protocal.protobuf.ckk;
import com.tencent.mm.protocal.protobuf.ckl;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/appusage/CgiUpdateWxaStarRecord;", "Lcom/tencent/mm/modelbase/Cgi;", "Lcom/tencent/mm/protocal/protobuf/UpdateWxaStarRecordResponse;", "opList", "", "Lcom/tencent/mm/protocal/protobuf/StarWxaSortOperation;", "opReason", "", "(Ljava/util/List;I)V", "Companion", "UpdateReason", "plugin-appbrand-integration_release"})
public final class z extends com.tencent.mm.ai.a<ckl>
{
  private static final int[] haw;
  public static final z.a hax;

  static
  {
    AppMethodBeat.i(134551);
    hax = new z.a((byte)0);
    haw = new int[] { 1, 2, 3, 4 };
    AppMethodBeat.o(134551);
  }

  public z(List<? extends cdb> paramList, int paramInt)
  {
    AppMethodBeat.i(134550);
    if (z.a.axN())
    {
      if ((!paramList.isEmpty()) && (e.contains(haw, paramInt)));
      for (int i = 1; (aa.AUz) && (i == 0); i = 0)
      {
        paramList = (Throwable)new AssertionError("Assertion failed");
        AppMethodBeat.o(134550);
        throw paramList;
      }
    }
    b.a locala = new b.a();
    locala.b((com.tencent.mm.bt.a)new ckl());
    locala.qq("/cgi-bin/mmbiz-bin/wxaapp/updatestarrecord");
    locala.kU(1839);
    ckk localckk = new ckk();
    localckk.xip.addAll((Collection)paramList);
    localckk.boZ = paramInt;
    locala.a((com.tencent.mm.bt.a)localckk);
    a(locala.acD());
    AppMethodBeat.o(134550);
  }

  public static final cdb a(cda paramcda)
  {
    AppMethodBeat.i(134552);
    paramcda = z.a.a(paramcda, null, null);
    AppMethodBeat.o(134552);
    return paramcda;
  }

  public static final cdb b(cda paramcda)
  {
    AppMethodBeat.i(134553);
    paramcda = z.a.b(paramcda);
    AppMethodBeat.o(134553);
    return paramcda;
  }

  @l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/appusage/CgiUpdateWxaStarRecord$UpdateReason;", "", "intValue", "", "(Ljava/lang/String;II)V", "getIntValue", "()I", "None", "Timeout", "ClosePullDown", "CloseCollectionList", "History", "plugin-appbrand-integration_release"})
  public static enum b
  {
    final int intValue;

    static
    {
      AppMethodBeat.i(134547);
      b localb1 = new b("None", 0, 0);
      hay = localb1;
      b localb2 = new b("Timeout", 1, 1);
      haz = localb2;
      b localb3 = new b("ClosePullDown", 2, 2);
      haA = localb3;
      b localb4 = new b("CloseCollectionList", 3, 3);
      haB = localb4;
      b localb5 = new b("History", 4, 4);
      haC = localb5;
      haD = new b[] { localb1, localb2, localb3, localb4, localb5 };
      AppMethodBeat.o(134547);
    }

    private b(int paramInt)
    {
      this.intValue = paramInt;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.appusage.z
 * JD-Core Version:    0.6.2
 */