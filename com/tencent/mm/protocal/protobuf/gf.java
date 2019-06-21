package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class gf extends com.tencent.mm.bt.a
{
  public SKBuiltinBuffer_t vIm;
  public SKBuiltinBuffer_t vIn;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(58888);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vIm == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: EncryptKey");
        AppMethodBeat.o(58888);
        throw paramArrayOfObject;
      }
      if (this.vIn == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Key");
        AppMethodBeat.o(58888);
        throw paramArrayOfObject;
      }
      if (this.vIm != null)
      {
        paramArrayOfObject.iy(1, this.vIm.computeSize());
        this.vIm.writeFields(paramArrayOfObject);
      }
      if (this.vIn != null)
      {
        paramArrayOfObject.iy(2, this.vIn.computeSize());
        this.vIn.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(58888);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vIm == null)
        break label580;
    label580: for (i = e.a.a.a.ix(1, this.vIm.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vIn != null)
        paramInt = i + e.a.a.a.ix(2, this.vIn.computeSize());
      AppMethodBeat.o(58888);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vIm == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: EncryptKey");
          AppMethodBeat.o(58888);
          throw paramArrayOfObject;
        }
        if (this.vIn == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Key");
          AppMethodBeat.o(58888);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(58888);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        gf localgf = (gf)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          AppMethodBeat.o(58888);
          paramInt = -1;
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localgf.vIm = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(58888);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localgf.vIn = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(58888);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(58888);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.gf
 * JD-Core Version:    0.6.2
 */