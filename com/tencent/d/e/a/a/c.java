package com.tencent.d.e.a.a;

public abstract class c
  implements Runnable
{
  public abstract void dQt();

  public abstract void dQu();

  public void run()
  {
    try
    {
      dQt();
      return;
    }
    catch (Throwable localThrowable)
    {
      while (true)
        dQu();
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.d.e.a.a.c
 * JD-Core Version:    0.6.2
 */