package com.tencent.mm.plugin.exdevice.model;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.g.a.du;
import com.tencent.mm.plugin.exdevice.jni.Java2CExDevice;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import java.util.HashMap;
import org.json.JSONObject;

public final class ExdeviceWCLanSDKUtil
{
  BroadcastReceiver jIA;
  HashMap<String, byte[]> lsL;
  HashMap<String, Boolean> lsN;
  j.a lsO;
  j.a lsQ;
  private int lte;
  private int ltf;
  j.a ltg;
  j.a lth;
  HashMap<String, String> lti;
  boolean ltj;
  boolean ltk;
  boolean ltl;
  int ltm;
  Context mContext;

  public ExdeviceWCLanSDKUtil()
  {
    AppMethodBeat.i(19290);
    this.lte = 0;
    this.ltf = 0;
    this.lsL = new HashMap();
    this.lsN = new HashMap();
    this.lti = new HashMap();
    this.mContext = null;
    this.ltj = false;
    this.ltk = false;
    this.ltl = false;
    this.ltj = true;
    this.ltk = true;
    this.lsL.clear();
    this.lsN.clear();
    this.lti.clear();
    this.mContext = ah.getContext();
    IntentFilter localIntentFilter = new IntentFilter();
    localIntentFilter.addAction("android.net.wifi.STATE_CHANGE");
    if (this.jIA == null)
      this.jIA = new ExdeviceWCLanSDKUtil.LanStateChangeReceiver(this);
    this.mContext.registerReceiver(this.jIA, localIntentFilter);
    this.ltg = new ExdeviceWCLanSDKUtil.1(this);
    this.lsO = new ExdeviceWCLanSDKUtil.2(this);
    this.lsQ = new ExdeviceWCLanSDKUtil.3(this);
    this.lth = new ExdeviceWCLanSDKUtil.4(this);
    AppMethodBeat.o(19290);
  }

  public final boolean Ki(String paramString)
  {
    AppMethodBeat.i(19294);
    boolean bool;
    if ((paramString != null) && (this.lsN.containsKey(paramString)))
    {
      bool = ((Boolean)this.lsN.get(paramString)).booleanValue();
      AppMethodBeat.o(19294);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(19294);
    }
  }

  public final boolean ax(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(19292);
    Object localObject;
    if ((paramString != null) && (this.lsL.containsKey(paramString)))
    {
      localObject = (byte[])this.lsL.get(paramString);
      this.ltl = true;
      if (!paramBoolean);
    }
    else
    {
      try
      {
        str = new java/lang/String;
        str.<init>((byte[])localObject);
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>(str);
        str = localJSONObject.getString("deviceType");
        ab.i("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "connectWCLanDevice deviceId: ".concat(String.valueOf(paramString)));
        if (Java2CExDevice.connectWCLanDevice((byte[])localObject, false) != 0)
        {
          ab.e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "connectWCLanDevice error!");
          AppMethodBeat.o(19292);
          for (paramBoolean = false; ; paramBoolean = false)
          {
            return paramBoolean;
            ab.e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "mDevClassInfo is null in connectWCLanDevice");
            AppMethodBeat.o(19292);
          }
        }
      }
      catch (Exception paramString)
      {
        String str;
        while (true)
        {
          ab.printErrStackTrace("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", paramString, "", new Object[0]);
          ab.e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "JSON decode failed in connectWCLanDevice!");
          AppMethodBeat.o(19292);
          paramBoolean = false;
        }
        localObject = new du();
        ((du)localObject).cxr.ceI = paramString;
        ((du)localObject).cxr.cxs = 1;
        ((du)localObject).cxr.cwz = str;
        a.xxA.m((b)localObject);
      }
    }
    while (true)
    {
      AppMethodBeat.o(19292);
      paramBoolean = true;
      break;
      l(false, paramString);
      ab.i("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "disconnectWCLanDevice...");
      Java2CExDevice.disconnectWCLanDevice((byte[])localObject);
    }
  }

  public final boolean dR(String paramString1, String paramString2)
  {
    boolean bool = false;
    AppMethodBeat.i(19293);
    if (!Ki(paramString1))
    {
      ab.e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "deviceId " + paramString1 + " not connected!");
      AppMethodBeat.o(19293);
      return bool;
    }
    if ((paramString1 != null) && (this.lsL.containsKey(paramString1)))
    {
      paramString1 = (byte[])this.lsL.get(paramString1);
      this.lte = 0;
    }
    while (true)
    {
      try
      {
        JSONObject localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>();
        localJSONObject.put("data", paramString2);
        paramString2 = new org/json/JSONObject;
        paramString2.<init>();
        paramString2.put("wxmsg_jsapi", localJSONObject);
        localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>();
        localJSONObject.put("services", paramString2);
        this.lte = Java2CExDevice.useWCLanDeviceService(paramString1, localJSONObject.toString().getBytes());
        if (this.lte == 0)
          break label244;
        bool = true;
        ab.d("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "get useWCLanDeviceService mCallBackCmdId =" + this.lte);
        AppMethodBeat.o(19293);
        break;
        ab.e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "mDevClassInfo is null in useWCLanDeviceService");
        AppMethodBeat.o(19293);
      }
      catch (Exception paramString1)
      {
        ab.printErrStackTrace("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", paramString1, "", new Object[0]);
        ab.e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "JSON encode failed in useWCLanDeviceService");
        AppMethodBeat.o(19293);
      }
      break;
      label244: ab.e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "useWCLanDeviceService error!");
      bool = false;
    }
  }

  public final boolean l(boolean paramBoolean, String paramString)
  {
    AppMethodBeat.i(19291);
    byte[] arrayOfByte;
    if ((paramString != null) && (this.lsL.containsKey(paramString)))
      arrayOfByte = (byte[])this.lsL.get(paramString);
    try
    {
      JSONObject localJSONObject = new org/json/JSONObject;
      localJSONObject.<init>();
      if (paramBoolean)
      {
        ab.i("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "open device!");
        localJSONObject.put("cmd", "open");
      }
      while (true)
      {
        paramString = new org/json/JSONObject;
        paramString.<init>();
        paramString.put("wxmsg_jsapi", localJSONObject);
        localJSONObject = new org/json/JSONObject;
        localJSONObject.<init>();
        localJSONObject.put("services", paramString);
        this.ltf = Java2CExDevice.useWCLanDeviceService(arrayOfByte, localJSONObject.toString().getBytes());
        if (this.ltf == 0)
          break;
        ab.d("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "get openOrCloseDevice mCallBackCmdId =" + this.ltf);
        paramBoolean = true;
        AppMethodBeat.o(19291);
        while (true)
        {
          return paramBoolean;
          ab.e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "mDevClassInfo is null in openOrCloseDevice");
          AppMethodBeat.o(19291);
          paramBoolean = false;
        }
        ab.i("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "close device!");
        localJSONObject.put("cmd", "close");
      }
    }
    catch (Exception paramString)
    {
      while (true)
      {
        ab.printErrStackTrace("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", paramString, "", new Object[0]);
        ab.e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "JSON encode failed in openOrCloseDevice");
        AppMethodBeat.o(19291);
        paramBoolean = false;
        continue;
        ab.e("MicroMsg.exdevice.ExdeviceWCLanSDKUtil", "openOrCloseDevice error!");
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.ExdeviceWCLanSDKUtil
 * JD-Core Version:    0.6.2
 */