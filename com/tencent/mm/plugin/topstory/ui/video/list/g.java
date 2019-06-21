package com.tencent.mm.plugin.topstory.ui.video.list;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ap;

public final class g extends com.tencent.mm.plugin.topstory.ui.video.g
{
  private View sFX;
  private g.a sGX;
  ap sGn;

  public g(Context paramContext)
  {
    super(paramContext);
    AppMethodBeat.i(2076);
    this.sFX = this.contentView.findViewById(2131828285);
    AppMethodBeat.o(2076);
  }

  public final void aFE()
  {
    AppMethodBeat.i(2081);
    if (this.sGn != null)
    {
      this.sGn.stopTimer();
      this.sGn.ae(2000L, 2000L);
    }
    AppMethodBeat.o(2081);
  }

  public final void aFQ()
  {
    AppMethodBeat.i(2086);
    super.aFQ();
    if (this.sGX != null)
      this.sGX.update(this.mPosition, getVideoTotalTime());
    AppMethodBeat.o(2086);
  }

  public final void cHd()
  {
    AppMethodBeat.i(2080);
    if (this.sGn != null)
      this.sGn.stopTimer();
    AppMethodBeat.o(2080);
  }

  public final void cHe()
  {
    AppMethodBeat.i(2083);
    this.qyo.setVisibility(8);
    AppMethodBeat.o(2083);
  }

  public final void cHf()
  {
    AppMethodBeat.i(2084);
    this.qyo.setVisibility(0);
    AppMethodBeat.o(2084);
  }

  public final int getBarPointWidth()
  {
    AppMethodBeat.i(2082);
    int i = this.qyn.getWidth();
    AppMethodBeat.o(2082);
    return i;
  }

  public final int getLayoutId()
  {
    return 2130970955;
  }

  public final void hide()
  {
    AppMethodBeat.i(138401);
    setVisibility(8);
    AppMethodBeat.o(138401);
  }

  public final void setFullScreenBtnClickListener(View.OnClickListener paramOnClickListener)
  {
    AppMethodBeat.i(2077);
    this.sFX.setOnClickListener(paramOnClickListener);
    AppMethodBeat.o(2077);
  }

  public final void setOnUpdateProgressLenListener(g.a parama)
  {
    this.sGX = parama;
  }

  public final void setVisibility(int paramInt)
  {
    AppMethodBeat.i(2085);
    super.setVisibility(paramInt);
    if ((paramInt == 8) || (paramInt == 4))
    {
      if (this.sGX == null)
        break label65;
      this.sGX.cHc();
      AppMethodBeat.o(2085);
    }
    while (true)
    {
      return;
      if ((paramInt == 0) && (this.sGX != null))
        this.sGX.cHb();
      label65: AppMethodBeat.o(2085);
    }
  }

  public final void show()
  {
    AppMethodBeat.i(2079);
    setVisibility(0);
    cHf();
    if (this.sGn == null)
      this.sGn = new ap(new g.1(this), false);
    this.sGn.stopTimer();
    this.sGn.ae(2000L, 2000L);
    AppMethodBeat.o(2079);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.topstory.ui.video.list.g
 * JD-Core Version:    0.6.2
 */