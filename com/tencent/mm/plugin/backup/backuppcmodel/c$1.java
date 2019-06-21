package com.tencent.mm.plugin.backup.backuppcmodel;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.ahq;
import com.tencent.mm.protocal.protobuf.ua;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.util.LinkedList;

final class c$1
  implements f
{
  c$1(c paramc)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(17499);
    aw.Rg().b(595, c.a(this.jwk));
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      ab.i("MicroMsg.BackupPcProcessMgr", "onGetConnectInfoEnd Error: other error[%d,%d,%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
      h.pYm.a(400L, 111L, 1L, false);
      if ((paramInt1 == 4) && (paramInt2 == -2011))
        ab.e("MicroMsg.BackupPcProcessMgr", "onGetConnectInfoEnd Error: INVALID URL");
      b.aTD().aSu().jqW = -5;
      b.aTD().aTF().ru(-5);
      AppMethodBeat.o(17499);
    }
    while (true)
    {
      return;
      paramm = ((com.tencent.mm.plugin.backup.g.e)paramm).aUk();
      aw.ZK();
      if (!bo.nullAsNil((String)com.tencent.mm.model.c.Ry().get(2, null)).equals(paramm.vIQ))
      {
        ab.e("MicroMsg.BackupPcProcessMgr", "onGetConnectInfoEnd Error: not the same account");
        b.aTD().aSu().jqW = -5;
        b.aTD().aTF().ru(-5);
        h.pYm.a(400L, 112L, 1L, false);
        AppMethodBeat.o(17499);
      }
      else
      {
        if ((paramm.vIO == null) || (paramm.vIO.size() <= 0) || (paramm.vIO.getFirst() == null))
        {
          paramInt1 = paramm.vIN;
          if (paramm.vIO == null);
          for (paramString = "null"; ; paramString = paramm.vIO.size())
          {
            ab.e("MicroMsg.BackupPcProcessMgr", "onGetConnectInfoEnd AddrList is empty! AddrCount[%d], AddrList size[%s]", new Object[] { Integer.valueOf(paramInt1), paramString });
            b.aTD().aSu().jqW = -5;
            b.aTD().aTF().ru(-5);
            h.pYm.a(400L, 113L, 1L, false);
            AppMethodBeat.o(17499);
            break;
          }
        }
        Object localObject = (ua)paramm.vIO.getFirst();
        paramString = ((ua)localObject).vYA;
        paramInt1 = ((Integer)((ua)localObject).wbp.getFirst()).intValue();
        localObject = this.jwk;
        ((c)localObject).jwb = paramm.vIR;
        ((c)localObject).jwc = paramString;
        ((c)localObject).jwd = paramInt1;
        ab.i("MicroMsg.BackupPcProcessMgr", "onGetConnectInfoEnd type:%d, scene:%d, wifiName:%s, ip:%s, port:%d", new Object[] { Integer.valueOf(paramm.jCt), Integer.valueOf(paramm.Scene), paramm.vIR, paramString, Integer.valueOf(paramInt1) });
        b.aTD().jqO = paramm.ID;
        b.aTD().jqP = paramm.vIW;
        b.aTD().jqQ = paramm.vIX;
        b.aTD().jqU = paramm.vIn.getBufferToBytes();
        c.b(this.jwk);
        AppMethodBeat.o(17499);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.backuppcmodel.c.1
 * JD-Core Version:    0.6.2
 */