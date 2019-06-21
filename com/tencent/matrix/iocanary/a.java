package com.tencent.matrix.iocanary;

import android.app.Application;
import com.tencent.matrix.b.b;
import com.tencent.matrix.b.c;
import com.tencent.matrix.iocanary.core.IOCanaryCore;

public final class a extends b
{
  private IOCanaryCore bWj;
  public final com.tencent.matrix.iocanary.a.a mIOConfig;

  public a(com.tencent.matrix.iocanary.a.a parama)
  {
    this.mIOConfig = parama;
  }

  public final void destroy()
  {
    super.destroy();
  }

  public final String getTag()
  {
    return "io";
  }

  public final void init(Application paramApplication, c paramc)
  {
    super.init(paramApplication, paramc);
    com.tencent.matrix.iocanary.c.a.setPackageName(paramApplication);
    this.bWj = new IOCanaryCore(this);
  }

  public final void start()
  {
    super.start();
    this.bWj.start();
  }

  public final void stop()
  {
    super.stop();
    this.bWj.stop();
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.iocanary.a
 * JD-Core Version:    0.6.2
 */