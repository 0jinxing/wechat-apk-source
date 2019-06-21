package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class acd extends com.tencent.mm.bt.a
{
  public String title;
  public String wjT;
  public LinkedList<ace> wjU;

  public acd()
  {
    AppMethodBeat.i(56793);
    this.wjU = new LinkedList();
    AppMethodBeat.o(56793);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56794);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.title != null)
        paramArrayOfObject.e(1, this.title);
      if (this.wjT != null)
        paramArrayOfObject.e(2, this.wjT);
      paramArrayOfObject.e(3, 8, this.wjU);
      AppMethodBeat.o(56794);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.title == null)
        break label437;
    label437: for (paramInt = e.a.a.b.b.a.f(1, this.title) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wjT != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wjT);
      paramInt = i + e.a.a.a.c(3, 8, this.wjU);
      AppMethodBeat.o(56794);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wjU.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56794);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        acd localacd = (acd)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56794);
          break;
        case 1:
          localacd.title = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56794);
          paramInt = i;
          break;
        case 2:
          localacd.wjT = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56794);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new ace();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localacd.wjU.add(paramArrayOfObject);
          }
          AppMethodBeat.o(56794);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56794);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.acd
 * JD-Core Version:    0.6.2
 */