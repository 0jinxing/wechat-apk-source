package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class aky extends btd
{
  public int ptD;
  public long ptF;
  public int ptw;
  public int ptx;
  public int pty;
  public SKBuiltinBuffer_t ptz;
  public bts vEB;
  public bts vEC;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80076);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(80076);
        throw paramArrayOfObject;
      }
      if (this.vEB == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: FromUserName");
        AppMethodBeat.o(80076);
        throw paramArrayOfObject;
      }
      if (this.vEC == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ToUserName");
        AppMethodBeat.o(80076);
        throw paramArrayOfObject;
      }
      if (this.ptz == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Data");
        AppMethodBeat.o(80076);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.ptD);
      if (this.vEB != null)
      {
        paramArrayOfObject.iy(3, this.vEB.computeSize());
        this.vEB.writeFields(paramArrayOfObject);
      }
      if (this.vEC != null)
      {
        paramArrayOfObject.iy(4, this.vEC.computeSize());
        this.vEC.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(5, this.ptw);
      paramArrayOfObject.iz(6, this.ptx);
      paramArrayOfObject.iz(7, this.pty);
      if (this.ptz != null)
      {
        paramArrayOfObject.iy(8, this.ptz.computeSize());
        this.ptz.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.ai(9, this.ptF);
      AppMethodBeat.o(80076);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1228;
    label1228: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.ptD);
      paramInt = i;
      if (this.vEB != null)
        paramInt = i + e.a.a.a.ix(3, this.vEB.computeSize());
      i = paramInt;
      if (this.vEC != null)
        i = paramInt + e.a.a.a.ix(4, this.vEC.computeSize());
      i = i + e.a.a.b.b.a.bs(5, this.ptw) + e.a.a.b.b.a.bs(6, this.ptx) + e.a.a.b.b.a.bs(7, this.pty);
      paramInt = i;
      if (this.ptz != null)
        paramInt = i + e.a.a.a.ix(8, this.ptz.computeSize());
      paramInt += e.a.a.b.b.a.o(9, this.ptF);
      AppMethodBeat.o(80076);
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
          AppMethodBeat.o(80076);
          throw paramArrayOfObject;
        }
        if (this.vEB == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: FromUserName");
          AppMethodBeat.o(80076);
          throw paramArrayOfObject;
        }
        if (this.vEC == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ToUserName");
          AppMethodBeat.o(80076);
          throw paramArrayOfObject;
        }
        if (this.ptz == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Data");
          AppMethodBeat.o(80076);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(80076);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aky localaky = (aky)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80076);
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
            localaky.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(80076);
          paramInt = i;
          break;
        case 2:
          localaky.ptD = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80076);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaky.vEB = paramArrayOfObject;
          }
          AppMethodBeat.o(80076);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaky.vEC = paramArrayOfObject;
          }
          AppMethodBeat.o(80076);
          paramInt = i;
          break;
        case 5:
          localaky.ptw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80076);
          paramInt = i;
          break;
        case 6:
          localaky.ptx = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80076);
          paramInt = i;
          break;
        case 7:
          localaky.pty = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80076);
          paramInt = i;
          break;
        case 8:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaky.ptz = paramArrayOfObject;
          }
          AppMethodBeat.o(80076);
          paramInt = i;
          break;
        case 9:
          localaky.ptF = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(80076);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80076);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aky
 * JD-Core Version:    0.6.2
 */