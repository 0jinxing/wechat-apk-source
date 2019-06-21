package com.tencent.d.e.a.b;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class d extends JceStruct
{
  static b Auj;
  public b Aui = null;
  public int errorCode = 0;

  public final void readFrom(JceInputStream paramJceInputStream)
  {
    AppMethodBeat.i(114581);
    this.errorCode = paramJceInputStream.read(this.errorCode, 0, true);
    if (Auj == null)
      Auj = new b();
    this.Aui = ((b)paramJceInputStream.read(Auj, 1, false));
    AppMethodBeat.o(114581);
  }

  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    AppMethodBeat.i(114580);
    paramJceOutputStream.write(this.errorCode, 0);
    if (this.Aui != null)
      paramJceOutputStream.write(this.Aui, 1);
    AppMethodBeat.o(114580);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.d.e.a.b.d
 * JD-Core Version:    0.6.2
 */