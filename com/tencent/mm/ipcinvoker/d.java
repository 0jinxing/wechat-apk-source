package com.tencent.mm.ipcinvoker;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.ipcinvoker.d.e;
import junit.framework.Assert;

public final class d
{
  public String eFV;

  public d(String paramString)
  {
    this.eFV = paramString;
  }

  public static String ap(Object paramObject)
  {
    AppMethodBeat.i(114020);
    paramObject = "Token#IPCObserver#" + paramObject.hashCode();
    AppMethodBeat.o(114020);
    return paramObject;
  }

  static abstract class c
    implements e
  {
    String token;

    c(String paramString)
    {
      this.token = paramString;
      Assert.assertNotNull(paramString);
    }

    public boolean equals(Object paramObject)
    {
      if ((paramObject == null) || (!(paramObject instanceof c)));
      for (boolean bool = false; ; bool = this.token.equals(((c)paramObject).token))
        return bool;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ipcinvoker.d
 * JD-Core Version:    0.6.2
 */