package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bkb extends com.tencent.mm.bt.a
{
  public String ncH;
  public String pcU;
  public String pcW;
  public int pcX;
  public String pcY;
  public int pcZ;
  public String pda;
  public int pdb;
  public int pdc;
  public String pde;
  public String pdf;
  public String pdg;
  public String pdh;
  public int wMU;
  public String wNg;
  public String wNh;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56917);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.pcU != null)
        paramArrayOfObject.e(1, this.pcU);
      paramArrayOfObject.iz(2, this.wMU);
      if (this.pcW != null)
        paramArrayOfObject.e(3, this.pcW);
      paramArrayOfObject.iz(4, this.pcX);
      if (this.pcY != null)
        paramArrayOfObject.e(5, this.pcY);
      paramArrayOfObject.iz(6, this.pcZ);
      if (this.pda != null)
        paramArrayOfObject.e(7, this.pda);
      paramArrayOfObject.iz(8, this.pdb);
      paramArrayOfObject.iz(9, this.pdc);
      if (this.ncH != null)
        paramArrayOfObject.e(11, this.ncH);
      if (this.pde != null)
        paramArrayOfObject.e(12, this.pde);
      if (this.pdf != null)
        paramArrayOfObject.e(13, this.pdf);
      if (this.pdg != null)
        paramArrayOfObject.e(14, this.pdg);
      if (this.pdh != null)
        paramArrayOfObject.e(15, this.pdh);
      if (this.wNg != null)
        paramArrayOfObject.e(18, this.wNg);
      if (this.wNh != null)
        paramArrayOfObject.e(19, this.wNh);
      AppMethodBeat.o(56917);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.pcU == null)
        break label1124;
    label1124: for (paramInt = e.a.a.b.b.a.f(1, this.pcU) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.wMU);
      paramInt = i;
      if (this.pcW != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.pcW);
      i = paramInt + e.a.a.b.b.a.bs(4, this.pcX);
      paramInt = i;
      if (this.pcY != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.pcY);
      i = paramInt + e.a.a.b.b.a.bs(6, this.pcZ);
      paramInt = i;
      if (this.pda != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.pda);
      i = paramInt + e.a.a.b.b.a.bs(8, this.pdb) + e.a.a.b.b.a.bs(9, this.pdc);
      paramInt = i;
      if (this.ncH != null)
        paramInt = i + e.a.a.b.b.a.f(11, this.ncH);
      i = paramInt;
      if (this.pde != null)
        i = paramInt + e.a.a.b.b.a.f(12, this.pde);
      paramInt = i;
      if (this.pdf != null)
        paramInt = i + e.a.a.b.b.a.f(13, this.pdf);
      i = paramInt;
      if (this.pdg != null)
        i = paramInt + e.a.a.b.b.a.f(14, this.pdg);
      paramInt = i;
      if (this.pdh != null)
        paramInt = i + e.a.a.b.b.a.f(15, this.pdh);
      i = paramInt;
      if (this.wNg != null)
        i = paramInt + e.a.a.b.b.a.f(18, this.wNg);
      paramInt = i;
      if (this.wNh != null)
        paramInt = i + e.a.a.b.b.a.f(19, this.wNh);
      AppMethodBeat.o(56917);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56917);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bkb localbkb = (bkb)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        case 10:
        case 16:
        case 17:
        default:
          paramInt = -1;
          AppMethodBeat.o(56917);
          break;
        case 1:
          localbkb.pcU = locala.BTU.readString();
          AppMethodBeat.o(56917);
          paramInt = i;
          break;
        case 2:
          localbkb.wMU = locala.BTU.vd();
          AppMethodBeat.o(56917);
          paramInt = i;
          break;
        case 3:
          localbkb.pcW = locala.BTU.readString();
          AppMethodBeat.o(56917);
          paramInt = i;
          break;
        case 4:
          localbkb.pcX = locala.BTU.vd();
          AppMethodBeat.o(56917);
          paramInt = i;
          break;
        case 5:
          localbkb.pcY = locala.BTU.readString();
          AppMethodBeat.o(56917);
          paramInt = i;
          break;
        case 6:
          localbkb.pcZ = locala.BTU.vd();
          AppMethodBeat.o(56917);
          paramInt = i;
          break;
        case 7:
          localbkb.pda = locala.BTU.readString();
          AppMethodBeat.o(56917);
          paramInt = i;
          break;
        case 8:
          localbkb.pdb = locala.BTU.vd();
          AppMethodBeat.o(56917);
          paramInt = i;
          break;
        case 9:
          localbkb.pdc = locala.BTU.vd();
          AppMethodBeat.o(56917);
          paramInt = i;
          break;
        case 11:
          localbkb.ncH = locala.BTU.readString();
          AppMethodBeat.o(56917);
          paramInt = i;
          break;
        case 12:
          localbkb.pde = locala.BTU.readString();
          AppMethodBeat.o(56917);
          paramInt = i;
          break;
        case 13:
          localbkb.pdf = locala.BTU.readString();
          AppMethodBeat.o(56917);
          paramInt = i;
          break;
        case 14:
          localbkb.pdg = locala.BTU.readString();
          AppMethodBeat.o(56917);
          paramInt = i;
          break;
        case 15:
          localbkb.pdh = locala.BTU.readString();
          AppMethodBeat.o(56917);
          paramInt = i;
          break;
        case 18:
          localbkb.wNg = locala.BTU.readString();
          AppMethodBeat.o(56917);
          paramInt = i;
          break;
        case 19:
          localbkb.wNh = locala.BTU.readString();
          AppMethodBeat.o(56917);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56917);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bkb
 * JD-Core Version:    0.6.2
 */