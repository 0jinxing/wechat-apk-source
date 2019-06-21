package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ars extends com.tencent.mm.bt.a
{
  public int wvG;
  public int wvH;
  public boolean wvI;
  public boolean wvJ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(134433);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.wvG);
      paramArrayOfObject.iz(2, this.wvH);
      paramArrayOfObject.aO(3, this.wvI);
      paramArrayOfObject.aO(4, this.wvJ);
      AppMethodBeat.o(134433);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.wvG) + 0 + e.a.a.b.b.a.bs(2, this.wvH) + (e.a.a.b.b.a.fv(3) + 1) + (e.a.a.b.b.a.fv(4) + 1);
        AppMethodBeat.o(134433);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(134433);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ars localars = (ars)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(134433);
          break;
        case 1:
          localars.wvG = locala.BTU.vd();
          AppMethodBeat.o(134433);
          paramInt = 0;
          break;
        case 2:
          localars.wvH = locala.BTU.vd();
          AppMethodBeat.o(134433);
          paramInt = 0;
          break;
        case 3:
          localars.wvI = locala.BTU.ehX();
          AppMethodBeat.o(134433);
          paramInt = 0;
          break;
        case 4:
          localars.wvJ = locala.BTU.ehX();
          AppMethodBeat.o(134433);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(134433);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ars
 * JD-Core Version:    0.6.2
 */