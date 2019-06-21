package com.tencent.mm.openim.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ah.h;
import com.tencent.mm.ah.i;
import com.tencent.mm.ah.o;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bvk;
import com.tencent.mm.protocal.protobuf.bvl;
import com.tencent.mm.protocal.protobuf.bvm;
import com.tencent.mm.sdk.platformtools.ab;

public final class n extends m
  implements k
{
  private final b ehh;
  private f ehi;
  private String gff;
  public bvk gfg;
  public String gfh;

  public n(String paramString)
  {
    AppMethodBeat.i(78871);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bvl();
    ((b.a)localObject).fsK = new bvm();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/searchopenimcontact";
    ((b.a)localObject).fsI = 372;
    this.ehh = ((b.a)localObject).acD();
    ab.i("MicroMsg.NetSceneSearchOpenIMContact", "search tpQrcode [%s]", new Object[] { this.gff });
    localObject = (bvl)this.ehh.fsG.fsP;
    ((bvl)localObject).wWz = "";
    ((bvl)localObject).cFl = paramString;
    ((bvl)localObject).wWA = 1;
    AppMethodBeat.o(78871);
  }

  public n(String paramString, byte paramByte)
  {
    AppMethodBeat.i(78872);
    this.gff = paramString;
    b.a locala = new b.a();
    locala.fsJ = new bvl();
    locala.fsK = new bvm();
    locala.uri = "/cgi-bin/micromsg-bin/searchopenimcontact";
    locala.fsI = 372;
    this.ehh = locala.acD();
    ab.i("MicroMsg.NetSceneSearchOpenIMContact", "search tpQrcode [%s]", new Object[] { paramString });
    ((bvl)this.ehh.fsG.fsP).wWz = paramString;
    AppMethodBeat.o(78872);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(78873);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(78873);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(78874);
    ab.i("MicroMsg.NetSceneSearchOpenIMContact", "onGYNetEnd : errType : %d, errCode : %d, errMsg : %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 != 0) || (paramInt3 != 0))
    {
      if ((paramInt2 == 4) && (paramInt3 == -2034))
        this.gfh = ((bvm)this.ehh.fsH.fsP).url;
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(78874);
    }
    while (true)
    {
      return;
      this.gfg = ((bvm)this.ehh.fsH.fsP).wWB;
      paramq = new h();
      paramq.username = this.gfg.jBB;
      paramq.frW = this.gfg.vXm;
      paramq.frV = this.gfg.vXn;
      paramq.bJt = -1;
      ab.d("MicroMsg.NetSceneSearchOpenIMContact", "onGYNetEnd search setImageFlag %s b[%s] s[%s]", new Object[] { paramq.getUsername(), paramq.ack(), paramq.acl() });
      paramq.dtR = 3;
      paramq.cB(true);
      o.act().b(paramq);
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(78874);
    }
  }

  public final int getType()
  {
    return 372;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.openim.b.n
 * JD-Core Version:    0.6.2
 */