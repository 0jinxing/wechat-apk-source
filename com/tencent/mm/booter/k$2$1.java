package com.tencent.mm.booter;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.g.a.dr;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.afi;
import com.tencent.mm.protocal.protobuf.atz;
import com.tencent.mm.protocal.protobuf.aue;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

final class k$2$1
  implements f
{
  k$2$1(k.2 param2, com.tencent.mm.modelmulti.c paramc)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(15855);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      paramm = (afi)this.ecB.fAT.fsH.fsP;
      if (paramm.result == 0)
      {
        paramString = paramm.wmJ;
        paramm = paramm.wmL;
        String str = paramString.title + "," + paramString.desc + "," + paramString.wyc + "," + paramString.wyd + "," + paramm.eCq + "," + paramm.major + "," + paramm.minor;
        aw.ZK();
        String[] arrayOfString = bo.bc((String)com.tencent.mm.model.c.Ry().get(ac.a.xMo, null), "").split(",");
        paramString = Boolean.FALSE;
        paramInt2 = arrayOfString.length;
        for (paramInt1 = 0; paramInt1 < paramInt2; paramInt1++)
          if (arrayOfString[paramInt1].equals(paramm.eCq + paramm.major + paramm.minor))
            paramString = Boolean.TRUE;
        if (!paramString.booleanValue())
        {
          h.pYm.e(12653, new Object[] { Integer.valueOf(1), Integer.valueOf(1) });
          h.pYm.e(12653, new Object[] { Integer.valueOf(2), Integer.valueOf(1) });
          aw.ZK();
          com.tencent.mm.model.c.Ry().set(ac.a.xMn, str);
        }
      }
    }
    while (true)
    {
      aw.ZK();
      com.tencent.mm.model.c.QV();
      paramString = new dr();
      a.xxA.m(paramString);
      k.b(Boolean.FALSE);
      aw.Rg().b(1708, this);
      AppMethodBeat.o(15855);
      return;
      aw.ZK();
      com.tencent.mm.model.c.Ry().set(ac.a.xMn, "");
      continue;
      aw.ZK();
      com.tencent.mm.model.c.Ry().set(ac.a.xMn, "");
      continue;
      aw.ZK();
      com.tencent.mm.model.c.Ry().set(ac.a.xMn, "");
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.booter.k.2.1
 * JD-Core Version:    0.6.2
 */