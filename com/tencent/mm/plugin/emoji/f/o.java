package com.tencent.mm.plugin.emoji.f;

import android.content.ContentValues;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.b;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.emoji.model.j;
import com.tencent.mm.protocal.protobuf.GetEmotionRewardRequest;
import com.tencent.mm.protocal.protobuf.GetEmotionRewardResponse;
import com.tencent.mm.protocal.protobuf.yi;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.at;
import com.tencent.mm.storage.emotion.l;
import com.tencent.mm.storage.emotion.n;
import java.io.IOException;

public final class o extends m
  implements com.tencent.mm.network.k
{
  public static int kWX = 0;
  public static int kWY = 1;
  public static int kWZ = 1;
  public static int kXa = 2;
  public static int kXb = 256;
  private final b ehh;
  private f ehi;
  private String kWl;
  private int kXc;

  public o(String paramString, int paramInt)
  {
    AppMethodBeat.i(53140);
    b.a locala = new b.a();
    locala.fsJ = new GetEmotionRewardRequest();
    locala.fsK = new GetEmotionRewardResponse();
    locala.uri = "/cgi-bin/micromsg-bin/mmgetemotionreward";
    locala.fsI = 822;
    locala.fsL = 0;
    locala.fsM = 0;
    this.ehh = locala.acD();
    this.kWl = paramString;
    this.kXc = paramInt;
    AppMethodBeat.o(53140);
  }

  public final int a(com.tencent.mm.network.e parame, f paramf)
  {
    AppMethodBeat.i(53142);
    this.ehi = paramf;
    paramf = (GetEmotionRewardRequest)this.ehh.fsG.fsP;
    paramf.ProductID = this.kWl;
    paramf.OpCode = this.kXc;
    int i = a(parame, this.ehh, this);
    AppMethodBeat.o(53142);
    return i;
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(53141);
    ab.i("MicroMsg.emoji.NetSceneGetEmotionReward", "errType:%d, errCode:%d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3) });
    Object localObject;
    if ((paramInt2 == 0) && (paramInt3 == 0))
      if (this.kXc == kWX)
      {
        paramq = j.getEmojiStorageMgr().xYs;
        paramArrayOfByte = this.kWl;
        localObject = bkD();
        if ((bo.isNullOrNil(paramArrayOfByte)) || (localObject == null))
          ab.w("MicroMsg.emoji.EmotionRewardInfoStorage", "saveEmotionRewardResponseWithPID failed. productId or response is null.");
      }
      else
      {
        if ((bkD() == null) || (bkD().Reward == null))
          break label286;
        j.getEmojiStorageMgr().xYu.eu(this.kWl, bkD().Reward.vEq);
        j.bkm().ca(this.kWl, bkD().Reward.vEq);
      }
    while (true)
    {
      while (true)
      {
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
        AppMethodBeat.o(53141);
        return;
        try
        {
          com.tencent.mm.storage.emotion.k localk = new com/tencent/mm/storage/emotion/k;
          localk.<init>();
          localk.field_productID = paramArrayOfByte;
          localk.field_content = ((GetEmotionRewardResponse)localObject).toByteArray();
          localObject = localk.Hl();
          if (paramq.bSd.replace("EmotionRewardInfo", "productID", (ContentValues)localObject) <= 0L)
            break label267;
          ab.i("MicroMsg.emoji.EmotionRewardInfoStorage", "saveEmotionRewardResponseWithPID success. ProductId:%s", new Object[] { paramArrayOfByte });
        }
        catch (IOException paramq)
        {
          ab.e("MicroMsg.emoji.EmotionRewardInfoStorage", "saveEmotionRewardResponseWithPID exception:%s", new Object[] { bo.l(paramq) });
        }
      }
      break;
      label267: ab.i("MicroMsg.emoji.EmotionRewardInfoStorage", "saveEmotionRewardResponseWithPID failed. ProductId:%s", new Object[] { paramArrayOfByte });
      break;
      label286: ab.i("MicroMsg.emoji.NetSceneGetEmotionReward", "getEmotionRewardRespone is null. so i think no such product reward information");
      j.getEmojiStorageMgr().xYu.eu(this.kWl, kXb);
      j.bkm().ca(this.kWl, kXb);
      continue;
      if (paramInt3 == 1)
      {
        j.getEmojiStorageMgr().xYu.eu(this.kWl, kXb);
        j.bkm().ca(this.kWl, kXb);
      }
    }
  }

  public final GetEmotionRewardResponse bkD()
  {
    return (GetEmotionRewardResponse)this.ehh.fsH.fsP;
  }

  public final int getType()
  {
    return 822;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.emoji.f.o
 * JD-Core Version:    0.6.2
 */