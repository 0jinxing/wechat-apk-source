package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class ail extends com.tencent.mm.bt.a
{
  public String ProductID;
  public SKBuiltinBuffer_t ReqBuf;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(62560);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.ProductID == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ProductID");
        AppMethodBeat.o(62560);
        throw paramArrayOfObject;
      }
      if (this.ReqBuf == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ReqBuf");
        AppMethodBeat.o(62560);
        throw paramArrayOfObject;
      }
      if (this.ProductID != null)
        paramArrayOfObject.e(1, this.ProductID);
      if (this.ReqBuf != null)
      {
        paramArrayOfObject.iy(2, this.ReqBuf.computeSize());
        this.ReqBuf.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(62560);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.ProductID == null)
        break label483;
    label483: for (i = e.a.a.b.b.a.f(1, this.ProductID) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.ReqBuf != null)
        paramInt = i + e.a.a.a.ix(2, this.ReqBuf.computeSize());
      AppMethodBeat.o(62560);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.ProductID == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ProductID");
          AppMethodBeat.o(62560);
          throw paramArrayOfObject;
        }
        if (this.ReqBuf == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ReqBuf");
          AppMethodBeat.o(62560);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(62560);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ail localail = (ail)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          AppMethodBeat.o(62560);
          paramInt = -1;
          break;
        case 1:
          localail.ProductID = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(62560);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localail.ReqBuf = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(62560);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(62560);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ail
 * JD-Core Version:    0.6.2
 */