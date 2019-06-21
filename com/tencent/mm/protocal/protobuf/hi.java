package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class hi extends com.tencent.mm.bt.a
{
  public int cIb;
  public String eCq;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48779);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.eCq == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: uuid");
        AppMethodBeat.o(48779);
        throw paramArrayOfObject;
      }
      if (this.eCq != null)
        paramArrayOfObject.e(1, this.eCq);
      paramArrayOfObject.iz(2, this.cIb);
      AppMethodBeat.o(48779);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.eCq == null)
        break label322;
    label322: for (paramInt = e.a.a.b.b.a.f(1, this.eCq) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.b.b.a.bs(2, this.cIb);
      AppMethodBeat.o(48779);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.eCq == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: uuid");
          AppMethodBeat.o(48779);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(48779);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        hi localhi = (hi)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(48779);
          paramInt = -1;
          break;
        case 1:
          localhi.eCq = locala.BTU.readString();
          AppMethodBeat.o(48779);
          paramInt = i;
          break;
        case 2:
          localhi.cIb = locala.BTU.vd();
          AppMethodBeat.o(48779);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(48779);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.hi
 * JD-Core Version:    0.6.2
 */