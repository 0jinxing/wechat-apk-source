package com.tencent.mm.splash;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

final class i extends Activity
{
  public String xHe;

  protected final void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    AppMethodBeat.i(114883);
    if (paramInt1 == 100)
    {
      if (paramInt2 == -100)
        break label42;
      onBackPressed();
      AppMethodBeat.o(114883);
    }
    while (true)
    {
      return;
      finish();
      h.g("WxSplash.SplashHackActivity", "unknown request code.", new Object[0]);
      label42: AppMethodBeat.o(114883);
    }
  }

  protected final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(114878);
    super.onCreate(paramBundle);
    h.g("WxSplash.SplashHackActivity", "onCreate", new Object[0]);
    setVisible(false);
    paramBundle = new Intent(this, h.drg());
    paramBundle.putExtra("hashcode", hashCode());
    startActivityForResult(paramBundle, 100);
    AppMethodBeat.o(114878);
  }

  protected final void onDestroy()
  {
    AppMethodBeat.i(114882);
    h.g("WxSplash.SplashHackActivity", "onDestroy", new Object[0]);
    h.xGC.remove(this);
    setVisible(true);
    h.xGC.remove(this);
    super.onDestroy();
    AppMethodBeat.o(114882);
  }

  protected final void onNewIntent(Intent paramIntent)
  {
    AppMethodBeat.i(114879);
    h.g("WxSplash.SplashHackActivity", "onNewIntent.", new Object[0]);
    if ((h.xGG != null) && (h.xGG.n(paramIntent)))
      finish();
    AppMethodBeat.o(114879);
  }

  protected final void onPause()
  {
    AppMethodBeat.i(114881);
    h.g("WxSplash.SplashHackActivity", "onPause", new Object[0]);
    super.onPause();
    AppMethodBeat.o(114881);
  }

  protected final void onResume()
  {
    AppMethodBeat.i(114880);
    super.onResume();
    h.g("WxSplash.SplashHackActivity", "onResume", new Object[0]);
    AppMethodBeat.o(114880);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.splash.i
 * JD-Core Version:    0.6.2
 */