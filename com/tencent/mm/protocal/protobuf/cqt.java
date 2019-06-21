package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;

public final class cqt extends com.tencent.mm.bt.a
{
  public int akv;
  public String category;
  public int fQi;
  public int wWK;
  public b wdt;
  public int xoy;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(102401);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.fQi);
      paramArrayOfObject.iz(2, this.akv);
      if (this.category != null)
        paramArrayOfObject.e(3, this.category);
      if (this.wdt != null)
        paramArrayOfObject.c(4, this.wdt);
      paramArrayOfObject.iz(5, this.wWK);
      paramArrayOfObject.iz(6, this.xoy);
      AppMethodBeat.o(102401);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.fQi) + 0 + e.a.a.b.b.a.bs(2, this.akv);
        paramInt = i;
        if (this.category != null)
          paramInt = i + e.a.a.b.b.a.f(3, this.category);
        i = paramInt;
        if (this.wdt != null)
          i = paramInt + e.a.a.b.b.a.b(4, this.wdt);
        paramInt = i + e.a.a.b.b.a.bs(5, this.wWK) + e.a.a.b.b.a.bs(6, this.xoy);
        AppMethodBeat.o(102401);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(102401);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cqt localcqt = (cqt)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(102401);
          break;
        case 1:
          localcqt.fQi = locala.BTU.vd();
          AppMethodBeat.o(102401);
          paramInt = 0;
          break;
        case 2:
          localcqt.akv = locala.BTU.vd();
          AppMethodBeat.o(102401);
          paramInt = 0;
          break;
        case 3:
          localcqt.category = locala.BTU.readString();
          AppMethodBeat.o(102401);
          paramInt = 0;
          break;
        case 4:
          localcqt.wdt = locala.BTU.emu();
          AppMethodBeat.o(102401);
          paramInt = 0;
          break;
        case 5:
          localcqt.wWK = locala.BTU.vd();
          AppMethodBeat.o(102401);
          paramInt = 0;
          break;
        case 6:
          localcqt.xoy = locala.BTU.vd();
          AppMethodBeat.o(102401);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(102401);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cqt
 * JD-Core Version:    0.6.2
 */