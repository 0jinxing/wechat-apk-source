package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cf extends com.tencent.mm.bt.a
{
  public String Title;
  public String naq;
  public LinkedList<cl> ncS;

  public cf()
  {
    AppMethodBeat.i(111641);
    this.ncS = new LinkedList();
    AppMethodBeat.o(111641);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111642);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.Title == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Title");
        AppMethodBeat.o(111642);
        throw paramArrayOfObject;
      }
      if (this.naq == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Detail");
        AppMethodBeat.o(111642);
        throw paramArrayOfObject;
      }
      if (this.Title != null)
        paramArrayOfObject.e(1, this.Title);
      paramArrayOfObject.e(2, 8, this.ncS);
      if (this.naq != null)
        paramArrayOfObject.e(3, this.naq);
      AppMethodBeat.o(111642);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.Title == null)
        break label533;
    label533: for (paramInt = e.a.a.b.b.a.f(1, this.Title) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.a.c(2, 8, this.ncS);
      paramInt = i;
      if (this.naq != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.naq);
      AppMethodBeat.o(111642);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.ncS.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.Title == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Title");
          AppMethodBeat.o(111642);
          throw paramArrayOfObject;
        }
        if (this.naq == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Detail");
          AppMethodBeat.o(111642);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(111642);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cf localcf = (cf)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111642);
          break;
        case 1:
          localcf.Title = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111642);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcf.ncS.add(paramArrayOfObject);
          }
          AppMethodBeat.o(111642);
          paramInt = i;
          break;
        case 3:
          localcf.naq = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111642);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111642);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.cf
 * JD-Core Version:    0.6.2
 */