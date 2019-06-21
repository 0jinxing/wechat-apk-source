package com.tencent.mm.plugin.appbrand.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.report.model.l;
import com.tencent.mm.plugin.appbrand.report.model.l.a;
import com.tencent.mm.plugin.appbrand.report.model.l.b;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

public final class AppBrandNearbyEmptyUI extends MMActivity
{
  public final int getLayoutId()
  {
    return 2130968696;
  }

  public final void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(132993);
    super.onCreate(paramBundle);
    if (getIntent() == null)
    {
      finish();
      AppMethodBeat.o(132993);
    }
    TextView localTextView;
    while (true)
    {
      return;
      this.mController.contentView.setBackgroundColor(-855310);
      xE(-855310);
      setMMTitle(2131296727);
      ta(-16777216);
      setBackBtn(new AppBrandNearbyEmptyUI.1(this));
      p.b(this);
      paramBundle = (TextView)findViewById(2131821237);
      localTextView = (TextView)findViewById(2131821238);
      switch (getIntent().getIntExtra("extra_enter_reason", 0))
      {
      default:
        finish();
        AppMethodBeat.o(132993);
      case 0:
      case 1:
      }
    }
    paramBundle = new l();
    paramBundle.iBL = l.b.iBY;
    paramBundle.iBP = l.a.iBR;
    paramBundle.IF();
    while (true)
    {
      setResult(-1);
      AppMethodBeat.o(132993);
      break;
      paramBundle.setText(2131296726);
      localTextView.setText(2131296725);
      paramBundle = new l();
      paramBundle.iBL = l.b.iBY;
      paramBundle.iBP = l.a.iBS;
      paramBundle.IF();
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.AppBrandNearbyEmptyUI
 * JD-Core Version:    0.6.2
 */