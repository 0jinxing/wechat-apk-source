package com.tencent.mm.ui;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ai.p;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.bk;
import com.tencent.mm.model.r;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.base.h;

public class JSAPIUploadLogHelperUI extends MMBaseActivity
{
  private static volatile boolean mIsRunning = false;
  private static byte[] yjz = new byte[0];

  protected void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(29441);
    ab.i("MicroMsg.JSAPIUploadLogHelperUI", "onCreate called, isRunning:%b", new Object[] { Boolean.valueOf(mIsRunning) });
    super.onCreate(paramBundle);
    setContentView(2130968794);
    while (true)
    {
      int i;
      synchronized (yjz)
      {
        if (mIsRunning)
        {
          ab.w("MicroMsg.JSAPIUploadLogHelperUI", "reentered while last one is running, finish myself.");
          finish();
        }
        paramBundle = getIntent().getStringExtra("key_user");
        i = getIntent().getIntExtra("key_time", 0);
        if ((paramBundle != null) && (paramBundle.equals(r.Yz())))
        {
          bool = true;
          ab.i("MicroMsg.JSAPIUploadLogHelperUI", "upload log from jsapi, in upload activity, username-recv-well:%b, time:%d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(i) });
          if (paramBundle != null)
            break label165;
          ab.e("MicroMsg.JSAPIUploadLogHelperUI", "doUpload: userName is null.");
          finish();
          AppMethodBeat.o(29441);
          return;
        }
      }
      boolean bool = false;
      continue;
      label165: if (i < 0)
      {
        ab.e("MicroMsg.JSAPIUploadLogHelperUI", "doUpload: illegal time value: %d", new Object[] { Integer.valueOf(i) });
        finish();
        AppMethodBeat.o(29441);
      }
      else
      {
        getString(2131297061);
        ??? = h.b(this, getString(2131305732), false, null);
        aw.Rg().a(new bk(new JSAPIUploadLogHelperUI.1(this, paramBundle, i)), 0);
        aw.a(new JSAPIUploadLogHelperUI.3(this, (ProgressDialog)???, new JSAPIUploadLogHelperUI.2(this)));
        AppMethodBeat.o(29441);
      }
    }
  }

  protected void onDestroy()
  {
    AppMethodBeat.i(29442);
    ab.i("MicroMsg.JSAPIUploadLogHelperUI", "onDestroy called, isRunning:%b", new Object[] { Boolean.valueOf(mIsRunning) });
    super.onDestroy();
    AppMethodBeat.o(29442);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.JSAPIUploadLogHelperUI
 * JD-Core Version:    0.6.2
 */