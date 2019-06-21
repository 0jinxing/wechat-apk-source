package com.tencent.mm.protocal.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class l extends com.tencent.mm.bt.a
{
  public int action;
  public int vzp;
  public int vzq;
  public int vzr;
  public int vzs;
  public int vzt;
  public int vzu;
  public int vzv;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(72831);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.vzp);
      paramArrayOfObject.iz(2, this.action);
      paramArrayOfObject.iz(3, this.vzq);
      paramArrayOfObject.iz(4, this.vzr);
      paramArrayOfObject.iz(5, this.vzs);
      paramArrayOfObject.iz(6, this.vzt);
      paramArrayOfObject.iz(7, this.vzu);
      paramArrayOfObject.iz(8, this.vzv);
      AppMethodBeat.o(72831);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.vzp) + 0 + e.a.a.b.b.a.bs(2, this.action) + e.a.a.b.b.a.bs(3, this.vzq) + e.a.a.b.b.a.bs(4, this.vzr) + e.a.a.b.b.a.bs(5, this.vzs) + e.a.a.b.b.a.bs(6, this.vzt) + e.a.a.b.b.a.bs(7, this.vzu) + e.a.a.b.b.a.bs(8, this.vzv);
        AppMethodBeat.o(72831);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(72831);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        l locall = (l)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(72831);
          break;
        case 1:
          locall.vzp = locala.BTU.vd();
          AppMethodBeat.o(72831);
          paramInt = 0;
          break;
        case 2:
          locall.action = locala.BTU.vd();
          AppMethodBeat.o(72831);
          paramInt = 0;
          break;
        case 3:
          locall.vzq = locala.BTU.vd();
          AppMethodBeat.o(72831);
          paramInt = 0;
          break;
        case 4:
          locall.vzr = locala.BTU.vd();
          AppMethodBeat.o(72831);
          paramInt = 0;
          break;
        case 5:
          locall.vzs = locala.BTU.vd();
          AppMethodBeat.o(72831);
          paramInt = 0;
          break;
        case 6:
          locall.vzt = locala.BTU.vd();
          AppMethodBeat.o(72831);
          paramInt = 0;
          break;
        case 7:
          locall.vzu = locala.BTU.vd();
          AppMethodBeat.o(72831);
          paramInt = 0;
          break;
        case 8:
          locall.vzv = locala.BTU.vd();
          AppMethodBeat.o(72831);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(72831);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.a.a.l
 * JD-Core Version:    0.6.2
 */