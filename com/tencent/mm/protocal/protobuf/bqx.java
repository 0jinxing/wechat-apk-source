package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bqx extends bsr
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
    AppMethodBeat.i(853);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.ai(2, this.wmO);
      if (this.wTm != null)
        paramArrayOfObject.e(3, this.wTm);
      if (this.wTn != null)
        paramArrayOfObject.e(4, this.wTn);
      if (this.wmM != null)
        paramArrayOfObject.e(5, this.wmM);
      if (this.vLz != null)
      {
        paramArrayOfObject.iy(6, this.vLz.computeSize());
        this.vLz.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(7, this.Scene);
      AppMethodBeat.o(853);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label782;
    label782: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.b.b.a.o(2, this.wmO);
      i = paramInt;
      if (this.wTm != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wTm);
      paramInt = i;
      if (this.wTn != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.wTn);
      i = paramInt;
      if (this.wmM != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.wmM);
      paramInt = i;
      if (this.vLz != null)
        paramInt = i + e.a.a.a.ix(6, this.vLz.computeSize());
      paramInt += e.a.a.b.b.a.bs(7, this.Scene);
      AppMethodBeat.o(853);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(853);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bqx localbqx = (bqx)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(853);
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
            localbqx.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(853);
          paramInt = i;
          break;
        case 2:
          localbqx.wmO = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(853);
          paramInt = i;
          break;
        case 3:
          localbqx.wTm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(853);
          paramInt = i;
          break;
        case 4:
          localbqx.wTn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(853);
          paramInt = i;
          break;
        case 5:
          localbqx.wmM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(853);
          paramInt = i;
          break;
        case 6:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbqx.vLz = paramArrayOfObject;
          }
          AppMethodBeat.o(853);
          paramInt = i;
          break;
        case 7:
          localbqx.Scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(853);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(853);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bqx
 * JD-Core Version:    0.6.2
 */