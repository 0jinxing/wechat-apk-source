package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class li extends com.tencent.mm.bt.a
{
  public String csB;
  public String kLN;
  public int qzj;
  public int vOO;
  public int vOP;
  public int vOQ;
  public String vOR;
  public int vOS;
  public int vOT;
  public int vOU;
  public String vOV;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(124290);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.csB != null)
        paramArrayOfObject.e(1, this.csB);
      paramArrayOfObject.iz(2, this.vOO);
      paramArrayOfObject.iz(3, this.vOP);
      if (this.kLN != null)
        paramArrayOfObject.e(4, this.kLN);
      paramArrayOfObject.iz(5, this.vOQ);
      if (this.vOR != null)
        paramArrayOfObject.e(6, this.vOR);
      paramArrayOfObject.iz(7, this.vOS);
      paramArrayOfObject.iz(8, this.vOT);
      paramArrayOfObject.iz(9, this.vOU);
      if (this.vOV != null)
        paramArrayOfObject.e(10, this.vOV);
      paramArrayOfObject.iz(15, this.qzj);
      AppMethodBeat.o(124290);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.csB == null)
        break label769;
    label769: for (paramInt = e.a.a.b.b.a.f(1, this.csB) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.vOO) + e.a.a.b.b.a.bs(3, this.vOP);
      paramInt = i;
      if (this.kLN != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.kLN);
      i = paramInt + e.a.a.b.b.a.bs(5, this.vOQ);
      paramInt = i;
      if (this.vOR != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.vOR);
      i = paramInt + e.a.a.b.b.a.bs(7, this.vOS) + e.a.a.b.b.a.bs(8, this.vOT) + e.a.a.b.b.a.bs(9, this.vOU);
      paramInt = i;
      if (this.vOV != null)
        paramInt = i + e.a.a.b.b.a.f(10, this.vOV);
      paramInt += e.a.a.b.b.a.bs(15, this.qzj);
      AppMethodBeat.o(124290);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(124290);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        li localli = (li)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        case 11:
        case 12:
        case 13:
        case 14:
        default:
          paramInt = -1;
          AppMethodBeat.o(124290);
          break;
        case 1:
          localli.csB = locala.BTU.readString();
          AppMethodBeat.o(124290);
          paramInt = i;
          break;
        case 2:
          localli.vOO = locala.BTU.vd();
          AppMethodBeat.o(124290);
          paramInt = i;
          break;
        case 3:
          localli.vOP = locala.BTU.vd();
          AppMethodBeat.o(124290);
          paramInt = i;
          break;
        case 4:
          localli.kLN = locala.BTU.readString();
          AppMethodBeat.o(124290);
          paramInt = i;
          break;
        case 5:
          localli.vOQ = locala.BTU.vd();
          AppMethodBeat.o(124290);
          paramInt = i;
          break;
        case 6:
          localli.vOR = locala.BTU.readString();
          AppMethodBeat.o(124290);
          paramInt = i;
          break;
        case 7:
          localli.vOS = locala.BTU.vd();
          AppMethodBeat.o(124290);
          paramInt = i;
          break;
        case 8:
          localli.vOT = locala.BTU.vd();
          AppMethodBeat.o(124290);
          paramInt = i;
          break;
        case 9:
          localli.vOU = locala.BTU.vd();
          AppMethodBeat.o(124290);
          paramInt = i;
          break;
        case 10:
          localli.vOV = locala.BTU.readString();
          AppMethodBeat.o(124290);
          paramInt = i;
          break;
        case 15:
          localli.qzj = locala.BTU.vd();
          AppMethodBeat.o(124290);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(124290);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.li
 * JD-Core Version:    0.6.2
 */