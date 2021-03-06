package com.tencent.ttpic.device;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.ttpic.baseutils.LogUtils;

public class DeviceCoffee
{
  static
  {
    AppMethodBeat.i(49835);
    try
    {
      System.loadLibrary("pitu_device");
      AppMethodBeat.o(49835);
      return;
    }
    catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
    {
      while (true)
      {
        LogUtils.e(localUnsatisfiedLinkError);
        AppMethodBeat.o(49835);
      }
    }
    catch (RuntimeException localRuntimeException)
    {
      while (true)
      {
        LogUtils.e(localRuntimeException);
        AppMethodBeat.o(49835);
      }
    }
    catch (Exception localException)
    {
      while (true)
      {
        LogUtils.e(localException);
        AppMethodBeat.o(49835);
      }
    }
  }

  public static byte[] drink(byte[] paramArrayOfByte, String paramString1, String paramString2)
  {
    AppMethodBeat.i(49833);
    LogUtils.v("Coffee", "drink() deviceName = " + paramString1 + ", sign = " + paramString2);
    paramArrayOfByte = nDrink(paramArrayOfByte, paramArrayOfByte.length, paramString1, paramString2);
    AppMethodBeat.o(49833);
    return paramArrayOfByte;
  }

  public static byte[] drinkRawData(byte[] paramArrayOfByte, String paramString)
  {
    AppMethodBeat.i(49834);
    paramArrayOfByte = nDrinkRawData(paramArrayOfByte, paramArrayOfByte.length, paramString);
    AppMethodBeat.o(49834);
    return paramArrayOfByte;
  }

  private static native byte[] nDrink(byte[] paramArrayOfByte, int paramInt, String paramString1, String paramString2);

  private static native byte[] nDrinkRawData(byte[] paramArrayOfByte, int paramInt, String paramString);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.ttpic.device.DeviceCoffee
 * JD-Core Version:    0.6.2
 */