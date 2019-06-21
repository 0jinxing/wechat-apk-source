package com.tencent.d.e.a.b;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

public final class e extends JceStruct
{
  static ArrayList<g> Aun;
  public int Atn = 0;
  public long Auk = 0L;
  public ArrayList<g> Aul = null;
  public double Aum = 0.0D;
  public int action = 0;
  public double lat = 0.0D;

  public final void readFrom(JceInputStream paramJceInputStream)
  {
    AppMethodBeat.i(114583);
    this.Auk = paramJceInputStream.read(this.Auk, 0, true);
    if (Aun == null)
    {
      Aun = new ArrayList();
      g localg = new g();
      Aun.add(localg);
    }
    this.Aul = ((ArrayList)paramJceInputStream.read(Aun, 1, true));
    this.Atn = paramJceInputStream.read(this.Atn, 2, false);
    this.action = paramJceInputStream.read(this.action, 3, false);
    this.lat = paramJceInputStream.read(this.lat, 4, false);
    this.Aum = paramJceInputStream.read(this.Aum, 5, false);
    AppMethodBeat.o(114583);
  }

  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    AppMethodBeat.i(114582);
    paramJceOutputStream.write(this.Auk, 0);
    paramJceOutputStream.write(this.Aul, 1);
    if (this.Atn != 0)
      paramJceOutputStream.write(this.Atn, 2);
    if (this.action != 0)
      paramJceOutputStream.write(this.action, 3);
    if (this.lat != 0.0D)
      paramJceOutputStream.write(this.lat, 4);
    if (this.Aum != 0.0D)
      paramJceOutputStream.write(this.Aum, 5);
    AppMethodBeat.o(114582);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.d.e.a.b.e
 * JD-Core Version:    0.6.2
 */