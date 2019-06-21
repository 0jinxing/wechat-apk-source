package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class as extends com.tencent.mm.bt.a
{
  public String Title;
  public LinkedList<y> mZK;
  public String naP;
  public String nbi;

  public as()
  {
    AppMethodBeat.i(111587);
    this.mZK = new LinkedList();
    AppMethodBeat.o(111587);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(111588);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.e(1, 8, this.mZK);
      if (this.Title != null)
        paramArrayOfObject.e(2, this.Title);
      if (this.naP != null)
        paramArrayOfObject.e(3, this.naP);
      if (this.nbi != null)
        paramArrayOfObject.e(4, this.nbi);
      AppMethodBeat.o(111588);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.a.c(1, 8, this.mZK) + 0;
        paramInt = i;
        if (this.Title != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.Title);
        i = paramInt;
        if (this.naP != null)
          i = paramInt + e.a.a.b.b.a.f(3, this.naP);
        paramInt = i;
        if (this.nbi != null)
          paramInt = i + e.a.a.b.b.a.f(4, this.nbi);
        AppMethodBeat.o(111588);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.mZK.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(111588);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        as localas = (as)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111588);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new y();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localas.mZK.add(paramArrayOfObject);
          }
          AppMethodBeat.o(111588);
          paramInt = 0;
          break;
        case 2:
          localas.Title = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111588);
          paramInt = 0;
          break;
        case 3:
          localas.naP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111588);
          paramInt = 0;
          break;
        case 4:
          localas.nbi = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111588);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(111588);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.as
 * JD-Core Version:    0.6.2
 */