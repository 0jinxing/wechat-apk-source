package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bxk extends com.tencent.mm.bt.a
{
  public int wXr;
  public int wXs;
  public int wXt;
  public int wXu;
  public int wXv;
  public int wXw;
  public int wXx;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(11805);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.wXr);
      paramArrayOfObject.iz(2, this.wXs);
      paramArrayOfObject.iz(3, this.wXt);
      paramArrayOfObject.iz(4, this.wXu);
      paramArrayOfObject.iz(5, this.wXv);
      paramArrayOfObject.iz(6, this.wXw);
      paramArrayOfObject.iz(7, this.wXx);
      AppMethodBeat.o(11805);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.wXr) + 0 + e.a.a.b.b.a.bs(2, this.wXs) + e.a.a.b.b.a.bs(3, this.wXt) + e.a.a.b.b.a.bs(4, this.wXu) + e.a.a.b.b.a.bs(5, this.wXv) + e.a.a.b.b.a.bs(6, this.wXw) + e.a.a.b.b.a.bs(7, this.wXx);
        AppMethodBeat.o(11805);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(11805);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bxk localbxk = (bxk)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(11805);
          break;
        case 1:
          localbxk.wXr = locala.BTU.vd();
          AppMethodBeat.o(11805);
          paramInt = 0;
          break;
        case 2:
          localbxk.wXs = locala.BTU.vd();
          AppMethodBeat.o(11805);
          paramInt = 0;
          break;
        case 3:
          localbxk.wXt = locala.BTU.vd();
          AppMethodBeat.o(11805);
          paramInt = 0;
          break;
        case 4:
          localbxk.wXu = locala.BTU.vd();
          AppMethodBeat.o(11805);
          paramInt = 0;
          break;
        case 5:
          localbxk.wXv = locala.BTU.vd();
          AppMethodBeat.o(11805);
          paramInt = 0;
          break;
        case 6:
          localbxk.wXw = locala.BTU.vd();
          AppMethodBeat.o(11805);
          paramInt = 0;
          break;
        case 7:
          localbxk.wXx = locala.BTU.vd();
          AppMethodBeat.o(11805);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(11805);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bxk
 * JD-Core Version:    0.6.2
 */