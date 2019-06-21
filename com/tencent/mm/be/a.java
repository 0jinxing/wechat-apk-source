package com.tencent.mm.be;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.axx;
import com.tencent.mm.protocal.protobuf.bxd;
import com.tencent.mm.protocal.protobuf.bxe;
import com.tencent.mm.sdk.platformtools.ab;

public final class a extends m
  implements k
{
  private final b ehh;
  private f ehi;
  String fNi;

  public a(float paramFloat1, float paramFloat2, int paramInt1, int paramInt2, String paramString1, String paramString2, int paramInt3, int paramInt4, String paramString3)
  {
    AppMethodBeat.i(78524);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bxd();
    ((b.a)localObject).fsK = new bxe();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/sensewhere";
    ((b.a)localObject).fsI = 752;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = new axx();
    ((axx)localObject).wfI = paramString2;
    ((axx)localObject).wfJ = paramInt2;
    ((axx)localObject).vRq = paramFloat2;
    ((axx)localObject).vRp = paramFloat1;
    ((axx)localObject).wfH = paramString1;
    ((axx)localObject).wfG = paramInt1;
    paramString1 = (bxd)this.ehh.fsG.fsP;
    paramString1.wcn = ((axx)localObject);
    paramString1.wXm = paramInt3;
    paramString1.Scene = paramInt4;
    paramString1.ncM = paramString3;
    AppMethodBeat.o(78524);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(78526);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(78526);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(78525);
    ab.i("MicroMsg.NetSceneUploadSenseWhere", "upload sense where info. errType[%d] errCode[%d] errMsg[%s]", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    if ((paramInt2 == 0) && (paramInt3 == 0))
      this.fNi = ((bxe)((b)paramq).fsH.fsP).ncM;
    while (true)
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(78525);
      return;
      ab.w("MicroMsg.NetSceneUploadSenseWhere", "upload sense where error");
    }
  }

  public final int getType()
  {
    return 752;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.be.a
 * JD-Core Version:    0.6.2
 */