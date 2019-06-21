package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;

public final class chg extends com.tencent.mm.bt.a
{
  public String kKZ;
  public String path;
  public int showType;
  public String title;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(80197);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.showType);
      if (this.title != null)
        paramArrayOfObject.e(2, this.title);
      if (this.kKZ != null)
        paramArrayOfObject.e(3, this.kKZ);
      if (this.path != null)
        paramArrayOfObject.e(4, this.path);
      AppMethodBeat.o(80197);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.showType) + 0;
        paramInt = i;
        if (this.title != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.title);
        i = paramInt;
        if (this.kKZ != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.kKZ);
        paramInt = i;
        if (this.path != null)
          paramInt = i + e.a.a.b.b.a.f(4, this.path);
        AppMethodBeat.o(80197);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(80197);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        chg localchg = (chg)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80197);
          break;
        case 1:
          localchg.showType = locala.BTU.vd();
          AppMethodBeat.o(80197);
          paramInt = 0;
          break;
        case 2:
          localchg.title = locala.BTU.readString();
          AppMethodBeat.o(80197);
          paramInt = 0;
          break;
        case 3:
          localchg.kKZ = locala.BTU.readString();
          AppMethodBeat.o(80197);
          paramInt = 0;
          break;
        case 4:
          localchg.path = locala.BTU.readString();
          AppMethodBeat.o(80197);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(80197);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.chg
 * JD-Core Version:    0.6.2
 */