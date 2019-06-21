package com.tencent.mm.plugin.appbrand.l;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.o;
import com.tencent.mm.plugin.appbrand.b.b;
import com.tencent.mm.plugin.appbrand.jsapi.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.InterfaceAddress;
import java.net.NetworkInterface;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import org.apache.http.conn.util.InetAddressUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public enum j
{
  public static HashMap<String, String> CP(String paramString)
  {
    AppMethodBeat.i(108190);
    String str1 = "";
    Object localObject1 = "";
    String str2 = "";
    Object localObject2 = localObject1;
    String str3 = str1;
    try
    {
      Uri localUri = Uri.parse(paramString);
      localObject2 = localObject1;
      str3 = str1;
      paramString = localUri.getHost();
      localObject2 = localObject1;
      str3 = paramString;
      localObject1 = localUri.getScheme();
      localObject2 = localObject1;
      str3 = paramString;
      int i = localUri.getPort();
      str2 = String.valueOf(i);
      str3 = paramString;
      localObject2 = localObject1;
      paramString = str2;
      localObject1 = new HashMap();
      ((HashMap)localObject1).put("host", str3);
      ((HashMap)localObject1).put("scheme", localObject2);
      ((HashMap)localObject1).put("port", paramString);
      AppMethodBeat.o(108190);
      return localObject1;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.AppBrandNetworkUtil", paramString, "Exception: parseUrl error", new Object[0]);
        paramString = str2;
      }
    }
  }

  private static boolean CQ(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(108196);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.AppBrandNetworkUtil", "matchUrl fail, url is null");
      AppMethodBeat.o(108196);
    }
    while (true)
    {
      return bool;
      paramString = paramString.split("\\.");
      if (paramString.length != 4)
      {
        ab.e("MicroMsg.AppBrandNetworkUtil", "matchUrl fail, invalid ip format");
        AppMethodBeat.o(108196);
      }
      else
      {
        int i = paramString.length;
        for (int j = 0; ; j++)
        {
          if (j >= i)
            break label109;
          int k = bo.getInt(paramString[j], -1);
          if ((k < 0) || (k > 255))
          {
            ab.e("MicroMsg.AppBrandNetworkUtil", "matchUrl fail, invalid ip format");
            AppMethodBeat.o(108196);
            break;
          }
        }
        label109: bool = true;
        AppMethodBeat.o(108196);
      }
    }
  }

  // ERROR //
  public static int CR(String paramString)
  {
    // Byte code:
    //   0: ldc 109
    //   2: invokestatic 23	com/tencent/matrix/trace/core/AppMethodBeat:i	(I)V
    //   5: aload_0
    //   6: invokestatic 111	com/tencent/mm/plugin/appbrand/l/j:CQ	(Ljava/lang/String;)Z
    //   9: ifne +19 -> 28
    //   12: ldc 68
    //   14: ldc 90
    //   16: invokestatic 94	com/tencent/mm/sdk/platformtools/ab:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   19: ldc 109
    //   21: invokestatic 66	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   24: iconst_0
    //   25: istore_1
    //   26: iload_1
    //   27: ireturn
    //   28: aload_0
    //   29: ldc 96
    //   31: invokevirtual 100	java/lang/String:split	(Ljava/lang/String;)[Ljava/lang/String;
    //   34: astore_2
    //   35: iconst_4
    //   36: newarray byte
    //   38: dup
    //   39: iconst_0
    //   40: aload_2
    //   41: iconst_0
    //   42: aaload
    //   43: iconst_0
    //   44: invokestatic 106	com/tencent/mm/sdk/platformtools/bo:getInt	(Ljava/lang/String;I)I
    //   47: sipush 255
    //   50: iand
    //   51: i2b
    //   52: bastore
    //   53: dup
    //   54: iconst_1
    //   55: aload_2
    //   56: iconst_1
    //   57: aaload
    //   58: iconst_0
    //   59: invokestatic 106	com/tencent/mm/sdk/platformtools/bo:getInt	(Ljava/lang/String;I)I
    //   62: sipush 255
    //   65: iand
    //   66: i2b
    //   67: bastore
    //   68: dup
    //   69: iconst_2
    //   70: aload_2
    //   71: iconst_2
    //   72: aaload
    //   73: iconst_0
    //   74: invokestatic 106	com/tencent/mm/sdk/platformtools/bo:getInt	(Ljava/lang/String;I)I
    //   77: sipush 255
    //   80: iand
    //   81: i2b
    //   82: bastore
    //   83: dup
    //   84: iconst_3
    //   85: aload_2
    //   86: iconst_3
    //   87: aaload
    //   88: iconst_0
    //   89: invokestatic 106	com/tencent/mm/sdk/platformtools/bo:getInt	(Ljava/lang/String;I)I
    //   92: sipush 255
    //   95: iand
    //   96: i2b
    //   97: bastore
    //   98: invokestatic 117	com/tencent/mm/a/o:A	([B)I
    //   101: istore_3
    //   102: invokestatic 123	com/tencent/mm/sdk/platformtools/ah:getContext	()Landroid/content/Context;
    //   105: invokevirtual 128	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   108: ldc 130
    //   110: invokevirtual 134	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   113: checkcast 136	android/net/wifi/WifiManager
    //   116: astore_2
    //   117: aload_2
    //   118: invokevirtual 139	android/net/wifi/WifiManager:getWifiState	()I
    //   121: iconst_3
    //   122: if_icmpne +151 -> 273
    //   125: aload_2
    //   126: invokevirtual 143	android/net/wifi/WifiManager:getConnectionInfo	()Landroid/net/wifi/WifiInfo;
    //   129: invokevirtual 148	android/net/wifi/WifiInfo:getIpAddress	()I
    //   132: istore 4
    //   134: new 150	java/lang/StringBuilder
    //   137: dup
    //   138: invokespecial 151	java/lang/StringBuilder:<init>	()V
    //   141: iload 4
    //   143: sipush 255
    //   146: iand
    //   147: invokevirtual 155	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   150: ldc 157
    //   152: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   155: iload 4
    //   157: bipush 8
    //   159: ishr
    //   160: sipush 255
    //   163: iand
    //   164: invokevirtual 155	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   167: ldc 157
    //   169: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   172: iload 4
    //   174: bipush 16
    //   176: ishr
    //   177: sipush 255
    //   180: iand
    //   181: invokevirtual 155	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   184: ldc 157
    //   186: invokevirtual 160	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   189: iload 4
    //   191: bipush 24
    //   193: ishr
    //   194: sipush 255
    //   197: iand
    //   198: invokevirtual 155	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   201: invokevirtual 163	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   204: astore 5
    //   206: aload_2
    //   207: invokevirtual 167	android/net/wifi/WifiManager:getDhcpInfo	()Landroid/net/DhcpInfo;
    //   210: getfield 173	android/net/DhcpInfo:netmask	I
    //   213: istore_1
    //   214: ldc 68
    //   216: ldc 175
    //   218: iconst_5
    //   219: anewarray 72	java/lang/Object
    //   222: dup
    //   223: iconst_0
    //   224: aload_0
    //   225: aastore
    //   226: dup
    //   227: iconst_1
    //   228: aload 5
    //   230: aastore
    //   231: dup
    //   232: iconst_2
    //   233: iload_3
    //   234: invokestatic 180	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   237: aastore
    //   238: dup
    //   239: iconst_3
    //   240: iload 4
    //   242: invokestatic 180	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   245: aastore
    //   246: dup
    //   247: iconst_4
    //   248: iload_1
    //   249: invokestatic 180	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   252: aastore
    //   253: invokestatic 183	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   256: iload_1
    //   257: i2l
    //   258: iload_3
    //   259: iload 4
    //   261: invokestatic 187	com/tencent/mm/plugin/appbrand/l/j:f	(JII)I
    //   264: istore_1
    //   265: ldc 109
    //   267: invokestatic 66	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   270: goto -244 -> 26
    //   273: aload_2
    //   274: invokevirtual 191	java/lang/Object:getClass	()Ljava/lang/Class;
    //   277: ldc 193
    //   279: invokevirtual 199	java/lang/Class:getField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   282: aload_2
    //   283: invokevirtual 205	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   286: checkcast 177	java/lang/Integer
    //   289: invokevirtual 208	java/lang/Integer:intValue	()I
    //   292: istore_1
    //   293: aload_2
    //   294: invokevirtual 191	java/lang/Object:getClass	()Ljava/lang/Class;
    //   297: ldc 210
    //   299: iconst_0
    //   300: anewarray 195	java/lang/Class
    //   303: invokevirtual 214	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   306: aload_2
    //   307: iconst_0
    //   308: anewarray 72	java/lang/Object
    //   311: invokevirtual 220	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   314: checkcast 177	java/lang/Integer
    //   317: invokevirtual 208	java/lang/Integer:intValue	()I
    //   320: istore 4
    //   322: iload 4
    //   324: iload_1
    //   325: if_icmpne +45 -> 370
    //   328: ldc 68
    //   330: ldc 222
    //   332: invokestatic 224	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   335: iload_3
    //   336: invokestatic 228	com/tencent/mm/plugin/appbrand/l/j:pn	(I)I
    //   339: istore_1
    //   340: ldc 109
    //   342: invokestatic 66	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   345: goto -319 -> 26
    //   348: astore_0
    //   349: bipush 13
    //   351: istore_1
    //   352: ldc 68
    //   354: aload_0
    //   355: ldc 230
    //   357: iconst_0
    //   358: anewarray 72	java/lang/Object
    //   361: invokestatic 78	com/tencent/mm/sdk/platformtools/ab:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   364: iconst_0
    //   365: istore 4
    //   367: goto -45 -> 322
    //   370: ldc 68
    //   372: ldc 232
    //   374: iconst_1
    //   375: anewarray 72	java/lang/Object
    //   378: dup
    //   379: iconst_0
    //   380: iload 4
    //   382: invokestatic 180	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   385: aastore
    //   386: invokestatic 183	com/tencent/mm/sdk/platformtools/ab:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   389: ldc 109
    //   391: invokestatic 66	com/tencent/matrix/trace/core/AppMethodBeat:o	(I)V
    //   394: iconst_0
    //   395: istore_1
    //   396: goto -370 -> 26
    //   399: astore_0
    //   400: goto -48 -> 352
    //
    // Exception table:
    //   from	to	target	type
    //   273	293	348	java/lang/Exception
    //   293	322	399	java/lang/Exception
  }

  public static String CS(String paramString)
  {
    return paramString;
  }

  private static Map<String, String> E(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(108191);
    HashMap localHashMap = new HashMap();
    try
    {
      JSONObject localJSONObject = paramJSONObject.optJSONObject("header");
      if (localJSONObject != null)
      {
        Iterator localIterator = localJSONObject.keys();
        while (localIterator.hasNext())
        {
          paramJSONObject = (String)localIterator.next();
          if (paramJSONObject != null)
            localHashMap.put(paramJSONObject.toLowerCase(), localJSONObject.getString(paramJSONObject));
        }
      }
    }
    catch (Exception paramJSONObject)
    {
      ab.printErrStackTrace("MicroMsg.AppBrandNetworkUtil", paramJSONObject, "Exception: get header error", new Object[0]);
      AppMethodBeat.o(108191);
    }
    return localHashMap;
  }

  public static Map<String, String> F(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(108192);
    HashMap localHashMap = new HashMap();
    try
    {
      JSONObject localJSONObject = paramJSONObject.optJSONObject("formData");
      if (localJSONObject != null)
      {
        paramJSONObject = localJSONObject.keys();
        while (paramJSONObject.hasNext())
        {
          String str = (String)paramJSONObject.next();
          localHashMap.put(str, localJSONObject.getString(str));
        }
      }
    }
    catch (Exception paramJSONObject)
    {
      ab.printErrStackTrace("MicroMsg.AppBrandNetworkUtil", paramJSONObject, "Exception: get form error", new Object[0]);
      AppMethodBeat.o(108192);
    }
    return localHashMap;
  }

  public static String G(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(108211);
    if (paramJSONObject == null)
    {
      AppMethodBeat.o(108211);
      paramJSONObject = null;
    }
    while (true)
    {
      return paramJSONObject;
      LinkedList localLinkedList = new LinkedList();
      paramJSONObject = paramJSONObject.optJSONArray("protocols");
      if ((paramJSONObject != null) && (paramJSONObject.length() > 0))
        for (int i = 0; i < paramJSONObject.length(); i++)
          localLinkedList.add(paramJSONObject.optString(i));
      if (!bo.ek(localLinkedList))
      {
        paramJSONObject = TextUtils.join(", ", localLinkedList);
        AppMethodBeat.o(108211);
      }
      else
      {
        AppMethodBeat.o(108211);
        paramJSONObject = null;
      }
    }
  }

  public static int a(a parama, int paramInt)
  {
    switch (paramInt)
    {
    default:
      paramInt = 0;
    case 0:
    case 1:
    case 3:
    case 2:
    }
    while (true)
    {
      return paramInt;
      paramInt = parama.iog;
      continue;
      paramInt = parama.ioh;
      continue;
      paramInt = parama.ioj;
      continue;
      paramInt = parama.ioi;
    }
  }

  public static String a(URI paramURI)
  {
    AppMethodBeat.i(108212);
    Object localObject1 = paramURI.getScheme();
    if (bo.isNullOrNil((String)localObject1))
    {
      paramURI = null;
      AppMethodBeat.o(108212);
      return paramURI;
    }
    Object localObject2;
    if (((String)localObject1).equalsIgnoreCase("wss"))
    {
      localObject2 = "https";
      label42: localObject1 = new StringBuilder((String)localObject2);
      ((StringBuilder)localObject1).append("://");
      ((StringBuilder)localObject1).append(paramURI.getHost());
      i = paramURI.getPort();
      if ((i != -1) && ((!((String)localObject2).equalsIgnoreCase("http")) || (i != 80)) && ((!((String)localObject2).equalsIgnoreCase("https")) || (i != 443)))
        break label167;
    }
    label167: for (int i = 1; ; i = 0)
    {
      if (i == 0)
      {
        ((StringBuilder)localObject1).append(":");
        ((StringBuilder)localObject1).append(paramURI.getPort());
      }
      paramURI = ((StringBuilder)localObject1).toString();
      AppMethodBeat.o(108212);
      break;
      localObject2 = localObject1;
      if (!((String)localObject1).equalsIgnoreCase("ws"))
        break label42;
      localObject2 = "http";
      break label42;
    }
  }

  public static Map<String, String> a(JSONObject paramJSONObject, a parama)
  {
    AppMethodBeat.i(108200);
    paramJSONObject = E(paramJSONObject);
    if (parama == null)
    {
      ab.e("MicroMsg.AppBrandNetworkUtil", "hy: no network config!");
      AppMethodBeat.o(108200);
      return paramJSONObject;
    }
    Object localObject1;
    if (parama.mode == 1)
    {
      localObject1 = paramJSONObject;
      if (parama.iol != null)
      {
        localObject1 = parama.iol;
        if ((localObject1 != null) && (!((ArrayList)localObject1).isEmpty()))
          break label115;
        ab.e("MicroMsg.AppBrandNetworkUtil", "filterHttpHeaderBlackList fail, headerMap is null or blacklist is null or nil.");
      }
    }
    while (true)
    {
      label72: localObject1 = paramJSONObject;
      label115: String str1;
      do
      {
        do
        {
          ((Map)localObject1).remove("referer");
          paramJSONObject = (JSONObject)localObject1;
          if (TextUtils.isEmpty(parama.referer))
            break;
          ((Map)localObject1).put("referer", parama.referer);
          paramJSONObject = (JSONObject)localObject1;
          break;
          localObject1 = ((ArrayList)localObject1).iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject2 = (String)((Iterator)localObject1).next();
            if (localObject2 != null)
            {
              localObject2 = ((String)localObject2).toLowerCase();
              str1 = (String)paramJSONObject.remove(localObject2);
              if (str1 != null)
                ab.v("MicroMsg.AppBrandNetworkUtil", "remove key %s value %s", new Object[] { localObject2, str1 });
            }
          }
          break label72;
          localObject1 = paramJSONObject;
        }
        while (parama.mode != 2);
        localObject1 = paramJSONObject;
      }
      while (parama.iom == null);
      Object localObject2 = parama.iom;
      if (localObject2 == null)
      {
        ab.e("MicroMsg.AppBrandNetworkUtil", "filterHttpHeaderWhiteList fail");
      }
      else
      {
        localObject1 = new HashMap();
        localObject2 = ((ArrayList)localObject2).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          str1 = (String)((Iterator)localObject2).next();
          if (str1 != null)
          {
            String str2 = str1.toLowerCase();
            str1 = (String)paramJSONObject.get(str2);
            if (str1 != null)
            {
              ab.v("MicroMsg.AppBrandNetworkUtil", "add item, key(%s), value(%s)", new Object[] { str2, str1 });
              ((Map)localObject1).put(str2, str1);
            }
          }
        }
        paramJSONObject = (JSONObject)localObject1;
      }
    }
  }

  public static SSLContext a(a parama)
  {
    Object localObject = null;
    AppMethodBeat.i(108203);
    n localn = b(parama);
    if (localn == null)
    {
      AppMethodBeat.o(108203);
      parama = localObject;
    }
    while (true)
    {
      return parama;
      try
      {
        parama = SSLContext.getInstance("TLS");
        parama.init(null, new TrustManager[] { localn }, null);
        AppMethodBeat.o(108203);
      }
      catch (Exception parama)
      {
        ab.printErrStackTrace("MicroMsg.AppBrandNetworkUtil", parama, "Exception: SSLContext init error", new Object[0]);
        AppMethodBeat.o(108203);
        parama = localObject;
      }
    }
  }

  public static void a(HttpURLConnection paramHttpURLConnection, ArrayList<String> paramArrayList)
  {
    AppMethodBeat.i(108202);
    if (paramHttpURLConnection == null)
      AppMethodBeat.o(108202);
    while (true)
    {
      return;
      HostnameVerifier localHostnameVerifier = HttpsURLConnection.getDefaultHostnameVerifier();
      ((HttpsURLConnection)paramHttpURLConnection).setHostnameVerifier(new j.1(localHostnameVerifier, paramArrayList));
      AppMethodBeat.o(108202);
    }
  }

  public static boolean a(ArrayList<String> paramArrayList, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(108194);
    if (b(paramArrayList, paramString, paramBoolean))
    {
      AppMethodBeat.o(108194);
      paramBoolean = true;
    }
    while (true)
    {
      return paramBoolean;
      if (CR((String)CP(paramString).get("host")) == 2)
      {
        ab.e("MicroMsg.AppBrandNetworkUtil", "matchUrl, url in the same net %s", new Object[] { paramString });
        AppMethodBeat.o(108194);
        paramBoolean = true;
      }
      else
      {
        AppMethodBeat.o(108194);
        paramBoolean = false;
      }
    }
  }

  public static n b(a parama)
  {
    AppMethodBeat.i(108204);
    Object localObject = new LinkedList();
    Iterator localIterator = parama.ion.iterator();
    while (localIterator.hasNext())
    {
      byte[] arrayOfByte = (byte[])localIterator.next();
      if ((arrayOfByte != null) && (arrayOfByte.length != 0))
        ((LinkedList)localObject).add(new ByteArrayInputStream(arrayOfByte));
    }
    if (((LinkedList)localObject).isEmpty())
      if ((parama.iop == 1) || (parama.iop == 2))
      {
        ab.i("MicroMsg.AppBrandNetworkUtil", "getTrustManagerWithSelfSignedCertificates debug type");
        parama = new n(parama.iop);
        parama.init();
        AppMethodBeat.o(108204);
      }
    while (true)
    {
      return parama;
      parama = null;
      AppMethodBeat.o(108204);
      continue;
      parama = new n(parama.iop);
      localObject = ((LinkedList)localObject).iterator();
      while (((Iterator)localObject).hasNext())
        parama.B((InputStream)((Iterator)localObject).next());
      parama.init();
      AppMethodBeat.o(108204);
    }
  }

  public static boolean b(b paramb)
  {
    AppMethodBeat.i(108205);
    boolean bool;
    switch (j.2.gWN[paramb.ordinal()])
    {
    default:
      bool = false;
      AppMethodBeat.o(108205);
    case 1:
    case 2:
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(108205);
    }
  }

  public static boolean b(ArrayList<String> paramArrayList, String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(108195);
    if (bo.isNullOrNil(paramString))
    {
      ab.e("MicroMsg.AppBrandNetworkUtil", "matchUrl fail, url is null");
      paramBoolean = false;
      AppMethodBeat.o(108195);
    }
    while (true)
    {
      return paramBoolean;
      if ((paramArrayList == null) || (paramArrayList.size() == 0))
      {
        ab.e("MicroMsg.AppBrandNetworkUtil", "matchUrl fail, configUrls is empty");
        paramBoolean = false;
        AppMethodBeat.o(108195);
      }
      else
      {
        ab.i("MicroMsg.AppBrandNetworkUtil", "url ".concat(String.valueOf(paramString)));
        ab.i("MicroMsg.AppBrandNetworkUtil", "configUrl size " + paramArrayList.size());
        Object localObject1 = CP(paramString);
        paramString = (String)((HashMap)localObject1).get("host");
        String str1 = (String)((HashMap)localObject1).get("scheme");
        localObject1 = (String)((HashMap)localObject1).get("port");
        if ((bo.isNullOrNil(paramString)) || (bo.isNullOrNil(str1)))
        {
          paramBoolean = false;
          AppMethodBeat.o(108195);
        }
        else
        {
          ab.i("MicroMsg.AppBrandNetworkUtil", "host %s  scheme %s port %s skipPortCheck %s", new Object[] { paramString, str1, localObject1, Boolean.valueOf(paramBoolean) });
          paramArrayList = paramArrayList.iterator();
          while (true)
            if (paramArrayList.hasNext())
            {
              String str2 = (String)paramArrayList.next();
              ab.i("MicroMsg.AppBrandNetworkUtil", "configUrl ".concat(String.valueOf(str2)));
              Object localObject2 = CP(str2);
              String str3 = (String)((HashMap)localObject2).get("host");
              str2 = (String)((HashMap)localObject2).get("scheme");
              localObject2 = (String)((HashMap)localObject2).get("port");
              ab.i("MicroMsg.AppBrandNetworkUtil", "confighost %s  configscheme %s configport %s", new Object[] { str3, str2, localObject2 });
              if ((paramString.equalsIgnoreCase(str3)) && (str1.equalsIgnoreCase(str2)) && ((paramBoolean) || (((String)localObject1).equalsIgnoreCase((String)localObject2))))
              {
                ab.i("MicroMsg.AppBrandNetworkUtil", "match!!");
                paramBoolean = true;
                AppMethodBeat.o(108195);
                break;
              }
            }
          paramBoolean = false;
          AppMethodBeat.o(108195);
        }
      }
    }
  }

  public static String c(HttpURLConnection paramHttpURLConnection)
  {
    AppMethodBeat.i(108201);
    if (paramHttpURLConnection == null)
    {
      paramHttpURLConnection = "";
      AppMethodBeat.o(108201);
    }
    while (true)
    {
      return paramHttpURLConnection;
      URL localURL = paramHttpURLConnection.getURL();
      if (localURL == null)
      {
        paramHttpURLConnection = "";
        AppMethodBeat.o(108201);
      }
      else
      {
        String str1 = paramHttpURLConnection.getHeaderField("Location");
        String str2 = str1;
        if (str1 == null)
          str2 = paramHttpURLConnection.getHeaderField("location");
        if (str2 == null)
        {
          paramHttpURLConnection = null;
          AppMethodBeat.o(108201);
        }
        else
        {
          try
          {
            paramHttpURLConnection = localURL.toURI().resolve(str2).toString();
            AppMethodBeat.o(108201);
          }
          catch (URISyntaxException paramHttpURLConnection)
          {
            ab.printErrStackTrace("MicroMsg.AppBrandNetworkUtil", paramHttpURLConnection, "URISyntaxException: resolve url error", new Object[0]);
            AppMethodBeat.o(108201);
            paramHttpURLConnection = str2;
          }
        }
      }
    }
  }

  public static boolean c(ArrayList<String> paramArrayList, String paramString)
  {
    AppMethodBeat.i(108193);
    boolean bool = a(paramArrayList, paramString, false);
    AppMethodBeat.o(108193);
    return bool;
  }

  private static JSONArray d(HttpURLConnection paramHttpURLConnection)
  {
    AppMethodBeat.i(108206);
    JSONArray localJSONArray = new JSONArray();
    if (paramHttpURLConnection == null)
      AppMethodBeat.o(108206);
    while (true)
    {
      return localJSONArray;
      Map localMap = paramHttpURLConnection.getHeaderFields();
      if (localMap == null)
        AppMethodBeat.o(108206);
      else
        try
        {
          if (localMap.containsKey("Set-Cookie"))
          {
            paramHttpURLConnection = (List)localMap.get("Set-Cookie");
            if (paramHttpURLConnection != null)
            {
              boolean bool = paramHttpURLConnection.isEmpty();
              if (!bool);
            }
            else
            {
              AppMethodBeat.o(108206);
              continue;
            }
            ab.d("MicroMsg.AppBrandNetworkUtil", "getResponseHeaderCookies Set-Cookie:%s", new Object[] { localMap.toString() });
            paramHttpURLConnection = paramHttpURLConnection.iterator();
            while (paramHttpURLConnection.hasNext())
              localJSONArray.put((String)paramHttpURLConnection.next());
          }
        }
        catch (Exception paramHttpURLConnection)
        {
          ab.e("MicroMsg.AppBrandNetworkUtil", "getResponseHeaderCookies error : %s", new Object[] { Log.getStackTraceString(paramHttpURLConnection) });
          AppMethodBeat.o(108206);
        }
    }
  }

  public static JSONObject e(HttpURLConnection paramHttpURLConnection)
  {
    AppMethodBeat.i(108207);
    JSONObject localJSONObject = new JSONObject();
    if (paramHttpURLConnection == null)
      AppMethodBeat.o(108207);
    while (true)
    {
      return localJSONObject;
      Object localObject1 = paramHttpURLConnection.getHeaderFields();
      if (localObject1 == null)
      {
        AppMethodBeat.o(108207);
        continue;
      }
      localObject1 = ((Map)localObject1).entrySet().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        Object localObject2 = (Map.Entry)((Iterator)localObject1).next();
        String str = (String)((Map.Entry)localObject2).getKey();
        List localList = (List)((Map.Entry)localObject2).getValue();
        if ((!bo.isNullOrNil(str)) && (localList != null) && (!localList.isEmpty()))
        {
          localObject2 = new StringBuilder();
          ((StringBuilder)localObject2).append((String)localList.get(0));
          for (int i = 1; i < localList.size(); i++)
          {
            ((StringBuilder)localObject2).append(",");
            ((StringBuilder)localObject2).append((String)localList.get(i));
          }
          try
          {
            localJSONObject.put(str, ((StringBuilder)localObject2).toString());
          }
          catch (JSONException localJSONException)
          {
            ab.printErrStackTrace("MicroMsg.AppBrandNetworkUtil", localJSONException, "JSONException: put header error", new Object[0]);
          }
        }
      }
      paramHttpURLConnection = d(paramHttpURLConnection);
      try
      {
        if (paramHttpURLConnection.length() > 0)
          localJSONObject.put("cookies", paramHttpURLConnection);
        AppMethodBeat.o(108207);
      }
      catch (JSONException paramHttpURLConnection)
      {
        while (true)
          ab.e("MicroMsg.AppBrandNetworkUtil", "put header error : %s", new Object[] { Log.getStackTraceString(paramHttpURLConnection) });
      }
    }
  }

  private static int f(long paramLong, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(108199);
    int i = o.A(new byte[] { -1, -1, -1, 0 });
    long[] arrayOfLong = new long[4];
    if (paramLong > 0L)
    {
      arrayOfLong[0] = (paramLong >>> 24);
      arrayOfLong[1] = ((0xFFFFFF & paramLong) >>> 16);
      arrayOfLong[2] = ((0xFFFF & paramLong) >>> 8);
      arrayOfLong[3] = (0xFF & paramLong);
    }
    int j = 0;
    int k = 0;
    int m = j;
    if (k < 4)
    {
      j = (int)(j + arrayOfLong[k]);
      if ((arrayOfLong[k] < 0L) || (arrayOfLong[k] > 255L))
        m = -1;
    }
    else
    {
      if (m <= 0)
        paramLong = i;
      ab.i("MicroMsg.AppBrandNetworkUtil", "matchNetMask oldIpInt:%d, localIpInt:%d, netmask:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), Long.valueOf(paramLong) });
      if ((paramInt1 & paramLong) != (paramInt2 & paramLong))
        break label229;
      if (paramInt1 != paramInt2)
        break label218;
      paramInt1 = 1;
      AppMethodBeat.o(108199);
    }
    while (true)
    {
      return paramInt1;
      k++;
      break;
      label218: paramInt1 = 2;
      AppMethodBeat.o(108199);
      continue;
      label229: paramInt1 = 0;
      AppMethodBeat.o(108199);
    }
  }

  public static JSONObject f(HttpURLConnection paramHttpURLConnection)
  {
    AppMethodBeat.i(108209);
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("__AppBrandRemoteDebugRequestHeader__", true);
      if (paramHttpURLConnection == null)
      {
        AppMethodBeat.o(108209);
        return localJSONObject;
      }
    }
    catch (JSONException localJSONException1)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.AppBrandNetworkUtil", localJSONException1, "JSONException: put header error", new Object[0]);
        continue;
        paramHttpURLConnection = paramHttpURLConnection.getRequestProperties();
        if (paramHttpURLConnection == null)
        {
          AppMethodBeat.o(108209);
        }
        else
        {
          paramHttpURLConnection = paramHttpURLConnection.entrySet().iterator();
          while (paramHttpURLConnection.hasNext())
          {
            Object localObject = (Map.Entry)paramHttpURLConnection.next();
            String str = (String)((Map.Entry)localObject).getKey();
            localObject = (List)((Map.Entry)localObject).getValue();
            if ((!bo.isNullOrNil(str)) && (localObject != null) && (!((List)localObject).isEmpty()))
            {
              StringBuilder localStringBuilder = new StringBuilder();
              localStringBuilder.append((String)((List)localObject).get(0));
              for (int i = 1; i < ((List)localObject).size(); i++)
              {
                localStringBuilder.append(",");
                localStringBuilder.append((String)((List)localObject).get(i));
              }
              try
              {
                localJSONObject.put(str, localStringBuilder.toString());
              }
              catch (JSONException localJSONException2)
              {
                ab.printErrStackTrace("MicroMsg.AppBrandNetworkUtil", localJSONException2, "JSONException: put header error", new Object[0]);
              }
            }
          }
          AppMethodBeat.o(108209);
        }
      }
    }
  }

  public static int g(long paramLong, int paramInt)
  {
    if (paramLong <= 0L)
      paramInt = 8192;
    while (true)
    {
      return paramInt;
      int i = paramInt;
      if (paramInt <= 0)
        i = 3;
      i = (int)(paramLong / i);
      if (i <= 524288)
      {
        paramInt = i;
        if (i >= 1024);
      }
      else if (i < 1024)
      {
        paramInt = 1024;
      }
      else
      {
        paramInt = 524288;
      }
    }
  }

  public static int gr(long paramLong)
  {
    AppMethodBeat.i(108210);
    int i = g(paramLong, -1);
    AppMethodBeat.o(108210);
    return i;
  }

  private static int pn(int paramInt)
  {
    AppMethodBeat.i(108198);
    try
    {
      Object localObject1;
      Object localObject3;
      boolean bool;
      do
      {
        do
        {
          localObject1 = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
          Iterator localIterator;
          while (!localIterator.hasNext())
          {
            if (!((Iterator)localObject1).hasNext())
              break;
            localIterator = ((NetworkInterface)((Iterator)localObject1).next()).getInterfaceAddresses().iterator();
          }
          localObject2 = (InterfaceAddress)localIterator.next();
        }
        while (((InterfaceAddress)localObject2).getAddress().isLoopbackAddress());
        localObject3 = ((InterfaceAddress)localObject2).getAddress().getHostAddress().toUpperCase();
        bool = InetAddressUtils.isIPv4Address((String)localObject3);
        ab.i("MicroMsg.AppBrandNetworkUtil", "check ip:%s, isIPv4:%b", new Object[] { localObject3, Boolean.valueOf(bool) });
      }
      while (!bool);
      if (!CQ((String)localObject3));
      for (int i = 0; ; i = o.A(new byte[] { (byte)(bo.getInt(localObject1[0], 0) & 0xFF), (byte)(bo.getInt(localObject1[1], 0) & 0xFF), (byte)(bo.getInt(localObject1[2], 0) & 0xFF), (byte)(bo.getInt(localObject1[3], 0) & 0xFF) }))
      {
        int j = ((InterfaceAddress)localObject2).getNetworkPrefixLength();
        localObject1 = new int[4];
        for (k = 0; k < 4; k++)
          localObject1[(3 - k)] = (-1 << 32 - j >> k * 8 & 0xFF);
        localObject1 = ((String)localObject3).split("\\.");
      }
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject2 = "" + localObject1[0];
      for (int k = 1; k < 4; k++)
      {
        localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        localObject2 = (String)localObject2 + "." + localObject1[k];
      }
      ab.i("MicroMsg.AppBrandNetworkUtil", "calcMaskByPrefixLength result:%s", new Object[] { localObject2 });
      localObject2 = ((String)localObject2).split("\\.");
      long l = o.A(new byte[] { (byte)(bo.getInt(localObject2[0], 0) & 0xFF), (byte)(bo.getInt(localObject2[1], 0) & 0xFF), (byte)(bo.getInt(localObject2[2], 0) & 0xFF), (byte)(bo.getInt(localObject2[3], 0) & 0xFF) });
      ab.i("MicroMsg.AppBrandNetworkUtil", "matchAddress oldIpInt:%d, localIpInt:%d, netmask:%d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(i), Long.valueOf(l) });
      paramInt = f(l, paramInt, i);
      AppMethodBeat.o(108198);
      return paramInt;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.AppBrandNetworkUtil", localException, "Exception: matchAddress error", new Object[0]);
        AppMethodBeat.o(108198);
        paramInt = 0;
      }
    }
  }

  public static boolean po(int paramInt)
  {
    if ((paramInt == 301) || (paramInt == 302));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static boolean y(c paramc)
  {
    AppMethodBeat.i(108208);
    boolean bool;
    switch (j.2.gWN[paramc.asD().ordinal()])
    {
    default:
      bool = false;
      AppMethodBeat.o(108208);
    case 1:
    case 2:
    }
    while (true)
    {
      return bool;
      bool = true;
      AppMethodBeat.o(108208);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.l.j
 * JD-Core Version:    0.6.2
 */