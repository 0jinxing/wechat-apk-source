package com.tencent.mm.plugin.appbrand.jsapi.audio;

import android.app.Activity;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.ipc.AppBrandMainProcessService;
import com.tencent.mm.plugin.appbrand.jsapi.f.c;
import com.tencent.mm.plugin.appbrand.jsapi.m;
import com.tencent.mm.plugin.appbrand.page.a.a;
import com.tencent.mm.plugin.appbrand.page.a.c.a;
import com.tencent.mm.plugin.appbrand.page.u;
import com.tencent.mm.pluginsdk.permission.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.al;
import org.json.JSONObject;

public final class JsApiStartRecordVoice extends com.tencent.mm.plugin.appbrand.jsapi.a<com.tencent.mm.plugin.appbrand.q>
{
  public static final int CTRL_INDEX = 31;
  public static final String NAME = "startRecord";
  static volatile String hBi = null;
  private u hAJ;
  private c.a hAK;
  private JsApiStartRecordVoice.StartRecordVoice hBj;

  private void dU(boolean paramBoolean)
  {
    AppMethodBeat.i(130801);
    if (this.hAJ == null)
      AppMethodBeat.o(130801);
    while (true)
    {
      return;
      if (!al.isMainThread())
      {
        al.d(new JsApiStartRecordVoice.3(this, paramBoolean));
        AppMethodBeat.o(130801);
      }
      else if (paramBoolean)
      {
        this.hAK = com.tencent.mm.plugin.appbrand.page.a.z(this.hAJ.getRuntime()).a(a.a.iqH);
        com.tencent.mm.plugin.appbrand.n.xb(this.hAJ.getAppId()).gPf = this.hAK;
        AppMethodBeat.o(130801);
      }
      else
      {
        if (this.hAK != null)
        {
          this.hAK.dismiss();
          this.hAK = null;
        }
        AppMethodBeat.o(130801);
      }
    }
  }

  public final void a(final com.tencent.mm.plugin.appbrand.q paramq, JSONObject paramJSONObject, int paramInt)
  {
    AppMethodBeat.i(130800);
    com.tencent.mm.plugin.appbrand.permission.n.a(paramq.getAppId(), new JsApiStartRecordVoice.4(this, paramq, paramJSONObject, paramInt));
    Object localObject;
    int i;
    if ((paramq.getContext() instanceof Activity))
    {
      localObject = (Activity)paramq.getContext();
      if (localObject != null)
        break label91;
      paramq.M(paramInt, j("fail", null));
      i = 0;
      label62: if (i != 0)
        break label129;
      paramq.M(paramInt, j("fail", null));
      AppMethodBeat.o(130800);
    }
    while (true)
    {
      return;
      localObject = null;
      break;
      label91: boolean bool = b.a((Activity)localObject, "android.permission.RECORD_AUDIO", 116, "", "");
      i = bool;
      if (!bool)
        break label62;
      com.tencent.mm.plugin.appbrand.permission.n.Dr(paramq.getAppId());
      i = bool;
      break label62;
      label129: localObject = paramq.getRuntime().asV();
      if ((((com.tencent.mm.plugin.appbrand.page.q)localObject).getCurrentPage() == null) || (((com.tencent.mm.plugin.appbrand.page.q)localObject).getCurrentPage().getCurrentPageView() == null))
      {
        paramq.M(paramInt, j("fail", null));
        AppMethodBeat.o(130800);
      }
      else if (hBi != null)
      {
        paramq.M(paramInt, j("fail:audio is recording, don't start record again", null));
        AppMethodBeat.o(130800);
      }
      else
      {
        this.hAJ = ((com.tencent.mm.plugin.appbrand.page.q)localObject).getCurrentPage().getCurrentPageView();
        int j = paramJSONObject.optInt("duration", 60);
        int k = j;
        if (j <= 0)
        {
          ab.e("MicroMsg.JsApiStartRecordVoice", "duration is invalid, less than 0");
          k = 60;
        }
        j = k;
        if (k > 600)
        {
          ab.e("MicroMsg.JsApiStartRecordVoice", "duration is invalid, more than %d", new Object[] { Integer.valueOf(600) });
          j = 600;
        }
        this.hAJ.a(new JsApiStartRecordVoice.1(this, paramq));
        this.hAJ.a(new f.c()
        {
          public final void onDestroy()
          {
            AppMethodBeat.i(130785);
            JsApiStopRecordVoice.g(paramq);
            JsApiStartRecordVoice.a(JsApiStartRecordVoice.this).b(this);
            AppMethodBeat.o(130785);
          }
        });
        this.hBj = new JsApiStartRecordVoice.StartRecordVoice(this, paramq, j, paramInt);
        hBi = JsApiStartRecordVoice.StartRecordVoice.a(this.hBj);
        AppBrandMainProcessService.a(this.hBj);
        dU(true);
        AppMethodBeat.o(130800);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.audio.JsApiStartRecordVoice
 * JD-Core Version:    0.6.2
 */