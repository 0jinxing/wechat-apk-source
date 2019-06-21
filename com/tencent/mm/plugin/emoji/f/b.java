package com.tencent.mm.plugin.emoji.f;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.EmotionPrice;
import com.tencent.mm.protocal.protobuf.fs;
import com.tencent.mm.protocal.protobuf.ft;
import com.tencent.mm.sdk.platformtools.ab;
import java.text.DecimalFormat;

public final class b extends m
  implements k
{
  public static int kWi = 6;
  public static int kWj = 7;
  public static int kWk = 10;
  private f eIc;
  private final com.tencent.mm.ai.b ehh;
  private String kWl;
  private EmotionPrice kWm;

  public b(String paramString, EmotionPrice paramEmotionPrice)
  {
    AppMethodBeat.i(53093);
    b.a locala = new b.a();
    locala.fsJ = new fs();
    locala.fsK = new ft();
    locala.uri = "/cgi-bin/micromsg-bin/mmaskforreward";
    locala.fsI = 830;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    this.kWl = paramString;
    this.kWm = paramEmotionPrice;
    AppMethodBeat.o(53093);
  }

  public final int a(e parame, f paramf)
  {
    AppMethodBeat.i(53095);
    this.eIc = paramf;
    paramf = (fs)this.ehh.fsG.fsP;
    paramf.ProductID = this.kWl;
    EmotionPrice localEmotionPrice = new EmotionPrice();
    localEmotionPrice.Label = this.kWm.Label;
    localEmotionPrice.Type = this.kWm.Type;
    localEmotionPrice.Number = new DecimalFormat("0.00").format(Float.valueOf(this.kWm.Number));
    paramf.vHC = localEmotionPrice;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(53095);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(53094);
    ab.d("MicroMsg.emoji.NetSceneAskForReward", "onGYNetEnd ErrType:%d, errCode:%d, errMsg", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.eIc.onSceneEnd(paramInt2, paramInt3, paramString, this);
    AppMethodBeat.o(53094);
  }

  public final ft bkt()
  {
    return (ft)this.ehh.fsH.fsP;
  }

  public final int getType()
  {
    return 830;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.f.b
 * JD-Core Version:    0.6.2
 */