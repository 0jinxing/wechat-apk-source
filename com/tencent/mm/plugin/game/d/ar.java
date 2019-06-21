package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class ar extends com.tencent.mm.bt.a
{
  public String naq;
  public LinkedList<String> nbh;

  public ar()
  {
    AppMethodBeat.i(111585);
    this.nbh = new LinkedList();
    AppMethodBeat.o(111585);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111586);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.naq == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Detail");
        AppMethodBeat.o(111586);
        throw paramArrayOfObject;
      }
      if (this.naq != null)
        paramArrayOfObject.e(2, this.naq);
      paramArrayOfObject.e(3, 1, this.nbh);
      AppMethodBeat.o(111586);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.naq == null)
        break label338;
    label338: for (paramInt = e.a.a.b.b.a.f(2, this.naq) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.a.c(3, 1, this.nbh);
      AppMethodBeat.o(111586);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.nbh.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.naq == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Detail");
          AppMethodBeat.o(111586);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(111586);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        e.a.a.a.a locala = (e.a.a.a.a)paramArrayOfObject[0];
        ar localar = (ar)paramArrayOfObject[1];
        switch (((Integer)paramArrayOfObject[2]).intValue())
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111586);
          break;
        case 2:
          localar.naq = locala.BTU.readString();
          AppMethodBeat.o(111586);
          paramInt = i;
          break;
        case 3:
          localar.nbh.add(locala.BTU.readString());
          AppMethodBeat.o(111586);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111586);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.ar
 * JD-Core Version:    0.6.2
 */