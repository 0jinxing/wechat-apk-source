package com.tencent.tencentmap.mapsdk.a;

public abstract class b
{
  public static boolean a = true;
  private static b b;

  public static b a()
  {
    try
    {
      if (b == null)
      {
        localObject1 = new com/tencent/tencentmap/mapsdk/a/b$a;
        ((b.a)localObject1).<init>();
        b = (b)localObject1;
      }
      Object localObject1 = b;
      return localObject1;
    }
    finally
    {
    }
  }

  public abstract void a(int paramInt);

  public abstract void a(int paramInt, Runnable paramRunnable, long paramLong1, long paramLong2);

  public abstract void a(Runnable paramRunnable);

  public abstract void a(Runnable paramRunnable, long paramLong);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.b
 * JD-Core Version:    0.6.2
 */