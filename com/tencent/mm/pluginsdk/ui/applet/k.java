package com.tencent.mm.pluginsdk.ui.applet;

import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class k
{
  private int background;
  boolean eic;
  int index;
  View.OnClickListener pLd;
  int row;
  j vkt;
  a vkz;
  private final View.OnTouchListener vla;
  int vlf;
  k.b vlg;

  public k()
  {
    AppMethodBeat.i(79784);
    this.background = -1;
    this.vla = new k.1(this);
    this.pLd = new k.2(this);
    AppMethodBeat.o(79784);
  }

  public static abstract interface a
  {
    public abstract void KT(int paramInt);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.pluginsdk.ui.applet.k
 * JD-Core Version:    0.6.2
 */