package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class aya extends btd
{
  public int qJO;
  public int wCg;
  public int wCh;
  public int wCi;
  public int wod;
  public LinkedList<axv> woe;

  public aya()
  {
    AppMethodBeat.i(55528);
    this.woe = new LinkedList();
    AppMethodBeat.o(55528);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(55529);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(55529);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.wod);
      paramArrayOfObject.e(3, 8, this.woe);
      paramArrayOfObject.iz(4, this.qJO);
      paramArrayOfObject.iz(5, this.wCg);
      paramArrayOfObject.iz(6, this.wCh);
      paramArrayOfObject.iz(7, this.wCi);
      AppMethodBeat.o(55529);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label747;
    label747: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.wod) + e.a.a.a.c(3, 8, this.woe) + e.a.a.b.b.a.bs(4, this.qJO) + e.a.a.b.b.a.bs(5, this.wCg) + e.a.a.b.b.a.bs(6, this.wCh) + e.a.a.b.b.a.bs(7, this.wCi);
      AppMethodBeat.o(55529);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.woe.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(55529);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(55529);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aya localaya = (aya)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(55529);
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
            localaya.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(55529);
          paramInt = i;
          break;
        case 2:
          localaya.wod = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(55529);
          paramInt = i;
          break;
        case 3:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new axv();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((axv)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaya.woe.add(localObject1);
          }
          AppMethodBeat.o(55529);
          paramInt = i;
          break;
        case 4:
          localaya.qJO = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(55529);
          paramInt = i;
          break;
        case 5:
          localaya.wCg = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(55529);
          paramInt = i;
          break;
        case 6:
          localaya.wCh = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(55529);
          paramInt = i;
          break;
        case 7:
          localaya.wCi = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(55529);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(55529);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aya
 * JD-Core Version:    0.6.2
 */