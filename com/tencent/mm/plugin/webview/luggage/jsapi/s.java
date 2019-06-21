package com.tencent.mm.plugin.webview.luggage.jsapi;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import com.facebook.device.yearclass.DeviceInfo;
import com.tencent.luggage.d.a;
import com.tencent.luggage.d.a.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.luggage.d;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.HashMap;
import java.util.Map;

public class s extends bd<d>
{
  public final void a(Context paramContext, String paramString, bc.a parama)
  {
  }

  public final void b(a<d>.a parama)
  {
    AppMethodBeat.i(6314);
    HashMap localHashMap = new HashMap();
    localHashMap.put("osVersion", Integer.valueOf(Build.VERSION.SDK_INT));
    localHashMap.put("cpuCores", Integer.valueOf(DeviceInfo.getNumberOfCPUCores()));
    localHashMap.put("cpuFreqHz", Integer.valueOf(DeviceInfo.getCPUMaxFreqKHz()));
    localHashMap.put("memory", Long.valueOf(DeviceInfo.getTotalMemory(ah.getContext())));
    localHashMap.put("brand", Build.BRAND);
    localHashMap.put("model", Build.MODEL);
    parama.c("", localHashMap);
    AppMethodBeat.o(6314);
  }

  public final int biG()
  {
    return 0;
  }

  public final String name()
  {
    return "getSystemInfo";
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.jsapi.s
 * JD-Core Version:    0.6.2
 */