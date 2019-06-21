package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cai extends com.tencent.mm.bt.a
{
  public cbf wZu;
  public bts wZv;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(94558);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wZu == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: SnsObject");
        AppMethodBeat.o(94558);
        throw paramArrayOfObject;
      }
      if (this.wZu != null)
      {
        paramArrayOfObject.iy(1, this.wZu.computeSize());
        this.wZu.writeFields(paramArrayOfObject);
      }
      if (this.wZv != null)
      {
        paramArrayOfObject.iy(2, this.wZv.computeSize());
        this.wZv.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(94558);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wZu == null)
        break label532;
    label532: for (i = e.a.a.a.ix(1, this.wZu.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wZv != null)
        paramInt = i + e.a.a.a.ix(2, this.wZv.computeSize());
      AppMethodBeat.o(94558);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wZu == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: SnsObject");
          AppMethodBeat.o(94558);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(94558);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cai localcai = (cai)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          AppMethodBeat.o(94558);
          paramInt = -1;
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cbf();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cbf)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcai.wZu = ((cbf)localObject1);
          }
          AppMethodBeat.o(94558);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcai.wZv = ((bts)localObject1);
          }
          AppMethodBeat.o(94558);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(94558);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cai
 * JD-Core Version:    0.6.2
 */