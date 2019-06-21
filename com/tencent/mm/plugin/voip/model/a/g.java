package com.tencent.mm.plugin.voip.model.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.model.r;
import com.tencent.mm.plugin.misc.a.a;
import com.tencent.mm.protocal.protobuf.SKBuiltinBuffer_t;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.cpp;
import com.tencent.mm.protocal.protobuf.cpq;
import com.tencent.mm.protocal.protobuf.cpx;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;
import java.util.List;

public final class g extends n<cpp, cpq>
{
  public g(List<String> paramList, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(4717);
    Object localObject1 = new b.a();
    ((b.a)localObject1).fsJ = new cpp();
    ((b.a)localObject1).fsK = new cpq();
    ((b.a)localObject1).uri = "/cgi-bin/micromsg-bin/voipinvite";
    ((b.a)localObject1).fsI = 170;
    ((b.a)localObject1).fsL = 63;
    ((b.a)localObject1).fsM = 1000000063;
    this.ehh = ((b.a)localObject1).acD();
    localObject1 = (cpp)this.ehh.fsG.fsP;
    Object localObject2 = new LinkedList();
    for (int i = 0; i < paramList.size(); i++)
      ((LinkedList)localObject2).add(new bts().alV((String)paramList.get(i)));
    ((cpp)localObject1).wPm = r.Yz();
    ((cpp)localObject1).xmX = ((LinkedList)localObject2);
    ((cpp)localObject1).xmW = ((LinkedList)localObject2).size();
    ((cpp)localObject1).vZF = paramInt1;
    ((cpp)localObject1).xcr = 0;
    ((cpp)localObject1).xmL = paramInt2;
    ((cpp)localObject1).wOQ = paramInt3;
    localObject2 = new cpx();
    ((cpx)localObject2).jCt = 2;
    paramList = new SKBuiltinBuffer_t();
    paramList.setBuffer(paramArrayOfByte1);
    ((cpx)localObject2).vJd = paramList;
    ((cpp)localObject1).xlM = ((cpx)localObject2);
    paramArrayOfByte1 = new cpx();
    paramArrayOfByte1.jCt = 3;
    paramList = new SKBuiltinBuffer_t();
    paramList.setBuffer(paramArrayOfByte2);
    paramArrayOfByte1.vJd = paramList;
    ((cpp)localObject1).xlN = paramArrayOfByte1;
    ((cpp)localObject1).xlQ = System.currentTimeMillis();
    paramInt1 = ((a)com.tencent.mm.kernel.g.K(a.class)).bOK();
    ab.i("MicroMsg.NetSceneVoipInvite", "simType: %s", new Object[] { Integer.valueOf(paramInt1) });
    if (paramInt1 == 0)
      paramInt1 = 0;
    while (true)
    {
      ((cpp)localObject1).xlR = paramInt1;
      AppMethodBeat.o(4717);
      return;
      if (paramInt1 == 1)
        paramInt1 = 1;
      else
        paramInt1 = 2;
    }
  }

  public final f cKt()
  {
    AppMethodBeat.i(4718);
    g.1 local1 = new g.1(this);
    AppMethodBeat.o(4718);
    return local1;
  }

  public final int getType()
  {
    return 170;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.voip.model.a.g
 * JD-Core Version:    0.6.2
 */