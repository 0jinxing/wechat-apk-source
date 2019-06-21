package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class atp extends com.tencent.mm.bt.a
{
  public String pXM;
  public String vMU;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80106);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vMU != null)
        paramArrayOfObject.e(1, this.vMU);
      if (this.pXM != null)
        paramArrayOfObject.e(2, this.pXM);
      AppMethodBeat.o(80106);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vMU == null)
        break label290;
    label290: for (i = e.a.a.b.b.a.f(1, this.vMU) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.pXM != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.pXM);
      AppMethodBeat.o(80106);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(80106);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        atp localatp = (atp)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(80106);
          paramInt = -1;
          break;
        case 1:
          localatp.vMU = locala.BTU.readString();
          AppMethodBeat.o(80106);
          paramInt = i;
          break;
        case 2:
          localatp.pXM = locala.BTU.readString();
          AppMethodBeat.o(80106);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(80106);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.atp
 * JD-Core Version:    0.6.2
 */