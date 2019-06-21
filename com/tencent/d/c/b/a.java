package com.tencent.d.c.b;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

public final class a extends JceStruct
{
  static c Asm;
  static ArrayList<b> Asn;
  static d Aso;
  public c Asj = null;
  public ArrayList<b> Ask = null;
  public d Asl = null;

  static
  {
    AppMethodBeat.i(114490);
    Asm = new c();
    Asn = new ArrayList();
    b localb = new b();
    Asn.add(localb);
    Aso = new d();
    AppMethodBeat.o(114490);
  }

  public final JceStruct newInit()
  {
    AppMethodBeat.i(114487);
    a locala = new a();
    AppMethodBeat.o(114487);
    return locala;
  }

  public final void readFrom(JceInputStream paramJceInputStream)
  {
    AppMethodBeat.i(114489);
    this.Asj = ((c)paramJceInputStream.read(Asm, 0, false));
    this.Ask = ((ArrayList)paramJceInputStream.read(Asn, 1, false));
    this.Asl = ((d)paramJceInputStream.read(Aso, 2, false));
    AppMethodBeat.o(114489);
  }

  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    AppMethodBeat.i(114488);
    if (this.Asj != null)
      paramJceOutputStream.write(this.Asj, 0);
    if (this.Ask != null)
      paramJceOutputStream.write(this.Ask, 1);
    if (this.Asl != null)
      paramJceOutputStream.write(this.Asl, 2);
    AppMethodBeat.o(114488);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.d.c.b.a
 * JD-Core Version:    0.6.2
 */