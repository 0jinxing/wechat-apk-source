package com.tencent.mm.plugin.backup.i;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class y extends com.tencent.mm.bt.a
{
  public int jBT;
  public int jCA;
  public int jCB;
  public String jCx;
  public int jCy;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(18073);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.jCx == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: DataID");
        AppMethodBeat.o(18073);
        throw paramArrayOfObject;
      }
      if (this.jCx != null)
        paramArrayOfObject.e(1, this.jCx);
      paramArrayOfObject.iz(2, this.jCy);
      paramArrayOfObject.iz(3, this.jCA);
      paramArrayOfObject.iz(4, this.jCB);
      paramArrayOfObject.iz(5, this.jBT);
      AppMethodBeat.o(18073);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.jCx == null)
        break label470;
    label470: for (paramInt = e.a.a.b.b.a.f(1, this.jCx) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.jCy) + e.a.a.b.b.a.bs(3, this.jCA) + e.a.a.b.b.a.bs(4, this.jCB) + e.a.a.b.b.a.bs(5, this.jBT);
      AppMethodBeat.o(18073);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.jCx == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: DataID");
          AppMethodBeat.o(18073);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(18073);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        y localy = (y)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(18073);
          break;
        case 1:
          localy.jCx = locala.BTU.readString();
          AppMethodBeat.o(18073);
          paramInt = i;
          break;
        case 2:
          localy.jCy = locala.BTU.vd();
          AppMethodBeat.o(18073);
          paramInt = i;
          break;
        case 3:
          localy.jCA = locala.BTU.vd();
          AppMethodBeat.o(18073);
          paramInt = i;
          break;
        case 4:
          localy.jCB = locala.BTU.vd();
          AppMethodBeat.o(18073);
          paramInt = i;
          break;
        case 5:
          localy.jBT = locala.BTU.vd();
          AppMethodBeat.o(18073);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(18073);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.backup.i.y
 * JD-Core Version:    0.6.2
 */