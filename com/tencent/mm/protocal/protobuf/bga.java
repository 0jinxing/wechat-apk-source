package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bga extends com.tencent.mm.bt.a
{
  public String bfz;
  public String cFW;
  public String kfO;
  public String wJW;
  public String wJX;
  public int wJY;
  public String wJZ;
  public String wKa;
  public String wKb;
  public int wKc;
  public int wKd;
  public int wKe;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80126);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.bfz != null)
        paramArrayOfObject.e(1, this.bfz);
      if (this.wJW != null)
        paramArrayOfObject.e(2, this.wJW);
      if (this.wJX != null)
        paramArrayOfObject.e(3, this.wJX);
      paramArrayOfObject.iz(4, this.wJY);
      if (this.cFW != null)
        paramArrayOfObject.e(5, this.cFW);
      if (this.wJZ != null)
        paramArrayOfObject.e(6, this.wJZ);
      if (this.wKa != null)
        paramArrayOfObject.e(7, this.wKa);
      if (this.kfO != null)
        paramArrayOfObject.e(8, this.kfO);
      if (this.wKb != null)
        paramArrayOfObject.e(9, this.wKb);
      paramArrayOfObject.iz(10, this.wKc);
      paramArrayOfObject.iz(11, this.wKd);
      paramArrayOfObject.iz(12, this.wKe);
      AppMethodBeat.o(80126);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.bfz == null)
        break label868;
    label868: for (i = e.a.a.b.b.a.f(1, this.bfz) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wJW != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.wJW);
      i = paramInt;
      if (this.wJX != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wJX);
      i += e.a.a.b.b.a.bs(4, this.wJY);
      paramInt = i;
      if (this.cFW != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.cFW);
      i = paramInt;
      if (this.wJZ != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.wJZ);
      paramInt = i;
      if (this.wKa != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.wKa);
      i = paramInt;
      if (this.kfO != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.kfO);
      paramInt = i;
      if (this.wKb != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.wKb);
      paramInt = paramInt + e.a.a.b.b.a.bs(10, this.wKc) + e.a.a.b.b.a.bs(11, this.wKd) + e.a.a.b.b.a.bs(12, this.wKe);
      AppMethodBeat.o(80126);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(80126);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bga localbga = (bga)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80126);
          break;
        case 1:
          localbga.bfz = locala.BTU.readString();
          AppMethodBeat.o(80126);
          paramInt = i;
          break;
        case 2:
          localbga.wJW = locala.BTU.readString();
          AppMethodBeat.o(80126);
          paramInt = i;
          break;
        case 3:
          localbga.wJX = locala.BTU.readString();
          AppMethodBeat.o(80126);
          paramInt = i;
          break;
        case 4:
          localbga.wJY = locala.BTU.vd();
          AppMethodBeat.o(80126);
          paramInt = i;
          break;
        case 5:
          localbga.cFW = locala.BTU.readString();
          AppMethodBeat.o(80126);
          paramInt = i;
          break;
        case 6:
          localbga.wJZ = locala.BTU.readString();
          AppMethodBeat.o(80126);
          paramInt = i;
          break;
        case 7:
          localbga.wKa = locala.BTU.readString();
          AppMethodBeat.o(80126);
          paramInt = i;
          break;
        case 8:
          localbga.kfO = locala.BTU.readString();
          AppMethodBeat.o(80126);
          paramInt = i;
          break;
        case 9:
          localbga.wKb = locala.BTU.readString();
          AppMethodBeat.o(80126);
          paramInt = i;
          break;
        case 10:
          localbga.wKc = locala.BTU.vd();
          AppMethodBeat.o(80126);
          paramInt = i;
          break;
        case 11:
          localbga.wKd = locala.BTU.vd();
          AppMethodBeat.o(80126);
          paramInt = i;
          break;
        case 12:
          localbga.wKe = locala.BTU.vd();
          AppMethodBeat.o(80126);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80126);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bga
 * JD-Core Version:    0.6.2
 */