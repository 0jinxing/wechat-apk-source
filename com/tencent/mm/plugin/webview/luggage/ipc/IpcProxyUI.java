package com.tencent.mm.plugin.webview.luggage.ipc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.d;
import com.tencent.mm.ipcinvoker.k;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;

@a(7)
public class IpcProxyUI extends MMActivity
{
  public final void aBS()
  {
    AppMethodBeat.i(6252);
    int i = getIntent().getIntExtra("orientation", -1);
    if (i != -1)
      setRequestedOrientation(i);
    AppMethodBeat.o(6252);
  }

  public final int getLayoutId()
  {
    return -1;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(6250);
    super.onCreate(paramBundle);
    ab.i("MicroMsg.IpcProxyUI", "onCreate");
    if (d.iW(21))
      getWindow().setStatusBarColor(0);
    paramBundle = (c)k.b(getIntent().getStringExtra("task_class_name"), c.class);
    if (paramBundle != null)
    {
      paramBundle.a(this, getIntent().getBundleExtra("input_data"), new IpcProxyUI.1(this));
      AppMethodBeat.o(6250);
    }
    while (true)
    {
      return;
      setResult(-1, new Intent());
      finish();
      AppMethodBeat.o(6250);
    }
  }

  public void onDestroy()
  {
    AppMethodBeat.i(6251);
    super.onDestroy();
    ab.i("MicroMsg.IpcProxyUI", "onDestroy");
    AppMethodBeat.o(6251);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.luggage.ipc.IpcProxyUI
 * JD-Core Version:    0.6.2
 */