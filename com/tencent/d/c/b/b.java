package com.tencent.d.c.b;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.ArrayList;

public final class b extends JceStruct
{
  static byte[] AsI;
  static byte[] AsJ;
  static ArrayList<Integer> AsK;
  static ArrayList<byte[]> AsL;
  public int AsA = 0;
  public int AsB = 0;
  public ArrayList<Integer> AsC = null;
  public int AsD = 0;
  public boolean AsE = false;
  public int AsF = 0;
  public int AsG = 0;
  public ArrayList<byte[]> AsH = null;
  public int Asp = 0;
  public byte[] Asq = null;
  public String Asr = "";
  public byte[] Ass = null;
  public long Ast = 0L;
  public String Asu = "";
  public int Asv = 0;
  public String Asw = "";
  public int Asx = 0;
  public String Asy = "";
  public int Asz = 0;

  static
  {
    AppMethodBeat.i(114494);
    byte[] arrayOfByte = (byte[])new byte[1];
    AsI = arrayOfByte;
    ((byte[])arrayOfByte)[0] = ((byte)0);
    arrayOfByte = (byte[])new byte[1];
    AsJ = arrayOfByte;
    ((byte[])arrayOfByte)[0] = ((byte)0);
    AsK = new ArrayList();
    AsK.add(Integer.valueOf(0));
    AsL = new ArrayList();
    arrayOfByte = (byte[])new byte[1];
    ((byte[])arrayOfByte)[0] = ((byte)0);
    AsL.add(arrayOfByte);
    AppMethodBeat.o(114494);
  }

  public final JceStruct newInit()
  {
    AppMethodBeat.i(114491);
    b localb = new b();
    AppMethodBeat.o(114491);
    return localb;
  }

  public final void readFrom(JceInputStream paramJceInputStream)
  {
    AppMethodBeat.i(114493);
    this.Asp = paramJceInputStream.read(this.Asp, 0, true);
    this.Asq = ((byte[])paramJceInputStream.read(AsI, 1, false));
    this.Asr = paramJceInputStream.readString(2, false);
    this.Ass = ((byte[])paramJceInputStream.read(AsJ, 3, false));
    this.Ast = paramJceInputStream.read(this.Ast, 4, false);
    this.Asu = paramJceInputStream.readString(5, false);
    this.Asv = paramJceInputStream.read(this.Asv, 6, false);
    this.Asw = paramJceInputStream.readString(7, false);
    this.Asx = paramJceInputStream.read(this.Asx, 8, false);
    this.Asy = paramJceInputStream.readString(9, false);
    this.Asz = paramJceInputStream.read(this.Asz, 10, false);
    this.AsA = paramJceInputStream.read(this.AsA, 11, false);
    this.AsB = paramJceInputStream.read(this.AsB, 12, false);
    this.AsC = ((ArrayList)paramJceInputStream.read(AsK, 13, false));
    this.AsD = paramJceInputStream.read(this.AsD, 14, false);
    this.AsE = paramJceInputStream.read(this.AsE, 15, false);
    this.AsF = paramJceInputStream.read(this.AsF, 16, false);
    this.AsG = paramJceInputStream.read(this.AsG, 17, false);
    this.AsH = ((ArrayList)paramJceInputStream.read(AsL, 18, false));
    AppMethodBeat.o(114493);
  }

  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    AppMethodBeat.i(114492);
    paramJceOutputStream.write(this.Asp, 0);
    if (this.Asq != null)
      paramJceOutputStream.write(this.Asq, 1);
    if (this.Asr != null)
      paramJceOutputStream.write(this.Asr, 2);
    if (this.Ass != null)
      paramJceOutputStream.write(this.Ass, 3);
    if (this.Ast != 0L)
      paramJceOutputStream.write(this.Ast, 4);
    if (this.Asu != null)
      paramJceOutputStream.write(this.Asu, 5);
    if (this.Asv != 0)
      paramJceOutputStream.write(this.Asv, 6);
    if (this.Asw != null)
      paramJceOutputStream.write(this.Asw, 7);
    if (this.Asx != 0)
      paramJceOutputStream.write(this.Asx, 8);
    if (this.Asy != null)
      paramJceOutputStream.write(this.Asy, 9);
    paramJceOutputStream.write(this.Asz, 10);
    if (this.AsA != 0)
      paramJceOutputStream.write(this.AsA, 11);
    if (this.AsB != 0)
      paramJceOutputStream.write(this.AsB, 12);
    if (this.AsC != null)
      paramJceOutputStream.write(this.AsC, 13);
    if (this.AsD != 0)
      paramJceOutputStream.write(this.AsD, 14);
    paramJceOutputStream.write(this.AsE, 15);
    if (this.AsF != 0)
      paramJceOutputStream.write(this.AsF, 16);
    paramJceOutputStream.write(this.AsG, 17);
    if (this.AsH != null)
      paramJceOutputStream.write(this.AsH, 18);
    AppMethodBeat.o(114492);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.d.c.b.b
 * JD-Core Version:    0.6.2
 */