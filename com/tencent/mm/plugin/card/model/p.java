package com.tencent.mm.plugin.card.model;

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
import com.tencent.mm.protocal.protobuf.ak;
import com.tencent.mm.protocal.protobuf.al;
import com.tencent.mm.protocal.protobuf.nx;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class p extends m
  implements k
{
  private final b ehh;
  private f ehi;
  public String kdS;
  public int kdT;
  public String kdU;

  public p(LinkedList<nx> paramLinkedList, int paramInt1, String paramString1, String paramString2, int paramInt2)
  {
    AppMethodBeat.i(87860);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new ak();
    ((b.a)localObject).fsK = new al();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/acceptcardlistfromapp";
    ((b.a)localObject).fsI = 687;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (ak)this.ehh.fsG.fsP;
    ((ak)localObject).vBz = paramLinkedList;
    ((ak)localObject).cME = paramInt1;
    ((ak)localObject).vBv = paramString1;
    ((ak)localObject).vBu = paramString2;
    ((ak)localObject).vBw = paramInt2;
    AppMethodBeat.o(87860);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(87861);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(87861);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(87862);
    ab.i("MicroMsg.NetSceneGetCardListFromApp", "onGYNetEnd, errType = " + paramInt2 + " errCode = " + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (al)this.ehh.fsH.fsP;
      this.kdS = paramq.kdS;
      this.kdT = paramq.kdT;
      this.kdU = paramq.kdU;
      ab.e("MicroMsg.NetSceneGetCardListFromApp", "onGYNetEnd, ret_code = " + this.kdT + " ret_msg = " + this.kdU);
    }
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(87862);
  }

  public final int getType()
  {
    return 687;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.p
 * JD-Core Version:    0.6.2
 */