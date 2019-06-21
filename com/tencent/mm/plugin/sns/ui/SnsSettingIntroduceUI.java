package com.tencent.mm.plugin.sns.ui;

import android.annotation.TargetApi;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.report.service.h;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.q;

public class SnsSettingIntroduceUI extends MMActivity
{
  private Button rwH;
  private Button rwI;
  private Intent rwJ;

  public final int getLayoutId()
  {
    return 2130970796;
  }

  @TargetApi(17)
  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(39245);
    super.onCreate(paramBundle);
    getWindow().setFlags(1024, 1024);
    this.mController.hideTitleView();
    this.rwJ = getIntent();
    this.rwH = ((Button)findViewById(2131826267));
    this.rwH.setOnClickListener(new SnsSettingIntroduceUI.1(this));
    h.pYm.e(14090, new Object[] { Integer.valueOf(1) });
    this.rwI = ((Button)findViewById(2131825914));
    this.rwI.setOnClickListener(new SnsSettingIntroduceUI.2(this));
    AppMethodBeat.o(39245);
  }

  public void onDestroy()
  {
    AppMethodBeat.i(39244);
    super.onDestroy();
    AppMethodBeat.o(39244);
  }

  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    boolean bool = true;
    AppMethodBeat.i(39246);
    if ((paramInt == 4) && (paramKeyEvent.getAction() == 0))
    {
      finish();
      h.pYm.e(14090, new Object[] { Integer.valueOf(3) });
      AppMethodBeat.o(39246);
    }
    while (true)
    {
      return bool;
      bool = super.onKeyDown(paramInt, paramKeyEvent);
      AppMethodBeat.o(39246);
    }
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsSettingIntroduceUI
 * JD-Core Version:    0.6.2
 */