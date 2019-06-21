package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cnm extends bsr
{
  public SKBuiltinBuffer_t vLz;
  public int wTs;
  public int wTu;
  public String wuc;
  public cob xkT;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28699);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.xkT == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Piece");
        AppMethodBeat.o(28699);
        throw paramArrayOfObject;
      }
      if (this.vLz == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: RandomEncryKey");
        AppMethodBeat.o(28699);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.xkT != null)
      {
        paramArrayOfObject.iy(2, this.xkT.computeSize());
        this.xkT.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(3, this.wTs);
      paramArrayOfObject.iz(4, this.wTu);
      if (this.wuc != null)
        paramArrayOfObject.e(5, this.wuc);
      if (this.vLz != null)
      {
        paramArrayOfObject.iy(6, this.vLz.computeSize());
        this.vLz.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(28699);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label911;
    label911: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.xkT != null)
        i = paramInt + e.a.a.a.ix(2, this.xkT.computeSize());
      i = i + e.a.a.b.b.a.bs(3, this.wTs) + e.a.a.b.b.a.bs(4, this.wTu);
      paramInt = i;
      if (this.wuc != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.wuc);
      i = paramInt;
      if (this.vLz != null)
        i = paramInt + e.a.a.a.ix(6, this.vLz.computeSize());
      AppMethodBeat.o(28699);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.xkT == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Piece");
          AppMethodBeat.o(28699);
          throw paramArrayOfObject;
        }
        if (this.vLz == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: RandomEncryKey");
          AppMethodBeat.o(28699);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28699);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cnm localcnm = (cnm)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28699);
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
            localcnm.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(28699);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cob();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcnm.xkT = paramArrayOfObject;
          }
          AppMethodBeat.o(28699);
          paramInt = i;
          break;
        case 3:
          localcnm.wTs = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28699);
          paramInt = i;
          break;
        case 4:
          localcnm.wTu = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28699);
          paramInt = i;
          break;
        case 5:
          localcnm.wuc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28699);
          paramInt = i;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcnm.vLz = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(28699);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28699);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cnm
 * JD-Core Version:    0.6.2
 */