package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bpm extends btd
{
  public String lCH;
  public bpj wRK;
  public int wRY;
  public int wRZ;
  public String wSa;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28607);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wRK == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: rcptinfolist");
        AppMethodBeat.o(28607);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(28607);
        throw paramArrayOfObject;
      }
      if (this.wRK != null)
      {
        paramArrayOfObject.iy(1, this.wRK.computeSize());
        this.wRK.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.wRY);
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(3, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.lCH != null)
        paramArrayOfObject.e(4, this.lCH);
      paramArrayOfObject.iz(5, this.wRZ);
      if (this.wSa != null)
        paramArrayOfObject.e(6, this.wSa);
      AppMethodBeat.o(28607);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wRK == null)
        break label815;
    label815: for (paramInt = e.a.a.a.ix(1, this.wRK.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.wRY);
      paramInt = i;
      if (this.BaseResponse != null)
        paramInt = i + e.a.a.a.ix(3, this.BaseResponse.computeSize());
      i = paramInt;
      if (this.lCH != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.lCH);
      i += e.a.a.b.b.a.bs(5, this.wRZ);
      paramInt = i;
      if (this.wSa != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.wSa);
      AppMethodBeat.o(28607);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wRK == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: rcptinfolist");
          AppMethodBeat.o(28607);
          throw paramArrayOfObject;
        }
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(28607);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28607);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bpm localbpm = (bpm)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28607);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bpj();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bpj)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbpm.wRK = ((bpj)localObject1);
          }
          AppMethodBeat.o(28607);
          paramInt = i;
          break;
        case 2:
          localbpm.wRY = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28607);
          paramInt = i;
          break;
        case 3:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbpm.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(28607);
          paramInt = i;
          break;
        case 4:
          localbpm.lCH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28607);
          paramInt = i;
          break;
        case 5:
          localbpm.wRZ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28607);
          paramInt = i;
          break;
        case 6:
          localbpm.wSa = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28607);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28607);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bpm
 * JD-Core Version:    0.6.2
 */