package com.tencent.mm.plugin.webview.ui.tools.a;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.du;
import com.tencent.mm.g.a.du.a;
import com.tencent.mm.g.a.dv;
import com.tencent.mm.g.a.dv.a;
import com.tencent.mm.g.a.dw;
import com.tencent.mm.g.a.dw.a;
import com.tencent.mm.g.a.dx;
import com.tencent.mm.g.a.dx.a;
import com.tencent.mm.g.a.ea;
import com.tencent.mm.g.a.ea.a;
import com.tencent.mm.plugin.webview.stub.e;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class a$a
{
  private String cwz;
  public c uAd;
  public c uAe;
  public c uAf;
  public c uAg;
  public c uAh;
  private e umI;

  public a$a(e parame, String paramString)
  {
    AppMethodBeat.i(8313);
    this.umI = null;
    this.cwz = "";
    this.uAd = new c()
    {
    };
    this.uAe = new a.a.2(this);
    this.uAf = new a.a.3(this);
    this.uAg = new a.a.4(this);
    this.uAh = new a.a.5(this);
    this.umI = parame;
    this.cwz = paramString;
    AppMethodBeat.o(8313);
  }

  final boolean h(b paramb)
  {
    boolean bool = false;
    AppMethodBeat.i(8314);
    if (paramb == null)
      AppMethodBeat.o(8314);
    while (true)
    {
      return bool;
      if (this.umI == null)
      {
        ab.e("MicroMsg.webview.WebViewExDeviceLanMgr", "callbacker is null");
        AppMethodBeat.o(8314);
      }
      else
      {
        try
        {
          if ((paramb instanceof ea))
          {
            ab.d("MicroMsg.webview.WebViewExDeviceLanMgr", "ExDeviceOnDeviceBindStateChangeEvent");
            paramb = (ea)paramb;
            bool = bo.isNullOrNil(paramb.cxB.ceI);
            if (bool)
            {
              AppMethodBeat.o(8314);
              bool = true;
            }
            else
            {
              localObject = new android/os/Bundle;
              ((Bundle)localObject).<init>();
              ((Bundle)localObject).putString("exdevice_device_id", paramb.cxB.ceI);
              ((Bundle)localObject).putBoolean("exdevice_is_bound", paramb.cxB.cww);
              this.umI.c(17, (Bundle)localObject);
            }
          }
          else
          {
            while (true)
            {
              AppMethodBeat.o(8314);
              bool = true;
              break;
              if (!(paramb instanceof du))
                break label290;
              ab.d("MicroMsg.webview.WebViewExDeviceLanMgr", "ExDeviceLanDeviceConnectStateEvent");
              paramb = (du)paramb;
              if (!bo.isNullOrNil(paramb.cxr.ceI))
              {
                bool = this.cwz.equals(paramb.cxr.cwz);
                if (bool);
              }
              else
              {
                AppMethodBeat.o(8314);
                bool = true;
                break;
              }
              localObject = new android/os/Bundle;
              ((Bundle)localObject).<init>();
              ((Bundle)localObject).putString("exdevice_device_id", paramb.cxr.ceI);
              ((Bundle)localObject).putInt("exdevice_on_state_change_state", paramb.cxr.cxs);
              ((Bundle)localObject).putString("exdevice_device_type", a.access$100());
              this.umI.c(1004, (Bundle)localObject);
            }
          }
        }
        catch (Exception paramb)
        {
          label290: 
          do
            while (true)
            {
              ab.w("MicroMsg.webview.WebViewExDeviceLanMgr", "exception in WVExDeviceEventListener callback, %s", new Object[] { paramb.getMessage() });
              continue;
              if ((paramb instanceof dv))
              {
                ab.d("MicroMsg.webview.WebViewExDeviceLanMgr", "ExDeviceLanDeviceRecvDataEvent");
                paramb = (dv)paramb;
                if ((!bo.isNullOrNil(paramb.cxt.ceI)) && (!bo.isNullOrNil(paramb.cxt.cwz)))
                {
                  localObject = paramb.cxt.data;
                  if (localObject != null);
                }
                else
                {
                  AppMethodBeat.o(8314);
                  bool = true;
                  break;
                }
                localObject = new android/os/Bundle;
                ((Bundle)localObject).<init>();
                ((Bundle)localObject).putString("exdevice_device_id", paramb.cxt.ceI);
                ((Bundle)localObject).putByteArray("exdevice_data", paramb.cxt.data);
                ((Bundle)localObject).putString("exdevice_brand_name", paramb.cxt.cwz);
                ((Bundle)localObject).putString("exdevice_device_type", a.access$100());
                this.umI.c(16, (Bundle)localObject);
                continue;
              }
              if (!(paramb instanceof dw))
                break label528;
              ab.i("MicroMsg.webview.WebViewExDeviceLanMgr", "ExDeviceLanDeviceScanResultEvent");
              localObject = (dw)paramb;
              paramb = new android/os/Bundle;
              paramb.<init>();
              paramb.putString("exdevice_device_id", ((dw)localObject).cxu.ceI);
              paramb.putByteArray("exdevice_broadcast_data", ((dw)localObject).cxu.cxv);
              paramb.putBoolean("exdevice_is_complete", ((dw)localObject).cxu.bcU);
              paramb.putBoolean("exdevice_is_lan_device", true);
              paramb.putString("exdevice_device_type", a.access$100());
              this.umI.c(15, paramb);
            }
          while (!(paramb instanceof dx));
          label528: ab.i("MicroMsg.webview.WebViewExDeviceLanMgr", "ExDeviceLanDeviceStateChangeEvent");
          Object localObject = (dx)paramb;
          paramb = new android/os/Bundle;
          paramb.<init>();
          if (((dx)localObject).cxw.cxx != true)
            break label589;
        }
      }
    }
    paramb.putBoolean("exdevice_lan_state", true);
    while (true)
    {
      this.umI.c(47, paramb);
      break;
      label589: paramb.putBoolean("exdevice_lan_state", false);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.a.a.a
 * JD-Core Version:    0.6.2
 */