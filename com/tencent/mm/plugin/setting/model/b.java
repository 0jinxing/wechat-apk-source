package com.tencent.mm.plugin.setting.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.ciu;
import com.tencent.mm.protocal.protobuf.cu;
import com.tencent.mm.protocal.protobuf.cv;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public final class b extends m
  implements k
{
  private f ehi;
  private List<String> lQs;

  public b(List<String> paramList)
  {
    this.lQs = paramList;
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(126841);
    this.ehi = paramf;
    paramf = new b.a();
    cu localcu = new cu();
    ArrayList localArrayList = new ArrayList();
    if (this.lQs != null)
      for (i = 0; i < this.lQs.size(); i++)
      {
        ciu localciu = new ciu();
        localciu.jBB = ((String)this.lQs.get(i));
        localArrayList.add(localciu);
      }
    localcu.vET.addAll(localArrayList);
    paramf.fsJ = localcu;
    paramf.fsK = new cv();
    paramf.uri = "/cgi-bin/micromsg-bin/addtrustedfriends";
    paramf.fsI = 583;
    paramf.fsL = 0;
    paramf.fsL = 0;
    int i = a(parame, paramf.acD(), this);
    AppMethodBeat.o(126841);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(126840);
    this.fth = paramInt1;
    if ((paramInt2 != 0) || (paramInt3 != 0))
      ab.e("MicroMsg.NetSceneGetTrustedFriends", "errType:%d, errCode:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(126840);
  }

  public final int getType()
  {
    return 583;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.setting.model.b
 * JD-Core Version:    0.6.2
 */