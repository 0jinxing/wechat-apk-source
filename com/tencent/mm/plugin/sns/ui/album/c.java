package com.tencent.mm.plugin.sns.ui.album;

import android.support.v7.widget.RecyclerView.a;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

public final class c extends RecyclerView.a<c.b>
{
  List<a.d> rFD;
  c.a rFE;

  public c()
  {
    AppMethodBeat.i(39982);
    this.rFD = new ArrayList();
    this.rFE = null;
    AppMethodBeat.o(39982);
  }

  public final int getItemCount()
  {
    AppMethodBeat.i(39983);
    int i = this.rFD.size();
    AppMethodBeat.o(39983);
    return i;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sns.ui.album.c
 * JD-Core Version:    0.6.2
 */