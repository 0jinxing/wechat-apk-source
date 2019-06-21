package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class cml extends com.tencent.mm.bt.a
{
  public String key;
  public long waD;
  public String waE;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(93800);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.key == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: key");
        AppMethodBeat.o(93800);
        throw paramArrayOfObject;
      }
      if (this.key != null)
        paramArrayOfObject.e(1, this.key);
      paramArrayOfObject.ai(2, this.waD);
      if (this.waE != null)
        paramArrayOfObject.e(3, this.waE);
      AppMethodBeat.o(93800);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.key == null)
        break label385;
    label385: for (paramInt = e.a.a.b.b.a.f(1, this.key) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.o(2, this.waD);
      paramInt = i;
      if (this.waE != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.waE);
      AppMethodBeat.o(93800);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.key == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: key");
          AppMethodBeat.o(93800);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(93800);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cml localcml = (cml)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(93800);
          break;
        case 1:
          localcml.key = locala.BTU.readString();
          AppMethodBeat.o(93800);
          paramInt = i;
          break;
        case 2:
          localcml.waD = locala.BTU.ve();
          AppMethodBeat.o(93800);
          paramInt = i;
          break;
        case 3:
          localcml.waE = locala.BTU.readString();
          AppMethodBeat.o(93800);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(93800);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cml
 * JD-Core Version:    0.6.2
 */