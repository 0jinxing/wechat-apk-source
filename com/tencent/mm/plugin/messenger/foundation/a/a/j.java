package com.tencent.mm.plugin.messenger.foundation.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.a;
import com.tencent.mm.sdk.platformtools.ab;
import java.io.IOException;

public abstract interface j
{
  public static final class a extends j.b
  {
    private int cmdId;

    public a(int paramInt, a parama)
    {
      super();
      this.cmdId = paramInt;
      this.oqT = parama;
    }

    public final int getCmdId()
    {
      return this.cmdId;
    }
  }

  public static class b
  {
    public int bJt = -1;
    public byte[] buffer;
    public int cmdId;
    public long fCv;
    public int id;
    public int oqP;
    public long oqQ;
    public String oqR;
    public String oqS;
    public a oqT;

    public b(int paramInt)
    {
      this.cmdId = paramInt;
    }

    public final a bOI()
    {
      return this.oqT;
    }

    public final byte[] getBuffer()
    {
      AppMethodBeat.i(60022);
      if ((this.buffer == null) && (this.oqT != null));
      try
      {
        this.buffer = this.oqT.toByteArray();
        byte[] arrayOfByte = this.buffer;
        AppMethodBeat.o(60022);
        return arrayOfByte;
      }
      catch (IOException localIOException)
      {
        while (true)
          ab.e("MicroMsg.OpLog.Operation", "summeroplog Operation toByteArray err: " + localIOException.getMessage());
      }
    }

    public int getCmdId()
    {
      return this.cmdId;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.messenger.foundation.a.a.j
 * JD-Core Version:    0.6.2
 */