package com.tencent.mm.plugin.appbrand.jsapi.u.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.ah;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
  implements g
{
  com.tencent.mm.plugin.appbrand.jsapi.c hcM;
  private ap ias;
  c idM;
  double idN;
  int idO;
  private String idP;

  public b(c paramc, com.tencent.mm.plugin.appbrand.jsapi.c paramc1)
  {
    this.hcM = paramc1;
    this.idM = paramc;
  }

  private void aFW()
  {
    AppMethodBeat.i(117383);
    ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoEventHandler", "stop video update timer");
    if (this.ias != null)
      this.ias.stopTimer();
    AppMethodBeat.o(117383);
  }

  private void aGF()
  {
    AppMethodBeat.i(117386);
    al.d(new b.3(this));
    AppMethodBeat.o(117386);
  }

  public final void Cd(String paramString)
  {
    this.idP = paramString;
  }

  public final void I(String paramString, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(117380);
    aFW();
    aGF();
    try
    {
      JSONObject localJSONObject = aFV();
      localJSONObject.put("errMsg", String.format(Locale.US, "%s(%d,%d)", new Object[] { paramString, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }));
      paramString = new com/tencent/mm/plugin/appbrand/jsapi/u/b/b$b;
      paramString.<init>((byte)0);
      a(paramString, localJSONObject);
      AppMethodBeat.o(117380);
      return;
    }
    catch (JSONException paramString)
    {
      while (true)
      {
        ab.e("MicroMsg.AppBrand.SameLayer.AppBrandVideoEventHandler", "OnXWebVideoError fail", new Object[] { paramString });
        AppMethodBeat.o(117380);
      }
    }
  }

  public final void L(int paramInt1, int paramInt2, int paramInt3)
  {
    AppMethodBeat.i(117381);
    try
    {
      JSONObject localJSONObject = aFV();
      localJSONObject.put("width", paramInt1);
      localJSONObject.put("height", paramInt2);
      this.idN = (paramInt3 * 1.0D / 1000.0D);
      localJSONObject.put("duration", this.idN);
      b.c localc = new com/tencent/mm/plugin/appbrand/jsapi/u/b/b$c;
      localc.<init>((byte)0);
      a(localc, localJSONObject);
      AppMethodBeat.o(117381);
      return;
    }
    catch (JSONException localJSONException)
    {
      while (true)
      {
        ab.e("MicroMsg.AppBrand.SameLayer.AppBrandVideoEventHandler", "onXWebVideoLoadedMetaData fail", new Object[] { localJSONException });
        AppMethodBeat.o(117381);
      }
    }
  }

  final void a(ah paramah, JSONObject paramJSONObject)
  {
    AppMethodBeat.i(117385);
    if ((!(paramah instanceof b.g)) && (!(paramah instanceof b.f)))
      ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoEventHandler", "dispatch event:%s, data:%s", new Object[] { paramah.getName(), paramJSONObject.toString() });
    paramah = paramah.AM(paramJSONObject.toString());
    if (this.hcM != null)
      if ((this.hcM instanceof q))
      {
        paramJSONObject = (q)this.hcM;
        paramJSONObject.b(paramah);
        paramJSONObject = paramJSONObject.getCurrentPageView();
        if (paramJSONObject != null)
          paramJSONObject.b(paramah);
        AppMethodBeat.o(117385);
      }
    while (true)
    {
      return;
      if ((this.hcM instanceof u))
      {
        paramJSONObject = (u)this.hcM;
        paramJSONObject.b(paramah);
        paramJSONObject = paramJSONObject.xT();
        if (paramJSONObject != null)
          paramJSONObject.b(paramah);
        AppMethodBeat.o(117385);
      }
      else
      {
        this.hcM.b(paramah);
        AppMethodBeat.o(117385);
      }
    }
  }

  final JSONObject aFV()
  {
    AppMethodBeat.i(117384);
    JSONObject localJSONObject = new JSONObject();
    localJSONObject.put("data", this.idP);
    AppMethodBeat.o(117384);
    return localJSONObject;
  }

  public final void aGE()
  {
    AppMethodBeat.i(117377);
    try
    {
      b.a locala = new com/tencent/mm/plugin/appbrand/jsapi/u/b/b$a;
      locala.<init>((byte)0);
      a(locala, aFV());
      aFW();
      aGF();
      AppMethodBeat.o(117377);
      return;
    }
    catch (JSONException localJSONException)
    {
      while (true)
        ab.e("MicroMsg.AppBrand.SameLayer.AppBrandVideoEventHandler", "OnXWebVideoEnded fail", new Object[] { localJSONException });
    }
  }

  public final void destroy()
  {
    AppMethodBeat.i(117382);
    aFW();
    AppMethodBeat.o(117382);
  }

  public final void oJ(int paramInt)
  {
    AppMethodBeat.i(117379);
    try
    {
      JSONObject localJSONObject = aFV();
      localJSONObject.put("buffered", paramInt);
      b.f localf = new com/tencent/mm/plugin/appbrand/jsapi/u/b/b$f;
      localf.<init>((byte)0);
      a(localf, localJSONObject);
      AppMethodBeat.o(117379);
      return;
    }
    catch (JSONException localJSONException)
    {
      while (true)
      {
        ab.e("MicroMsg.AppBrand.SameLayer.AppBrandVideoEventHandler", "OnXWebVideoProgress fail", new Object[] { localJSONException });
        AppMethodBeat.o(117379);
      }
    }
  }

  public final void onVideoPause()
  {
    AppMethodBeat.i(117376);
    try
    {
      b.d locald = new com/tencent/mm/plugin/appbrand/jsapi/u/b/b$d;
      locald.<init>((byte)0);
      a(locald, aFV());
      aFW();
      aGF();
      AppMethodBeat.o(117376);
      return;
    }
    catch (JSONException localJSONException)
    {
      while (true)
        ab.e("MicroMsg.AppBrand.SameLayer.AppBrandVideoEventHandler", "OnXWebVideoPause fail", new Object[] { localJSONException });
    }
  }

  public final void onVideoPlay()
  {
    AppMethodBeat.i(117375);
    try
    {
      this.idO = 0;
      Object localObject1 = aFV();
      ((JSONObject)localObject1).put("timeStamp", System.currentTimeMillis());
      Object localObject2 = new com/tencent/mm/plugin/appbrand/jsapi/u/b/b$e;
      ((b.e)localObject2).<init>((byte)0);
      a((ah)localObject2, (JSONObject)localObject1);
      ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoEventHandler", "start video update timer");
      if (this.ias == null)
      {
        ab.i("MicroMsg.AppBrand.SameLayer.AppBrandVideoEventHandler", "start video update timer, create new timer");
        localObject2 = new com/tencent/mm/sdk/platformtools/ap;
        localObject1 = new com/tencent/mm/plugin/appbrand/jsapi/u/b/b$1;
        ((b.1)localObject1).<init>(this);
        ((ap)localObject2).<init>((ap.a)localObject1, true);
        this.ias = ((ap)localObject2);
      }
      this.ias.ae(250L, 250L);
      localObject1 = new com/tencent/mm/plugin/appbrand/jsapi/u/b/b$2;
      ((b.2)localObject1).<init>(this);
      al.d((Runnable)localObject1);
      AppMethodBeat.o(117375);
      return;
    }
    catch (JSONException localJSONException)
    {
      while (true)
      {
        ab.e("MicroMsg.AppBrand.SameLayer.AppBrandVideoEventHandler", "OnXWebVideoPlay fail", new Object[] { localJSONException });
        AppMethodBeat.o(117375);
      }
    }
  }

  public final void onVideoWaiting()
  {
    AppMethodBeat.i(117378);
    try
    {
      JSONObject localJSONObject = aFV();
      localJSONObject.put("timeStamp", System.currentTimeMillis());
      b.h localh = new com/tencent/mm/plugin/appbrand/jsapi/u/b/b$h;
      localh.<init>((byte)0);
      a(localh, localJSONObject);
      AppMethodBeat.o(117378);
      return;
    }
    catch (JSONException localJSONException)
    {
      while (true)
      {
        ab.e("MicroMsg.AppBrand.SameLayer.AppBrandVideoEventHandler", "OnXWebVideoWaiting fail", new Object[] { localJSONException });
        AppMethodBeat.o(117378);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.u.b.b
 * JD-Core Version:    0.6.2
 */