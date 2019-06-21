package com.tencent.mm.plugin.wenote.ui.nativenote.a;

import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView.o;
import android.support.v7.widget.RecyclerView.s;
import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.compatible.util.j;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.k;
import com.tencent.mm.sdk.platformtools.ah;

public final class a extends LinearLayoutManager
{
  private final int uUe;
  public int uUf;
  public boolean uUg;

  public a()
  {
    AppMethodBeat.i(27140);
    this.uUe = j.gq(ah.getContext());
    this.uUf = -1;
    this.uUg = false;
    AppMethodBeat.o(27140);
  }

  public final int b(int paramInt, RecyclerView.o paramo, RecyclerView.s params)
  {
    int i = 1;
    int j = 0;
    AppMethodBeat.i(27141);
    if (!this.uUg)
    {
      paramInt = super.b(paramInt, paramo, params);
      AppMethodBeat.o(27141);
      return paramInt;
    }
    int k;
    if (paramInt < 0)
      if (k.aU(49.0F) <= Math.abs(paramInt))
        k = 1;
    while (true)
    {
      label56: if (paramInt > 0)
        if (this.uUe + k.aU(49.0F) < paramInt)
          k = i;
      while (true)
      {
        while (true)
        {
          if ((k != 0) && (this.uUg))
          {
            AppMethodBeat.o(27141);
            paramInt = j;
            break;
            k = 0;
            break label56;
            k = 0;
            continue;
          }
          try
          {
            paramInt = super.b(paramInt, paramo, params);
            AppMethodBeat.o(27141);
          }
          catch (Exception paramo)
          {
            AppMethodBeat.o(27141);
            paramInt = j;
          }
        }
        break;
      }
      k = 0;
    }
  }

  public final int c(RecyclerView.s params)
  {
    if (this.uUf > 0);
    for (int i = this.uUf; ; i = 900)
      return i;
  }

  public final void c(RecyclerView.o paramo, RecyclerView.s params)
  {
    AppMethodBeat.i(27142);
    try
    {
      super.c(paramo, params);
      AppMethodBeat.o(27142);
      return;
    }
    catch (Exception paramo)
    {
      while (true)
        AppMethodBeat.o(27142);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wenote.ui.nativenote.a.a
 * JD-Core Version:    0.6.2
 */