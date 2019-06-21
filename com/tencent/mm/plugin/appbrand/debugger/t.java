package com.tencent.mm.plugin.appbrand.debugger;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Debug;
import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.r;
import com.tencent.mm.aa.h;
import com.tencent.mm.bt.a;
import com.tencent.mm.plugin.appbrand.appcache.aw;
import com.tencent.mm.protocal.protobuf.cqm;
import com.tencent.mm.protocal.protobuf.cqs;
import com.tencent.mm.protocal.protobuf.cqt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

public final class t
{
  private static String deviceID = null;
  public static l hkA = null;
  private static Boolean hkB = null;

  public static o a(a parama, l paraml, String paramString)
  {
    AppMethodBeat.i(101910);
    cqt localcqt = new cqt();
    try
    {
      parama = parama.toByteArray();
      if ((parama.length > 256) && (nJ(paraml.hjt.hjQ)))
      {
        byte[] arrayOfByte = r.compress(parama);
        localcqt.wdt = com.tencent.mm.bt.b.bI(arrayOfByte);
        localcqt.wWK = 1;
        ab.v("MicroMsg.RemoteDebugUtil", "use zlib %d/%d", new Object[] { Integer.valueOf(parama.length), Integer.valueOf(arrayOfByte.length) });
      }
      while (true)
      {
        if (paraml == null)
        {
          Debug.waitForDebugger();
          ab.e("MicroMsg.RemoteDebugUtil", "env = null ");
        }
        localcqt.fQi = paraml.hju.incrementAndGet();
        if (paraml.hjw != 0L)
          break;
        localcqt.akv = 0;
        paraml.hjw = System.currentTimeMillis();
        localcqt.category = paramString;
        ab.d("MicroMsg.RemoteDebugUtil", "parseDebugMessageToSend seq %d", new Object[] { Integer.valueOf(localcqt.fQi) });
        parama = new o();
        parama.hjf = System.currentTimeMillis();
        parama.hkb = localcqt.wdt.wR.length;
        parama.hka = localcqt;
        AppMethodBeat.o(101910);
        return parama;
        localcqt.wdt = com.tencent.mm.bt.b.bI(parama);
      }
    }
    catch (IOException parama)
    {
      while (true)
      {
        ab.e("MicroMsg.RemoteDebugUtil", "parseDebugMessageToSend %s", new Object[] { parama });
        continue;
        localcqt.akv = ((int)(System.currentTimeMillis() - paraml.hjw));
      }
    }
  }

  public static cqs a(int paramInt, a parama)
  {
    AppMethodBeat.i(101911);
    cqs localcqs = new cqs();
    localcqs.Cn = paramInt;
    if (bo.isNullOrNil(deviceID))
      deviceID = bo.gN(ah.getContext());
    localcqs.eCq = (deviceID + "-" + System.currentTimeMillis());
    localcqs.wdt = d(parama);
    AppMethodBeat.o(101911);
    return localcqs;
  }

  public static String a(String paramString, com.tencent.luggage.sdk.b.b paramb)
  {
    AppMethodBeat.i(101913);
    if (!paramb.yd())
    {
      paramString = "";
      AppMethodBeat.o(101913);
    }
    while (true)
    {
      return paramString;
      paramb = aw.a(paramb, paramString + ".map");
      if (bo.isNullOrNil(paramb))
      {
        paramString = "";
        AppMethodBeat.o(101913);
      }
      else
      {
        try
        {
          paramString = new java/lang/String;
          paramString.<init>(Base64.encode(paramb.getBytes(), 2), "utf-8");
          paramString = String.format("\n//# sourceMappingURL=data:application/json;charset=utf-8;base64,%s", new Object[] { paramString });
          AppMethodBeat.o(101913);
        }
        catch (UnsupportedEncodingException paramString)
        {
          ab.e("MicroMsg.RemoteDebugUtil", "execGameExternalScript Base64.encode %s", new Object[] { paramString.getMessage() });
          paramString = "";
          AppMethodBeat.o(101913);
        }
      }
    }
  }

  public static boolean a(l paraml, cqs paramcqs, cqm paramcqm, u paramu, p paramp)
  {
    boolean bool1 = false;
    AppMethodBeat.i(101912);
    if (paramcqs == null)
    {
      ab.w("MicroMsg.RemoteDebugUtil", "handleError dataFormat is null");
      AppMethodBeat.o(101912);
    }
    while (true)
    {
      return bool1;
      int i = paramcqs.Cn;
      if (paramcqm == null)
      {
        ab.w("MicroMsg.RemoteDebugUtil", "handleError cmd id: %d resp is null", new Object[] { Integer.valueOf(i) });
        AppMethodBeat.o(101912);
      }
      else
      {
        if (i == 1006)
        {
          if (-50011 != paramcqm.cyE)
            break label111;
          paraml.dJ(true);
        }
        while (true)
        {
          if (paramcqm.cyE != 0)
            break label135;
          AppMethodBeat.o(101912);
          bool1 = true;
          break;
          label111: boolean bool2 = paraml.isBusy();
          paraml.dJ(false);
          if (bool2)
            paramp.azk();
        }
        label135: ab.i("MicroMsg.RemoteDebugUtil", "handleError cmd id: %d, uuid: %s, errorCode: %d, errMsg: %s", new Object[] { Integer.valueOf(i), paramcqs.eCq, Integer.valueOf(paramcqm.cyE), paramcqm.cyF });
        al.d(new u.8(paramu, i, paramcqm));
        AppMethodBeat.o(101912);
      }
    }
  }

  public static boolean azr()
  {
    boolean bool = true;
    AppMethodBeat.i(101914);
    if (hkB != null)
    {
      bool = hkB.booleanValue();
      AppMethodBeat.o(101914);
    }
    while (true)
    {
      return bool;
      SharedPreferences localSharedPreferences = ah.getContext().getSharedPreferences("app_brand_global_sp", 0);
      if (localSharedPreferences == null)
      {
        ab.w("MicroMsg.RemoteDebugUtil", "isHardCodeOpenGamePreload, sp is null.");
        AppMethodBeat.o(101914);
      }
      else
      {
        bool = localSharedPreferences.getBoolean("hard_code_open_game_preload", true);
        hkB = Boolean.valueOf(bool);
        AppMethodBeat.o(101914);
      }
    }
  }

  public static ByteBuffer c(a parama)
  {
    AppMethodBeat.i(101908);
    try
    {
      parama = ByteBuffer.wrap(parama.toByteArray());
      AppMethodBeat.o(101908);
      return parama;
    }
    catch (IOException parama)
    {
      while (true)
      {
        ab.w("MicroMsg.RemoteDebugUtil", parama.getMessage());
        parama = ByteBuffer.allocate(0);
        AppMethodBeat.o(101908);
      }
    }
  }

  private static com.tencent.mm.bt.b d(a parama)
  {
    AppMethodBeat.i(101909);
    try
    {
      parama = com.tencent.mm.bt.b.bI(parama.toByteArray());
      AppMethodBeat.o(101909);
      return parama;
    }
    catch (IOException parama)
    {
      while (true)
      {
        ab.w("MicroMsg.RemoteDebugUtil", parama.getMessage());
        parama = com.tencent.mm.bt.b.bI(new byte[0]);
        AppMethodBeat.o(101909);
      }
    }
  }

  public static void dL(boolean paramBoolean)
  {
    AppMethodBeat.i(101915);
    SharedPreferences localSharedPreferences = ah.getContext().getSharedPreferences("app_brand_global_sp", 0);
    if (localSharedPreferences == null)
    {
      ab.w("MicroMsg.RemoteDebugUtil", "setHardCodeOpenGamePreload, sp is null.");
      AppMethodBeat.o(101915);
    }
    while (true)
    {
      return;
      localSharedPreferences.edit().putBoolean("hard_code_open_game_preload", paramBoolean).commit();
      AppMethodBeat.o(101915);
    }
  }

  public static boolean nJ(int paramInt)
  {
    if ((paramInt & 0x1) != 0);
    for (boolean bool = true; ; bool = false)
      return bool;
  }

  public static m zP(String paramString)
  {
    AppMethodBeat.i(101907);
    ab.i("MicroMsg.RemoteDebugUtil", "parseRemoteDebugInfo extInfo=%s", new Object[] { paramString });
    m localm = new m();
    if (!bo.isNullOrNil(paramString));
    try
    {
      paramString = h.lw(paramString);
      localm.hjL = paramString.optBoolean("open_remote", false);
      localm.ehq = paramString.optString("room_id");
      localm.hjM = paramString.optString("wxpkg_info");
      localm.hjN = paramString.optString("qrcode_id");
      localm.hjO = paramString.optInt("remote_network_type", 1);
      localm.bQs = paramString.optBoolean("disable_url_check", true);
      localm.hjP = paramString.optInt("remote_proxy_port", 9976);
      localm.hjQ = paramString.optInt("remote_support_compress_algo");
      AppMethodBeat.o(101907);
      return localm;
    }
    catch (Exception paramString)
    {
      while (true)
        ab.e("MicroMsg.RemoteDebugUtil", "parseRemoteDebugInfo %s", new Object[] { paramString });
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.debugger.t
 * JD-Core Version:    0.6.2
 */