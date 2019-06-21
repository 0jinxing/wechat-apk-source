package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cqk extends btd
{
  public int vQe;
  public SKBuiltinBuffer_t vTO;
  public int wem;
  public long wen;
  public cpg xor;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(5280);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(5280);
        throw paramArrayOfObject;
      }
      if (this.vTO == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: KeyBuf");
        AppMethodBeat.o(5280);
        throw paramArrayOfObject;
      }
      if (this.xor == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: CmdList");
        AppMethodBeat.o(5280);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(3, this.wem);
      if (this.vTO != null)
      {
        paramArrayOfObject.iy(4, this.vTO.computeSize());
        this.vTO.writeFields(paramArrayOfObject);
      }
      if (this.xor != null)
      {
        paramArrayOfObject.iy(5, this.xor.computeSize());
        this.xor.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(7, this.vQe);
      paramArrayOfObject.ai(8, this.wen);
      AppMethodBeat.o(5280);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label952;
    label952: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(3, this.wem);
      paramInt = i;
      if (this.vTO != null)
        paramInt = i + e.a.a.a.ix(4, this.vTO.computeSize());
      i = paramInt;
      if (this.xor != null)
        i = paramInt + e.a.a.a.ix(5, this.xor.computeSize());
      paramInt = i + e.a.a.b.b.a.bs(7, this.vQe) + e.a.a.b.b.a.o(8, this.wen);
      AppMethodBeat.o(5280);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(5280);
          throw paramArrayOfObject;
        }
        if (this.vTO == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: KeyBuf");
          AppMethodBeat.o(5280);
          throw paramArrayOfObject;
        }
        if (this.xor == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: CmdList");
          AppMethodBeat.o(5280);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(5280);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cqk localcqk = (cqk)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 2:
        case 6:
        default:
          AppMethodBeat.o(5280);
          paramInt = -1;
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((BaseResponse)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcqk.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(5280);
          paramInt = i;
          break;
        case 3:
          localcqk.wem = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5280);
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
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcqk.vTO = paramArrayOfObject;
          }
          AppMethodBeat.o(5280);
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
            for (bool = true; bool; bool = ((cpg)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcqk.xor = ((cpg)localObject1);
          }
          AppMethodBeat.o(5280);
          paramInt = i;
          break;
        case 7:
          localcqk.vQe = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(5280);
          paramInt = i;
          break;
        case 8:
          localcqk.wen = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(5280);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(5280);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cqk
 * JD-Core Version:    0.6.2
 */