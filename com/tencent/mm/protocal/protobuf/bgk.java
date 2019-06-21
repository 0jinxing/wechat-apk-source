package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class bgk extends com.tencent.mm.bt.a
{
  public String eoz;
  public String gfa;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80137);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.gfa != null)
        paramArrayOfObject.e(1, this.gfa);
      if (this.eoz != null)
        paramArrayOfObject.e(2, this.eoz);
      AppMethodBeat.o(80137);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.gfa == null)
        break label290;
    label290: for (i = e.a.a.b.b.a.f(1, this.gfa) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.eoz != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.eoz);
      AppMethodBeat.o(80137);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(80137);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        bgk localbgk = (bgk)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(80137);
          paramInt = -1;
          break;
        case 1:
          localbgk.gfa = locala.BTU.readString();
          AppMethodBeat.o(80137);
          paramInt = i;
          break;
        case 2:
          localbgk.eoz = locala.BTU.readString();
          AppMethodBeat.o(80137);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(80137);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bgk
 * JD-Core Version:    0.6.2
 */