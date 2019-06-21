package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cy extends com.tencent.mm.bt.a
{
  public String Title;
  public LinkedList<an> mZK;
  public String naP;
  public String nbi;

  public cy()
  {
    AppMethodBeat.i(111665);
    this.mZK = new LinkedList();
    AppMethodBeat.o(111665);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111666);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.Title != null)
        paramArrayOfObject.e(1, this.Title);
      paramArrayOfObject.e(2, 8, this.mZK);
      if (this.naP != null)
        paramArrayOfObject.e(3, this.naP);
      if (this.nbi != null)
        paramArrayOfObject.e(4, this.nbi);
      AppMethodBeat.o(111666);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.Title == null)
        break label504;
    label504: for (paramInt = e.a.a.b.b.a.f(1, this.Title) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.a.c(2, 8, this.mZK);
      paramInt = i;
      if (this.naP != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.naP);
      i = paramInt;
      if (this.nbi != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.nbi);
      AppMethodBeat.o(111666);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.mZK.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(111666);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cy localcy = (cy)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111666);
          break;
        case 1:
          localcy.Title = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111666);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new an();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcy.mZK.add(paramArrayOfObject);
          }
          AppMethodBeat.o(111666);
          paramInt = i;
          break;
        case 3:
          localcy.naP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111666);
          paramInt = i;
          break;
        case 4:
          localcy.nbi = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111666);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111666);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.cy
 * JD-Core Version:    0.6.2
 */