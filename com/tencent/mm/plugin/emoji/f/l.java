package com.tencent.mm.plugin.emoji.f;

import android.content.ContentValues;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.emoji.b.d;
import com.tencent.mm.protocal.protobuf.EmotionDetail;
import com.tencent.mm.protocal.protobuf.GetEmotionDetailRequest;
import com.tencent.mm.protocal.protobuf.GetEmotionDetailResponse;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.i;
import com.tencent.mm.storage.emotion.j;

public final class l extends m
  implements k
{
  private int cD;
  private final b ehh;
  private f ehi;
  private int gOW;
  public String kWz;

  public l(String paramString, int paramInt)
  {
    this(paramString, paramInt, -1);
  }

  public l(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(53127);
    this.kWz = paramString;
    this.gOW = paramInt1;
    this.cD = paramInt2;
    paramString = new b.a();
    paramString.fsJ = new GetEmotionDetailRequest();
    paramString.fsK = new GetEmotionDetailResponse();
    paramString.uri = "/cgi-bin/micromsg-bin/getemotiondetail";
    paramString.fsI = 412;
    paramString.fsL = 211;
    paramString.fsM = 1000000211;
    this.ehh = paramString.acD();
    AppMethodBeat.o(53127);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(53128);
    ab.i("MicroMsg.emoji.NetSceneGetEmotionDetail", "ProductID:%s, Scene:%d, Version:%d", new Object[] { this.kWz, Integer.valueOf(this.gOW), Integer.valueOf(this.cD) });
    this.ehi = paramf;
    paramf = (GetEmotionDetailRequest)this.ehh.fsG.fsP;
    paramf.ProductID = this.kWz;
    paramf.Scene = this.gOW;
    paramf.Version = this.cD;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(53128);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(53129);
    ab.i("MicroMsg.emoji.NetSceneGetEmotionDetail", "ErrType:" + paramInt2 + "   errCode:" + paramInt3);
    if ((paramInt2 != 0) && (paramInt3 != 0) && (paramInt3 != 5))
    {
      this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      AppMethodBeat.o(53129);
    }
    while (true)
    {
      return;
      GetEmotionDetailResponse localGetEmotionDetailResponse;
      Object localObject;
      if ((paramInt2 == 0) && (paramInt3 == 0))
      {
        paramArrayOfByte = ((d)g.M(d.class)).getEmojiStorageMgr().xYr;
        paramq = this.kWz;
        localGetEmotionDetailResponse = (GetEmotionDetailResponse)this.ehh.fsH.fsP;
        localObject = aa.gw(ah.getContext());
        if ((bo.isNullOrNil(paramq)) || (localGetEmotionDetailResponse == null))
          ab.w("MicroMsg.emoji.EmotionDetailInfoStorage", "saveEmotionRewardResponseWithPID failed. productId or response is null.");
      }
      try
      {
        i locali = new com/tencent/mm/storage/emotion/i;
        locali.<init>();
        locali.field_productID = paramq;
        locali.field_content = localGetEmotionDetailResponse.toByteArray();
        locali.field_lan = ((String)localObject);
        localObject = locali.Hl();
        if (paramArrayOfByte.bSd.replace("EmotionDetailInfo", "productID", (ContentValues)localObject) > 0L)
          ab.i("MicroMsg.emoji.EmotionDetailInfoStorage", "saveEmotionDetailResponseWithPID success. ProductId:%s", new Object[] { paramq });
        while (true)
        {
          this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
          AppMethodBeat.o(53129);
          break;
          ab.i("MicroMsg.emoji.EmotionDetailInfoStorage", "saveEmotionDetailResponseWithPID failed. ProductId:%s", new Object[] { paramq });
        }
      }
      catch (Exception paramq)
      {
        while (true)
          ab.e("MicroMsg.emoji.EmotionDetailInfoStorage", "saveEmotionRewardResponseWithPID exception:%s", new Object[] { bo.l(paramq) });
      }
    }
  }

  public final EmotionDetail bkz()
  {
    AppMethodBeat.i(53130);
    new EmotionDetail();
    EmotionDetail localEmotionDetail = ((GetEmotionDetailResponse)this.ehh.fsH.fsP).EmotionDetail;
    AppMethodBeat.o(53130);
    return localEmotionDetail;
  }

  public final int getType()
  {
    return 412;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.f.l
 * JD-Core Version:    0.6.2
 */