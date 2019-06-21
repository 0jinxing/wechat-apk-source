package com.tencent.mm.plugin.appbrand.dynamic.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.appcache.j.a;
import com.tencent.mm.plugin.appbrand.dynamic.debugger.DebuggerInfo;
import com.tencent.mm.plugin.appbrand.dynamic.debugger.b;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMSwitchBtn;
import com.tencent.mm.ui.widget.MMSwitchBtn.a;

public class WxaWidgetSettingsUI extends MMActivity
{
  String appId;
  int cBc;

  public final int getLayoutId()
  {
    return 2130971251;
  }

  public void onCreate(Bundle paramBundle)
  {
    boolean bool1 = false;
    AppMethodBeat.i(11033);
    super.onCreate(paramBundle);
    setBackBtn(new WxaWidgetSettingsUI.1(this));
    setMMTitle(2131305753);
    this.appId = getIntent().getStringExtra("app_id");
    this.cBc = getIntent().getIntExtra("pkg_type", 0);
    MMSwitchBtn localMMSwitchBtn = (MMSwitchBtn)findViewById(2131829243);
    paramBundle = b.Ad(this.appId);
    if ((paramBundle != null) && (paramBundle.hmF));
    for (boolean bool2 = true; ; bool2 = false)
    {
      localMMSwitchBtn.setCheck(bool2);
      localMMSwitchBtn.setSwitchListener(new MMSwitchBtn.a()
      {
        public final void di(boolean paramAnonymousBoolean)
        {
          AppMethodBeat.i(11031);
          DebuggerInfo localDebuggerInfo1 = b.Ad(WxaWidgetSettingsUI.this.appId);
          DebuggerInfo localDebuggerInfo2 = localDebuggerInfo1;
          if (localDebuggerInfo1 == null)
          {
            localDebuggerInfo2 = new DebuggerInfo();
            b.a(WxaWidgetSettingsUI.this.appId, localDebuggerInfo2);
          }
          localDebuggerInfo2.hmF = paramAnonymousBoolean;
          AppMethodBeat.o(11031);
        }
      });
      localMMSwitchBtn = (MMSwitchBtn)findViewById(2131829244);
      if ((paramBundle == null) || (!paramBundle.hmD))
      {
        bool2 = bool1;
        if (!j.a.kR(this.cBc));
      }
      else
      {
        bool2 = true;
      }
      localMMSwitchBtn.setCheck(bool2);
      localMMSwitchBtn.setEnabled(j.a.np(this.cBc));
      localMMSwitchBtn.setSwitchListener(new WxaWidgetSettingsUI.3(this));
      AppMethodBeat.o(11033);
      return;
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.ui.WxaWidgetSettingsUI
 * JD-Core Version:    0.6.2
 */