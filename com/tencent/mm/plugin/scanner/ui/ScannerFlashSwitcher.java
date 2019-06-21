package com.tencent.mm.plugin.scanner.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.ui.v;

public class ScannerFlashSwitcher extends LinearLayout
{
  ImageView qgm;
  TextView qgn;
  boolean qgo;

  public ScannerFlashSwitcher(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(81322);
    this.qgo = false;
    init();
    AppMethodBeat.o(81322);
  }

  public ScannerFlashSwitcher(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    AppMethodBeat.i(81323);
    this.qgo = false;
    init();
    AppMethodBeat.o(81323);
  }

  private void init()
  {
    AppMethodBeat.i(81324);
    v.hu(getContext()).inflate(2130970553, this, true);
    this.qgm = ((ImageView)findViewById(2131827227));
    this.qgn = ((TextView)findViewById(2131827228));
    this.qgo = true;
    AppMethodBeat.o(81324);
  }

  public final void chJ()
  {
    AppMethodBeat.i(81326);
    ab.i("MicroMsg.ScannerFlashSwitcher", "closeFlashStatus");
    this.qgm.setImageResource(2131231885);
    AppMethodBeat.o(81326);
  }

  public final void hide()
  {
    AppMethodBeat.i(81325);
    ab.i("MicroMsg.ScannerFlashSwitcher", "hide");
    setEnabled(false);
    this.qgm.animate().alpha(0.0F).setDuration(500L);
    this.qgn.animate().alpha(0.0F).setDuration(500L).setListener(new AnimatorListenerAdapter()
    {
      public final void onAnimationEnd(Animator paramAnonymousAnimator)
      {
        AppMethodBeat.i(81321);
        ScannerFlashSwitcher.this.setVisibility(8);
        AppMethodBeat.o(81321);
      }
    });
    AppMethodBeat.o(81325);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.ScannerFlashSwitcher
 * JD-Core Version:    0.6.2
 */