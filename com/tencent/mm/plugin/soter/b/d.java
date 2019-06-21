package com.tencent.mm.plugin.soter.b;

import com.tencent.mm.ai.m;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.sdk.platformtools.ab;

public abstract class d extends m
  implements k
{
  private h rNG;

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    int i = 1;
    ab.i("MicroMsg.NetSceneSoterBase", "onGYNetEnd errType: %d, errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt3), paramString });
    this.rNG = new h(new d.a(this, (byte)0));
    this.rNG.rNJ = -3202;
    paramArrayOfByte = this.rNG;
    if ((paramInt2 == 4) && (paramInt3 == -3200))
    {
      com.tencent.soter.a.a.a(new h.1(paramArrayOfByte), true, new f());
      paramInt1 = i;
    }
    while (true)
    {
      if (paramInt1 == 0)
        d(paramInt2, paramInt3, paramString, paramq);
      return;
      if ((paramInt2 == 4) && (paramInt3 == paramArrayOfByte.rNJ))
      {
        paramInt1 = i;
        if (paramArrayOfByte.rNI != null)
        {
          paramArrayOfByte.rNI.cvF();
          paramInt1 = i;
        }
      }
      else
      {
        paramInt1 = 0;
      }
    }
  }

  public abstract void bxO();

  public abstract void d(int paramInt1, int paramInt2, String paramString, q paramq);

  public abstract void vL(int paramInt);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.soter.b.d
 * JD-Core Version:    0.6.2
 */