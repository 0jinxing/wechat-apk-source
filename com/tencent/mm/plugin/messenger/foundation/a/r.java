package com.tencent.mm.plugin.messenger.foundation.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.tb;
import java.util.concurrent.ConcurrentHashMap;
import junit.framework.Assert;

public abstract interface r
{
  public abstract void a(tb paramtb, byte[] paramArrayOfByte, boolean paramBoolean, t paramt);

  public static final class a
  {
    private static ConcurrentHashMap<Integer, r> oqz;

    static
    {
      AppMethodBeat.i(60006);
      oqz = new ConcurrentHashMap();
      AppMethodBeat.o(60006);
    }

    public static void a(int paramInt, r paramr)
    {
      AppMethodBeat.i(60004);
      if (oqz.get(Integer.valueOf(paramInt)) == null);
      for (boolean bool = true; ; bool = false)
      {
        Assert.assertTrue(bool);
        oqz.put(Integer.valueOf(paramInt), paramr);
        AppMethodBeat.o(60004);
        return;
      }
    }

    public static r yv(int paramInt)
    {
      AppMethodBeat.i(60005);
      r localr = (r)oqz.get(Integer.valueOf(paramInt));
      AppMethodBeat.o(60005);
      return localr;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.messenger.foundation.a.r
 * JD-Core Version:    0.6.2
 */