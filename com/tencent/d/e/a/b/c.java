package com.tencent.d.e.a.b;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class c extends JceStruct
{
  public int errCode = 0;

  public final void readFrom(JceInputStream paramJceInputStream)
  {
    AppMethodBeat.i(114579);
    this.errCode = paramJceInputStream.read(this.errCode, 0, false);
    AppMethodBeat.o(114579);
  }

  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    AppMethodBeat.i(114578);
    if (this.errCode != 0)
      paramJceOutputStream.write(this.errCode, 0);
    AppMethodBeat.o(114578);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.d.e.a.b.c
 * JD-Core Version:    0.6.2
 */