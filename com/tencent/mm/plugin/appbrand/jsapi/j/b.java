package com.tencent.mm.plugin.appbrand.jsapi.j;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.b.c;
import com.tencent.mm.plugin.appbrand.b.c.a;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.q;
import com.tencent.mm.plugin.cloudvoip.cloudvoice.c.j;
import com.tencent.mm.plugin.cloudvoip.cloudvoice.c.j.1;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

public final class b extends d
{
  public static final int CTRL_INDEX = 516;
  public static final String NAME = "joinVoIPChat";
  private static String TAG = "MicroMsg.OpenVoice.JsApiCloudVoiceJoinVoIPChat";
  private e hTa;
  private f hTb;
  private g hTc;
  private long hTd;
  private int hTe;
  private String mAppId;

  public b()
  {
    AppMethodBeat.i(131391);
    this.hTa = new e();
    this.hTb = new f();
    this.hTc = new g();
    this.mAppId = "";
    this.hTd = -1L;
    this.hTe = 0;
    AppMethodBeat.o(131391);
  }

  public final void b(q paramq, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(131392);
    if (paramJSONObject == null)
    {
      paramq.M(paramInt, j("fail:data is null or nil", null));
      AppMethodBeat.o(131392);
    }
    while (true)
    {
      return;
      this.mAppId = paramq.getAppId();
      Object localObject1 = new b.1(this);
      paramq.getRuntime().gNN.a((c.a)localObject1);
      try
      {
        String str1 = paramJSONObject.getString("signature");
        String str2 = paramJSONObject.getString("nonceStr");
        String str3 = paramJSONObject.getString("groupId");
        int i = paramJSONObject.getInt("timeStamp");
        paramJSONObject = paramJSONObject.getJSONObject("muteConfig");
        boolean bool1 = paramJSONObject.optBoolean("muteMicrophone");
        boolean bool2 = paramJSONObject.optBoolean("muteEarphone");
        paramJSONObject = paramq.getAppId();
        Object localObject2 = TAG;
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>("hy: appId:");
        ab.i((String)localObject2, paramJSONObject + ",signature:" + str1 + ",nonceStr:" + str2 + ",groupId:" + str3 + ",muteMicroPhone:" + bool1 + ",muteEarPhone:" + bool2);
        this.hTe = 0;
        this.hTd = bo.yz();
        dU(false);
        localObject2 = j.kzW;
        b.2 local2 = new com/tencent/mm/plugin/appbrand/jsapi/j/b$2;
        local2.<init>(this, bool1, bool2, paramq, paramInt);
        localObject3 = new com/tencent/mm/plugin/appbrand/jsapi/j/b$3;
        ((b.3)localObject3).<init>(this, paramq, (c.a)localObject1);
        b.4 local4 = new com/tencent/mm/plugin/appbrand/jsapi/j/b$4;
        local4.<init>(this, paramq);
        localObject1 = new com/tencent/mm/plugin/appbrand/jsapi/j/b$5;
        ((5)localObject1).<init>(this, paramq);
        ab.i("MicroMsg.OpenVoice.OpenVoiceService", "hy: trigger join room. %s, %s, %s, %d, %s", new Object[] { paramJSONObject, str1, str3, Integer.valueOf(i), str2 });
        j.1 local1 = new com/tencent/mm/plugin/cloudvoip/cloudvoice/c/j$1;
        local1.<init>((j)localObject2, paramJSONObject, "wx766655dab8fe851b", str1, str3, i, str2, local2, (com.tencent.mm.plugin.cloudvoip.cloudvoice.c.a)localObject3, local4, (com.tencent.mm.plugin.cloudvoip.cloudvoice.c.a)localObject1);
        ((j)localObject2).R(local1);
        ab.i(TAG, "hy: JsApiCloudVoiceJoinVoIPChat callbackId:".concat(String.valueOf(paramInt)));
        AppMethodBeat.o(131392);
      }
      catch (JSONException paramJSONObject)
      {
        ab.printErrStackTrace(TAG, paramJSONObject, "", new Object[0]);
        paramq.M(paramInt, j("fail: param error!", null));
        AppMethodBeat.o(131392);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.j.b
 * JD-Core Version:    0.6.2
 */