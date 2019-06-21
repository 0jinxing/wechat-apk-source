package com.tencent.mm.plugin.cdndownloader.e;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.HashSet;

public final class a<E> extends HashSet<E>
{
  private b ktx;

  public a(b paramb)
  {
    this.ktx = paramb;
  }

  private void beY()
  {
    try
    {
      AppMethodBeat.i(932);
      this.ktx.beX();
      AppMethodBeat.o(932);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void beZ()
  {
    try
    {
      AppMethodBeat.i(933);
      this.ktx.remove();
      AppMethodBeat.o(933);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  private void bfa()
  {
    try
    {
      AppMethodBeat.i(934);
      this.ktx.clear();
      AppMethodBeat.o(934);
      return;
    }
    finally
    {
      localObject = finally;
      throw localObject;
    }
  }

  public final boolean add(E paramE)
  {
    try
    {
      AppMethodBeat.i(935);
      boolean bool = super.add(paramE);
      beY();
      AppMethodBeat.o(935);
      return bool;
    }
    finally
    {
      paramE = finally;
    }
    throw paramE;
  }

  public final void clear()
  {
    AppMethodBeat.i(936);
    super.clear();
    bfa();
    AppMethodBeat.o(936);
  }

  public final boolean remove(Object paramObject)
  {
    try
    {
      AppMethodBeat.i(937);
      boolean bool = super.remove(paramObject);
      beZ();
      AppMethodBeat.o(937);
      return bool;
    }
    finally
    {
      paramObject = finally;
    }
    throw paramObject;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.cdndownloader.e.a
 * JD-Core Version:    0.6.2
 */