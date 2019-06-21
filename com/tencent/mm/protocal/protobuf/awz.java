package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class awz extends bsr
{
  public SKBuiltinBuffer_t vLz;
  public int wBh;
  public SKBuiltinBuffer_t wBi;
  public SKBuiltinBuffer_t wBj;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(72859);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wBi == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: KVBuffer");
        AppMethodBeat.o(72859);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.wBh);
      if (this.wBi != null)
      {
        paramArrayOfObject.iy(3, this.wBi.computeSize());
        this.wBi.writeFields(paramArrayOfObject);
      }
      if (this.vLz != null)
      {
        paramArrayOfObject.iy(4, this.vLz.computeSize());
        this.vLz.writeFields(paramArrayOfObject);
      }
      if (this.wBj != null)
      {
        paramArrayOfObject.iy(5, this.wBj.computeSize());
        this.wBj.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(72859);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label893;
    label893: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.wBh);
      paramInt = i;
      if (this.wBi != null)
        paramInt = i + e.a.a.a.ix(3, this.wBi.computeSize());
      i = paramInt;
      if (this.vLz != null)
        i = paramInt + e.a.a.a.ix(4, this.vLz.computeSize());
      paramInt = i;
      if (this.wBj != null)
        paramInt = i + e.a.a.a.ix(5, this.wBj.computeSize());
      AppMethodBeat.o(72859);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wBi == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: KVBuffer");
          AppMethodBeat.o(72859);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(72859);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        awz localawz = (awz)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(72859);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((hl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localawz.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(72859);
          paramInt = i;
          break;
        case 2:
          localawz.wBh = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(72859);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localawz.wBi = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(72859);
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
            localawz.vLz = paramArrayOfObject;
          }
          AppMethodBeat.o(72859);
          paramInt = i;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localawz.wBj = paramArrayOfObject;
          }
          AppMethodBeat.o(72859);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(72859);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.awz
 * JD-Core Version:    0.6.2
 */