package com.tencent.mm.plugin.scanner.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.bee;
import com.tencent.mm.protocal.protobuf.bef;
import com.tencent.mm.protocal.protobuf.cit;
import java.util.List;

public final class e extends m
  implements k
{
  public float angle;
  public int ctE;
  public b ehh;
  private f ehi;
  public List<cit> pZB;
  public long pZC;

  public e(int paramInt1, int paramInt2, String paramString1, String paramString2)
  {
    this(paramInt1, paramInt2, paramString1, paramString2, (byte)0);
  }

  private e(int paramInt1, int paramInt2, String paramString1, String paramString2, byte paramByte)
  {
    AppMethodBeat.i(80837);
    b.a locala = new b.a();
    bee localbee = new bee();
    localbee.vOs = paramInt1;
    localbee.wHN = paramInt2;
    localbee.wHS = paramString1;
    localbee.wHT = paramString2;
    localbee.Scene = 0;
    locala.fsJ = localbee;
    locala.fsK = new bef();
    locala.uri = "/cgi-bin/micromsg-bin/newocrtranslation";
    locala.fsI = 294;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    this.ctE = paramInt1;
    AppMethodBeat.o(80837);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(80838);
    this.ehi = paramf;
    this.pZC = System.currentTimeMillis();
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(80838);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(80839);
    this.angle = ((bef)((b)paramq).fsH.fsP).wHU;
    this.pZB = ((bef)((b)paramq).fsH.fsP).wpm;
    this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(80839);
  }

  public final String cgF()
  {
    return ((bef)this.ehh.fsH.fsP).pZF;
  }

  public final int getType()
  {
    return 294;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.a.e
 * JD-Core Version:    0.6.2
 */