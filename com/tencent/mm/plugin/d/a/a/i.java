package com.tencent.mm.plugin.d.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.math.BigDecimal;

public final class i
{
  public static BigDecimal i(double paramDouble1, double paramDouble2)
  {
    AppMethodBeat.i(18358);
    BigDecimal localBigDecimal = new BigDecimal(paramDouble1).multiply(new BigDecimal(paramDouble2));
    AppMethodBeat.o(18358);
    return localBigDecimal;
  }

  public static double p(int[] paramArrayOfInt)
  {
    AppMethodBeat.i(18359);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length == 0))
    {
      paramArrayOfInt = new NullPointerException("null == dataGroup || 0 == dataGroup.length");
      AppMethodBeat.o(18359);
      throw paramArrayOfInt;
    }
    int i = paramArrayOfInt.length;
    int j = 0;
    int m;
    for (int k = 0; j < i; k = m + k)
    {
      m = paramArrayOfInt[j];
      j++;
    }
    double d1 = k;
    double d2 = paramArrayOfInt.length;
    d1 = new BigDecimal(d1).divide(new BigDecimal(d2), 5, 4).doubleValue();
    AppMethodBeat.o(18359);
    return d1;
  }

  public static double q(int[] paramArrayOfInt)
  {
    AppMethodBeat.i(18360);
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length == 0))
    {
      paramArrayOfInt = new NullPointerException("null == dataGroup || 0 == dataGroup.length");
      AppMethodBeat.o(18360);
      throw paramArrayOfInt;
    }
    double d = p(paramArrayOfInt);
    BigDecimal localBigDecimal = new BigDecimal(0.0D);
    int i = paramArrayOfInt.length;
    for (int j = 0; j < i; j++)
      localBigDecimal = localBigDecimal.add(new BigDecimal(paramArrayOfInt[j]).subtract(new BigDecimal(d)).pow(2));
    d = Math.pow(localBigDecimal.divide(new BigDecimal(paramArrayOfInt.length - 1), 5, 4).doubleValue(), 0.5D);
    AppMethodBeat.o(18360);
    return d;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.a.i
 * JD-Core Version:    0.6.2
 */