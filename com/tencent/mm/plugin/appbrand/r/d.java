package com.tencent.mm.plugin.appbrand.r;

import android.content.Context;
import android.content.res.AssetManager;
import android.webkit.URLUtil;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StringWriter;
import java.nio.ByteBuffer;

public final class d
{
  public static String Eb(String paramString)
  {
    AppMethodBeat.i(91138);
    Object localObject1 = ah.getContext().getAssets();
    Object localObject2 = null;
    try
    {
      localObject1 = ((AssetManager)localObject1).open(paramString);
      paramString = (String)localObject1;
      if (paramString == null)
      {
        paramString = "";
        AppMethodBeat.o(91138);
        return paramString;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.AppBrandIOUtil", "openRead file( %s ) failed, exp = %s", new Object[] { paramString, bo.l(localException) });
        paramString = localObject2;
        continue;
        paramString = convertStreamToString(paramString);
        AppMethodBeat.o(91138);
      }
    }
  }

  public static byte[] Ec(String paramString)
  {
    AppMethodBeat.i(91139);
    Object localObject1 = ah.getContext().getAssets();
    Object localObject2 = null;
    try
    {
      localObject1 = ((AssetManager)localObject1).open(paramString);
      paramString = (String)localObject1;
      if (paramString == null)
      {
        paramString = new byte[0];
        AppMethodBeat.o(91139);
        return paramString;
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.AppBrandIOUtil", "openRead file( %s ) failed, exp = %s", new Object[] { paramString, bo.l(localException) });
        paramString = localObject2;
        continue;
        paramString = k(paramString);
        AppMethodBeat.o(91139);
      }
    }
  }

  public static boolean Ed(String paramString)
  {
    AppMethodBeat.i(91141);
    boolean bool;
    if ((!bo.isNullOrNil(paramString)) && ((URLUtil.isHttpsUrl(paramString)) || (URLUtil.isHttpUrl(paramString))))
    {
      bool = true;
      AppMethodBeat.o(91141);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(91141);
    }
  }

  public static String convertStreamToString(InputStream paramInputStream)
  {
    AppMethodBeat.i(91137);
    InputStreamReader localInputStreamReader = new InputStreamReader(paramInputStream);
    char[] arrayOfChar = new char[4096];
    StringWriter localStringWriter = new StringWriter();
    try
    {
      while (true)
      {
        int i = localInputStreamReader.read(arrayOfChar);
        if (-1 == i)
          break;
        localStringWriter.write(arrayOfChar, 0, i);
      }
    }
    catch (Exception localException)
    {
      ab.e("MicroMsg.AppBrandIOUtil", "convertStreamToString: read, %s", new Object[] { localException.getMessage() });
      String str = "";
      bo.b(localInputStreamReader);
      bo.b(paramInputStream);
      AppMethodBeat.o(91137);
      paramInputStream = str;
      while (true)
      {
        return paramInputStream;
        bo.b(localInputStreamReader);
        bo.b(paramInputStream);
        paramInputStream = str.toString();
        AppMethodBeat.o(91137);
      }
    }
    finally
    {
      bo.b(localInputStreamReader);
      bo.b(paramInputStream);
      AppMethodBeat.o(91137);
    }
  }

  public static byte[] k(InputStream paramInputStream)
  {
    AppMethodBeat.i(91140);
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    byte[] arrayOfByte2 = new byte[4096];
    try
    {
      while (true)
      {
        int i = paramInputStream.read(arrayOfByte2, 0, 4096);
        if (i == -1)
          break;
        localByteArrayOutputStream.write(arrayOfByte2, 0, i);
      }
    }
    catch (Exception localException)
    {
      localException = localException;
      ab.e("MicroMsg.AppBrandIOUtil", "readPkgCertificate: ".concat(String.valueOf(localException)));
      byte[] arrayOfByte1 = new byte[0];
      try
      {
        paramInputStream.close();
        AppMethodBeat.o(91140);
        paramInputStream = arrayOfByte1;
        while (true)
        {
          return paramInputStream;
          arrayOfByte1.flush();
          try
          {
            paramInputStream.close();
            paramInputStream = arrayOfByte1.toByteArray();
            AppMethodBeat.o(91140);
          }
          catch (Exception paramInputStream)
          {
            while (true)
              ab.e("MicroMsg.AppBrandIOUtil", "close: ".concat(String.valueOf(paramInputStream)));
          }
        }
      }
      catch (Exception paramInputStream)
      {
        while (true)
          ab.e("MicroMsg.AppBrandIOUtil", "close: ".concat(String.valueOf(paramInputStream)));
      }
    }
    finally
    {
    }
    try
    {
      paramInputStream.close();
      AppMethodBeat.o(91140);
      throw localObject;
    }
    catch (Exception paramInputStream)
    {
      while (true)
        ab.e("MicroMsg.AppBrandIOUtil", "close: ".concat(String.valueOf(paramInputStream)));
    }
  }

  public static byte[] q(ByteBuffer paramByteBuffer)
  {
    AppMethodBeat.i(91142);
    if (paramByteBuffer == null)
    {
      paramByteBuffer = new byte[0];
      AppMethodBeat.o(91142);
    }
    while (true)
    {
      return paramByteBuffer;
      if (!paramByteBuffer.isDirect())
      {
        paramByteBuffer = paramByteBuffer.array();
        AppMethodBeat.o(91142);
      }
      else
      {
        int i = paramByteBuffer.position();
        paramByteBuffer.position(0);
        byte[] arrayOfByte = new byte[paramByteBuffer.remaining()];
        paramByteBuffer.get(arrayOfByte);
        paramByteBuffer.position(i);
        AppMethodBeat.o(91142);
        paramByteBuffer = arrayOfByte;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.r.d
 * JD-Core Version:    0.6.2
 */