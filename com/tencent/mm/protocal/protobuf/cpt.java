package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cpt extends com.tencent.mm.bt.a
{
  public int jCt;
  public int xnH;
  public int xnI;
  public int xnJ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(5257);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.jCt);
      paramArrayOfObject.iz(2, this.xnH);
      paramArrayOfObject.iz(3, this.xnI);
      paramArrayOfObject.iz(4, this.xnJ);
      AppMethodBeat.o(5257);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.jCt) + 0 + e.a.a.b.b.a.bs(2, this.xnH) + e.a.a.b.b.a.bs(3, this.xnI) + e.a.a.b.b.a.bs(4, this.xnJ);
        AppMethodBeat.o(5257);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(5257);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cpt localcpt = (cpt)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(5257);
          break;
        case 1:
          localcpt.jCt = locala.BTU.vd();
          AppMethodBeat.o(5257);
          paramInt = 0;
          break;
        case 2:
          localcpt.xnH = locala.BTU.vd();
          AppMethodBeat.o(5257);
          paramInt = 0;
          break;
        case 3:
          localcpt.xnI = locala.BTU.vd();
          AppMethodBeat.o(5257);
          paramInt = 0;
          break;
        case 4:
          localcpt.xnJ = locala.BTU.vd();
          AppMethodBeat.o(5257);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(5257);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cpt
 * JD-Core Version:    0.6.2
 */