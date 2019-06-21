package com.tencent.mm.plugin.appbrand.ui;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class AppBrandUI1 extends AppBrandUI
{
  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(133152);
    super.onCreate(paramBundle);
    AppMethodBeat.o(133152);
  }

  public void onResume()
  {
    AppMethodBeat.i(133153);
    super.onResume();
    AppMethodBeat.o(133153);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandUI1
 * JD-Core Version:    0.6.2
 */