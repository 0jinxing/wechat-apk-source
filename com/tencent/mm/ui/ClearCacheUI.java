package com.tencent.mm.ui;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.h;

public class ClearCacheUI extends MMBaseActivity
{
  public void onCreate(Bundle paramBundle)
  {
    AppMethodBeat.i(29169);
    super.onCreate(paramBundle);
    paramBundle = getIntent().getStringExtra("key_message");
    long l = getIntent().getLongExtra("key_mask", 0L);
    h.a(this, paramBundle, getString(2131298333), getString(2131298332), getString(2131298330), false, new ClearCacheUI.1(this, l), new ClearCacheUI.2(this));
    AppMethodBeat.o(29169);
  }

  public void onWindowFocusChanged(boolean paramBoolean)
  {
    super.onWindowFocusChanged(paramBoolean);
    AppMethodBeat.at(this, paramBoolean);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.ClearCacheUI
 * JD-Core Version:    0.6.2
 */