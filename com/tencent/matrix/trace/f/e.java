package com.tencent.matrix.trace.f;

public abstract class e extends com.tencent.matrix.trace.e.c
{
  private volatile boolean bYT = false;
  volatile boolean caA;

  public void onForeground(boolean paramBoolean)
  {
    this.caA = paramBoolean;
  }

  protected void zC()
  {
    com.tencent.matrix.d.c.i("Matrix.Tracer", "[onAlive] %s", new Object[] { getClass().getName() });
  }

  protected void zD()
  {
    com.tencent.matrix.d.c.i("Matrix.Tracer", "[onDead] %s", new Object[] { getClass().getName() });
  }

  public final void zE()
  {
    try
    {
      if (!this.bYT)
      {
        this.bYT = true;
        zC();
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final void zF()
  {
    try
    {
      if (this.bYT)
      {
        this.bYT = false;
        zD();
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
 * Qualified Name:     com.tencent.matrix.trace.f.e
 * JD-Core Version:    0.6.2
 */