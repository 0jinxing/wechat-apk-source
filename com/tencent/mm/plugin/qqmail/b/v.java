package com.tencent.mm.plugin.qqmail.b;

import android.util.SparseArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bz.a;
import com.tencent.mm.kernel.g;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.z;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.net.HttpURLConnection;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.util.Collection;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class v
{
  private static SparseArray<String> puI = null;
  public p puD;
  public i puE;
  private k puF;
  private Map<Long, v.d> puG;
  private Map<Long, v.b> puH;
  private Map<String, String> pud;

  public v(int paramInt, String paramString)
  {
    AppMethodBeat.i(68004);
    this.pud = new HashMap();
    this.puG = new HashMap();
    this.puH = new HashMap();
    af.setHost("qqmail.weixin.qq.com:443");
    af.setUserAgent("weixin/" + paramString + "/0x" + Integer.toHexString(paramInt));
    reset();
    AppMethodBeat.o(68004);
  }

  private static String Bp(int paramInt)
  {
    AppMethodBeat.i(68018);
    Object localObject1;
    int i;
    int j;
    if (puI == null)
    {
      puI = new SparseArray();
      localObject1 = HttpURLConnection.class.getDeclaredFields();
      i = localObject1.length;
      j = 0;
    }
    while (true)
    {
      StringBuilder localStringBuilder;
      int k;
      Object localObject2;
      if (j < i)
      {
        localStringBuilder = localObject1[j];
        k = localStringBuilder.getModifiers();
        localObject2 = localStringBuilder.getName();
        if ((localObject2 == null) || (!((String)localObject2).startsWith("HTTP_")) || (!Modifier.isPublic(k)) || (!Modifier.isFinal(k)) || (!Modifier.isStatic(k)));
      }
      try
      {
        int m = localStringBuilder.getInt(Integer.valueOf(0));
        localStringBuilder = new java/lang/StringBuilder;
        localStringBuilder.<init>();
        localObject2 = ((String)localObject2).split("_");
        if (localObject2 != null)
        {
          for (k = 1; k < localObject2.length; k++)
            localStringBuilder.append(localObject2[k]).append(' ');
          localStringBuilder.append("error");
        }
        puI.put(m, localStringBuilder.toString().toLowerCase());
        label187: j++;
        continue;
        localObject1 = (String)puI.get(paramInt);
        if (localObject1 == null)
        {
          localObject1 = aX(paramInt, "request error");
          AppMethodBeat.o(68018);
        }
        while (true)
        {
          return localObject1;
          AppMethodBeat.o(68018);
        }
      }
      catch (Exception localException)
      {
        break label187;
      }
    }
  }

  private long a(String paramString, int paramInt, Map<String, String> paramMap, n.d paramd, v.c paramc, v.a parama)
  {
    AppMethodBeat.i(68010);
    Object localObject = paramMap;
    if (paramMap == null)
      localObject = new HashMap();
    ((Map)localObject).put("appname", "qqmail_weixin");
    ((Map)localObject).put("f", "xml");
    ((Map)localObject).put("charset", "utf-8");
    ((Map)localObject).put("clientip", getLocalIp());
    paramString = new v.d(this, paramString, new n.b(paramInt, (Map)localObject, getCookie(), paramd), parama);
    paramString.puR = paramc;
    al.d(new v.1(this, paramString));
    long l = paramString.id;
    AppMethodBeat.o(68010);
    return l;
  }

  private static String aX(int paramInt, String paramString)
  {
    AppMethodBeat.i(68019);
    int i = 0;
    switch (paramInt)
    {
    default:
      paramInt = i;
      if (paramInt == 0)
        AppMethodBeat.o(68019);
      break;
    case -1:
    case -4:
    case -3:
    case -7:
    case -104:
    case -105:
    case -6:
    case -102:
    case -103:
    }
    while (true)
    {
      return paramString;
      paramInt = 2131301995;
      break;
      paramInt = 2131302000;
      break;
      paramInt = 2131302002;
      break;
      paramInt = 2131301999;
      break;
      paramInt = 2131302001;
      break;
      paramInt = 2131301997;
      break;
      paramInt = 2131301998;
      break;
      paramString = a.an(ah.getContext(), paramInt);
      AppMethodBeat.o(68019);
    }
  }

  private void cancel()
  {
    AppMethodBeat.i(68011);
    Iterator localIterator = this.puH.values().iterator();
    while (localIterator.hasNext())
      ((v.b)localIterator.next()).cancel(true);
    this.puH.clear();
    this.puG.clear();
    AppMethodBeat.o(68011);
  }

  public static String ccw()
  {
    return "https://qqmail.weixin.qq.com:443";
  }

  private static String ccx()
  {
    AppMethodBeat.i(68020);
    Object localObject = new StringBuilder();
    g.RQ();
    localObject = g.RP().eJM + "mailapp/";
    AppMethodBeat.o(68020);
    return localObject;
  }

  public static String getDownloadPath()
  {
    AppMethodBeat.i(68015);
    String str = com.tencent.mm.compatible.util.e.euQ;
    com.tencent.mm.vfs.e.tf(str);
    AppMethodBeat.o(68015);
    return str;
  }

  private static String getLocalIp()
  {
    AppMethodBeat.i(68016);
    try
    {
      InetAddress localInetAddress;
      do
      {
        localObject1 = NetworkInterface.getNetworkInterfaces();
        Enumeration localEnumeration;
        while (!localEnumeration.hasMoreElements())
        {
          if (!((Enumeration)localObject1).hasMoreElements())
            break;
          localEnumeration = ((NetworkInterface)((Enumeration)localObject1).nextElement()).getInetAddresses();
        }
        localInetAddress = (InetAddress)localEnumeration.nextElement();
      }
      while (localInetAddress.isLoopbackAddress());
      Object localObject1 = localInetAddress.getHostAddress();
      AppMethodBeat.o(68016);
      return localObject1;
    }
    catch (Exception localException)
    {
      while (true)
      {
        Object localObject2 = null;
        AppMethodBeat.o(68016);
      }
    }
    catch (SocketException localSocketException)
    {
      label72: break label72;
    }
  }

  public final long a(String paramString1, String paramString2, String paramString3, v.c paramc, v.a parama)
  {
    AppMethodBeat.i(68009);
    long l = a(paramString1, 1, null, new n.d(paramString2, paramString3), paramc, parama);
    AppMethodBeat.o(68009);
    return l;
  }

  public final long a(String paramString, Map<String, String> paramMap, v.a parama)
  {
    AppMethodBeat.i(68005);
    long l = a(paramString, paramMap, new v.c(), parama);
    AppMethodBeat.o(68005);
    return l;
  }

  public final long a(String paramString, Map<String, String> paramMap, v.c paramc, v.a parama)
  {
    AppMethodBeat.i(68006);
    long l = a(paramString, 1, paramMap, null, paramc, parama);
    AppMethodBeat.o(68006);
    return l;
  }

  public final long b(String paramString, Map<String, String> paramMap, v.a parama)
  {
    AppMethodBeat.i(68007);
    long l = b(paramString, paramMap, new v.c(), parama);
    AppMethodBeat.o(68007);
    return l;
  }

  public final long b(String paramString, Map<String, String> paramMap, v.c paramc, v.a parama)
  {
    AppMethodBeat.i(68008);
    long l = a(paramString, 0, paramMap, null, paramc, parama);
    AppMethodBeat.o(68008);
    return l;
  }

  public final void cancel(long paramLong)
  {
    AppMethodBeat.i(68012);
    v.b localb = (v.b)this.puH.get(Long.valueOf(paramLong));
    if (localb != null)
    {
      localb.onCancelled();
      localb.cancel(true);
    }
    this.puH.remove(Long.valueOf(paramLong));
    this.puG.remove(Long.valueOf(paramLong));
    AppMethodBeat.o(68012);
  }

  public final void clearData()
  {
    AppMethodBeat.i(68014);
    com.tencent.mm.vfs.e.N(ccx(), true);
    reset();
    AppMethodBeat.o(68014);
  }

  public final Map<String, String> getCookie()
  {
    AppMethodBeat.i(68017);
    String str = (String)g.RP().Ry().get(-1535680990, null);
    Map localMap = this.pud;
    if (str == null);
    for (Object localObject = ""; ; localObject = str)
    {
      localMap.put("skey", localObject);
      int i = bo.g(g.RP().Ry().get(9, null), 0);
      this.pud.put("uin", "o" + new com.tencent.mm.a.p(i));
      ab.d("MicroMsg.NormalMailAppService", "sKey:%b, uin:%d", new Object[] { Boolean.valueOf(bo.isNullOrNil(str)), Integer.valueOf(i) });
      localObject = this.pud;
      AppMethodBeat.o(68017);
      return localObject;
    }
  }

  public final void reset()
  {
    AppMethodBeat.i(68013);
    af.Vg(getDownloadPath());
    cancel();
    this.pud.clear();
    String str = ccx();
    this.puD = new p(str + "addr/");
    this.puE = new i(str + "draft/");
    this.puF = new k(str + "http/", 0);
    AppMethodBeat.o(68013);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.b.v
 * JD-Core Version:    0.6.2
 */