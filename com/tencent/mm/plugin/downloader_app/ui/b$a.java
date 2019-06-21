package com.tencent.mm.plugin.downloader_app.ui;

import android.support.v7.widget.RecyclerView.v;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b$a extends RecyclerView.v
{
  public View contentView;

  public b$a(View paramView)
  {
    super(paramView);
    AppMethodBeat.i(136284);
    this.contentView = ((ViewGroup)paramView).getChildAt(0);
    AppMethodBeat.o(136284);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader_app.ui.b.a
 * JD-Core Version:    0.6.2
 */