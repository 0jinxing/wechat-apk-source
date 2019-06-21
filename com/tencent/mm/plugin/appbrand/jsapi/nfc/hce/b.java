package com.tencent.mm.plugin.appbrand.jsapi.nfc.hce;

import android.annotation.TargetApi;
import android.content.ComponentName;
import android.nfc.NfcAdapter;
import android.nfc.cardemulation.CardEmulation;
import android.nfc.cardemulation.HostApduService;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.tencent.luggage.a.e;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.jsapi.nfc.hce.a.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.util.ArrayList;
import java.util.List;

@TargetApi(19)
public final class b
{
  private static final byte[] hSE;
  public static b hSG;
  private static long mStartTime;
  ResultReceiver JF;
  boolean hSA;
  boolean hSB;
  private a hSC;
  private com.tencent.mm.plugin.appbrand.jsapi.nfc.hce.a.b hSD;
  HostApduService hSF;
  int hSf;
  ArrayList<String> hSx;
  boolean hSy;
  private boolean hSz;
  String mAppId;

  static
  {
    AppMethodBeat.i(137928);
    hSE = new byte[] { 0, 0 };
    mStartTime = -1L;
    hSG = null;
    hSG = new b();
    AppMethodBeat.o(137928);
  }

  public b()
  {
    AppMethodBeat.i(137919);
    this.mAppId = null;
    this.hSy = false;
    this.hSz = true;
    this.hSA = false;
    this.hSB = false;
    this.hSC = new b.a(this, (byte)0);
    this.hSD = new b.b(this, (byte)0);
    AppMethodBeat.o(137919);
  }

  private void B(Bundle paramBundle)
  {
    AppMethodBeat.i(137926);
    ab.i("MicroMsg.HCEServiceMgr", "alvinluo HCE EVENT mm to AppBrand");
    if (this.JF != null)
      this.JF.send(10002, paramBundle);
    AppMethodBeat.o(137926);
  }

  private void a(byte[] paramArrayOfByte, boolean paramBoolean, HostApduService paramHostApduService)
  {
    try
    {
      AppMethodBeat.i(137925);
      ab.i("MicroMsg.HCEServiceMgr", "alvinluo HCECOMMAND sendResponseCommandToSystem isDefaultCommand: %b, hasCommandNotResponded: %b", new Object[] { Boolean.valueOf(paramBoolean), Boolean.valueOf(this.hSz) });
      if (this.hSz)
      {
        this.hSz = false;
        long l = System.currentTimeMillis();
        ab.i("MicroMsg.HCEServiceMgr", "alvinluo HCECOMMAND send response command time: %d, cost: %d", new Object[] { Long.valueOf(l), Long.valueOf(l - mStartTime) });
        if (paramHostApduService == null)
          break label141;
        paramHostApduService.sendResponseApdu(paramArrayOfByte);
      }
      while (true)
      {
        if (paramBoolean)
        {
          paramArrayOfByte = this.mAppId;
          ab.i("MicroMsg.HCEReportManager", "alvinluo reportHCEtimeExceeded appId: %s", new Object[] { paramArrayOfByte });
          ((com.tencent.mm.plugin.appbrand.n.b)e.C(com.tencent.mm.plugin.appbrand.n.b.class)).X(14838, paramArrayOfByte);
        }
        AppMethodBeat.o(137925);
        return;
        label141: ab.e("MicroMsg.HCEServiceMgr", "alvinluo sendResponseCommandToSystem hceService is null");
      }
    }
    finally
    {
    }
    throw paramArrayOfByte;
  }

  private void ep(boolean paramBoolean)
  {
    AppMethodBeat.i(137922);
    Bundle localBundle = new Bundle();
    if (paramBoolean)
    {
      localBundle.putInt("errCode", 0);
      localBundle.putString("errMsg", "");
    }
    while (true)
    {
      b(this.mAppId, 12, localBundle);
      AppMethodBeat.o(137922);
      return;
      localBundle.putInt("errCode", 13006);
      localBundle.putString("errMsg", "register aids failed");
    }
  }

  public final void a(int paramInt, String paramString, Bundle paramBundle)
  {
    AppMethodBeat.i(137920);
    ab.i("MicroMsg.HCEServiceMgr", "alvinluo genCallHCEService type = %d", new Object[] { Integer.valueOf(paramInt) });
    switch (paramInt)
    {
    default:
    case 32:
    case 31:
    case 21:
    case 22:
    case 23:
    case 24:
    case 13:
    }
    while (true)
    {
      AppMethodBeat.o(137920);
      while (true)
      {
        return;
        if (this.hSC == null)
          break;
        paramBundle = paramBundle.getString("key_apdu_command");
        this.hSC.cm(paramString, paramBundle);
        AppMethodBeat.o(137920);
        continue;
        if (this.hSC == null)
          break;
        paramBundle = paramBundle.getString("key_apdu_command");
        this.hSC.cl(paramString, paramBundle);
        AppMethodBeat.o(137920);
        continue;
        if (this.hSD == null)
          break;
        this.hSD.onCreate();
        AppMethodBeat.o(137920);
        continue;
        if (this.hSD == null)
          break;
        this.hSD.onResume();
        AppMethodBeat.o(137920);
        continue;
        if (this.hSD == null)
          break;
        this.hSD.onPause();
        AppMethodBeat.o(137920);
        continue;
        if (this.hSD == null)
          break;
        this.hSD.onDestroy();
        AppMethodBeat.o(137920);
      }
      aEx();
      if (this.hSF != null)
        this.hSF.stopSelf();
    }
  }

  @TargetApi(21)
  public final void aEw()
  {
    AppMethodBeat.i(137921);
    if ((this.hSx == null) || (this.hSF == null))
    {
      ab.e("MicroMsg.HCEServiceMgr", "alvinluo mAidList is null, or mHceService is null fail to register");
      AppMethodBeat.o(137921);
    }
    while (true)
    {
      return;
      Object localObject1 = NfcAdapter.getDefaultAdapter(this.hSF);
      if (localObject1 == null)
      {
        ab.e("MicroMsg.HCEServiceMgr", "alvinluo NfcAdapter is null when register aids");
        AppMethodBeat.o(137921);
      }
      else if (Build.VERSION.SDK_INT < 21)
      {
        ab.e("MicroMsg.HCEServiceMgr", "alvinluo android version: %d is not satisfied when register aids", new Object[] { Integer.valueOf(Build.VERSION.SDK_INT) });
        AppMethodBeat.o(137921);
      }
      else
      {
        localObject1 = CardEmulation.getInstance((NfcAdapter)localObject1);
        if (localObject1 != null)
        {
          try
          {
            Object localObject2 = new android/content/ComponentName;
            ((ComponentName)localObject2).<init>(this.hSF, this.hSF.getClass());
            boolean bool = ((CardEmulation)localObject1).registerAidsForService((ComponentName)localObject2, "payment", this.hSx);
            ab.i("MicroMsg.HCEServiceMgr", "alvinluo register aids result: %b", new Object[] { Boolean.valueOf(bool) });
            if (!bool)
              break label277;
            ep(true);
            localObject2 = ((CardEmulation)localObject1).getAidsForService((ComponentName)localObject2, "payment");
            if ((localObject2 != null) && (((List)localObject2).size() > 0))
              for (int i = 0; i < ((List)localObject2).size(); i++)
              {
                localObject1 = new java/lang/StringBuilder;
                ((StringBuilder)localObject1).<init>("dynamicAIDList aid=");
                ab.e("MicroMsg.HCEServiceMgr", (String)((List)localObject2).get(i));
              }
            AppMethodBeat.o(137921);
          }
          catch (Exception localException)
          {
            ab.printErrStackTrace("MicroMsg.HCEServiceMgr", localException, "alvinluo HCEService register aid exception", new Object[0]);
            ep(false);
          }
        }
        else
        {
          AppMethodBeat.o(137921);
          continue;
          label277: ep(false);
          AppMethodBeat.o(137921);
        }
      }
    }
  }

  @TargetApi(21)
  public final void aEx()
  {
    AppMethodBeat.i(137924);
    if (this.hSF == null)
    {
      ab.e("MicroMsg.HCEServiceMgr", "alvinluo mHceService is null fail to unregisterAids");
      AppMethodBeat.o(137924);
    }
    while (true)
    {
      return;
      Object localObject = NfcAdapter.getDefaultAdapter(this.hSF);
      if (localObject == null)
      {
        AppMethodBeat.o(137924);
      }
      else if (Build.VERSION.SDK_INT < 21)
      {
        AppMethodBeat.o(137924);
      }
      else
      {
        CardEmulation localCardEmulation = CardEmulation.getInstance((NfcAdapter)localObject);
        if (localCardEmulation != null)
        {
          localObject = new ComponentName(this.hSF, this.hSF.getClass());
          ab.i("MicroMsg.HCEServiceMgr", "alvinluo HCEService unregister aids");
          localCardEmulation.removeAidsForService((ComponentName)localObject, "payment");
        }
        AppMethodBeat.o(137924);
      }
    }
  }

  public final void b(String paramString, int paramInt, Bundle paramBundle)
  {
    AppMethodBeat.i(137923);
    paramBundle.putString("key_appid", paramString);
    paramBundle.putInt("key_event_type", paramInt);
    B(paramBundle);
    AppMethodBeat.o(137923);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.nfc.hce.b
 * JD-Core Version:    0.6.2
 */