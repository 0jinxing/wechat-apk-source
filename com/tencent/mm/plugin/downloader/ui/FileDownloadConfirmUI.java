package com.tencent.mm.plugin.downloader.ui;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMBaseActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.widget.a.c;
import com.tencent.mm.ui.widget.a.c.a;

@a(7)
public class FileDownloadConfirmUI extends MMBaseActivity
{
  private c ggF = null;

  protected void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(2518);
    super.onCreate(paramBundle);
    setContentView(2130969389);
    if (d.iW(21))
      getWindow().setStatusBarColor(0);
    FileDownloadConfirmUI.1 local1 = new FileDownloadConfirmUI.1(this, getIntent().getLongExtra("extra_download_id", -1L));
    DialogInterface.OnClickListener local2 = new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
      }
    };
    paramBundle = new FileDownloadConfirmUI.3(this);
    c.a locala = new c.a(this);
    locala.asD("");
    locala.PZ(2131299775);
    locala.Qc(2131297088).a(local1);
    locala.Qd(2131296990).b(local2);
    locala.a(paramBundle);
    this.ggF = locala.aMb();
    this.ggF.show();
    ab.i("MicroMsg.FileDownloadConfirmUI", "Confirm Dialog");
    AppMethodBeat.o(2518);
  }

  public void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(2519);
    ab.i("MicroMsg.FileDownloadConfirmUI", "onNewIntent");
    AppMethodBeat.o(2519);
  }

  protected void onStop()
  {
    AppMethodBeat.i(2520);
    super.onStop();
    this.ggF.dismiss();
    AppMethodBeat.o(2520);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.ui.FileDownloadConfirmUI
 * JD-Core Version:    0.6.2
 */