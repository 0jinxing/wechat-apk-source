package com.tencent.mm.ui.transmit;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.af.j.b;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.pluginsdk.model.app.z.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.ui.base.h;

final class MsgRetransmitUI$19
  implements z.a
{
  MsgRetransmitUI$19(MsgRetransmitUI paramMsgRetransmitUI, j.b paramb1, j.b paramb2, String paramString, byte[] paramArrayOfByte)
  {
  }

  public final void a(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, long paramLong)
  {
    AppMethodBeat.i(35083);
    ab.i("MicroMsg.MsgRetransmitUI", "summerbig CheckBigFile callback new md5[%s], aesKey[%s], signature[%s], old aeskey[%s], faesKey[%s], fsignature[%s]", new Object[] { paramString1, bo.anv(paramString2), bo.anv(paramString3), bo.anv(this.hWW.eyr), bo.anv(paramString4), bo.anv(paramString5) });
    if (!bo.isNullOrNil(paramString3))
    {
      l.a(this.zJx, this.hWW.appId, this.hWW.appName, this.cgl, "", this.zJy, MsgRetransmitUI.a(this.zJr), paramString3);
      AppMethodBeat.o(35083);
    }
    while (true)
    {
      return;
      h.b(this.zJr, this.zJr.getString(2131298779), "", true);
      this.zJr.finish();
      AppMethodBeat.o(35083);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.MsgRetransmitUI.19
 * JD-Core Version:    0.6.2
 */