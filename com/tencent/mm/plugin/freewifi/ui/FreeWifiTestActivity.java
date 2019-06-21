package com.tencent.mm.plugin.freewifi.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class FreeWifiTestActivity extends Activity
{
  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(21110);
    super.onCreate(paramBundle);
    setContentView(2130969600);
    findViewById(2131824168).setOnClickListener(new FreeWifiTestActivity.1(this));
    findViewById(2131824169).setOnClickListener(new FreeWifiTestActivity.2(this));
    AppMethodBeat.o(21110);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.freewifi.ui.FreeWifiTestActivity
 * JD-Core Version:    0.6.2
 */