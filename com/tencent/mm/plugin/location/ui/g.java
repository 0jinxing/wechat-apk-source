package com.tencent.mm.plugin.location.ui;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.k.d;

public final class g extends FrameLayout
{
  private Context mContext;
  public boolean nLR;
  private ImageView nMi;
  public d nMj;

  public g(Context paramContext, d paramd)
  {
    super(paramContext);
    AppMethodBeat.i(113471);
    this.nLR = false;
    this.nMj = paramd;
    this.mContext = paramContext;
    this.nMi = ((ImageView)View.inflate(this.mContext, 2130970369, this).findViewById(2131826561));
    AppMethodBeat.o(113471);
  }

  public final void remove()
  {
    AppMethodBeat.i(113472);
    if (this.nLR)
      this.nMj.removeView(this);
    this.nLR = false;
    AppMethodBeat.o(113472);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.location.ui.g
 * JD-Core Version:    0.6.2
 */