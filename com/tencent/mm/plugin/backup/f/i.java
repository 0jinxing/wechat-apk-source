package com.tencent.mm.plugin.backup.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.backup.i.u;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.btt;
import com.tencent.mm.protocal.protobuf.gu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.vfs.e;
import java.util.LinkedList;

public final class i
{
  public static int a(i.a parama)
  {
    AppMethodBeat.i(17468);
    int i;
    if (parama.jvB == null)
    {
      ab.e("MicroMsg.BackupPackUtil", "packBackupItem %s is null!", new Object[] { "backupItemInfo.backupitem" });
      AppMethodBeat.o(17468);
      i = 0;
    }
    while (true)
    {
      return i;
      i = (int)e.asZ(parama.filePath);
      if (i <= 0)
      {
        ab.e("MicroMsg.BackupPackUtil", "packBackupItem filePath error:" + parama.filePath);
        AppMethodBeat.o(17468);
        i = 0;
      }
      else if (parama.jvD)
      {
        AppMethodBeat.o(17468);
      }
      else
      {
        if (parama.jvC != null)
          break;
        ab.e("MicroMsg.BackupPackUtil", "packBackupItem error mediaInfoList null");
        AppMethodBeat.o(17468);
        i = 0;
      }
    }
    StringBuilder localStringBuilder = new StringBuilder().append(parama.jvB.vEB.toString()).append("_").append(parama.jvB.vEC.toString()).append("_").append(parama.jvB.ptF).append("_backup");
    if (parama.jvE == null);
    for (String str = ""; ; str = parama.jvE)
    {
      str = str;
      ab.d("MicroMsg.BackupPackUtil", "packBackupItem mediaId:%s, filePath:%s", new Object[] { str, parama.filePath });
      parama.jvB.vJb.add(new bts().alV(str));
      parama.jvB.vJc.add(new btt().LQ(parama.cyQ));
      parama.jvB.vJa = parama.jvB.vJb.size();
      if (parama.jvy == null)
        parama.jvy = new u();
      parama.jvy.jCr = parama.jvB.ptF;
      parama.jvy.cHr = str;
      parama.jvy.path = parama.filePath;
      parama.jvy.type = parama.cyQ;
      if (!parama.jvF)
        parama.jvC.add(parama.jvy);
      AppMethodBeat.o(17468);
      i = 0;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.f.i
 * JD-Core Version:    0.6.2
 */