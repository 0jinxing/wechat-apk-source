package com.tencent.mm.plugin.appbrand.ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.View;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.appbrand.i;
import com.tencent.mm.sdk.platformtools.ah;

@SuppressLint({"ViewConstructor"})
final class f extends com.tencent.mm.ui.statusbar.b
  implements q
{
  private i gPI;
  private Runnable iHa;
  private com.tencent.mm.plugin.appbrand.widget.actionbar.b isG;

  public f(Context paramContext, i parami)
  {
    super(paramContext);
    AppMethodBeat.i(102314);
    this.gPI = parami;
    this.isG = new com.tencent.mm.plugin.appbrand.widget.actionbar.b(paramContext);
    this.isG.setFullscreenMode(false);
    addView(this.isG.getActionView());
    this.isG.eP(false);
    paramContext = new f.1(this);
    this.isG.setCloseButtonClickListener(paramContext);
    this.isG.setBackButtonClickListener(paramContext);
    paramContext = ah.getContext().getString(2131296542);
    this.isG.setMainTitle(paramContext);
    this.isG.setBackgroundColor(-1);
    this.isG.setForegroundStyle("black");
    this.isG.setNavBackOrClose(true);
    this.isG.setLoadingIconVisibility(true);
    K(-1, "black".equals("black"));
    setBackgroundColor(-1);
    AppMethodBeat.o(102314);
  }

  public final void aHS()
  {
    AppMethodBeat.i(102318);
    removeCallbacks(this.iHa);
    post(new f.3(this));
    AppMethodBeat.o(102318);
  }

  public final void aHT()
  {
    AppMethodBeat.i(102319);
    this.isG.setNavHidden(true);
    AppMethodBeat.o(102319);
  }

  public final void cz(String paramString1, String paramString2)
  {
    AppMethodBeat.i(102315);
    this.isG.setMainTitle(ah.getContext().getString(2131296542));
    AppMethodBeat.o(102315);
  }

  public final View getView()
  {
    return this;
  }

  protected final void onAttachedToWindow()
  {
    AppMethodBeat.i(102316);
    super.onAttachedToWindow();
    if (this.iHa == null)
    {
      this.iHa = new Runnable()
      {
        public final void run()
        {
          AppMethodBeat.i(102312);
          if (f.b(f.this) != null)
            f.b(f.this).setLoadingIconVisibility(true);
          AppMethodBeat.o(102312);
        }
      };
      postDelayed(this.iHa, 1500L);
    }
    AppMethodBeat.o(102316);
  }

  protected final void onDetachedFromWindow()
  {
    AppMethodBeat.i(102317);
    super.onDetachedFromWindow();
    removeCallbacks(this.iHa);
    AppMethodBeat.o(102317);
  }

  public final void setProgress(int paramInt)
  {
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.ui.f
 * JD-Core Version:    0.6.2
 */