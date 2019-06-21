package com.tencent.mm.plugin.qqmail.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class o extends com.tencent.mm.bt.a
{
  public String nJq;
  public String name;
  public int puf;
  public int pug;
  public String puh;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(67960);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.name == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: name");
        AppMethodBeat.o(67960);
        throw paramArrayOfObject;
      }
      if (this.nJq == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: addr");
        AppMethodBeat.o(67960);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.puf);
      if (this.name != null)
        paramArrayOfObject.e(2, this.name);
      if (this.nJq != null)
        paramArrayOfObject.e(3, this.nJq);
      paramArrayOfObject.iz(4, this.pug);
      if (this.puh != null)
        paramArrayOfObject.e(5, this.puh);
      AppMethodBeat.o(67960);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.puf) + 0;
        paramInt = i;
        if (this.name != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.name);
        i = paramInt;
        if (this.nJq != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.nJq);
        i += e.a.a.b.b.a.bs(4, this.pug);
        paramInt = i;
        if (this.puh != null)
          paramInt = i + e.a.a.b.b.a.f(5, this.puh);
        AppMethodBeat.o(67960);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.name == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: name");
          AppMethodBeat.o(67960);
          throw paramArrayOfObject;
        }
        if (this.nJq == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: addr");
          AppMethodBeat.o(67960);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(67960);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        o localo = (o)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(67960);
          break;
        case 1:
          localo.puf = locala.BTU.vd();
          AppMethodBeat.o(67960);
          paramInt = 0;
          break;
        case 2:
          localo.name = locala.BTU.readString();
          AppMethodBeat.o(67960);
          paramInt = 0;
          break;
        case 3:
          localo.nJq = locala.BTU.readString();
          AppMethodBeat.o(67960);
          paramInt = 0;
          break;
        case 4:
          localo.pug = locala.BTU.vd();
          AppMethodBeat.o(67960);
          paramInt = 0;
          break;
        case 5:
          localo.puh = locala.BTU.readString();
          AppMethodBeat.o(67960);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(67960);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.b.o
 * JD-Core Version:    0.6.2
 */