package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class apj extends btd
{
  public int ptw;
  public int ptx;
  public int pty;
  public SKBuiltinBuffer_t ptz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(127723);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(127723);
        throw paramArrayOfObject;
      }
      if (this.ptz == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Data");
        AppMethodBeat.o(127723);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.ptw);
      paramArrayOfObject.iz(3, this.ptx);
      paramArrayOfObject.iz(4, this.pty);
      if (this.ptz != null)
      {
        paramArrayOfObject.iy(5, this.ptz.computeSize());
        this.ptz.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(127723);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label716;
    label716: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.ptw) + e.a.a.b.b.a.bs(3, this.ptx) + e.a.a.b.b.a.bs(4, this.pty);
      paramInt = i;
      if (this.ptz != null)
        paramInt = i + e.a.a.a.ix(5, this.ptz.computeSize());
      AppMethodBeat.o(127723);
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
          AppMethodBeat.o(127723);
          throw paramArrayOfObject;
        }
        if (this.ptz == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Data");
          AppMethodBeat.o(127723);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(127723);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        apj localapj = (apj)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(127723);
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
            localapj.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(127723);
          paramInt = i;
          break;
        case 2:
          localapj.ptw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(127723);
          paramInt = i;
          break;
        case 3:
          localapj.ptx = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(127723);
          paramInt = i;
          break;
        case 4:
          localapj.pty = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(127723);
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
            localapj.ptz = paramArrayOfObject;
          }
          AppMethodBeat.o(127723);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(127723);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.apj
 * JD-Core Version:    0.6.2
 */