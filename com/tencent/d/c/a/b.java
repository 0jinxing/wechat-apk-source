package com.tencent.d.c.a;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b extends JceStruct
{
  public int ArP = 0;
  public int ArQ = 0;
  public int ArR = 0;

  public final void readFrom(JceInputStream paramJceInputStream)
  {
    AppMethodBeat.i(114482);
    this.ArP = paramJceInputStream.read(this.ArP, 1, true);
    this.ArQ = paramJceInputStream.read(this.ArQ, 2, true);
    this.ArR = paramJceInputStream.read(this.ArR, 3, true);
    AppMethodBeat.o(114482);
  }

  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    AppMethodBeat.i(114481);
    paramJceOutputStream.write(this.ArP, 1);
    paramJceOutputStream.write(this.ArQ, 2);
    paramJceOutputStream.write(this.ArR, 3);
    AppMethodBeat.o(114481);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.d.c.a.b
 * JD-Core Version:    0.6.2
 */