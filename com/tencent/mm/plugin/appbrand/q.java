package com.tencent.mm.plugin.appbrand;

import android.app.Activity;
import android.content.Context;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.config.a;
import com.tencent.mm.plugin.appbrand.h.c;
import com.tencent.mm.plugin.appbrand.h.k;
import com.tencent.mm.plugin.appbrand.h.o;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.page.h;
import com.tencent.mm.plugin.appbrand.page.n;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import org.json.JSONObject;

public class q extends d
{
  private volatile boolean eMP;
  public volatile boolean gPH;
  private volatile i gPI;
  public w gPJ;
  protected LinkedList<q.a> gPK;
  private volatile boolean mDestroyed;

  public q()
  {
    AppMethodBeat.i(86747);
    this.mDestroyed = false;
    this.eMP = false;
    this.gPH = false;
    this.gPK = new LinkedList();
    AppMethodBeat.o(86747);
  }

  private void atX()
  {
    AppMethodBeat.i(86753);
    if (this.gPJ == null)
      this.gPJ = atY();
    AppMethodBeat.o(86753);
  }

  public final void Dw()
  {
    AppMethodBeat.i(86748);
    aCd();
    atX();
    ab.d("MicroMsg.AppBrandService", "preInjectConfig");
    JSONObject localJSONObject = aue();
    aBx().evaluateJavascript(String.format("var __wxConfig = %s;", new Object[] { localJSONObject.toString() }), null);
    this.gPH = true;
    atV();
    if (aBx().af(o.class) != null)
      ((o)aBx().af(o.class)).setJsRuntimeTitle("https://servicewechat.com/preload/js-engine");
    AppMethodBeat.o(86748);
  }

  public final void a(String paramString1, String paramString2, int[] paramArrayOfInt)
  {
    AppMethodBeat.i(86760);
    if (!isRunning())
      AppMethodBeat.o(86760);
    while (true)
    {
      return;
      this.gPI.asV().c(paramString1, paramString2, paramArrayOfInt);
      AppMethodBeat.o(86760);
    }
  }

  public final <T extends u> T ac(Class<T> paramClass)
  {
    Object localObject1 = null;
    AppMethodBeat.i(86763);
    if (this.gPI == null)
    {
      AppMethodBeat.o(86763);
      paramClass = localObject1;
    }
    while (true)
    {
      return paramClass;
      Object localObject2 = this.gPI.asV().getCurrentPage();
      if (localObject2 == null)
      {
        AppMethodBeat.o(86763);
        paramClass = localObject1;
      }
      else
      {
        localObject2 = ((n)localObject2).getCurrentPageView();
        if (paramClass.isInstance(localObject2))
        {
          AppMethodBeat.o(86763);
          paramClass = (Class<T>)localObject2;
        }
        else
        {
          AppMethodBeat.o(86763);
          paramClass = localObject1;
        }
      }
    }
  }

  public final <T extends Activity> T ad(Class<T> paramClass)
  {
    AppMethodBeat.i(86765);
    Context localContext;
    if (getCurrentPageView() == null)
    {
      localContext = getContext();
      if (!paramClass.isInstance(localContext))
        break label48;
      paramClass = (Activity)localContext;
      AppMethodBeat.o(86765);
    }
    while (true)
    {
      return paramClass;
      localContext = getCurrentPageView().mContext;
      break;
      label48: paramClass = null;
      AppMethodBeat.o(86765);
    }
  }

  public final boolean atU()
  {
    AppMethodBeat.i(86749);
    boolean bool;
    if ((getRuntime() == null) && (!this.mDestroyed))
    {
      bool = true;
      AppMethodBeat.o(86749);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(86749);
    }
  }

  protected void atV()
  {
  }

  protected void atW()
  {
    AppMethodBeat.i(86751);
    if (!isRunning())
    {
      ab.w("MicroMsg.AppBrandService", "onRuntimePause but not running appId %s", new Object[] { getAppId() });
      AppMethodBeat.o(86751);
    }
    while (true)
    {
      return;
      new h().A(this.gPI);
      AppMethodBeat.o(86751);
    }
  }

  protected w atY()
  {
    AppMethodBeat.i(86754);
    w localw = new w(this);
    AppMethodBeat.o(86754);
    return localw;
  }

  protected final void atZ()
  {
    try
    {
      AppMethodBeat.i(86757);
      Iterator localIterator = this.gPK.iterator();
      while (localIterator.hasNext())
      {
        q.a locala = (q.a)localIterator.next();
        super.h(locala.ctq, locala.data, locala.src);
      }
    }
    finally
    {
    }
    this.gPK = null;
    AppMethodBeat.o(86757);
  }

  public com.tencent.mm.plugin.appbrand.h.i aua()
  {
    AppMethodBeat.i(86766);
    c localc = new c();
    AppMethodBeat.o(86766);
    return localc;
  }

  public Map<String, m> aub()
  {
    AppMethodBeat.i(86767);
    Map localMap = Collections.emptyMap();
    AppMethodBeat.o(86767);
    return localMap;
  }

  public final String auc()
  {
    return "AppBrandService";
  }

  protected void aud()
  {
    AppMethodBeat.i(86769);
    JSONObject localJSONObject = xW();
    String str = this.gPI.getAppConfig().hfg;
    aBx().evaluateJavascript(String.format(";if(typeof __wxConfig==='undefined'){var __wxConfig={};};Object.assign(__wxConfig, %s);var __wxIndexPage = \"%s\";", new Object[] { localJSONObject.toString(), str }), null);
    AppMethodBeat.o(86769);
  }

  public final JSONObject aue()
  {
    AppMethodBeat.i(86771);
    JSONObject localJSONObject = super.aue();
    AppMethodBeat.o(86771);
    return localJSONObject;
  }

  public String auf()
  {
    return "";
  }

  public String aug()
  {
    return "";
  }

  @Deprecated
  protected final void bo(String paramString1, String paramString2)
  {
    AppMethodBeat.i(86758);
    super.h(paramString1, paramString2, 0);
    AppMethodBeat.o(86758);
  }

  public void cleanup()
  {
    AppMethodBeat.i(86768);
    super.cleanup();
    this.gPI = null;
    this.eMP = false;
    this.mDestroyed = true;
    AppMethodBeat.o(86768);
  }

  protected void dw(boolean paramBoolean)
  {
    AppMethodBeat.i(86752);
    if (!isRunning())
    {
      ab.w("MicroMsg.AppBrandService", "onRuntimeResume but not running, appId %s, willRelaunch %b", new Object[] { getAppId(), Boolean.valueOf(paramBoolean) });
      AppMethodBeat.o(86752);
    }
    while (true)
    {
      return;
      new com.tencent.mm.plugin.appbrand.page.i().a(this.gPI, paramBoolean);
      AppMethodBeat.o(86752);
    }
  }

  public final Context getContext()
  {
    AppMethodBeat.i(86764);
    Object localObject;
    if (this.gPI == null)
    {
      localObject = ah.getContext();
      AppMethodBeat.o(86764);
    }
    while (true)
    {
      return localObject;
      localObject = this.gPI.getContext();
      AppMethodBeat.o(86764);
    }
  }

  public u getCurrentPageView()
  {
    AppMethodBeat.i(86762);
    u localu = ac(u.class);
    AppMethodBeat.o(86762);
    return localu;
  }

  public i getRuntime()
  {
    return this.gPI;
  }

  public void h(String paramString1, String paramString2, int paramInt)
  {
    AppMethodBeat.i(86759);
    try
    {
      if (this.gPK != null)
      {
        LinkedList localLinkedList = this.gPK;
        q.a locala = new com/tencent/mm/plugin/appbrand/q$a;
        locala.<init>(paramString1, paramString2, paramInt);
        localLinkedList.add(locala);
      }
      while (true)
      {
        return;
        super.h(paramString1, paramString2, paramInt);
        AppMethodBeat.o(86759);
      }
    }
    finally
    {
      AppMethodBeat.o(86759);
    }
    throw paramString1;
  }

  public void h(JSONObject paramJSONObject)
  {
    AppMethodBeat.i(86772);
    super.h(paramJSONObject);
    if (aBx() != null)
      if (aBx().af(k.class) == null)
        break label54;
    label54: for (boolean bool = true; ; bool = false)
    {
      b(paramJSONObject, "nativeBufferEnabled", Boolean.valueOf(bool));
      AppMethodBeat.o(86772);
      return;
    }
  }

  public final void init()
  {
    AppMethodBeat.i(86755);
    super.init();
    atX();
    this.eMP = true;
    e(this.gPI.gNI);
    wO();
    if (aBx().af(o.class) != null)
      ((o)aBx().af(o.class)).setJsRuntimeTitle(String.format("https://servicewechat.com/%s/js-engine", new Object[] { getAppId() }));
    AppMethodBeat.o(86755);
  }

  public final boolean isRunning()
  {
    AppMethodBeat.i(86761);
    boolean bool;
    if ((this.eMP) && (super.isRunning()))
    {
      bool = true;
      AppMethodBeat.o(86761);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(86761);
    }
  }

  public void m(i parami)
  {
    AppMethodBeat.i(86750);
    this.gPI = parami;
    r.a.gPN.a(this);
    AppMethodBeat.o(86750);
  }

  protected void wO()
  {
    AppMethodBeat.i(86756);
    aud();
    atZ();
    AppMethodBeat.o(86756);
  }

  public JSONObject xW()
  {
    AppMethodBeat.i(86770);
    JSONObject localJSONObject = super.xW();
    Object localObject1 = this.gPI.ye();
    Object localObject2 = this.gPI.getAppConfig();
    if ((localObject1 == null) || (localObject2 == null))
    {
      localJSONObject = new JSONObject();
      AppMethodBeat.o(86770);
    }
    while (true)
    {
      return localJSONObject;
      localObject2 = ((a)localObject2).hff;
      localObject1 = ((JSONObject)localObject2).keys();
      while (((Iterator)localObject1).hasNext())
      {
        String str = (String)((Iterator)localObject1).next();
        Object localObject3 = ((JSONObject)localObject2).opt(str);
        try
        {
          localJSONObject.putOpt(str, localObject3);
        }
        catch (Exception localException)
        {
          ab.e("MicroMsg.AppBrandService", localException.getMessage());
        }
      }
      b(localJSONObject, "env", new JSONObject());
      AppMethodBeat.o(86770);
    }
  }

  public String xc(String paramString)
  {
    return "";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.q
 * JD-Core Version:    0.6.2
 */