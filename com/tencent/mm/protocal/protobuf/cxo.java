package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cxo extends com.tencent.mm.bt.a
{
  public String session_id;
  public String xrS;
  public int xsP;
  public int xsQ;
  public String xsR;
  public int xsS;
  public boolean xsT = false;
  public boolean xsU = false;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(124389);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.xsP);
      paramArrayOfObject.iz(2, this.xsQ);
      if (this.session_id != null)
        paramArrayOfObject.e(3, this.session_id);
      if (this.xsR != null)
        paramArrayOfObject.e(4, this.xsR);
      if (this.xrS != null)
        paramArrayOfObject.e(5, this.xrS);
      paramArrayOfObject.iz(6, this.xsS);
      paramArrayOfObject.aO(7, this.xsT);
      paramArrayOfObject.aO(8, this.xsU);
      AppMethodBeat.o(124389);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.xsP) + 0 + e.a.a.b.b.a.bs(2, this.xsQ);
        paramInt = i;
        if (this.session_id != null)
          paramInt = i + e.a.a.b.b.a.f(3, this.session_id);
        i = paramInt;
        if (this.xsR != null)
          i = paramInt + e.a.a.b.b.a.f(4, this.xsR);
        paramInt = i;
        if (this.xrS != null)
          paramInt = i + e.a.a.b.b.a.f(5, this.xrS);
        paramInt = paramInt + e.a.a.b.b.a.bs(6, this.xsS) + (e.a.a.b.b.a.fv(7) + 1) + (e.a.a.b.b.a.fv(8) + 1);
        AppMethodBeat.o(124389);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(124389);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cxo localcxo = (cxo)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(124389);
          break;
        case 1:
          localcxo.xsP = locala.BTU.vd();
          AppMethodBeat.o(124389);
          paramInt = 0;
          break;
        case 2:
          localcxo.xsQ = locala.BTU.vd();
          AppMethodBeat.o(124389);
          paramInt = 0;
          break;
        case 3:
          localcxo.session_id = locala.BTU.readString();
          AppMethodBeat.o(124389);
          paramInt = 0;
          break;
        case 4:
          localcxo.xsR = locala.BTU.readString();
          AppMethodBeat.o(124389);
          paramInt = 0;
          break;
        case 5:
          localcxo.xrS = locala.BTU.readString();
          AppMethodBeat.o(124389);
          paramInt = 0;
          break;
        case 6:
          localcxo.xsS = locala.BTU.vd();
          AppMethodBeat.o(124389);
          paramInt = 0;
          break;
        case 7:
          localcxo.xsT = locala.BTU.ehX();
          AppMethodBeat.o(124389);
          paramInt = 0;
          break;
        case 8:
          localcxo.xsU = locala.BTU.ehX();
          AppMethodBeat.o(124389);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(124389);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cxo
 * JD-Core Version:    0.6.2
 */