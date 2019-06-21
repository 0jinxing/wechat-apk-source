package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;

public final class dc extends com.tencent.mm.bt.a
{
  public String Name;
  public int ncp;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(111670);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.Name == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Name");
        AppMethodBeat.o(111670);
        throw paramArrayOfObject;
      }
      paramArrayOfObject.iz(1, this.ncp);
      if (this.Name != null)
        paramArrayOfObject.e(2, this.Name);
      AppMethodBeat.o(111670);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      if (paramInt == 1)
      {
        int i = e.a.a.b.b.a.bs(1, this.ncp) + 0;
        paramInt = i;
        if (this.Name != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.Name);
        AppMethodBeat.o(111670);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.Name == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Name");
          AppMethodBeat.o(111670);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(111670);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        dc localdc = (dc)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          AppMethodBeat.o(111670);
          paramInt = -1;
          break;
        case 1:
          localdc.ncp = locala.BTU.vd();
          AppMethodBeat.o(111670);
          paramInt = 0;
          break;
        case 2:
          localdc.Name = locala.BTU.readString();
          AppMethodBeat.o(111670);
          paramInt = 0;
          break;
        }
      }
      else
      {
        AppMethodBeat.o(111670);
        paramInt = -1;
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.dc
 * JD-Core Version:    0.6.2
 */