package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class aua extends com.tencent.mm.bt.a
{
  public String eCq;
  public int major;
  public LinkedList<auc> wxZ;

  public aua()
  {
    AppMethodBeat.i(10192);
    this.wxZ = new LinkedList();
    AppMethodBeat.o(10192);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(10193);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.eCq != null)
        paramArrayOfObject.e(1, this.eCq);
      paramArrayOfObject.iz(2, this.major);
      paramArrayOfObject.e(3, 8, this.wxZ);
      AppMethodBeat.o(10193);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.eCq == null)
        break label431;
    label431: for (paramInt = e.a.a.b.b.a.f(1, this.eCq) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.major) + e.a.a.a.c(3, 8, this.wxZ);
      AppMethodBeat.o(10193);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wxZ.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(10193);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aua localaua = (aua)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(10193);
          break;
        case 1:
          localaua.eCq = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(10193);
          paramInt = i;
          break;
        case 2:
          localaua.major = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(10193);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new auc();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((auc)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaua.wxZ.add(localObject1);
          }
          AppMethodBeat.o(10193);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(10193);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aua
 * JD-Core Version:    0.6.2
 */