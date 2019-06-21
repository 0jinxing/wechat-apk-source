package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bwh extends bsr
{
  public asq vLi;
  public asu wWW;
  public SKBuiltinBuffer_t wwz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28631);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vLi == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: HardDevice");
        AppMethodBeat.o(28631);
        throw paramArrayOfObject;
      }
      if (this.wWW == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: HardDeviceMsg");
        AppMethodBeat.o(28631);
        throw paramArrayOfObject;
      }
      if (this.wwz == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: SessionBuffer");
        AppMethodBeat.o(28631);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.vLi != null)
      {
        paramArrayOfObject.iy(2, this.vLi.computeSize());
        this.vLi.writeFields(paramArrayOfObject);
      }
      if (this.wWW != null)
      {
        paramArrayOfObject.iy(3, this.wWW.computeSize());
        this.wWW.writeFields(paramArrayOfObject);
      }
      if (this.wwz != null)
      {
        paramArrayOfObject.iy(4, this.wwz.computeSize());
        this.wwz.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(28631);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label956;
    label956: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vLi != null)
        paramInt = i + e.a.a.a.ix(2, this.vLi.computeSize());
      i = paramInt;
      if (this.wWW != null)
        i = paramInt + e.a.a.a.ix(3, this.wWW.computeSize());
      paramInt = i;
      if (this.wwz != null)
        paramInt = i + e.a.a.a.ix(4, this.wwz.computeSize());
      AppMethodBeat.o(28631);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vLi == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: HardDevice");
          AppMethodBeat.o(28631);
          throw paramArrayOfObject;
        }
        if (this.wWW == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: HardDeviceMsg");
          AppMethodBeat.o(28631);
          throw paramArrayOfObject;
        }
        if (this.wwz == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: SessionBuffer");
          AppMethodBeat.o(28631);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28631);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bwh localbwh = (bwh)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28631);
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
            localbwh.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(28631);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new asq();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbwh.vLi = paramArrayOfObject;
          }
          AppMethodBeat.o(28631);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new asu();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((asu)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbwh.wWW = ((asu)localObject1);
          }
          AppMethodBeat.o(28631);
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
            localbwh.wwz = paramArrayOfObject;
          }
          AppMethodBeat.o(28631);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28631);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bwh
 * JD-Core Version:    0.6.2
 */