package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class aug extends com.tencent.mm.bt.a
{
  public int cts;
  public int wyf;
  public int wyg;
  public int wyh;
  public int wyi;
  public int wyj;
  public int wyk;
  public int wyl;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(72857);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.wyf);
      paramArrayOfObject.iz(2, this.cts);
      paramArrayOfObject.iz(3, this.wyg);
      paramArrayOfObject.iz(4, this.wyh);
      paramArrayOfObject.iz(5, this.wyi);
      paramArrayOfObject.iz(6, this.wyj);
      paramArrayOfObject.iz(7, this.wyk);
      paramArrayOfObject.iz(8, this.wyl);
      AppMethodBeat.o(72857);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.wyf) + 0 + e.a.a.b.b.a.bs(2, this.cts) + e.a.a.b.b.a.bs(3, this.wyg) + e.a.a.b.b.a.bs(4, this.wyh) + e.a.a.b.b.a.bs(5, this.wyi) + e.a.a.b.b.a.bs(6, this.wyj) + e.a.a.b.b.a.bs(7, this.wyk) + e.a.a.b.b.a.bs(8, this.wyl);
        AppMethodBeat.o(72857);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(72857);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        aug localaug = (aug)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(72857);
          break;
        case 1:
          localaug.wyf = locala.BTU.vd();
          AppMethodBeat.o(72857);
          paramInt = 0;
          break;
        case 2:
          localaug.cts = locala.BTU.vd();
          AppMethodBeat.o(72857);
          paramInt = 0;
          break;
        case 3:
          localaug.wyg = locala.BTU.vd();
          AppMethodBeat.o(72857);
          paramInt = 0;
          break;
        case 4:
          localaug.wyh = locala.BTU.vd();
          AppMethodBeat.o(72857);
          paramInt = 0;
          break;
        case 5:
          localaug.wyi = locala.BTU.vd();
          AppMethodBeat.o(72857);
          paramInt = 0;
          break;
        case 6:
          localaug.wyj = locala.BTU.vd();
          AppMethodBeat.o(72857);
          paramInt = 0;
          break;
        case 7:
          localaug.wyk = locala.BTU.vd();
          AppMethodBeat.o(72857);
          paramInt = 0;
          break;
        case 8:
          localaug.wyl = locala.BTU.vd();
          AppMethodBeat.o(72857);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(72857);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aug
 * JD-Core Version:    0.6.2
 */