package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class xy extends com.tencent.mm.bt.a
{
  public String cvZ;
  public String name;
  public cnw wdG;
  public cnw wdH;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(2531);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.cvZ == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: md5");
        AppMethodBeat.o(2531);
        throw paramArrayOfObject;
      }
      if (this.wdG == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: editorMatrix");
        AppMethodBeat.o(2531);
        throw paramArrayOfObject;
      }
      if (this.wdH == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: showMatrix");
        AppMethodBeat.o(2531);
        throw paramArrayOfObject;
      }
      if (this.cvZ != null)
        paramArrayOfObject.e(1, this.cvZ);
      if (this.name != null)
        paramArrayOfObject.e(2, this.name);
      if (this.wdG != null)
      {
        paramArrayOfObject.iy(3, this.wdG.computeSize());
        this.wdG.writeFields(paramArrayOfObject);
      }
      if (this.wdH != null)
      {
        paramArrayOfObject.iy(4, this.wdH.computeSize());
        this.wdH.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(2531);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.cvZ == null)
        break label767;
    label767: for (i = e.a.a.b.b.a.f(1, this.cvZ) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.name != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.name);
      i = paramInt;
      if (this.wdG != null)
        i = paramInt + e.a.a.a.ix(3, this.wdG.computeSize());
      paramInt = i;
      if (this.wdH != null)
        paramInt = i + e.a.a.a.ix(4, this.wdH.computeSize());
      AppMethodBeat.o(2531);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.cvZ == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: md5");
          AppMethodBeat.o(2531);
          throw paramArrayOfObject;
        }
        if (this.wdG == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: editorMatrix");
          AppMethodBeat.o(2531);
          throw paramArrayOfObject;
        }
        if (this.wdH == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: showMatrix");
          AppMethodBeat.o(2531);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(2531);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        xy localxy = (xy)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(2531);
          break;
        case 1:
          localxy.cvZ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(2531);
          paramInt = i;
          break;
        case 2:
          localxy.name = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(2531);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cnw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localxy.wdG = paramArrayOfObject;
          }
          AppMethodBeat.o(2531);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cnw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cnw)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localxy.wdH = ((cnw)localObject1);
          }
          AppMethodBeat.o(2531);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(2531);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.xy
 * JD-Core Version:    0.6.2
 */