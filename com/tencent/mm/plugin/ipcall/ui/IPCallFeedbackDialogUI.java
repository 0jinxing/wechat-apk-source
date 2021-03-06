package com.tencent.mm.plugin.ipcall.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.q;

@a(7)
public class IPCallFeedbackDialogUI extends MMActivity
{
  private g nDd;

  public void finish()
  {
    AppMethodBeat.i(22178);
    ab.i("MicroMsg.IPCallFeedbackDialogUI", "finish");
    if ((this.nDd != null) && (this.nDd.isShowing()))
    {
      this.nDd.dismiss();
      this.nDd = null;
    }
    super.finish();
    AppMethodBeat.o(22178);
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(22174);
    super.onCreate(paramBundle);
    ab.i("MicroMsg.IPCallFeedbackDialogUI", "onCreate");
    this.nDd = new g(this, this.mController.ylL, getIntent().getIntExtra("IPCallFeedbackDialogUI_KRoomId", 0), getIntent().getLongExtra("IPCallFeedbackDialogUI_KCallseq", 0L));
    this.nDd.setOnDismissListener(new IPCallFeedbackDialogUI.1(this));
    this.nDd.getWindow().setSoftInputMode(16);
    this.nDd.show();
    AppMethodBeat.o(22174);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(22177);
    ab.d("MicroMsg.IPCallFeedbackDialogUI", "onDestroy");
    super.onDestroy();
    AppMethodBeat.o(22177);
  }

  public void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(22176);
    ab.d("MicroMsg.IPCallFeedbackDialogUI", "onNewIntent");
    super.onNewIntent(paramIntent);
    AppMethodBeat.o(22176);
  }

  public void onResume()
  {
    AppMethodBeat.i(22175);
    ab.d("MicroMsg.IPCallFeedbackDialogUI", "onResume");
    super.onResume();
    AppMethodBeat.o(22175);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.ipcall.ui.IPCallFeedbackDialogUI
 * JD-Core Version:    0.6.2
 */