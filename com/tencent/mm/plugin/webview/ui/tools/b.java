package com.tencent.mm.plugin.webview.ui.tools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class b
{
  private static final Map<Integer, Integer> uqW;
  private static final Map<Integer, Integer> uqX;
  private static final Map<Integer, Integer> uqY;
  private static final Map<String, Integer> uqZ;

  static
  {
    AppMethodBeat.i(7347);
    HashMap localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf(-1), Integer.valueOf(5));
    localHashMap.put(Integer.valueOf(-2), Integer.valueOf(6));
    localHashMap.put(Integer.valueOf(-3), Integer.valueOf(7));
    localHashMap.put(Integer.valueOf(-4), Integer.valueOf(8));
    localHashMap.put(Integer.valueOf(-5), Integer.valueOf(9));
    localHashMap.put(Integer.valueOf(-6), Integer.valueOf(10));
    localHashMap.put(Integer.valueOf(-7), Integer.valueOf(11));
    localHashMap.put(Integer.valueOf(-8), Integer.valueOf(12));
    localHashMap.put(Integer.valueOf(-9), Integer.valueOf(13));
    localHashMap.put(Integer.valueOf(-10), Integer.valueOf(14));
    localHashMap.put(Integer.valueOf(-11), Integer.valueOf(15));
    localHashMap.put(Integer.valueOf(-12), Integer.valueOf(16));
    localHashMap.put(Integer.valueOf(-13), Integer.valueOf(17));
    localHashMap.put(Integer.valueOf(-14), Integer.valueOf(18));
    localHashMap.put(Integer.valueOf(-15), Integer.valueOf(19));
    uqW = Collections.unmodifiableMap(localHashMap);
    localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf(-1), Integer.valueOf(4));
    localHashMap.put(Integer.valueOf(-2), Integer.valueOf(5));
    localHashMap.put(Integer.valueOf(-3), Integer.valueOf(6));
    localHashMap.put(Integer.valueOf(-4), Integer.valueOf(7));
    localHashMap.put(Integer.valueOf(-5), Integer.valueOf(8));
    localHashMap.put(Integer.valueOf(-6), Integer.valueOf(9));
    uqX = Collections.unmodifiableMap(localHashMap);
    localHashMap = new HashMap();
    localHashMap.put(Integer.valueOf(0), Integer.valueOf(0));
    localHashMap.put(Integer.valueOf(1), Integer.valueOf(1));
    localHashMap.put(Integer.valueOf(2), Integer.valueOf(2));
    uqY = Collections.unmodifiableMap(localHashMap);
    localHashMap = new HashMap();
    localHashMap.put("imagePreview", Integer.valueOf(2));
    localHashMap.put("profile", Integer.valueOf(3));
    localHashMap.put("addContact", Integer.valueOf(4));
    localHashMap.put("shareTimeline", Integer.valueOf(7));
    localHashMap.put("scanQRCode", Integer.valueOf(8));
    localHashMap.put("hideOptionMenu", Integer.valueOf(10));
    localHashMap.put("getBrandWCPayRequest", Integer.valueOf(11));
    localHashMap.put("editAddress", Integer.valueOf(12));
    localHashMap.put("getLatestAddress", Integer.valueOf(13));
    localHashMap.put("jumpWCMall", Integer.valueOf(14));
    localHashMap.put("geoLocation", Integer.valueOf(15));
    localHashMap.put("openProductView", Integer.valueOf(16));
    localHashMap.put("openProductViewWithPid", Integer.valueOf(16));
    localHashMap.put("openLocation", Integer.valueOf(17));
    localHashMap.put("hideMenuItems", Integer.valueOf(19));
    localHashMap.put("connectToFreeWifi", Integer.valueOf(20));
    localHashMap.put("startRecord", Integer.valueOf(21));
    localHashMap.put("chooseImage", Integer.valueOf(22));
    localHashMap.put("scanCover", Integer.valueOf(23));
    localHashMap.put("openGameWebView", Integer.valueOf(28));
    uqZ = Collections.unmodifiableMap(localHashMap);
    AppMethodBeat.o(7347);
  }

  public static int Jf(int paramInt)
  {
    AppMethodBeat.i(7343);
    Integer localInteger1 = (Integer)uqW.get(Integer.valueOf(paramInt));
    Integer localInteger2 = localInteger1;
    if (localInteger1 == null)
      localInteger2 = (Integer)uqW.get(Integer.valueOf(-1));
    paramInt = localInteger2.intValue();
    AppMethodBeat.o(7343);
    return paramInt;
  }

  public static int Jg(int paramInt)
  {
    AppMethodBeat.i(7344);
    Integer localInteger1 = (Integer)uqX.get(Integer.valueOf(paramInt));
    Integer localInteger2 = localInteger1;
    if (localInteger1 == null)
      localInteger2 = (Integer)uqX.get(Integer.valueOf(-1));
    paramInt = localInteger2.intValue();
    AppMethodBeat.o(7344);
    return paramInt;
  }

  public static int Jh(int paramInt)
  {
    AppMethodBeat.i(7345);
    Integer localInteger1 = (Integer)uqY.get(Integer.valueOf(paramInt));
    Integer localInteger2 = localInteger1;
    if (localInteger1 == null)
      localInteger2 = Integer.valueOf(-1);
    paramInt = localInteger2.intValue();
    AppMethodBeat.o(7345);
    return paramInt;
  }

  public static int afq(String paramString)
  {
    AppMethodBeat.i(7346);
    Integer localInteger = (Integer)uqZ.get(paramString);
    paramString = localInteger;
    if (localInteger == null)
      paramString = Integer.valueOf(-1);
    int i = paramString.intValue();
    AppMethodBeat.o(7346);
    return i;
  }

  public static int lS(long paramLong)
  {
    int i;
    if (paramLong < 0L)
      i = -1;
    while (true)
    {
      return i;
      if (paramLong <= 2000L)
        i = 1;
      else if (paramLong <= 6000L)
        i = 2;
      else if (paramLong <= 12000L)
        i = 3;
      else if (paramLong <= 60000L)
        i = 4;
      else
        i = 5;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.b
 * JD-Core Version:    0.6.2
 */