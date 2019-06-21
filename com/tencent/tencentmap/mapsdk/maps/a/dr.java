package com.tencent.tencentmap.mapsdk.maps.a;

import android.text.TextUtils;

public abstract class dr
{
  private dr.a a;

  public dr(String paramString)
  {
    if (bt.b());
    for (String str = "_test_"; ; str = "_")
    {
      paramString = "halley_schedule_" + bt.c() + str + bt.i() + "_" + paramString + ".db";
      this.a = new dr.a(this, bt.a(), paramString, null, 1);
      return;
    }
  }

  public final void a(String paramString, byte[] paramArrayOfByte)
  {
    try
    {
      if ((!TextUtils.isEmpty(paramString)) && (paramArrayOfByte != null))
        this.a.a(paramString, paramArrayOfByte);
      return;
    }
    finally
    {
    }
    throw paramString;
  }

  public final byte[] a(String paramString)
  {
    try
    {
      paramString = this.a.a(paramString);
      return paramString;
    }
    finally
    {
      paramString = finally;
    }
    throw paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.maps.a.dr
 * JD-Core Version:    0.6.2
 */