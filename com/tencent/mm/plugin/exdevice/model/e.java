package com.tencent.mm.plugin.exdevice.model;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.b.c;
import com.tencent.mm.ai.p;
import com.tencent.mm.aj.d.b;
import com.tencent.mm.aj.d.b.b;
import com.tencent.mm.g.a.dc;
import com.tencent.mm.g.a.dh;
import com.tencent.mm.g.a.dm;
import com.tencent.mm.g.a.dm.a;
import com.tencent.mm.g.a.dn;
import com.tencent.mm.g.a.dn.a;
import com.tencent.mm.g.a.dp;
import com.tencent.mm.g.a.dp.a;
import com.tencent.mm.g.a.dq;
import com.tencent.mm.g.a.ea;
import com.tencent.mm.g.a.eb;
import com.tencent.mm.g.a.ec;
import com.tencent.mm.g.a.ef;
import com.tencent.mm.g.a.ef.a;
import com.tencent.mm.g.a.eh;
import com.tencent.mm.g.a.eh.a;
import com.tencent.mm.g.a.er;
import com.tencent.mm.g.a.ex;
import com.tencent.mm.g.a.id;
import com.tencent.mm.g.a.id.b;
import com.tencent.mm.g.a.ln;
import com.tencent.mm.g.a.lq;
import com.tencent.mm.g.c.ce;
import com.tencent.mm.model.aw;
import com.tencent.mm.plugin.exdevice.i.j;
import com.tencent.mm.plugin.exdevice.i.k;
import com.tencent.mm.plugin.exdevice.service.ExDeviceService;
import com.tencent.mm.plugin.exdevice.service.f.a;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.pluginsdk.p.c.a;
import com.tencent.mm.pluginsdk.p.e;
import com.tencent.mm.protocal.protobuf.TimeLineObject;
import com.tencent.mm.protocal.protobuf.ajn;
import com.tencent.mm.protocal.protobuf.ajp;
import com.tencent.mm.protocal.protobuf.ajq;
import com.tencent.mm.protocal.protobuf.asq;
import com.tencent.mm.protocal.protobuf.uf;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.mm.storage.bd;
import java.util.Calendar;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class e
{
  private final long bYn;
  public com.tencent.mm.sdk.b.c jDf;
  public com.tencent.mm.sdk.b.c lrA;
  public com.tencent.mm.sdk.b.c lrB;
  public com.tencent.mm.sdk.b.c lrC;
  public com.tencent.mm.sdk.b.c lrD;
  public com.tencent.mm.sdk.b.c lrE;
  public com.tencent.mm.sdk.b.c lrF;
  public com.tencent.mm.sdk.b.c lrG;
  public com.tencent.mm.sdk.b.c lrH;
  public com.tencent.mm.sdk.b.c lrI;
  public com.tencent.mm.sdk.b.c lrJ;
  public com.tencent.mm.sdk.b.c lrK;
  public com.tencent.mm.sdk.b.c lrL;
  public com.tencent.mm.sdk.b.c lrM;
  public com.tencent.mm.sdk.b.c lrN;
  public com.tencent.mm.sdk.b.c lrO;
  public com.tencent.mm.sdk.b.c lrP;
  public com.tencent.mm.sdk.b.c lrQ;
  public com.tencent.mm.sdk.b.c lrR;
  public com.tencent.mm.sdk.b.c lrS;
  public com.tencent.mm.sdk.b.c lrT;
  public com.tencent.mm.sdk.b.c lrU;
  public com.tencent.mm.sdk.b.c lrV;
  public com.tencent.mm.sdk.b.c lrW;
  public com.tencent.mm.sdk.b.c lrX;
  public com.tencent.mm.sdk.b.c lrY;
  public com.tencent.mm.sdk.b.c lrZ;
  List<b> lrw;
  Map<String, b> lrx;
  public com.tencent.mm.sdk.b.c lry;
  public com.tencent.mm.sdk.b.c lrz;
  public com.tencent.mm.sdk.b.c lsa;
  public com.tencent.mm.sdk.b.c lsb;
  public com.tencent.mm.sdk.b.c lsc;
  public com.tencent.mm.sdk.b.c lsd;
  public com.tencent.mm.sdk.b.c lse;
  public com.tencent.mm.sdk.b.c lsg;
  public com.tencent.mm.sdk.b.c lsh;
  public com.tencent.mm.sdk.b.c lsi;
  public com.tencent.mm.sdk.b.c lsj;
  public com.tencent.mm.sdk.b.c lsk;
  public com.tencent.mm.sdk.b.c lsl;
  ExdeviceWCLanSDKUtil lsm;
  g lsn;
  private boolean lso;
  private e.c lsp;
  ak mHandler;

  public e()
  {
    AppMethodBeat.i(19216);
    this.lry = new e.1(this);
    this.lrz = new e.12(this);
    this.lrA = new e.23(this);
    this.lrB = new com.tencent.mm.sdk.b.c()
    {
    };
    this.lrC = new com.tencent.mm.sdk.b.c()
    {
    };
    this.lrD = new e.43(this);
    this.lrE = new e.44(this);
    this.lrF = new e.45(this);
    this.lrG = new e.46(this);
    this.lrH = new e.2(this);
    this.lrI = new e.3(this);
    this.lrJ = new e.4(this);
    this.lrK = new com.tencent.mm.sdk.b.c()
    {
    };
    this.lrL = new e.6(this);
    this.lrM = new e.7(this);
    this.lrN = new e.8(this);
    this.lrO = new e.9(this);
    this.lrP = new e.10(this);
    this.lrQ = new e.11(this);
    this.lrR = new e.13(this);
    this.lrS = new e.14(this);
    this.lrT = new e.15(this);
    this.lrU = new e.16(this);
    this.lrV = new e.17(this);
    this.lrW = new e.18(this);
    this.lrX = new e.19(this);
    this.lrY = new e.20(this);
    this.jDf = new com.tencent.mm.sdk.b.c()
    {
    };
    this.lrZ = new com.tencent.mm.sdk.b.c()
    {
    };
    this.lsa = new com.tencent.mm.sdk.b.c()
    {
    };
    this.lsb = new e.25(this);
    this.lsc = new e.26(this);
    this.lsd = new e.27(this);
    this.lse = new e.28(this);
    this.lsg = new e.29(this);
    this.lsh = new e.30(this);
    this.lsi = new e.31(this);
    this.lsj = new e.32(this);
    this.lsk = new e.33(this);
    this.lsl = new com.tencent.mm.sdk.b.c()
    {
    };
    this.bYn = 300000L;
    this.lso = false;
    this.lrw = new LinkedList();
    this.lrx = new HashMap();
    HandlerThread localHandlerThread = com.tencent.mm.sdk.g.d.anM("wifi_device_heart_beat");
    localHandlerThread.start();
    this.mHandler = new ak(localHandlerThread.getLooper());
    AppMethodBeat.o(19216);
  }

  static boolean Ke(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(19225);
    paramString = com.tencent.mm.aj.f.qX(paramString);
    if (paramString == null)
    {
      ab.e("MicroMsg.exdevice.ExdeviceEventManager", "bizInfo is null");
      AppMethodBeat.o(19225);
    }
    while (true)
    {
      return bool;
      paramString = paramString.cJ(false);
      if ((paramString == null) || (paramString.aej() == null) || (!paramString.aej().aes()))
      {
        ab.e("MicroMsg.exdevice.ExdeviceEventManager", "this is not hardware biz");
        AppMethodBeat.o(19225);
      }
      else
      {
        bool = true;
        AppMethodBeat.o(19225);
      }
    }
  }

  public static boolean Kf(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(19233);
    ab.d("MicroMsg.exdevice.ExdeviceEventManager", "handleExDeviceSimpleBTDisconnectDevice, mac(%s).", new Object[] { paramString });
    if (!boI())
    {
      ab.e("MicroMsg.exdevice.ExdeviceEventManager", "isBTOpenAndBLESupported return false");
      AppMethodBeat.o(19233);
    }
    while (true)
    {
      return bool;
      if (bo.isNullOrNil(paramString))
      {
        ab.e("MicroMsg.exdevice.ExdeviceEventManager", "mac is null or nil");
        AppMethodBeat.o(19233);
      }
      else
      {
        ad.bpi();
        h.hH(com.tencent.mm.plugin.exdevice.j.b.KK(paramString));
        AppMethodBeat.o(19233);
        bool = true;
      }
    }
  }

  static int a(com.tencent.mm.plugin.exdevice.h.b paramb)
  {
    AppMethodBeat.i(19222);
    int i = -1;
    if (bo.nullAsNil(paramb.field_connProto).contains("1"))
      i = 1;
    while (true)
    {
      AppMethodBeat.o(19222);
      return i;
      if (bo.nullAsNil(paramb.field_connProto).contains("3"))
        i = 0;
    }
  }

  private b a(String paramString, b paramb)
  {
    AppMethodBeat.i(19244);
    paramString = (b)this.lrx.put(paramString, paramb);
    AppMethodBeat.o(19244);
    return paramString;
  }

  static boolean a(com.tencent.mm.plugin.exdevice.h.b paramb, int paramInt1, int paramInt2)
  {
    boolean bool = false;
    AppMethodBeat.i(19226);
    ab.i("MicroMsg.exdevice.ExdeviceEventManager", "handleSwitchViewEvent");
    if (paramb == null)
    {
      ab.i("MicroMsg.exdevice.ExdeviceEventManager", "HardDeviceInfo is null.");
      AppMethodBeat.o(19226);
    }
    while (true)
    {
      return bool;
      String str = paramb.field_brandName;
      f.a locala = u.bpx().hT(paramb.field_mac);
      if (locala == null)
      {
        ab.i("MicroMsg.exdevice.ExdeviceEventManager", "can not find the hardevice connect state");
        AppMethodBeat.o(19226);
      }
      else
      {
        if (locala.cxs == 2)
        {
          ab.i("MicroMsg.exdevice.ExdeviceEventManager", "notify the connect device %s", new Object[] { str });
          localObject = new j(paramInt1, paramInt2, paramb.field_mac);
          u.bpy().a((ae)localObject);
        }
        Object localObject = ad.bpd();
        if (paramInt1 == 1);
        for (paramInt2 = 1; ; paramInt2 = 0)
        {
          ((d)localObject).uI(paramInt2);
          if (paramInt1 != 2)
            break label376;
          ab.i("MicroMsg.exdevice.ExdeviceEventManager", "now exit chattingui, do not notify change the subtitle");
          localObject = ad.bpd();
          long l = paramb.field_mac;
          localObject = (com.tencent.mm.sdk.platformtools.ap)((d)localObject).lre.remove(Long.valueOf(l));
          if (localObject != null)
            ((com.tencent.mm.sdk.platformtools.ap)localObject).stopTimer();
          ab.i("MicroMsg.exdevice.ExdeviceEventManager", "Device close strategy(%d)", new Object[] { Integer.valueOf(paramb.field_closeStrategy) });
          if (((paramb.field_closeStrategy & 0x1) != 0) || (!u.bpx().hX(locala.lwK)) || ((2 != locala.cxs) && (locala.cxs != 0)))
          {
            ab.i("MicroMsg.exdevice.ExdeviceEventManager", "now the device is not auth or not connect  or closeStrategy is to close after exit, try to stop connetct, connet state is %d, device is %s", new Object[] { Integer.valueOf(locala.cxs), str });
            if (u.bpy().lqX != null)
              u.bpy().lqX.hZ(locala.lwK);
          }
          if (f.b(paramb))
          {
            ab.i("MicroMsg.exdevice.ExdeviceEventManager", "try to disconnect simpleBTDevice(%s).", new Object[] { Long.valueOf(paramb.field_mac) });
            Kf(com.tencent.mm.plugin.exdevice.j.b.ie(paramb.field_mac));
          }
          AppMethodBeat.o(19226);
          bool = true;
          break;
        }
        label376: if ((2 != locala.cxs) && (p.e.vaw != null) && (p.e.vaw.cUr()))
        {
          ab.i("MicroMsg.exdevice.ExdeviceEventManager", "getWearCommand is null or wear has connected in the brandName.");
          AppMethodBeat.o(19226);
        }
        else
        {
          AppMethodBeat.o(19226);
          bool = true;
        }
      }
    }
  }

  public static void aw(String paramString, boolean paramBoolean)
  {
    AppMethodBeat.i(19241);
    ab.i("MicroMsg.exdevice.ExdeviceEventManager", "notifyOnDeviceBindStateChange. deviceId=%s, isBound=%s", new Object[] { paramString, Boolean.valueOf(paramBoolean) });
    ea localea = new ea();
    localea.cxB.ceI = paramString;
    localea.cxB.cww = paramBoolean;
    com.tencent.mm.sdk.b.a.xxA.a(localea, Looper.getMainLooper());
    AppMethodBeat.o(19241);
  }

  public static void b(String paramString1, String paramString2, int paramInt, String paramString3)
  {
    AppMethodBeat.i(19238);
    lq locallq = new lq();
    locallq.cHu.op = 2;
    locallq.cHu.cEN = paramString1;
    locallq.cHu.cxs = paramInt;
    locallq.cHu.url = paramString2;
    locallq.cHu.ceI = paramString3;
    com.tencent.mm.sdk.b.a.xxA.a(locallq, Looper.getMainLooper());
    AppMethodBeat.o(19238);
  }

  static boolean boG()
  {
    boolean bool = false;
    AppMethodBeat.i(19228);
    Object localObject = ad.boW().bpC();
    if (((LinkedList)localObject).isEmpty())
    {
      ab.i("MicroMsg.exdevice.ExdeviceEventManager", "get harddevice info is null or empty");
      AppMethodBeat.o(19228);
    }
    while (true)
    {
      return bool;
      ad.bpd().uI(2);
      Iterator localIterator = ((LinkedList)localObject).iterator();
      while (localIterator.hasNext())
      {
        localObject = (com.tencent.mm.plugin.exdevice.h.b)localIterator.next();
        aw.ZK();
        com.tencent.mm.storage.ad localad = com.tencent.mm.model.c.XM().aoO(((com.tencent.mm.plugin.exdevice.h.b)localObject).field_brandName);
        if ((localad == null) || (!com.tencent.mm.n.a.jh(localad.field_type)))
        {
          ab.e("MicroMsg.exdevice.ExdeviceEventManager", "%s is not my contact now, may be has been deleted", new Object[] { ((com.tencent.mm.plugin.exdevice.h.b)localObject).field_brandName });
        }
        else if ((((com.tencent.mm.plugin.exdevice.h.b)localObject).field_connStrategy & 0x4) == 0)
        {
          ab.i("MicroMsg.exdevice.ExdeviceEventManager", "Connect Strategy is %d, no need to sync in main ui", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.exdevice.h.b)localObject).field_connStrategy) });
        }
        else
        {
          ab.i("MicroMsg.exdevice.ExdeviceEventManager", "now try to connect %s", new Object[] { ((com.tencent.mm.plugin.exdevice.h.b)localObject).field_brandName });
          ad.bpd().a(((com.tencent.mm.plugin.exdevice.h.b)localObject).field_brandName, ((com.tencent.mm.plugin.exdevice.h.b)localObject).field_mac, 0, true);
        }
      }
      AppMethodBeat.o(19228);
      bool = true;
    }
  }

  static boolean boH()
  {
    AppMethodBeat.i(19229);
    ab.i("MicroMsg.exdevice.ExdeviceEventManager", "receive StopAllChannelEvent");
    ad.bpd();
    d.gL(false);
    ad.bpd().boF();
    AppMethodBeat.o(19229);
    return true;
  }

  private static boolean boI()
  {
    boolean bool = false;
    AppMethodBeat.i(19231);
    if (!com.tencent.mm.plugin.d.a.e.a.dv(ah.getContext()))
    {
      ab.e("MicroMsg.exdevice.ExdeviceEventManager", "now sdk version not support ble device : %d", new Object[] { Integer.valueOf(Build.VERSION.SDK_INT) });
      AppMethodBeat.o(19231);
    }
    while (true)
    {
      return bool;
      if (!com.tencent.mm.plugin.d.a.e.a.aVH())
      {
        ab.e("MicroMsg.exdevice.ExdeviceEventManager", "Bluetooth is not open, Just leave");
        AppMethodBeat.o(19231);
      }
      else
      {
        AppMethodBeat.o(19231);
        bool = true;
      }
    }
  }

  public static boolean boJ()
  {
    AppMethodBeat.i(19232);
    ab.d("MicroMsg.exdevice.ExdeviceEventManager", "handleExDeviceSimpleBTScanDevice");
    boolean bool;
    if (!boI())
    {
      ab.e("MicroMsg.exdevice.ExdeviceEventManager", "isBTOpenAndBLESupported return false");
      bool = false;
      AppMethodBeat.o(19232);
    }
    while (true)
    {
      return bool;
      ad.bpi().boM();
      bool = true;
      AppMethodBeat.o(19232);
    }
  }

  static boolean boK()
  {
    AppMethodBeat.i(19245);
    ab.i("MicroMsg.exdevice.ExdeviceEventManager", "Wechat exit, stop ExDeviceService.");
    Context localContext = ah.getContext();
    try
    {
      ad.bpd().boF();
      com.tencent.mm.bp.d.l(new Intent(localContext, ExDeviceService.class), "exdevice");
      AppMethodBeat.o(19245);
      return true;
    }
    catch (Exception localException)
    {
      while (true)
      {
        ab.w("MicroMsg.exdevice.ExDeviceServiceHelper", "unbindService() Service is not start by bindService.%s", new Object[] { localException.getMessage() });
        ab.printErrStackTrace("MicroMsg.exdevice.ExDeviceServiceHelper", localException, "", new Object[0]);
      }
    }
  }

  public static boolean c(String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    boolean bool = false;
    AppMethodBeat.i(19236);
    Object localObject;
    int i;
    if ((bo.isNullOrNil(paramString1)) || (bo.isNullOrNil(paramString2)) || (bo.cb(paramArrayOfByte)))
    {
      localObject = paramString1;
      if (bo.isNullOrNil(paramString1))
        localObject = "null";
      paramString1 = paramString2;
      if (bo.isNullOrNil(paramString2))
        paramString1 = "null";
      if (bo.cb(paramArrayOfByte))
      {
        i = 0;
        ab.e("MicroMsg.exdevice.ExdeviceEventManager", "input error. mac = %s, brandName = %s, dataLen = %d", new Object[] { localObject, paramString1, Integer.valueOf(i) });
        AppMethodBeat.o(19236);
      }
    }
    while (true)
    {
      return bool;
      i = paramArrayOfByte.length;
      break;
      label124: String str;
      if (bo.isNullOrNil(paramString1))
      {
        localObject = "null";
        if (!bo.isNullOrNil(paramString2))
          break label234;
        str = "null";
        label136: if (!bo.cb(paramArrayOfByte))
          break label240;
      }
      label234: label240: for (i = 0; ; i = paramArrayOfByte.length)
      {
        ab.d("MicroMsg.exdevice.ExdeviceEventManager", "handleExDeviceSimpleBTUploadDataToServer. mac = %s, brandName = %s, dataLen = %d", new Object[] { localObject, str, Integer.valueOf(i) });
        long l = com.tencent.mm.plugin.exdevice.j.b.KK(paramString1);
        localObject = ad.boW().id(l);
        if (localObject != null)
          break label247;
        ab.e("MicroMsg.exdevice.ExdeviceEventManager", "device(mac=%s) not found in brand(brandName=%s)", new Object[] { paramString1, paramString2 });
        AppMethodBeat.o(19236);
        break;
        localObject = paramString1;
        break label124;
        str = paramString2;
        break label136;
      }
      label247: paramString1 = com.tencent.mm.plugin.d.a.b.a.a.at(paramArrayOfByte);
      if (1L != paramString1.jGw)
      {
        ab.e("MicroMsg.exdevice.ExdeviceEventManager", "not step profile type %d != %d", new Object[] { Long.valueOf(1L), Long.valueOf(paramString1.jGw) });
        AppMethodBeat.o(19236);
      }
      else
      {
        paramString2 = (com.tencent.mm.plugin.d.a.b.a.f)paramString1;
        paramString1 = Calendar.getInstance();
        paramString1.set(11, 0);
        paramString1.set(12, 0);
        paramString1.set(13, 0);
        i = (int)(paramString1.getTimeInMillis() / 1000L);
        int j = (int)(System.currentTimeMillis() / 1000L);
        ((com.tencent.mm.plugin.sport.a.b)com.tencent.mm.kernel.g.K(com.tencent.mm.plugin.sport.a.b.class)).b(((com.tencent.mm.plugin.exdevice.h.b)localObject).field_deviceID, ((com.tencent.mm.plugin.exdevice.h.b)localObject).field_deviceType, i, j, paramString2.jIh, "");
        AppMethodBeat.o(19236);
        bool = true;
      }
    }
  }

  public static void cc(String paramString, int paramInt)
  {
    AppMethodBeat.i(19239);
    lq locallq = new lq();
    locallq.cHu.op = 1;
    locallq.cHu.cEN = paramString;
    locallq.cHu.boZ = paramInt;
    com.tencent.mm.sdk.b.a.xxA.a(locallq, Looper.getMainLooper());
    AppMethodBeat.o(19239);
  }

  public static void d(String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(19240);
    ab.i("MicroMsg.exdevice.ExdeviceEventManager", "notifyOnRecvDataFromDevice. deviceId=%s, brandName=%s", new Object[] { paramString1, paramString2 });
    eb localeb = new eb();
    localeb.cxC.ceI = paramString1;
    localeb.cxC.cwz = paramString2;
    localeb.cxC.data = paramArrayOfByte;
    com.tencent.mm.sdk.b.a.xxA.a(localeb, Looper.getMainLooper());
    AppMethodBeat.o(19240);
  }

  static boolean d(com.tencent.mm.sdk.b.b paramb)
  {
    AppMethodBeat.i(19220);
    dm localdm = (dm)paramb;
    ab.i("MicroMsg.exdevice.ExdeviceEventManager", "handleGetDeviceInfosEvent: brandName=%s, context=%s", new Object[] { localdm.cwM.cwz, localdm.cwM.context });
    LinkedList localLinkedList = ad.boW().Kx(localdm.cwM.cwz);
    paramb = new JSONArray();
    while (true)
    {
      JSONObject localJSONObject;
      try
      {
        Iterator localIterator = localLinkedList.iterator();
        if (localIterator.hasNext())
        {
          com.tencent.mm.plugin.exdevice.h.b localb = (com.tencent.mm.plugin.exdevice.h.b)localIterator.next();
          if (localLinkedList.isEmpty())
            continue;
          localJSONObject = new org/json/JSONObject;
          localJSONObject.<init>();
          localJSONObject.put("deviceId", localb.field_deviceID);
          if (!u.bpx().hR(localb.field_mac))
            break label223;
          localJSONObject.put("state", "connected");
          paramb.put(localJSONObject);
          continue;
        }
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.exdevice.ExdeviceEventManager", "Ex in handleGetDeviceInfosEvent, %s", new Object[] { localException.getMessage() });
        localdm.cwN.cwO = paramb;
        localdm.cwN.cwB = true;
        ab.i("MicroMsg.exdevice.ExdeviceEventManager", "GetDeviceInfos: %s", new Object[] { paramb.toString() });
        AppMethodBeat.o(19220);
        return true;
      }
      label223: localJSONObject.put("state", "disconnected");
    }
  }

  static boolean e(com.tencent.mm.sdk.b.b paramb)
  {
    boolean bool = false;
    AppMethodBeat.i(19221);
    paramb = (eh)paramb;
    ab.i("MicroMsg.exdevice.ExdeviceEventManager", "handleSendDataToDeviceEvent: brandName=%s, deviceId=%s", new Object[] { paramb.cxL.cwz, paramb.cxL.ceI });
    if (bo.cb(paramb.cxL.data))
    {
      paramb.cxM.cwB = false;
      AppMethodBeat.o(19221);
    }
    while (true)
    {
      return bool;
      Object localObject = ad.boW().Kv(paramb.cxL.ceI);
      if (localObject == null)
      {
        ab.e("MicroMsg.exdevice.ExdeviceEventManager", "hdInfo error");
        paramb.cxM.cwB = false;
        AppMethodBeat.o(19221);
      }
      else if (!u.bpx().hR(((com.tencent.mm.plugin.exdevice.h.b)localObject).field_mac))
      {
        ab.e("MicroMsg.exdevice.ExdeviceEventManager", "haven't connect");
        paramb.cxM.cwB = false;
        AppMethodBeat.o(19221);
      }
      else if (!u.bpx().hX(((com.tencent.mm.plugin.exdevice.h.b)localObject).field_mac))
      {
        ab.e("MicroMsg.exdevice.ExdeviceEventManager", "haven't authed");
        paramb.cxM.cwB = false;
        AppMethodBeat.o(19221);
      }
      else
      {
        if (aa.boT().lsZ)
          aa.boT().uK(a((com.tencent.mm.plugin.exdevice.h.b)localObject));
        localObject = new com.tencent.mm.plugin.exdevice.i.g(paramb.cxL.data, 10001, ((com.tencent.mm.plugin.exdevice.h.b)localObject).field_mac);
        u.bpy().a((ae)localObject);
        paramb.cxM.cwB = true;
        AppMethodBeat.o(19221);
        bool = true;
      }
    }
  }

  static boolean i(String paramString, List<com.tencent.mm.plugin.exdevice.h.b> paramList)
  {
    AppMethodBeat.i(19218);
    String str = Uri.parse(paramString).getHost();
    ab.i("MicroMsg.exdevice.ExdeviceEventManager", "is url...");
    paramString = null;
    Iterator localIterator = paramList.iterator();
    boolean bool1 = false;
    boolean bool2;
    while (true)
    {
      bool2 = bool1;
      if (localIterator.hasNext())
      {
        paramList = (com.tencent.mm.plugin.exdevice.h.b)localIterator.next();
        Object localObject = paramList.dFr;
        paramList = paramList.dFs;
        if ((paramList == null) || (paramList.length() <= 0) || (localObject == null) || (!((String)localObject).contains("wxmsg_url")))
          continue;
        try
        {
          localObject = new org/json/JSONObject;
          ((JSONObject)localObject).<init>(paramList);
          paramList = ((JSONObject)localObject).getJSONArray("wxmsg_url");
          paramString = paramList;
          int i = paramString.length();
          j = 0;
          bool3 = bool1;
          if (j >= i);
        }
        catch (JSONException paramList)
        {
          while (true)
            try
            {
              boolean bool3 = paramString.getString(j).equals(str);
              if (bool3)
              {
                bool3 = true;
                bool2 = bool3;
                if (bool3)
                  break label213;
                bool1 = bool3;
                break;
                paramList = paramList;
                ab.printErrStackTrace("MicroMsg.exdevice.ExdeviceEventManager", paramList, "", new Object[0]);
              }
            }
            catch (JSONException paramList)
            {
              int j;
              ab.printErrStackTrace("MicroMsg.exdevice.ExdeviceEventManager", paramList, "", new Object[0]);
              j++;
            }
        }
      }
    }
    label213: AppMethodBeat.o(19218);
    return bool2;
  }

  static boolean j(String paramString, List<com.tencent.mm.plugin.exdevice.h.b> paramList)
  {
    boolean bool = false;
    AppMethodBeat.i(19219);
    if (paramString == null)
    {
      AppMethodBeat.o(19219);
      return bool;
    }
    Object localObject = new id();
    ((id)localObject).cDc.cwT = paramString;
    com.tencent.mm.sdk.b.a.xxA.m((com.tencent.mm.sdk.b.b)localObject);
    localObject = ((id)localObject).cDd.cDe;
    int i = ((TimeLineObject)localObject).xfI.wbJ;
    if (i == 1)
    {
      ab.i("MicroMsg.exdevice.ExdeviceEventManager", "is photo...");
      localObject = paramList.iterator();
      while (((Iterator)localObject).hasNext())
      {
        paramList = ((com.tencent.mm.plugin.exdevice.h.b)((Iterator)localObject).next()).dFr;
        if ((paramList != null) && (paramList.contains("wxmsg_image")))
          bool = true;
      }
    }
    while (true)
    {
      ab.i("MicroMsg.exdevice.ExdeviceEventManager", "isSupportsSnsInfo = " + bool + ", snsLocalId = " + paramString);
      AppMethodBeat.o(19219);
      break;
      bool = false;
      continue;
      if (i == 4)
      {
        ab.i("MicroMsg.exdevice.ExdeviceEventManager", "is music...");
        localObject = paramList.iterator();
        while (true)
          if (((Iterator)localObject).hasNext())
          {
            paramList = ((com.tencent.mm.plugin.exdevice.h.b)((Iterator)localObject).next()).dFr;
            if ((paramList != null) && (paramList.contains("wxmsg_music")))
            {
              bool = true;
              break;
            }
          }
        bool = false;
      }
      else if (i == 15)
      {
        ab.i("MicroMsg.exdevice.ExdeviceEventManager", "is sight...");
        localObject = paramList.iterator();
        while (true)
          if (((Iterator)localObject).hasNext())
          {
            paramList = ((com.tencent.mm.plugin.exdevice.h.b)((Iterator)localObject).next()).dFr;
            if ((paramList != null) && (paramList.contains("wxmsg_video")))
            {
              bool = true;
              break;
            }
          }
        bool = false;
      }
      else if (i == 3)
      {
        bool = i(((TimeLineObject)localObject).xfI.Url, paramList);
      }
      else
      {
        bool = false;
      }
    }
  }

  public final boolean Kg(String paramString)
  {
    boolean bool = false;
    AppMethodBeat.i(19234);
    ab.d("MicroMsg.exdevice.ExdeviceEventManager", "handleExDeviceSimpleBTConnectDevice");
    if (!boI())
    {
      ab.e("MicroMsg.exdevice.ExdeviceEventManager", "isBTOpenAndBLESupported return false");
      AppMethodBeat.o(19234);
    }
    while (true)
    {
      return bool;
      if (bo.isNullOrNil(paramString))
      {
        ab.e("MicroMsg.exdevice.ExdeviceEventManager", "mac is null or nil");
        AppMethodBeat.o(19234);
      }
      else
      {
        ad.bpi().a(com.tencent.mm.plugin.exdevice.j.b.KK(paramString), new e.40(this));
        bool = true;
        AppMethodBeat.o(19234);
      }
    }
  }

  public final boolean a(b paramb)
  {
    AppMethodBeat.i(19242);
    boolean bool;
    if (this.lrw.contains(paramb))
    {
      bool = false;
      AppMethodBeat.o(19242);
    }
    while (true)
    {
      return bool;
      bool = this.lrw.add(paramb);
      AppMethodBeat.o(19242);
    }
  }

  final boolean at(int paramInt, String paramString)
  {
    AppMethodBeat.i(19230);
    ab.v("MicroMsg.exdevice.ExdeviceEventManager", "handleInChattingUI.");
    Object localObject1 = com.tencent.mm.aj.f.qX(paramString);
    boolean bool;
    if (localObject1 == null)
    {
      ab.e("MicroMsg.exdevice.ExdeviceEventManager", "bizInfo is null");
      bool = false;
      AppMethodBeat.o(19230);
    }
    Object localObject2;
    Object localObject3;
    while (true)
    {
      return bool;
      localObject1 = ((com.tencent.mm.aj.d)localObject1).cJ(false);
      if (localObject1 != null)
      {
        localObject2 = ((d.b)localObject1).aej();
        if ((localObject2 != null) && (((d.b.b)localObject2).aes()));
      }
      else
      {
        ab.e("MicroMsg.exdevice.ExdeviceEventManager", "this is not hardware biz");
        bool = false;
        AppMethodBeat.o(19230);
        continue;
      }
      localObject1 = ad.boW().Kx(paramString);
      if (((d.b.b)localObject2).fvJ == 1)
      {
        localObject2 = ad.boW().bpC();
        if (((List)localObject2).size() != 0)
        {
          localObject3 = ((List)localObject2).iterator();
          while (((Iterator)localObject3).hasNext())
          {
            localObject2 = (com.tencent.mm.plugin.exdevice.h.b)((Iterator)localObject3).next();
            ab.i("MicroMsg.exdevice.ExdeviceEventManager", "BLE hard device info, mac(%s), deviceId(%s), deviceType(%s), SimpleProtol(%d)", new Object[] { Long.valueOf(((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_mac), ((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_deviceID, ((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_deviceType, Long.valueOf(((ce)localObject2).dFq) });
            if (0L != (((ce)localObject2).dFq & 1L))
              ((List)localObject1).add(localObject2);
          }
        }
      }
      if (localObject1 == null)
      {
        ab.i("MicroMsg.exdevice.ExdeviceEventManager", "handleInChattingUI, hdInfo is null.");
        bool = false;
        AppMethodBeat.o(19230);
      }
      else
      {
        if (((List)localObject1).size() != 0)
          break;
        ab.i("MicroMsg.exdevice.ExdeviceEventManager", "handleInChattingUI, hdInfo size is 0.");
        bool = true;
        AppMethodBeat.o(19230);
      }
    }
    int i = 0;
    localObject1 = ((List)localObject1).iterator();
    int j = 0;
    label304: int k;
    int m;
    while (true)
      if (((Iterator)localObject1).hasNext())
      {
        localObject2 = (com.tencent.mm.plugin.exdevice.h.b)((Iterator)localObject1).next();
        if (localObject2 == null)
        {
          ab.e("MicroMsg.exdevice.ExdeviceEventManager", "hdInfo error");
        }
        else if (bo.nullAsNil(((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_connProto).contains("4"))
        {
          ab.i("MicroMsg.exdevice.ExdeviceEventManager", "%s, Wifi biz, continue.", new Object[] { ((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_brandName });
        }
        else if ((((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_connStrategy & 0x10) != 0)
        {
          ab.i("MicroMsg.exdevice.ExdeviceEventManager", "%s, Connect stragegy(%d) ignore connection on chat, continue!!!", new Object[] { ((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_brandName, Integer.valueOf(((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_connStrategy) });
        }
        else if (bo.nullAsNil(((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_connProto).contains("1"))
        {
          k = i + 1;
          if (!com.tencent.mm.plugin.d.a.e.a.aVF())
          {
            ab.e("MicroMsg.exdevice.ExdeviceEventManager", "%s, device is BC, but you phone not support BC.", new Object[] { ((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_brandName });
            i = k;
            continue;
          }
          m = 1;
          i = j;
          j = k;
          k = m;
        }
      }
    while (true)
    {
      label500: ab.i("MicroMsg.exdevice.ExdeviceEventManager", "receive ExDeviceOpInChattingUIEventListener, op(%d), brandName(%s), connProto(%s),", new Object[] { Integer.valueOf(paramInt), ((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_brandName, ((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_connProto });
      if (paramInt == 0)
      {
        localObject3 = ad.bpd();
        long l = ((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_mac;
        ab.i("MicroMsg.exdevice.ExdeviceConnectManager", "StopSyncTimer, device Id = %d", new Object[] { Long.valueOf(l) });
        if (((d)localObject3).lrf.containsKey(Long.valueOf(l)))
        {
          ab.i("MicroMsg.exdevice.ExdeviceConnectManager", "Switch from main view to chatting view before exdevice sync timeout, just stop MTimerHandler");
          localObject3 = (com.tencent.mm.sdk.platformtools.ap)((d)localObject3).lrf.remove(Long.valueOf(l));
          if (localObject3 == null)
            break label788;
          ((com.tencent.mm.sdk.platformtools.ap)localObject3).stopTimer();
        }
        while (true)
          if (u.bpx().hR(((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_mac))
          {
            ab.i("MicroMsg.exdevice.ExdeviceEventManager", "Enter chatting ui, find this deivce has been connected aready, device name = %s, device id = %d", new Object[] { ((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_brandName, Long.valueOf(((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_mac) });
            if (u.bpx().hX(((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_mac))
            {
              ab.i("MicroMsg.exdevice.ExdeviceEventManager", "This device is auth aready");
              b(((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_brandName, ((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_url, 2, ((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_deviceID);
              k = i;
              i = j;
              j = k;
              break;
              if (!bo.nullAsNil(((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_connProto).contains("3"))
                break label1387;
              j++;
              if (!com.tencent.mm.plugin.d.a.e.a.dv(ah.getContext()))
              {
                ab.e("MicroMsg.exdevice.ExdeviceEventManager", "device is BLE, but you phone not support BLE.");
                break;
              }
              k = 0;
              m = i;
              i = j;
              j = m;
              break label500;
              label788: ab.e("MicroMsg.exdevice.ExdeviceConnectManager", "Remove deviceId(%d) from syncTimeOutMap failed!!!", new Object[] { Long.valueOf(l) });
              continue;
            }
            ab.i("MicroMsg.exdevice.ExdeviceEventManager", "This device has been connected but not auth yet.");
            k = i;
            i = j;
            j = k;
            break;
          }
        if (!com.tencent.mm.plugin.exdevice.service.d.dI(ah.getContext()))
        {
          ab.e("MicroMsg.exdevice.ExdeviceEventManager", "service not running");
          k = i;
          i = j;
          j = k;
          break label304;
        }
        if (f.b((com.tencent.mm.plugin.exdevice.h.b)localObject2))
        {
          ab.i("MicroMsg.exdevice.ExdeviceEventManager", "Connect simple device, mac(%s), brandName(%s)", new Object[] { com.tencent.mm.plugin.exdevice.j.b.ie(((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_mac), ((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_brandName });
          a(((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_brandName + ((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_mac, new e.a(this, ((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_brandName, com.tencent.mm.plugin.exdevice.j.b.ie(((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_mac), ((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_url, ((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_deviceID));
          Kg(com.tencent.mm.plugin.exdevice.j.b.ie(((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_mac));
          k = i;
          i = j;
          j = k;
          break label304;
        }
        ab.i("MicroMsg.exdevice.ExdeviceEventManager", "Connect AirSync device, mac(%s), brandName(%s)", new Object[] { com.tencent.mm.plugin.exdevice.j.b.ie(((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_mac), ((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_brandName });
        ad.bpd().uI(1);
        ad.bpd().a(Long.valueOf(((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_mac), ((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_connStrategy);
        ad.bpd().b(((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_brandName, ((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_mac, k);
        k = j;
        j = i;
        i = k;
        break label304;
      }
      if (paramInt == 1)
      {
        if (f.b((com.tencent.mm.plugin.exdevice.h.b)localObject2))
        {
          a(((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_brandName + ((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_mac, new e.a(this, ((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_brandName, com.tencent.mm.plugin.exdevice.j.b.ie(((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_mac), ((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_url, ((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_deviceID));
          Kg(com.tencent.mm.plugin.exdevice.j.b.ie(((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_mac));
          k = i;
          i = j;
          j = k;
          break label304;
        }
        ad.bpd().a(Long.valueOf(((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_mac), ((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_connStrategy);
        ad.bpd().b(((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_brandName, ((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_mac, k);
        k = j;
        j = i;
        i = k;
        break label304;
      }
      if (paramInt == 2)
      {
        if (f.b((com.tencent.mm.plugin.exdevice.h.b)localObject2))
        {
          Kf(com.tencent.mm.plugin.exdevice.j.b.ie(((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_mac));
          k = j;
          j = i;
          i = k;
          break label304;
        }
        ad.bpd();
        d.hH(((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_mac);
      }
      k = i;
      i = j;
      j = k;
      break label304;
      if (i + j > 0)
        if (!com.tencent.mm.plugin.d.a.e.a.aVH())
        {
          ab.w("MicroMsg.exdevice.ExdeviceEventManager", "System bluetooth is close");
          cc(paramString, 0);
        }
      while (true)
      {
        bool = true;
        AppMethodBeat.o(19230);
        break;
        if ((j > 0) && (i == 0) && (!com.tencent.mm.plugin.d.a.e.a.dv(ah.getContext())))
        {
          cc(paramString, 1);
          continue;
          cc(paramString, -1);
        }
      }
      label1387: k = -1;
      m = j;
      j = i;
      i = m;
    }
  }

  public final boolean b(b paramb)
  {
    AppMethodBeat.i(19243);
    boolean bool;
    if (this.lrw.remove(paramb))
    {
      bool = true;
      AppMethodBeat.o(19243);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(19243);
    }
  }

  final boolean c(com.tencent.mm.sdk.b.b paramb)
  {
    AppMethodBeat.i(19217);
    paramb = (dn)paramb;
    ab.i("MicroMsg.exdevice.ExdeviceEventManager", "ExDeviceGetLanDeviceInfosEvent: brandName=%s, context=%s", new Object[] { paramb.cwP.cwz, paramb.cwP.context });
    if (!Ke(paramb.cwP.cwz))
    {
      paramb.cwQ.cwO = null;
      paramb.cwQ.cwB = false;
      AppMethodBeat.o(19217);
      return true;
    }
    LinkedList localLinkedList = ad.boW().Kx(paramb.cwP.cwz);
    JSONArray localJSONArray = new JSONArray();
    while (true)
    {
      JSONObject localJSONObject;
      try
      {
        Iterator localIterator = localLinkedList.iterator();
        if (localIterator.hasNext())
        {
          com.tencent.mm.plugin.exdevice.h.b localb = (com.tencent.mm.plugin.exdevice.h.b)localIterator.next();
          if ((localLinkedList.isEmpty()) || (!bo.nullAsNil(localb.field_connProto).contains("4")))
            continue;
          localJSONObject = new org/json/JSONObject;
          localJSONObject.<init>();
          localJSONObject.put("deviceId", localb.field_deviceID);
          if (!this.lsm.Ki(localb.field_deviceID))
            break label284;
          localJSONObject.put("state", "connected");
          localJSONArray.put(localJSONObject);
          continue;
        }
      }
      catch (Exception localException)
      {
        ab.e("MicroMsg.exdevice.ExdeviceEventManager", "Ex in handleGetDeviceInfosEvent, %s", new Object[] { localException.getMessage() });
        paramb.cwQ.cwO = localJSONArray;
        paramb.cwQ.cwB = true;
        ab.i("MicroMsg.exdevice.ExdeviceEventManager", "GetDeviceInfos: %s", new Object[] { localJSONArray.toString() });
        AppMethodBeat.o(19217);
      }
      break;
      label284: localJSONObject.put("state", "disconnected");
    }
  }

  final boolean f(final com.tencent.mm.sdk.b.b paramb)
  {
    boolean bool = true;
    AppMethodBeat.i(19223);
    paramb = (dp)paramb;
    ab.i("MicroMsg.exdevice.ExdeviceEventManager", "handleGetTicketEvent: brandName=%s, deviceId=%s, type=%d", new Object[] { paramb.cwX.cwz, paramb.cwX.ceI, Integer.valueOf(paramb.cwX.type) });
    Object localObject1 = new ajn();
    ((ajn)localObject1).wpk = paramb.cwX.type;
    ((ajn)localObject1).wpl = 0;
    ((ajn)localObject1).vKM = new asq();
    ((ajn)localObject1).vKM.jBE = paramb.cwX.ceI;
    ((ajn)localObject1).vKM.vIk = paramb.cwX.cwz;
    Object localObject2 = new LinkedList();
    ((LinkedList)localObject2).add(localObject1);
    localObject1 = new com.tencent.mm.ai.f()
    {
      public final void onSceneEnd(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ai.m paramAnonymousm)
      {
        AppMethodBeat.i(19195);
        if ((paramAnonymousm != null) && (paramAnonymousm.getType() == 543))
        {
          aw.Rg().b(543, this);
          if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
          {
            ab.e("MicroMsg.exdevice.ExdeviceEventManager", "getTicketSceneEndImpl errType = [%s], errCode = [%s]， errMsg = [%s]", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
            paramb.cwY.cxa = true;
            paramb.cwY.cxb = null;
            if (paramb.callback != null)
              paramb.callback.run();
            AppMethodBeat.o(19195);
            return;
          }
          ab.i("MicroMsg.exdevice.ExdeviceEventManager", "getTicketSceneEndImpl errType = [%s], errCode = [%s]， errMsg = [%s]", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
          paramAnonymousString = (z)paramAnonymousm;
          if ((paramAnonymousString.lty == null) || (paramAnonymousString.lty.fsH.fsP == null));
          label188: ajq localajq;
          for (paramAnonymousString = null; ; paramAnonymousString = (ajp)paramAnonymousString.lty.fsH.fsP)
          {
            Iterator localIterator = paramAnonymousString.wpo.iterator();
            paramAnonymousInt1 = 0;
            while (true)
            {
              if (!localIterator.hasNext())
                break label412;
              localajq = (ajq)localIterator.next();
              if (localajq != null)
              {
                paramAnonymousString = null;
                paramAnonymousm = null;
                if (localajq.vKM != null)
                {
                  paramAnonymousString = localajq.vKM.jBE;
                  paramAnonymousm = localajq.vKM.vIk;
                }
                if ((localajq.Ret == 0) && (!bo.isNullOrNil(localajq.wdB)))
                  break;
                ab.e("MicroMsg.exdevice.ExdeviceEventManager", "deviceId(%s) get ticket fail. ret=%d, ticket=%s", new Object[] { paramAnonymousString, Integer.valueOf(localajq.Ret), localajq.wdB });
              }
            }
          }
          ab.i("MicroMsg.exdevice.ExdeviceEventManager", "GetHardDeviceOperTicket end. deviceId=%s, deviceType=%s, ticket=%s, oper=%d", new Object[] { paramAnonymousString, paramAnonymousm, localajq.wdB, Integer.valueOf(localajq.wpk) });
          paramb.cwY.cxa = true;
          paramb.cwY.cxb = localajq.wdB;
          if (paramb.callback == null)
            break label522;
          paramb.callback.run();
          paramAnonymousInt1 = 1;
        }
        label522: 
        while (true)
        {
          break label188;
          label412: if (paramAnonymousInt1 == 0)
          {
            paramb.cwY.cxa = true;
            paramb.cwY.cxb = null;
            if (paramb.callback != null)
              paramb.callback.run();
          }
          AppMethodBeat.o(19195);
          break;
          paramb.cwY.cxa = true;
          paramb.cwY.cxb = null;
          if (paramb.callback != null)
            paramb.callback.run();
          AppMethodBeat.o(19195);
          break;
        }
      }
    };
    localObject2 = new z((LinkedList)localObject2, paramb.cwX.cwz, paramb.cwX.cwZ);
    aw.Rg().a(543, (com.tencent.mm.ai.f)localObject1);
    if (!aw.Rg().a((com.tencent.mm.ai.m)localObject2, 0))
    {
      ab.e("MicroMsg.exdevice.ExdeviceEventManager", "MMCore.getNetSceneQueue().doScene failed!!!");
      aw.Rg().b(543, (com.tencent.mm.ai.f)localObject1);
      paramb.cwY.cxa = true;
      paramb.cwY.cxb = null;
      if (paramb.callback != null)
        paramb.callback.run();
      AppMethodBeat.o(19223);
    }
    while (true)
    {
      return bool;
      AppMethodBeat.o(19223);
      bool = false;
    }
  }

  final boolean g(com.tencent.mm.sdk.b.b paramb)
  {
    boolean bool = false;
    AppMethodBeat.i(19224);
    ef localef = (ef)paramb;
    ab.i("MicroMsg.exdevice.ExdeviceEventManager", "handleScanDeviceEvent: brandName=%s, op=%s, btVersion=%s", new Object[] { localef.cxG.cwz, Boolean.valueOf(localef.cxG.cwA), Integer.valueOf(localef.cxG.cxI) });
    int i = localef.cxG.cxI;
    int j = i;
    if (i != 0)
    {
      j = i;
      if (i != 1)
      {
        if (!com.tencent.mm.plugin.d.a.e.a.dv(ah.getContext()))
          break label209;
        ab.w("MicroMsg.exdevice.ExdeviceEventManager", "invalid btVersion %s, use defalut BLE", new Object[] { Integer.valueOf(i) });
        j = 0;
      }
    }
    Object localObject2;
    if (localef.cxG.cwA)
    {
      paramb = aa.boT();
      ??? = localef.cxG.cwz;
      localObject2 = new aa.a()
      {
        public final void a(String paramAnonymousString, byte[] paramAnonymousArrayOfByte, boolean paramAnonymousBoolean)
        {
          AppMethodBeat.i(19196);
          ab.i("MicroMsg.exdevice.ExdeviceEventManager", "OnScanDevice %s", new Object[] { paramAnonymousString });
          if (paramAnonymousArrayOfByte == null)
            ab.i("MicroMsg.exdevice.ExdeviceEventManager", "notifyOnScanDeviceResult. deviceId=%s, isCompleted=%s", new Object[] { paramAnonymousString, Boolean.valueOf(paramAnonymousBoolean) });
          while (true)
          {
            ec localec = new ec();
            localec.cxD.cxv = paramAnonymousArrayOfByte;
            localec.cxD.ceI = paramAnonymousString;
            localec.cxD.bcU = paramAnonymousBoolean;
            com.tencent.mm.sdk.b.a.xxA.a(localec, Looper.getMainLooper());
            AppMethodBeat.o(19196);
            return;
            ab.i("MicroMsg.exdevice.ExdeviceEventManager", "notifyOnScanDeviceResult. deviceId=%s, base64(broadcastData)=%s, isCompleted=%s", new Object[] { paramAnonymousString, Base64.encodeToString(paramAnonymousArrayOfByte, 0), Boolean.valueOf(paramAnonymousBoolean) });
          }
        }
      };
      ab.i("MicroMsg.exdevice.ScanDeviceLogic", "startScanDevice, brandName=%s", new Object[] { ??? });
      if (bo.isNullOrNil((String)???))
        ab.i("MicroMsg.exdevice.ScanDeviceLogic", "brand name is null");
    }
    while (true)
    {
      localef.cxH.cwB = true;
      AppMethodBeat.o(19224);
      bool = true;
      while (true)
      {
        return bool;
        label209: ab.e("MicroMsg.exdevice.ExdeviceEventManager", "invalid btVersion %s, return fail", new Object[] { Integer.valueOf(i) });
        localef.cxH.cwB = false;
        AppMethodBeat.o(19224);
      }
      paramb.lst = ((String)???);
      paramb.ltN = ((aa.a)localObject2);
      paramb.ltO.clear();
      localObject2 = paramb.ltP.iterator();
      while (((Iterator)localObject2).hasNext())
      {
        ??? = (com.tencent.mm.ai.m)((Iterator)localObject2).next();
        if (??? != null)
          aw.Rg().c((com.tencent.mm.ai.m)???);
      }
      paramb.ltP.clear();
      synchronized (aa.cli)
      {
        aa.ltQ.clear();
        if (!paramb.lsZ)
        {
          paramb.lsZ = true;
          aw.Rg().a(542, paramb);
          ad.bpd().a(j, paramb);
          ab.i("MicroMsg.exdevice.ScanDeviceLogic", "should start scan, startTimer");
          paramb.gGo.ae(12000L, 12000L);
        }
      }
      ab.w("MicroMsg.exdevice.ScanDeviceLogic", "still scanning. just change brand name and callback");
      continue;
      aa.boT().uK(j);
    }
  }

  final boolean k(List<com.tencent.mm.plugin.exdevice.h.b> paramList, int paramInt)
  {
    boolean bool = false;
    AppMethodBeat.i(19227);
    ab.i("MicroMsg.exdevice.ExdeviceEventManager", "handleWifiDeviceSwitchViewEvent");
    if (paramList.size() == 0)
    {
      ab.i("MicroMsg.exdevice.ExdeviceEventManager", "HardDeviceInfo is null or nil.");
      AppMethodBeat.o(19227);
    }
    while (true)
    {
      return bool;
      int i = -1;
      switch (paramInt)
      {
      default:
        paramInt = i;
      case 1:
      case 2:
      }
      while (true)
      {
        paramList = paramList.iterator();
        while (paramList.hasNext())
        {
          Object localObject = (com.tencent.mm.plugin.exdevice.h.b)paramList.next();
          localObject = new k(((com.tencent.mm.plugin.exdevice.h.b)localObject).field_brandName, ((com.tencent.mm.plugin.exdevice.h.b)localObject).field_deviceType, ((com.tencent.mm.plugin.exdevice.h.b)localObject).field_deviceID, paramInt);
          u.bpy().a((ae)localObject);
        }
        if (this.lso)
          this.mHandler.removeCallbacks(this.lsp);
        this.lsp = new e.c(this, paramList);
        this.mHandler.postDelayed(this.lsp, 300000L);
        this.lso = true;
        paramInt = 2;
        continue;
        if (this.lso)
        {
          this.mHandler.removeCallbacks(this.lsp);
          this.lso = false;
        }
        paramInt = 0;
      }
      AppMethodBeat.o(19227);
      bool = true;
    }
  }

  public final void o(String paramString1, String paramString2, boolean paramBoolean)
  {
    AppMethodBeat.i(19237);
    synchronized (this.lrw)
    {
      localObject2 = new java/util/LinkedList;
      ((LinkedList)localObject2).<init>(this.lrw);
      ??? = ((List)localObject2).iterator();
      if (((Iterator)???).hasNext())
        ((b)((Iterator)???).next()).p(paramString1, paramString2, paramBoolean);
    }
    ((List)localObject2).clear();
    Object localObject2 = this.lrx.values().iterator();
    while (((Iterator)localObject2).hasNext())
      ((b)((Iterator)localObject2).next()).p(paramString1, paramString2, paramBoolean);
    ab.d("MicroMsg.exdevice.ExdeviceEventManager", "simple BT on scan result: broadcastName=" + paramString1 + ", mac=" + paramString2 + ", isCompleted=" + paramBoolean);
    localObject2 = new er();
    ((er)localObject2).cyi.cyc = paramString1;
    ((er)localObject2).cyi.mac = paramString2;
    ((er)localObject2).cyi.bcU = paramBoolean;
    com.tencent.mm.sdk.b.a.xxA.a((com.tencent.mm.sdk.b.b)localObject2, Looper.getMainLooper());
    AppMethodBeat.o(19237);
  }

  public final boolean u(String paramString, byte[] paramArrayOfByte)
  {
    boolean bool = false;
    AppMethodBeat.i(19235);
    int i;
    if ((bo.isNullOrNil(paramString)) || (bo.cb(paramArrayOfByte)))
      if (bo.isNullOrNil(paramString))
      {
        paramString = "null";
        if (!bo.cb(paramArrayOfByte))
          break label83;
        i = 0;
        label43: ab.e("MicroMsg.exdevice.ExdeviceEventManager", "input error. mac = %s, dataLen = %d", new Object[] { paramString, Integer.valueOf(i) });
        AppMethodBeat.o(19235);
      }
    while (true)
    {
      return bool;
      paramString = "mac";
      break;
      label83: i = paramArrayOfByte.length;
      break label43;
      String str;
      if (bo.isNullOrNil(paramString))
      {
        str = "null";
        label102: if (!bo.cb(paramArrayOfByte))
          break label184;
      }
      long l;
      label184: for (i = 0; ; i = paramArrayOfByte.length)
      {
        ab.e("MicroMsg.exdevice.ExdeviceEventManager", "handleExDeviceSimpleBTSendDataToDevice. mac = %s, dataLen = %d", new Object[] { str, Integer.valueOf(i) });
        l = com.tencent.mm.plugin.exdevice.j.b.KK(paramString);
        paramString = ad.bpi().lta.hU(l);
        if (paramString != null)
          break label191;
        ab.e("MicroMsg.exdevice.ExdeviceEventManager", "can not find the hardevice connect state");
        AppMethodBeat.o(19235);
        break;
        str = paramString;
        break label102;
      }
      label191: if (paramString.cxs != 2)
      {
        ab.e("MicroMsg.exdevice.ExdeviceEventManager", "device is not connected.");
        AppMethodBeat.o(19235);
      }
      else
      {
        ad.bpi();
        bool = h.a(l, paramArrayOfByte, new e.41(this));
        AppMethodBeat.o(19235);
      }
    }
  }

  public static abstract interface b
  {
    public abstract void b(String paramString, byte[] paramArrayOfByte, boolean paramBoolean);

    public abstract void c(String paramString, int paramInt, long paramLong);

    public abstract void p(String paramString1, String paramString2, boolean paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.model.e
 * JD-Core Version:    0.6.2
 */