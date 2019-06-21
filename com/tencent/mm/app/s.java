package com.tencent.mm.app;

import android.app.Activity;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class s extends Activity
{
  protected final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(137942);
    super.onCreate(paramBundle);
    ab.i("WxSplash.SuicideHackActivity", "onCreate");
    finish();
    AppMethodBeat.o(137942);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.app.s
 * JD-Core Version:    0.6.2
 */