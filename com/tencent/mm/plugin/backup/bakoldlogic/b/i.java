package com.tencent.mm.plugin.backup.bakoldlogic.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.e;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.backup.i.u;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.btt;
import com.tencent.mm.protocal.protobuf.gu;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class i
{
  public static int a(i.a parama)
  {
    AppMethodBeat.i(17801);
    int i;
    if (parama.jvB == null)
    {
      ab.e("MicroMsg.BakOldPackUtil", "packBackupItem %s is null!", new Object[] { "backupItemInfo.backupitem" });
      AppMethodBeat.o(17801);
      i = 0;
    }
    while (true)
    {
      return i;
      i = e.cs(parama.filePath);
      if (i <= 0)
      {
        ab.e("MicroMsg.BakOldPackUtil", "packBackupItem filePath error:" + parama.filePath);
        AppMethodBeat.o(17801);
        i = 0;
      }
      else if (parama.jvD)
      {
        AppMethodBeat.o(17801);
      }
      else
      {
        if ((i < 8192) && (parama.jvB.vJd.getILen() == 0))
        {
          if (parama.cyQ == 5)
            if (parama.exP == null)
            {
              ab.e("MicroMsg.BakOldPackUtil", "packBackupItem BACKUPITEM_EMOJI type but emojiInfo is null!");
              localObject = null;
            }
          while (true)
          {
            localObject = new SKBuiltinBuffer_t().setBuffer((byte[])localObject);
            parama.jvB.vJe = i;
            parama.jvB.vJf = parama.cyQ;
            parama.jvB.vJd = ((SKBuiltinBuffer_t)localObject);
            AppMethodBeat.o(17801);
            break;
            localObject = ((com.tencent.mm.plugin.emoji.b.d)g.M(com.tencent.mm.plugin.emoji.b.d.class)).getEmojiMgr().l(parama.exP);
            continue;
            localObject = e.f(parama.filePath, 0, -1);
          }
        }
        if (parama.jvC != null)
          break;
        ab.e("MicroMsg.BakOldPackUtil", "packBackupItem error mediaInfoList null");
        AppMethodBeat.o(17801);
        i = 0;
      }
    }
    StringBuilder localStringBuilder = new StringBuilder().append(parama.jvB.vEB.toString()).append("_").append(parama.jvB.vEC.toString()).append("_").append(parama.jvB.ptF).append("_backup_");
    if (parama.jvE == null);
    for (Object localObject = ""; ; localObject = parama.jvE)
    {
      localObject = (String)localObject;
      ab.d("MicroMsg.BakOldPackUtil", "packBackupItem mediaId:%s, filePath:%s", new Object[] { localObject, parama.filePath });
      parama.jvB.vJb.add(new bts().alV((String)localObject));
      parama.jvB.vJc.add(new btt().LQ(parama.cyQ));
      parama.jvB.vJa = parama.jvB.vJb.size();
      if (parama.jvy == null)
        parama.jvy = new u();
      parama.jvy.jCr = parama.jvB.ptF;
      parama.jvy.cHr = ((String)localObject);
      parama.jvy.path = parama.filePath;
      parama.jvy.type = parama.cyQ;
      if (!parama.jvF)
        parama.jvC.add(parama.jvy);
      AppMethodBeat.o(17801);
      i = 0;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.bakoldlogic.b.i
 * JD-Core Version:    0.6.2
 */