package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bjz extends bsr
{
  public SKBuiltinBuffer_t wNd;
  public int wxx;
  public int wxy;
  public SKBuiltinBuffer_t wxz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56915);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wxz == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ReqText");
        AppMethodBeat.o(56915);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.wxx);
      paramArrayOfObject.iz(3, this.wxy);
      if (this.wxz != null)
      {
        paramArrayOfObject.iy(4, this.wxz.computeSize());
        this.wxz.writeFields(paramArrayOfObject);
      }
      if (this.wNd != null)
      {
        paramArrayOfObject.iy(5, this.wNd.computeSize());
        this.wNd.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(56915);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label782;
    label782: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.wxx) + e.a.a.b.b.a.bs(3, this.wxy);
      paramInt = i;
      if (this.wxz != null)
        paramInt = i + e.a.a.a.ix(4, this.wxz.computeSize());
      i = paramInt;
      if (this.wNd != null)
        i = paramInt + e.a.a.a.ix(5, this.wNd.computeSize());
      AppMethodBeat.o(56915);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wxz == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ReqText");
          AppMethodBeat.o(56915);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56915);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bjz localbjz = (bjz)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56915);
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
            localbjz.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(56915);
          paramInt = i;
          break;
        case 2:
          localbjz.wxx = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56915);
          paramInt = i;
          break;
        case 3:
          localbjz.wxy = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56915);
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
            localbjz.wxz = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(56915);
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
            localbjz.wNd = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(56915);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56915);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bjz
 * JD-Core Version:    0.6.2
 */