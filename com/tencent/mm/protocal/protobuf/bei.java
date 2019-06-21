package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bei extends com.tencent.mm.bt.a
{
  public int jCt;
  public int wBd;
  public int wIq;
  public int wIr;
  public int wIs;
  public int wIt;
  public int wIu;
  public int wIv;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(72861);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.wBd);
      paramArrayOfObject.iz(2, this.wIq);
      paramArrayOfObject.iz(3, this.wIr);
      paramArrayOfObject.iz(4, this.wIs);
      paramArrayOfObject.iz(5, this.wIt);
      paramArrayOfObject.iz(6, this.wIu);
      paramArrayOfObject.iz(7, this.wIv);
      paramArrayOfObject.iz(8, this.jCt);
      AppMethodBeat.o(72861);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.wBd) + 0 + e.a.a.b.b.a.bs(2, this.wIq) + e.a.a.b.b.a.bs(3, this.wIr) + e.a.a.b.b.a.bs(4, this.wIs) + e.a.a.b.b.a.bs(5, this.wIt) + e.a.a.b.b.a.bs(6, this.wIu) + e.a.a.b.b.a.bs(7, this.wIv) + e.a.a.b.b.a.bs(8, this.jCt);
        AppMethodBeat.o(72861);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(72861);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bei localbei = (bei)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(72861);
          break;
        case 1:
          localbei.wBd = locala.BTU.vd();
          AppMethodBeat.o(72861);
          paramInt = 0;
          break;
        case 2:
          localbei.wIq = locala.BTU.vd();
          AppMethodBeat.o(72861);
          paramInt = 0;
          break;
        case 3:
          localbei.wIr = locala.BTU.vd();
          AppMethodBeat.o(72861);
          paramInt = 0;
          break;
        case 4:
          localbei.wIs = locala.BTU.vd();
          AppMethodBeat.o(72861);
          paramInt = 0;
          break;
        case 5:
          localbei.wIt = locala.BTU.vd();
          AppMethodBeat.o(72861);
          paramInt = 0;
          break;
        case 6:
          localbei.wIu = locala.BTU.vd();
          AppMethodBeat.o(72861);
          paramInt = 0;
          break;
        case 7:
          localbei.wIv = locala.BTU.vd();
          AppMethodBeat.o(72861);
          paramInt = 0;
          break;
        case 8:
          localbei.jCt = locala.BTU.vd();
          AppMethodBeat.o(72861);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(72861);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bei
 * JD-Core Version:    0.6.2
 */