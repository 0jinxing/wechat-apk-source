package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class t extends com.tencent.mm.bt.a
{
  public String vAh;
  public long vAi;
  public int vAj;
  public long vzU;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56688);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vAh != null)
        paramArrayOfObject.e(1, this.vAh);
      paramArrayOfObject.ai(2, this.vzU);
      paramArrayOfObject.ai(3, this.vAi);
      paramArrayOfObject.iz(4, this.vAj);
      AppMethodBeat.o(56688);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vAh == null)
        break label364;
    label364: for (paramInt = e.a.a.b.b.a.f(1, this.vAh) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.o(2, this.vzU) + e.a.a.b.b.a.o(3, this.vAi) + e.a.a.b.b.a.bs(4, this.vAj);
      AppMethodBeat.o(56688);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56688);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        t localt = (t)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56688);
          break;
        case 1:
          localt.vAh = locala.BTU.readString();
          AppMethodBeat.o(56688);
          paramInt = i;
          break;
        case 2:
          localt.vzU = locala.BTU.ve();
          AppMethodBeat.o(56688);
          paramInt = i;
          break;
        case 3:
          localt.vAi = locala.BTU.ve();
          AppMethodBeat.o(56688);
          paramInt = i;
          break;
        case 4:
          localt.vAj = locala.BTU.vd();
          AppMethodBeat.o(56688);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56688);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.t
 * JD-Core Version:    0.6.2
 */