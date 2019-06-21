package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;

public final class cqs extends com.tencent.mm.bt.a
{
  public int Cn;
  public String eCq;
  public b wdt;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(102400);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.Cn);
      if (this.eCq != null)
        paramArrayOfObject.e(2, this.eCq);
      if (this.wdt != null)
        paramArrayOfObject.c(3, this.wdt);
      AppMethodBeat.o(102400);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.Cn) + 0;
        paramInt = i;
        if (this.eCq != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.eCq);
        i = paramInt;
        if (this.wdt != null)
          i = paramInt + e.a.a.b.b.a.b(3, this.wdt);
        AppMethodBeat.o(102400);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(102400);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cqs localcqs = (cqs)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(102400);
          break;
        case 1:
          localcqs.Cn = locala.BTU.vd();
          AppMethodBeat.o(102400);
          paramInt = 0;
          break;
        case 2:
          localcqs.eCq = locala.BTU.readString();
          AppMethodBeat.o(102400);
          paramInt = 0;
          break;
        case 3:
          localcqs.wdt = locala.BTU.emu();
          AppMethodBeat.o(102400);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(102400);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cqs
 * JD-Core Version:    0.6.2
 */