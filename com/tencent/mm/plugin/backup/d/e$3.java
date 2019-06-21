package com.tencent.mm.plugin.backup.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.backup.e.a;
import com.tencent.mm.plugin.backup.g.b;
import com.tencent.mm.protocal.k.b;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.gs;
import com.tencent.mm.sdk.platformtools.ab;

final class e$3
  implements f
{
  e$3(e parame)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    AppMethodBeat.i(17304);
    b.b(1000, this.jul.juk);
    ab.i("MicroMsg.CheckNetworkGenQrCodeHandler", "backup move receive createOffilineQrcode response.[%d,%d,%s]", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    if ((paramInt1 != 0) || (paramInt2 != 0))
    {
      ab.e("MicroMsg.CheckNetworkGenQrCodeHandler", "create offline qrcode failed, errMsg:".concat(String.valueOf(paramString)));
      this.jul.jqR.jqW = -11;
      this.jul.juh.k(-11, null);
      AppMethodBeat.o(17304);
      return;
    }
    paramm = ((k.b)((a)paramm).ftU.ZS()).vya;
    if (paramm == null)
    {
      paramString = "null";
      label133: ab.i("MicroMsg.BackupCreateQRCodeOfflineScene", "onGYNetEnd QRCodeUrl:%s", new Object[] { paramString });
      if (paramm != null)
        break label204;
      paramString = null;
    }
    while (true)
    {
      if (paramString != null)
      {
        this.jul.jqR.jqW = 51;
        this.jul.juh.k(51, paramString);
      }
      AppMethodBeat.o(17304);
      break;
      paramString = paramm.vIU;
      break label133;
      label204: if (paramm.vIT == null)
        paramString = null;
      else
        paramString = paramm.vIT.getBufferToBytes();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.d.e.3
 * JD-Core Version:    0.6.2
 */