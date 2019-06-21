package com.tencent.mm.plugin.voip.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.kernel.g;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.coh;
import com.tencent.mm.protocal.protobuf.coi;
import com.tencent.mm.protocal.protobuf.cpx;
import com.tencent.mm.sdk.platformtools.ab;

public final class a extends n<coh, coi>
{
  String TAG;

  public a(int paramInt1, long paramLong, int paramInt2, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, String paramString)
  {
    AppMethodBeat.i(4695);
    this.TAG = "MicroMsg.NetSceneVoipAck";
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new coh();
    ((b.a)localObject).fsK = new coi();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/voipack";
    ((b.a)localObject).fsI = 305;
    ((b.a)localObject).fsL = 123;
    ((b.a)localObject).fsM = 1000000123;
    this.ehh = ((b.a)localObject).acD();
    localObject = (coh)this.ehh.fsG.fsP;
    ((coh)localObject).wem = paramInt1;
    ((coh)localObject).wen = paramLong;
    ((coh)localObject).xlP = paramInt2;
    if (paramInt2 != 1)
    {
      ((coh)localObject).xlL = 0;
      AppMethodBeat.o(4695);
      return;
    }
    ((coh)localObject).xlO = paramString;
    cpx localcpx = new cpx();
    localcpx.jCt = 2;
    paramString = new SKBuiltinBuffer_t();
    paramString.setBuffer(paramArrayOfByte1);
    localcpx.vJd = paramString;
    ((coh)localObject).xlM = localcpx;
    paramArrayOfByte1 = new cpx();
    paramArrayOfByte1.jCt = 3;
    paramString = new SKBuiltinBuffer_t();
    paramString.setBuffer(paramArrayOfByte2);
    paramArrayOfByte1.vJd = paramString;
    ((coh)localObject).xlN = paramArrayOfByte1;
    ((coh)localObject).xlQ = System.currentTimeMillis();
    ((coh)localObject).xlL = 1;
    paramInt1 = ((com.tencent.mm.plugin.misc.a.a)g.K(com.tencent.mm.plugin.misc.a.a.class)).bOK();
    ab.i(this.TAG, "simType: %s", new Object[] { Integer.valueOf(paramInt1) });
    if (paramInt1 == 0)
      paramInt1 = 0;
    while (true)
    {
      ((coh)localObject).xlR = paramInt1;
      AppMethodBeat.o(4695);
      break;
      if (paramInt1 == 1)
        paramInt1 = 1;
      else
        paramInt1 = 2;
    }
  }

  public final f cKt()
  {
    AppMethodBeat.i(4696);
    a.1 local1 = new a.1(this);
    AppMethodBeat.o(4696);
    return local1;
  }

  public final int getType()
  {
    return 305;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.a.a
 * JD-Core Version:    0.6.2
 */