package com.tencent.mrs.a;

import com.tencent.matrix.mrs.core.MatrixReport;
import com.tencent.mm.ai.b.a;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.kernel.g;
import com.tencent.mm.network.c;
import com.tencent.mm.network.e;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.ads;
import com.tencent.mm.protocal.protobuf.adt;
import com.tencent.mm.protocal.protobuf.af;
import com.tencent.mm.protocal.protobuf.ag;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;

public final class b extends m
  implements k
{
  private static boolean isRunning = false;
  private static Object lock = new Object();
  private com.tencent.mm.ai.b ehh;
  private f ehi;
  private ads pXt = null;

  public b(byte[] paramArrayOfByte)
  {
    setIsRunning(true);
    af localaf = new af();
    this.pXt = new ads();
    try
    {
      localaf.parseFrom(paramArrayOfByte);
      this.pXt.wlS = localaf;
      return;
    }
    catch (Exception paramArrayOfByte)
    {
      while (true)
      {
        ab.e("Matrix.NetSceneGetMrsStrategy", "parse data error");
        g.RQ();
        g.RS().aa(new Runnable()
        {
          public final void run()
          {
            MatrixReport.with().onStrategyResp(3, -1, null);
          }
        });
      }
    }
  }

  public static boolean isRunning()
  {
    synchronized (lock)
    {
      boolean bool = isRunning;
      return bool;
    }
  }

  private static void setIsRunning(boolean paramBoolean)
  {
    synchronized (lock)
    {
      isRunning = paramBoolean;
      return;
    }
  }

  public final int a(e parame, f paramf)
  {
    int i = -1;
    this.ehi = paramf;
    int j;
    if ((parame != null) && (parame.adg() != null) && (parame.adg().adb()))
    {
      j = 1;
      if (j != 0)
        break label61;
      ab.w("Matrix.NetSceneGetMrsStrategy", "get mrs strategy must go after login");
      j = i;
    }
    while (true)
    {
      return j;
      j = 0;
      break;
      label61: paramf = new b.a();
      paramf.fsN = false;
      paramf.fsJ = this.pXt;
      paramf.fsK = new adt();
      paramf.uri = "/cgi-bin/micromsg-bin/getapmstrategy";
      paramf.fsI = 914;
      this.ehh = paramf.acD();
      i = a(parame, this.ehh, this);
      j = i;
      if (i < 0)
      {
        ab.i("Matrix.NetSceneGetMrsStrategy", "mark all failed. do scene %d", new Object[] { Integer.valueOf(i) });
        try
        {
          MatrixReport.with().onStrategyResp(3, -1, null);
          setIsRunning(false);
          j = i;
        }
        catch (Exception parame)
        {
          ab.e("Matrix.NetSceneGetMrsStrategy", "onStrategyResp failed  hash:%d  , ex:%s", new Object[] { Integer.valueOf(hashCode()), bo.l(parame) });
          j = i;
        }
      }
    }
  }

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    try
    {
      if ((g.RO().eJo == null) || (g.RO().eJo.ftA == null))
      {
        ab.f("Matrix.NetSceneGetMrsStrategy", "null == network().getNetSceneQueue().getDispatcher(), can't give response to kvcomm.");
        this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
      }
      while (true)
      {
        return;
        if (paramInt2 != 0)
        {
          paramq = new java/lang/StringBuilder;
          paramq.<init>("get report strategy err, errType:");
          ab.e("Matrix.NetSceneGetMrsStrategy", paramInt2 + ", errCode:" + paramInt3);
          MatrixReport.with().onStrategyResp(paramInt2, paramInt3, null);
          this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
          setIsRunning(false);
        }
        else
        {
          ab.d("Matrix.NetSceneGetMrsStrategy", "get report strategy ok");
          paramq = (adt)this.ehh.fsH.fsP;
          try
          {
            MatrixReport.with().onStrategyResp(0, 0, paramq.wlT.toByteArray());
            this.ehi.onSceneEnd(paramInt2, paramInt3, paramString, this);
          }
          catch (Exception paramq)
          {
            while (true)
              ab.e("Matrix.NetSceneGetMrsStrategy", "failed  hash:%d  , ex:%s", new Object[] { Integer.valueOf(hashCode()), bo.l(paramq) });
          }
        }
      }
    }
    finally
    {
      setIsRunning(false);
    }
    throw paramString;
  }

  public final int getType()
  {
    return 914;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mrs.a.b
 * JD-Core Version:    0.6.2
 */