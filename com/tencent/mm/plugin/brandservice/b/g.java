package com.tencent.mm.plugin.brandservice.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.brk;
import com.tencent.mm.protocal.protobuf.brl;
import com.tencent.mm.protocal.protobuf.ks;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class g extends m
  implements k
{
  private b ehh;
  private f ehi;

  public g(LinkedList<ks> paramLinkedList, int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(13843);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new brk();
    ((b.a)localObject).fsK = new brl();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/reportshow";
    ((b.a)localObject).fsI = 2645;
    ((b.a)localObject).fsL = 176;
    ((b.a)localObject).fsM = 1000000176;
    this.ehh = ((b.a)localObject).acD();
    localObject = (brk)this.ehh.fsG.fsP;
    ((brk)localObject).wTG = paramLinkedList;
    ((brk)localObject).wTH = paramInt1;
    ((brk)localObject).wTI = paramInt2;
    ((brk)localObject).vZZ = paramInt3;
    ab.i("MicroMsg.NetSceneReportBizListShowInfo", "reportshow report_list size %d,enter_pos %d,exit_pos %d", new Object[] { Integer.valueOf(((brk)localObject).wTG.size()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    AppMethodBeat.o(13843);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(13845);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(13845);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(13844);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(13844);
  }

  public final int getType()
  {
    return 2645;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.brandservice.b.g
 * JD-Core Version:    0.6.2
 */