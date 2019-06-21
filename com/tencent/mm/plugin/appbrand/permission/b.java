package com.tencent.mm.plugin.appbrand.permission;

import android.content.res.Resources;
import android.util.SparseIntArray;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.plugin.appbrand.r.m;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashSet;
import java.util.Set;

final class b
{
  private static final SparseIntArray iwg;
  private static final Set<String> iwh;

  static
  {
    AppMethodBeat.i(132508);
    iwg = new b.1();
    iwh = new HashSet();
    iwg.put("requestPayment".hashCode(), 2131296678);
    iwg.put("requestVirtualPayment".hashCode(), 2131296678);
    iwg.put("playVoice".hashCode(), 2131296679);
    iwg.put("operateMusicPlayer".hashCode(), 2131296679);
    iwg.put("shareAppMessage".hashCode(), 2131296680);
    iwg.put("onShareAppMessage".hashCode(), 2131296680);
    iwg.put("shareAppMessageDirectly".hashCode(), 2131296680);
    iwg.put("shareTimeline".hashCode(), 2131296680);
    iwg.put("onMenuShareTimeline".hashCode(), 2131296680);
    iwg.put("launchMiniProgram".hashCode(), 2131296677);
    iwh.add("requestPayment");
    iwh.add("requestVirtualPayment");
    iwh.add("playVoice");
    iwh.add("operateMusicPlayer");
    iwh.add("shareAppMessage");
    iwh.add("onShareAppMessage");
    iwh.add("shareAppMessageDirectly");
    iwh.add("shareTimeline");
    iwh.add("onMenuShareTimeline");
    iwh.add("launchMiniProgram");
    iwh.add("makeVoIPCall");
    iwh.add("addCard");
    iwh.add("chooseContact");
    iwh.add("openCard");
    iwh.add("openOfflinePayView");
    iwh.add("openWCPayLQTDepositPlan");
    iwh.add("openWCPayLQTDepositPlanAdd");
    iwh.add("openWCPayLQTDetail");
    iwh.add("openWCPayLQTSave");
    iwh.add("loadPaySpeechDialectConfig");
    iwh.add("setCurrentPaySpeech");
    AppMethodBeat.o(132508);
  }

  static void k(i parami, String paramString)
  {
    AppMethodBeat.i(132507);
    if ((parami == null) || (bo.isNullOrNil(paramString)))
      AppMethodBeat.o(132507);
    while (true)
    {
      return;
      paramString = ah.getResources().getString(iwg.get(paramString.hashCode()));
      m.runOnUiThread(new b.2(parami, ah.getResources().getString(2131296681, new Object[] { paramString })));
      AppMethodBeat.o(132507);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.permission.b
 * JD-Core Version:    0.6.2
 */