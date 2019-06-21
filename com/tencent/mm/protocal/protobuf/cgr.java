package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cgr extends bsr
{
  public String sign;
  public SKBuiltinBuffer_t wNd;
  public int wxx;
  public int wxy;
  public SKBuiltinBuffer_t wxz;
  public String xfz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56987);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wxz == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ReqText");
        AppMethodBeat.o(56987);
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
      if (this.sign != null)
        paramArrayOfObject.e(6, this.sign);
      if (this.xfz != null)
        paramArrayOfObject.e(7, this.xfz);
      AppMethodBeat.o(56987);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label911;
    label911: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.wxx) + e.a.a.b.b.a.bs(3, this.wxy);
      i = paramInt;
      if (this.wxz != null)
        i = paramInt + e.a.a.a.ix(4, this.wxz.computeSize());
      paramInt = i;
      if (this.wNd != null)
        paramInt = i + e.a.a.a.ix(5, this.wNd.computeSize());
      i = paramInt;
      if (this.sign != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.sign);
      paramInt = i;
      if (this.xfz != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.xfz);
      AppMethodBeat.o(56987);
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
          AppMethodBeat.o(56987);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56987);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cgr localcgr = (cgr)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56987);
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
            localcgr.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(56987);
          paramInt = i;
          break;
        case 2:
          localcgr.wxx = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56987);
          paramInt = i;
          break;
        case 3:
          localcgr.wxy = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56987);
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
            localcgr.wxz = paramArrayOfObject;
          }
          AppMethodBeat.o(56987);
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
            localcgr.wNd = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(56987);
          paramInt = i;
          break;
        case 6:
          localcgr.sign = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56987);
          paramInt = i;
          break;
        case 7:
          localcgr.xfz = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56987);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56987);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cgr
 * JD-Core Version:    0.6.2
 */