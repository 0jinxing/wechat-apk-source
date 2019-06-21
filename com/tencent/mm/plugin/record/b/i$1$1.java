package com.tencent.mm.plugin.record.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.i.d;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.record.a.a;
import com.tencent.mm.plugin.record.a.e;
import com.tencent.mm.sdk.platformtools.ab;

final class i$1$1
  implements d.a
{
  i$1$1(i.1 param1, com.tencent.mm.plugin.record.a.i parami, d paramd)
  {
  }

  public final void ae(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(135669);
    ab.i("MicroMsg.RecordMsgCDNService", "summersafecdn NetSceneCheckMd5 callback [%d, %d], [%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramInt1 == 4) && (paramInt2 == 102))
    {
      ab.i("MicroMsg.RecordMsgCDNService", "summersafecdn NetSceneCheckMd5 MM_ERR_GET_AESKEY_FAILED old status[%d, %d, %d]", new Object[] { Integer.valueOf(this.pJG.field_status), Integer.valueOf(this.pJG.field_offset), Integer.valueOf(this.pJG.field_totalLen) });
      this.pJG.field_offset = 0;
      this.pJG.field_totalLen = 0;
      this.pJG.field_status = 0;
      ((a)g.M(a.class)).getRecordMsgCDNStorage().b(this.pJG, new String[] { "localId" });
      this.pJI.pJF.a(this.pJG, false);
      AppMethodBeat.o(135669);
    }
    while (true)
    {
      return;
      this.pJG.field_cdnKey = paramString;
      this.pJG.field_cdnUrl = this.pJH.field_fileId;
      ((a)g.M(a.class)).getRecordMsgCDNStorage().b(this.pJG, new String[] { "localId" });
      this.pJI.pJF.ceG();
      AppMethodBeat.o(135669);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.record.b.i.1.1
 * JD-Core Version:    0.6.2
 */