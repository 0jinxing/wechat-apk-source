package com.tencent.mm.plugin.ipcall.a.a;

import com.tencent.mm.ai.f;
import com.tencent.mm.ai.m;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.sdk.platformtools.ab;

public abstract class a
  implements f
{
  protected int errCode = 0;
  protected int errType = 0;
  protected c nvN;
  protected a.a nwr;

  public final void a(a.a parama)
  {
    this.nwr = parama;
  }

  public void a(c paramc)
  {
    ab.d("MicroMsg.BaseIPCallService", "start service, type: %d", new Object[] { Integer.valueOf(getServiceType()) });
    this.nvN = paramc;
    b(this.nvN);
  }

  public abstract void b(c paramc);

  public abstract int[] bHC();

  public void destroy()
  {
    for (int k : bHC())
      aw.Rg().b(k, this);
    this.nwr = null;
    onDestroy();
  }

  public abstract int getServiceType();

  public void init()
  {
    for (int k : bHC())
      aw.Rg().a(k, this);
    wO();
  }

  public abstract void onDestroy();

  public void onSceneEnd(int paramInt1, int paramInt2, String paramString, m paramm)
  {
    ab.d("MicroMsg.BaseIPCallService", "onSceneEnd, errType: %d, errCode: %d, scene.getType: %d, serviceType: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Integer.valueOf(paramm.getType()), Integer.valueOf(getServiceType()) });
    this.errType = paramInt1;
    this.errCode = paramInt2;
    if ((paramInt1 == 0) && (paramInt2 == 0))
      if (this.nwr != null)
        this.nwr.a(getServiceType(), paramm, paramInt1, paramInt2);
    while (true)
    {
      return;
      if (this.nwr != null)
        this.nwr.b(getServiceType(), paramm, paramInt1, paramInt2);
    }
  }

  public abstract void wO();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.a.a
 * JD-Core Version:    0.6.2
 */