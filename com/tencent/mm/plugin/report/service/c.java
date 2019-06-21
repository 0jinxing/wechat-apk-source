package com.tencent.mm.plugin.report.service;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class c extends com.tencent.mm.bt.a
{
  public int jCt;
  public boolean pXE;
  public int pXL;
  public String pXM;
  public boolean pXN;
  public boolean pXO;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(72718);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.pXM == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Value");
        AppMethodBeat.o(72718);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.pXL);
      if (this.pXM != null)
        paramArrayOfObject.e(2, this.pXM);
      paramArrayOfObject.aO(3, this.pXN);
      paramArrayOfObject.aO(4, this.pXE);
      paramArrayOfObject.iz(5, this.jCt);
      paramArrayOfObject.aO(6, this.pXO);
      AppMethodBeat.o(72718);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.pXL) + 0;
        paramInt = i;
        if (this.pXM != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.pXM);
        paramInt = paramInt + (e.a.a.b.b.a.fv(3) + 1) + (e.a.a.b.b.a.fv(4) + 1) + e.a.a.b.b.a.bs(5, this.jCt) + (e.a.a.b.b.a.fv(6) + 1);
        AppMethodBeat.o(72718);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.pXM == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Value");
          AppMethodBeat.o(72718);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(72718);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        c localc = (c)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(72718);
          break;
        case 1:
          localc.pXL = locala.BTU.vd();
          AppMethodBeat.o(72718);
          paramInt = 0;
          break;
        case 2:
          localc.pXM = locala.BTU.readString();
          AppMethodBeat.o(72718);
          paramInt = 0;
          break;
        case 3:
          localc.pXN = locala.BTU.ehX();
          AppMethodBeat.o(72718);
          paramInt = 0;
          break;
        case 4:
          localc.pXE = locala.BTU.ehX();
          AppMethodBeat.o(72718);
          paramInt = 0;
          break;
        case 5:
          localc.jCt = locala.BTU.vd();
          AppMethodBeat.o(72718);
          paramInt = 0;
          break;
        case 6:
          localc.pXO = locala.BTU.ehX();
          AppMethodBeat.o(72718);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(72718);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.report.service.c
 * JD-Core Version:    0.6.2
 */