package com.tencent.mm.plugin.d.a.b.a;

import com.tencent.mm.plugin.exdevice.j.b;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.Serializable;

public abstract class a
  implements Serializable
{
  private static final String TAG = a.class.getName();
  public long jGw;
  public String jHc;
  public int jHd;

  public static a at(byte[] paramArrayOfByte)
  {
    if ((paramArrayOfByte == null) || (paramArrayOfByte.length <= 0))
    {
      ab.e(TAG, "data input error");
      paramArrayOfByte = null;
    }
    while (true)
    {
      return paramArrayOfByte;
      paramArrayOfByte = b.aQ(paramArrayOfByte);
      if ((paramArrayOfByte != null) && ((paramArrayOfByte instanceof a)))
      {
        paramArrayOfByte = (a)paramArrayOfByte;
      }
      else
      {
        ab.e(TAG, "bytes2object is not instanceof BaseProfileParser");
        paramArrayOfByte = null;
      }
    }
  }

  public abstract byte[] aVE();
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.b.a.a
 * JD-Core Version:    0.6.2
 */