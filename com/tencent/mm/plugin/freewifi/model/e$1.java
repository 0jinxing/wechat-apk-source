package com.tencent.mm.plugin.freewifi.model;

import android.content.Intent;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.f;
import com.tencent.mm.platformtools.aa;
import com.tencent.mm.plugin.freewifi.d.d;
import com.tencent.mm.plugin.freewifi.e.b;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.protocal.protobuf.rf;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class e$1
  implements f
{
  e$1(e parame, cm paramcm)
  {
  }

  public final void onSceneEnd(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ai.m paramm)
  {
    AppMethodBeat.i(20717);
    ab.i("MicroMsg.FreeWifi.FreeWifiMessageService", "desc=net request [NetSceneCheckIfCallUp] returns. errType=%d, errCode=%d, errMsg=%s", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2), paramString });
    long l;
    if (com.tencent.mm.plugin.freewifi.m.eg(paramInt1, paramInt2))
    {
      l = ((d)paramm).bzk().vYv;
      if (l == 0L)
      {
        ab.e("MicroMsg.FreeWifi.FreeWifiMessageService", "It cannot get time from server.");
        AppMethodBeat.o(20717);
      }
    }
    while (true)
    {
      return;
      paramString = this.mvL;
      Object localObject1 = this.jEi;
      paramm = ((d)paramm).bzk();
      if ((localObject1 == null) || (((cm)localObject1).vED == null))
      {
        ab.e("MicroMsg.FreeWifi.FreeWifiMessageService", "cmdAddMsg is null");
        AppMethodBeat.o(20717);
      }
      else
      {
        Object localObject2 = aa.a(((cm)localObject1).vED);
        ab.i("MicroMsg.FreeWifi.FreeWifiMessageService", "freewifi push message cmdAM.NewMsgId=%d, msgContent=%s", new Object[] { Long.valueOf(((cm)localObject1).ptF), localObject2 });
        if (com.tencent.mm.plugin.freewifi.m.isEmpty((String)localObject2))
        {
          ab.e("MicroMsg.FreeWifi.FreeWifiMessageService", "msgContent is empty. return.");
          AppMethodBeat.o(20717);
        }
        else
        {
          localObject1 = com.tencent.mm.plugin.freewifi.c.a.MB((String)localObject2);
          if (localObject1 == null)
          {
            ab.e("MicroMsg.FreeWifi.FreeWifiMessageService", "parse schemaMsg failed. return.");
            AppMethodBeat.o(20717);
          }
          else
          {
            localObject2 = new com.tencent.mm.plugin.freewifi.f.a();
            ((com.tencent.mm.plugin.freewifi.f.a)localObject2).mxo = ((com.tencent.mm.plugin.freewifi.c.a)localObject1).mvu;
            ((com.tencent.mm.plugin.freewifi.f.a)localObject2).mxq = ((com.tencent.mm.plugin.freewifi.c.a)localObject1).mvv;
            ((com.tencent.mm.plugin.freewifi.f.a)localObject2).mxp = ((com.tencent.mm.plugin.freewifi.c.a)localObject1).bssid;
            ((com.tencent.mm.plugin.freewifi.f.a)localObject2).mxu = ((com.tencent.mm.plugin.freewifi.c.a)localObject1).ssid;
            ((com.tencent.mm.plugin.freewifi.f.a)localObject2).mxy = ((com.tencent.mm.plugin.freewifi.c.a)localObject1).mvx;
            ((com.tencent.mm.plugin.freewifi.f.a)localObject2).mxs = ((com.tencent.mm.plugin.freewifi.c.a)localObject1).mvt;
            ((com.tencent.mm.plugin.freewifi.f.a)localObject2).mxr = ((com.tencent.mm.plugin.freewifi.c.a)localObject1).mvw;
            Object localObject3 = com.tencent.mm.plugin.freewifi.m.Mz("MicroMsg.FreeWifi.FreeWifiMessageService");
            ((com.tencent.mm.plugin.freewifi.f.a)localObject2).cuI = ((String)localObject3);
            label325: label361: boolean bool;
            if (((String)localObject3).equals(((com.tencent.mm.plugin.freewifi.c.a)localObject1).mvt) == true)
            {
              paramInt1 = 0;
              ((com.tencent.mm.plugin.freewifi.f.a)localObject2).mxt = paramInt1;
              localObject3 = com.tencent.mm.plugin.freewifi.m.Mx("MicroMsg.FreeWifi.FreeWifiMessageService");
              ((com.tencent.mm.plugin.freewifi.f.a)localObject2).mxv = ((String)localObject3);
              if (((String)localObject3).equals(((com.tencent.mm.plugin.freewifi.c.a)localObject1).ssid) != true)
                break label545;
              paramInt1 = 0;
              ((com.tencent.mm.plugin.freewifi.f.a)localObject2).mxw = paramInt1;
              ((com.tencent.mm.plugin.freewifi.f.a)localObject2).mxx = l;
              ((com.tencent.mm.plugin.freewifi.f.a)localObject2).mxy = ((com.tencent.mm.plugin.freewifi.c.a)localObject1).mvx;
              if (l <= ((com.tencent.mm.plugin.freewifi.c.a)localObject1).mvx)
                break label550;
              paramInt1 = 1;
              label397: if (paramInt1 != 1)
                break label555;
              paramInt2 = 1;
              label404: ((com.tencent.mm.plugin.freewifi.f.a)localObject2).mxz = paramInt2;
              ((com.tencent.mm.plugin.freewifi.f.a)localObject2).mxD = paramm.vYm;
              ((com.tencent.mm.plugin.freewifi.f.a)localObject2).mxE = ((String)localObject3);
              bool = ((String)localObject3).equals(paramm.vYm);
              if (!bool)
                break label560;
            }
            label545: label550: label555: label560: for (paramInt2 = 1; ; paramInt2 = 0)
            {
              ((com.tencent.mm.plugin.freewifi.f.a)localObject2).mxF = paramInt2;
              ((com.tencent.mm.plugin.freewifi.f.a)localObject2).mxA = 1;
              ((com.tencent.mm.plugin.freewifi.f.a)localObject2).mxB = paramm.vYu;
              localObject1 = ((com.tencent.mm.plugin.freewifi.c.a)localObject1).mvw;
              if (!com.tencent.mm.plugin.freewifi.m.isEmpty((String)localObject1))
              {
                localObject3 = Pattern.compile("apKey=([^&]+)&ticket=([^&$]+)").matcher((CharSequence)localObject1);
                if (((Matcher)localObject3).find())
                  ((com.tencent.mm.plugin.freewifi.f.a)localObject2).mxC = ((Matcher)localObject3).group(2);
              }
              e.a((com.tencent.mm.plugin.freewifi.f.a)localObject2);
              if (bool)
                break label565;
              ab.e("MicroMsg.FreeWifi.FreeWifiMessageService", "ssid has changed ! svr back ssid is not equal client ssid. ");
              AppMethodBeat.o(20717);
              break;
              paramInt1 = 1;
              break label325;
              paramInt1 = 1;
              break label361;
              paramInt1 = 0;
              break label397;
              paramInt2 = 0;
              break label404;
            }
            label565: if (paramInt1 != 0)
            {
              ab.e("MicroMsg.FreeWifi.FreeWifiMessageService", "Msg time expired. return.");
              AppMethodBeat.o(20717);
            }
            else
            {
              if ((paramm.vYu == 0) && (!com.tencent.mm.plugin.freewifi.m.isEmpty((String)localObject1)))
              {
                localObject3 = Pattern.compile("apKey=([^&]+)&ticket=([^&$]+)").matcher((CharSequence)localObject1);
                if (((Matcher)localObject3).find())
                  localObject2 = ((Matcher)localObject3).group(1);
              }
              try
              {
                paramm = URLDecoder.decode((String)localObject2, "utf8");
                localObject1 = ((Matcher)localObject3).group(2);
                localObject2 = new Intent();
                ((Intent)localObject2).putExtra("free_wifi_ap_key", paramm);
                ((Intent)localObject2).putExtra("free_wifi_source", 5);
                ((Intent)localObject2).putExtra("free_wifi_threeone_startup_type", 3);
                ((Intent)localObject2).putExtra("free_wifi_schema_ticket", (String)localObject1);
                ((Intent)localObject2).putExtra("free_wifi_sessionkey", (String)localObject1);
                if (!paramString.mvK.equals(localObject1))
                {
                  paramString.mvK = ((String)localObject1);
                  b.bzr();
                  b.aa((Intent)localObject2);
                }
                AppMethodBeat.o(20717);
              }
              catch (UnsupportedEncodingException paramString)
              {
                ab.i("MicroMsg.FreeWifi.FreeWifiMessageService", "sessionKey=%s, step=%d, method=Protocol31Handler.handleInterruptedProtocol31Schema, desc=Exception happens when decoding apkey. schemaUrl=%s, apkey=%s, e.getMessage()=%s", new Object[] { "", Integer.valueOf(0), localObject1, localObject2, paramString.getMessage() });
                AppMethodBeat.o(20717);
              }
              continue;
              paramString = new com.tencent.mm.plugin.freewifi.f.a();
              paramString.mxn = paramInt2;
              paramString.mxm = paramInt1;
              e.a(paramString);
              AppMethodBeat.o(20717);
            }
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.model.e.1
 * JD-Core Version:    0.6.2
 */