package com.tencent.mm.plugin.cloudvoip.cloudvoice.c;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.e.m;
import com.tencent.mm.compatible.e.n;
import com.tencent.mm.compatible.e.q;
import com.tencent.mm.compatible.util.e;
import com.tencent.mm.compatible.util.k;
import com.tencent.mm.protocal.protobuf.tt;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ag;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.bo;
import com.tencent.voip.mars.comm.PlatformComm;
import com.tencent.wxmm.IConfCallBack;
import com.tencent.wxmm.v2conference;
import java.io.IOException;

class g
{
  private static final String[] kyY;
  private static v2conference kzI;

  static
  {
    int i = 0;
    AppMethodBeat.i(135497);
    kyY = new String[] { "marsbridgenetwork", "marsbridgexlog", "confService" };
    Context localContext = ah.getContext();
    ab.i("MicroMsg.OpenVoice.OpenVoiceNativeEngine", "hy: load so");
    String[] arrayOfString = kyY;
    int j = arrayOfString.length;
    while (i < j)
    {
      k.a(arrayOfString[i], g.class.getClassLoader());
      i++;
    }
    PlatformComm.init(localContext, new Handler(Looper.getMainLooper()));
    kzI = new v2conference();
    AppMethodBeat.o(135497);
  }

  public static int HX(String paramString)
  {
    AppMethodBeat.i(135488);
    int i = kzI.UpdateAuthKey(paramString.getBytes(), paramString.getBytes().length);
    AppMethodBeat.o(135488);
    return i;
  }

  public static int O(byte[] paramArrayOfByte, int paramInt)
  {
    AppMethodBeat.i(135491);
    paramInt = kzI.GetAudioData(paramArrayOfByte, paramInt);
    AppMethodBeat.o(135491);
    return paramInt;
  }

  public static int a(String paramString1, String paramString2, String paramString3, IConfCallBack paramIConfCallBack)
  {
    AppMethodBeat.i(135487);
    ab.i("MicroMsg.OpenVoice.OpenVoiceNativeEngine", "hy: init voip");
    int i = -1;
    int j = i;
    try
    {
      tt localtt = new com/tencent/mm/protocal/protobuf/tt;
      j = i;
      localtt.<init>();
      j = i;
      localtt.app_id = paramString1;
      j = i;
      localtt.waU = paramString2;
      j = i;
      localtt.waV = paramString3;
      j = i;
      paramString1 = new java/lang/StringBuilder;
      j = i;
      paramString1.<init>();
      j = i;
      localtt.waW = (e.eSi + "/openvoice");
      j = i;
      localtt.waX = 0;
      j = i;
      localtt.waY = 1;
      j = i;
      localtt.waZ = com.tencent.mm.plugin.cloudvoip.cloudvoice.b.b.bgo();
      j = i;
      localtt.wba = n.getNumCores();
      j = i;
      localtt.wbb = bo.getInt(m.Lz(), 0);
      j = i;
      localtt.wbc = m.Lw();
      j = i;
      localtt.wbd = Build.MANUFACTURER;
      j = i;
      localtt.wbe = Build.MODEL;
      j = i;
      localtt.wbf = Build.VERSION.RELEASE;
      j = i;
      paramString1 = q.getDeviceID(ah.getContext());
      if (paramString1 != null)
      {
        j = i;
        if (!paramString1.isEmpty())
        {
          j = i;
          localtt.wbg = com.tencent.mm.bt.b.bI(ag.ck(paramString1).getBytes());
        }
      }
      while (true)
      {
        j = i;
        localtt.wbh = q.LW();
        j = i;
        paramString2 = new java/lang/StringBuilder;
        j = i;
        paramString2.<init>("envInfo:");
        j = i;
        paramString1 = new java/lang/String;
        j = i;
        paramString1.<init>(localtt.toByteArray());
        j = i;
        ab.i("MicroMsg.OpenVoice.OpenVoiceNativeEngine", paramString1 + ",length:" + localtt.toByteArray().length);
        j = i;
        i = kzI.InitSDK(localtt.toByteArray(), localtt.toByteArray().length, paramIConfCallBack);
        j = i;
        ab.v("MicroMsg.OpenVoice.OpenVoiceNativeEngine", "init ret:".concat(String.valueOf(i)));
        j = i;
        AppMethodBeat.o(135487);
        return j;
        j = i;
        ab.e("MicroMsg.OpenVoice.OpenVoiceNativeEngine", "getDeviceId failed");
      }
    }
    catch (IOException paramString1)
    {
      while (true)
        ab.printErrStackTrace("MicroMsg.OpenVoice.OpenVoiceNativeEngine", paramString1, "envInfo exception", new Object[0]);
    }
  }

  public static int bgq()
  {
    AppMethodBeat.i(135494);
    int i = kzI.UnInit();
    ab.i("MicroMsg.OpenVoice.OpenVoiceNativeEngine", "unInit ret:".concat(String.valueOf(i)));
    AppMethodBeat.o(135494);
    return i;
  }

  public static int e(int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    AppMethodBeat.i(135495);
    paramInt1 = kzI.SetAppCmd(paramInt1, paramArrayOfByte, paramInt2);
    AppMethodBeat.o(135495);
    return paramInt1;
  }

  public static int hj(long paramLong)
  {
    AppMethodBeat.i(135489);
    int i = kzI.JoinRoom(paramLong, 4);
    ab.i("MicroMsg.OpenVoice.OpenVoiceNativeEngine", "joinRoom ret:".concat(String.valueOf(i)));
    AppMethodBeat.o(135489);
    return i;
  }

  public static int s(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(135490);
    paramInt1 = kzI.SendAudioData(paramArrayOfByte, paramInt1, paramInt2);
    AppMethodBeat.o(135490);
    return paramInt1;
  }

  public static int tA(int paramInt)
  {
    AppMethodBeat.i(135492);
    paramInt = kzI.GetVoiceActivity(paramInt);
    AppMethodBeat.o(135492);
    return paramInt;
  }

  static int tB(int paramInt)
  {
    AppMethodBeat.i(135493);
    paramInt = kzI.ExitRoom(paramInt);
    ab.i("MicroMsg.OpenVoice.OpenVoiceNativeEngine", "exitRoom ret:".concat(String.valueOf(paramInt)));
    AppMethodBeat.o(135493);
    return paramInt;
  }

  public static void tC(int paramInt)
  {
    AppMethodBeat.i(135496);
    kzI.OnNetworkChange(paramInt);
    AppMethodBeat.o(135496);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cloudvoip.cloudvoice.c.g
 * JD-Core Version:    0.6.2
 */