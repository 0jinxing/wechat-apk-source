package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class mu extends com.tencent.mm.bt.a
{
  public String cJF;
  public String ubv;
  public String vQO;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48786);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vQO != null)
        paramArrayOfObject.e(1, this.vQO);
      if (this.ubv != null)
        paramArrayOfObject.e(2, this.ubv);
      if (this.cJF != null)
        paramArrayOfObject.e(3, this.cJF);
      AppMethodBeat.o(48786);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vQO == null)
        break label357;
    label357: for (i = e.a.a.b.b.a.f(1, this.vQO) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.ubv != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.ubv);
      i = paramInt;
      if (this.cJF != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.cJF);
      AppMethodBeat.o(48786);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48786);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        mu localmu = (mu)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48786);
          break;
        case 1:
          localmu.vQO = locala.BTU.readString();
          AppMethodBeat.o(48786);
          paramInt = i;
          break;
        case 2:
          localmu.ubv = locala.BTU.readString();
          AppMethodBeat.o(48786);
          paramInt = i;
          break;
        case 3:
          localmu.cJF = locala.BTU.readString();
          AppMethodBeat.o(48786);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48786);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.mu
 * JD-Core Version:    0.6.2
 */