package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class byo extends btd
{
  public int Ret;
  public int jBv;
  public String phA;
  public LinkedList<bym> wXM;
  public int wXN;

  public byo()
  {
    AppMethodBeat.i(28644);
    this.wXM = new LinkedList();
    AppMethodBeat.o(28644);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28645);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(28645);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.jBv);
      paramArrayOfObject.e(3, 8, this.wXM);
      if (this.phA != null)
        paramArrayOfObject.e(4, this.phA);
      paramArrayOfObject.iz(5, this.wXN);
      paramArrayOfObject.iz(6, this.Ret);
      AppMethodBeat.o(28645);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label735;
    label735: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.jBv) + e.a.a.a.c(3, 8, this.wXM);
      paramInt = i;
      if (this.phA != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.phA);
      paramInt = paramInt + e.a.a.b.b.a.bs(5, this.wXN) + e.a.a.b.b.a.bs(6, this.Ret);
      AppMethodBeat.o(28645);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wXM.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(28645);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28645);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        byo localbyo = (byo)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28645);
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
            localbyo.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(28645);
          paramInt = i;
          break;
        case 2:
          localbyo.jBv = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28645);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bym();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bym)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbyo.wXM.add(localObject1);
          }
          AppMethodBeat.o(28645);
          paramInt = i;
          break;
        case 4:
          localbyo.phA = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28645);
          paramInt = i;
          break;
        case 5:
          localbyo.wXN = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28645);
          paramInt = i;
          break;
        case 6:
          localbyo.Ret = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28645);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28645);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.byo
 * JD-Core Version:    0.6.2
 */