package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class arc extends btd
{
  public String cDL;
  public int ret;
  public String url;
  public int wnU;
  public bie wuN;
  public LinkedList<bde> wuO;
  public String wuP;

  public arc()
  {
    AppMethodBeat.i(96235);
    this.wuO = new LinkedList();
    AppMethodBeat.o(96235);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(96236);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(96236);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.ret);
      if (this.url != null)
        paramArrayOfObject.e(3, this.url);
      paramArrayOfObject.iz(4, this.wnU);
      if (this.cDL != null)
        paramArrayOfObject.e(5, this.cDL);
      if (this.wuN != null)
      {
        paramArrayOfObject.iy(6, this.wuN.computeSize());
        this.wuN.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(7, 8, this.wuO);
      if (this.wuP != null)
        paramArrayOfObject.e(8, this.wuP);
      AppMethodBeat.o(96236);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label966;
    label966: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.ret);
      paramInt = i;
      if (this.url != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.url);
      i = paramInt + e.a.a.b.b.a.bs(4, this.wnU);
      paramInt = i;
      if (this.cDL != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.cDL);
      i = paramInt;
      if (this.wuN != null)
        i = paramInt + e.a.a.a.ix(6, this.wuN.computeSize());
      i += e.a.a.a.c(7, 8, this.wuO);
      paramInt = i;
      if (this.wuP != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.wuP);
      AppMethodBeat.o(96236);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wuO.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(96236);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(96236);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        arc localarc = (arc)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(96236);
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
            localarc.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(96236);
          paramInt = i;
          break;
        case 2:
          localarc.ret = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96236);
          paramInt = i;
          break;
        case 3:
          localarc.url = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96236);
          paramInt = i;
          break;
        case 4:
          localarc.wnU = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96236);
          paramInt = i;
          break;
        case 5:
          localarc.cDL = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96236);
          paramInt = i;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bie();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bie)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localarc.wuN = ((bie)localObject1);
          }
          AppMethodBeat.o(96236);
          paramInt = i;
          break;
        case 7:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bde();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bde)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localarc.wuO.add(localObject1);
          }
          AppMethodBeat.o(96236);
          paramInt = i;
          break;
        case 8:
          localarc.wuP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96236);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(96236);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.arc
 * JD-Core Version:    0.6.2
 */