package com.tencent.mm.plugin.webview.ui.tools;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.webview.ui.tools.game.GameWebViewUI;
import com.tencent.mm.plugin.webview.ui.tools.widget.MovingImageButton;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;
import com.tencent.mm.ui.widget.MMWebView;

@com.tencent.mm.ui.base.a(3)
public class TransparentWebViewUI extends GameWebViewUI
{
  public final boolean aYc()
  {
    return false;
  }

  protected final void cZH()
  {
    AppMethodBeat.i(7587);
    setBackGroundColorResource(0);
    this.mController.contentView.setBackgroundResource(0);
    this.pzf.setBackgroundResource(17170445);
    this.pzf.setBackgroundColor(0);
    findViewById(2131823600).setBackgroundResource(17170445);
    findViewById(2131823601).setBackgroundResource(17170445);
    AppMethodBeat.o(7587);
  }

  public final void initView()
  {
    int i = 1;
    AppMethodBeat.i(7586);
    super.initView();
    dao().uuh = true;
    dao().hfA = false;
    dao().nM(true);
    dao().Jp(0);
    if ((getIntent() != null) && (getIntent().hasExtra("show_full_screen")) && (getIntent().getBooleanExtra("show_full_screen", false)));
    while (true)
    {
      if ((i != 0) && (this.uve != null))
        this.uve.setCanMove(false);
      AppMethodBeat.o(7586);
      return;
      i = 0;
    }
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(7585);
    super.onCreate(paramBundle);
    if (this.screenOrientation == 1001)
    {
      this.screenOrientation = 0;
      if (this.uvh == null)
        break label76;
      this.uvh.enable();
      AppMethodBeat.o(7585);
    }
    while (true)
    {
      return;
      if (this.screenOrientation == 1002)
      {
        this.screenOrientation = 1;
        if (this.uvh != null)
          this.uvh.enable();
      }
      label76: AppMethodBeat.o(7585);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webview.ui.tools.TransparentWebViewUI
 * JD-Core Version:    0.6.2
 */