package com.tencent.mm.plugin.traceroute.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.model.aw;
import com.tencent.mm.model.c;
import com.tencent.mm.plugin.traceroute.b.a;
import com.tencent.mm.sdk.platformtools.ak;
import com.tencent.mm.sdk.platformtools.ap;
import com.tencent.mm.sdk.platformtools.ap.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMProgressBar;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.t;

public class NetworkDiagnoseUI extends MMActivity
{
  private ak handler;
  private TextView mnA;
  private int oAI;
  private final int sJo;
  private int sJp;
  private a sJq;
  private MMProgressBar sJr;
  private ap sJs;

  public NetworkDiagnoseUI()
  {
    AppMethodBeat.i(26034);
    this.sJo = 100;
    this.oAI = 0;
    this.sJp = 0;
    this.sJs = new ap(new ap.a()
    {
      public final boolean BI()
      {
        AppMethodBeat.i(26023);
        NetworkDiagnoseUI.a(NetworkDiagnoseUI.this, NetworkDiagnoseUI.a(NetworkDiagnoseUI.this) + 1);
        NetworkDiagnoseUI.b(NetworkDiagnoseUI.this, NetworkDiagnoseUI.b(NetworkDiagnoseUI.this));
        boolean bool;
        if (NetworkDiagnoseUI.b(NetworkDiagnoseUI.this) < 100)
        {
          NetworkDiagnoseUI.c(NetworkDiagnoseUI.this).setProgress(NetworkDiagnoseUI.b(NetworkDiagnoseUI.this));
          bool = true;
          AppMethodBeat.o(26023);
        }
        while (true)
        {
          return bool;
          NetworkDiagnoseUI.c(NetworkDiagnoseUI.this).setProgress(100);
          bool = false;
          AppMethodBeat.o(26023);
        }
      }
    }
    , true);
    this.handler = new NetworkDiagnoseUI.2(this);
    AppMethodBeat.o(26034);
  }

  private void cHA()
  {
    AppMethodBeat.i(26040);
    h.a(this, 2131298413, 2131298875, 2131297088, 2131296990, new NetworkDiagnoseUI.7(this), new NetworkDiagnoseUI.8(this));
    AppMethodBeat.o(26040);
  }

  public final int getLayoutId()
  {
    return 2130970299;
  }

  public final void initView()
  {
    AppMethodBeat.i(26036);
    this.mnA = ((TextView)findViewById(2131826338));
    this.sJr = ((MMProgressBar)findViewById(2131826337));
    this.sJr.setOnProgressChangedListener(new NetworkDiagnoseUI.3(this));
    setMMTitle("");
    setBackBtn(new NetworkDiagnoseUI.4(this));
    new ak().postDelayed(new NetworkDiagnoseUI.5(this), 200L);
    AppMethodBeat.o(26036);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(26035);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(26035);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(26039);
    boolean bool;
    if ((paramInt == 4) && (paramKeyEvent.getRepeatCount() == 0))
    {
      cHA();
      bool = true;
      AppMethodBeat.o(26039);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(26039);
    }
  }

  public void onPause()
  {
    AppMethodBeat.i(26037);
    this.sJr.setAutoProgress(false);
    super.onPause();
    AppMethodBeat.o(26037);
  }

  public void onResume()
  {
    AppMethodBeat.i(26038);
    aw.ZK();
    if (!c.isSDCardAvailable())
    {
      t.hO(this);
      AppMethodBeat.o(26038);
    }
    while (true)
    {
      return;
      this.sJr.setAutoProgress(true);
      super.onResume();
      AppMethodBeat.o(26038);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.traceroute.ui.NetworkDiagnoseUI
 * JD-Core Version:    0.6.2
 */