package com.tencent.mm.ui.chatting;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.modelvideo.h.a;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.t;
import com.tencent.mm.modelvideo.u;
import com.tencent.mm.sdk.platformtools.ab;

final class j$4$1
  implements h.a
{
  j$4$1(j.4 param4, String paramString)
  {
  }

  public final void cC(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(30535);
    s locals = u.ut(this.yIE);
    locals.status = 111;
    locals.bJt = 256;
    o.all().c(locals);
    ab.d("MicroMsg.ChattingEditModeLogic", "NetSceneUploadVideoForCdn callback, errType: %s, errCode: %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    AppMethodBeat.o(30535);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.j.4.1
 * JD-Core Version:    0.6.2
 */