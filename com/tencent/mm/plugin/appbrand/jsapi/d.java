package com.tencent.mm.plugin.appbrand.jsapi;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.text.TextUtils;
import android.util.SparseArray;
import com.tencent.luggage.a.b;
import com.tencent.luggage.a.e;
import com.tencent.luggage.bridge.a.a.a;
import com.tencent.luggage.bridge.a.a.b;
import com.tencent.mm.plugin.appbrand.appstorage.g;
import com.tencent.mm.plugin.appbrand.appstorage.p;
import com.tencent.mm.plugin.appbrand.h.i;
import com.tencent.mm.plugin.appbrand.s.q;
import com.tencent.mm.plugin.appbrand.s.q.a;
import com.tencent.mm.plugin.appbrand.s.q.b;
import com.tencent.mm.sdk.platformtools.al;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import junit.framework.Assert;
import org.json.JSONObject;

public abstract class d
  implements c
{
  private Handler bOB;
  private final AtomicInteger bOM = new AtomicInteger(0);
  private p gNH = new g();
  private final LinkedHashSet<k> gNJ;
  final com.tencent.mm.kernel.c.d gNK;
  protected boolean gNV;
  private final LinkedHashSet<j> htl;
  private i hvJ;
  private final l hvK;
  private final Map<String, m> hvL = new HashMap();
  protected c.b hvM;
  private final SparseArray<d.a> hvN = new SparseArray();

  public d()
  {
    Object localObject = new HandlerThread("AppBrandAsyncJSThread");
    ((HandlerThread)localObject).start();
    this.bOB = new Handler(((HandlerThread)localObject).getLooper());
    this.htl = new LinkedHashSet();
    this.gNJ = new LinkedHashSet();
    this.hvK = aCc();
    this.gNK = new com.tencent.mm.kernel.c.d();
    localObject = new d.1(this);
    if (com.tencent.luggage.bridge.a.a.bOP != null)
      com.tencent.luggage.bridge.a.a.bOP.a((a.a)localObject);
    this.gNV = false;
  }

  static JSONObject AI(String paramString)
  {
    String str = paramString;
    try
    {
      if (com.tencent.mm.sdk.platformtools.bo.isNullOrNil(paramString))
        str = "{}";
      paramString = new org/json/JSONObject;
      paramString.<init>(str);
      return paramString;
    }
    catch (Exception paramString)
    {
      while (true)
      {
        com.tencent.luggage.g.d.e("MicroMsg.AppBrandComponentImpl", paramString.getMessage());
        paramString = null;
      }
    }
  }

  private static String Q(String paramString1, String paramString2)
  {
    HashMap localHashMap = new HashMap();
    localHashMap.put("errMsg", paramString1 + ":" + paramString2);
    return new JSONObject(localHashMap).toString();
  }

  private String a(m paramm, String paramString, int paramInt)
  {
    boolean bool = false;
    if (!isRunning())
    {
      com.tencent.luggage.g.d.e("MicroMsg.AppBrandComponentImpl", "invoke log[%s] api[%s], callbackId[%d], component not running", new Object[] { auc(), paramm.getName(), Integer.valueOf(paramInt) });
      paramm = Q(paramm.getName(), "fail:interrupted");
    }
    while (true)
    {
      return paramm;
      d.4 local4 = new d.4(this, paramString, paramm, paramInt);
      if (this.hvM == null);
      while (true)
      {
        if (!bool)
          local4.proceed();
        if (TextUtils.isEmpty(local4.hwo))
          break label123;
        paramm = local4.hwo;
        break;
        bool = this.hvM.a(paramm, paramString, paramInt, local4);
      }
      label123: paramm = "";
    }
  }

  private d.a nY(int paramInt)
  {
    synchronized (this.hvN)
    {
      d.a locala = (d.a)this.hvN.get(paramInt);
      this.hvN.remove(paramInt);
      return locala;
    }
  }

  public <T extends b> T B(Class<T> paramClass)
  {
    Object localObject = null;
    if (paramClass == null);
    while (true)
    {
      return localObject;
      b localb = (b)this.gNK.U(paramClass);
      localObject = localb;
      if (localb == null)
      {
        localb = e.B(paramClass);
        localObject = localb;
        if (localb != null)
        {
          localObject = localb;
          if (!paramClass.isAssignableFrom(localb.getClass()))
            localObject = null;
        }
      }
    }
  }

  public void B(Runnable paramRunnable)
  {
    al.d(paramRunnable);
  }

  public void M(int paramInt, String paramString)
  {
    if (!isRunning())
      com.tencent.luggage.g.d.e("MicroMsg.AppBrandComponentImpl", "callback but destroyed, callbackId %d", new Object[] { Integer.valueOf(paramInt) });
    while (true)
    {
      return;
      String str = paramString;
      if (com.tencent.mm.sdk.platformtools.bo.isNullOrNil(paramString))
        str = "{}";
      com.tencent.luggage.g.d.d("MicroMsg.AppBrandComponentImpl", "callbackId: %d, data size: %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(str.length()) });
      paramString = nY(paramInt);
      if (paramString == null)
      {
        com.tencent.luggage.g.d.e("MicroMsg.AppBrandComponentImpl", "callbackId = [%d] This is a Sync Api, or already called back, No callback runtime stored.", new Object[] { Integer.valueOf(paramInt) });
      }
      else
      {
        paramString.hvT.evaluateJavascript(String.format(Locale.US, "typeof WeixinJSCoreAndroid !== 'undefined' && WeixinJSCoreAndroid.invokeCallbackHandler(%d, %s)", new Object[] { Integer.valueOf(paramString.id), str }), null);
        if (this.hvM != null)
          this.hvM.D(paramInt, str);
      }
    }
  }

  protected int a(i parami, int paramInt)
  {
    if (paramInt == 0)
      paramInt = 0;
    while (true)
    {
      return paramInt;
      int i = this.bOM.incrementAndGet();
      synchronized (this.hvN)
      {
        SparseArray localSparseArray2 = this.hvN;
        d.a locala = new com/tencent/mm/plugin/appbrand/jsapi/d$a;
        locala.<init>(parami, paramInt);
        localSparseArray2.put(i, locala);
        paramInt = i;
      }
    }
  }

  final String a(m paramm, JSONObject paramJSONObject, int paramInt)
  {
    String str = "";
    try
    {
      if ((paramm instanceof u))
        str = ((u)paramm).b(this, paramJSONObject);
      while (!(paramm instanceof a))
        return str;
      if (q.a(aBx(), paramJSONObject, (q.a)aa(q.a.class)) == q.b.iRJ);
      for (str = paramm.j("fail:convert native buffer parameter fail. native buffer exceed size limit.", null); ; str = null)
      {
        if (str == null)
          ((a)paramm).a(this, paramJSONObject, paramInt);
        break;
      }
    }
    catch (ClassCastException paramJSONObject)
    {
      while (true)
      {
        com.tencent.luggage.g.d.printErrStackTrace("MicroMsg.AppBrandComponentImpl", paramJSONObject, paramJSONObject.getMessage(), new Object[0]);
        str = paramm.j("fail:internal error invalid js component", null);
      }
    }
  }

  public void a(ah paramah)
  {
    if (this.hvM == null)
      h(paramah.getName(), paramah.getData(), paramah.hwN);
    while (true)
    {
      return;
      this.hvM.a(paramah, new d.2(this, paramah));
    }
  }

  public void a(String paramString1, String paramString2, int[] paramArrayOfInt)
  {
    h(paramString1, paramString2, 0);
  }

  public final int aBw()
  {
    return hashCode();
  }

  public final i aBx()
  {
    synchronized (this.hvK)
    {
      i locali = this.hvJ;
      return locali;
    }
  }

  public final Handler aBy()
  {
    return this.bOB;
  }

  protected l aCc()
  {
    return new l(this);
  }

  protected final void aCd()
  {
    synchronized (this.hvK)
    {
      if (this.hvJ == null)
      {
        this.hvJ = aua();
        this.hvJ.addJavascriptInterface(this.hvK, "WeixinJSCore");
      }
      return;
    }
  }

  public <T extends j> T aa(Class<T> paramClass)
  {
    j localj1 = null;
    Iterator localIterator = this.htl.iterator();
    j localj2;
    do
    {
      localj2 = localj1;
      if (!localIterator.hasNext())
        break;
      localj2 = (j)localIterator.next();
    }
    while (!paramClass.isInstance(localj2));
    if (localj2 == null);
    while (true)
      try
      {
        localj1 = (j)paramClass.newInstance();
        localj2 = localj1;
        Assert.assertNotNull(localj2);
        this.htl.add(localj2);
        return localj2;
      }
      catch (Exception localException)
      {
        com.tencent.luggage.g.d.e("MicroMsg.AppBrandComponentImpl", "Make sure %s has default constructor", new Object[] { paramClass.getName() });
      }
  }

  public p asE()
  {
    com.tencent.luggage.g.d.e("MicroMsg.AppBrandComponentImpl", "getFileSystem return dummy impl");
    return this.gNH;
  }

  public com.tencent.mm.plugin.appbrand.widget.b.k asF()
  {
    com.tencent.luggage.g.d.e("MicroMsg.AppBrandComponentImpl", "getDialogContainer return dummy impl");
    return com.tencent.mm.plugin.appbrand.widget.b.k.jcS;
  }

  protected String auc()
  {
    return "";
  }

  public final void b(ah paramah)
  {
    a(paramah.getName(), paramah.getData(), null);
  }

  public final void bX(String paramString1, String paramString2)
  {
    h(paramString1, paramString2, 0);
  }

  public void cleanup()
  {
    synchronized (this.hvN)
    {
      this.hvN.clear();
      this.bOB.removeCallbacksAndMessages(null);
      this.bOB.getLooper().quit();
      this.hvK.hwc.clear();
      this.hvM = null;
    }
    synchronized (this.hvK)
    {
      ??? = this.hvJ;
      if (??? != null)
        ((i)???).destroy();
      ??? = this.hvL.values().iterator();
      while (((Iterator)???).hasNext())
      {
        ((m)((Iterator)???).next()).h(this);
        continue;
        localObject4 = finally;
        throw localObject4;
      }
    }
    this.hvL.clear();
    this.hvM = null;
  }

  public final void e(Collection<j> paramCollection)
  {
    this.htl.addAll(paramCollection);
  }

  public void h(String paramString1, String paramString2, int paramInt)
  {
    if (!isRunning());
    while (true)
    {
      return;
      bo.a(aBx(), paramString1, paramString2, paramInt);
    }
  }

  public void init()
  {
    aCd();
    this.hvL.putAll(aub());
    Iterator localIterator = this.hvL.values().iterator();
    while (localIterator.hasNext())
      ((m)localIterator.next()).g(this);
  }

  public final String n(String paramString1, String paramString2, int paramInt)
  {
    paramInt = a(this.hvJ, paramInt);
    Object localObject1 = (m)this.hvL.get(paramString1);
    Object localObject2;
    if (localObject1 == null)
    {
      M(paramInt, Q(paramString1, "fail:not supported"));
      localObject2 = "fail:not supported";
    }
    long l;
    label87: 
    do
    {
      return localObject2;
      l = System.currentTimeMillis();
      if (!(localObject1 instanceof a))
        break;
      this.bOB.post(new d.3(this, (m)localObject1, paramString2, paramInt));
      localObject1 = "";
      localObject2 = localObject1;
    }
    while (!xX());
    if (paramString2 == null);
    for (paramInt = 0; ; paramInt = paramString2.length())
    {
      com.tencent.luggage.g.d.i("MicroMsg.AppBrandComponentImpl", "invokeHandler, api: %s, data size: %d, time: %d", new Object[] { paramString1, Integer.valueOf(paramInt), Long.valueOf(System.currentTimeMillis() - l) });
      localObject2 = localObject1;
      break;
      localObject1 = a((m)localObject1, paramString2, paramInt);
      break label87;
    }
  }

  protected boolean xX()
  {
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.d
 * JD-Core Version:    0.6.2
 */