package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class AppBrandServiceChattingUI extends ChattingUI
{
  protected final ChattingUIFragment dBp()
  {
    AppMethodBeat.i(30369);
    AppBrandServiceChattingUI.AppBrandServiceChattingFmUI localAppBrandServiceChattingFmUI = new AppBrandServiceChattingUI.AppBrandServiceChattingFmUI((byte)0);
    AppMethodBeat.o(30369);
    return localAppBrandServiceChattingFmUI;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(30368);
    overridePendingTransition(0, 0);
    super.onCreate(null);
    AppMethodBeat.o(30368);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.chatting.AppBrandServiceChattingUI
 * JD-Core Version:    0.6.2
 */