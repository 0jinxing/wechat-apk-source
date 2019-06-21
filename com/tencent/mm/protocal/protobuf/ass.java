package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class ass extends bsr
{
  public asq vLi;
  public int wwx;
  public SKBuiltinBuffer_t wwy;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28518);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vLi == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: HardDevice");
        AppMethodBeat.o(28518);
        throw paramArrayOfObject;
      }
      if (this.wwy == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: AuthBuffer");
        AppMethodBeat.o(28518);
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
      paramArrayOfObject.iz(3, this.wwx);
      if (this.wwy != null)
      {
        paramArrayOfObject.iy(4, this.wwy.computeSize());
        this.wwy.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(28518);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label796;
    label796: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.vLi != null)
        i = paramInt + e.a.a.a.ix(2, this.vLi.computeSize());
      i += e.a.a.b.b.a.bs(3, this.wwx);
      paramInt = i;
      if (this.wwy != null)
        paramInt = i + e.a.a.a.ix(4, this.wwy.computeSize());
      AppMethodBeat.o(28518);
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
          AppMethodBeat.o(28518);
          throw paramArrayOfObject;
        }
        if (this.wwy == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: AuthBuffer");
          AppMethodBeat.o(28518);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28518);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ass localass = (ass)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28518);
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
            localass.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(28518);
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
            localass.vLi = paramArrayOfObject;
          }
          AppMethodBeat.o(28518);
          paramInt = i;
          break;
        case 3:
          localass.wwx = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28518);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localass.wwy = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(28518);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28518);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ass
 * JD-Core Version:    0.6.2
 */