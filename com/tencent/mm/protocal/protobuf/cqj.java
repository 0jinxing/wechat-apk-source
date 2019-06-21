package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cqj extends bsr
{
  public int vTN;
  public SKBuiltinBuffer_t vTO;
  public String wPm;
  public int wem;
  public long wen;
  public long xlQ;
  public cpg xoq;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(5279);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vTO == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: KeyBuf");
        AppMethodBeat.o(5279);
        throw paramArrayOfObject;
      }
      if (this.xoq == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: OpLog");
        AppMethodBeat.o(5279);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.wPm != null)
        paramArrayOfObject.e(2, this.wPm);
      paramArrayOfObject.iz(3, this.wem);
      if (this.vTO != null)
      {
        paramArrayOfObject.iy(4, this.vTO.computeSize());
        this.vTO.writeFields(paramArrayOfObject);
      }
      if (this.xoq != null)
      {
        paramArrayOfObject.iy(5, this.xoq.computeSize());
        this.xoq.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.ai(6, this.wen);
      paramArrayOfObject.iz(7, this.vTN);
      paramArrayOfObject.ai(8, this.xlQ);
      AppMethodBeat.o(5279);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label1008;
    label1008: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wPm != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wPm);
      i += e.a.a.b.b.a.bs(3, this.wem);
      paramInt = i;
      if (this.vTO != null)
        paramInt = i + e.a.a.a.ix(4, this.vTO.computeSize());
      i = paramInt;
      if (this.xoq != null)
        i = paramInt + e.a.a.a.ix(5, this.xoq.computeSize());
      paramInt = i + e.a.a.b.b.a.o(6, this.wen) + e.a.a.b.b.a.bs(7, this.vTN) + e.a.a.b.b.a.o(8, this.xlQ);
      AppMethodBeat.o(5279);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.vTO == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: KeyBuf");
          AppMethodBeat.o(5279);
          throw paramArrayOfObject;
        }
        if (this.xoq == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: OpLog");
          AppMethodBeat.o(5279);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(5279);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cqj localcqj = (cqj)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(5279);
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
            localcqj.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(5279);
          paramInt = i;
          break;
        case 2:
          localcqj.wPm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(5279);
          paramInt = i;
          break;
        case 3:
          localcqj.wem = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5279);
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
            localcqj.vTO = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(5279);
          paramInt = i;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cpg();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cpg)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcqj.xoq = ((cpg)localObject1);
          }
          AppMethodBeat.o(5279);
          paramInt = i;
          break;
        case 6:
          localcqj.wen = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(5279);
          paramInt = i;
          break;
        case 7:
          localcqj.vTN = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5279);
          paramInt = i;
          break;
        case 8:
          localcqj.xlQ = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(5279);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(5279);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cqj
 * JD-Core Version:    0.6.2
 */