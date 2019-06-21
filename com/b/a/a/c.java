package com.b.a.a;

import android.os.Handler;

abstract class c extends d
{
  private boolean bCL;

  void a(Handler paramHandler, d.a parama)
  {
    try
    {
      this.bCL = false;
      super.a(paramHandler, parama);
      return;
    }
    finally
    {
      paramHandler = finally;
    }
    throw paramHandler;
  }

  final void aV(boolean paramBoolean)
  {
    try
    {
      if ((this.bCL ^ paramBoolean))
      {
        this.bCL = paramBoolean;
        if (!this.bCL)
          break label30;
        vW();
      }
      while (true)
      {
        return;
        label30: vX();
      }
    }
    finally
    {
    }
  }

  abstract void vW();

  abstract void vX();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.b.a.a.c
 * JD-Core Version:    0.6.2
 */