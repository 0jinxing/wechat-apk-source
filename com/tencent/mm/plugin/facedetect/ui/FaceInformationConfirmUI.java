package com.tencent.mm.plugin.facedetect.ui;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;

public class FaceInformationConfirmUI extends MMActivity
{
  public final int getLayoutId()
  {
    return 0;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(505);
    super.onCreate(paramBundle);
    AppMethodBeat.o(505);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.facedetect.ui.FaceInformationConfirmUI
 * JD-Core Version:    0.6.2
 */