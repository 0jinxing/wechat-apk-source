package com.tencent.mm.plugin.webview.ui.tools.a;

import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.dz;
import com.tencent.mm.g.a.dz.a;
import com.tencent.mm.g.a.ea;
import com.tencent.mm.g.a.ea.a;
import com.tencent.mm.g.a.eb;
import com.tencent.mm.g.a.eb.a;
import com.tencent.mm.g.a.ec;
import com.tencent.mm.g.a.ec.a;
import com.tencent.mm.g.a.lq;
import com.tencent.mm.g.a.lq.a;
import com.tencent.mm.plugin.webview.stub.e;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.b.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class b$a
{
  private String cwz;
  public c qwh;
  public c uAd;
  public c uAn;
  public c uAo;
  public c uAp;
  private e umI;

  public b$a(e parame, String paramString)
  {
    AppMethodBeat.i(8327);
    this.umI = null;
    this.cwz = "";
    this.uAn = new b.a.1(this);
    this.uAo = new b.a.2(this);
    this.uAd = new b.a.3(this);
    this.uAp = new b.a.4(this);
    this.qwh = new b.a.5(this);
    this.umI = parame;
    this.cwz = paramString;
    AppMethodBeat.o(8327);
  }

  final boolean h(b paramb)
  {
    boolean bool = false;
    AppMethodBeat.i(8328);
    if (paramb == null)
      AppMethodBeat.o(8328);
    Object localObject;
    while (true)
    {
      return bool;
      if (this.umI == null)
      {
        ab.e("MicroMsg.webview.WebViewExDeviceMgr", "callbacker is null");
        AppMethodBeat.o(8328);
      }
      else
      {
        try
        {
          if ((paramb instanceof ec))
          {
            ab.i("MicroMsg.webview.WebViewExDeviceMgr", "ExDeviceOnScanDeviceResultEvent");
            paramb = (ec)paramb;
            localObject = new android/os/Bundle;
            ((Bundle)localObject).<init>();
            ((Bundle)localObject).putString("exdevice_device_id", paramb.cxD.ceI);
            ((Bundle)localObject).putByteArray("exdevice_broadcast_data", paramb.cxD.cxv);
            ((Bundle)localObject).putBoolean("exdevice_is_complete", paramb.cxD.bcU);
            this.umI.c(15, (Bundle)localObject);
          }
          while (true)
          {
            AppMethodBeat.o(8328);
            bool = true;
            break;
            if (!(paramb instanceof eb))
              break label286;
            ab.i("MicroMsg.webview.WebViewExDeviceMgr", "ExDeviceOnRecvDataFromDeviceEvent");
            paramb = (eb)paramb;
            if ((!bo.isNullOrNil(paramb.cxC.ceI)) && (!bo.isNullOrNil(paramb.cxC.cwz)))
            {
              localObject = paramb.cxC.data;
              if (localObject != null);
            }
            else
            {
              AppMethodBeat.o(8328);
              bool = true;
              break;
            }
            localObject = new android/os/Bundle;
            ((Bundle)localObject).<init>();
            ((Bundle)localObject).putString("exdevice_device_id", paramb.cxC.ceI);
            ((Bundle)localObject).putByteArray("exdevice_data", paramb.cxC.data);
            ((Bundle)localObject).putString("exdevice_brand_name", paramb.cxC.cwz);
            this.umI.c(16, (Bundle)localObject);
          }
        }
        catch (Exception paramb)
        {
          label286: 
          do
            while (true)
            {
              ab.w("MicroMsg.webview.WebViewExDeviceMgr", "exception in WVExDeviceEventListener callback, %s", new Object[] { paramb.getMessage() });
              continue;
              if ((paramb instanceof ea))
              {
                ab.d("MicroMsg.webview.WebViewExDeviceMgr", "ExDeviceOnDeviceBindStateChangeEvent");
                localObject = (ea)paramb;
                bool = bo.isNullOrNil(((ea)localObject).cxB.ceI);
                if (bool)
                {
                  AppMethodBeat.o(8328);
                  bool = true;
                  break;
                }
                paramb = new android/os/Bundle;
                paramb.<init>();
                paramb.putString("exdevice_device_id", ((ea)localObject).cxB.ceI);
                paramb.putBoolean("exdevice_is_bound", ((ea)localObject).cxB.cww);
                this.umI.c(17, paramb);
                continue;
              }
              if (!(paramb instanceof lq))
                break label513;
              paramb = (lq)paramb;
              int i = paramb.cHu.op;
              if (i != 2)
              {
                AppMethodBeat.o(8328);
                bool = true;
                break;
              }
              if (!bo.isNullOrNil(paramb.cHu.cEN))
              {
                bool = this.cwz.equals(paramb.cHu.cEN);
                if (bool);
              }
              else
              {
                AppMethodBeat.o(8328);
                bool = true;
                break;
              }
              localObject = new android/os/Bundle;
              ((Bundle)localObject).<init>();
              ((Bundle)localObject).putString("exdevice_device_id", paramb.cHu.ceI);
              ((Bundle)localObject).putInt("exdevice_on_state_change_state", paramb.cHu.cxs);
              this.umI.c(1004, (Bundle)localObject);
            }
          while (!(paramb instanceof dz));
          label513: paramb = (dz)paramb;
          localObject = new android/os/Bundle;
          ((Bundle)localObject).<init>();
          if (paramb.cxz.cxA != 12)
            break label568;
        }
      }
    }
    ((Bundle)localObject).putBoolean("exdevice_bt_state", true);
    while (true)
    {
      this.umI.c(18, (Bundle)localObject);
      break;
      label568: ((Bundle)localObject).putBoolean("exdevice_bt_state", false);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.a.b.a
 * JD-Core Version:    0.6.2
 */