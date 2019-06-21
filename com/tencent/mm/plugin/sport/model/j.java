package com.tencent.mm.plugin.sport.model;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.storage.y;

public final class j extends y
{
  public j(String paramString)
  {
    super(paramString);
  }

  public final long getLong(int paramInt, long paramLong)
  {
    while (true)
    {
      try
      {
        AppMethodBeat.i(93685);
        Object localObject1 = get(paramInt);
        if ((localObject1 instanceof Long))
        {
          paramLong = ((Long)localObject1).longValue();
          AppMethodBeat.o(93685);
          return paramLong;
        }
        if ((localObject1 instanceof Integer))
        {
          paramLong = ((Integer)localObject1).longValue();
          AppMethodBeat.o(93685);
          continue;
        }
      }
      finally
      {
      }
      AppMethodBeat.o(93685);
    }
  }

  public final String getString(int paramInt, String paramString)
  {
    try
    {
      AppMethodBeat.i(93687);
      Object localObject = get(paramInt);
      if ((localObject instanceof String))
      {
        paramString = (String)localObject;
        AppMethodBeat.o(93687);
      }
      while (true)
      {
        return paramString;
        AppMethodBeat.o(93687);
      }
    }
    finally
    {
    }
    throw paramString;
  }

  public final void setString(int paramInt, String paramString)
  {
    try
    {
      AppMethodBeat.i(93686);
      set(paramInt, paramString);
      AppMethodBeat.o(93686);
      return;
    }
    finally
    {
      paramString = finally;
    }
    throw paramString;
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.sport.model.j
 * JD-Core Version:    0.6.2
 */