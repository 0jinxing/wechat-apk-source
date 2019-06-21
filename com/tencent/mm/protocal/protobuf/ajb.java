package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class ajb extends bsr
{
  public String vBa;
  public String woV;
  public String woW;
  public mk woX;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(59563);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.woV == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: FunctionMsgID");
        AppMethodBeat.o(59563);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.woV != null)
        paramArrayOfObject.e(2, this.woV);
      if (this.woW != null)
        paramArrayOfObject.e(3, this.woW);
      if (this.vBa != null)
        paramArrayOfObject.e(4, this.vBa);
      if (this.woX != null)
      {
        paramArrayOfObject.iy(5, this.woX.computeSize());
        this.woX.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(59563);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label720;
    label720: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.woV != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.woV);
      paramInt = i;
      if (this.woW != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.woW);
      i = paramInt;
      if (this.vBa != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.vBa);
      paramInt = i;
      if (this.woX != null)
        paramInt = i + e.a.a.a.ix(5, this.woX.computeSize());
      AppMethodBeat.o(59563);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.woV == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: FunctionMsgID");
          AppMethodBeat.o(59563);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(59563);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ajb localajb = (ajb)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(59563);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localajb.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(59563);
          paramInt = i;
          break;
        case 2:
          localajb.woV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(59563);
          paramInt = i;
          break;
        case 3:
          localajb.woW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(59563);
          paramInt = i;
          break;
        case 4:
          localajb.vBa = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(59563);
          paramInt = i;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new mk();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((mk)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localajb.woX = ((mk)localObject1);
          }
          AppMethodBeat.o(59563);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(59563);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ajb
 * JD-Core Version:    0.6.2
 */