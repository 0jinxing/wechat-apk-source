package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class ceh extends btd
{
  public int vAR;
  public String wZT;
  public int xbC;
  public long xdM;
  public int xec;
  public LinkedList<cef> xed;

  public ceh()
  {
    AppMethodBeat.i(56522);
    this.xed = new LinkedList();
    AppMethodBeat.o(56522);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56523);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(56523);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.wZT != null)
        paramArrayOfObject.e(2, this.wZT);
      paramArrayOfObject.iz(3, this.xec);
      paramArrayOfObject.e(4, 8, this.xed);
      paramArrayOfObject.iz(5, this.xbC);
      paramArrayOfObject.ai(6, this.xdM);
      paramArrayOfObject.iz(7, this.vAR);
      AppMethodBeat.o(56523);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label766;
    label766: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wZT != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wZT);
      paramInt = i + e.a.a.b.b.a.bs(3, this.xec) + e.a.a.a.c(4, 8, this.xed) + e.a.a.b.b.a.bs(5, this.xbC) + e.a.a.b.b.a.o(6, this.xdM) + e.a.a.b.b.a.bs(7, this.vAR);
      AppMethodBeat.o(56523);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.xed.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(56523);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56523);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ceh localceh = (ceh)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56523);
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
            localceh.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(56523);
          paramInt = i;
          break;
        case 2:
          localceh.wZT = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56523);
          paramInt = i;
          break;
        case 3:
          localceh.xec = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56523);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cef();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cef)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localceh.xed.add(localObject1);
          }
          AppMethodBeat.o(56523);
          paramInt = i;
          break;
        case 5:
          localceh.xbC = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56523);
          paramInt = i;
          break;
        case 6:
          localceh.xdM = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56523);
          paramInt = i;
          break;
        case 7:
          localceh.vAR = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56523);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56523);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ceh
 * JD-Core Version:    0.6.2
 */