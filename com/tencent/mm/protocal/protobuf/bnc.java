package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bnc extends com.tencent.mm.bt.a
{
  public String data;
  public String kdG;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(89123);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.kdG != null)
        paramArrayOfObject.e(1, this.kdG);
      if (this.data != null)
        paramArrayOfObject.e(2, this.data);
      AppMethodBeat.o(89123);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.kdG == null)
        break label290;
    label290: for (i = e.a.a.b.b.a.f(1, this.kdG) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.data != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.data);
      AppMethodBeat.o(89123);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(89123);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bnc localbnc = (bnc)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(89123);
          paramInt = -1;
          break;
        case 1:
          localbnc.kdG = locala.BTU.readString();
          AppMethodBeat.o(89123);
          paramInt = i;
          break;
        case 2:
          localbnc.data = locala.BTU.readString();
          AppMethodBeat.o(89123);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(89123);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bnc
 * JD-Core Version:    0.6.2
 */