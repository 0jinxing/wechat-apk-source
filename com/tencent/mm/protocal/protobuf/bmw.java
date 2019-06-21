package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bmw extends com.tencent.mm.bt.a
{
  public int wPN;
  public String wdO;
  public int wep;
  public String wkk;
  public int wrw;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(73750);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.wrw);
      if (this.wkk != null)
        paramArrayOfObject.e(2, this.wkk);
      if (this.wdO != null)
        paramArrayOfObject.e(3, this.wdO);
      paramArrayOfObject.iz(4, this.wep);
      paramArrayOfObject.iz(5, this.wPN);
      AppMethodBeat.o(73750);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.wrw) + 0;
        paramInt = i;
        if (this.wkk != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.wkk);
        i = paramInt;
        if (this.wdO != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.wdO);
        paramInt = i + e.a.a.b.b.a.bs(4, this.wep) + e.a.a.b.b.a.bs(5, this.wPN);
        AppMethodBeat.o(73750);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(73750);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bmw localbmw = (bmw)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(73750);
          break;
        case 1:
          localbmw.wrw = locala.BTU.vd();
          AppMethodBeat.o(73750);
          paramInt = 0;
          break;
        case 2:
          localbmw.wkk = locala.BTU.readString();
          AppMethodBeat.o(73750);
          paramInt = 0;
          break;
        case 3:
          localbmw.wdO = locala.BTU.readString();
          AppMethodBeat.o(73750);
          paramInt = 0;
          break;
        case 4:
          localbmw.wep = locala.BTU.vd();
          AppMethodBeat.o(73750);
          paramInt = 0;
          break;
        case 5:
          localbmw.wPN = locala.BTU.vd();
          AppMethodBeat.o(73750);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(73750);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bmw
 * JD-Core Version:    0.6.2
 */