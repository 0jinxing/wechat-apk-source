package com.tencent.mm.plugin.backup.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.backup.e.a;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.gt;
import com.tencent.mm.sdk.platformtools.ab;

final class e$2
  implements f
{
  e$2(e parame)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(17303);
    com.tencent.mm.plugin.backup.g.b.b(704, this.jul.juj);
    ab.i("MicroMsg.CheckNetworkGenQrCodeHandler", "backup move receive createQrcode response.[%d,%d,%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      ab.e("MicroMsg.CheckNetworkGenQrCodeHandler", "create qrcode failed, errMsg:".concat(String.valueOf(paramString)));
      ab.i("MicroMsg.CheckNetworkGenQrCodeHandler", "err: %d, %d, %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
      if (paramInt2 == -100)
      {
        aw.Rg().a(1000, this.jul.juk);
        paramString = new a(this.jul.jud, this.jul.jue, b.aSZ().jtg);
        aw.Rg().a(paramString, 0);
        AppMethodBeat.o(17303);
      }
      while (true)
      {
        return;
        this.jul.jqR.jqW = -11;
        this.jul.juh.k(-11, null);
        AppMethodBeat.o(17303);
      }
    }
    paramString = (com.tencent.mm.plugin.backup.e.b)paramm;
    paramm = (gt)paramString.ehh.fsH.fsP;
    b.aSZ().jqO = "";
    b.aSZ().jqP = paramm.vIW;
    b.aSZ().jqQ = paramm.vIX;
    b.aSZ().jtg = paramm.vIS;
    paramString = (gt)paramString.ehh.fsH.fsP;
    if (paramString == null)
      paramString = null;
    while (true)
    {
      if (paramString != null)
      {
        this.jul.jqR.jqW = 51;
        this.jul.juh.k(51, paramString);
      }
      AppMethodBeat.o(17303);
      break;
      if (paramString.vIT == null)
        paramString = null;
      else
        paramString = paramString.vIT.getBufferToBytes();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.d.e.2
 * JD-Core Version:    0.6.2
 */