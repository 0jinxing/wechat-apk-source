package com.tencent.mm.plugin.soter.c;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.v7.app.b;
import com.tencent.mm.plugin.soter.d.j;
import com.tencent.mm.plugin.soter.d.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.soter.a.f.e;
import java.lang.ref.WeakReference;

public abstract class c
{
  public int gOW = -1;
  protected Handler handler = null;
  protected WeakReference<Activity> hiC = null;
  protected j rOa = null;
  protected k rOb = null;
  public e rOc = null;
  public e rOd = null;
  public c.a rOe = null;

  public c(WeakReference<Activity> paramWeakReference, j paramj, k paramk, Handler paramHandler)
  {
    this.rOa = paramj;
    this.rOb = paramk;
    this.hiC = paramWeakReference;
    this.handler = paramHandler;
  }

  protected final void G(String[] paramArrayOfString)
  {
    if (this.handler != null)
    {
      Message localMessage = this.handler.obtainMessage(3);
      Bundle localBundle = new Bundle();
      localBundle.putStringArray("permissions", paramArrayOfString);
      localBundle.putInt("request_code", 0);
      localMessage.setData(localBundle);
      localMessage.sendToTarget();
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.SoterMpBaseController", "hy: handler not bind");
    }
  }

  protected final void a(b paramb)
  {
    if (paramb == null)
      ab.e("MicroMsg.SoterMpBaseController", "hy: dialog is null.");
    while (true)
    {
      return;
      if (this.handler != null)
      {
        cvJ();
        this.handler.obtainMessage(6, paramb).sendToTarget();
      }
      else
      {
        ab.e("MicroMsg.SoterMpBaseController", "hy: handler not bind");
      }
    }
  }

  protected final void cvI()
  {
    if (this.handler != null)
      this.handler.obtainMessage(4).sendToTarget();
    while (true)
    {
      return;
      ab.e("MicroMsg.SoterMpBaseController", "hy: handler not bind");
    }
  }

  protected final void cvJ()
  {
    if (this.handler != null)
      this.handler.obtainMessage(5).sendToTarget();
    while (true)
    {
      return;
      ab.e("MicroMsg.SoterMpBaseController", "hy: handler not bind");
    }
  }

  protected final void cvK()
  {
    if (this.handler != null)
    {
      cvJ();
      this.handler.obtainMessage(0, this.rOb).sendToTarget();
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.SoterMpBaseController", "hy: handler not bind");
    }
  }

  protected final void cvL()
  {
    if (this.handler != null)
    {
      cvJ();
      this.handler.obtainMessage(1, this.rOb).sendToTarget();
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.SoterMpBaseController", "hy: handler not bind");
    }
  }

  protected final void cvM()
  {
    if (this.handler != null)
    {
      cvJ();
      this.handler.obtainMessage(2, this.rOb).sendToTarget();
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.SoterMpBaseController", "hy: handler not bind");
    }
  }

  public abstract void fj();

  public abstract void onPause();

  public abstract void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt);

  public abstract void onResume();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.soter.c.c
 * JD-Core Version:    0.6.2
 */