package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bqw extends com.tencent.mm.bt.a
{
  public String jCH;
  public String luP;
  public String wGk;
  public String wTj;
  public String wTk;
  public String wTl;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(123515);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.jCH != null)
        paramArrayOfObject.e(1, this.jCH);
      if (this.wTj != null)
        paramArrayOfObject.e(2, this.wTj);
      if (this.wGk != null)
        paramArrayOfObject.e(3, this.wGk);
      if (this.wTk != null)
        paramArrayOfObject.e(4, this.wTk);
      if (this.luP != null)
        paramArrayOfObject.e(5, this.luP);
      if (this.wTl != null)
        paramArrayOfObject.e(6, this.wTl);
      AppMethodBeat.o(123515);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.jCH == null)
        break label550;
    label550: for (i = e.a.a.b.b.a.f(1, this.jCH) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wTj != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.wTj);
      int j = paramInt;
      if (this.wGk != null)
        j = paramInt + e.a.a.b.b.a.f(3, this.wGk);
      i = j;
      if (this.wTk != null)
        i = j + e.a.a.b.b.a.f(4, this.wTk);
      paramInt = i;
      if (this.luP != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.luP);
      i = paramInt;
      if (this.wTl != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.wTl);
      AppMethodBeat.o(123515);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(123515);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bqw localbqw = (bqw)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(123515);
          break;
        case 1:
          localbqw.jCH = locala.BTU.readString();
          AppMethodBeat.o(123515);
          paramInt = i;
          break;
        case 2:
          localbqw.wTj = locala.BTU.readString();
          AppMethodBeat.o(123515);
          paramInt = i;
          break;
        case 3:
          localbqw.wGk = locala.BTU.readString();
          AppMethodBeat.o(123515);
          paramInt = i;
          break;
        case 4:
          localbqw.wTk = locala.BTU.readString();
          AppMethodBeat.o(123515);
          paramInt = i;
          break;
        case 5:
          localbqw.luP = locala.BTU.readString();
          AppMethodBeat.o(123515);
          paramInt = i;
          break;
        case 6:
          localbqw.wTl = locala.BTU.readString();
          AppMethodBeat.o(123515);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(123515);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bqw
 * JD-Core Version:    0.6.2
 */