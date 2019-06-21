package com.tencent.mm.plugin.appbrand.jsapi.nfc;

import android.app.Activity;
import android.content.Intent;
import android.os.Looper;
import android.os.ResultReceiver;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.g;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Timer;
import org.json.JSONArray;
import org.json.JSONObject;

public final class d extends JsApiAppBrandNFCBase
{
  public static final int CTRL_INDEX = 352;
  public static final String NAME = "startHCE";
  private JSONObject bOf;
  private int bOs;
  boolean eTM;
  Activity gNy;
  private Class<?> hSd;
  Class<?> hSe;
  private int hSf;
  private ResultReceiver hSg;
  com.tencent.mm.plugin.appbrand.jsapi.c hzz;
  final Object mLock;
  long mStartTime;
  Timer mTimer;

  public d(Class<?> paramClass1, Class<?> paramClass2)
  {
    AppMethodBeat.i(137877);
    this.hSd = null;
    this.hSe = null;
    this.gNy = null;
    this.hzz = null;
    this.bOs = -1;
    this.mStartTime = -1L;
    this.mLock = new Object();
    this.eTM = false;
    this.hSg = new JsApiNFCStartHCE.5(this, ak.fetchFreeHandler(Looper.getMainLooper()));
    this.hSd = paramClass1;
    this.hSe = paramClass2;
    AppMethodBeat.o(137877);
  }

  final void AR(String paramString)
  {
    AppMethodBeat.i(137879);
    ab.i("MicroMsg.JsApiNFCStartHCE", "alvinluo startHCE callback result: %s", new Object[] { paramString });
    if (this.hzz != null)
      this.hzz.M(this.bOs, paramString);
    AppMethodBeat.o(137879);
  }

  public final void a(com.tencent.mm.plugin.appbrand.jsapi.c paramc, JSONObject arg2, int paramInt)
  {
    AppMethodBeat.i(137878);
    ab.i("MicroMsg.JsApiNFCStartHCE", "alvinluo appbrand start HCE, data: %s", new Object[] { ???.toString() });
    this.hzz = paramc;
    this.bOs = paramInt;
    this.bOf = ???;
    while (true)
    {
      synchronized (this.mLock)
      {
        this.eTM = false;
        if ((this.hSd == null) || (this.hSe == null))
        {
          AR(j("fail: HostApduService or HCETransparentUI is nil", null));
          AppMethodBeat.o(137878);
          return;
        }
      }
      this.hSf = this.bOf.optInt("time_limit", 1500);
      a(new d.1(this));
      AppMethodBeat.o(137878);
    }
  }

  final void onSuccess()
  {
    AppMethodBeat.i(137880);
    Object localObject = new HashMap();
    ArrayList localArrayList = new ArrayList();
    try
    {
      JSONArray localJSONArray = this.bOf.getJSONArray("aid_list");
      int i = localJSONArray.length();
      ab.i("MicroMsg.JsApiNFCStartHCE", "alvinluo mData: %s, aidList: %s, length: %d", new Object[] { this.bOf.toString(), localJSONArray.toString(), Integer.valueOf(i) });
      for (int j = 0; j < i; j++)
        localArrayList.add(localJSONArray.get(j).toString());
    }
    catch (Exception localException)
    {
      ((Map)localObject).put("errCode", Integer.valueOf(13003));
      AR(j("fail: aid_list invalid", (Map)localObject));
      com.tencent.mm.plugin.appbrand.jsapi.nfc.hce.a.c.G(this.hzz.getAppId(), 13003, -1);
      AppMethodBeat.o(137880);
    }
    while (true)
    {
      return;
      g.a(this.hzz.getAppId(), new d.2(this));
      localObject = new Intent(this.gNy, this.hSd);
      ((Intent)localObject).putExtra("HCE_Result_Receiver", this.hSg);
      ((Intent)localObject).putExtra("key_appid", this.hzz.getAppId());
      ((Intent)localObject).putExtra("key_time_limit", this.hSf);
      ((Intent)localObject).putStringArrayListExtra("key_aid_list", localException);
      HCEEventLogic.eo(false);
      this.gNy.startService((Intent)localObject);
      this.mStartTime = System.currentTimeMillis();
      d.3 local3 = new d.3(this);
      this.mTimer = new Timer();
      this.mTimer.schedule(local3, 10000L);
      AppMethodBeat.o(137880);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.nfc.d
 * JD-Core Version:    0.6.2
 */