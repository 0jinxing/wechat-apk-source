package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cyf extends com.tencent.mm.bt.a
{
  public String ndR;
  public String ndT;
  public String ndU;
  public int ndV;
  public String vMJ;
  public int xtB;
  public String xtC;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(80213);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.xtB);
      if (this.vMJ != null)
        paramArrayOfObject.e(2, this.vMJ);
      if (this.ndR != null)
        paramArrayOfObject.e(3, this.ndR);
      if (this.xtC != null)
        paramArrayOfObject.e(4, this.xtC);
      if (this.ndT != null)
        paramArrayOfObject.e(5, this.ndT);
      if (this.ndU != null)
        paramArrayOfObject.e(6, this.ndU);
      paramArrayOfObject.iz(7, this.ndV);
      AppMethodBeat.o(80213);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.xtB) + 0;
        paramInt = i;
        if (this.vMJ != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.vMJ);
        i = paramInt;
        if (this.ndR != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.ndR);
        paramInt = i;
        if (this.xtC != null)
          paramInt = i + e.a.a.b.b.a.f(4, this.xtC);
        i = paramInt;
        if (this.ndT != null)
          i = paramInt + e.a.a.b.b.a.f(5, this.ndT);
        paramInt = i;
        if (this.ndU != null)
          paramInt = i + e.a.a.b.b.a.f(6, this.ndU);
        paramInt += e.a.a.b.b.a.bs(7, this.ndV);
        AppMethodBeat.o(80213);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(80213);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cyf localcyf = (cyf)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80213);
          break;
        case 1:
          localcyf.xtB = locala.BTU.vd();
          AppMethodBeat.o(80213);
          paramInt = 0;
          break;
        case 2:
          localcyf.vMJ = locala.BTU.readString();
          AppMethodBeat.o(80213);
          paramInt = 0;
          break;
        case 3:
          localcyf.ndR = locala.BTU.readString();
          AppMethodBeat.o(80213);
          paramInt = 0;
          break;
        case 4:
          localcyf.xtC = locala.BTU.readString();
          AppMethodBeat.o(80213);
          paramInt = 0;
          break;
        case 5:
          localcyf.ndT = locala.BTU.readString();
          AppMethodBeat.o(80213);
          paramInt = 0;
          break;
        case 6:
          localcyf.ndU = locala.BTU.readString();
          AppMethodBeat.o(80213);
          paramInt = 0;
          break;
        case 7:
          localcyf.ndV = locala.BTU.vd();
          AppMethodBeat.o(80213);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(80213);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cyf
 * JD-Core Version:    0.6.2
 */