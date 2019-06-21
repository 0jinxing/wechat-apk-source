package com.tencent.mm.plugin.walletlock.gesture.ui;

import android.app.Activity;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.walletlock.gesture.ui.widget.PatternLockView;

final class a
{
  View mView;
  TextView tWc;
  FrameLayout tWd;
  PatternLockView tWe;
  TextView tWf;

  public a(Activity paramActivity)
  {
    AppMethodBeat.i(51648);
    this.mView = null;
    this.tWc = null;
    this.tWd = null;
    this.tWe = null;
    this.tWf = null;
    this.mView = View.inflate(paramActivity, 2130969864, null);
    this.tWc = ((TextView)this.mView.findViewById(2131825011));
    this.tWd = ((FrameLayout)this.mView.findViewById(2131825013));
    this.tWe = ((PatternLockView)this.mView.findViewById(2131825014));
    this.tWf = ((TextView)this.mView.findViewById(2131825012));
    AppMethodBeat.o(51648);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.walletlock.gesture.ui.a
 * JD-Core Version:    0.6.2
 */