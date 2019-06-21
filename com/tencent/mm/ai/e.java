package com.tencent.mm.ai;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.cm;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.storage.bi;
import java.util.concurrent.ConcurrentHashMap;

public abstract interface e
{
  public abstract void a(c paramc);

  public abstract b b(a parama);

  public static final class a
  {
    public cm eAB;
    public boolean fsU = false;
    public boolean fsV = false;
    public boolean fsW = false;
    public long fsX = 0L;
    public Object fsY;

    public a(cm paramcm, Object paramObject)
    {
      this.eAB = paramcm;
      this.fsY = paramObject;
    }

    public a(cm paramcm, boolean paramBoolean, long paramLong)
    {
      this.eAB = paramcm;
      this.fsU = true;
      this.fsV = false;
      this.fsW = paramBoolean;
      this.fsX = paramLong;
    }

    public a(cm paramcm, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
    {
      this.eAB = paramcm;
      this.fsU = paramBoolean1;
      this.fsV = paramBoolean2;
      this.fsW = paramBoolean3;
    }

    public final String toString()
    {
      AppMethodBeat.i(59945);
      String str = String.format("AddMsgInfo(%d), get[%b], fault[%b], up[%b] fixTime[%s]", new Object[] { Integer.valueOf(hashCode()), Boolean.valueOf(this.fsU), Boolean.valueOf(this.fsV), Boolean.valueOf(this.fsW), Long.valueOf(this.fsX) });
      AppMethodBeat.o(59945);
      return str;
    }
  }

  public static final class b
  {
    public bi csG;
    public boolean fsZ;

    public b(bi parambi, boolean paramBoolean)
    {
      this.csG = parambi;
      this.fsZ = paramBoolean;
    }
  }

  public static final class c
  {
    public bi cKd;
    public cm eAB;
    public Object fsY;

    public c(cm paramcm, Object paramObject)
    {
      this.eAB = paramcm;
      this.fsY = paramObject;
    }

    public c(bi parambi)
    {
      this.cKd = parambi;
    }
  }

  public static final class d
  {
    private static ConcurrentHashMap<Object, e> fsR;

    static
    {
      AppMethodBeat.i(59949);
      fsR = new ConcurrentHashMap();
      AppMethodBeat.o(59949);
    }

    public static void a(Object paramObject, e parame)
    {
      AppMethodBeat.i(59946);
      ab.i("MicroMsg.IMessageExtension.Factory", "registerExtensionFor %s, %s", new Object[] { paramObject, parame });
      fsR.put(paramObject, parame);
      AppMethodBeat.o(59946);
    }

    public static void b(Object paramObject, e parame)
    {
      AppMethodBeat.i(59947);
      ab.i("MicroMsg.IMessageExtension.Factory", "unregisterExtensionFor %s, %s", new Object[] { paramObject, parame });
      fsR.remove(paramObject);
      AppMethodBeat.o(59947);
    }

    public static e bg(Object paramObject)
    {
      AppMethodBeat.i(59948);
      paramObject = (e)fsR.get(paramObject);
      AppMethodBeat.o(59948);
      return paramObject;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.ai.e
 * JD-Core Version:    0.6.2
 */