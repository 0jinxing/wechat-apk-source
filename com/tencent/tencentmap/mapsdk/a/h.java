package com.tencent.tencentmap.mapsdk.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Arrays;

public class h
{
  public static final double a;
  public static final double b;
  private static final long c;
  private static final long d;
  private static final int e;
  private static final int f;

  static
  {
    AppMethodBeat.i(101149);
    c = Double.doubleToRawLongBits(0.0D);
    d = Double.doubleToRawLongBits(0.0D);
    e = Float.floatToRawIntBits(0.0F);
    f = Float.floatToRawIntBits(0.0F);
    a = Double.longBitsToDouble(4368491638549381120L);
    b = Double.longBitsToDouble(4503599627370496L);
    AppMethodBeat.o(101149);
  }

  public static int a(Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(101148);
    int i = Arrays.hashCode(paramArrayOfObject);
    AppMethodBeat.o(101148);
    return i;
  }

  public static String a(String paramString, Object paramObject)
  {
    AppMethodBeat.i(101146);
    paramString = paramString + "=" + String.valueOf(paramObject);
    AppMethodBeat.o(101146);
    return paramString;
  }

  public static String a(String[] paramArrayOfString)
  {
    AppMethodBeat.i(101147);
    StringBuilder localStringBuilder = new StringBuilder();
    int i = paramArrayOfString.length;
    int j = 0;
    for (int k = 0; j < i; k++)
    {
      localStringBuilder.append(paramArrayOfString[j]);
      if (k != paramArrayOfString.length - 1)
        localStringBuilder.append(",");
      j++;
    }
    paramArrayOfString = localStringBuilder.toString();
    AppMethodBeat.o(101147);
    return paramArrayOfString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.tencentmap.mapsdk.a.h
 * JD-Core Version:    0.6.2
 */