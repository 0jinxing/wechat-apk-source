package com.tencent.mm.plugin.d.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.exdevice.j.a;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bo;
import java.io.IOException;
import java.util.Arrays;

public final class h extends j
{
  private static final byte[] jFn = { 76, 0, 2, 21 };
  private byte[] jFo = null;
  public byte[] jFp = null;
  public short jFq = (short)-1;
  public short jFr = (short)-1;
  public int jFs = 0;

  final boolean as(byte[] paramArrayOfByte)
  {
    boolean bool = false;
    AppMethodBeat.i(18357);
    if (bo.cb(paramArrayOfByte))
    {
      ab.e("MicroMsg.exdevice.IBeaconTLVSectionB", "valueByte is null or nil");
      AppMethodBeat.o(18357);
    }
    while (true)
    {
      return bool;
      if (26 != this.mLength)
      {
        ab.d("MicroMsg.exdevice.IBeaconTLVSectionB", "IBEACON_TLV_SECTION_B_LENGTH != mLength(%d) ", new Object[] { Integer.valueOf(this.mLength) });
        AppMethodBeat.o(18357);
      }
      else
      {
        a locala = new a(paramArrayOfByte.length);
        locala.R(paramArrayOfByte, paramArrayOfByte.length);
        paramArrayOfByte = new byte[4];
        locala.Q(paramArrayOfByte, 4);
        if (!Arrays.equals(paramArrayOfByte, jFn))
        {
          ab.d("MicroMsg.exdevice.IBeaconTLVSectionB", "Cannot find ibeacon cookies!!!");
          AppMethodBeat.o(18357);
        }
        else
        {
          this.jFo = paramArrayOfByte;
          this.jFp = new byte[16];
          locala.Q(this.jFp, 16);
          try
          {
            this.jFq = locala.readShort();
            this.jFr = locala.readShort();
            paramArrayOfByte = new byte[1];
            locala.Q(paramArrayOfByte, 1);
            this.jFs = paramArrayOfByte[0];
            AppMethodBeat.o(18357);
            bool = true;
          }
          catch (IOException paramArrayOfByte)
          {
            ab.d("MicroMsg.exdevice.IBeaconTLVSectionB", "Read major/minor from autobuffer failed!!!");
            ab.printErrStackTrace("MicroMsg.exdevice.IBeaconTLVSectionB", paramArrayOfByte, "", new Object[0]);
            AppMethodBeat.o(18357);
          }
        }
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.a.h
 * JD-Core Version:    0.6.2
 */