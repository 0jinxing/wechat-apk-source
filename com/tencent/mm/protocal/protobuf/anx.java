package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public class anx extends btd
{
  public String nzz;
  public LinkedList<bzq> wss;
  public int wst;
  public int wsu;

  public anx()
  {
    AppMethodBeat.i(114965);
    this.wss = new LinkedList();
    AppMethodBeat.o(114965);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(114966);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(114966);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(2, 8, this.wss);
      if (this.nzz != null)
        paramArrayOfObject.e(3, this.nzz);
      paramArrayOfObject.iz(4, this.wst);
      paramArrayOfObject.iz(5, this.wsu);
      AppMethodBeat.o(114966);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label672;
    label672: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.a.c(2, 8, this.wss);
      paramInt = i;
      if (this.nzz != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.nzz);
      paramInt = paramInt + e.a.a.b.b.a.bs(4, this.wst) + e.a.a.b.b.a.bs(5, this.wsu);
      AppMethodBeat.o(114966);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wss.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(114966);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(114966);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        anx localanx = (anx)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(114966);
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
            localanx.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(114966);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bzq();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bzq)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localanx.wss.add(localObject1);
          }
          AppMethodBeat.o(114966);
          paramInt = i;
          break;
        case 3:
          localanx.nzz = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(114966);
          paramInt = i;
          break;
        case 4:
          localanx.wst = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(114966);
          paramInt = i;
          break;
        case 5:
          localanx.wsu = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(114966);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(114966);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.anx
 * JD-Core Version:    0.6.2
 */