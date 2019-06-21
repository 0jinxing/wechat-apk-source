package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bio extends btd
{
  public int luT;
  public String luU;
  public String wLZ;
  public String wlb;
  public String wlc;
  public csj wlh;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56877);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(56877);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.wlc != null)
        paramArrayOfObject.e(2, this.wlc);
      paramArrayOfObject.iz(3, this.luT);
      if (this.luU != null)
        paramArrayOfObject.e(4, this.luU);
      if (this.wlb != null)
        paramArrayOfObject.e(5, this.wlb);
      if (this.wLZ != null)
        paramArrayOfObject.e(6, this.wLZ);
      if (this.wlh != null)
      {
        paramArrayOfObject.iy(7, this.wlh.computeSize());
        this.wlh.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(56877);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label833;
    label833: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wlc != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wlc);
      i += e.a.a.b.b.a.bs(3, this.luT);
      paramInt = i;
      if (this.luU != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.luU);
      i = paramInt;
      if (this.wlb != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.wlb);
      paramInt = i;
      if (this.wLZ != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.wLZ);
      i = paramInt;
      if (this.wlh != null)
        i = paramInt + e.a.a.a.ix(7, this.wlh.computeSize());
      AppMethodBeat.o(56877);
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
          AppMethodBeat.o(56877);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56877);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bio localbio = (bio)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56877);
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
            localbio.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(56877);
          paramInt = i;
          break;
        case 2:
          localbio.wlc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56877);
          paramInt = i;
          break;
        case 3:
          localbio.luT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56877);
          paramInt = i;
          break;
        case 4:
          localbio.luU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56877);
          paramInt = i;
          break;
        case 5:
          localbio.wlb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56877);
          paramInt = i;
          break;
        case 6:
          localbio.wLZ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56877);
          paramInt = i;
          break;
        case 7:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new csj();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbio.wlh = paramArrayOfObject;
          }
          AppMethodBeat.o(56877);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56877);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bio
 * JD-Core Version:    0.6.2
 */