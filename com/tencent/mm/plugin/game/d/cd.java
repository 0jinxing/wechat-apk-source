package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cd extends com.tencent.mm.bt.a
{
  public e mZk;
  public String ncR;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111639);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.mZk == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: AppItem");
        AppMethodBeat.o(111639);
        throw paramArrayOfObject;
      }
      if (this.ncR == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Rank");
        AppMethodBeat.o(111639);
        throw paramArrayOfObject;
      }
      if (this.mZk != null)
      {
        paramArrayOfObject.iy(1, this.mZk.computeSize());
        this.mZk.writeFields(paramArrayOfObject);
      }
      if (this.ncR != null)
        paramArrayOfObject.e(2, this.ncR);
      AppMethodBeat.o(111639);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.mZk == null)
        break label486;
    label486: for (paramInt = e.a.a.a.ix(1, this.mZk.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.ncR != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.ncR);
      AppMethodBeat.o(111639);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.mZk == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: AppItem");
          AppMethodBeat.o(111639);
          throw paramArrayOfObject;
        }
        if (this.ncR == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Rank");
          AppMethodBeat.o(111639);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(111639);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cd localcd = (cd)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          AppMethodBeat.o(111639);
          paramInt = -1;
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new e();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcd.mZk = paramArrayOfObject;
          }
          AppMethodBeat.o(111639);
          paramInt = i;
          break;
        case 2:
          localcd.ncR = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111639);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(111639);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.cd
 * JD-Core Version:    0.6.2
 */