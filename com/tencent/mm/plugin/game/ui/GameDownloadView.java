package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.FrameLayout;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.game.f.c;
import com.tencent.mm.plugin.game.model.j;
import com.tencent.mm.plugin.game.model.j.a;
import com.tencent.mm.plugin.game.model.k;
import com.tencent.mm.plugin.game.widget.TextProgressBar;
import com.tencent.mm.sdk.platformtools.ah;
import com.tencent.mm.sdk.platformtools.al;

public class GameDownloadView extends FrameLayout
  implements View.OnClickListener
{
  private j.a ngQ;
  private k ngS;
  private Button nhX;
  private TextProgressBar nhY;
  private d nhZ;

  public GameDownloadView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    AppMethodBeat.i(111896);
    this.ngQ = new GameDownloadView.4(this);
    AppMethodBeat.o(111896);
  }

  private void bFm()
  {
    AppMethodBeat.i(111902);
    al.d(new GameDownloadView.3(this));
    AppMethodBeat.o(111902);
  }

  public void onAttachedToWindow()
  {
    AppMethodBeat.i(111899);
    super.onAttachedToWindow();
    j.a(this.ngQ);
    AppMethodBeat.o(111899);
  }

  public void onClick(View paramView)
  {
    AppMethodBeat.i(111903);
    this.ngS.ei(ah.getContext());
    this.nhZ.a(this.ngS.mVZ, this.ngS);
    AppMethodBeat.o(111903);
  }

  public void onDetachedFromWindow()
  {
    AppMethodBeat.i(111898);
    super.onDetachedFromWindow();
    j.b(this.ngQ);
    AppMethodBeat.o(111898);
  }

  public void onFinishInflate()
  {
    AppMethodBeat.i(111897);
    super.onFinishInflate();
    View localView = LayoutInflater.from(getContext()).inflate(2130969704, this, true);
    this.nhX = ((Button)localView.findViewById(2131824401));
    this.nhY = ((TextProgressBar)localView.findViewById(2131824402));
    this.nhY.setTextSize(14);
    this.nhX.setOnClickListener(this);
    this.nhY.setOnClickListener(this);
    this.nhZ = new d(getContext());
    this.nhZ.neA = new GameDownloadView.1(this);
    AppMethodBeat.o(111897);
  }

  public final void refresh()
  {
    AppMethodBeat.i(111900);
    if (this.ngS != null)
    {
      this.ngS.ei(ah.getContext());
      this.ngS.biT();
      bFm();
    }
    AppMethodBeat.o(111900);
  }

  public void setDownloadInfo(k paramk)
  {
    AppMethodBeat.i(111901);
    this.ngS = paramk;
    c.aNS().aa(new GameDownloadView.2(this));
    bFm();
    AppMethodBeat.o(111901);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.ui.GameDownloadView
 * JD-Core Version:    0.6.2
 */