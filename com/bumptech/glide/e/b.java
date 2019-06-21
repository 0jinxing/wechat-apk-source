package com.bumptech.glide.e;

import com.bumptech.glide.c.f;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;
import java.util.List;

public final class b
{
  private final List<f> azH;

  public b()
  {
    AppMethodBeat.i(92432);
    this.azH = new ArrayList();
    AppMethodBeat.o(92432);
  }

  public final void a(f paramf)
  {
    try
    {
      AppMethodBeat.i(92433);
      this.azH.add(paramf);
      AppMethodBeat.o(92433);
      return;
    }
    finally
    {
      paramf = finally;
    }
    throw paramf;
  }

  public final List<f> nK()
  {
    try
    {
      List localList = this.azH;
      return localList;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.bumptech.glide.e.b
 * JD-Core Version:    0.6.2
 */