package com.tencent.mm.plugin.appbrand.wxawidget.console;

import android.content.Context;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnKeyListener;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.kernel.g;
import com.tencent.mm.modelappbrand.e;
import com.tencent.mm.modelappbrand.l;
import com.tencent.mm.sdk.platformtools.ab;

public class ControlBoardPanel extends FrameLayout
{
  ConsolePanel hoZ;
  ControlBoardPanel.a jpU;
  View jpV;
  SettingsPanel jpW;
  View jpX;
  View jpY;
  View jpZ;
  View jqa;
  WindowManager jqb;
  WindowManager.LayoutParams jqc;
  boolean jqd;

  public ControlBoardPanel(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(11164);
    init();
    AppMethodBeat.o(11164);
  }

  public ControlBoardPanel(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(11165);
    init();
    AppMethodBeat.o(11165);
  }

  public ControlBoardPanel(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(11166);
    init();
    AppMethodBeat.o(11166);
  }

  private void init()
  {
    AppMethodBeat.i(11167);
    Context localContext = getContext();
    this.jqb = ((WindowManager)localContext.getSystemService("window"));
    LayoutInflater.from(localContext).inflate(2130969240, this, true);
    this.jpV = findViewById(2131823143);
    this.hoZ = ((ConsolePanel)findViewById(2131823144));
    this.jpW = ((SettingsPanel)findViewById(2131823145));
    this.jpX = findViewById(2131823146);
    this.jpY = findViewById(2131823140);
    this.jpZ = findViewById(2131823141);
    this.jqa = findViewById(2131823142);
    if (!((e)g.K(e.class)).abz().abF())
      this.jqa.setVisibility(8);
    this.jpY.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        AppMethodBeat.i(11158);
        if (ControlBoardPanel.this.hoZ.getVisibility() == 0)
        {
          ControlBoardPanel.this.jpV.setVisibility(8);
          ControlBoardPanel.this.hoZ.setVisibility(8);
          ControlBoardPanel.this.jpY.setSelected(false);
          ControlBoardPanel.a(ControlBoardPanel.this);
          AppMethodBeat.o(11158);
        }
        while (true)
        {
          return;
          ControlBoardPanel.this.jpV.setVisibility(0);
          ControlBoardPanel.this.hoZ.setVisibility(0);
          ControlBoardPanel.this.jpW.setVisibility(8);
          ControlBoardPanel.this.jpX.setVisibility(8);
          ControlBoardPanel.this.jpY.setSelected(true);
          ControlBoardPanel.this.jpZ.setSelected(false);
          ControlBoardPanel.this.jqa.setSelected(false);
          ControlBoardPanel.b(ControlBoardPanel.this);
          AppMethodBeat.o(11158);
        }
      }
    });
    this.jpZ.setOnClickListener(new ControlBoardPanel.2(this));
    this.jqa.setOnClickListener(new ControlBoardPanel.3(this));
    setOnKeyListener(new View.OnKeyListener()
    {
      public final boolean onKey(View paramAnonymousView, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
      {
        AppMethodBeat.i(11161);
        ab.i("MicroMsg.ControlBoardPanel", "onKey(%s, %s)", new Object[] { Integer.valueOf(paramAnonymousInt), paramAnonymousKeyEvent });
        if (paramAnonymousInt == 4)
        {
          ControlBoardPanel.this.jpV.setVisibility(8);
          ControlBoardPanel.this.jpX.setVisibility(8);
          ControlBoardPanel.this.jpX.setVisibility(8);
          ControlBoardPanel.this.jqa.setSelected(false);
          ControlBoardPanel.this.jpY.setSelected(false);
          ControlBoardPanel.this.jpZ.setSelected(false);
          ControlBoardPanel.a(ControlBoardPanel.this);
        }
        AppMethodBeat.o(11161);
        return false;
      }
    });
    this.jpW.setOnCloseDebuggerClickListener(new ControlBoardPanel.5(this));
    this.jpW.setOnResetDebuggerRunnable(new ControlBoardPanel.6(this));
    AppMethodBeat.o(11167);
  }

  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(11168);
    ab.i("MicroMsg.ControlBoardPanel", "onKeyUp(%s, %s)", new Object[] { Integer.valueOf(paramInt), paramKeyEvent });
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    AppMethodBeat.o(11168);
    return bool;
  }

  public final void reset()
  {
    AppMethodBeat.i(11169);
    d.b(this.hoZ);
    d.a(this.hoZ);
    AppMethodBeat.o(11169);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.wxawidget.console.ControlBoardPanel
 * JD-Core Version:    0.6.2
 */