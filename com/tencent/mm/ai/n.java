package com.tencent.mm.ai;

import com.tencent.mm.model.ax;
import com.tencent.mm.network.k;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.protobuf.ato;
import com.tencent.mm.protocal.protobuf.bdu;
import com.tencent.mm.protocal.protobuf.lm;
import com.tencent.mm.sdk.platformtools.ab;

public abstract class n extends m
  implements k
{
  protected int ftx = 3;
  private boolean fty = false;

  public final void a(int paramInt1, int paramInt2, int paramInt3, String paramString, q paramq, byte[] paramArrayOfByte)
  {
    if ((paramInt2 == 4) && (paramInt3 == -301))
    {
      ab.i("MicroMsg.NetSceneIDCRedirectBase", "alvinluo NetScene pre process MM_ERR_IDC_REDIRECT redirectCount: %d", new Object[] { Integer.valueOf(this.ftx) });
      if (paramq != null)
      {
        ab.i("MicroMsg.NetSceneIDCRedirectBase", "update idc info");
        ax.a(true, c(paramq), d(paramq), e(paramq));
      }
      this.ftx -= 1;
      if (this.ftx <= 0)
      {
        acP();
        this.fty = false;
      }
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.NetSceneIDCRedirectBase", "redirect IDC");
      a(this.ftf, acQ());
      continue;
      a(paramInt2, paramInt3, paramString, paramq);
    }
  }

  public abstract void a(int paramInt1, int paramInt2, String paramString, q paramq);

  public abstract void acP();

  public abstract f acQ();

  public abstract lm c(q paramq);

  public abstract bdu d(q paramq);

  public abstract ato e(q paramq);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ai.n
 * JD-Core Version:    0.6.2
 */