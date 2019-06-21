package com.tencent.mm.ui.transmit;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.at.e;
import com.tencent.mm.i.c;
import com.tencent.mm.i.d;
import com.tencent.mm.i.g.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import java.io.ByteArrayOutputStream;

final class MsgRetransmitUI$8
  implements g.a
{
  MsgRetransmitUI$8(MsgRetransmitUI paramMsgRetransmitUI, bi parambi, int paramInt1, int paramInt2, String paramString1, String paramString2, String paramString3, String paramString4, int paramInt3, e parame)
  {
  }

  public final int a(String paramString, int paramInt, c paramc, d paramd, boolean paramBoolean)
  {
    AppMethodBeat.i(35070);
    if (paramd != null)
    {
      if (!paramd.field_exist_whencheck)
        break label78;
      ab.i("MicroMsg.MsgRetransmitUI", "support second !! sceneResult:[%s]", new Object[] { paramd });
      MsgRetransmitUI.a(this.zJr, paramd, this.fku, this.jOj, this.fwC, this.yIy, this.yIz, this.iRf, this.fEU);
    }
    while (true)
    {
      AppMethodBeat.o(35070);
      return 0;
      label78: ab.i("MicroMsg.MsgRetransmitUI", "not support second !! dealDownLoadImg");
      MsgRetransmitUI.a(this.zJr, this.fFp, this.fku, this.yIz, this.jOj, this.fwC, this.yIy);
    }
  }

  public final void a(String paramString, ByteArrayOutputStream paramByteArrayOutputStream)
  {
  }

  public final byte[] l(String paramString, byte[] paramArrayOfByte)
  {
    return new byte[0];
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.MsgRetransmitUI.8
 * JD-Core Version:    0.6.2
 */