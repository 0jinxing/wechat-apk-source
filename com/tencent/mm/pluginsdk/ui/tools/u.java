package com.tencent.mm.pluginsdk.ui.tools;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.util.Base64;
import com.jg.JgClassChecked;
import com.tencent.luggage.a.e;
import com.tencent.luggage.g.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.y;
import com.tencent.mm.plugin.appbrand.r.q;
import com.tencent.mm.plugin.appbrand.r.q.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.az;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.xweb.WebView;
import java.io.UnsupportedEncodingException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.URLEncoder;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@JgClassChecked(author=20, fComment="checked", lastDate="20140429", reviewer=20, vComment={com.jg.EType.JSEXECUTECHECK})
public final class u
{
  private static az ghu;
  private static q.a ulv;
  private static final Pattern vvQ;

  static
  {
    AppMethodBeat.i(80489);
    ulv = null;
    ghu = null;
    vvQ = Pattern.compile("data:(image|img)/\\S+;base64,\\S+");
    AppMethodBeat.o(80489);
  }

  public static void a(Context paramContext, String paramString1, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(80471);
    if (ghu == null)
      ghu = new az(1, "webview-save-image", 1);
    ghu.e(new u.c(paramContext, paramString1, paramString2, paramBoolean));
    AppMethodBeat.o(80471);
  }

  public static void a(Context paramContext, String paramString1, String paramString2, boolean paramBoolean, u.a parama)
  {
    AppMethodBeat.i(80472);
    if (ghu == null)
      ghu = new az(1, "webview-save-image", 1);
    ghu.e(new u.c(paramContext, paramString1, paramString2, paramBoolean, 1, parama));
    AppMethodBeat.o(80472);
  }

  private static void a(b paramb)
  {
    AppMethodBeat.i(80474);
    ab.d("MicroMsg.WebViewUtil", "initIFrame");
    al.d(new u.2(paramb));
    AppMethodBeat.o(80474);
  }

  private static void a(final b paramb, final String paramString1, final String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(80477);
    if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)))
    {
      ab.e("MicroMsg.WebViewUtil", "getJsResult fail, invalid argument, scheme = %s, jsCode = %s", new Object[] { paramString1, paramString2 });
      AppMethodBeat.o(80477);
    }
    while (true)
    {
      return;
      ab.d("MicroMsg.WebViewUtil", "getJsResult, scheme = %s, jsCode = %s", new Object[] { paramString1, paramString2 });
      a(paramb);
      al.d(new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(80460);
          if (this.vvS)
          {
            paramb.akp("javascript:document.getElementById('_edw_iframe_').src = '" + paramString1 + "' + " + paramString2);
            AppMethodBeat.o(80460);
          }
          while (true)
          {
            return;
            paramb.akp("javascript:console.log('" + paramString1 + "' + " + paramString2 + ")");
            AppMethodBeat.o(80460);
          }
        }
      });
      AppMethodBeat.o(80477);
    }
  }

  public static void a(WebView paramWebView, String paramString1, String paramString2)
  {
    AppMethodBeat.i(80475);
    a(paramWebView, paramString1, paramString2, true);
    AppMethodBeat.o(80475);
  }

  public static void a(WebView paramWebView, String paramString1, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(80476);
    if (paramWebView == null)
      AppMethodBeat.o(80476);
    while (true)
    {
      return;
      a(new u.3(paramWebView), paramString1, paramString2, paramBoolean);
      AppMethodBeat.o(80476);
    }
  }

  public static final String aR(Map<String, Object> paramMap)
  {
    AppMethodBeat.i(80479);
    StringBuilder localStringBuilder = new StringBuilder();
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      Object localObject = paramMap.get(str);
      if ((!bo.isNullOrNil(str)) && (localObject != null) && ((!(localObject instanceof String)) || (!bo.isNullOrNil((String)localObject))))
      {
        if (localStringBuilder.length() > 0)
          localStringBuilder.append("&");
        localStringBuilder.append(str);
        localStringBuilder.append("=");
        localStringBuilder.append(localObject);
      }
    }
    paramMap = localStringBuilder.toString();
    AppMethodBeat.o(80479);
    return paramMap;
  }

  public static String aef(String paramString)
  {
    AppMethodBeat.i(80488);
    if (bo.isNullOrNil(paramString))
      AppMethodBeat.o(80488);
    while (true)
    {
      return paramString;
      int i = paramString.indexOf("#");
      if (i < 0)
      {
        AppMethodBeat.o(80488);
      }
      else
      {
        paramString = paramString.substring(0, i);
        AppMethodBeat.o(80488);
      }
    }
  }

  public static boolean akj(String paramString)
  {
    AppMethodBeat.i(80468);
    boolean bool;
    if (paramString == null)
    {
      bool = false;
      AppMethodBeat.o(80468);
    }
    while (true)
    {
      return bool;
      bool = paramString.toLowerCase().contains(" MicroMessenger/".trim().toLowerCase());
      AppMethodBeat.o(80468);
    }
  }

  public static final String akk(String paramString)
  {
    AppMethodBeat.i(80480);
    if (!bo.isNullOrNil(paramString));
    while (true)
    {
      try
      {
        String str = URLEncoder.encode(paramString, "utf-8");
        paramString = str;
        AppMethodBeat.o(80480);
        return paramString;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        ab.e("MicroMsg.WebViewUtil", "URLEncode fail, throw : %s", new Object[] { localUnsupportedEncodingException.getMessage() });
      }
      AppMethodBeat.o(80480);
    }
  }

  public static final String akl(String paramString)
  {
    AppMethodBeat.i(80481);
    if (!bo.isNullOrNil(paramString));
    while (true)
    {
      try
      {
        byte[] arrayOfByte = paramString.getBytes("utf-8");
        paramString = arrayOfByte;
        paramString = Base64.encodeToString(paramString, 2);
        AppMethodBeat.o(80481);
        return paramString;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        paramString = paramString.getBytes();
        ab.e("MicroMsg.WebViewUtil", "getBytes fail, throw : %s", new Object[] { localUnsupportedEncodingException.getMessage() });
        continue;
      }
      AppMethodBeat.o(80481);
    }
  }

  public static String akm(String paramString)
  {
    Object localObject = null;
    AppMethodBeat.i(80484);
    if (bo.isNullOrNil(paramString))
    {
      AppMethodBeat.o(80484);
      paramString = localObject;
    }
    while (true)
    {
      return paramString;
      if (!vvQ.matcher(paramString).matches())
      {
        AppMethodBeat.o(80484);
        paramString = localObject;
      }
      else
      {
        paramString = paramString.substring(paramString.indexOf("base64,") + 7).trim();
        AppMethodBeat.o(80484);
      }
    }
  }

  public static String akn(String paramString)
  {
    AppMethodBeat.i(80486);
    String str1 = "";
    String str2 = str1;
    if (paramString != null)
    {
      str2 = str1;
      if (paramString.startsWith("Refused to frame"))
      {
        paramString = paramString.split("'");
        str2 = str1;
        if (paramString.length > 2)
          str2 = paramString[1];
      }
    }
    AppMethodBeat.o(80486);
    return str2;
  }

  @Deprecated
  public static String ako(String paramString)
  {
    AppMethodBeat.i(80487);
    paramString = com.tencent.mm.sdk.f.b.ako(paramString);
    AppMethodBeat.o(80487);
    return paramString;
  }

  public static String bOO()
  {
    int i = 0;
    AppMethodBeat.i(80483);
    try
    {
      j = y.Me();
      if (j == 0)
      {
        String str1 = "127.0.0.1";
        AppMethodBeat.o(80483);
        return str1;
      }
    }
    catch (Exception localException1)
    {
      while (true)
      {
        ab.e("MicroMsg.WebViewUtil", "getSelfIp, call NetworkDetailInfo.getNetType(), exp = %s", new Object[] { localException1 });
        int j = i;
        continue;
        Object localObject1;
        if (j == 1)
        {
          localObject1 = fU(ah.getContext());
          AppMethodBeat.o(80483);
        }
        else
        {
          Object localObject2;
          try
          {
            do
            {
              localObject1 = NetworkInterface.getNetworkInterfaces();
              Enumeration localEnumeration;
              while (!localEnumeration.hasMoreElements())
              {
                do
                {
                  if (!((Enumeration)localObject1).hasMoreElements())
                    break;
                  localObject2 = (NetworkInterface)((Enumeration)localObject1).nextElement();
                }
                while (localObject2 == null);
                localEnumeration = ((NetworkInterface)localObject2).getInetAddresses();
              }
              localObject2 = (InetAddress)localEnumeration.nextElement();
            }
            while ((localObject2 == null) || (((InetAddress)localObject2).isLoopbackAddress()) || (!(localObject2 instanceof Inet4Address)));
            if (!bo.isNullOrNil(((InetAddress)localObject2).getHostAddress()))
              break label180;
            localObject1 = "127.0.0.1";
            AppMethodBeat.o(80483);
          }
          catch (Exception localException2)
          {
            str2 = "127.0.0.1";
            AppMethodBeat.o(80483);
          }
          continue;
          label180: String str2 = ((InetAddress)localObject2).getHostAddress();
          AppMethodBeat.o(80483);
        }
      }
    }
  }

  @Deprecated
  public static String bh(Context paramContext, String paramString)
  {
    AppMethodBeat.i(80467);
    paramContext = q.a(paramContext, paramString, (q.a)e.B(q.a.class));
    AppMethodBeat.o(80467);
    return paramContext;
  }

  public static String cXS()
  {
    AppMethodBeat.i(80485);
    Object localObject = (ConnectivityManager)ah.getContext().getSystemService("connectivity");
    if (localObject == null)
    {
      localObject = "no";
      AppMethodBeat.o(80485);
    }
    while (true)
    {
      return localObject;
      localObject = ((ConnectivityManager)localObject).getActiveNetworkInfo();
      if (localObject == null)
      {
        localObject = "no";
        AppMethodBeat.o(80485);
      }
      else if (((NetworkInfo)localObject).getType() == 1)
      {
        localObject = "WIFI";
        AppMethodBeat.o(80485);
      }
      else
      {
        ab.d("MicroMsg.WebViewUtil", "activeNetInfo extra=%s, type=%d, %s", new Object[] { ((NetworkInfo)localObject).getExtraInfo(), Integer.valueOf(((NetworkInfo)localObject).getType()), ((NetworkInfo)localObject).getExtraInfo() });
        if (((NetworkInfo)localObject).getExtraInfo() != null)
        {
          localObject = ((NetworkInfo)localObject).getExtraInfo().toLowerCase();
          AppMethodBeat.o(80485);
        }
        else
        {
          localObject = "no";
          AppMethodBeat.o(80485);
        }
      }
    }
  }

  public static void d(WebView paramWebView)
  {
    AppMethodBeat.i(80473);
    if (paramWebView == null)
      AppMethodBeat.o(80473);
    while (true)
    {
      return;
      a(new u.1(paramWebView));
      AppMethodBeat.o(80473);
    }
  }

  private static String fU(Context paramContext)
  {
    AppMethodBeat.i(80482);
    paramContext = (WifiManager)paramContext.getSystemService("wifi");
    try
    {
      paramContext = paramContext.getConnectionInfo();
      if (paramContext == null)
      {
        paramContext = "127.0.0.1";
        AppMethodBeat.o(80482);
        return paramContext;
      }
    }
    catch (Exception paramContext)
    {
      while (true)
      {
        paramContext = null;
        continue;
        int i = paramContext.getIpAddress();
        paramContext = String.format("%d.%d.%d.%d", new Object[] { Integer.valueOf(i & 0xFF), Integer.valueOf(i >> 8 & 0xFF), Integer.valueOf(i >> 16 & 0xFF), Integer.valueOf(i >> 24 & 0xFF) });
        AppMethodBeat.o(80482);
      }
    }
  }

  @Deprecated
  public static PackageInfo getPackageInfo(Context paramContext, String paramString)
  {
    AppMethodBeat.i(80470);
    paramContext = com.tencent.mm.plugin.appbrand.r.b.getPackageInfo(paramContext, paramString);
    AppMethodBeat.o(80470);
    return paramContext;
  }

  public static String hL(String paramString1, String paramString2)
  {
    AppMethodBeat.i(80478);
    if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)))
    {
      ab.e("MicroMsg.WebViewUtil", "genJsCode fail, invalid argument, scheme = %s, jsCode = %s", new Object[] { paramString1, paramString2 });
      paramString1 = null;
      AppMethodBeat.o(80478);
    }
    while (true)
    {
      return paramString1;
      ab.d("MicroMsg.WebViewUtil", "genJsCode, scheme = %s, jsCode = %s", new Object[] { paramString1, paramString2 });
      paramString1 = "document.getElementById('_edw_iframe_').src = '" + paramString1 + "' + " + paramString2;
      AppMethodBeat.o(80478);
    }
  }

  public static boolean t(String paramString1, String paramString2)
  {
    AppMethodBeat.i(80469);
    boolean bool = h.t(paramString1, paramString2);
    AppMethodBeat.o(80469);
    return bool;
  }

  public static abstract interface b
  {
    public abstract void akp(String paramString);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.tools.u
 * JD-Core Version:    0.6.2
 */