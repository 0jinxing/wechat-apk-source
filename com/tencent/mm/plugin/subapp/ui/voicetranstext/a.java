package com.tencent.mm.plugin.subapp.ui.voicetranstext;

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
import com.tencent.mm.protocal.protobuf.bod;
import com.tencent.mm.protocal.protobuf.clu;
import com.tencent.mm.protocal.protobuf.coa;
import com.tencent.mm.protocal.protobuf.cof;
import com.tencent.mm.protocal.protobuf.sf;
import com.tencent.mm.protocal.protobuf.sg;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class a extends m
  implements k
{
  public static int svO = 1;
  public static int svP = 2;
  public static int svQ = 3;
  private int Scene;
  private String cMr;
  private b fsB;
  private String mFileName;
  public int mState;
  private f oRe;
  private String svJ;
  private int svK;
  private coa svL;
  private long svM;
  private String svN;
  public cof svR;
  public clu svS;
  public bod svT;
  int svU;

  public a(String paramString1, int paramInt1, int paramInt2, long paramLong, String paramString2)
  {
    AppMethodBeat.i(25573);
    this.mState = -1;
    a(paramString1, paramInt1, paramInt2, paramLong, paramString2, 0, "", "");
    AppMethodBeat.o(25573);
  }

  public a(String paramString1, int paramInt1, int paramInt2, long paramLong, String paramString2, int paramInt3, String paramString3, String paramString4)
  {
    AppMethodBeat.i(25575);
    this.mState = -1;
    a(paramString1, paramInt1, paramInt2, paramLong, paramString2, paramInt3, paramString3, paramString4);
    AppMethodBeat.o(25575);
  }

  public a(String paramString1, int paramInt, String paramString2)
  {
    AppMethodBeat.i(25572);
    this.mState = -1;
    a(paramString1, paramInt, -1, -1L, paramString2, 0, "", "");
    AppMethodBeat.o(25572);
  }

  public a(String paramString1, int paramInt1, String paramString2, int paramInt2, String paramString3, String paramString4)
  {
    AppMethodBeat.i(25574);
    this.mState = -1;
    a(paramString1, paramInt1, -1, -1L, paramString2, paramInt2, paramString3, paramString4);
    AppMethodBeat.o(25574);
  }

  private void a(String paramString1, int paramInt1, int paramInt2, long paramLong, String paramString2, int paramInt3, String paramString3, String paramString4)
  {
    AppMethodBeat.i(25576);
    b.a locala = new b.a();
    locala.fsJ = new sf();
    locala.fsK = new sg();
    locala.uri = "/cgi-bin/micromsg-bin/checkvoicetrans";
    locala.fsI = 546;
    locala.fsL = 0;
    locala.fsM = 0;
    this.mFileName = paramString2;
    this.fsB = locala.acD();
    ab.i("MicroMsg.NetSceneCheckVoiceTrans", "voiceId:%s, totalLen:%d, encodeType: %d, svrMsgId: %s", new Object[] { paramString1, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Long.valueOf(paramLong) });
    if (paramInt2 >= 0)
      this.svL = d.bm(paramInt2, paramString2);
    if (paramLong > 0L)
      this.svM = paramLong;
    this.svJ = paramString1;
    this.svK = paramInt1;
    this.Scene = paramInt3;
    this.svN = paramString3;
    this.cMr = paramString4;
    AppMethodBeat.o(25576);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(25577);
    this.oRe = paramf;
    paramf = (sf)this.fsB.fsG.fsP;
    paramf.vZx = this.svJ;
    paramf.ptw = this.svK;
    paramf.vZy = this.svL;
    paramf.ptF = this.svM;
    paramf.Scene = this.Scene;
    paramf.ndG = this.svN;
    paramf.ndF = this.cMr;
    int i = a(parame, this.fsB, this);
    AppMethodBeat.o(25577);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(25578);
    if ((paramInt2 == 0) && (paramInt3 == 0))
    {
      paramq = (sg)this.fsB.fsH.fsP;
      if (paramq == null)
      {
        AppMethodBeat.o(25578);
        return;
      }
      this.svR = paramq.vZz;
      this.mState = paramq.jBT;
      this.svS = paramq.vZA;
      this.svT = paramq.vZB;
      this.svU = paramq.vZC;
    }
    while (true)
    {
      this.oRe.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(25578);
      break;
      ab.i("MicroMsg.NetSceneCheckVoiceTrans", "end checkVoiceTrans, & errType:%d, errCode:%d, voiceId: %s ", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), this.svJ });
    }
  }

  public final boolean cDR()
  {
    AppMethodBeat.i(25579);
    boolean bool;
    if ((this.svR != null) && (!bo.isNullOrNil(this.svR.xlH)))
    {
      bool = true;
      AppMethodBeat.o(25579);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(25579);
    }
  }

  public final int getType()
  {
    return 546;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.subapp.ui.voicetranstext.a
 * JD-Core Version:    0.6.2
 */