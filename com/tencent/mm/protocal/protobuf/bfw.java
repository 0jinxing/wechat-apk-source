package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bfw extends btd
{
  public int kdT;
  public String kdU;
  public String vLa;
  public bks vLc;
  public String wJH;
  public boolean wJI;
  public boolean wJJ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48904);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(48904);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.kdT);
      if (this.kdU != null)
        paramArrayOfObject.e(3, this.kdU);
      if (this.wJH != null)
        paramArrayOfObject.e(4, this.wJH);
      if (this.vLa != null)
        paramArrayOfObject.e(7, this.vLa);
      if (this.vLc != null)
      {
        paramArrayOfObject.iy(8, this.vLc.computeSize());
        this.vLc.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.aO(9, this.wJI);
      paramArrayOfObject.aO(10, this.wJJ);
      AppMethodBeat.o(48904);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label869;
    label869: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.kdT);
      paramInt = i;
      if (this.kdU != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.kdU);
      i = paramInt;
      if (this.wJH != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.wJH);
      paramInt = i;
      if (this.vLa != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.vLa);
      i = paramInt;
      if (this.vLc != null)
        i = paramInt + e.a.a.a.ix(8, this.vLc.computeSize());
      paramInt = i + (e.a.a.b.b.a.fv(9) + 1) + (e.a.a.b.b.a.fv(10) + 1);
      AppMethodBeat.o(48904);
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
          AppMethodBeat.o(48904);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(48904);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bfw localbfw = (bfw)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 5:
        case 6:
        default:
          paramInt = -1;
          AppMethodBeat.o(48904);
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
            localbfw.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(48904);
          paramInt = i;
          break;
        case 2:
          localbfw.kdT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48904);
          paramInt = i;
          break;
        case 3:
          localbfw.kdU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48904);
          paramInt = i;
          break;
        case 4:
          localbfw.wJH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48904);
          paramInt = i;
          break;
        case 7:
          localbfw.vLa = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48904);
          paramInt = i;
          break;
        case 8:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bks();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbfw.vLc = paramArrayOfObject;
          }
          AppMethodBeat.o(48904);
          paramInt = i;
          break;
        case 9:
          localbfw.wJI = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(48904);
          paramInt = i;
          break;
        case 10:
          localbfw.wJJ = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(48904);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48904);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bfw
 * JD-Core Version:    0.6.2
 */