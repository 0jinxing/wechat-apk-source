package com.tencent.mm.ui.widget.a;

import android.support.v7.widget.RecyclerView.a;
import android.widget.AdapterView.OnItemClickListener;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ui.base.l;

public final class d$b extends RecyclerView.a<d.b.a>
{
  AdapterView.OnItemClickListener amz;

  public d$b(d paramd)
  {
  }

  public final int getItemCount()
  {
    AppMethodBeat.i(112653);
    int i;
    if (d.y(this.zQE))
    {
      i = d.b(this.zQE).size() + d.d(this.zQE).size() + 1;
      AppMethodBeat.o(112653);
    }
    while (true)
    {
      return i;
      i = d.b(this.zQE).size() + d.d(this.zQE).size();
      AppMethodBeat.o(112653);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ui.widget.a.d.b
 * JD-Core Version:    0.6.2
 */