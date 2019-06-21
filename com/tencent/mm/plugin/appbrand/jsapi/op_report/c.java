package com.tencent.mm.plugin.appbrand.jsapi.op_report;

import a.f.b.j;
import a.l;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.m;
import com.tencent.mm.protocal.protobuf.azt;
import com.tencent.mm.protocal.protobuf.bso;
import com.tencent.mm.protocal.protobuf.bsp;

@l(dWo={1, 1, 13}, dWp={""}, dWq={"Lcom/tencent/mm/plugin/appbrand/jsapi/op_report/OpReportUtil;", "", "()V", "getReportIdOrThrows", "", "scene", "Lcom/tencent/mm/modelbase/NetSceneBase;", "matchNetScene", "", "requestAppID", "", "plugin-appbrand-integration_release"})
public final class c
{
  public static final c hSW;

  static
  {
    AppMethodBeat.i(134686);
    hSW = new c();
    AppMethodBeat.o(134686);
  }

  public static final boolean b(m paramm, String paramString)
  {
    Object localObject1 = null;
    AppMethodBeat.i(134684);
    j.p(paramString, "requestAppID");
    Object localObject2;
    if (paramm != null)
    {
      paramm = paramm.acN();
      localObject2 = paramm;
      if (!(paramm instanceof b))
        localObject2 = null;
      paramm = (b)localObject2;
      if (paramm == null)
        break label105;
    }
    label105: for (paramm = paramm.acz(); ; paramm = null)
    {
      localObject2 = paramm;
      if (!(paramm instanceof bso))
        localObject2 = null;
      localObject2 = (bso)localObject2;
      paramm = localObject1;
      if (localObject2 != null)
      {
        localObject2 = ((bso)localObject2).wUJ;
        paramm = localObject1;
        if (localObject2 != null)
          paramm = ((azt)localObject2).csB;
      }
      boolean bool = j.j(paramm, paramString);
      AppMethodBeat.o(134684);
      return bool;
      paramm = null;
      break;
    }
  }

  public static final int h(m paramm)
  {
    AppMethodBeat.i(134685);
    m localm;
    if (paramm != null)
    {
      paramm = paramm.acN();
      localm = paramm;
      if (!(paramm instanceof b))
        localm = null;
      paramm = (b)localm;
      if (paramm == null)
        break label76;
    }
    label76: for (paramm = paramm.acA(); ; paramm = null)
    {
      localm = paramm;
      if (!(paramm instanceof bsp))
        localm = null;
      paramm = (bsp)localm;
      if (paramm == null)
        break label81;
      int i = paramm.wUK;
      AppMethodBeat.o(134685);
      return i;
      paramm = null;
      break;
    }
    label81: paramm = (Throwable)new IllegalArgumentException();
    AppMethodBeat.o(134685);
    throw paramm;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.op_report.c
 * JD-Core Version:    0.6.2
 */