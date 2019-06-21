package com.tencent.mm.modelvoiceaddr.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bsm;
import com.tencent.mm.protocal.protobuf.bsn;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.LinkedList;

public final class a extends m
  implements k
{
  private b ehh;
  private f ehi;

  public a(int paramInt, LinkedList<bts> paramLinkedList, bts parambts1, bts parambts2)
  {
    AppMethodBeat.i(116796);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new bsm();
    ((b.a)localObject).fsK = new bsn();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/reportvoiceresult";
    ((b.a)localObject).fsI = 228;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (bsm)this.ehh.fsG.fsP;
    ((bsm)localObject).wUF = paramInt;
    ((bsm)localObject).wUG = paramLinkedList;
    ((bsm)localObject).wUH = parambts1;
    ((bsm)localObject).wUI = parambts2;
    AppMethodBeat.o(116796);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(116797);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(116797);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(116798);
    ab.d("MicroMsg.NetSceneNewVoiceInputReport", "onGYNetEnd errtype:" + paramInt2 + " errcode:" + paramInt3 + " errMsg:" + paramString);
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(116798);
  }

  public final int getType()
  {
    return 228;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelvoiceaddr.b.a
 * JD-Core Version:    0.6.2
 */