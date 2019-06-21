package com.tencent.matrix.a;

import android.app.Application;
import com.tencent.matrix.b.b;
import com.tencent.matrix.d.d;

public final class a extends b
{
  public final com.tencent.matrix.a.a.a bUD;
  private com.tencent.matrix.a.b.c bUE;
  private boolean bUF;

  public final void destroy()
  {
    super.destroy();
  }

  public final String getTag()
  {
    return "battery";
  }

  public final void init(Application paramApplication, com.tencent.matrix.b.c paramc)
  {
    super.init(paramApplication, paramc);
    com.tencent.matrix.a.c.a.setPackageName(paramApplication);
    com.tencent.matrix.a.c.a.ce(d.aD(paramApplication));
    this.bUE = new com.tencent.matrix.a.b.c(this);
  }

  public final void onForeground(boolean paramBoolean)
  {
    try
    {
      com.tencent.matrix.d.c.i("Matrix.BatteryCanaryPlugin", "onForeground:".concat(String.valueOf(paramBoolean)), new Object[0]);
      super.onForeground(paramBoolean);
      if ((paramBoolean) && (isPluginStarted()))
      {
        this.bUF = true;
        super.stop();
        this.bUE.stop();
      }
      while (true)
      {
        return;
        if ((!paramBoolean) && (isPluginStoped()) && (this.bUF))
        {
          super.start();
          this.bUE.start();
        }
      }
    }
    finally
    {
    }
  }

  public final void start()
  {
    try
    {
      if ((!isPluginStarted()) && (!this.bUF))
      {
        super.start();
        this.bUE.start();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void stop()
  {
    try
    {
      this.bUF = false;
      if (isPluginStarted())
      {
        super.stop();
        this.bUE.stop();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.matrix.a.a
 * JD-Core Version:    0.6.2
 */