package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class ae extends com.tencent.mm.bt.a
{
  public String Desc;
  public e mZk;
  public ag naM;
  public af naN;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111568);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.mZk == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: AppItem");
        AppMethodBeat.o(111568);
        throw paramArrayOfObject;
      }
      if (this.mZk != null)
      {
        paramArrayOfObject.iy(1, this.mZk.computeSize());
        this.mZk.writeFields(paramArrayOfObject);
      }
      if (this.naM != null)
      {
        paramArrayOfObject.iy(2, this.naM.computeSize());
        this.naM.writeFields(paramArrayOfObject);
      }
      if (this.naN != null)
      {
        paramArrayOfObject.iy(3, this.naN.computeSize());
        this.naN.writeFields(paramArrayOfObject);
      }
      if (this.Desc != null)
        paramArrayOfObject.e(4, this.Desc);
      AppMethodBeat.o(111568);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.mZk == null)
        break label752;
    label752: for (paramInt = e.a.a.a.ix(1, this.mZk.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.naM != null)
        i = paramInt + e.a.a.a.ix(2, this.naM.computeSize());
      paramInt = i;
      if (this.naN != null)
        paramInt = i + e.a.a.a.ix(3, this.naN.computeSize());
      i = paramInt;
      if (this.Desc != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.Desc);
      AppMethodBeat.o(111568);
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
          AppMethodBeat.o(111568);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(111568);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ae localae = (ae)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111568);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new e();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localae.mZk = paramArrayOfObject;
          }
          AppMethodBeat.o(111568);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new ag();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localae.naM = paramArrayOfObject;
          }
          AppMethodBeat.o(111568);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new af();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localae.naN = paramArrayOfObject;
          }
          AppMethodBeat.o(111568);
          paramInt = i;
          break;
        case 4:
          localae.Desc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111568);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111568);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.ae
 * JD-Core Version:    0.6.2
 */