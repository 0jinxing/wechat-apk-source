package com.tencent.mm.plugin.webwx.ui;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.MMActivity;

public class WebWeiXinIntroductionUI extends MMActivity
{
  private Button uLK;

  public final int getLayoutId()
  {
    return 2130971203;
  }

  public final void initView()
  {
    AppMethodBeat.i(26574);
    setMMTitle("");
    this.uLK = ((Button)findViewById(2131829159));
    this.uLK.setOnClickListener(new WebWeiXinIntroductionUI.1(this));
    setBackBtn(new WebWeiXinIntroductionUI.2(this));
    AppMethodBeat.o(26574);
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(26573);
    super.onCreate(paramBundle);
    initView();
    AppMethodBeat.o(26573);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.webwx.ui.WebWeiXinIntroductionUI
 * JD-Core Version:    0.6.2
 */