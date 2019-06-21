package com.tencent.mm.plugin.card.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.aen;
import com.tencent.mm.protocal.protobuf.aeo;
import com.tencent.mm.sdk.platformtools.ab;

public final class aj extends m
  implements k
{
  public boolean eTf;
  private final com.tencent.mm.ai.b ehh;
  private f ehi;
  public String kdS;
  public com.tencent.mm.bt.b keu;

  public aj(String paramString1, int paramInt1, String paramString2, String paramString3, int paramInt2, String paramString4, String paramString5, String paramString6, com.tencent.mm.bt.b paramb)
  {
    AppMethodBeat.i(87922);
    Object localObject = new b.a();
    ((b.a)localObject).fsJ = new aen();
    ((b.a)localObject).fsK = new aeo();
    ((b.a)localObject).uri = "/cgi-bin/micromsg-bin/getavailablecard";
    ((b.a)localObject).fsI = 664;
    ((b.a)localObject).fsL = 0;
    ((b.a)localObject).fsM = 0;
    this.ehh = ((b.a)localObject).acD();
    localObject = (aen)this.ehh.fsG.fsP;
    ((aen)localObject).app_id = paramString1;
    ((aen)localObject).kmq = paramInt1;
    ((aen)localObject).kmr = paramString2;
    ((aen)localObject).kms = paramString3;
    ((aen)localObject).time_stamp = paramInt2;
    ((aen)localObject).kmt = paramString4;
    ((aen)localObject).kbU = paramString5;
    ((aen)localObject).kmu = paramString6;
    ((aen)localObject).keu = paramb;
    if ("INVOICE".equalsIgnoreCase(paramString6))
    {
      ((aen)localObject).wmp = 1;
      AppMethodBeat.o(87922);
    }
    while (true)
    {
      return;
      ((aen)localObject).wmp = 0;
      AppMethodBeat.o(87922);
    }
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(87923);
    this.ehi = paramf;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(87923);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(87924);
    ab.i("MicroMsg.NetsceneGetAvailableCard", "onGYNetEnd, errType = " + paramInt2 + " errCode = " + paramInt3);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (aeo)this.ehh.fsH.fsP;
      this.kdS = paramq.kdS;
      this.keu = paramq.keu;
      if (paramq.wmq == 0)
        break label113;
    }
    label113: for (boolean bool = true; ; bool = false)
    {
      this.eTf = bool;
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(87924);
      return;
    }
  }

  public final int getType()
  {
    return 664;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.card.model.aj
 * JD-Core Version:    0.6.2
 */