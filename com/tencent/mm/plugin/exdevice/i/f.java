package com.tencent.mm.plugin.exdevice.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.b.c;
import com.tencent.mm.plugin.exdevice.b.e;
import com.tencent.mm.plugin.exdevice.model.ad;
import com.tencent.mm.plugin.exdevice.model.ae;
import com.tencent.mm.plugin.exdevice.service.m;
import com.tencent.mm.plugin.exdevice.service.u;
import com.tencent.mm.sdk.platformtools.ab;

public final class f extends ae
{
  private e lxA;
  private a lxB;
  private int mErrorCode;

  public f(int paramInt1, long paramLong, int paramInt2, int paramInt3, byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(19734);
    this.lxA = new e(paramLong, paramInt2, paramInt3, paramArrayOfByte);
    this.mErrorCode = paramInt1;
    AppMethodBeat.o(19734);
  }

  public final boolean a(m paramm, d paramd)
  {
    AppMethodBeat.i(19735);
    boolean bool;
    if (!u.bpx().hX(this.lxA.jJa))
    {
      ab.e("MicroMsg.exdevice.MMInitTaskExcuter", "This device send other cmd before do auth, device id = %d", new Object[] { Long.valueOf(this.lxA.jJa) });
      this.lxA.a(-2, "", new byte[0], new byte[0], 0, 0);
      this.lxB = new a(this.lxA, paramd);
      bool = this.lxB.b(paramm);
      ab.i("MicroMsg.exdevice.MMInitTaskExcuter", "init start task : %b", new Object[] { Boolean.valueOf(bool) });
      AppMethodBeat.o(19735);
    }
    Object localObject;
    while (true)
    {
      return bool;
      if ((-5 == this.mErrorCode) || (-3 == this.mErrorCode) || (-4 == this.mErrorCode))
      {
        ab.e("MicroMsg.exdevice.MMInitTaskExcuter", "Error Code = %d, reply errorcode to device and close channel", new Object[] { Integer.valueOf(this.mErrorCode) });
        this.lxA.a(-1, "", new byte[0], new byte[0], 0, 0);
        this.lxB = new a(this.lxA, paramd);
        bool = this.lxB.b(paramm);
        ab.i("MicroMsg.exdevice.MMInitTaskExcuter", "init start task : %b", new Object[] { Boolean.valueOf(bool) });
        AppMethodBeat.o(19735);
      }
      else
      {
        localObject = (com.tencent.mm.plugin.exdevice.e.f)this.lxA.bou();
        if (localObject != null)
          break;
        ab.e("MicroMsg.exdevice.MMInitTaskExcuter", "Init Request parse failed, Tell device before stop this task");
        this.lxA.a(-4, "", new byte[0], new byte[0], 0, 0);
        this.lxB = new a(this.lxA, paramd);
        bool = this.lxB.b(paramm);
        ab.i("MicroMsg.exdevice.MMInitTaskExcuter", "init start task : %b", new Object[] { Boolean.valueOf(bool) });
        AppMethodBeat.o(19735);
      }
    }
    if (((com.tencent.mm.plugin.exdevice.e.f)localObject).luW != null);
    for (byte[] arrayOfByte = ((com.tencent.mm.plugin.exdevice.e.f)localObject).luW.toByteArray(); ; arrayOfByte = null)
    {
      if (((com.tencent.mm.plugin.exdevice.e.f)localObject).luV != null);
      for (localObject = ((com.tencent.mm.plugin.exdevice.e.f)localObject).luV.toByteArray(); ; localObject = null)
      {
        ad.bpd();
        int i = com.tencent.mm.plugin.exdevice.model.d.boE();
        switch (i)
        {
        default:
          ab.e("MicroMsg.exdevice.MMInitTaskExcuter", "initScene = %d, Cannot start init response", new Object[] { Integer.valueOf(i) });
        case 1:
        case 2:
        }
        this.lxA.a(0, null, (byte[])localObject, arrayOfByte, i, (int)(com.tencent.mm.plugin.exdevice.j.b.bqi() / 1000L));
        this.lxB = new a(this.lxA, paramd);
        bool = this.lxB.b(paramm);
        AppMethodBeat.o(19735);
        break;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.exdevice.i.f
 * JD-Core Version:    0.6.2
 */