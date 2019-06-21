package com.tencent.mm.plugin.backup.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class k extends com.tencent.mm.bt.a
{
  public int jBA;
  public String jBB;
  public int jBz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(18057);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.jBB == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: UserName");
        AppMethodBeat.o(18057);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.jBz);
      paramArrayOfObject.iz(2, this.jBA);
      if (this.jBB != null)
        paramArrayOfObject.e(3, this.jBB);
      AppMethodBeat.o(18057);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.jBz) + 0 + e.a.a.b.b.a.bs(2, this.jBA);
        paramInt = i;
        if (this.jBB != null)
          paramInt = i + e.a.a.b.b.a.f(3, this.jBB);
        AppMethodBeat.o(18057);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.jBB == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: UserName");
          AppMethodBeat.o(18057);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(18057);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        k localk = (k)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(18057);
          break;
        case 1:
          localk.jBz = locala.BTU.vd();
          AppMethodBeat.o(18057);
          paramInt = 0;
          break;
        case 2:
          localk.jBA = locala.BTU.vd();
          AppMethodBeat.o(18057);
          paramInt = 0;
          break;
        case 3:
          localk.jBB = locala.BTU.readString();
          AppMethodBeat.o(18057);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(18057);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.i.k
 * JD-Core Version:    0.6.2
 */