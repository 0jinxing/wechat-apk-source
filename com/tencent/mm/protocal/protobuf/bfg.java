package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bfg extends btd
{
  public int kdT;
  public String kdU;
  public String tfp;
  public String tfq;
  public String tfr;
  public int tfs;
  public String tgu;
  public azb wJa;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56867);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(56867);
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
      if (this.wJa != null)
      {
        paramArrayOfObject.iy(4, this.wJa.computeSize());
        this.wJa.writeFields(paramArrayOfObject);
      }
      if (this.tfp != null)
        paramArrayOfObject.e(5, this.tfp);
      if (this.tfq != null)
        paramArrayOfObject.e(6, this.tfq);
      if (this.tfr != null)
        paramArrayOfObject.e(7, this.tfr);
      paramArrayOfObject.iz(8, this.tfs);
      if (this.tgu != null)
        paramArrayOfObject.e(100, this.tgu);
      AppMethodBeat.o(56867);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label983;
    label983: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.kdT);
      paramInt = i;
      if (this.kdU != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.kdU);
      int j = paramInt;
      if (this.wJa != null)
        j = paramInt + e.a.a.a.ix(4, this.wJa.computeSize());
      i = j;
      if (this.tfp != null)
        i = j + e.a.a.b.b.a.f(5, this.tfp);
      paramInt = i;
      if (this.tfq != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.tfq);
      i = paramInt;
      if (this.tfr != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.tfr);
      i += e.a.a.b.b.a.bs(8, this.tfs);
      paramInt = i;
      if (this.tgu != null)
        paramInt = i + e.a.a.b.b.a.f(100, this.tgu);
      AppMethodBeat.o(56867);
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
          AppMethodBeat.o(56867);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56867);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bfg localbfg = (bfg)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56867);
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
            localbfg.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(56867);
          paramInt = i;
          break;
        case 2:
          localbfg.kdT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56867);
          paramInt = i;
          break;
        case 3:
          localbfg.kdU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56867);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new azb();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbfg.wJa = paramArrayOfObject;
          }
          AppMethodBeat.o(56867);
          paramInt = i;
          break;
        case 5:
          localbfg.tfp = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56867);
          paramInt = i;
          break;
        case 6:
          localbfg.tfq = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56867);
          paramInt = i;
          break;
        case 7:
          localbfg.tfr = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56867);
          paramInt = i;
          break;
        case 8:
          localbfg.tfs = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56867);
          paramInt = i;
          break;
        case 100:
          localbfg.tgu = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56867);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56867);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bfg
 * JD-Core Version:    0.6.2
 */