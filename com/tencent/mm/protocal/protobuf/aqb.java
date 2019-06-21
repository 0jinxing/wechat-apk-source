package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class aqb extends bsr
{
  public SKBuiltinBuffer_t vLz;
  public int wub;
  public String wuc;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28489);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vLz == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: RandomEncryKey");
        AppMethodBeat.o(28489);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.wub);
      if (this.wuc != null)
        paramArrayOfObject.e(3, this.wuc);
      if (this.vLz != null)
      {
        paramArrayOfObject.iy(4, this.vLz.computeSize());
        this.vLz.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(28489);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label654;
    label654: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.wub);
      paramInt = i;
      if (this.wuc != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.wuc);
      i = paramInt;
      if (this.vLz != null)
        i = paramInt + e.a.a.a.ix(4, this.vLz.computeSize());
      AppMethodBeat.o(28489);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vLz == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: RandomEncryKey");
          AppMethodBeat.o(28489);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28489);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aqb localaqb = (aqb)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28489);
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
            localaqb.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(28489);
          paramInt = i;
          break;
        case 2:
          localaqb.wub = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28489);
          paramInt = i;
          break;
        case 3:
          localaqb.wuc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28489);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaqb.vLz = paramArrayOfObject;
          }
          AppMethodBeat.o(28489);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28489);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aqb
 * JD-Core Version:    0.6.2
 */