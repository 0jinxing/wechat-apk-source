package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class axf extends com.tencent.mm.bt.a
{
  public String pXM;
  public String wBn;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28537);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.pXM != null)
        paramArrayOfObject.e(1, this.pXM);
      if (this.wBn != null)
        paramArrayOfObject.e(2, this.wBn);
      AppMethodBeat.o(28537);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.pXM == null)
        break label298;
    label298: for (i = e.a.a.b.b.a.f(1, this.pXM) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wBn != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.wBn);
      AppMethodBeat.o(28537);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28537);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        axf localaxf = (axf)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(28537);
          paramInt = -1;
          break;
        case 1:
          localaxf.pXM = locala.BTU.readString();
          AppMethodBeat.o(28537);
          paramInt = i;
          break;
        case 2:
          localaxf.wBn = locala.BTU.readString();
          AppMethodBeat.o(28537);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(28537);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.axf
 * JD-Core Version:    0.6.2
 */