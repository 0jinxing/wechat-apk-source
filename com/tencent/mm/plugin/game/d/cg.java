package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class cg extends com.tencent.mm.bt.a
{
  public String Name;
  public String ncT;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111643);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.Name == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Name");
        AppMethodBeat.o(111643);
        throw paramArrayOfObject;
      }
      if (this.ncT == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Color");
        AppMethodBeat.o(111643);
        throw paramArrayOfObject;
      }
      if (this.Name != null)
        paramArrayOfObject.e(1, this.Name);
      if (this.ncT != null)
        paramArrayOfObject.e(2, this.ncT);
      AppMethodBeat.o(111643);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.Name == null)
        break label390;
    label390: for (paramInt = e.a.a.b.b.a.f(1, this.Name) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.ncT != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.ncT);
      AppMethodBeat.o(111643);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.Name == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Name");
          AppMethodBeat.o(111643);
          throw paramArrayOfObject;
        }
        if (this.ncT == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Color");
          AppMethodBeat.o(111643);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(111643);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        cg localcg = (cg)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(111643);
          paramInt = -1;
          break;
        case 1:
          localcg.Name = locala.BTU.readString();
          AppMethodBeat.o(111643);
          paramInt = i;
          break;
        case 2:
          localcg.ncT = locala.BTU.readString();
          AppMethodBeat.o(111643);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(111643);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.cg
 * JD-Core Version:    0.6.2
 */