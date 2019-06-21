package com.tencent.mm.plugin.appbrand.wxawidget.console;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.aa.h;
import com.tencent.mm.ipcinvoker.f;
import com.tencent.mm.ipcinvoker.type.IPCInteger;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelappbrand.e;
import com.tencent.mm.modelappbrand.l;
import com.tencent.mm.plugin.appbrand.dynamic.widget.b;
import com.tencent.mm.ui.widget.MMSwitchBtn;

public class SettingsPanel extends FrameLayout
{
  private Button jqg;
  private Button jqh;
  private View.OnClickListener jqi;
  private Runnable jqj;

  public SettingsPanel(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(11196);
    init();
    AppMethodBeat.o(11196);
  }

  public SettingsPanel(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(11197);
    init();
    AppMethodBeat.o(11197);
  }

  private void init()
  {
    AppMethodBeat.i(11198);
    LayoutInflater.from(getContext()).inflate(2130970639, this, true);
    findViewById(2131827404).setOnClickListener(new SettingsPanel.1(this));
    MMSwitchBtn localMMSwitchBtn = (MMSwitchBtn)findViewById(2131827407);
    localMMSwitchBtn.setCheck(((e)g.K(e.class)).abz().abE());
    localMMSwitchBtn.setSwitchListener(new SettingsPanel.2(this));
    this.jqg = ((Button)findViewById(2131827411));
    rf(b.aAl());
    this.jqg.setOnClickListener(new SettingsPanel.3(this));
    this.jqh = ((Button)findViewById(2131827409));
    rg(h.QE());
    this.jqh.setOnClickListener(new SettingsPanel.4(this));
    findViewById(2131827412).setOnClickListener(new SettingsPanel.5(this));
    if (((e)g.K(e.class)).abz().abF())
    {
      findViewById(2131827406).setVisibility(0);
      findViewById(2131827410).setVisibility(0);
      findViewById(2131827408).setVisibility(0);
    }
    AppMethodBeat.o(11198);
  }

  private void rf(int paramInt)
  {
    AppMethodBeat.i(11199);
    this.jqg.setTag(Integer.valueOf(paramInt));
    switch (paramInt)
    {
    default:
      this.jqg.setText("MHADrawableView");
      b.nR(0);
      AppMethodBeat.o(11199);
    case 1:
    case 2:
    case 3:
    case 4:
    }
    while (true)
    {
      return;
      this.jqg.setText("MTextureView");
      b.nR(1);
      AppMethodBeat.o(11199);
      continue;
      this.jqg.setText("MSurfaceView");
      b.nR(2);
      AppMethodBeat.o(11199);
      continue;
      this.jqg.setText("MCanvasView");
      b.nR(3);
      AppMethodBeat.o(11199);
      continue;
      this.jqg.setText("MDrawableView");
      b.nR(4);
      AppMethodBeat.o(11199);
    }
  }

  private void rg(int paramInt)
  {
    AppMethodBeat.i(11200);
    this.jqh.setTag(Integer.valueOf(paramInt));
    String str;
    switch (paramInt)
    {
    default:
      str = "Normal";
    case 1:
    }
    for (paramInt = 0; ; paramInt = 1)
    {
      this.jqh.setText(str);
      h.jM(paramInt);
      f.a("com.tencent.mm:support", new IPCInteger(paramInt), SettingsPanel.a.class, null);
      AppMethodBeat.o(11200);
      return;
      str = "Minimal-json";
    }
  }

  public void setOnCloseDebuggerClickListener(View.OnClickListener paramOnClickListener)
  {
    this.jqi = paramOnClickListener;
  }

  public void setOnResetDebuggerRunnable(Runnable paramRunnable)
  {
    this.jqj = paramRunnable;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.wxawidget.console.SettingsPanel
 * JD-Core Version:    0.6.2
 */