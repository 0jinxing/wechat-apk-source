package com.tencent.mm.loader.e;

import com.tencent.mm.loader.d.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public final class d
  implements c
{
  public static byte[] a(InputStream paramInputStream, boolean paramBoolean)
  {
    byte[] arrayOfByte = new byte[1024];
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    while (true)
    {
      int i = paramInputStream.read(arrayOfByte);
      if (i == -1)
        break;
      localByteArrayOutputStream.write(arrayOfByte, 0, i);
    }
    arrayOfByte = localByteArrayOutputStream.toByteArray();
    localByteArrayOutputStream.close();
    if (!paramBoolean)
      paramInputStream.close();
    return arrayOfByte;
  }

  public final boolean b(String paramString, InputStream paramInputStream)
  {
    boolean bool = false;
    if (paramInputStream == null)
      ab.w("MicroMsg.Loader.DefaultImageMD5CheckListener", "hy: inputStream is null. check failed");
    while (true)
    {
      return bool;
      if (bo.isNullOrNil(paramString))
        ab.w("MicroMsg.Loader.DefaultImageMD5CheckListener", "hy: target md5 is null or nill. check failed");
      else
        try
        {
          paramInputStream = ag.w(a(paramInputStream, true));
          if ((!bo.isNullOrNil(paramInputStream)) && (paramInputStream.equals(paramString)))
          {
            ab.i("MicroMsg.Loader.DefaultImageMD5CheckListener", "hy: md5 check success");
            bool = true;
          }
          else
          {
            ab.w("MicroMsg.Loader.DefaultImageMD5CheckListener", "hy: md5 check failed. original is %s, target is %s", new Object[] { paramInputStream, paramString });
          }
        }
        catch (Exception paramString)
        {
          ab.w("MicroMsg.Loader.DefaultImageMD5CheckListener", "hy: exception: " + paramString.toString());
        }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.loader.e.d
 * JD-Core Version:    0.6.2
 */