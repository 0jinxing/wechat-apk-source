package com.tencent.mm.plugin.d.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.j.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class e
{
  private final g jEN;
  public final h jEO;

  public e()
  {
    AppMethodBeat.i(18331);
    this.jEN = new g();
    this.jEO = new h();
    AppMethodBeat.o(18331);
  }

  public final boolean ar(byte[] paramArrayOfByte)
  {
    AppMethodBeat.i(18332);
    boolean bool;
    if (bo.cb(paramArrayOfByte))
    {
      ab.e("MicroMsg.exdevice.IBeaconProtocal", "dataIn is null or nil");
      bool = false;
      AppMethodBeat.o(18332);
    }
    while (true)
    {
      return bool;
      a locala = new a(paramArrayOfByte.length);
      locala.R(paramArrayOfByte, paramArrayOfByte.length);
      bool = this.jEN.a(locala);
      if (!bool)
      {
        ab.d("MicroMsg.exdevice.IBeaconProtocal", "mSectionA.ParseTLV Failed!!!");
        AppMethodBeat.o(18332);
      }
      else
      {
        bool = this.jEO.a(locala);
        if (!bool)
        {
          ab.d("MicroMsg.exdevice.IBeaconProtocal", "mSectionB.ParseTLV Failed!!!");
          AppMethodBeat.o(18332);
        }
        else
        {
          AppMethodBeat.o(18332);
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.a.e
 * JD-Core Version:    0.6.2
 */