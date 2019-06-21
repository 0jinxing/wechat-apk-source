package com.tencent.mm.plugin.d.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;

public final class g extends j
{
  private byte jFm = (byte)0;

  final boolean as(byte[] paramArrayOfByte)
  {
    boolean bool = false;
    AppMethodBeat.i(18356);
    if (bo.cb(paramArrayOfByte))
    {
      ab.e("MicroMsg.exdevice.IBeaconTLVSectionA", "valueByte is null or nil");
      AppMethodBeat.o(18356);
    }
    while (true)
    {
      return bool;
      if (2 != this.mLength)
      {
        ab.d("MicroMsg.exdevice.IBeaconTLVSectionA", "IBEACON_TLV_SECTION_A_LENGTH != mLength(%d)", new Object[] { Integer.valueOf(this.mLength) });
        AppMethodBeat.o(18356);
      }
      else
      {
        this.jFm = ((byte)paramArrayOfByte[0]);
        AppMethodBeat.o(18356);
        bool = true;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.a.g
 * JD-Core Version:    0.6.2
 */