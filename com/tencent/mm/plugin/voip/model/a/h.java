package com.tencent.mm.plugin.voip.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.plugin.voip.model.k;
import com.tencent.mm.plugin.voip.model.v2protocal;
import com.tencent.mm.protocal.protobuf.cpv;
import com.tencent.mm.protocal.protobuf.cpw;
import com.tencent.mm.protocal.protobuf.cpy;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class h extends n<cpv, cpw>
{
  public h(int paramInt1, long paramLong, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(4720);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new cpv();
    ((b.a)localObject).fsK = new cpw();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/voipRedirect";
    ((b.a)localObject).fsI = 678;
    ((b.a)localObject).fsL = 240;
    ((b.a)localObject).fsM = 1000000240;
    this.ehh = ((b.a)localObject).acD();
    cpv localcpv = (cpv)this.ehh.fsG.fsP;
    localcpv.wem = paramInt1;
    localcpv.wen = paramLong;
    localcpv.wPb = paramInt2;
    localcpv.xnN = paramInt3;
    localcpv.xnO = paramInt4;
    paramInt1 = 0;
    paramInt2 = 0;
    while (paramInt1 < paramInt4)
    {
      localObject = new cpy();
      paramInt3 = paramInt2 + 1;
      ((cpy)localObject).xnY = paramArrayOfInt[paramInt2];
      paramInt2 = paramInt3 + 1;
      ((cpy)localObject).xnZ = paramArrayOfInt[paramInt3];
      paramInt3 = paramInt2 + 1;
      ((cpy)localObject).xoa = paramArrayOfInt[paramInt2];
      int j = paramInt3 + 1;
      ((cpy)localObject).xob = paramArrayOfInt[paramInt3];
      paramInt2 = j + 1;
      ((cpy)localObject).xoc = paramArrayOfInt[j];
      localcpv.xnP.add(localObject);
      paramInt1++;
    }
    paramInt1 = i;
    if (this.sPK.sPp.sVH.sQF != 0L)
      paramInt1 = (int)((System.currentTimeMillis() - this.sPK.sPp.sVH.sQF) / 1000L);
    localcpv.xnQ = paramInt1;
    AppMethodBeat.o(4720);
  }

  public final f cKt()
  {
    AppMethodBeat.i(4722);
    h.1 local1 = new h.1(this);
    AppMethodBeat.o(4722);
    return local1;
  }

  public final void fW(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(4721);
    if ((paramInt1 == 0) && (paramInt2 == 0))
    {
      cpw localcpw = (cpw)this.ehh.fsH.fsP;
      if (localcpw != null)
        ab.i("MicroMsg.Voip.Redirect", "roomId:%d, roomKey:%s, member:%d", new Object[] { Integer.valueOf(localcpw.wem), Long.valueOf(localcpw.wen), Integer.valueOf(localcpw.wPb) });
      AppMethodBeat.o(4721);
    }
    while (true)
    {
      return;
      ab.i("MicroMsg.Voip.Redirect", "Redirect error");
      AppMethodBeat.o(4721);
    }
  }

  public final int getType()
  {
    return 678;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.a.h
 * JD-Core Version:    0.6.2
 */