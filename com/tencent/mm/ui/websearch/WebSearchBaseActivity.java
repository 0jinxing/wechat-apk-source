package com.tencent.mm.ui.websearch;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;

public abstract class WebSearchBaseActivity extends CustomStatusBarMMActivity
{
  protected final int getStatusBarColor()
  {
    return getResources().getColor(2131690672);
  }

  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    dxZ();
    ta(-16777216);
    if (getSupportActionBar() != null)
    {
      getSupportActionBar().getCustomView().setBackgroundColor(getResources().getColor(2131690672));
      getSupportActionBar().setBackgroundDrawable(new ColorDrawable(getResources().getColor(2131690672)));
    }
    setBackBtn(new WebSearchBaseActivity.1(this));
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.websearch.WebSearchBaseActivity
 * JD-Core Version:    0.6.2
 */