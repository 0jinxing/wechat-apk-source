package com.tencent.mm.plugin.appbrand.wxawidget.console;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.a;
import com.tencent.mm.ipcinvoker.type.IPCBoolean;
import com.tencent.mm.ipcinvoker.type.IPCVoid;
import com.tencent.mm.plugin.appbrand.collector.c;
import com.tencent.mm.ui.widget.MMSwitchBtn;

public class PerformancePanel extends FrameLayout
{
  MMSwitchBtn hpg;
  MMSwitchBtn hph;
  MMSwitchBtn hpi;

  public PerformancePanel(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(11184);
    init();
    AppMethodBeat.o(11184);
  }

  public PerformancePanel(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(11185);
    init();
    AppMethodBeat.o(11185);
  }

  private void init()
  {
    AppMethodBeat.i(11186);
    LayoutInflater.from(getContext()).inflate(2130970360, this, true);
    Object localObject = (TextView)findViewById(2131826524);
    View localView = findViewById(2131826523);
    localView.setOnClickListener(new PerformancePanel.1(this, (TextView)localObject));
    findViewById(2131820976).setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(11174);
        com.tencent.mm.ipcinvoker.f.a("com.tencent.mm:support", null, PerformancePanel.a.class, null);
        c.clear();
        com.tencent.mm.plugin.appbrand.collector.f.reset();
        this.hpk.setText(c.yJ("jsapi_draw_canvas").toString());
        AppMethodBeat.o(11174);
      }
    });
    localObject = (MMSwitchBtn)findViewById(2131826519);
    boolean bool = c.ayt();
    ((MMSwitchBtn)localObject).setCheck(bool);
    ((MMSwitchBtn)localObject).setSwitchListener(new PerformancePanel.3(this, localView));
    localView.setEnabled(bool);
    this.hpg = ((MMSwitchBtn)findViewById(2131826520));
    this.hpg.setEnabled(bool);
    this.hpg.setCheck(c.yM("jsapi_draw_canvas"));
    this.hpg.setSwitchListener(new PerformancePanel.4(this));
    this.hph = ((MMSwitchBtn)findViewById(2131826521));
    this.hph.setEnabled(bool);
    this.hph.setCheck(c.yM("widget_launch"));
    this.hph.setSwitchListener(new PerformancePanel.5(this));
    this.hpi = ((MMSwitchBtn)findViewById(2131826522));
    this.hpi.setEnabled(bool);
    this.hpi.setCheck(com.tencent.mm.plugin.appbrand.collector.f.ayu());
    this.hpi.setSwitchListener(new PerformancePanel.6(this));
    AppMethodBeat.o(11186);
  }

  static class d
    implements a<IPCBoolean, IPCVoid>
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.wxawidget.console.PerformancePanel
 * JD-Core Version:    0.6.2
 */