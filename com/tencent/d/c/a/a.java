package com.tencent.d.c.a;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class a extends JceStruct
{
  public int ArN = 0;
  public int ArO = 0;

  public final void readFrom(JceInputStream paramJceInputStream)
  {
    AppMethodBeat.i(114480);
    this.ArN = paramJceInputStream.read(this.ArN, 0, true);
    this.ArO = paramJceInputStream.read(this.ArO, 1, false);
    AppMethodBeat.o(114480);
  }

  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    AppMethodBeat.i(114479);
    paramJceOutputStream.write(this.ArN, 0);
    paramJceOutputStream.write(this.ArO, 1);
    AppMethodBeat.o(114479);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.d.c.a.a
 * JD-Core Version:    0.6.2
 */