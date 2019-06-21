package com.tencent.mm.plugin.backup.d;

import android.content.Context;
import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.backup.b.d;
import com.tencent.mm.plugin.backup.b.g;
import com.tencent.mm.plugin.backup.g.e;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.ahq;
import com.tencent.mm.protocal.protobuf.ua;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
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
    AppMethodBeat.i(17246);
    aw.Rg().b(595, c.a(this.jtN));
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      ab.i("MicroMsg.BackupMoveRecoverServer", "summerbak getConnect info other error [%d,%d,%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
      if ((paramInt1 == 4) && (paramInt2 == -2011))
        ab.e("MicroMsg.BackupMoveRecoverServer", "summerbak getConnect info: INVALID URL");
      b.aSZ().aSu().jqW = -5;
      this.jtN.rj(-5);
      AppMethodBeat.o(17246);
    }
    while (true)
    {
      return;
      paramm = ((e)paramm).aUk();
      aw.ZK();
      if (bo.nullAsNil((String)com.tencent.mm.model.c.Ry().get(2, null)).equals(paramm.vIQ))
        break;
      ab.e("MicroMsg.BackupMoveRecoverServer", "summerbak getConnectinfo not the same account");
      b.aSZ().aSu().jqW = -5;
      this.jtN.rj(-5);
      AppMethodBeat.o(17246);
    }
    b.aSZ().jqO = paramm.ID;
    b.aSZ().jqP = paramm.vIW;
    b.aSZ().jqQ = paramm.vIX;
    com.tencent.mm.plugin.backup.g.b.a(this.jtN.jtL);
    b.aSZ().aSv();
    com.tencent.mm.plugin.backup.g.b.a(b.aSZ().aTc());
    com.tencent.mm.plugin.backup.g.b.a(b.aSZ().aTa());
    com.tencent.mm.plugin.backup.g.b.rk(2);
    com.tencent.mm.plugin.backup.g.b.a(c.b(this.jtN));
    paramInt1 = 0;
    Object localObject;
    if (paramm.vIN > 0)
    {
      localObject = (ua)paramm.vIO.getFirst();
      paramString = ((ua)localObject).vYA;
      paramInt1 = ((Integer)((ua)localObject).wbp.getFirst()).intValue();
    }
    while (true)
    {
      localObject = this.jtN;
      ((c)localObject).jtC = paramm.vIR;
      ((c)localObject).jtD = paramString;
      ((c)localObject).jtE = paramInt1;
      ab.i("MicroMsg.BackupMoveRecoverServer", "summerbak getconnetinfo, type:%d, scene:%d, wifiName:%s, ip:%s, port:%d", new Object[] { Integer.valueOf(paramm.jCt), Integer.valueOf(paramm.Scene), paramm.vIR, paramString, Integer.valueOf(paramInt1) });
      d.rk(22);
      b.aSZ().aSu().jqW = 1;
      localObject = new Intent().setClassName(ah.getContext(), "com.tencent.mm.ui.LauncherUI");
      ((Intent)localObject).addFlags(335544320);
      ((Intent)localObject).putExtra("nofification_type", "backup_move_notification");
      ah.getContext().startActivity((Intent)localObject);
      h.pYm.a(485L, 41L, 1L, false);
      c.access$202(false);
      ab.i("MicroMsg.BackupMoveRecoverServer", "summerbak try connct old phone, oldphone ip:%s, oldphone wifi:%s, newphone wifi:%s", new Object[] { paramString, paramm.vIR, g.ds(ah.getContext()) });
      c.aTk();
      c.a(this.jtN, paramString, paramInt1);
      AppMethodBeat.o(17246);
      break;
      ab.e("MicroMsg.BackupMoveRecoverServer", "summerbak address convMsgCount is empty");
      paramString = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.d.c.1
 * JD-Core Version:    0.6.2
 */