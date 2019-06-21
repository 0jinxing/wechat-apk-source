package com.tencent.mm.plugin.ipcall.a.a;

import android.os.Looper;
import com.tencent.mm.ai.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;

public abstract class b extends a
  implements a.a
{
  protected boolean fVc = false;
  private ak mHandler = new ak(Looper.getMainLooper());
  public b.a nws = null;

  public final void a(int paramInt1, Object paramObject, int paramInt2, int paramInt3)
  {
    ab.i("MicroMsg.BaseIPCallTimerService", "timer request success!, type: %d, isLoop: %b, interval: %d", new Object[] { Integer.valueOf(paramInt1), Boolean.valueOf(this.fVc), Integer.valueOf(bHD()) });
    bHE();
    if (this.nws != null)
      this.nws.a(paramInt1, (m)paramObject, paramInt2, paramInt3);
    if (this.fVc)
      this.mHandler.postDelayed(new b.1(this), bHD());
  }

  public final void a(c paramc)
  {
    super.a(paramc);
    this.fVc = true;
    ab.d("MicroMsg.BaseIPCallTimerService", "start service, type: %d", new Object[] { Integer.valueOf(getServiceType()) });
  }

  public final void b(int paramInt1, Object paramObject, int paramInt2, int paramInt3)
  {
    ab.i("MicroMsg.BaseIPCallTimerService", "timer request failed, type: %d, isLoop: %b, interval: %d", new Object[] { Integer.valueOf(paramInt1), Boolean.valueOf(this.fVc), Integer.valueOf(bHD()) });
    bHF();
    if (this.nws != null)
      this.nws.b(paramInt1, (m)paramObject, paramInt2, paramInt3);
    if (this.fVc)
      this.mHandler.postDelayed(new b.2(this), bHD());
  }

  public abstract void b(c paramc);

  public abstract int bHD();

  public abstract void bHE();

  public abstract void bHF();

  public final void destroy()
  {
    super.destroy();
  }

  public final void init()
  {
    a(this);
    super.init();
  }

  public abstract void onStop();

  public final void stop()
  {
    this.fVc = false;
    onStop();
    ab.d("MicroMsg.BaseIPCallTimerService", "stop service, type: %d", new Object[] { Integer.valueOf(getServiceType()) });
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.a.a.b
 * JD-Core Version:    0.6.2
 */