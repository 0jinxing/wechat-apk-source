package com.tencent.d.d.a;

import android.text.TextUtils;
import com.tencent.d.d.b.d.a;
import com.tencent.d.f.h;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

public final class c
  implements b
{
  private final List<d.a> Atc;

  public c()
  {
    AppMethodBeat.i(114503);
    this.Atc = new ArrayList();
    AppMethodBeat.o(114503);
  }

  public final void a(d.a parama)
  {
    AppMethodBeat.i(114504);
    if (parama.uid != 0)
      AppMethodBeat.o(114504);
    while (true)
    {
      return;
      if ((TextUtils.isEmpty(parama.Atk)) || (!"u:r:zygote:s0".equals(parama.Atk)))
      {
        AppMethodBeat.o(114504);
      }
      else if ((TextUtils.isEmpty(parama.name)) || ("zygote".equals(parama.name)) || ("zygote64".equals(parama.name)))
      {
        AppMethodBeat.o(114504);
      }
      else
      {
        new StringBuilder("JavaProcessAnalyzer match : ").append(parama.toString());
        h.dQG();
        this.Atc.add(parama);
        AppMethodBeat.o(114504);
      }
    }
  }

  public final boolean dQl()
  {
    AppMethodBeat.i(114505);
    boolean bool;
    if (this.Atc.size() > 0)
    {
      bool = true;
      AppMethodBeat.o(114505);
    }
    while (true)
    {
      return bool;
      bool = false;
      AppMethodBeat.o(114505);
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.d.d.a.c
 * JD-Core Version:    0.6.2
 */