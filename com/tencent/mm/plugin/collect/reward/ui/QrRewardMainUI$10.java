package com.tencent.mm.plugin.collect.reward.ui;

import android.view.KeyEvent;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;

final class QrRewardMainUI$10
  implements TextView.OnEditorActionListener
{
  QrRewardMainUI$10(QrRewardMainUI paramQrRewardMainUI)
  {
  }

  public final boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    AppMethodBeat.i(41093);
    ab.i("MicroMsg.QrRewardMainUI", "action: %s", new Object[] { Integer.valueOf(paramInt) });
    this.kEC.aqX();
    AppMethodBeat.o(41093);
    return false;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.collect.reward.ui.QrRewardMainUI.10
 * JD-Core Version:    0.6.2
 */