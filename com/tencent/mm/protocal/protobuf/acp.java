package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class acp extends com.tencent.mm.bt.a
{
  public int fQi = 0;
  public int wkl = 7;
  public long wkm = 0L;
  public int wkn = 0;
  public String wko = "";
  public String wkp = "";
  public boolean wkq = false;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(73650);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.wkl);
      paramArrayOfObject.ai(2, this.wkm);
      paramArrayOfObject.iz(3, this.wkn);
      if (this.wko != null)
        paramArrayOfObject.e(4, this.wko);
      if (this.wkp != null)
        paramArrayOfObject.e(5, this.wkp);
      paramArrayOfObject.iz(6, this.fQi);
      paramArrayOfObject.aO(7, this.wkq);
      AppMethodBeat.o(73650);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.wkl) + 0 + e.a.a.b.b.a.o(2, this.wkm) + e.a.a.b.b.a.bs(3, this.wkn);
        paramInt = i;
        if (this.wko != null)
          paramInt = i + e.a.a.b.b.a.f(4, this.wko);
        i = paramInt;
        if (this.wkp != null)
          i = paramInt + e.a.a.b.b.a.f(5, this.wkp);
        paramInt = i + e.a.a.b.b.a.bs(6, this.fQi) + (e.a.a.b.b.a.fv(7) + 1);
        AppMethodBeat.o(73650);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(73650);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        acp localacp = (acp)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(73650);
          break;
        case 1:
          localacp.wkl = locala.BTU.vd();
          AppMethodBeat.o(73650);
          paramInt = 0;
          break;
        case 2:
          localacp.wkm = locala.BTU.ve();
          AppMethodBeat.o(73650);
          paramInt = 0;
          break;
        case 3:
          localacp.wkn = locala.BTU.vd();
          AppMethodBeat.o(73650);
          paramInt = 0;
          break;
        case 4:
          localacp.wko = locala.BTU.readString();
          AppMethodBeat.o(73650);
          paramInt = 0;
          break;
        case 5:
          localacp.wkp = locala.BTU.readString();
          AppMethodBeat.o(73650);
          paramInt = 0;
          break;
        case 6:
          localacp.fQi = locala.BTU.vd();
          AppMethodBeat.o(73650);
          paramInt = 0;
          break;
        case 7:
          localacp.wkq = locala.BTU.ehX();
          AppMethodBeat.o(73650);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(73650);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.acp
 * JD-Core Version:    0.6.2
 */