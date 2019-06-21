package com.google.android.gms.internal.auth;

import com.google.android.gms.common.server.response.FastSafeParcelableJsonResponse;
import java.io.UnsupportedEncodingException;

public abstract class zzbs extends FastSafeParcelableJsonResponse
{
  private static String zzhq = "AUTH";

  public byte[] toByteArray()
  {
    try
    {
      byte[] arrayOfByte = toString().getBytes("UTF-8");
      return arrayOfByte;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      while (true)
        Object localObject = null;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.google.android.gms.internal.auth.zzbs
 * JD-Core Version:    0.6.2
 */