package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class um extends com.tencent.mm.bt.a
{
  public String tCl;
  public String twd;
  public String wca;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56768);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.twd != null)
        paramArrayOfObject.e(1, this.twd);
      if (this.tCl != null)
        paramArrayOfObject.e(2, this.tCl);
      if (this.wca != null)
        paramArrayOfObject.e(3, this.wca);
      AppMethodBeat.o(56768);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.twd == null)
        break label357;
    label357: for (i = e.a.a.b.b.a.f(1, this.twd) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.tCl != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.tCl);
      i = paramInt;
      if (this.wca != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wca);
      AppMethodBeat.o(56768);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56768);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        um localum = (um)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56768);
          break;
        case 1:
          localum.twd = locala.BTU.readString();
          AppMethodBeat.o(56768);
          paramInt = i;
          break;
        case 2:
          localum.tCl = locala.BTU.readString();
          AppMethodBeat.o(56768);
          paramInt = i;
          break;
        case 3:
          localum.wca = locala.BTU.readString();
          AppMethodBeat.o(56768);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56768);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.um
 * JD-Core Version:    0.6.2
 */