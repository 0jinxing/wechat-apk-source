package com.tencent.mm.modelstat;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import java.util.HashSet;

public final class d
{
  private static d fSa;
  private d.a fRY;
  private HashSet<String> fRZ;

  private d()
  {
    AppMethodBeat.i(78711);
    this.fRY = new d.a();
    this.fRZ = new HashSet();
    this.fRZ.add("com.tencent.mm.ui.LauncherUI");
    this.fRZ.add("com.tencent.mm.plugin.profile.ui.ContactInfoUI");
    this.fRZ.add("com.tencent.mm.plugin.webview.ui.tools.WebViewUI");
    this.fRZ.add("com.tencent.mm.ui.conversation.BizConversationUI");
    this.fRZ.add("com.tencent.mm.ui.chatting.ChattingUI");
    this.fRZ.add("com.tencent.mm.plugin.label.ui.ContactLabelEditUI");
    this.fRZ.add("com.tencent.mm.plugin.appbrand.ui.AppBrandUI");
    this.fRZ.add("com.tencent.mm.plugin.appbrand.ui.AppBrandUI1");
    this.fRZ.add("com.tencent.mm.plugin.appbrand.ui.AppBrandUI2");
    this.fRZ.add("com.tencent.mm.plugin.appbrand.ui.AppBrandUI3");
    this.fRZ.add("com.tencent.mm.plugin.appbrand.ui.AppBrandUI4");
    AppMethodBeat.o(78711);
  }

  public static boolean akd()
  {
    AppMethodBeat.i(78709);
    d.a locala = ake().fRY;
    boolean bool;
    if (locala.fSd > locala.fSe)
    {
      bool = true;
      AppMethodBeat.o(78709);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(78709);
    }
  }

  public static d ake()
  {
    AppMethodBeat.i(78712);
    if (fSa == null);
    try
    {
      if (fSa == null)
      {
        locald = new com/tencent/mm/modelstat/d;
        locald.<init>();
        fSa = locald;
      }
      d locald = fSa;
      AppMethodBeat.o(78712);
      return locald;
    }
    finally
    {
      AppMethodBeat.o(78712);
    }
  }

  public static void b(int paramInt1, String paramString, int paramInt2)
  {
    AppMethodBeat.i(78710);
    Intent localIntent = new Intent("com.tencent.mm.Intent.ACTION_CLICK_FLOW_REPORT");
    localIntent.putExtra("opCode", paramInt1);
    localIntent.putExtra("ui", paramString);
    localIntent.putExtra("uiHashCode", paramInt2);
    localIntent.putExtra("nowMilliSecond", bo.anU());
    localIntent.putExtra("elapsedRealtime", SystemClock.elapsedRealtime());
    com.tencent.mm.sdk.platformtools.e.aL(localIntent);
    paramString = ah.getContext();
    if (paramString != null)
    {
      if (!ah.bqo())
        break label102;
      c.akc().v(localIntent);
    }
    while (true)
    {
      localIntent.setAction("com.tencent.mm.Intent.ACTION_NET_STATS");
      paramString.sendBroadcast(localIntent);
      AppMethodBeat.o(78710);
      return;
      label102: ab.d("MicroMsg.ClickFlowStatSender", "sendBroadcast, Intent: %s, Extra: %s", new Object[] { localIntent, localIntent.getExtras() });
      paramString.sendBroadcast(localIntent);
    }
  }

  public static void d(Application paramApplication)
  {
    AppMethodBeat.i(78708);
    paramApplication.registerActivityLifecycleCallbacks(ake().fRY);
    AppMethodBeat.o(78708);
  }

  public static void h(String paramString, long paramLong1, long paramLong2)
  {
    AppMethodBeat.i(78713);
    if ((com.tencent.mm.protocal.d.vxr) || (com.tencent.mm.protocal.d.vxq))
    {
      ab.i("MicroMsg.ClickFlowStatSender", "kvCheck :%s [%s,%s,%s]", new Object[] { paramString, Long.valueOf(paramLong1), Long.valueOf(paramLong2), Long.valueOf(paramLong2 - paramLong1) });
      com.tencent.mm.plugin.report.e.pXa.X(13393, "99999,0,0," + paramLong1 + "," + paramLong2 + "," + paramString);
    }
    AppMethodBeat.o(78713);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.modelstat.d
 * JD-Core Version:    0.6.2
 */