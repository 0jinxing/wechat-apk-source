package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class boo extends com.tencent.mm.bt.a
{
  public String info;
  public int wcL;
  public int wcM;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(94551);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.wcL);
      paramArrayOfObject.iz(2, this.wcM);
      if (this.info != null)
        paramArrayOfObject.e(3, this.info);
      AppMethodBeat.o(94551);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.wcL) + 0 + e.a.a.b.b.a.bs(2, this.wcM);
        paramInt = i;
        if (this.info != null)
          paramInt = i + e.a.a.b.b.a.f(3, this.info);
        AppMethodBeat.o(94551);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(94551);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        boo localboo = (boo)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(94551);
          break;
        case 1:
          localboo.wcL = locala.BTU.vd();
          AppMethodBeat.o(94551);
          paramInt = 0;
          break;
        case 2:
          localboo.wcM = locala.BTU.vd();
          AppMethodBeat.o(94551);
          paramInt = 0;
          break;
        case 3:
          localboo.info = locala.BTU.readString();
          AppMethodBeat.o(94551);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(94551);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.boo
 * JD-Core Version:    0.6.2
 */