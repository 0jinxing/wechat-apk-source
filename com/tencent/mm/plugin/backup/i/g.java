package com.tencent.mm.plugin.backup.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class g extends com.tencent.mm.bt.a
{
  public String jBt;
  public int jBu;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(18050);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.jBt == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BakChatName");
        AppMethodBeat.o(18050);
        throw paramArrayOfObject;
      }
      if (this.jBt != null)
        paramArrayOfObject.e(1, this.jBt);
      paramArrayOfObject.iz(2, this.jBu);
      AppMethodBeat.o(18050);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.jBt == null)
        break label334;
    label334: for (paramInt = e.a.a.b.b.a.f(1, this.jBt) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.b.b.a.bs(2, this.jBu);
      AppMethodBeat.o(18050);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.jBt == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BakChatName");
          AppMethodBeat.o(18050);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(18050);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        g localg = (g)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(18050);
          paramInt = -1;
          break;
        case 1:
          localg.jBt = locala.BTU.readString();
          AppMethodBeat.o(18050);
          paramInt = i;
          break;
        case 2:
          localg.jBu = locala.BTU.vd();
          AppMethodBeat.o(18050);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(18050);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.i.g
 * JD-Core Version:    0.6.2
 */