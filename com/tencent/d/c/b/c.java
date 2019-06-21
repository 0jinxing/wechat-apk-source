package com.tencent.d.c.b;

import com.qq.taf.jce.JceInputStream;
import com.qq.taf.jce.JceOutputStream;
import com.qq.taf.jce.JceStruct;
import com.tencent.matrix.trace.core.AppMethodBeat;

public final class c extends JceStruct
{
  static byte[] AsV;
  static byte[] AsW;
  public int AsM = 0;
  public int AsN = 0;
  public int AsO = 0;
  public byte[] AsP = null;
  public int AsQ = 0;
  public long AsR = 0L;
  public byte[] AsS = null;
  public int AsT = 0;
  public int AsU = 0;
  public int Ase = 0;
  public int fzY = 0;
  public int requestType = 0;

  static
  {
    byte[] arrayOfByte = (byte[])new byte[1];
    AsV = arrayOfByte;
    ((byte[])arrayOfByte)[0] = ((byte)0);
    arrayOfByte = (byte[])new byte[1];
    AsW = arrayOfByte;
    ((byte[])arrayOfByte)[0] = ((byte)0);
  }

  public final JceStruct newInit()
  {
    AppMethodBeat.i(114495);
    c localc = new c();
    AppMethodBeat.o(114495);
    return localc;
  }

  public final void readFrom(JceInputStream paramJceInputStream)
  {
    AppMethodBeat.i(114497);
    this.AsM = paramJceInputStream.read(this.AsM, 0, false);
    this.Ase = paramJceInputStream.read(this.Ase, 1, false);
    this.requestType = paramJceInputStream.read(this.requestType, 2, false);
    this.AsN = paramJceInputStream.read(this.AsN, 3, false);
    this.AsO = paramJceInputStream.read(this.AsO, 4, false);
    this.AsP = ((byte[])paramJceInputStream.read(AsV, 5, false));
    this.AsQ = paramJceInputStream.read(this.AsQ, 6, false);
    this.fzY = paramJceInputStream.read(this.fzY, 7, false);
    this.AsR = paramJceInputStream.read(this.AsR, 8, false);
    this.AsS = ((byte[])paramJceInputStream.read(AsW, 9, false));
    this.AsT = paramJceInputStream.read(this.AsT, 10, false);
    this.AsU = paramJceInputStream.read(this.AsU, 11, false);
    AppMethodBeat.o(114497);
  }

  public final void writeTo(JceOutputStream paramJceOutputStream)
  {
    AppMethodBeat.i(114496);
    if (this.AsM != 0)
      paramJceOutputStream.write(this.AsM, 0);
    paramJceOutputStream.write(this.Ase, 1);
    paramJceOutputStream.write(this.requestType, 2);
    if (this.AsN != 0)
      paramJceOutputStream.write(this.AsN, 3);
    if (this.AsO != 0)
      paramJceOutputStream.write(this.AsO, 4);
    if (this.AsP != null)
      paramJceOutputStream.write(this.AsP, 5);
    if (this.AsQ != 0)
      paramJceOutputStream.write(this.AsQ, 6);
    if (this.fzY != 0)
      paramJceOutputStream.write(this.fzY, 7);
    if (this.AsR != 0L)
      paramJceOutputStream.write(this.AsR, 8);
    if (this.AsS != null)
      paramJceOutputStream.write(this.AsS, 9);
    if (this.AsT != 0)
      paramJceOutputStream.write(this.AsT, 10);
    if (this.AsU != 0)
      paramJceOutputStream.write(this.AsU, 11);
    AppMethodBeat.o(114496);
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.d.c.b.c
 * JD-Core Version:    0.6.2
 */