package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cgw extends bsr
{
  public String luQ;
  public SKBuiltinBuffer_t vLz;
  public String wfk;
  public int xfE;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(58936);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.wfk != null)
        paramArrayOfObject.e(2, this.wfk);
      paramArrayOfObject.iz(3, this.xfE);
      if (this.luQ != null)
        paramArrayOfObject.e(4, this.luQ);
      if (this.vLz != null)
      {
        paramArrayOfObject.iy(5, this.vLz.computeSize());
        this.vLz.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(58936);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label656;
    label656: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wfk != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wfk);
      i += e.a.a.b.b.a.bs(3, this.xfE);
      paramInt = i;
      if (this.luQ != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.luQ);
      i = paramInt;
      if (this.vLz != null)
        i = paramInt + e.a.a.a.ix(5, this.vLz.computeSize());
      AppMethodBeat.o(58936);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(58936);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cgw localcgw = (cgw)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(58936);
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
            localcgw.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(58936);
          paramInt = i;
          break;
        case 2:
          localcgw.wfk = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58936);
          paramInt = i;
          break;
        case 3:
          localcgw.xfE = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(58936);
          paramInt = i;
          break;
        case 4:
          localcgw.luQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(58936);
          paramInt = i;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcgw.vLz = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(58936);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(58936);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cgw
 * JD-Core Version:    0.6.2
 */