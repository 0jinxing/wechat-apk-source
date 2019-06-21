package com.tencent.mm.protocal;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.protocal.protobuf.BaseResponse;
import com.tencent.mm.protocal.protobuf.bts;
import com.tencent.mm.protocal.protobuf.hl;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class l
{
  public static hl a(d paramd)
  {
    AppMethodBeat.i(58841);
    hl localhl = new hl();
    localhl.vKd = paramd.vyc;
    localhl.Scene = paramd.vyf;
    localhl.luF = paramd.vyb;
    localhl.vKc = b.bI(paramd.vye.getBytes());
    if (localhl.vKc.wR.length >= 16)
      localhl.vKc = localhl.vKc.Lv(16);
    localhl.vKe = b.bI(paramd.vyd.getBytes());
    if (localhl.vKe.wR.length >= 132)
      localhl.vKe = localhl.vKe.Lv(132);
    localhl.vKb = b.bI(paramd.bFT);
    if (localhl.vKb.wR.length >= 36)
      localhl.vKb = localhl.vKb.Lv(36);
    AppMethodBeat.o(58841);
    return localhl;
  }

  public static void a(e parame, BaseResponse paramBaseResponse)
  {
    AppMethodBeat.i(58842);
    if (paramBaseResponse.ErrMsg != null)
    {
      parame.vyn = paramBaseResponse.ErrMsg.wVI;
      AppMethodBeat.o(58842);
    }
    while (true)
    {
      return;
      parame.vyn = "";
      ab.e("MicroMsg.MMBase", "ErrMsg is Null!!!!!!");
      AppMethodBeat.o(58842);
    }
  }

  public static abstract interface a
  {
    public abstract boolean a(PByteArray paramPByteArray, int paramInt1, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt2);
  }

  public static abstract interface b
  {
    public abstract byte[] ZT();

    public abstract int ZU();

    public abstract long ads();

    public abstract int dmr();

    public abstract boolean dms();
  }

  public static abstract interface c
  {
    public abstract int P(byte[] paramArrayOfByte);

    public abstract boolean dms();
  }

  public static class d
  {
    public byte[] bFT;
    public long bufferSize;
    public int fsO;
    public int vyb;
    public int vyc;
    public String vyd;
    public String vye;
    public int vyf;
    public boolean vyg;
    public l.a vyh;
    public byte[] vyi;
    public z vyj;
    public long vyk;

    public d()
    {
      AppMethodBeat.i(58839);
      this.vyg = true;
      this.bufferSize = 0L;
      this.vyb = 0;
      this.vyc = 0;
      this.bFT = new byte[0];
      this.vyd = "";
      this.vye = "";
      this.vyf = 0;
      this.vyj = new z("", "", 0);
      this.fsO = 0;
      this.vyk = 0L;
      AppMethodBeat.o(58839);
    }

    public final void a(z paramz)
    {
      AppMethodBeat.i(58840);
      this.vyj = paramz;
      ab.i("MicroMsg.MMBase.Req", "summerauths setRsaInfo cgi[%s], stack[%s]", new Object[] { Integer.valueOf(getCmdId()), bo.dpG() });
      AppMethodBeat.o(58840);
    }

    public boolean adr()
    {
      return this.vyg;
    }

    public final long ads()
    {
      return this.vyk;
    }

    public final int dmr()
    {
      return this.fsO;
    }

    public boolean dms()
    {
      return false;
    }

    public int getCmdId()
    {
      return 0;
    }

    public void hB(int paramInt)
    {
      this.vyb = paramInt;
    }
  }

  public static class e
  {
    public long bufferSize = 0L;
    public int vyl = -99;
    public int vym = 255;
    public String vyn = "";

    public boolean dms()
    {
      return false;
    }

    public int getCmdId()
    {
      return 0;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.l
 * JD-Core Version:    0.6.2
 */