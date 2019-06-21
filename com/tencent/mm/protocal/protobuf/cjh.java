package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cjh extends com.tencent.mm.bt.a
{
  public String content;
  public String title;
  public ayi xhU;
  public ayi xhV;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48978);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.title != null)
        paramArrayOfObject.e(1, this.title);
      if (this.content != null)
        paramArrayOfObject.e(2, this.content);
      if (this.xhU != null)
      {
        paramArrayOfObject.iy(3, this.xhU.computeSize());
        this.xhU.writeFields(paramArrayOfObject);
      }
      if (this.xhV != null)
      {
        paramArrayOfObject.iy(4, this.xhV.computeSize());
        this.xhV.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(48978);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.title == null)
        break label609;
    label609: for (i = e.a.a.b.b.a.f(1, this.title) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.content != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.content);
      i = paramInt;
      if (this.xhU != null)
        i = paramInt + e.a.a.a.ix(3, this.xhU.computeSize());
      paramInt = i;
      if (this.xhV != null)
        paramInt = i + e.a.a.a.ix(4, this.xhV.computeSize());
      AppMethodBeat.o(48978);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48978);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cjh localcjh = (cjh)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48978);
          break;
        case 1:
          localcjh.title = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48978);
          paramInt = i;
          break;
        case 2:
          localcjh.content = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48978);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new ayi();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcjh.xhU = paramArrayOfObject;
          }
          AppMethodBeat.o(48978);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new ayi();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ayi)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcjh.xhV = ((ayi)localObject1);
          }
          AppMethodBeat.o(48978);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48978);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cjh
 * JD-Core Version:    0.6.2
 */