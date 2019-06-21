package com.tencent.mm.plugin.topstory.ui.debug;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.websearch.api.aa;
import com.tencent.mm.plugin.websearch.api.ao;
import com.tencent.mm.ui.MMActivity;

public class TopStoryDebugUI extends MMActivity
{
  private TextView sBC;

  public final int getLayoutId()
  {
    return 2130970936;
  }

  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(1552);
    super.onCreate(paramBundle);
    setMMTitle(2131304092);
    setBackBtn(new TopStoryDebugUI.1(this));
    paramBundle = aa.HQ(1);
    this.sBC = ((TextView)findViewById(2131828248));
    this.sBC.setText(getString(2131304090, new Object[] { String.valueOf(paramBundle.afW()) }));
    findViewById(2131828249).setOnClickListener(new TopStoryDebugUI.2(this, paramBundle));
    findViewById(2131828250).setOnClickListener(new TopStoryDebugUI.3(this, paramBundle));
    findViewById(2131828251).setOnClickListener(new TopStoryDebugUI.4(this));
    AppMethodBeat.o(1552);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.debug.TopStoryDebugUI
 * JD-Core Version:    0.6.2
 */