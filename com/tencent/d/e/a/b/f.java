package com.tencent.d.e.a.b;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class f extends JceStruct
{
  public long Auo = 0L;
  public float x = 0.0F;
  public float y = 0.0F;
  public float z = 0.0F;

  public final void readFrom(JceInputStream paramJceInputStream)
  {
    AppMethodBeat.i(114585);
    this.Auo = paramJceInputStream.read(this.Auo, 0, true);
    this.x = paramJceInputStream.read(this.x, 1, true);
    this.y = paramJceInputStream.read(this.y, 2, true);
    this.z = paramJceInputStream.read(this.z, 3, true);
    AppMethodBeat.o(114585);
  }

  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    AppMethodBeat.i(114584);
    paramJceOutputStream.write(this.Auo, 0);
    paramJceOutputStream.write(this.x, 1);
    paramJceOutputStream.write(this.y, 2);
    paramJceOutputStream.write(this.z, 3);
    AppMethodBeat.o(114584);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.d.e.a.b.f
 * JD-Core Version:    0.6.2
 */