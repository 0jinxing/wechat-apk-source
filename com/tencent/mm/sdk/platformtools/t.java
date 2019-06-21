package com.tencent.mm.sdk.platformtools;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class t
{
  private static final Pattern xyp;
  private static final Pattern xyq;
  private static final Pattern xyr;

  static
  {
    AppMethodBeat.i(52006);
    xyp = Pattern.compile("^(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)(\\.(25[0-5]|2[0-4]\\d|[0-1]?\\d?\\d)){3}$");
    xyq = Pattern.compile("^(?:[0-9a-fA-F]{1,4}:){7}[0-9a-fA-F]{1,4}$");
    xyr = Pattern.compile("^((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)::((?:[0-9A-Fa-f]{1,4}(?::[0-9A-Fa-f]{1,4})*)?)$");
    AppMethodBeat.o(52006);
  }

  public static InetAddress ams(String paramString)
  {
    AppMethodBeat.i(52005);
    if (isIPv4Address(paramString))
    {
      paramString = InetAddress.getByName(paramString);
      AppMethodBeat.o(52005);
    }
    while (true)
    {
      return paramString;
      if (!isIPv6Address(paramString))
        break;
      paramString = InetAddress.getByName(paramString);
      AppMethodBeat.o(52005);
    }
    paramString = new UnknownHostException("invalid ipv4 or ipv6 dotted string");
    AppMethodBeat.o(52005);
    throw paramString;
  }

  public static boolean isIPv4Address(String paramString)
  {
    AppMethodBeat.i(52003);
    boolean bool = xyp.matcher(paramString).matches();
    AppMethodBeat.o(52003);
    return bool;
  }

  public static boolean isIPv6Address(String paramString)
  {
    AppMethodBeat.i(52004);
    boolean bool;
    if ((xyq.matcher(paramString).matches()) || (xyr.matcher(paramString).matches()))
    {
      bool = true;
      AppMethodBeat.o(52004);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(52004);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.sdk.platformtools.t
 * JD-Core Version:    0.6.2
 */