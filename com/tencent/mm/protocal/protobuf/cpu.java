package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cpu extends com.tencent.mm.bt.a
{
  public String gDC;
  public String userName;
  public int xnK;
  public int xnL;
  public int xnM;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(5258);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.xnK);
      paramArrayOfObject.iz(2, this.xnL);
      paramArrayOfObject.iz(3, this.xnM);
      if (this.userName != null)
        paramArrayOfObject.e(4, this.userName);
      if (this.gDC != null)
        paramArrayOfObject.e(5, this.gDC);
      AppMethodBeat.o(5258);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.xnK) + 0 + e.a.a.b.b.a.bs(2, this.xnL) + e.a.a.b.b.a.bs(3, this.xnM);
        paramInt = i;
        if (this.userName != null)
          paramInt = i + e.a.a.b.b.a.f(4, this.userName);
        i = paramInt;
        if (this.gDC != null)
          i = paramInt + e.a.a.b.b.a.f(5, this.gDC);
        AppMethodBeat.o(5258);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(5258);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cpu localcpu = (cpu)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(5258);
          break;
        case 1:
          localcpu.xnK = locala.BTU.vd();
          AppMethodBeat.o(5258);
          paramInt = 0;
          break;
        case 2:
          localcpu.xnL = locala.BTU.vd();
          AppMethodBeat.o(5258);
          paramInt = 0;
          break;
        case 3:
          localcpu.xnM = locala.BTU.vd();
          AppMethodBeat.o(5258);
          paramInt = 0;
          break;
        case 4:
          localcpu.userName = locala.BTU.readString();
          AppMethodBeat.o(5258);
          paramInt = 0;
          break;
        case 5:
          localcpu.gDC = locala.BTU.readString();
          AppMethodBeat.o(5258);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(5258);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cpu
 * JD-Core Version:    0.6.2
 */