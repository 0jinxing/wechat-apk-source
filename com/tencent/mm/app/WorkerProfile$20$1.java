package com.tencent.mm.app;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.a.nx;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.protocal.protobuf.any;
import com.tencent.mm.protocal.protobuf.anz;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;

final class WorkerProfile$20$1
  implements f
{
  WorkerProfile$20$1(WorkerProfile.20 param20)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(15504);
    aw.Rg().b(1145, this);
    ab.i("MicroMsg.WorkerProfile", "onSceneEnd(GetServiceNotifyOptions), errType : %d, errCode : %d, errMsg : %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramInt1 != 0) || (paramInt2 != 0))
      AppMethodBeat.o(15504);
    while (true)
    {
      return;
      if (paramm.getType() != 1145)
      {
        AppMethodBeat.o(15504);
      }
      else
      {
        paramString = (com.tencent.mm.modelappbrand.p)paramm;
        if ((((any)paramString.fpJ.fsG.fsP).wsv & 0x1) == 0)
        {
          AppMethodBeat.o(15504);
        }
        else
        {
          boolean bool = paramString.abG().vKO;
          aw.ZK();
          if (bool != c.Ry().getBoolean(ac.a.xON, true))
          {
            ab.i("MicroMsg.WorkerProfile", "service notify message notice switch changed(to : %b)", new Object[] { Boolean.valueOf(bool) });
            aw.ZK();
            c.Ry().set(ac.a.xON, Boolean.valueOf(bool));
            a.xxA.m(new nx());
          }
          bool = paramString.abG().wsw;
          aw.ZK();
          if (bool != c.Ry().getBoolean(ac.a.xOO, true))
          {
            ab.i("MicroMsg.WorkerProfile", "wxa custom session notify message notice switch changed(to : %b)", new Object[] { Boolean.valueOf(bool) });
            aw.ZK();
            c.Ry().set(ac.a.xOO, Boolean.valueOf(bool));
            a.xxA.m(new nx());
          }
          AppMethodBeat.o(15504);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.WorkerProfile.20.1
 * JD-Core Version:    0.6.2
 */