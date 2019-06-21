package com.tencent.mm.plugin.appbrand.dynamic.ui;

import android.app.Activity;
import android.content.res.TypedArray;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.a;
import com.tencent.mm.ipcinvoker.type.IPCBoolean;
import com.tencent.mm.ipcinvoker.type.IPCVoid;
import com.tencent.mm.plugin.appbrand.collector.c;
import com.tencent.mm.plugin.appbrand.collector.f;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.widget.MMSwitchBtn;

public class WxaWidgetPerformanceUI extends MMActivity
{
  MMSwitchBtn hpg;
  MMSwitchBtn hph;
  MMSwitchBtn hpi;

  public void finish()
  {
    AppMethodBeat.i(11029);
    if ((isFinishing()) || (this.uiu))
    {
      AppMethodBeat.o(11029);
      return;
    }
    if (Build.VERSION.SDK_INT >= 21)
      finishAndRemoveTask();
    while (true)
    {
      TypedArray localTypedArray = obtainStyledAttributes(16973825, new int[] { 16842938, 16842939 });
      int i = localTypedArray.getResourceId(0, 0);
      int j = localTypedArray.getResourceId(1, 0);
      localTypedArray.recycle();
      overridePendingTransition(i, j);
      AppMethodBeat.o(11029);
      break;
      super.finish();
    }
  }

  public final int getLayoutId()
  {
    return 2130971250;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(11028);
    super.onCreate(paramBundle);
    setBackBtn(new WxaWidgetPerformanceUI.1(this));
    setMMTitle(2131305750);
    Object localObject = (TextView)findViewById(2131826524);
    paramBundle = findViewById(2131826523);
    paramBundle.setOnClickListener(new WxaWidgetPerformanceUI.2(this, (TextView)localObject));
    findViewById(2131820976).setOnClickListener(new WxaWidgetPerformanceUI.3(this, (TextView)localObject));
    localObject = (MMSwitchBtn)findViewById(2131826519);
    boolean bool = c.ayt();
    ((MMSwitchBtn)localObject).setCheck(bool);
    ((MMSwitchBtn)localObject).setSwitchListener(new WxaWidgetPerformanceUI.4(this, paramBundle));
    paramBundle.setEnabled(bool);
    this.hpg = ((MMSwitchBtn)findViewById(2131826520));
    this.hpg.setEnabled(bool);
    this.hpg.setCheck(c.yM("jsapi_draw_canvas"));
    this.hpg.setSwitchListener(new WxaWidgetPerformanceUI.5(this));
    this.hph = ((MMSwitchBtn)findViewById(2131826521));
    this.hph.setEnabled(bool);
    this.hph.setCheck(c.yM("widget_launch"));
    this.hph.setSwitchListener(new WxaWidgetPerformanceUI.6(this));
    this.hpi = ((MMSwitchBtn)findViewById(2131826522));
    this.hpi.setEnabled(bool);
    this.hpi.setCheck(f.ayu());
    this.hpi.setSwitchListener(new WxaWidgetPerformanceUI.7(this));
    AppMethodBeat.o(11028);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }

  static class b
    implements a<IPCBoolean, IPCVoid>
  {
  }

  static class c
    implements a<IPCBoolean, IPCVoid>
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.dynamic.ui.WxaWidgetPerformanceUI
 * JD-Core Version:    0.6.2
 */