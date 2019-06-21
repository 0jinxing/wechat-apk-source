package com.tencent.tencentmap.mapsdk.maps.a;

import android.content.Context;
import com.tencent.tencentmap.mapsdk.a.c;
import com.tencent.tencentmap.mapsdk.a.e;

public abstract class az
{
  protected final int a;
  protected final int b;
  protected Context c;
  protected String d;

  public az(Context paramContext, int paramInt1, int paramInt2)
  {
    this.c = paramContext;
    this.a = paramInt2;
    this.b = paramInt1;
  }

  public static aa a(int paramInt, byte[] paramArrayOfByte)
  {
    try
    {
      paramArrayOfByte = e.a(paramInt, c.m(), paramArrayOfByte, 2, 3);
      return paramArrayOfByte;
    }
    catch (Throwable paramArrayOfByte)
    {
      while (true)
      {
        ag.c("imposiable comStrategy error:%s", new Object[] { paramArrayOfByte.toString() });
        ag.a(paramArrayOfByte);
        paramArrayOfByte = null;
      }
    }
  }

  public abstract aa a();

  public void b()
  {
    ag.c("encode failed, clear db data", new Object[0]);
  }

  public abstract void b(boolean paramBoolean);

  public final int c()
  {
    return this.a;
  }

  public final String d()
  {
    try
    {
      String str = this.d;
      return str;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final String e()
  {
    try
    {
      if (this.b == 0);
      for (String str = t.a(this.c).e().b(); ; str = t.a(this.c).e().b(this.b).b())
        return str;
    }
    catch (Throwable localThrowable)
    {
      while (true)
      {
        ag.c("imposiable comStrategy error:%s", new Object[] { localThrowable.toString() });
        ag.a(localThrowable);
        Object localObject = null;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.az
 * JD-Core Version:    0.6.2
 */