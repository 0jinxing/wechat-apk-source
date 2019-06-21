package com.tencent.mm.plugin.voip.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.kernel.g;
import com.tencent.mm.plugin.misc.a.a;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.col;
import com.tencent.mm.protocal.protobuf.com;
import com.tencent.mm.protocal.protobuf.cpx;
import com.tencent.mm.sdk.platformtools.ab;

public final class b extends n<col, com>
{
  String TAG;

  public b(int paramInt1, int paramInt2, int paramInt3, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, long paramLong, boolean paramBoolean1, boolean paramBoolean2)
  {
    AppMethodBeat.i(4699);
    this.TAG = "MicroMsg.NetSceneVoipAnswer";
    Object localObject1 = new b.a();
    ((b.a)localObject1).fsJ = new col();
    ((b.a)localObject1).fsK = new com();
    ((b.a)localObject1).uri = "/cgi-bin/micromsg-bin/voipanswer";
    ((b.a)localObject1).fsI = 172;
    ((b.a)localObject1).fsL = 65;
    ((b.a)localObject1).fsM = 1000000065;
    this.ehh = ((b.a)localObject1).acD();
    localObject1 = (col)this.ehh.fsG.fsP;
    ((col)localObject1).xmb = paramInt1;
    ((col)localObject1).wem = paramInt3;
    ((col)localObject1).vZF = paramInt2;
    Object localObject2 = new cpx();
    ((cpx)localObject2).jCt = 2;
    SKBuiltinBuffer_t localSKBuiltinBuffer_t = new SKBuiltinBuffer_t();
    localSKBuiltinBuffer_t.setBuffer(paramArrayOfByte1);
    ((cpx)localObject2).vJd = localSKBuiltinBuffer_t;
    ((col)localObject1).xlM = ((cpx)localObject2);
    paramArrayOfByte1 = new cpx();
    paramArrayOfByte1.jCt = 3;
    localObject2 = new SKBuiltinBuffer_t();
    ((SKBuiltinBuffer_t)localObject2).setBuffer(paramArrayOfByte2);
    paramArrayOfByte1.vJd = ((SKBuiltinBuffer_t)localObject2);
    ((col)localObject1).xlN = paramArrayOfByte1;
    ((col)localObject1).wen = paramLong;
    if (paramBoolean2)
    {
      if (paramBoolean1)
      {
        paramInt1 = 1;
        ((col)localObject1).xmc = paramInt1;
      }
    }
    else
    {
      ((col)localObject1).xlQ = System.currentTimeMillis();
      paramInt1 = ((a)g.K(a.class)).bOK();
      ab.i(this.TAG, "simType: %s", new Object[] { Integer.valueOf(paramInt1) });
      if (paramInt1 != 0)
        break label303;
      paramInt1 = 0;
    }
    while (true)
    {
      ((col)localObject1).xlR = paramInt1;
      AppMethodBeat.o(4699);
      return;
      paramInt1 = 0;
      break;
      label303: if (paramInt1 == 1)
        paramInt1 = 1;
      else
        paramInt1 = 2;
    }
  }

  public final f cKt()
  {
    AppMethodBeat.i(4700);
    b.1 local1 = new b.1(this);
    AppMethodBeat.o(4700);
    return local1;
  }

  public final int getType()
  {
    return 172;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.a.b
 * JD-Core Version:    0.6.2
 */