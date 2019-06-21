package com.tencent.mm.plugin.appbrand.widget.recyclerview;

import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.b;
import android.support.v7.widget.RecyclerView.c;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.List;

final class a$1 extends RecyclerView.c
{
  a$1(a parama)
  {
  }

  public final void av(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(77457);
    if (a.a(this.joE).isEmpty());
    for (int i = 0; ; i = 1)
    {
      this.joE.ar(i + paramInt1, paramInt2);
      AppMethodBeat.o(77457);
      return;
    }
  }

  public final void aw(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(77459);
    if (a.a(this.joE).isEmpty());
    for (int i = 0; ; i = 1)
    {
      this.joE.at(i + paramInt1, paramInt2);
      AppMethodBeat.o(77459);
      return;
    }
  }

  public final void ax(int paramInt1, int paramInt2)
  {
    AppMethodBeat.i(77460);
    if (a.a(this.joE).isEmpty());
    for (int i = 0; ; i = 1)
    {
      this.joE.au(i + paramInt1, paramInt2);
      AppMethodBeat.o(77460);
      return;
    }
  }

  public final void ay(int paramInt1, int paramInt2)
  {
    int i = 0;
    AppMethodBeat.i(77461);
    a locala = this.joE;
    int j;
    if (a.a(locala).isEmpty())
    {
      j = 0;
      if (!a.a(this.joE).isEmpty())
        break label68;
    }
    while (true)
    {
      locala.as(j + paramInt1, i + paramInt2);
      AppMethodBeat.o(77461);
      return;
      j = 1;
      break;
      label68: i = 1;
    }
  }

  public final void d(int paramInt1, int paramInt2, Object paramObject)
  {
    AppMethodBeat.i(77458);
    if (a.a(this.joE).isEmpty());
    for (int i = 0; ; i = 1)
    {
      this.joE.c(i + paramInt1, paramInt2, paramObject);
      AppMethodBeat.o(77458);
      return;
    }
  }

  public final void onChanged()
  {
    AppMethodBeat.i(77456);
    this.joE.aop.notifyChanged();
    AppMethodBeat.o(77456);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.appbrand.widget.recyclerview.a.1
 * JD-Core Version:    0.6.2
 */