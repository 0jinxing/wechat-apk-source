package com.tencent.mm.plugin.wallet.a;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class f extends com.tencent.mm.bt.a
{
  public String tmO;
  public String tmP;
  public String tmQ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56647);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.tmO != null)
        paramArrayOfObject.e(1, this.tmO);
      if (this.tmP != null)
        paramArrayOfObject.e(2, this.tmP);
      if (this.tmQ != null)
        paramArrayOfObject.e(3, this.tmQ);
      AppMethodBeat.o(56647);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.tmO == null)
        break label357;
    label357: for (i = e.a.a.b.b.a.f(1, this.tmO) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.tmP != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.tmP);
      i = paramInt;
      if (this.tmQ != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.tmQ);
      AppMethodBeat.o(56647);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56647);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        f localf = (f)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56647);
          break;
        case 1:
          localf.tmO = locala.BTU.readString();
          AppMethodBeat.o(56647);
          paramInt = i;
          break;
        case 2:
          localf.tmP = locala.BTU.readString();
          AppMethodBeat.o(56647);
          paramInt = i;
          break;
        case 3:
          localf.tmQ = locala.BTU.readString();
          AppMethodBeat.o(56647);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56647);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.wallet.a.f
 * JD-Core Version:    0.6.2
 */