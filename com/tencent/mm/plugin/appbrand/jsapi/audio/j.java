package com.tencent.mm.plugin.appbrand.jsapi.audio;

import android.app.Activity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.g.c;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.jsapi.a;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.jsapi.p;
import com.tencent.mm.plugin.appbrand.page.a.c.a;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.pluginsdk.permission.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.Vector;
import org.json.JSONObject;

public final class j extends a<com.tencent.mm.plugin.appbrand.q>
{
  public static final int CTRL_INDEX = 295;
  public static final String NAME = "operateRecorder";
  private static Vector<String> hzY;
  private j.b hAI;
  private u hAJ;
  private c.a hAK;
  private g.c huj;

  static
  {
    AppMethodBeat.i(130755);
    hzY = new Vector();
    AppMethodBeat.o(130755);
  }

  public final void a(com.tencent.mm.plugin.appbrand.q paramq, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(130752);
    com.tencent.mm.plugin.appbrand.permission.n.a(paramq.getAppId(), new j.3(this, paramq, paramJSONObject, paramInt));
    Object localObject;
    int i;
    if ((paramq.getContext() instanceof Activity))
    {
      localObject = (Activity)paramq.getContext();
      if (localObject != null)
        break label105;
      ab.e("MicroMsg.Record.JsApiOperateRecorder", "operateRecorder, pageContext is null");
      paramq.M(paramInt, j("fail", null));
      i = 0;
      label69: if (i != 0)
        break label143;
      ab.e("MicroMsg.Record.JsApiOperateRecorder", "operateRecorder, requestPermission fail");
      paramq.M(paramInt, j("fail:system permission denied", null));
      AppMethodBeat.o(130752);
    }
    while (true)
    {
      return;
      localObject = null;
      break;
      label105: boolean bool = b.a((Activity)localObject, "android.permission.RECORD_AUDIO", 116, "", "");
      i = bool;
      if (!bool)
        break label69;
      com.tencent.mm.plugin.appbrand.permission.n.Dr(paramq.getAppId());
      i = bool;
      break label69;
      label143: localObject = paramq.getRuntime().asV();
      if ((((com.tencent.mm.plugin.appbrand.page.q)localObject).getCurrentPage() == null) || (((com.tencent.mm.plugin.appbrand.page.q)localObject).getCurrentPage().getCurrentPageView() == null))
      {
        paramq.M(paramInt, j("fail", null));
        AppMethodBeat.o(130752);
      }
      else
      {
        this.hAJ = ((com.tencent.mm.plugin.appbrand.page.q)localObject).getCurrentPage().getCurrentPageView();
        if (paramJSONObject == null)
        {
          ab.e("MicroMsg.Record.JsApiOperateRecorder", "operateRecorder, data is null");
          paramq.M(paramInt, j("fail:data is null", null));
          AppMethodBeat.o(130752);
        }
        else
        {
          localObject = paramq.getAppId();
          ab.i("MicroMsg.Record.JsApiOperateRecorder", "operateRecorder appId:%s, data:%s", new Object[] { localObject, paramJSONObject.toString() });
          if (this.hAI == null)
            this.hAI = new j.b(this, paramq, paramInt);
          this.hAI.hwi = paramInt;
          this.hAI.appId = ((String)localObject);
          this.hAI.hAP = paramJSONObject.toString();
          this.hAI.processName = ah.getProcessName();
          if (this.huj == null)
            this.huj = new j.1(this, (String)localObject, paramq, paramInt);
          this.hAI.huj = this.huj;
          this.hAI.aCr();
          AppMethodBeat.o(130752);
        }
      }
    }
  }

  public static final class a extends p
  {
    private static final int CTRL_INDEX = 296;
    private static final String NAME = "onRecorderStateChange";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.j
 * JD-Core Version:    0.6.2
 */