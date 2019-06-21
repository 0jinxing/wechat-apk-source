package com.tencent.mm.plugin.backup.j;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.e.a;
import com.tencent.mm.bp.d;
import com.tencent.mm.model.bz.a;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.sdk.platformtools.br;
import java.util.Map;

final class a$5
  implements bz.a
{
  a$5(a parama)
  {
  }

  public final void a(e.a parama)
  {
    AppMethodBeat.i(18094);
    ab.i("MicroMsg.BackupCore.BackupToPc", "sysMsgListener onreceive sysmsg");
    h.pYm.a(400L, 0L, 1L, false);
    String str = (String)br.z(aa.a(parama.eAB.vED), "sysmsg").get(".sysmsg.MMBakChatNotify.url");
    if (bo.isNullOrNil(str))
    {
      ab.e("MicroMsg.BackupCore.BackupToPc", "MMBakChatNotify url is null");
      AppMethodBeat.o(18094);
      return;
    }
    Intent localIntent = new Intent().setClassName(ah.getContext(), "com.tencent.mm.plugin.backup.backuppcmodel.BackupPcService");
    parama = bo.I(ah.getContext(), localIntent);
    if (parama != null);
    while (true)
    {
      d.aH(parama.putExtra("url", str).putExtra("isFromWifi", true));
      AppMethodBeat.o(18094);
      break;
      parama = localIntent;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.j.a.5
 * JD-Core Version:    0.6.2
 */