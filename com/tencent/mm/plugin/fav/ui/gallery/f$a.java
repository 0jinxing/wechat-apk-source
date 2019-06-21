package com.tencent.mm.plugin.fav.ui.gallery;

import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class f$a extends RecyclerView.v
{
  TextView gnf;
  ProgressBar progressBar;

  public f$a(f paramf, View paramView)
  {
    super(paramView);
    AppMethodBeat.i(74566);
    this.gnf = ((TextView)paramView.findViewById(2131823899));
    this.progressBar = ((ProgressBar)paramView.findViewById(2131823898));
    AppMethodBeat.o(74566);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.fav.ui.gallery.f.a
 * JD-Core Version:    0.6.2
 */