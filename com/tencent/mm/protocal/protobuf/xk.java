package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class xk extends btd
{
  public String fKh;
  public String fKk;
  public String jBB;
  public int ptw;
  public int ptx;
  public int pty;
  public SKBuiltinBuffer_t ptz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(135757);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(135757);
        throw paramArrayOfObject;
      }
      if (this.ptz == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Data");
        AppMethodBeat.o(135757);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.fKh != null)
        paramArrayOfObject.e(2, this.fKh);
      if (this.fKk != null)
        paramArrayOfObject.e(3, this.fKk);
      if (this.jBB != null)
        paramArrayOfObject.e(4, this.jBB);
      paramArrayOfObject.iz(5, this.ptw);
      paramArrayOfObject.iz(6, this.ptx);
      paramArrayOfObject.iz(7, this.pty);
      if (this.ptz != null)
      {
        paramArrayOfObject.iy(8, this.ptz.computeSize());
        this.ptz.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(135757);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label910;
    label910: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.fKh != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.fKh);
      paramInt = i;
      if (this.fKk != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.fKk);
      i = paramInt;
      if (this.jBB != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.jBB);
      i = i + e.a.a.b.b.a.bs(5, this.ptw) + e.a.a.b.b.a.bs(6, this.ptx) + e.a.a.b.b.a.bs(7, this.pty);
      paramInt = i;
      if (this.ptz != null)
        paramInt = i + e.a.a.a.ix(8, this.ptz.computeSize());
      AppMethodBeat.o(135757);
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
          AppMethodBeat.o(135757);
          throw paramArrayOfObject;
        }
        if (this.ptz == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Data");
          AppMethodBeat.o(135757);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(135757);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        xk localxk = (xk)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(135757);
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
            localxk.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(135757);
          paramInt = i;
          break;
        case 2:
          localxk.fKh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(135757);
          paramInt = i;
          break;
        case 3:
          localxk.fKk = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(135757);
          paramInt = i;
          break;
        case 4:
          localxk.jBB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(135757);
          paramInt = i;
          break;
        case 5:
          localxk.ptw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(135757);
          paramInt = i;
          break;
        case 6:
          localxk.ptx = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(135757);
          paramInt = i;
          break;
        case 7:
          localxk.pty = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(135757);
          paramInt = i;
          break;
        case 8:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localxk.ptz = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(135757);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(135757);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.xk
 * JD-Core Version:    0.6.2
 */