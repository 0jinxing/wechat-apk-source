package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class aq extends com.tencent.mm.bt.a
{
  public String kcU;
  public String kcV;
  public String kcW;
  public String kcX;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(89002);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.kcU != null)
        paramArrayOfObject.e(1, this.kcU);
      if (this.kcV != null)
        paramArrayOfObject.e(2, this.kcV);
      if (this.kcW != null)
        paramArrayOfObject.e(3, this.kcW);
      if (this.kcX != null)
        paramArrayOfObject.e(4, this.kcX);
      AppMethodBeat.o(89002);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.kcU == null)
        break label420;
    label420: for (paramInt = e.a.a.b.b.a.f(1, this.kcU) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.kcV != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.kcV);
      paramInt = i;
      if (this.kcW != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.kcW);
      i = paramInt;
      if (this.kcX != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.kcX);
      AppMethodBeat.o(89002);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(89002);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        aq localaq = (aq)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(89002);
          break;
        case 1:
          localaq.kcU = locala.BTU.readString();
          AppMethodBeat.o(89002);
          paramInt = i;
          break;
        case 2:
          localaq.kcV = locala.BTU.readString();
          AppMethodBeat.o(89002);
          paramInt = i;
          break;
        case 3:
          localaq.kcW = locala.BTU.readString();
          AppMethodBeat.o(89002);
          paramInt = i;
          break;
        case 4:
          localaq.kcX = locala.BTU.readString();
          AppMethodBeat.o(89002);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(89002);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aq
 * JD-Core Version:    0.6.2
 */