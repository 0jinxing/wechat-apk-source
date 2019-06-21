package com.tencent.mm.wallet_core.c;

import android.os.Bundle;
import com.tencent.mm.ai.m;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.at;

public abstract class u extends m
  implements k
{
  public String eHT = "";
  public int gOW = 0;
  public long hbj = 0L;
  private int lqy = 0;
  public Bundle mBundle;
  private long tRk;

  public final int a(e parame, q paramq, k paramk)
  {
    this.tRk = System.currentTimeMillis();
    return super.a(parame, paramq, paramk);
  }

  public void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    long l1 = System.currentTimeMillis() - this.tRk;
    Object localObject = "";
    paramArrayOfByte = "";
    this.lqy = bLE();
    long l2 = System.currentTimeMillis();
    if (this.mBundle != null)
    {
      String str1 = this.mBundle.getString("key_TransId");
      String str2 = this.mBundle.getString("key_reqKey");
      if (this.hbj == 0L)
        this.hbj = this.mBundle.getLong("key_SessionId", 0L);
      paramArrayOfByte = str2;
      localObject = str1;
      if (this.gOW == 0)
      {
        this.gOW = this.mBundle.getInt("key_scene");
        localObject = str1;
        paramArrayOfByte = str2;
      }
    }
    h.pYm.e(11170, new Object[] { Integer.valueOf(getType()), Integer.valueOf(this.lqy), Long.valueOf(l1), Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), Integer.valueOf(at.getNetType(ah.getContext())), this.eHT, localObject, paramArrayOfByte, Long.valueOf(this.hbj), Long.valueOf(l2) });
    z.a(getType(), bLE(), paramInt2, paramInt3, l1, this.gOW, this.eHT);
    e(paramInt2, paramInt3, paramString, paramq);
  }

  public int bLE()
  {
    return -1;
  }

  public abstract void e(int paramInt1, int paramInt2, String paramString, q paramq);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.wallet_core.c.u
 * JD-Core Version:    0.6.2
 */