package com.tencent.mm.plugin.backup.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.model.r;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.plugin.backup.b.d;
import com.tencent.mm.protocal.k.a;
import com.tencent.mm.protocal.k.b;
import com.tencent.mm.protocal.protobuf.gs;
import com.tencent.mm.protocal.protobuf.ua;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.LinkedList;

public final class a extends m
  implements k
{
  private f ehi;
  public com.tencent.mm.network.q ftU;

  public a(LinkedList<ua> paramLinkedList, String paramString1, String paramString2)
  {
    AppMethodBeat.i(17312);
    this.ftU = new a.a();
    k.a locala = (k.a)this.ftU.acF();
    locala.vxZ = d.aSy();
    locala.vxY.vIN = paramLinkedList.size();
    locala.vxY.vIO = paramLinkedList;
    locala.vxY.vIP = com.tencent.mm.compatible.e.q.getDeviceID(ah.getContext());
    locala.vxY.vIQ = r.Yz();
    locala.vxY.Scene = 2;
    locala.vxY.jBP = 0L;
    locala.vxY.vIR = paramString1;
    locala.vxY.vIS = paramString2;
    locala.vyi = locala.vxZ;
    locala.vyh = new a.1(this, locala);
    AppMethodBeat.o(17312);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(17313);
    this.ehi = paramf;
    int i = a(parame, this.ftU, this);
    AppMethodBeat.o(17313);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(17314);
    ab.i("MicroMsg.BackupCreateQRCodeOfflineScene", "err: %d, %d, %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(17314);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.BackupCreateQRCodeOfflineScene", "onGYNetEnd QRCodeUrl:%s", new Object[] { ((k.b)paramq.ZS()).vya.vIU });
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(17314);
    }
  }

  public final int getType()
  {
    return 1000;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.e.a
 * JD-Core Version:    0.6.2
 */