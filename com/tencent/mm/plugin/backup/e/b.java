package com.tencent.mm.plugin.backup.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.model.r;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.plugin.backup.b.d;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.gr;
import com.tencent.mm.protocal.protobuf.gt;
import com.tencent.mm.protocal.protobuf.ua;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.LinkedList;

public final class b extends m
  implements k
{
  public com.tencent.mm.ai.b ehh;
  protected f ehi;

  public b(LinkedList<ua> paramLinkedList, String paramString)
  {
    AppMethodBeat.i(17315);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new gr();
    ((b.a)localObject).fsK = new gt();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/bakchatcreateqrcode";
    ((b.a)localObject).fsI = 704;
    this.ehh = ((b.a)localObject).acD();
    localObject = (gr)this.ehh.fsG.fsP;
    ((gr)localObject).vIN = paramLinkedList.size();
    ((gr)localObject).vIO = paramLinkedList;
    ((gr)localObject).vIQ = r.Yz();
    ((gr)localObject).vIP = com.tencent.mm.compatible.e.q.getDeviceID(ah.getContext());
    ((gr)localObject).vIR = paramString;
    ((gr)localObject).jBP = 0L;
    ((gr)localObject).Scene = 2;
    AppMethodBeat.o(17315);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(17316);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(17316);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, com.tencent.mm.network.q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(17317);
    ab.i("MicroMsg.BackupCreateQRCodeScene", "err: %d, %d, %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(17317);
    }
    while (true)
    {
      return;
      paramq = (gt)this.ehh.fsH.fsP;
      ab.i("MicroMsg.BackupCreateQRCodeScene", "onGYNetEnd QRCodeUrl:%s", new Object[] { paramq.vIU });
      d.ao(paramq.vIn.getBuffer().wR);
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(17317);
    }
  }

  public final int getType()
  {
    return 704;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.e.b
 * JD-Core Version:    0.6.2
 */