package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bqr extends com.tencent.mm.bt.a
{
  public int wOl;
  public String wTb;
  public String wTc;
  public int wTd;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(56956);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.wOl);
      if (this.wTb != null)
        paramArrayOfObject.e(2, this.wTb);
      if (this.wTc != null)
        paramArrayOfObject.e(3, this.wTc);
      paramArrayOfObject.iz(4, this.wTd);
      AppMethodBeat.o(56956);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.wOl) + 0;
        paramInt = i;
        if (this.wTb != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.wTb);
        i = paramInt;
        if (this.wTc != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.wTc);
        paramInt = i + e.a.a.b.b.a.bs(4, this.wTd);
        AppMethodBeat.o(56956);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56956);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bqr localbqr = (bqr)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56956);
          break;
        case 1:
          localbqr.wOl = locala.BTU.vd();
          AppMethodBeat.o(56956);
          paramInt = 0;
          break;
        case 2:
          localbqr.wTb = locala.BTU.readString();
          AppMethodBeat.o(56956);
          paramInt = 0;
          break;
        case 3:
          localbqr.wTc = locala.BTU.readString();
          AppMethodBeat.o(56956);
          paramInt = 0;
          break;
        case 4:
          localbqr.wTd = locala.BTU.vd();
          AppMethodBeat.o(56956);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(56956);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bqr
 * JD-Core Version:    0.6.2
 */