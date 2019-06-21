package com.tencent.mm.protocal.b.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class a extends com.tencent.mm.bt.a
{
  public int actionType;
  public int id;
  public String vzG;
  public String vzH;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(105576);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vzG == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: btnStr");
        AppMethodBeat.o(105576);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.id);
      paramArrayOfObject.iz(2, this.actionType);
      if (this.vzG != null)
        paramArrayOfObject.e(3, this.vzG);
      if (this.vzH != null)
        paramArrayOfObject.e(4, this.vzH);
      AppMethodBeat.o(105576);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.id) + 0 + e.a.a.b.b.a.bs(2, this.actionType);
        paramInt = i;
        if (this.vzG != null)
          paramInt = i + e.a.a.b.b.a.f(3, this.vzG);
        i = paramInt;
        if (this.vzH != null)
          i = paramInt + e.a.a.b.b.a.f(4, this.vzH);
        AppMethodBeat.o(105576);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vzG == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: btnStr");
          AppMethodBeat.o(105576);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(105576);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        a locala1 = (a)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(105576);
          break;
        case 1:
          locala1.id = locala.BTU.vd();
          AppMethodBeat.o(105576);
          paramInt = 0;
          break;
        case 2:
          locala1.actionType = locala.BTU.vd();
          AppMethodBeat.o(105576);
          paramInt = 0;
          break;
        case 3:
          locala1.vzG = locala.BTU.readString();
          AppMethodBeat.o(105576);
          paramInt = 0;
          break;
        case 4:
          locala1.vzH = locala.BTU.readString();
          AppMethodBeat.o(105576);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(105576);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.b.a.a
 * JD-Core Version:    0.6.2
 */