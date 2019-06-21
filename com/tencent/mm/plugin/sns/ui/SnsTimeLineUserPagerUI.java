package com.tencent.mm.plugin.sns.ui;

import android.app.Activity;
import com.tencent.matrix.trace.core.AppMethodBeat;

public class SnsTimeLineUserPagerUI extends SnsTimeLineUI
{
  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.SnsTimeLineUserPagerUI
 * JD-Core Version:    0.6.2
 */