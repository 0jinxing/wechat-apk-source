package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class cyl extends com.tencent.mm.bt.a
{
  public int score;
  public String title;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28774);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.title == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: title");
        AppMethodBeat.o(28774);
        throw paramArrayOfObject;
      }
      if (this.title != null)
        paramArrayOfObject.e(1, this.title);
      paramArrayOfObject.iz(2, this.score);
      AppMethodBeat.o(28774);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.title == null)
        break label334;
    label334: for (paramInt = e.a.a.b.b.a.f(1, this.title) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.b.b.a.bs(2, this.score);
      AppMethodBeat.o(28774);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.title == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: title");
          AppMethodBeat.o(28774);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28774);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cyl localcyl = (cyl)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(28774);
          paramInt = -1;
          break;
        case 1:
          localcyl.title = locala.BTU.readString();
          AppMethodBeat.o(28774);
          paramInt = i;
          break;
        case 2:
          localcyl.score = locala.BTU.vd();
          AppMethodBeat.o(28774);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(28774);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cyl
 * JD-Core Version:    0.6.2
 */