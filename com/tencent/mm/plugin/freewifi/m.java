package com.tencent.mm.plugin.freewifi;

import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.au.b;
import com.tencent.mm.au.b.a;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.account.bind.ui.BindMContactUI;
import com.tencent.mm.plugin.account.friend.a.l;
import com.tencent.mm.plugin.account.friend.a.l.a;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiFrontPageUI;
import com.tencent.mm.protocal.protobuf.xa;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.at;
import com.tencent.mm.sdk.platformtools.av;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import com.tencent.mm.ui.MMWizardActivity;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.UUID;

public final class m
{
  private static SimpleDateFormat juL;

  static
  {
    AppMethodBeat.i(20655);
    juL = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss");
    AppMethodBeat.o(20655);
  }

  public static void MA(String paramString)
  {
    AppMethodBeat.i(20654);
    ab.i("FreeWifi", paramString);
    AppMethodBeat.o(20654);
  }

  public static String Mv(String paramString)
  {
    AppMethodBeat.i(20628);
    String str;
    if (isEmpty(paramString))
    {
      str = "";
      AppMethodBeat.o(20628);
    }
    while (true)
    {
      return str;
      str = paramString;
      if (paramString.startsWith("\""))
      {
        str = paramString;
        if (paramString.endsWith("\""))
          str = paramString.substring(1, paramString.length() - 1);
      }
      AppMethodBeat.o(20628);
    }
  }

  public static String Mw(String paramString)
  {
    String str = paramString;
    if (paramString == null)
      str = "";
    return str;
  }

  public static String Mx(String paramString)
  {
    AppMethodBeat.i(20638);
    String str = at.gE(ah.getContext());
    ab.i(paramString, "getConnectedWifiSsid()=".concat(String.valueOf(str)));
    AppMethodBeat.o(20638);
    return str;
  }

  public static String My(String paramString)
  {
    AppMethodBeat.i(20639);
    String str = at.gF(ah.getContext());
    ab.i(paramString, "getConnectedWifiBssid()=".concat(String.valueOf(str)));
    AppMethodBeat.o(20639);
    return str;
  }

  public static String Mz(String paramString)
  {
    AppMethodBeat.i(20640);
    String str = at.gG(ah.getContext());
    ab.i(paramString, "getConnectedWifiClientMac()=".concat(String.valueOf(str)));
    AppMethodBeat.o(20640);
    return str;
  }

  public static void U(Intent paramIntent)
  {
    AppMethodBeat.i(20630);
    if (isEmpty(paramIntent.getStringExtra("free_wifi_sessionkey")))
      d(paramIntent, bys());
    AppMethodBeat.o(20630);
  }

  public static String V(Intent paramIntent)
  {
    AppMethodBeat.i(20633);
    paramIntent = Mw(paramIntent.getStringExtra("free_wifi_sessionkey"));
    AppMethodBeat.o(20633);
    return paramIntent;
  }

  public static int W(Intent paramIntent)
  {
    AppMethodBeat.i(20634);
    int i = paramIntent.getIntExtra("ConstantsFreeWifi.FREE_WIFI_LOG_STEP_ID", 0) + 1;
    paramIntent.putExtra("ConstantsFreeWifi.FREE_WIFI_LOG_STEP_ID", i);
    AppMethodBeat.o(20634);
    return i;
  }

  public static int X(Intent paramIntent)
  {
    AppMethodBeat.i(20635);
    int i = paramIntent.getIntExtra("ConstantsFreeWifi.FREE_WIFI_PROTOCOL_NUMBER", 0);
    AppMethodBeat.o(20635);
    return i;
  }

  public static int Y(Intent paramIntent)
  {
    AppMethodBeat.i(20636);
    int i = paramIntent.getIntExtra("free_wifi_channel_id", 0);
    AppMethodBeat.o(20636);
    return i;
  }

  public static String Z(Intent paramIntent)
  {
    AppMethodBeat.i(20637);
    paramIntent = paramIntent.getStringExtra("free_wifi_ap_key");
    AppMethodBeat.o(20637);
    return paramIntent;
  }

  public static String a(int paramInt1, k.b paramb, int paramInt2)
  {
    AppMethodBeat.i(20643);
    ab.i("MicroMsg.FreeWifi.Utils", "getUiErrorCode, protocol=%d, stageName=%s, stageCode=%d, errocode=%d", new Object[] { Integer.valueOf(paramInt1), paramb.name, Long.valueOf(paramb.muQ), Integer.valueOf(paramInt2) });
    paramInt2 = Math.abs(paramInt2);
    StringBuilder localStringBuilder = new StringBuilder().append(String.format("%02d", new Object[] { Integer.valueOf(paramInt1) })).append(String.format("%03d", new Object[] { Long.valueOf(paramb.muQ) }));
    if (paramInt2 <= 999);
    for (paramb = String.format("%03d", new Object[] { Integer.valueOf(paramInt2) }); ; paramb = Integer.valueOf(paramInt2))
    {
      paramb = paramb;
      AppMethodBeat.o(20643);
      return paramb;
    }
  }

  public static String a(String paramString1, LinkedHashMap<String, Class> paramLinkedHashMap, com.tencent.mm.sdk.e.j paramj, String paramString2)
  {
    AppMethodBeat.i(20653);
    if (paramLinkedHashMap.size() == 0)
    {
      paramString1 = "";
      AppMethodBeat.o(20653);
    }
    while (true)
    {
      return paramString1;
      StringBuilder localStringBuilder1 = new StringBuilder();
      localStringBuilder1.append(paramString1).append("\r\n");
      Object localObject1 = new StringBuilder();
      Object localObject2 = paramLinkedHashMap.entrySet().iterator();
      while (((Iterator)localObject2).hasNext())
        ((StringBuilder)localObject1).append((String)((Map.Entry)((Iterator)localObject2).next()).getKey()).append(",");
      if (((StringBuilder)localObject1).length() > 0)
        ((StringBuilder)localObject1).delete(((StringBuilder)localObject1).length() - 1, ((StringBuilder)localObject1).length());
      localObject2 = "select " + ((StringBuilder)localObject1).toString() + " from " + paramString1;
      localObject1 = paramLinkedHashMap.entrySet().iterator();
      while (((Iterator)localObject1).hasNext())
        localStringBuilder1.append((String)((Map.Entry)((Iterator)localObject1).next()).getKey()).append("\t");
      localStringBuilder1.append("\r\n");
      paramj = paramj.rawQuery((String)localObject2, new String[0]);
      while (true)
      {
        int i;
        try
        {
          if (!paramj.moveToNext())
            break label555;
          localObject1 = paramLinkedHashMap.entrySet().iterator();
          i = 0;
          if (!((Iterator)localObject1).hasNext())
            break label544;
          localObject2 = (Class)((Map.Entry)((Iterator)localObject1).next()).getValue();
          if (localObject2 == String.class)
          {
            localStringBuilder1.append(paramj.getString(i));
            localStringBuilder1.append("\t");
            i++;
            continue;
          }
          if (localObject2 == Integer.TYPE)
          {
            localStringBuilder1.append(paramj.getInt(i));
            continue;
          }
        }
        catch (Exception paramLinkedHashMap)
        {
          localStringBuilder1 = new java/lang/StringBuilder;
          localStringBuilder1.<init>("print ");
          ab.i(paramString2, paramString1 + "error." + paramLinkedHashMap.getMessage());
          paramString1 = "";
          paramj.close();
          AppMethodBeat.o(20653);
          break;
          if (localObject2 == Long.TYPE)
          {
            localStringBuilder1.append(paramj.getLong(i));
            continue;
          }
        }
        finally
        {
          paramj.close();
          AppMethodBeat.o(20653);
        }
        if (localObject2 == Float.TYPE)
        {
          localStringBuilder1.append(paramj.getFloat(i));
        }
        else if (localObject2 == Double.TYPE)
        {
          localStringBuilder1.append(paramj.getDouble(i));
        }
        else
        {
          StringBuilder localStringBuilder2 = new java/lang/StringBuilder;
          localStringBuilder2.<init>("unkonwn type ");
          ab.e(paramString2, ((Class)localObject2).toString());
          localStringBuilder1.append(paramj.getString(i));
          continue;
          label544: localStringBuilder1.append("\r\n");
        }
      }
      label555: ab.i(paramString2, localStringBuilder1.toString());
      paramLinkedHashMap = localStringBuilder1.toString();
      paramString1 = paramLinkedHashMap;
      paramj.close();
      AppMethodBeat.o(20653);
    }
  }

  public static void a(Intent paramIntent, String paramString1, int paramInt1, int paramInt2, m.a parama, String paramString2)
  {
    AppMethodBeat.i(20645);
    com.tencent.mm.plugin.freewifi.model.j.byZ().byI().post(new m.2(paramString2, paramString1, paramIntent, paramInt1, paramInt2, parama));
    AppMethodBeat.o(20645);
  }

  public static void a(Intent paramIntent, String paramString1, int paramInt1, int paramInt2, FreeWifiFrontPageUI paramFreeWifiFrontPageUI, String paramString2)
  {
    AppMethodBeat.i(20644);
    a(paramIntent, paramString1, paramInt1, paramInt2, new m.1(paramString2, paramFreeWifiFrontPageUI, paramInt1), paramString2);
    AppMethodBeat.o(20644);
  }

  public static boolean byr()
  {
    AppMethodBeat.i(20629);
    String str = bo.cc(ah.getContext());
    boolean bool;
    if ((str != null) && (str.toLowerCase().startsWith(ah.getPackageName())))
    {
      bool = true;
      AppMethodBeat.o(20629);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(20629);
    }
  }

  public static String bys()
  {
    AppMethodBeat.i(20631);
    String str = UUID.randomUUID().toString().replace("-", "");
    AppMethodBeat.o(20631);
    return str;
  }

  public static int byt()
  {
    AppMethodBeat.i(20646);
    Object localObject = l.apS();
    int i;
    if ((localObject == l.a.gvx) || (localObject == l.a.gvy))
    {
      AppMethodBeat.o(20646);
      i = 1;
    }
    while (true)
    {
      return i;
      aw.ZK();
      localObject = (String)com.tencent.mm.model.c.Ry().get(6, null);
      if (isEmpty((String)localObject))
      {
        AppMethodBeat.o(20646);
        i = 1;
      }
      else
      {
        if (((String)localObject).startsWith("+"));
        for (localObject = av.Ps((String)localObject); ; localObject = "86")
        {
          if (!"86".equals(localObject))
            break label112;
          i = 2;
          AppMethodBeat.o(20646);
          break;
        }
        label112: i = 3;
        AppMethodBeat.o(20646);
      }
    }
  }

  public static boolean byu()
  {
    AppMethodBeat.i(20651);
    boolean bool;
    if (((ConnectivityManager)ah.getContext().getSystemService("connectivity")).getNetworkInfo(1).isConnected())
    {
      ab.i("TAG", "isWifiConnected()=true");
      AppMethodBeat.o(20651);
      bool = true;
    }
    while (true)
    {
      return bool;
      ab.i("TAG", "isWifiConnected()=false");
      bool = false;
      AppMethodBeat.o(20651);
    }
  }

  public static xa byv()
  {
    AppMethodBeat.i(20652);
    xa localxa = new xa();
    localxa.deviceBrand = com.tencent.mm.protocal.d.vxi;
    if ((d.mtL != null) && (!d.mtL.equals("")));
    for (localxa.wcW = d.mtL; ; localxa.wcW = Mz("MicroMsg.FreeWifi.Utils"))
    {
      localxa.deviceModel = com.tencent.mm.protocal.d.vxj;
      localxa.osName = com.tencent.mm.protocal.d.vxl;
      localxa.osVersion = com.tencent.mm.protocal.d.vxm;
      AppMethodBeat.o(20652);
      return localxa;
    }
  }

  public static void d(Intent paramIntent, String paramString)
  {
    AppMethodBeat.i(20632);
    paramIntent.putExtra("free_wifi_sessionkey", paramString);
    paramIntent.putExtra("ConstantsFreeWifi.FREE_WIFI_LOG_STEP_ID", 0);
    AppMethodBeat.o(20632);
  }

  public static void dU(Context paramContext)
  {
    AppMethodBeat.i(20647);
    Intent localIntent = new Intent(paramContext, BindMContactUI.class);
    Object localObject = ((TelephonyManager)paramContext.getSystemService("phone")).getSimCountryIso();
    if (!bo.isNullOrNil((String)localObject))
    {
      localObject = b.k(paramContext, (String)localObject, paramContext.getString(2131298789));
      if (localObject != null)
      {
        localIntent.putExtra("country_name", ((b.a)localObject).fHE);
        localIntent.putExtra("couttry_code", ((b.a)localObject).fHD);
      }
    }
    MMWizardActivity.J(paramContext, localIntent);
    AppMethodBeat.o(20647);
  }

  public static boolean eg(int paramInt1, int paramInt2)
  {
    if ((paramInt1 == 0) && (paramInt2 == 0));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean eh(int paramInt1, int paramInt2)
  {
    if ((paramInt1 == 4) && (paramInt2 <= -30000) && (paramInt2 > -31000));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  private static boolean eo(String paramString1, String paramString2)
  {
    boolean bool = true;
    AppMethodBeat.i(20650);
    int i = bo.getInt(paramString1, 0);
    int j = bo.getInt(paramString2, 0);
    if ((i == 0) && (j != 0) && (com.tencent.mm.protocal.d.vxo <= j))
      AppMethodBeat.o(20650);
    while (true)
    {
      return bool;
      if ((i != 0) && (j == 0) && (com.tencent.mm.protocal.d.vxo >= i))
      {
        AppMethodBeat.o(20650);
      }
      else if ((i != 0) && (j != 0) && (com.tencent.mm.protocal.d.vxo >= i) && (com.tencent.mm.protocal.d.vxo <= j))
      {
        AppMethodBeat.o(20650);
      }
      else
      {
        AppMethodBeat.o(20650);
        bool = false;
      }
    }
  }

  public static String g(Exception paramException)
  {
    AppMethodBeat.i(20641);
    Object localObject = new StringWriter();
    paramException.printStackTrace(new PrintWriter((Writer)localObject));
    localObject = Mw(((StringWriter)localObject).toString());
    paramException = (Exception)localObject;
    if (((String)localObject).length() > 1024)
      paramException = ((String)localObject).substring(0, 1024);
    AppMethodBeat.o(20641);
    return paramException;
  }

  public static String h(Exception paramException)
  {
    AppMethodBeat.i(20642);
    StringWriter localStringWriter = new StringWriter();
    paramException.printStackTrace(new PrintWriter(localStringWriter));
    paramException = Mw(localStringWriter.toString());
    AppMethodBeat.o(20642);
    return paramException;
  }

  public static int i(Exception paramException)
  {
    int i = 101;
    AppMethodBeat.i(20648);
    if ((paramException instanceof SocketTimeoutException))
    {
      paramException = h(paramException);
      if (paramException.indexOf(".read") != -1)
      {
        i = 105;
        AppMethodBeat.o(20648);
      }
    }
    while (true)
    {
      return i;
      if (paramException.indexOf(".connect") != -1)
      {
        i = 104;
        AppMethodBeat.o(20648);
      }
      else
      {
        AppMethodBeat.o(20648);
        continue;
        if ((paramException instanceof ConnectException))
        {
          i = 106;
          AppMethodBeat.o(20648);
        }
        else if ((paramException instanceof UnknownHostException))
        {
          i = 102;
          AppMethodBeat.o(20648);
        }
        else
        {
          AppMethodBeat.o(20648);
        }
      }
    }
  }

  public static boolean isEmpty(String paramString)
  {
    AppMethodBeat.i(20627);
    boolean bool;
    if ((paramString == null) || (paramString.length() == 0))
    {
      bool = true;
      AppMethodBeat.o(20627);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(20627);
    }
  }

  public static boolean k(Map<String, String> paramMap, String paramString)
  {
    boolean bool = true;
    AppMethodBeat.i(20649);
    ab.i(paramString, "CLIENT_VERSION=" + com.tencent.mm.protocal.d.vxo);
    String str1 = (String)paramMap.get(".sysmsg.apply_versions.version_desc.$minInclude");
    String str2 = (String)paramMap.get(".sysmsg.apply_versions.version_desc.$maxInclude");
    ab.i(paramString, "checkMsgPushedVersion. min0=%s,max0=%s", new Object[] { str1, str2 });
    if ((isEmpty(str1)) && (isEmpty(str2)))
    {
      AppMethodBeat.o(20649);
      bool = false;
    }
    while (true)
    {
      return bool;
      if (eo(str1, str2))
      {
        AppMethodBeat.o(20649);
      }
      else
      {
        for (int i = 1; ; i++)
        {
          str1 = (String)paramMap.get(".sysmsg.apply_versions.version_desc#" + i + ".$minInclude");
          str2 = (String)paramMap.get(".sysmsg.apply_versions.version_desc#" + i + ".$maxInclude");
          ab.i(paramString, "checkMsgPushedVersion. min" + i + "=%s,max" + i + "=%s", new Object[] { str1, str2 });
          if ((isEmpty(str1)) && (isEmpty(str2)))
            break label284;
          if (eo(str1, str2))
          {
            AppMethodBeat.o(20649);
            break;
          }
        }
        label284: AppMethodBeat.o(20649);
        bool = false;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.m
 * JD-Core Version:    0.6.2
 */