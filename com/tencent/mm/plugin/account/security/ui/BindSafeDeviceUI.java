package com.tencent.mm.plugin.account.security.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMWizardActivity;

public class BindSafeDeviceUI extends MMWizardActivity
{
  public final int getLayoutId()
  {
    return 2130970577;
  }

  public final void initView()
  {
    AppMethodBeat.i(69861);
    setMMTitle(2131302672);
    setBackBtn(new BindSafeDeviceUI.1(this));
    ((ImageView)findViewById(2131827287)).setImageResource(2131230722);
    ((TextView)findViewById(2131827288)).setText(2131302678);
    ((TextView)findViewById(2131827291)).setText(2131302679);
    findViewById(2131827291).setOnClickListener(new BindSafeDeviceUI.2(this));
    AppMethodBeat.o(69861);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(69860);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(69860);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.account.security.ui.BindSafeDeviceUI
 * JD-Core Version:    0.6.2
 */