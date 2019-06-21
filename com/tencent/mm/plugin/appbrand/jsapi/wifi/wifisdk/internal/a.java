package com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.wifi.WifiConfiguration;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public final class a
{
  public boolean idA;
  public boolean ide;
  public BroadcastReceiver idf;
  public String idi;
  public String idj;
  private com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.a ids;
  public Context idt;
  a.a idu;
  a.b idv;
  public WifiConfiguration idw;
  ConnectivityManager idx;
  private int idy;
  private final int idz;
  public Handler mHandler;

  public a(com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.a parama, Context paramContext)
  {
    AppMethodBeat.i(94393);
    this.mHandler = null;
    this.idu = null;
    this.idv = null;
    this.idw = null;
    this.ide = false;
    this.idf = null;
    this.idy = 0;
    this.idz = 13000;
    this.idA = false;
    this.ids = parama;
    this.idt = paramContext;
    try
    {
      this.idx = ((ConnectivityManager)this.idt.getSystemService("connectivity"));
      this.mHandler = new Handler(paramContext.getMainLooper())
      {
        public final void handleMessage(Message paramAnonymousMessage)
        {
          AppMethodBeat.i(94387);
          if (paramAnonymousMessage == null)
          {
            AppMethodBeat.o(94387);
            return;
          }
          switch (paramAnonymousMessage.what)
          {
          default:
          case 1:
          }
          while (true)
          {
            AppMethodBeat.o(94387);
            break;
            ab.i("MicroMsg.WiFiConnector", "MSG_TIME_OUT");
            if (!a.this.aGB())
            {
              a.this.Cb("fail to connect wifi:time out");
              ab.i("MicroMsg.wifi_event", "MSG_TIME_OUT FAIL.");
            }
          }
        }
      };
      AppMethodBeat.o(94393);
      return;
    }
    catch (Exception parama)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.WiFiConnector", parama, "can not retrieve ConnectivityManager", new Object[0]);
    }
  }

  private static Object a(a.a parama, String paramString)
  {
    AppMethodBeat.i(94392);
    paramString = Class.forName(paramString);
    parama = Proxy.newProxyInstance(paramString.getClassLoader(), new Class[] { paramString }, parama);
    AppMethodBeat.o(94392);
    return parama;
  }

  private void aGA()
  {
    AppMethodBeat.i(94394);
    if (this.ide)
    {
      this.idt.unregisterReceiver(this.idf);
      this.ide = false;
      ab.i("MicroMsg.WiFiConnector", "stopMonitorWiFiEvent");
    }
    AppMethodBeat.o(94394);
  }

  private static String oF(int paramInt)
  {
    String str;
    switch (paramInt)
    {
    default:
      str = "UnknowState";
    case 2:
    case 1:
    case 3:
    case 0:
    }
    while (true)
    {
      return str;
      str = "STATE_CONNECTED";
      continue;
      str = "STATE_CONNECTING";
      continue;
      str = "STATE_FAIL";
      continue;
      str = "STATE_NONE";
    }
  }

  public final void Cb(String paramString)
  {
    AppMethodBeat.i(94396);
    if (this.idw != null)
    {
      b.oG(this.idw.networkId);
      i(false, paramString);
      ab.i("MicroMsg.wifi_event", "cancelConnect, " + d.Cc(this.idw.SSID) + " networkId:" + this.idw.networkId);
      ab.i("MicroMsg.WiFiConnector", "cancelConnect");
    }
    AppMethodBeat.o(94396);
  }

  public final boolean a(WifiConfiguration paramWifiConfiguration)
  {
    boolean bool = true;
    AppMethodBeat.i(94395);
    if ((paramWifiConfiguration == null) || (paramWifiConfiguration.networkId == d.idD) || (this.idx == null))
    {
      AppMethodBeat.o(94395);
      bool = false;
    }
    while (true)
    {
      return bool;
      try
      {
        Class localClass = Class.forName("android.net.wifi.WifiManager");
        if (Build.VERSION.SDK_INT < 16)
        {
          localClass.getMethod("asyncConnect", new Class[] { Context.class, Handler.class }).invoke(c.bCU, new Object[] { this.idt, this.mHandler });
          localClass.getMethod("connectNetwork", new Class[] { Integer.TYPE }).invoke(c.bCU, new Object[] { Integer.valueOf(paramWifiConfiguration.networkId) });
          AppMethodBeat.o(94395);
        }
        else
        {
          Object localObject1;
          Object localObject2;
          if (Build.VERSION.SDK_INT == 16)
          {
            if (this.idv == null)
            {
              localObject1 = new com/tencent/mm/plugin/appbrand/jsapi/wifi/wifisdk/internal/a$b;
              ((a.b)localObject1).<init>(this);
              this.idv = ((a.b)localObject1);
            }
            localObject1 = a(this.idu, "android.net.wifi.WifiManager$ChannelListener");
            localObject1 = localClass.getMethod("initialize", new Class[] { Context.class, Looper.class, Class.forName("android.net.wifi.WifiManager$ChannelListener") }).invoke(c.bCU, new Object[] { this.idt, this.idt.getMainLooper(), localObject1 });
            if (this.idu == null)
            {
              localObject2 = new com/tencent/mm/plugin/appbrand/jsapi/wifi/wifisdk/internal/a$a;
              ((a.a)localObject2).<init>(this);
              this.idu = ((a.a)localObject2);
            }
            Object localObject3 = a(this.idu, "android.net.wifi.WifiManager$ActionListener");
            localObject2 = Class.forName("android.net.wifi.WifiManager$ActionListener");
            localClass.getMethod("connect", new Class[] { Class.forName("android.net.wifi.WifiManager$Channel"), Integer.TYPE, localObject2 }).invoke(c.bCU, new Object[] { localObject1, Integer.valueOf(paramWifiConfiguration.networkId), localObject3 });
            AppMethodBeat.o(94395);
          }
          else
          {
            if (this.idu == null)
            {
              localObject1 = new com/tencent/mm/plugin/appbrand/jsapi/wifi/wifisdk/internal/a$a;
              ((a.a)localObject1).<init>(this);
              this.idu = ((a.a)localObject1);
            }
            localObject1 = a(this.idu, "android.net.wifi.WifiManager$ActionListener");
            localObject2 = Class.forName("android.net.wifi.WifiManager$ActionListener");
            localClass.getMethod("connect", new Class[] { Integer.TYPE, localObject2 }).invoke(c.bCU, new Object[] { Integer.valueOf(paramWifiConfiguration.networkId), localObject1 });
            AppMethodBeat.o(94395);
          }
        }
      }
      catch (Exception localException)
      {
        bool = c.oH(paramWifiConfiguration.networkId);
        AppMethodBeat.o(94395);
      }
    }
  }

  public final boolean aGB()
  {
    if ((this.idy == 3) || (this.idy == 2));
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public final void i(boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(94398);
    ab.i("MicroMsg.WiFiConnector", "finishConnectTask success:".concat(String.valueOf(paramBoolean)));
    if (!aGB())
    {
      if (this.ids != null)
      {
        com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.a locala = this.ids;
        if (paramBoolean)
          paramString = "ok";
        locala.Ca(paramString);
      }
      this.mHandler.removeMessages(1);
      aGA();
      if (!paramBoolean)
        break label109;
    }
    label109: for (int i = 2; ; i = 3)
    {
      oE(i);
      if ((!paramBoolean) && (this.idw != null))
        b.oG(this.idw.networkId);
      AppMethodBeat.o(94398);
      return;
    }
  }

  public final void oE(int paramInt)
  {
    AppMethodBeat.i(94397);
    if (this.idy != paramInt)
    {
      this.idy = paramInt;
      ab.i("MicroMsg.WiFiConnector", "switchState:" + oF(this.idy));
    }
    AppMethodBeat.o(94397);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.wifi.wifisdk.internal.a
 * JD-Core Version:    0.6.2
 */