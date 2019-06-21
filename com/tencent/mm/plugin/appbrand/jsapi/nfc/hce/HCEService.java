package com.tencent.mm.plugin.appbrand.jsapi.nfc.hce;

import android.annotation.TargetApi;
import android.content.Intent;
import android.nfc.cardemulation.HostApduService;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.util.Base64;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

@TargetApi(19)
public class HCEService extends HostApduService
{
  private String mAppId = null;

  public void onCreate()
  {
    AppMethodBeat.i(137907);
    super.onCreate();
    ab.i("MicroMsg.HCEService", "alvinluo HCEService onCreate");
    AppMethodBeat.o(137907);
  }

  public void onDeactivated(int paramInt)
  {
    AppMethodBeat.i(137911);
    ab.i("MicroMsg.HCEService", "alvinluo HCEService onDeactivated reason: %d", new Object[] { Integer.valueOf(paramInt) });
    b.hSG.hSA = false;
    b.hSG.hSB = false;
    Bundle localBundle = new Bundle();
    localBundle.putInt("key_on_deactivated_reason", paramInt);
    b.hSG.b(this.mAppId, 41, localBundle);
    AppMethodBeat.o(137911);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(137908);
    super.onDestroy();
    ab.i("MicroMsg.HCEService", "alvinluo HCEService onDestroy");
    b.hSG.aEx();
    AppMethodBeat.o(137908);
  }

  public int onStartCommand(Intent paramIntent, int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(137909);
    ab.i("MicroMsg.HCEService", "alvinluo HCEService onStartCommand");
    long l1 = System.currentTimeMillis();
    ab.i("MicroMsg.HCEService", "alvinluo HCEService onStartCommand start: %d", new Object[] { Long.valueOf(l1) });
    if (paramIntent == null)
    {
      paramInt1 = super.onStartCommand(paramIntent, paramInt1, paramInt2);
      AppMethodBeat.o(137909);
    }
    while (true)
    {
      return paramInt1;
      try
      {
        b localb = b.hSG;
        Object localObject = (ResultReceiver)paramIntent.getParcelableExtra("HCE_Result_Receiver");
        ab.i("MicroMsg.HCEServiceMgr", "alvinluo setHceService");
        localb.hSF = this;
        localb.JF = ((ResultReceiver)localObject);
        this.mAppId = paramIntent.getStringExtra("key_appid");
        localb = b.hSG;
        localb.hSf = paramIntent.getIntExtra("key_time_limit", 1500);
        if (localb.hSf < 1500)
        {
          ab.i("MicroMsg.HCEServiceMgr", "alvinluo HCEService timeLimit: %d smaller than: %d and set a valid value", new Object[] { Integer.valueOf(localb.hSf), Integer.valueOf(1500) });
          localb.hSf = 1500;
        }
        if (localb.hSf > 60000)
        {
          ab.i("MicroMsg.HCEServiceMgr", "alvinluo HCEService timeLimit: %d, bigger than: %d and set a valid value", new Object[] { Integer.valueOf(localb.hSf), Integer.valueOf(60000) });
          localb.hSf = 60000;
        }
        ab.i("MicroMsg.HCEServiceMgr", "alvinluo HCEService valid timeLimit: %d", new Object[] { Integer.valueOf(localb.hSf) });
        localb = b.hSG;
        String str = this.mAppId;
        localObject = paramIntent.getStringArrayListExtra("key_aid_list");
        localb.mAppId = str;
        localb.hSx = ((ArrayList)localObject);
        b.hSG.aEw();
        b.hSG.hSy = false;
        long l2 = System.currentTimeMillis();
        ab.i("MicroMsg.HCEService", "alvinluo HCEService onStartCommand end: %d, total: %d", new Object[] { Long.valueOf(l2), Long.valueOf(l2 - l1) });
        paramInt1 = super.onStartCommand(paramIntent, paramInt1, paramInt2);
        AppMethodBeat.o(137909);
      }
      catch (Exception localException)
      {
        while (true)
          ab.printErrStackTrace("MicroMsg.HCEService", localException, "under dos attack(?): invalid key_result_receiver", new Object[0]);
      }
    }
  }

  public byte[] processCommandApdu(byte[] paramArrayOfByte, Bundle paramBundle)
  {
    AppMethodBeat.i(137910);
    ab.i("MicroMsg.HCEService", "alvinluo HCECOMMAND processCommandApdu, received command from system: %s", new Object[] { c.ak(paramArrayOfByte) });
    paramBundle = Base64.encode(paramArrayOfByte, 2);
    paramArrayOfByte = new Bundle();
    paramArrayOfByte.putString("key_apdu_command", new String(paramBundle, StandardCharsets.UTF_8));
    b.hSG.a(31, this.mAppId, paramArrayOfByte);
    AppMethodBeat.o(137910);
    return null;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.nfc.hce.HCEService
 * JD-Core Version:    0.6.2
 */