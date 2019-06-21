package com.tencent.mm.plugin.wallet_core.c;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.m;
import com.tencent.mm.g.a.pl;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.afd;
import com.tencent.mm.protocal.protobuf.afe;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.util.LinkedList;

public final class c extends m
  implements com.tencent.mm.network.k
{
  private b ehh;
  private com.tencent.mm.ai.f ehi;
  public LinkedList<String> ttN;

  public c(LinkedList<String> paramLinkedList)
  {
    AppMethodBeat.i(46495);
    ab.i("MicroMsg.NetSceneGetBankcardLogo", "NetSceneGetBankcardLogo call");
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new afd();
    ((b.a)localObject).fsK = new afe();
    ((b.a)localObject).uri = "/cgi-bin/mmpay-bin/bankresource";
    ((b.a)localObject).fsI = 1650;
    this.ehh = ((b.a)localObject).acD();
    this.ehh.ftb = true;
    localObject = (afd)this.ehh.fsG.fsP;
    ((afd)localObject).wmD = paramLinkedList;
    ((afd)localObject).vRP = com.tencent.mm.plugin.wallet_core.model.k.cPy();
    if (!com.tencent.mm.pluginsdk.wallet.f.dlH())
      ((afd)localObject).vWV = com.tencent.mm.pluginsdk.wallet.f.dlI();
    com.tencent.mm.wallet_core.ui.e.QS(42);
    AppMethodBeat.o(46495);
  }

  public final int a(com.tencent.mm.network.e parame, com.tencent.mm.ai.f paramf)
  {
    AppMethodBeat.i(46496);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(46496);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(46497);
    ab.i("MicroMsg.NetSceneGetBankcardLogo", "NetSceneGetBankcardLogo onGYNetEnd,errType=" + paramInt2 + "errCode=" + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      afe localafe = (afe)((b)paramq).fsH.fsP;
      ab.i("MicroMsg.NetSceneGetBankcardLogo", "respone %s", new Object[] { localafe.wmE });
      this.ttN = localafe.ttN;
      paramArrayOfByte = this.ttN;
      if ((paramArrayOfByte == null) || (paramArrayOfByte.size() == 0))
      {
        ab.d("MicroMsg.NetSceneGetBankcardLogo", "empty bank logo list");
        g.RQ();
        g.RP().Ry().set(ac.a.xNy, bo.bc(localafe.wmE, ""));
        g.RQ();
        g.RP().Ry().set(ac.a.xNz, Long.valueOf(System.currentTimeMillis() / 1000L));
      }
    }
    while (true)
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(46497);
      return;
      paramq = new pl();
      paramq.cLE.cLG = paramArrayOfByte;
      a.xxA.m(paramq);
      break;
      com.tencent.mm.wallet_core.ui.e.QS(43);
    }
  }

  public final int getType()
  {
    return 1650;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet_core.c.c
 * JD-Core Version:    0.6.2
 */