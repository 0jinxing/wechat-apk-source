package com.tencent.d.c.a;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class c extends JceStruct
{
  static b Asi;
  public String ArS = "";
  public String ArT = "";
  public String ArU = "";
  public int ArV = 0;
  public int ArW = 0;
  public b ArX = null;
  public int ArY = 0;
  public int ArZ = 0;
  public int Asa = 0;
  public int Asb = 0;
  public short Asc = (short)0;
  public String Asd = "";
  public int Ase = 0;
  public String Asf = "";
  public String Asg = "";
  public String Ash = "";
  public String eCq = "";
  public String fgd = "";
  public String guid = "";
  public String gxL = "";
  public String imei = "";
  public String imsi = "";
  public String ip = "";
  public String kck = "";
  public double latitude = 0.0D;
  public double longitude = 0.0D;
  public String qTL = "";

  static
  {
    AppMethodBeat.i(114486);
    Asi = new b();
    AppMethodBeat.o(114486);
  }

  public final JceStruct newInit()
  {
    AppMethodBeat.i(114483);
    c localc = new c();
    AppMethodBeat.o(114483);
    return localc;
  }

  public final void readFrom(JceInputStream paramJceInputStream)
  {
    AppMethodBeat.i(114485);
    this.imei = paramJceInputStream.readString(0, true);
    this.gxL = paramJceInputStream.readString(1, false);
    this.kck = paramJceInputStream.readString(2, false);
    this.ip = paramJceInputStream.readString(3, false);
    this.ArS = paramJceInputStream.readString(4, false);
    this.ArT = paramJceInputStream.readString(5, false);
    this.ArU = paramJceInputStream.readString(6, false);
    this.ArV = paramJceInputStream.read(this.ArV, 7, false);
    this.ArW = paramJceInputStream.read(this.ArW, 8, false);
    this.ArX = ((b)paramJceInputStream.read(Asi, 9, false));
    this.guid = paramJceInputStream.readString(10, false);
    this.imsi = paramJceInputStream.readString(11, false);
    this.ArY = paramJceInputStream.read(this.ArY, 12, false);
    this.ArZ = paramJceInputStream.read(this.ArZ, 13, false);
    this.Asa = paramJceInputStream.read(this.Asa, 14, false);
    this.Asb = paramJceInputStream.read(this.Asb, 15, false);
    this.eCq = paramJceInputStream.readString(16, false);
    this.Asc = paramJceInputStream.read(this.Asc, 17, false);
    this.longitude = paramJceInputStream.read(this.longitude, 18, false);
    this.latitude = paramJceInputStream.read(this.latitude, 19, false);
    this.Asd = paramJceInputStream.readString(20, false);
    this.Ase = paramJceInputStream.read(this.Ase, 21, false);
    this.Asf = paramJceInputStream.readString(22, false);
    this.fgd = paramJceInputStream.readString(23, false);
    this.qTL = paramJceInputStream.readString(24, false);
    this.Asg = paramJceInputStream.readString(25, false);
    this.Ash = paramJceInputStream.readString(26, false);
    AppMethodBeat.o(114485);
  }

  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    AppMethodBeat.i(114484);
    paramJceOutputStream.write(this.imei, 0);
    if (this.gxL != null)
      paramJceOutputStream.write(this.gxL, 1);
    if (this.kck != null)
      paramJceOutputStream.write(this.kck, 2);
    if (this.ip != null)
      paramJceOutputStream.write(this.ip, 3);
    if (this.ArS != null)
      paramJceOutputStream.write(this.ArS, 4);
    if (this.ArT != null)
      paramJceOutputStream.write(this.ArT, 5);
    if (this.ArU != null)
      paramJceOutputStream.write(this.ArU, 6);
    if (this.ArV != 0)
      paramJceOutputStream.write(this.ArV, 7);
    if (this.ArW != 0)
      paramJceOutputStream.write(this.ArW, 8);
    if (this.ArX != null)
      paramJceOutputStream.write(this.ArX, 9);
    if (this.guid != null)
      paramJceOutputStream.write(this.guid, 10);
    if (this.imsi != null)
      paramJceOutputStream.write(this.imsi, 11);
    if (this.ArY != 0)
      paramJceOutputStream.write(this.ArY, 12);
    if (this.ArZ != 0)
      paramJceOutputStream.write(this.ArZ, 13);
    if (this.Asa != 0)
      paramJceOutputStream.write(this.Asa, 14);
    if (this.Asb != 0)
      paramJceOutputStream.write(this.Asb, 15);
    if (this.eCq != null)
      paramJceOutputStream.write(this.eCq, 16);
    if (this.Asc != 0)
      paramJceOutputStream.write(this.Asc, 17);
    if (this.longitude != 0.0D)
      paramJceOutputStream.write(this.longitude, 18);
    if (this.latitude != 0.0D)
      paramJceOutputStream.write(this.latitude, 19);
    if (this.Asd != null)
      paramJceOutputStream.write(this.Asd, 20);
    if (this.Ase != 0)
      paramJceOutputStream.write(this.Ase, 21);
    if (this.Asf != null)
      paramJceOutputStream.write(this.Asf, 22);
    if (this.fgd != null)
      paramJceOutputStream.write(this.fgd, 23);
    if (this.qTL != null)
      paramJceOutputStream.write(this.qTL, 24);
    if (this.Asg != null)
      paramJceOutputStream.write(this.Asg, 25);
    if (this.Ash != null)
      paramJceOutputStream.write(this.Ash, 26);
    AppMethodBeat.o(114484);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.d.c.a.c
 * JD-Core Version:    0.6.2
 */