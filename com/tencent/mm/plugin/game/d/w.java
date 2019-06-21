package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class w extends com.tencent.mm.bt.a
{
  public String jBB;
  public String naq;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111560);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.jBB == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: UserName");
        AppMethodBeat.o(111560);
        throw paramArrayOfObject;
      }
      if (this.naq == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Detail");
        AppMethodBeat.o(111560);
        throw paramArrayOfObject;
      }
      if (this.jBB != null)
        paramArrayOfObject.e(1, this.jBB);
      if (this.naq != null)
        paramArrayOfObject.e(2, this.naq);
      AppMethodBeat.o(111560);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.jBB == null)
        break label390;
    label390: for (paramInt = e.a.a.b.b.a.f(1, this.jBB) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.naq != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.naq);
      AppMethodBeat.o(111560);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.jBB == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: UserName");
          AppMethodBeat.o(111560);
          throw paramArrayOfObject;
        }
        if (this.naq == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Detail");
          AppMethodBeat.o(111560);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(111560);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        w localw = (w)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(111560);
          paramInt = -1;
          break;
        case 1:
          localw.jBB = locala.BTU.readString();
          AppMethodBeat.o(111560);
          paramInt = i;
          break;
        case 2:
          localw.naq = locala.BTU.readString();
          AppMethodBeat.o(111560);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(111560);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.w
 * JD-Core Version:    0.6.2
 */