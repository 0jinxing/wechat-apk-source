package com.tencent.mm.insane_statistic;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.at.e;
import com.tencent.mm.at.g;
import com.tencent.mm.at.r.a;
import com.tencent.mm.g.a.np;
import com.tencent.mm.g.a.nr;
import com.tencent.mm.g.a.nr.a;
import com.tencent.mm.g.c.cy;
import com.tencent.mm.model.n;
import com.tencent.mm.model.t;
import com.tencent.mm.platformtools.ah;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.clk;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bi;
import java.net.URLEncoder;
import java.util.Map;

public final class b
  implements r.a
{
  public final void a(long paramLong, bi parambi, com.tencent.mm.ai.b paramb, int paramInt, boolean paramBoolean, com.tencent.mm.i.d paramd)
  {
    AppMethodBeat.i(16182);
    parambi = new b.a(paramLong, parambi, paramb, paramBoolean, paramInt);
    paramb = com.tencent.mm.model.c.c.abi().ll("100131");
    if (paramb.isValid())
      parambi.eFs = ah.getInt((String)paramb.dru().get("needUploadData"), 1);
    if ((parambi.eFq) || ((!parambi.eFu) && (parambi.eFs == 0)))
    {
      AppMethodBeat.o(16182);
      return;
    }
    parambi.eFt = paramd;
    parambi.eFq = true;
    paramb = ((clk)parambi.ehh.fsG.fsP).vEC.wVI;
    if ((!bo.isNullOrNil(paramb)) && (t.kH(paramb)))
    {
      paramInt = 1;
      label142: paramb = new StringBuilder("2,");
      if (paramInt == 0)
        break label301;
    }
    label301: for (paramInt = 2; ; paramInt = 1)
    {
      parambi.eFp = (paramInt + ",,");
      if (parambi.eFo == null)
        parambi.eFo = com.tencent.mm.at.o.ahl().b(Long.valueOf(parambi.eFm));
      paramb = parambi.eFo;
      if (paramb != null)
      {
        paramd = new np();
        a.xxA.c(parambi.eFv);
        a.xxA.c(parambi.eFw);
        parambi.eFr = com.tencent.mm.at.o.ahl().q(paramb.fDz, "", "");
        paramd.cJU.filePath = parambi.eFr;
        a.xxA.m(paramd);
      }
      AppMethodBeat.o(16182);
      break;
      paramInt = 0;
      break label142;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.insane_statistic.b
 * JD-Core Version:    0.6.2
 */