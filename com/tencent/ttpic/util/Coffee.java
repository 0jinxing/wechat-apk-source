package com.tencent.ttpic.util;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.IOUtils;
import com.tencent.ttpic.baseutils.LogUtils;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public class Coffee
{
  private static final String TAG = Coffee.class.getSimpleName();

  static
  {
    AppMethodBeat.i(50259);
    try
    {
      System.loadLibrary("pitu_tools");
      AppMethodBeat.o(50259);
      return;
    }
    catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
    {
      while (true)
      {
        LogUtils.e(localUnsatisfiedLinkError);
        AppMethodBeat.o(50259);
      }
    }
    catch (RuntimeException localRuntimeException)
    {
      while (true)
      {
        LogUtils.e(localRuntimeException);
        AppMethodBeat.o(50259);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        LogUtils.e(localException);
        AppMethodBeat.o(50259);
      }
    }
  }

  public static byte[] drink(byte[] paramArrayOfByte, String paramString)
  {
    AppMethodBeat.i(50257);
    LogUtils.v("Coffee", "drink(), sign = %s", new Object[] { paramString });
    paramArrayOfByte = nDrink(paramArrayOfByte, paramArrayOfByte.length, paramString);
    ByteArrayOutputStream localByteArrayOutputStream;
    if ((paramArrayOfByte[0] == 120) && (paramArrayOfByte[1] == -100))
    {
      paramString = new Inflater();
      localByteArrayOutputStream = new ByteArrayOutputStream();
    }
    while (true)
    {
      try
      {
        paramString.setInput(paramArrayOfByte, 0, paramArrayOfByte.length);
        paramArrayOfByte = new byte[1024];
        if (!paramString.finished())
        {
          localByteArrayOutputStream.write(paramArrayOfByte, 0, paramString.inflate(paramArrayOfByte));
          continue;
        }
      }
      catch (DataFormatException paramArrayOfByte)
      {
        paramString.end();
        paramArrayOfByte = localByteArrayOutputStream.toByteArray();
        AppMethodBeat.o(50257);
        return paramArrayOfByte;
        paramString.end();
        continue;
      }
      finally
      {
        paramString.end();
        AppMethodBeat.o(50257);
      }
      AppMethodBeat.o(50257);
    }
  }

  public static InputStream drinkACupOfCoffee(InputStream paramInputStream, boolean paramBoolean)
  {
    AppMethodBeat.i(50256);
    paramInputStream = IOUtils.toByteArray(paramInputStream);
    if (paramBoolean);
    for (paramInputStream = drink_ios(paramInputStream, getDefaultSign()); ; paramInputStream = drink(paramInputStream, getDefaultSign()))
    {
      paramInputStream = IOUtils.toInputStream(paramInputStream);
      AppMethodBeat.o(50256);
      return paramInputStream;
    }
  }

  public static byte[] drink_ios(byte[] paramArrayOfByte, String paramString)
  {
    AppMethodBeat.i(50258);
    LogUtils.v("Coffee", "drink(), sign = %s", new Object[] { paramString });
    paramArrayOfByte = nDrinkios(paramArrayOfByte, paramArrayOfByte.length, paramString);
    ByteArrayOutputStream localByteArrayOutputStream;
    if ((paramArrayOfByte[0] == 120) && (paramArrayOfByte[1] == -100))
    {
      paramString = new Inflater();
      localByteArrayOutputStream = new ByteArrayOutputStream();
    }
    while (true)
    {
      try
      {
        paramString.setInput(paramArrayOfByte, 0, paramArrayOfByte.length);
        paramArrayOfByte = new byte[1024];
        if (!paramString.finished())
        {
          localByteArrayOutputStream.write(paramArrayOfByte, 0, paramString.inflate(paramArrayOfByte));
          continue;
        }
      }
      catch (DataFormatException paramArrayOfByte)
      {
        paramString.end();
        paramArrayOfByte = localByteArrayOutputStream.toByteArray();
        AppMethodBeat.o(50258);
        return paramArrayOfByte;
        paramString.end();
        continue;
      }
      finally
      {
        paramString.end();
        AppMethodBeat.o(50258);
      }
      AppMethodBeat.o(50258);
    }
  }

  public static native String getDefaultSign();

  public static native boolean isSign(String paramString);

  private static native byte[] nDrink(byte[] paramArrayOfByte, int paramInt, String paramString);

  private static native byte[] nDrinkios(byte[] paramArrayOfByte, int paramInt, String paramString);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.util.Coffee
 * JD-Core Version:    0.6.2
 */