package com.tencent.mm.ui.widget.textview;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a$a
{
  View.OnClickListener lDG;
  com.tencent.mm.ui.widget.b.a zWM;
  public int zWN = 0;
  View zWm;
  a.f zWn;
  View.OnTouchListener zWo;
  public int zWt = 2131690424;
  public int zWu = 2131689912;

  public a$a(View paramView, com.tencent.mm.ui.widget.b.a parama)
  {
    this.zWm = paramView;
    this.zWM = parama;
  }

  public a$a(View paramView, com.tencent.mm.ui.widget.b.a parama, a.f paramf, View.OnClickListener paramOnClickListener, View.OnTouchListener paramOnTouchListener)
  {
    this(paramView, parama);
    this.zWn = paramf;
    this.lDG = paramOnClickListener;
    this.zWo = paramOnTouchListener;
  }

  public final a dLT()
  {
    AppMethodBeat.i(113130);
    a locala = new a(this);
    AppMethodBeat.o(113130);
    return locala;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.textview.a.a
 * JD-Core Version:    0.6.2
 */