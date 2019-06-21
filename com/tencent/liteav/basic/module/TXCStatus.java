package com.tencent.liteav.basic.module;

import com.tencent.matrix.trace.core.AppMethodBeat;

public class TXCStatus
{
  public static Object a(String paramString, int paramInt)
  {
    Object localObject = null;
    AppMethodBeat.i(66071);
    if ((paramString == null) || (paramString.length() == 0))
    {
      AppMethodBeat.o(66071);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      switch (paramInt)
      {
      default:
        AppMethodBeat.o(66071);
        paramString = localObject;
        break;
      case 2001:
      case 2002:
      case 2003:
      case 2004:
      case 2005:
      case 2006:
      case 2007:
      case 2008:
      case 2010:
      case 2011:
      case 2012:
      case 2013:
      case 2014:
      case 2015:
      case 3002:
      case 4002:
      case 4003:
      case 4004:
      case 5002:
      case 6001:
      case 6003:
      case 6004:
      case 6005:
      case 6006:
      case 6007:
      case 6008:
      case 6009:
      case 7112:
        paramString = Long.valueOf(nativeStatusGetIntValue(paramString, paramInt));
        AppMethodBeat.o(66071);
        break;
      case 1001:
      case 3003:
      case 4001:
      case 5001:
      case 6002:
        paramString = Double.valueOf(nativeStatusGetDoubleValue(paramString, paramInt));
        AppMethodBeat.o(66071);
        break;
      case 7001:
      case 7002:
      case 7003:
      case 7004:
      case 7005:
      case 7006:
      case 7007:
      case 7008:
      case 7009:
      case 7010:
      case 7011:
      case 7013:
      case 7016:
      case 7017:
      case 7018:
      case 7020:
      case 7101:
      case 7102:
      case 7103:
      case 7104:
      case 7105:
      case 7107:
      case 7108:
      case 7109:
      case 7111:
      case 7116:
      case 7117:
      case 7118:
        paramString = Long.valueOf(nativeStatusGetIntValue(paramString, paramInt));
        AppMethodBeat.o(66071);
        break;
      case 3001:
      case 7012:
      case 7014:
      case 7015:
      case 7019:
      case 7106:
      case 7110:
      case 7113:
      case 7114:
      case 7115:
      case 7119:
        paramString = nativeStatusGetStrValue(paramString, paramInt);
        AppMethodBeat.o(66071);
      }
    }
  }

  public static void a(String paramString)
  {
    AppMethodBeat.i(66068);
    nativeStatusStartRecord(paramString);
    AppMethodBeat.o(66068);
  }

  public static boolean a(String paramString, int paramInt, Object paramObject)
  {
    boolean bool = false;
    AppMethodBeat.i(66070);
    if ((paramString == null) || (paramString.length() == 0))
      AppMethodBeat.o(66070);
    while (true)
    {
      return bool;
      if (paramObject == null)
      {
        AppMethodBeat.o(66070);
      }
      else
      {
        switch (paramInt)
        {
        default:
        case 2001:
        case 2002:
        case 2003:
        case 2004:
        case 2005:
        case 2006:
        case 2007:
        case 2008:
        case 2010:
        case 2011:
        case 2012:
        case 2013:
        case 2014:
        case 2015:
        case 3002:
        case 4002:
        case 4003:
        case 4004:
        case 5002:
        case 6001:
        case 6003:
        case 6004:
        case 6005:
        case 6006:
        case 6007:
        case 6008:
        case 6009:
        case 7112:
        case 1001:
        case 3003:
        case 4001:
        case 5001:
        case 6002:
        case 7001:
        case 7002:
        case 7003:
        case 7004:
        case 7005:
        case 7006:
        case 7007:
        case 7008:
        case 7009:
        case 7010:
        case 7011:
        case 7013:
        case 7016:
        case 7017:
        case 7018:
        case 7020:
        case 7101:
        case 7102:
        case 7103:
        case 7104:
        case 7105:
        case 7107:
        case 7108:
        case 7109:
        case 7111:
        case 7116:
        case 7117:
        case 7118:
        case 3001:
        case 7012:
        case 7014:
        case 7015:
        case 7019:
        case 7106:
        case 7110:
        case 7113:
        case 7114:
        case 7115:
        case 7119:
        }
        do
        {
          do
          {
            do
            {
              do
              {
                AppMethodBeat.o(66070);
                break;
              }
              while (!(paramObject instanceof Long));
              bool = nativeStatusSetIntValue(paramString, paramInt, ((Long)paramObject).longValue());
              AppMethodBeat.o(66070);
              break;
            }
            while (!(paramObject instanceof Double));
            bool = nativeStatusSetDoubleValue(paramString, paramInt, ((Double)paramObject).doubleValue());
            AppMethodBeat.o(66070);
            break;
          }
          while (!(paramObject instanceof Long));
          bool = nativeStatusSetIntValue(paramString, paramInt, ((Long)paramObject).longValue());
          AppMethodBeat.o(66070);
          break;
        }
        while (!(paramObject instanceof String));
        bool = nativeStatusSetStrValue(paramString, paramInt, (String)paramObject);
        AppMethodBeat.o(66070);
      }
    }
  }

  public static long b(String paramString, int paramInt)
  {
    AppMethodBeat.i(66072);
    paramString = a(paramString, paramInt);
    if ((paramString != null) && ((paramString instanceof Long)));
    for (long l = ((Long)paramString).longValue(); ; l = 0L)
    {
      AppMethodBeat.o(66072);
      return l;
    }
  }

  public static void b(String paramString)
  {
    AppMethodBeat.i(66069);
    nativeStatusStopRecord(paramString);
    AppMethodBeat.o(66069);
  }

  public static String c(String paramString, int paramInt)
  {
    AppMethodBeat.i(66073);
    paramString = a(paramString, paramInt);
    if ((paramString != null) && ((paramString instanceof String)));
    for (paramString = (String)paramString; ; paramString = "")
    {
      AppMethodBeat.o(66073);
      return paramString;
    }
  }

  public static int d(String paramString, int paramInt)
  {
    AppMethodBeat.i(66074);
    paramString = a(paramString, paramInt);
    if ((paramString != null) && ((paramString instanceof Long)));
    for (paramInt = ((Long)paramString).intValue(); ; paramInt = 0)
    {
      AppMethodBeat.o(66074);
      return paramInt;
    }
  }

  public static double e(String paramString, int paramInt)
  {
    AppMethodBeat.i(66075);
    paramString = a(paramString, paramInt);
    if ((paramString != null) && ((paramString instanceof Double)));
    for (double d = ((Double)paramString).doubleValue(); ; d = 0.0D)
    {
      AppMethodBeat.o(66075);
      return d;
    }
  }

  private static native double nativeStatusGetDoubleValue(String paramString, int paramInt);

  private static native long nativeStatusGetIntValue(String paramString, int paramInt);

  private static native String nativeStatusGetStrValue(String paramString, int paramInt);

  private static native boolean nativeStatusSetDoubleValue(String paramString, int paramInt, double paramDouble);

  private static native boolean nativeStatusSetIntValue(String paramString, int paramInt, long paramLong);

  private static native boolean nativeStatusSetStrValue(String paramString1, int paramInt, String paramString2);

  private static native void nativeStatusStartRecord(String paramString);

  private static native void nativeStatusStopRecord(String paramString);
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.liteav.basic.module.TXCStatus
 * JD-Core Version:    0.6.2
 */