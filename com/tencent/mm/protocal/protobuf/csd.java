package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class csd extends com.tencent.mm.bt.a
{
  public String vLX;
  public String vLY;
  public SKBuiltinBuffer_t vMb;
  public String xpA;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(58939);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vMb == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: KSid");
        AppMethodBeat.o(58939);
        throw paramArrayOfObject;
      }
      if (this.vLX != null)
        paramArrayOfObject.e(1, this.vLX);
      if (this.vLY != null)
        paramArrayOfObject.e(2, this.vLY);
      if (this.xpA != null)
        paramArrayOfObject.e(3, this.xpA);
      if (this.vMb != null)
      {
        paramArrayOfObject.iy(4, this.vMb.computeSize());
        this.vMb.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(58939);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vLX == null)
        break label564;
    label564: for (paramInt = e.a.a.b.b.a.f(1, this.vLX) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vLY != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.vLY);
      paramInt = i;
      if (this.xpA != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.xpA);
      i = paramInt;
      if (this.vMb != null)
        i = paramInt + e.a.a.a.ix(4, this.vMb.computeSize());
      AppMethodBeat.o(58939);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vMb == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: KSid");
          AppMethodBeat.o(58939);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(58939);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        csd localcsd = (csd)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(58939);
          break;
        case 1:
          localcsd.vLX = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58939);
          paramInt = i;
          break;
        case 2:
          localcsd.vLY = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58939);
          paramInt = i;
          break;
        case 3:
          localcsd.xpA = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58939);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcsd.vMb = paramArrayOfObject;
          }
          AppMethodBeat.o(58939);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(58939);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.csd
 * JD-Core Version:    0.6.2
 */