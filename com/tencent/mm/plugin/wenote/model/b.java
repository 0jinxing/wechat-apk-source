package com.tencent.mm.plugin.wenote.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.m.b;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.BaseResponse;
import com.tencent.mm.protocal.protobuf.abd;
import com.tencent.mm.protocal.protobuf.abj;
import com.tencent.mm.protocal.protobuf.abk;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class b extends m
  implements k
{
  private final com.tencent.mm.ai.b ehh;
  private f ehi;
  public int uMF;
  private String uMG;
  private abd uMH;
  private LinkedList<abd> uMI;
  public int uMJ;

  public b(int paramInt1, int paramInt2, String paramString, LinkedList<abd> paramLinkedList, abd paramabd)
  {
    AppMethodBeat.i(26595);
    this.ehi = null;
    this.uMF = 1;
    this.uMG = "";
    this.uMH = null;
    this.uMI = new LinkedList();
    this.uMJ = 0;
    this.uMI = paramLinkedList;
    this.uMH = paramabd;
    this.uMG = paramString;
    this.uMF = paramInt2;
    this.uMJ = paramInt1;
    paramString = new b.a();
    paramString.fsJ = new abj();
    paramString.fsK = new abk();
    paramString.uri = "/cgi-bin/micromsg-bin/favsecurity ";
    paramString.fsI = 921;
    paramString.fsL = 0;
    paramString.fsM = 0;
    this.ehh = paramString.acD();
    AppMethodBeat.o(26595);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(26596);
    abj localabj = (abj)this.ehh.fsG.fsP;
    localabj.nbk = this.uMF;
    localabj.wiA = this.uMH;
    localabj.wiz = this.uMI;
    localabj.wdK = this.uMG;
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(26596);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(26597);
    ab.i("MicroMsg.NetSceneCheckNoteSecurity", "netId %d errType %d errCode %d errMsg %s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    paramq = (abk)((com.tencent.mm.ai.b)paramq).fsH.fsP;
    if (paramInt2 != 0)
    {
      ab.i("MicroMsg.NetSceneCheckNoteSecurity", "NetSceneCheckNoteSecurity,errType:%d,fail", new Object[] { Integer.valueOf(paramInt2) });
      this.ehi.onSceneEnd(paramInt2, -1, paramString, this);
      AppMethodBeat.o(26597);
    }
    while (true)
    {
      return;
      if ((paramq == null) || (paramq.getBaseResponse() == null))
      {
        ab.i("MicroMsg.NetSceneCheckNoteSecurity", "NetSceneCheckNoteSecurity,response == null,ok");
        this.ehi.onSceneEnd(paramInt2, 0, paramString, this);
        AppMethodBeat.o(26597);
      }
      else if (paramq.getBaseResponse().Ret != 0)
      {
        ab.i("MicroMsg.NetSceneCheckNoteSecurity", "NetSceneCheckNoteSecurity,baseresponse.ret != 0,ok");
        this.ehi.onSceneEnd(paramInt2, 0, paramString, this);
        AppMethodBeat.o(26597);
      }
      else if (paramq.wiB > 0)
      {
        ab.i("MicroMsg.NetSceneCheckNoteSecurity", "NetSceneCheckNoteSecurity,SecurityResult > 0,fail");
        this.ehi.onSceneEnd(paramInt2, -1, paramString, this);
        AppMethodBeat.o(26597);
      }
      else
      {
        ab.i("MicroMsg.NetSceneCheckNoteSecurity", "NetSceneCheckNoteSecurity,SecurityResult = 0,fail");
        this.ehi.onSceneEnd(paramInt2, 0, paramString, this);
        AppMethodBeat.o(26597);
      }
    }
  }

  public final m.b b(q paramq)
  {
    return m.b.ftu;
  }

  public final int getType()
  {
    return 921;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.model.b
 * JD-Core Version:    0.6.2
 */