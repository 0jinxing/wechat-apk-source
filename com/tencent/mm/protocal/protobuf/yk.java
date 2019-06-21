package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class yk extends com.tencent.mm.bt.a
{
  public yl wej;
  public yj wek;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80051);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wej == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: RsaReqData");
        AppMethodBeat.o(80051);
        throw paramArrayOfObject;
      }
      if (this.wek == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: AesReqData");
        AppMethodBeat.o(80051);
        throw paramArrayOfObject;
      }
      if (this.wej != null)
      {
        paramArrayOfObject.iy(1, this.wej.computeSize());
        this.wej.writeFields(paramArrayOfObject);
      }
      if (this.wek != null)
      {
        paramArrayOfObject.iy(2, this.wek.computeSize());
        this.wek.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(80051);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wej == null)
        break label579;
    label579: for (i = e.a.a.a.ix(1, this.wej.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wek != null)
        paramInt = i + e.a.a.a.ix(2, this.wek.computeSize());
      AppMethodBeat.o(80051);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wej == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: RsaReqData");
          AppMethodBeat.o(80051);
          throw paramArrayOfObject;
        }
        if (this.wek == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: AesReqData");
          AppMethodBeat.o(80051);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(80051);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        yk localyk = (yk)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          AppMethodBeat.o(80051);
          paramInt = -1;
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new yl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((yl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localyk.wej = ((yl)localObject1);
          }
          AppMethodBeat.o(80051);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new yj();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localyk.wek = paramArrayOfObject;
          }
          AppMethodBeat.o(80051);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(80051);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.yk
 * JD-Core Version:    0.6.2
 */