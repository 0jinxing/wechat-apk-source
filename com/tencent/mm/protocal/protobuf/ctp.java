package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class ctp extends com.tencent.mm.bt.a
{
  public String Title;
  public String ncM;
  public int ndE;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28724);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.Title == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Title");
        AppMethodBeat.o(28724);
        throw paramArrayOfObject;
      }
      if (this.ncM == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Content");
        AppMethodBeat.o(28724);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.ndE);
      if (this.Title != null)
        paramArrayOfObject.e(2, this.Title);
      if (this.ncM != null)
        paramArrayOfObject.e(3, this.ncM);
      AppMethodBeat.o(28724);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.ndE) + 0;
        paramInt = i;
        if (this.Title != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.Title);
        i = paramInt;
        if (this.ncM != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.ncM);
        AppMethodBeat.o(28724);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.Title == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Title");
          AppMethodBeat.o(28724);
          throw paramArrayOfObject;
        }
        if (this.ncM == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Content");
          AppMethodBeat.o(28724);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28724);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ctp localctp = (ctp)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28724);
          break;
        case 1:
          localctp.ndE = locala.BTU.vd();
          AppMethodBeat.o(28724);
          paramInt = 0;
          break;
        case 2:
          localctp.Title = locala.BTU.readString();
          AppMethodBeat.o(28724);
          paramInt = 0;
          break;
        case 3:
          localctp.ncM = locala.BTU.readString();
          AppMethodBeat.o(28724);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(28724);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ctp
 * JD-Core Version:    0.6.2
 */