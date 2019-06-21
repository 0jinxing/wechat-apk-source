package com.tencent.mm.plugin.fav.ui.widget;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.fav.a.b;
import com.tencent.mm.sdk.platformtools.aa;

public final class a
{
  public Button gzI;
  public TextView kxJ;
  public View mpA;
  public a.a mpB;
  public long mpx;
  public boolean mpz;

  public a()
  {
    AppMethodBeat.i(74666);
    this.mpz = false;
    this.mpx = b.buh();
    AppMethodBeat.o(74666);
  }

  public final void bwz()
  {
    AppMethodBeat.i(74669);
    this.kxJ.setText(this.kxJ.getContext().getString(2131299571, new Object[] { b.iv(this.mpx) }));
    this.gzI.setEnabled(false);
    AppMethodBeat.o(74669);
  }

  public final void hide()
  {
    AppMethodBeat.i(74668);
    if (!this.mpz)
      AppMethodBeat.o(74668);
    while (true)
    {
      return;
      if (this.mpA.getVisibility() != 8)
      {
        this.mpA.setVisibility(8);
        this.mpA.startAnimation(AnimationUtils.loadAnimation(this.mpA.getContext(), 2131034181));
      }
      AppMethodBeat.o(74668);
    }
  }

  public final void show()
  {
    AppMethodBeat.i(74667);
    if (!this.mpz)
      if (this.mpA == null)
        AppMethodBeat.o(74667);
    while (true)
    {
      return;
      if ((this.mpA instanceof ViewStub))
        this.mpA = ((ViewStub)this.mpA).inflate();
      this.kxJ = ((TextView)this.mpA.findViewById(2131823880));
      if (!aa.don())
        this.kxJ.setTextSize(1, 14.0F);
      this.gzI = ((Button)this.mpA.findViewById(2131823881));
      bwz();
      this.gzI.setOnClickListener(new a.1(this));
      this.mpz = true;
      if (this.mpA.getVisibility() != 0)
      {
        this.mpA.setVisibility(0);
        this.mpA.startAnimation(AnimationUtils.loadAnimation(this.mpA.getContext(), 2131034180));
      }
      AppMethodBeat.o(74667);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.widget.a
 * JD-Core Version:    0.6.2
 */