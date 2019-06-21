package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class cwd extends com.tencent.mm.bt.a
{
  public String wsL;
  public String wsM;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(58941);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wsL != null)
        paramArrayOfObject.e(1, this.wsL);
      if (this.wsM != null)
        paramArrayOfObject.e(2, this.wsM);
      AppMethodBeat.o(58941);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wsL == null)
        break label290;
    label290: for (i = e.a.a.b.b.a.f(1, this.wsL) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wsM != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.wsM);
      AppMethodBeat.o(58941);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(58941);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cwd localcwd = (cwd)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(58941);
          paramInt = -1;
          break;
        case 1:
          localcwd.wsL = locala.BTU.readString();
          AppMethodBeat.o(58941);
          paramInt = i;
          break;
        case 2:
          localcwd.wsM = locala.BTU.readString();
          AppMethodBeat.o(58941);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(58941);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cwd
 * JD-Core Version:    0.6.2
 */