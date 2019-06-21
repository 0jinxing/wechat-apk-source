package com.tencent.mm.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Message;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.p;

@a(19)
public class DataTransferUI extends MMBaseActivity
{
  private p iGY;
  private long startTime = 0L;

  private void aP(Intent paramIntent)
  {
    AppMethodBeat.i(29193);
    boolean bool = paramIntent.getBooleanExtra("finish_data_transfer", false);
    ab.d("MicroMsg.DataTransferUI", "tryFinish, timestamp = " + System.currentTimeMillis() + ", finish = " + bool);
    if (bool)
      finish();
    AppMethodBeat.o(29193);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(29191);
    super.onCreate(paramBundle);
    ab.d("MicroMsg.DataTransferUI", "onCreate, timestamp = " + System.currentTimeMillis());
    this.startTime = System.currentTimeMillis();
    getString(2131297061);
    this.iGY = h.b(this, getString(2131296878), false, null);
    new ak()
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        AppMethodBeat.i(29190);
        if ((DataTransferUI.a(DataTransferUI.this) != null) && (DataTransferUI.a(DataTransferUI.this).isShowing()))
        {
          ab.e("MicroMsg.DataTransferUI", "dialog has shown for a long time, auto dismiss it...");
          DataTransferUI.a(DataTransferUI.this).dismiss();
          DataTransferUI.this.finish();
        }
        AppMethodBeat.o(29190);
      }
    }
    .sendEmptyMessageDelayed(0, 60000L);
    aP(getIntent());
    AppMethodBeat.o(29191);
  }

  protected void onDestroy()
  {
    AppMethodBeat.i(29195);
    super.onDestroy();
    ab.d("MicroMsg.DataTransferUI", "onDestroy");
    if ((this.iGY != null) && (this.iGY.isShowing()))
      this.iGY.dismiss();
    AppMethodBeat.o(29195);
  }

  protected void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(29192);
    ab.d("MicroMsg.DataTransferUI", "onNewIntent, timestamp = " + System.currentTimeMillis());
    aP(paramIntent);
    AppMethodBeat.o(29192);
  }

  protected void onPause()
  {
    AppMethodBeat.i(29194);
    ab.d("MicroMsg.DataTransferUI", "edw DataTransferUI duration time = " + (System.currentTimeMillis() - this.startTime));
    super.onPause();
    AppMethodBeat.o(29194);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.DataTransferUI
 * JD-Core Version:    0.6.2
 */