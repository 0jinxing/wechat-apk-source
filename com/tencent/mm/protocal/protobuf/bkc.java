package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bkc extends com.tencent.mm.bt.a
{
  public String pbn;
  public String wNi;
  public String wNj;
  public String wNk;
  public String wNl;
  public boolean wNm;
  public String wNn;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48921);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wNi != null)
        paramArrayOfObject.e(1, this.wNi);
      if (this.wNj != null)
        paramArrayOfObject.e(2, this.wNj);
      if (this.pbn != null)
        paramArrayOfObject.e(3, this.pbn);
      if (this.wNk != null)
        paramArrayOfObject.e(4, this.wNk);
      if (this.wNl != null)
        paramArrayOfObject.e(5, this.wNl);
      paramArrayOfObject.aO(6, this.wNm);
      if (this.wNn != null)
        paramArrayOfObject.e(7, this.wNn);
      AppMethodBeat.o(48921);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wNi == null)
        break label593;
    label593: for (i = e.a.a.b.b.a.f(1, this.wNi) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wNj != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.wNj);
      i = paramInt;
      if (this.pbn != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.pbn);
      paramInt = i;
      if (this.wNk != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.wNk);
      i = paramInt;
      if (this.wNl != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.wNl);
      i += e.a.a.b.b.a.fv(6) + 1;
      paramInt = i;
      if (this.wNn != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.wNn);
      AppMethodBeat.o(48921);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48921);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bkc localbkc = (bkc)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48921);
          break;
        case 1:
          localbkc.wNi = locala.BTU.readString();
          AppMethodBeat.o(48921);
          paramInt = i;
          break;
        case 2:
          localbkc.wNj = locala.BTU.readString();
          AppMethodBeat.o(48921);
          paramInt = i;
          break;
        case 3:
          localbkc.pbn = locala.BTU.readString();
          AppMethodBeat.o(48921);
          paramInt = i;
          break;
        case 4:
          localbkc.wNk = locala.BTU.readString();
          AppMethodBeat.o(48921);
          paramInt = i;
          break;
        case 5:
          localbkc.wNl = locala.BTU.readString();
          AppMethodBeat.o(48921);
          paramInt = i;
          break;
        case 6:
          localbkc.wNm = locala.BTU.ehX();
          AppMethodBeat.o(48921);
          paramInt = i;
          break;
        case 7:
          localbkc.wNn = locala.BTU.readString();
          AppMethodBeat.o(48921);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48921);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bkc
 * JD-Core Version:    0.6.2
 */