package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class y extends com.tencent.mm.bt.a
{
  public String Desc;
  public e mZk;
  public LinkedList<String> nar;
  public String nas;

  public y()
  {
    AppMethodBeat.i(111562);
    this.nar = new LinkedList();
    AppMethodBeat.o(111562);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111563);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.mZk != null)
      {
        paramArrayOfObject.iy(1, this.mZk.computeSize());
        this.mZk.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(2, 1, this.nar);
      if (this.nas != null)
        paramArrayOfObject.e(3, this.nas);
      if (this.Desc != null)
        paramArrayOfObject.e(4, this.Desc);
      AppMethodBeat.o(111563);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.mZk == null)
        break label517;
    label517: for (paramInt = e.a.a.a.ix(1, this.mZk.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.a.c(2, 1, this.nar);
      paramInt = i;
      if (this.nas != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.nas);
      i = paramInt;
      if (this.Desc != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.Desc);
      AppMethodBeat.o(111563);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.nar.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(111563);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        y localy = (y)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111563);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new e();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((e)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localy.mZk = ((e)localObject1);
          }
          AppMethodBeat.o(111563);
          paramInt = i;
          break;
        case 2:
          localy.nar.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(111563);
          paramInt = i;
          break;
        case 3:
          localy.nas = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111563);
          paramInt = i;
          break;
        case 4:
          localy.Desc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111563);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111563);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.y
 * JD-Core Version:    0.6.2
 */