package com.tencent.mm.plugin.freewifi.e;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.freewifi.d.g;
import com.tencent.mm.plugin.freewifi.model.f.a;
import com.tencent.mm.plugin.freewifi.model.f.b;
import com.tencent.mm.plugin.freewifi.ui.FreeWifiEntryUI;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class c$1
  implements com.tencent.mm.ai.f
{
  public c$1(String paramString, f.b paramb)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String arg3, com.tencent.mm.ai.m arg4)
  {
    AppMethodBeat.i(20803);
    int i = this.mwA;
    String str = this.mwB;
    i++;
    ab.i("MicroMsg.FreeWifi.Protocol31Handler", "sessionKey=%s, step=%d, method=Protocol31Handler.handleInterruptedProtocol31Schema.callback, desc=net request [GetInterruptedProtocol31] returns. errType=%d, errCode=%d, errMsg=%s", new Object[] { str, Integer.valueOf(i), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), ??? });
    if ((paramInt1 == 0) && (paramInt2 == 0));
    while (true)
    {
      Matcher localMatcher;
      synchronized (f.a.byS())
      {
        if (this.mwC != f.a.byS().byQ())
        {
          AppMethodBeat.o(20803);
          return;
        }
        f.a.byS().byR();
        ??? = ((g)???).bzm();
        ??? = this.mwB;
        paramInt1 = i + 1;
        ab.i("MicroMsg.FreeWifi.Protocol31Handler", "sessionKey=%s, step=%d, method=Protocol31Handler.handleInterruptedProtocol31Schema.callback, desc=net request [GetInterruptedProtocol31] gets response. schemaUrl=%s", new Object[] { ???, Integer.valueOf(paramInt1), ??? });
        if (!com.tencent.mm.plugin.freewifi.m.isEmpty(???))
        {
          localMatcher = Pattern.compile("apKey=([^&]+)&ticket=([^&$]+)").matcher(???);
          if (localMatcher.find())
            str = localMatcher.group(1);
        }
      }
      try
      {
        ??? = URLDecoder.decode(str, "utf8");
        str = localMatcher.group(2);
        ??? = new Intent();
        ???.putExtra("free_wifi_ap_key", ???);
        ???.putExtra("free_wifi_source", 5);
        ???.putExtra("free_wifi_threeone_startup_type", 2);
        ???.putExtra("free_wifi_schema_ticket", str);
        ???.putExtra("free_wifi_sessionkey", str);
        ???.addFlags(268435456);
        ???.setClass(ah.getContext(), FreeWifiEntryUI.class);
        b.bzr();
        b.aa(???);
        AppMethodBeat.o(20803);
        continue;
        ??? = finally;
        AppMethodBeat.o(20803);
        throw ???;
      }
      catch (UnsupportedEncodingException )
      {
        ab.i("MicroMsg.FreeWifi.Protocol31Handler", "sessionKey=%s, step=%d, method=Protocol31Handler.handleInterruptedProtocol31Schema, desc=Exception happens when decoding apkey. schemaUrl=%s, apkey=%s, e.getMessage()=%s", new Object[] { this.mwB, Integer.valueOf(paramInt1 + 1), ???, str, ???.getMessage() });
        AppMethodBeat.o(20803);
      }
      continue;
      if (paramInt2 == -30020)
        synchronized (f.a.byS())
        {
          if (this.mwC != f.a.byS().byQ())
          {
            AppMethodBeat.o(20803);
            continue;
          }
          f.a.byS().byR();
          AppMethodBeat.o(20803);
        }
      AppMethodBeat.o(20803);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.e.c.1
 * JD-Core Version:    0.6.2
 */