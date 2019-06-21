package com.tencent.mm.plugin.appbrand.jsapi.nfc.hce;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.widget.a.f;
import java.util.Timer;

@com.tencent.mm.ui.base.a(7)
public class HCETransparentUI extends Activity
{
  private ResultReceiver JF;

  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(137931);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    ab.i("MicroMsg.HCETransparentUI", "alvinluo onActivityResult requestCode: %d, resultCode: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    paramIntent = a.hSt;
    if (paramInt1 == 1)
    {
      ab.i("MicroMsg.HCEActivityMgr", "alvinluo back from REQUEST_JUMP_NFC_SETTING");
      paramIntent.hSl = true;
      AppMethodBeat.o(137931);
    }
    while (true)
    {
      return;
      if (paramInt1 == 2)
        ab.i("MicroMsg.HCEActivityMgr", "alvinluo back from REQUEST_SET_DEFAULT_NFC_APPLICATION");
      AppMethodBeat.o(137931);
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(137929);
    super.onCreate(paramBundle);
    setContentView(2130969815);
    this.JF = ((ResultReceiver)getIntent().getParcelableExtra("HCE_Result_Receiver"));
    paramBundle = a.hSt;
    ResultReceiver localResultReceiver = this.JF;
    ab.i("MicroMsg.HCEActivityMgr", "alvinluo setHceActivity");
    if (localResultReceiver == null)
      ab.e("MicroMsg.HCEActivityMgr", "alvinluo setHceActivity hceActivity is null, or resultReceiver is null");
    paramBundle.hSq = this;
    paramBundle.JF = localResultReceiver;
    paramBundle = a.hSt;
    paramBundle.hSl = false;
    paramBundle.hSm = false;
    paramBundle.hSk = false;
    AppMethodBeat.o(137929);
  }

  protected void onDestroy()
  {
    AppMethodBeat.i(137933);
    super.onDestroy();
    AppMethodBeat.o(137933);
  }

  protected void onPause()
  {
    AppMethodBeat.i(137932);
    super.onPause();
    a.hSt.dismissDialog();
    AppMethodBeat.o(137932);
  }

  protected void onResume()
  {
    AppMethodBeat.i(137930);
    super.onResume();
    ab.i("MicroMsg.HCETransparentUI", "alvinluo onResume");
    ComponentName localComponentName = new ComponentName(this, HCEService.class.getCanonicalName());
    a locala = a.hSt;
    ab.i("MicroMsg.HCEActivityMgr", "alvinluo setPaymentServiceComponent");
    locala.hSp = localComponentName;
    locala = a.hSt;
    if (locala.hSl)
    {
      locala.hSo = new a.1(locala);
      locala.hSn = new Timer();
      locala.hSn.scheduleAtFixedRate(locala.hSo, 0L, 300L);
      if (locala.hSq != null)
      {
        locala.hSr = f.g(locala.hSq, locala.hSq.getString(2131301235));
        AppMethodBeat.o(137930);
      }
    }
    while (true)
    {
      return;
      ab.e("MicroMsg.HCEActivityMgr", "alvinluo showProgressDialog mHceActivity is null");
      AppMethodBeat.o(137930);
      continue;
      locala.aEu();
      AppMethodBeat.o(137930);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.jsapi.nfc.hce.HCETransparentUI
 * JD-Core Version:    0.6.2
 */