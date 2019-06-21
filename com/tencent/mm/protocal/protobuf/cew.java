package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cew extends btd
{
  public cer xdJ;
  public int xev;
  public int xew;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56542);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(56542);
        throw paramArrayOfObject;
      }
      if (this.xdJ == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: StoryObject");
        AppMethodBeat.o(56542);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.xdJ != null)
      {
        paramArrayOfObject.iy(2, this.xdJ.computeSize());
        this.xdJ.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(3, this.xev);
      paramArrayOfObject.iz(4, this.xew);
      AppMethodBeat.o(56542);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label668;
    label668: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.xdJ != null)
        i = paramInt + e.a.a.a.ix(2, this.xdJ.computeSize());
      paramInt = i + e.a.a.b.b.a.bs(3, this.xev) + e.a.a.b.b.a.bs(4, this.xew);
      AppMethodBeat.o(56542);
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
          AppMethodBeat.o(56542);
          throw paramArrayOfObject;
        }
        if (this.xdJ == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: StoryObject");
          AppMethodBeat.o(56542);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56542);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cew localcew = (cew)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56542);
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
            localcew.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(56542);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cer();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcew.xdJ = paramArrayOfObject;
          }
          AppMethodBeat.o(56542);
          paramInt = i;
          break;
        case 3:
          localcew.xev = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56542);
          paramInt = i;
          break;
        case 4:
          localcew.xew = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56542);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56542);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cew
 * JD-Core Version:    0.6.2
 */