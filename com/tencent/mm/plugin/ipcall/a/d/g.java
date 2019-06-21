package com.tencent.mm.plugin.ipcall.a.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.aqp;
import com.tencent.mm.protocal.protobuf.aqq;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.ac.a;
import com.tencent.mm.storage.z;
import java.io.IOException;

public final class g extends m
  implements k
{
  private b ehh;
  private f ehi;
  private aqp nys;
  public aqq nyt;

  public g(int paramInt)
  {
    AppMethodBeat.i(21854);
    this.ehh = null;
    this.nys = null;
    this.nyt = null;
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new aqp();
    ((b.a)localObject).fsK = new aqq();
    ((b.a)localObject).fsI = 257;
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getwechatoutcoupons";
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    this.nys = ((aqp)this.ehh.fsG.fsP);
    this.nys.Scene = paramInt;
    localObject = this.nys;
    aw.ZK();
    ((aqp)localObject).wur = ((Integer)c.Ry().get(ac.a.xLI, Integer.valueOf(0))).intValue();
    localObject = this.nys;
    aw.ZK();
    ((aqp)localObject).wus = ((Integer)c.Ry().get(ac.a.xLw, Integer.valueOf(0))).intValue();
    ab.i("MicroMsg.NetSceneIPCallGetWeChatOutCoupons", "NetSceneIPCallGetWeChatOutCoupons Scene:%d, RechargeWordingVersion:%d,AccountActivityWordingVersion:%d", new Object[] { Integer.valueOf(this.nys.Scene), Integer.valueOf(this.nys.wur), Integer.valueOf(this.nys.wus) });
    AppMethodBeat.o(21854);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(21855);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(21855);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(21856);
    ab.i("MicroMsg.NetSceneIPCallGetWeChatOutCoupons", "onGYNetEnd, errType: %d, errCode: %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    this.nyt = ((aqq)((b)paramq).fsH.fsP);
    if (((paramInt2 == 0) || (paramInt3 == 0)) && (paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = this.nyt;
      if (paramq != null)
        ab.i("MicroMsg.IPCallUtil", "[royle]begin save response,Balance:%s,PVWording:%s,Coupons:%s,Wording:%s,Title:%s,Desc:%s,ImgPath:%s,UrlPath:%s,SmsDesc:%s,PackageMsg:%s", new Object[] { paramq.wuw, paramq.wux, paramq.wut, paramq.nzz, paramq.Title, paramq.Desc, paramq.wuu, paramq.wuv, paramq.wuy, paramq.wuE });
    }
    try
    {
      aw.ZK();
      c.Ry().set(ac.a.xMD, bo.cd(paramq.toByteArray()));
      if (this.ehi != null)
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(21856);
      return;
    }
    catch (IOException paramq)
    {
      while (true)
        ab.i("MicroMsg.IPCallUtil", "[royle]save exception:%s", new Object[] { paramq.getMessage() });
    }
  }

  public final int getType()
  {
    return 257;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.d.g
 * JD-Core Version:    0.6.2
 */