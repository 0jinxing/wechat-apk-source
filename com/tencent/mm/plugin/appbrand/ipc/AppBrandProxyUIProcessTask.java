package com.tencent.mm.plugin.appbrand.ipc;

import android.content.Intent;
import android.content.res.Resources;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;

public abstract class AppBrandProxyUIProcessTask
  implements MMActivity.a
{
  public b hvt;

  protected static String getString(int paramInt)
  {
    return ah.getResources().getString(paramInt);
  }

  protected abstract void a(AppBrandProxyUIProcessTask.ProcessRequest paramProcessRequest);

  public final void a(AppBrandProxyUIProcessTask.ProcessResult paramProcessResult)
  {
    paramProcessResult = new AppBrandProxyUIProcessTask.1(this, paramProcessResult);
    if (this.hvt == null);
    while (true)
    {
      return;
      this.hvt.runOnUiThread(paramProcessResult);
    }
  }

  public final MMActivity aBQ()
  {
    return this.hvt.aBQ();
  }

  protected void aBX()
  {
  }

  public void c(int paramInt1, int paramInt2, Intent paramIntent)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ipc.AppBrandProxyUIProcessTask
 * JD-Core Version:    0.6.2
 */