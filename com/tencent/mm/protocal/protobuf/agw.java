package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class agw extends btd
{
  public String kdS;
  public String wno;
  public ol wnp;
  public int wnq;
  public bvx wnr;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(89090);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(89090);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.kdS != null)
        paramArrayOfObject.e(2, this.kdS);
      if (this.wno != null)
        paramArrayOfObject.e(3, this.wno);
      if (this.wnp != null)
      {
        paramArrayOfObject.iy(4, this.wnp.computeSize());
        this.wnp.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(5, this.wnq);
      if (this.wnr != null)
      {
        paramArrayOfObject.iy(6, this.wnr.computeSize());
        this.wnr.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(89090);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label864;
    label864: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.kdS != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.kdS);
      paramInt = i;
      if (this.wno != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.wno);
      i = paramInt;
      if (this.wnp != null)
        i = paramInt + e.a.a.a.ix(4, this.wnp.computeSize());
      i += e.a.a.b.b.a.bs(5, this.wnq);
      paramInt = i;
      if (this.wnr != null)
        paramInt = i + e.a.a.a.ix(6, this.wnr.computeSize());
      AppMethodBeat.o(89090);
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
          AppMethodBeat.o(89090);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(89090);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        agw localagw = (agw)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(89090);
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
            localagw.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(89090);
          paramInt = i;
          break;
        case 2:
          localagw.kdS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89090);
          paramInt = i;
          break;
        case 3:
          localagw.wno = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89090);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new ol();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((ol)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localagw.wnp = ((ol)localObject1);
          }
          AppMethodBeat.o(89090);
          paramInt = i;
          break;
        case 5:
          localagw.wnq = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89090);
          paramInt = i;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bvx();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bvx)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localagw.wnr = ((bvx)localObject1);
          }
          AppMethodBeat.o(89090);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(89090);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.agw
 * JD-Core Version:    0.6.2
 */