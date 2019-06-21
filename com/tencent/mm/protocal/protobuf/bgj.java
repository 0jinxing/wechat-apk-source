package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bgj extends com.tencent.mm.bt.a
{
  public String gfa;
  public int wKp;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80136);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.gfa != null)
        paramArrayOfObject.e(1, this.gfa);
      paramArrayOfObject.iz(2, this.wKp);
      AppMethodBeat.o(80136);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.gfa == null)
        break label274;
    label274: for (paramInt = e.a.a.b.b.a.f(1, this.gfa) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.b.b.a.bs(2, this.wKp);
      AppMethodBeat.o(80136);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(80136);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bgj localbgj = (bgj)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(80136);
          paramInt = -1;
          break;
        case 1:
          localbgj.gfa = locala.BTU.readString();
          AppMethodBeat.o(80136);
          paramInt = i;
          break;
        case 2:
          localbgj.wKp = locala.BTU.vd();
          AppMethodBeat.o(80136);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(80136);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bgj
 * JD-Core Version:    0.6.2
 */