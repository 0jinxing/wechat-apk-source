package com.tencent.mm.plugin.scanner.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;

final class ScannerFlashSwitcher$2 extends AnimatorListenerAdapter
{
  ScannerFlashSwitcher$2(ScannerFlashSwitcher paramScannerFlashSwitcher)
  {
  }

  public final void onAnimationEnd(Animator paramAnimator)
  {
    AppMethodBeat.i(81320);
    ScannerFlashSwitcher.a(this.qgp).setAlpha(1.0F);
    AppMethodBeat.o(81320);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.ScannerFlashSwitcher.2
 * JD-Core Version:    0.6.2
 */