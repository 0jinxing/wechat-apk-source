package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cll extends btd
{
  public int pcX;
  public int ptD;
  public long ptF;
  public int ptw;
  public int ptx;
  public int pty;
  public bts vEB;
  public bts vEC;
  public String vRA;
  public String vRw;
  public bts xja;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80204);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(80204);
        throw paramArrayOfObject;
      }
      if (this.xja == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ClientImgId");
        AppMethodBeat.o(80204);
        throw paramArrayOfObject;
      }
      if (this.vEB == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: FromUserName");
        AppMethodBeat.o(80204);
        throw paramArrayOfObject;
      }
      if (this.vEC == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: ToUserName");
        AppMethodBeat.o(80204);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.ptD);
      if (this.xja != null)
      {
        paramArrayOfObject.iy(3, this.xja.computeSize());
        this.xja.writeFields(paramArrayOfObject);
      }
      if (this.vEB != null)
      {
        paramArrayOfObject.iy(4, this.vEB.computeSize());
        this.vEB.writeFields(paramArrayOfObject);
      }
      if (this.vEC != null)
      {
        paramArrayOfObject.iy(5, this.vEC.computeSize());
        this.vEC.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(6, this.ptw);
      paramArrayOfObject.iz(7, this.ptx);
      paramArrayOfObject.iz(8, this.pty);
      paramArrayOfObject.iz(9, this.pcX);
      paramArrayOfObject.ai(10, this.ptF);
      if (this.vRw != null)
        paramArrayOfObject.e(11, this.vRw);
      if (this.vRA != null)
        paramArrayOfObject.e(12, this.vRA);
      AppMethodBeat.o(80204);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1407;
    label1407: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.b.b.a.bs(2, this.ptD);
      i = paramInt;
      if (this.xja != null)
        i = paramInt + e.a.a.a.ix(3, this.xja.computeSize());
      paramInt = i;
      if (this.vEB != null)
        paramInt = i + e.a.a.a.ix(4, this.vEB.computeSize());
      i = paramInt;
      if (this.vEC != null)
        i = paramInt + e.a.a.a.ix(5, this.vEC.computeSize());
      i = i + e.a.a.b.b.a.bs(6, this.ptw) + e.a.a.b.b.a.bs(7, this.ptx) + e.a.a.b.b.a.bs(8, this.pty) + e.a.a.b.b.a.bs(9, this.pcX) + e.a.a.b.b.a.o(10, this.ptF);
      paramInt = i;
      if (this.vRw != null)
        paramInt = i + e.a.a.b.b.a.f(11, this.vRw);
      i = paramInt;
      if (this.vRA != null)
        i = paramInt + e.a.a.b.b.a.f(12, this.vRA);
      AppMethodBeat.o(80204);
      paramInt = i;
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
          AppMethodBeat.o(80204);
          throw paramArrayOfObject;
        }
        if (this.xja == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ClientImgId");
          AppMethodBeat.o(80204);
          throw paramArrayOfObject;
        }
        if (this.vEB == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: FromUserName");
          AppMethodBeat.o(80204);
          throw paramArrayOfObject;
        }
        if (this.vEC == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: ToUserName");
          AppMethodBeat.o(80204);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(80204);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cll localcll = (cll)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80204);
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
            localcll.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(80204);
          paramInt = i;
          break;
        case 2:
          localcll.ptD = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80204);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcll.xja = ((bts)localObject1);
          }
          AppMethodBeat.o(80204);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcll.vEB = ((bts)localObject1);
          }
          AppMethodBeat.o(80204);
          paramInt = i;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcll.vEC = paramArrayOfObject;
          }
          AppMethodBeat.o(80204);
          paramInt = i;
          break;
        case 6:
          localcll.ptw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80204);
          paramInt = i;
          break;
        case 7:
          localcll.ptx = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80204);
          paramInt = i;
          break;
        case 8:
          localcll.pty = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80204);
          paramInt = i;
          break;
        case 9:
          localcll.pcX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80204);
          paramInt = i;
          break;
        case 10:
          localcll.ptF = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(80204);
          paramInt = i;
          break;
        case 11:
          localcll.vRw = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80204);
          paramInt = i;
          break;
        case 12:
          localcll.vRA = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80204);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80204);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cll
 * JD-Core Version:    0.6.2
 */