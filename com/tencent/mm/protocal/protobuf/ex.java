package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class ex extends com.tencent.mm.bt.a
{
  public int vGO;
  public String vGP;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(96193);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.vGO);
      if (this.vGP != null)
        paramArrayOfObject.e(2, this.vGP);
      AppMethodBeat.o(96193);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.vGO) + 0;
        paramInt = i;
        if (this.vGP != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.vGP);
        AppMethodBeat.o(96193);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(96193);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ex localex = (ex)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(96193);
          paramInt = -1;
          break;
        case 1:
          localex.vGO = locala.BTU.vd();
          AppMethodBeat.o(96193);
          paramInt = 0;
          break;
        case 2:
          localex.vGP = locala.BTU.readString();
          AppMethodBeat.o(96193);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(96193);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ex
 * JD-Core Version:    0.6.2
 */