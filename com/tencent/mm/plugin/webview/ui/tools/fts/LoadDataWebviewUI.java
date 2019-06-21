package com.tencent.mm.plugin.webview.ui.tools.fts;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.concurrent.CountDownLatch;

public class LoadDataWebviewUI extends PreLoadWebViewUI
{
  private CountDownLatch uBY;

  public LoadDataWebviewUI()
  {
    AppMethodBeat.i(8556);
    this.uBY = new CountDownLatch(1);
    AppMethodBeat.o(8556);
  }

  public void aMh()
  {
    AppMethodBeat.i(8558);
    super.aMh();
    this.uBY.countDown();
    AppMethodBeat.o(8558);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(8557);
    super.onCreate(paramBundle);
    AppMethodBeat.o(8557);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.fts.LoadDataWebviewUI
 * JD-Core Version:    0.6.2
 */