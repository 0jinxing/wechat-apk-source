package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class aqo extends btd
{
  public int CellCount;
  public LinkedList<crt> CellList;
  public String wuk;
  public String wum;
  public int wun;
  public String wuo;
  public String wup;
  public String wuq;

  public aqo()
  {
    AppMethodBeat.i(28505);
    this.CellList = new LinkedList();
    AppMethodBeat.o(28505);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28506);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(28506);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.CellCount);
      paramArrayOfObject.e(3, 8, this.CellList);
      if (this.wum != null)
        paramArrayOfObject.e(4, this.wum);
      if (this.wuk != null)
        paramArrayOfObject.e(5, this.wuk);
      paramArrayOfObject.iz(6, this.wun);
      if (this.wuo != null)
        paramArrayOfObject.e(7, this.wuo);
      if (this.wup != null)
        paramArrayOfObject.e(8, this.wup);
      if (this.wuq != null)
        paramArrayOfObject.e(9, this.wuq);
      AppMethodBeat.o(28506);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label950;
    label950: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.CellCount) + e.a.a.a.c(3, 8, this.CellList);
      paramInt = i;
      if (this.wum != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.wum);
      i = paramInt;
      if (this.wuk != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.wuk);
      paramInt = i + e.a.a.b.b.a.bs(6, this.wun);
      i = paramInt;
      if (this.wuo != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.wuo);
      paramInt = i;
      if (this.wup != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.wup);
      i = paramInt;
      if (this.wuq != null)
        i = paramInt + e.a.a.b.b.a.f(9, this.wuq);
      AppMethodBeat.o(28506);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.CellList.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(28506);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28506);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aqo localaqo = (aqo)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28506);
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
            localaqo.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(28506);
          paramInt = i;
          break;
        case 2:
          localaqo.CellCount = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28506);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new crt();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaqo.CellList.add(paramArrayOfObject);
          }
          AppMethodBeat.o(28506);
          paramInt = i;
          break;
        case 4:
          localaqo.wum = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28506);
          paramInt = i;
          break;
        case 5:
          localaqo.wuk = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28506);
          paramInt = i;
          break;
        case 6:
          localaqo.wun = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28506);
          paramInt = i;
          break;
        case 7:
          localaqo.wuo = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28506);
          paramInt = i;
          break;
        case 8:
          localaqo.wup = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28506);
          paramInt = i;
          break;
        case 9:
          localaqo.wuq = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28506);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28506);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aqo
 * JD-Core Version:    0.6.2
 */