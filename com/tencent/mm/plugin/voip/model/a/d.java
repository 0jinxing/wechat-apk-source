package com.tencent.mm.plugin.voip.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.cpj;
import com.tencent.mm.protocal.protobuf.cpk;
import com.tencent.mm.sdk.platformtools.ab;

public final class d extends n<cpj, cpk>
{
  public d(int paramInt1, long paramLong, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, byte[] paramArrayOfByte, int paramInt7)
  {
    AppMethodBeat.i(4706);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new cpj();
    ((b.a)localObject).fsK = new cpk();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/voipDoubleLinkSwitch";
    ((b.a)localObject).fsI = 249;
    ((b.a)localObject).fsL = 249;
    ((b.a)localObject).fsM = 1000000249;
    this.ehh = ((b.a)localObject).acD();
    localObject = (cpj)this.ehh.fsG.fsP;
    ((cpj)localObject).wem = paramInt1;
    ((cpj)localObject).wen = paramLong;
    ((cpj)localObject).wPb = paramInt2;
    ((cpj)localObject).xmN = paramInt3;
    ((cpj)localObject).xmO = paramInt4;
    ((cpj)localObject).xmP = paramInt5;
    ((cpj)localObject).xmQ = paramInt6;
    ((cpj)localObject).xmR = 1;
    ((cpj)localObject).vJd = new SKBuiltinBuffer_t().setBuffer(paramArrayOfByte, 0, paramInt7);
    AppMethodBeat.o(4706);
  }

  public final f cKt()
  {
    AppMethodBeat.i(4708);
    d.1 local1 = new d.1(this);
    AppMethodBeat.o(4708);
    return local1;
  }

  public final void fW(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(4707);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      cpk localcpk = (cpk)cKx();
      if (localcpk != null)
        ab.i("MicroMsg.Voip.DoubleLinkSwitch", "roomId:%d, roomKey:%s, member:%d", new Object[] { Integer.valueOf(localcpk.wem), Long.valueOf(localcpk.wen), Integer.valueOf(localcpk.wPb) });
      AppMethodBeat.o(4707);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.Voip.DoubleLinkSwitch", "double link switch error");
      AppMethodBeat.o(4707);
    }
  }

  public final int getType()
  {
    return 249;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.a.d
 * JD-Core Version:    0.6.2
 */