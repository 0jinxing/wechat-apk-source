package com.tencent.mm.game.report.b;

import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.pm.PackageInfo;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.plugin.appbrand.r.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.bo;
import java.math.BigInteger;
import java.net.URLEncoder;
import org.json.JSONException;
import org.json.JSONObject;

public final class a
{
  private static String eCq = null;

  public static int F(Context paramContext, String paramString)
  {
    AppMethodBeat.i(59600);
    paramContext = b.getPackageInfo(paramContext, paramString);
    int i;
    if (paramContext == null)
    {
      i = 0;
      AppMethodBeat.o(59600);
    }
    while (true)
    {
      return i;
      i = paramContext.versionCode;
      AppMethodBeat.o(59600);
    }
  }

  private static String LU()
  {
    AppMethodBeat.i(59598);
    try
    {
      String str1 = bo.nullAsNil(BluetoothAdapter.getDefaultAdapter().getAddress());
      AppMethodBeat.o(59598);
      return str1;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.e("MicroMsg.GameReportUtil", "getBlueToothAddress failed: %s", new Object[] { bo.l(localException) });
        String str2 = "";
        AppMethodBeat.o(59598);
      }
    }
  }

  public static String Pv()
  {
    AppMethodBeat.i(59599);
    if (eCq == null)
    {
      str = q.LM();
      StringBuilder localStringBuilder = new StringBuilder();
      for (int i = 0; i < str.length() - 1; i++)
        localStringBuilder.append(Integer.toHexString(str.charAt(i)));
      localStringBuilder.append("00");
      eCq = localStringBuilder.toString();
    }
    String str = eCq;
    AppMethodBeat.o(59599);
    return str;
  }

  public static String fa(long paramLong)
  {
    AppMethodBeat.i(59601);
    String str = new BigInteger("00FFFFFFFFFFFFFFFF", 16).and(BigInteger.valueOf(paramLong)).toString();
    ab.d("MicroMsg.GameReportUtil", "reportReadMsg, unsignedlonglong = ".concat(String.valueOf(str)));
    AppMethodBeat.o(59601);
    return str;
  }

  public static String getDeviceInfo()
  {
    AppMethodBeat.i(59597);
    String str1 = q.LK();
    String str2 = q.LP();
    String str3 = LU();
    String str4 = q.LX();
    Object localObject = new JSONObject();
    try
    {
      ((JSONObject)localObject).put("IMEI", str1);
      ((JSONObject)localObject).put("MAC_ADDRESS", str2);
      ((JSONObject)localObject).put("BLUETOOTH_ADDRESS", str3);
      ((JSONObject)localObject).put("IMSI", str4);
      localObject = kY(((JSONObject)localObject).toString());
      AppMethodBeat.o(59597);
      return localObject;
    }
    catch (JSONException localJSONException)
    {
      while (true)
        ab.e("MicroMsg.GameReportUtil", "getDeviceInfo: " + localJSONException.getMessage());
    }
  }

  public static int getNetworkType(Context paramContext)
  {
    AppMethodBeat.i(59595);
    int i;
    if (at.is3G(paramContext))
    {
      i = 4;
      AppMethodBeat.o(59595);
    }
    while (true)
    {
      return i;
      if (at.is4G(paramContext))
      {
        i = 5;
        AppMethodBeat.o(59595);
      }
      else
      {
        switch (at.getNetType(paramContext))
        {
        case 1:
        case 2:
        case 3:
        case 4:
        default:
          i = 6;
          AppMethodBeat.o(59595);
          break;
        case -1:
          i = 255;
          AppMethodBeat.o(59595);
          break;
        case 0:
          i = 1;
          AppMethodBeat.o(59595);
          break;
        case 5:
          i = 2;
          AppMethodBeat.o(59595);
          break;
        case 6:
          i = 3;
          AppMethodBeat.o(59595);
        }
      }
    }
  }

  public static String kY(String paramString)
  {
    AppMethodBeat.i(59596);
    if (bo.isNullOrNil(paramString))
    {
      paramString = "";
      AppMethodBeat.o(59596);
    }
    while (true)
    {
      return paramString;
      try
      {
        paramString = URLEncoder.encode(paramString, "UTF-8");
        AppMethodBeat.o(59596);
      }
      catch (Exception localException)
      {
        while (true)
        {
          paramString = "";
          ab.e("MicroMsg.GameReportUtil", localException.getMessage());
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.game.report.b.a
 * JD-Core Version:    0.6.2
 */