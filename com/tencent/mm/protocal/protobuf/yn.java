package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class yn extends btd
{
  public LinkedList<cgm> vEh;
  public int vIN;
  public LinkedList<cgl> vIO;
  public int wem;
  public long wen;
  public int weo;
  public int wep;
  public int weq;

  public yn()
  {
    AppMethodBeat.i(28387);
    this.vEh = new LinkedList();
    this.vIO = new LinkedList();
    AppMethodBeat.o(28387);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28388);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(28388);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.wem);
      paramArrayOfObject.ai(3, this.wen);
      paramArrayOfObject.iz(4, this.weo);
      paramArrayOfObject.iz(5, this.wep);
      paramArrayOfObject.e(6, 8, this.vEh);
      paramArrayOfObject.iz(7, this.weq);
      paramArrayOfObject.iz(8, this.vIN);
      paramArrayOfObject.e(9, 8, this.vIO);
      AppMethodBeat.o(28388);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label951;
    label951: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.wem) + e.a.a.b.b.a.o(3, this.wen) + e.a.a.b.b.a.bs(4, this.weo) + e.a.a.b.b.a.bs(5, this.wep) + e.a.a.a.c(6, 8, this.vEh) + e.a.a.b.b.a.bs(7, this.weq) + e.a.a.b.b.a.bs(8, this.vIN) + e.a.a.a.c(9, 8, this.vIO);
      AppMethodBeat.o(28388);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vEh.clear();
        this.vIO.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(28388);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28388);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        yn localyn = (yn)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28388);
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
            localyn.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(28388);
          paramInt = i;
          break;
        case 2:
          localyn.wem = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28388);
          paramInt = i;
          break;
        case 3:
          localyn.wen = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(28388);
          paramInt = i;
          break;
        case 4:
          localyn.weo = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28388);
          paramInt = i;
          break;
        case 5:
          localyn.wep = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28388);
          paramInt = i;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new cgm();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((cgm)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localyn.vEh.add(localObject1);
          }
          AppMethodBeat.o(28388);
          paramInt = i;
          break;
        case 7:
          localyn.weq = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28388);
          paramInt = i;
          break;
        case 8:
          localyn.vIN = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28388);
          paramInt = i;
          break;
        case 9:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new cgl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localyn.vIO.add(paramArrayOfObject);
          }
          AppMethodBeat.o(28388);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28388);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.yn
 * JD-Core Version:    0.6.2
 */