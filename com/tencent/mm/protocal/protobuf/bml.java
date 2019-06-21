package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bml extends com.tencent.mm.bt.a
{
  public int luT;
  public String luU;
  public int nwA;
  public String nwB;
  public int wPq;
  public int wPr;
  public int wPs;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28595);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.wPr);
      paramArrayOfObject.iz(2, this.wPs);
      paramArrayOfObject.iz(3, this.wPq);
      paramArrayOfObject.iz(4, this.luT);
      if (this.luU != null)
        paramArrayOfObject.e(5, this.luU);
      paramArrayOfObject.iz(6, this.nwA);
      if (this.nwB != null)
        paramArrayOfObject.e(7, this.nwB);
      AppMethodBeat.o(28595);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.wPr) + 0 + e.a.a.b.b.a.bs(2, this.wPs) + e.a.a.b.b.a.bs(3, this.wPq) + e.a.a.b.b.a.bs(4, this.luT);
        paramInt = i;
        if (this.luU != null)
          paramInt = i + e.a.a.b.b.a.f(5, this.luU);
        i = paramInt + e.a.a.b.b.a.bs(6, this.nwA);
        paramInt = i;
        if (this.nwB != null)
          paramInt = i + e.a.a.b.b.a.f(7, this.nwB);
        AppMethodBeat.o(28595);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28595);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bml localbml = (bml)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28595);
          break;
        case 1:
          localbml.wPr = locala.BTU.vd();
          AppMethodBeat.o(28595);
          paramInt = 0;
          break;
        case 2:
          localbml.wPs = locala.BTU.vd();
          AppMethodBeat.o(28595);
          paramInt = 0;
          break;
        case 3:
          localbml.wPq = locala.BTU.vd();
          AppMethodBeat.o(28595);
          paramInt = 0;
          break;
        case 4:
          localbml.luT = locala.BTU.vd();
          AppMethodBeat.o(28595);
          paramInt = 0;
          break;
        case 5:
          localbml.luU = locala.BTU.readString();
          AppMethodBeat.o(28595);
          paramInt = 0;
          break;
        case 6:
          localbml.nwA = locala.BTU.vd();
          AppMethodBeat.o(28595);
          paramInt = 0;
          break;
        case 7:
          localbml.nwB = locala.BTU.readString();
          AppMethodBeat.o(28595);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(28595);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bml
 * JD-Core Version:    0.6.2
 */