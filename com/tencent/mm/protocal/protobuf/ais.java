package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class ais extends btd
{
  public int kdT;
  public String kdU;
  public String person_id;
  public String vYl;
  public String woJ;
  public float woK;
  public String woL;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(848);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(848);
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
      if (this.person_id != null)
        paramArrayOfObject.e(4, this.person_id);
      if (this.woJ != null)
        paramArrayOfObject.e(5, this.woJ);
      paramArrayOfObject.r(6, this.woK);
      if (this.vYl != null)
        paramArrayOfObject.e(7, this.vYl);
      if (this.woL != null)
        paramArrayOfObject.e(8, this.woL);
      AppMethodBeat.o(848);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label805;
    label805: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.b.b.a.bs(2, this.kdT);
      i = paramInt;
      if (this.kdU != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.kdU);
      paramInt = i;
      if (this.person_id != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.person_id);
      i = paramInt;
      if (this.woJ != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.woJ);
      i += e.a.a.b.b.a.fv(6) + 4;
      paramInt = i;
      if (this.vYl != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.vYl);
      i = paramInt;
      if (this.woL != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.woL);
      AppMethodBeat.o(848);
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
          AppMethodBeat.o(848);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(848);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ais localais = (ais)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(848);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localais.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(848);
          paramInt = i;
          break;
        case 2:
          localais.kdT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(848);
          paramInt = i;
          break;
        case 3:
          localais.kdU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(848);
          paramInt = i;
          break;
        case 4:
          localais.person_id = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(848);
          paramInt = i;
          break;
        case 5:
          localais.woJ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(848);
          paramInt = i;
          break;
        case 6:
          localais.woK = Float.intBitsToFloat(((e.a.a.a.a)localObject1).BTU.eia());
          AppMethodBeat.o(848);
          paramInt = i;
          break;
        case 7:
          localais.vYl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(848);
          paramInt = i;
          break;
        case 8:
          localais.woL = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(848);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(848);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ais
 * JD-Core Version:    0.6.2
 */