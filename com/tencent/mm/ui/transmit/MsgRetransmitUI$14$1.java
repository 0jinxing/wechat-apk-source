package com.tencent.mm.ui.transmit;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelvideo.h.a;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.sdk.platformtools.ab;

final class MsgRetransmitUI$14$1
  implements h.a
{
  MsgRetransmitUI$14$1(MsgRetransmitUI.14 param14, String paramString)
  {
  }

  public final void cC(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(35077);
    s locals = u.ut(this.yIE);
    locals.status = 111;
    locals.bJt = 256;
    o.all().c(locals);
    ab.d("MicroMsg.MsgRetransmitUI", "NetSceneUploadVideoForCdn callback, errType: %s, errCode: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    AppMethodBeat.o(35077);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.transmit.MsgRetransmitUI.14.1
 * JD-Core Version:    0.6.2
 */