package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class at extends com.tencent.mm.bt.a
{
  public String fKh;
  public String vCs;
  public String vCt;
  public String vCu;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(94489);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.fKh != null)
        paramArrayOfObject.e(1, this.fKh);
      if (this.vCs != null)
        paramArrayOfObject.e(2, this.vCs);
      if (this.vCt != null)
        paramArrayOfObject.e(3, this.vCt);
      if (this.vCu != null)
        paramArrayOfObject.e(4, this.vCu);
      AppMethodBeat.o(94489);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.fKh == null)
        break label420;
    label420: for (paramInt = e.a.a.b.b.a.f(1, this.fKh) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vCs != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.vCs);
      paramInt = i;
      if (this.vCt != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.vCt);
      i = paramInt;
      if (this.vCu != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.vCu);
      AppMethodBeat.o(94489);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(94489);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        at localat = (at)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(94489);
          break;
        case 1:
          localat.fKh = locala.BTU.readString();
          AppMethodBeat.o(94489);
          paramInt = i;
          break;
        case 2:
          localat.vCs = locala.BTU.readString();
          AppMethodBeat.o(94489);
          paramInt = i;
          break;
        case 3:
          localat.vCt = locala.BTU.readString();
          AppMethodBeat.o(94489);
          paramInt = i;
          break;
        case 4:
          localat.vCu = locala.BTU.readString();
          AppMethodBeat.o(94489);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(94489);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.at
 * JD-Core Version:    0.6.2
 */