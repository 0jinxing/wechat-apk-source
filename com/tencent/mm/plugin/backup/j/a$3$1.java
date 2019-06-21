package com.tencent.mm.plugin.backup.j;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.kb;
import com.tencent.mm.g.a.kb.a;
import com.tencent.mm.plugin.q.b;
import com.tencent.mm.plugin.q.f;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ab;

final class a$3$1
  implements Runnable
{
  a$3$1(a.3 param3, kb paramkb)
  {
  }

  public final void run()
  {
    AppMethodBeat.i(18089);
    Object localObject = this.jDa;
    ab.i("MicroMsg.BackupCore", "receive msgSynchronizeStartEvent run userCloseMsgSync[%b]", new Object[] { Boolean.valueOf(((kb)localObject).cFs.cFv) });
    if (((kb)localObject).cFs.cFv)
    {
      h.pYm.a(466L, 13L, 1L, false);
      AppMethodBeat.o(18089);
    }
    while (true)
    {
      return;
      byte[] arrayOfByte = ((kb)localObject).cFs.cFt;
      if (arrayOfByte == null)
      {
        ab.e("MicroMsg.BackupCore", "msgsynchronize loginconfirmok key is null!");
        h.pYm.a(466L, 14L, 1L, false);
        AppMethodBeat.o(18089);
      }
      else
      {
        int i = ((kb)localObject).cFs.cFu;
        localObject = f.jf(true);
        String str = b.oFb;
        ((f)localObject).cFu = i;
        ((f)localObject).e(str, "", arrayOfByte);
        AppMethodBeat.o(18089);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.j.a.3.1
 * JD-Core Version:    0.6.2
 */