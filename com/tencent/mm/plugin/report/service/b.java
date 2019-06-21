package com.tencent.mm.plugin.report.service;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class b extends com.tencent.mm.bt.a
{
  public int ID;
  public int pXC;
  public int pXD;
  public boolean pXE;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(72702);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.ID);
      paramArrayOfObject.iz(2, this.pXC);
      paramArrayOfObject.iz(3, this.pXD);
      paramArrayOfObject.aO(4, this.pXE);
      AppMethodBeat.o(72702);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        paramInt = e.a.a.b.b.a.bs(1, this.ID) + 0 + e.a.a.b.b.a.bs(2, this.pXC) + e.a.a.b.b.a.bs(3, this.pXD) + (e.a.a.b.b.a.fv(4) + 1);
        AppMethodBeat.o(72702);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(72702);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        b localb = (b)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(72702);
          break;
        case 1:
          localb.ID = locala.BTU.vd();
          AppMethodBeat.o(72702);
          paramInt = 0;
          break;
        case 2:
          localb.pXC = locala.BTU.vd();
          AppMethodBeat.o(72702);
          paramInt = 0;
          break;
        case 3:
          localb.pXD = locala.BTU.vd();
          AppMethodBeat.o(72702);
          paramInt = 0;
          break;
        case 4:
          localb.pXE = locala.BTU.ehX();
          AppMethodBeat.o(72702);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(72702);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.report.service.b
 * JD-Core Version:    0.6.2
 */