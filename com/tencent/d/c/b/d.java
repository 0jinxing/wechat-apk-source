package com.tencent.d.c.b;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class d extends JceStruct
{
  public String AsX = "";
  public String AsY = "";
  public int AsZ = 0;
  public String Ata = "";
  public int Atb = 0;
  public String fwM = "";
  public String model = "";
  public String platform = "";

  public final JceStruct newInit()
  {
    AppMethodBeat.i(114498);
    d locald = new d();
    AppMethodBeat.o(114498);
    return locald;
  }

  public final void readFrom(JceInputStream paramJceInputStream)
  {
    AppMethodBeat.i(114500);
    this.AsX = paramJceInputStream.readString(0, false);
    this.AsY = paramJceInputStream.readString(1, false);
    this.fwM = paramJceInputStream.readString(2, false);
    this.model = paramJceInputStream.readString(3, false);
    this.AsZ = paramJceInputStream.read(this.AsZ, 4, false);
    this.Ata = paramJceInputStream.readString(5, false);
    this.platform = paramJceInputStream.readString(6, false);
    this.Atb = paramJceInputStream.read(this.Atb, 7, false);
    AppMethodBeat.o(114500);
  }

  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    AppMethodBeat.i(114499);
    if (this.AsX != null)
      paramJceOutputStream.write(this.AsX, 0);
    if (this.AsY != null)
      paramJceOutputStream.write(this.AsY, 1);
    if (this.fwM != null)
      paramJceOutputStream.write(this.fwM, 2);
    if (this.model != null)
      paramJceOutputStream.write(this.model, 3);
    if (this.AsZ != 0)
      paramJceOutputStream.write(this.AsZ, 4);
    if (this.Ata != null)
      paramJceOutputStream.write(this.Ata, 5);
    if (this.platform != null)
      paramJceOutputStream.write(this.platform, 6);
    if (this.Atb != 0)
      paramJceOutputStream.write(this.Atb, 7);
    AppMethodBeat.o(114499);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.d.c.b.d
 * JD-Core Version:    0.6.2
 */