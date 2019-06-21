package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cms extends bsr
{
  public int Scene;
  public SKBuiltinBuffer_t vLz;
  public String wTm;
  public String wTn;
  public String wmM;
  public long wmO;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(857);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.wmM != null)
        paramArrayOfObject.e(2, this.wmM);
      paramArrayOfObject.ai(3, this.wmO);
      if (this.vLz != null)
      {
        paramArrayOfObject.iy(4, this.vLz.computeSize());
        this.vLz.writeFields(paramArrayOfObject);
      }
      if (this.wTm != null)
        paramArrayOfObject.e(5, this.wTm);
      if (this.wTn != null)
        paramArrayOfObject.e(6, this.wTn);
      paramArrayOfObject.iz(7, this.Scene);
      AppMethodBeat.o(857);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label782;
    label782: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wmM != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wmM);
      paramInt = i + e.a.a.b.b.a.o(3, this.wmO);
      i = paramInt;
      if (this.vLz != null)
        i = paramInt + e.a.a.a.ix(4, this.vLz.computeSize());
      paramInt = i;
      if (this.wTm != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.wTm);
      i = paramInt;
      if (this.wTn != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.wTn);
      paramInt = i + e.a.a.b.b.a.bs(7, this.Scene);
      AppMethodBeat.o(857);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(857);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cms localcms = (cms)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(857);
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
            localcms.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(857);
          paramInt = i;
          break;
        case 2:
          localcms.wmM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(857);
          paramInt = i;
          break;
        case 3:
          localcms.wmO = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(857);
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
            localcms.vLz = paramArrayOfObject;
          }
          AppMethodBeat.o(857);
          paramInt = i;
          break;
        case 5:
          localcms.wTm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(857);
          paramInt = i;
          break;
        case 6:
          localcms.wTn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(857);
          paramInt = i;
          break;
        case 7:
          localcms.Scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(857);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(857);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cms
 * JD-Core Version:    0.6.2
 */