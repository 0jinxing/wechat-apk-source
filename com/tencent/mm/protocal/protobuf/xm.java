package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class xm extends btd
{
  public int ptD;
  public long ptF;
  public int ptw;
  public int ptx;
  public SKBuiltinBuffer_t ptz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(50999);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(50999);
        throw paramArrayOfObject;
      }
      if (this.ptz == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Data");
        AppMethodBeat.o(50999);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.ptD);
      paramArrayOfObject.iz(3, this.ptw);
      paramArrayOfObject.iz(4, this.ptx);
      if (this.ptz != null)
      {
        paramArrayOfObject.iy(5, this.ptz.computeSize());
        this.ptz.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.ai(6, this.ptF);
      AppMethodBeat.o(50999);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label762;
    label762: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.ptD) + e.a.a.b.b.a.bs(3, this.ptw) + e.a.a.b.b.a.bs(4, this.ptx);
      paramInt = i;
      if (this.ptz != null)
        paramInt = i + e.a.a.a.ix(5, this.ptz.computeSize());
      paramInt += e.a.a.b.b.a.o(6, this.ptF);
      AppMethodBeat.o(50999);
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
          AppMethodBeat.o(50999);
          throw paramArrayOfObject;
        }
        if (this.ptz == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Data");
          AppMethodBeat.o(50999);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(50999);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        xm localxm = (xm)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(50999);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localxm.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(50999);
          paramInt = i;
          break;
        case 2:
          localxm.ptD = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(50999);
          paramInt = i;
          break;
        case 3:
          localxm.ptw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(50999);
          paramInt = i;
          break;
        case 4:
          localxm.ptx = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(50999);
          paramInt = i;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localxm.ptz = paramArrayOfObject;
          }
          AppMethodBeat.o(50999);
          paramInt = i;
          break;
        case 6:
          localxm.ptF = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(50999);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(50999);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.xm
 * JD-Core Version:    0.6.2
 */