package com.tencent.mm.plugin.d.a.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.plugin.d.a.b.h;

public class e extends a
{
  static final String TAG;
  public static final String jHS;
  public static final String jHT;
  public static final String jHU;
  public static final String jHV;
  public byte jHW;
  public byte jHX;
  public byte jHY;
  public byte jHZ;
  public byte[] jIa;
  public int jIb;
  public byte jIc;
  public byte jId;
  public byte[] jIe;

  static
  {
    AppMethodBeat.i(18471);
    TAG = e.class.getName();
    jHS = h.jGM;
    jHT = h.jGN;
    jHU = h.jGO;
    jHV = h.jGP;
    AppMethodBeat.o(18471);
  }

  public e()
  {
    AppMethodBeat.i(18469);
    this.jHc = null;
    this.jHd = 8;
    this.jGw = 16L;
    this.jHW = ((byte)0);
    this.jHX = ((byte)0);
    this.jHY = ((byte)0);
    this.jHZ = ((byte)0);
    this.jIa = new byte[] { 0, 0 };
    this.jIb = -1;
    this.jIc = ((byte)0);
    this.jId = ((byte)0);
    this.jIe = null;
    AppMethodBeat.o(18469);
  }

  public final byte[] aVE()
  {
    AppMethodBeat.i(18470);
    byte[] arrayOfByte;
    if (this.jHc.equalsIgnoreCase(jHS))
    {
      arrayOfByte = new byte[3];
      System.arraycopy(Byte.valueOf(this.jHW), 0, arrayOfByte, 0, 1);
      System.arraycopy(Byte.valueOf(this.jHX), 0, arrayOfByte, 1, 1);
      System.arraycopy(Byte.valueOf(this.jHY), 0, arrayOfByte, 2, 1);
      AppMethodBeat.o(18470);
    }
    while (true)
    {
      return arrayOfByte;
      if (this.jHc.equalsIgnoreCase(jHT))
      {
        arrayOfByte = new byte[1];
        System.arraycopy(Byte.valueOf(this.jHZ), 0, arrayOfByte, 0, 1);
        AppMethodBeat.o(18470);
      }
      else if (this.jHc.equalsIgnoreCase(jHV))
      {
        arrayOfByte = new byte[this.jIb];
        byte b1 = (byte)(this.jIb & 0xFF);
        byte b2 = (byte)(this.jIb >> 8 & 0xFF);
        System.arraycopy(Byte.valueOf(b1), 0, arrayOfByte, 0, 1);
        System.arraycopy(Byte.valueOf(b2), 0, arrayOfByte, 1, 1);
        System.arraycopy(Byte.valueOf(this.jIc), 0, arrayOfByte, 2, 1);
        if (this.jIb > 3)
          System.arraycopy(this.jIe, 0, arrayOfByte, 3, this.jIb - 3);
        AppMethodBeat.o(18470);
      }
      else
      {
        arrayOfByte = null;
        AppMethodBeat.o(18470);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.d.a.b.a.e
 * JD-Core Version:    0.6.2
 */