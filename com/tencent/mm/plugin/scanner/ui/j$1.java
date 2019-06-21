package com.tencent.mm.plugin.scanner.ui;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.widget.a.c;

final class j$1
  implements View.OnClickListener
{
  j$1(j paramj)
  {
  }

  public final void onClick(View paramView)
  {
    AppMethodBeat.i(81158);
    View localView = ((LayoutInflater)this.qeE.qet.getContext().getSystemService("layout_inflater")).inflate(2130970539, null);
    paramView = this.qeE.qet.getContext();
    h.a(paramView, paramView.getString(2131302724), paramView.getString(2131302723), localView, new j.1.1(this)).show();
    AppMethodBeat.o(81158);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.scanner.ui.j.1
 * JD-Core Version:    0.6.2
 */