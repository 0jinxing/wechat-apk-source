package com.tencent.d.e.a.b;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b extends JceStruct
{
  public int Aug = 0;
  public float Auh = 0.0F;
  public String ceI = "";
  public String few = "";

  public final void readFrom(JceInputStream paramJceInputStream)
  {
    AppMethodBeat.i(114577);
    this.few = paramJceInputStream.readString(0, true);
    this.Aug = paramJceInputStream.read(this.Aug, 1, true);
    this.Auh = paramJceInputStream.read(this.Auh, 2, true);
    this.ceI = paramJceInputStream.readString(3, false);
    AppMethodBeat.o(114577);
  }

  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    AppMethodBeat.i(114576);
    paramJceOutputStream.write(this.few, 0);
    paramJceOutputStream.write(this.Aug, 1);
    paramJceOutputStream.write(this.Auh, 2);
    if (this.ceI != null)
      paramJceOutputStream.write(this.ceI, 3);
    AppMethodBeat.o(114576);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.d.e.a.b.b
 * JD-Core Version:    0.6.2
 */