package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class hf extends com.tencent.mm.bt.a
{
  public String vJP;
  public String vJQ;
  public String vJR;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(11694);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vJP != null)
        paramArrayOfObject.e(1, this.vJP);
      if (this.vJQ != null)
        paramArrayOfObject.e(2, this.vJQ);
      if (this.vJR != null)
        paramArrayOfObject.e(3, this.vJR);
      AppMethodBeat.o(11694);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vJP == null)
        break label366;
    label366: for (i = e.a.a.b.b.a.f(1, this.vJP) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vJQ != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.vJQ);
      i = paramInt;
      if (this.vJR != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vJR);
      AppMethodBeat.o(11694);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(11694);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        hf localhf = (hf)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(11694);
          break;
        case 1:
          localhf.vJP = locala.BTU.readString();
          AppMethodBeat.o(11694);
          paramInt = i;
          break;
        case 2:
          localhf.vJQ = locala.BTU.readString();
          AppMethodBeat.o(11694);
          paramInt = i;
          break;
        case 3:
          localhf.vJR = locala.BTU.readString();
          AppMethodBeat.o(11694);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(11694);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.hf
 * JD-Core Version:    0.6.2
 */