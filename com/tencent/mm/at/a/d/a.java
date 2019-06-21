package com.tencent.mm.at.a.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.a.f;
import com.tencent.mm.memory.a.c;
import java.util.Map;

public final class a<K, V>
{
  public f<K, V> eRT;

  public a(int paramInt)
  {
    AppMethodBeat.i(116095);
    this.eRT = new c(paramInt);
    AppMethodBeat.o(116095);
  }

  public final boolean aj(K paramK)
  {
    try
    {
      AppMethodBeat.i(116097);
      if (this.eRT == null)
      {
        paramK = new java/lang/NullPointerException;
        paramK.<init>("mData == null");
        AppMethodBeat.o(116097);
        throw paramK;
      }
    }
    finally
    {
    }
    boolean bool = this.eRT.aj(paramK);
    AppMethodBeat.o(116097);
    return bool;
  }

  public final V get(K paramK)
  {
    AppMethodBeat.i(116098);
    if (this.eRT == null)
    {
      paramK = new NullPointerException("mData == null");
      AppMethodBeat.o(116098);
      throw paramK;
    }
    paramK = this.eRT.get(paramK);
    AppMethodBeat.o(116098);
    return paramK;
  }

  public final V put(K paramK, V paramV)
  {
    AppMethodBeat.i(116099);
    if (this.eRT == null)
    {
      paramK = new NullPointerException("mData == null");
      AppMethodBeat.o(116099);
      throw paramK;
    }
    paramK = this.eRT.put(paramK, paramV);
    AppMethodBeat.o(116099);
    return paramK;
  }

  public final Map<K, V> snapshot()
  {
    try
    {
      AppMethodBeat.i(116100);
      if (this.eRT == null)
      {
        NullPointerException localNullPointerException = new java/lang/NullPointerException;
        localNullPointerException.<init>("mData == null");
        AppMethodBeat.o(116100);
        throw localNullPointerException;
      }
    }
    finally
    {
    }
    Map localMap = this.eRT.snapshot();
    AppMethodBeat.o(116100);
    return localMap;
  }

  public final String toString()
  {
    try
    {
      AppMethodBeat.i(116101);
      if (this.eRT == null)
      {
        NullPointerException localNullPointerException = new java/lang/NullPointerException;
        localNullPointerException.<init>("mData == null");
        AppMethodBeat.o(116101);
        throw localNullPointerException;
      }
    }
    finally
    {
    }
    String str = this.eRT.toString();
    AppMethodBeat.o(116101);
    return str;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.at.a.d.a
 * JD-Core Version:    0.6.2
 */