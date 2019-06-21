package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class anb extends btd
{
  public int wrF;
  public SKBuiltinBuffer_t wrG;
  public String wrH;
  public String wrI;
  public String wrJ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80096);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(80096);
        throw paramArrayOfObject;
      }
      if (this.wrG == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: QRCode");
        AppMethodBeat.o(80096);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.wrG != null)
      {
        paramArrayOfObject.iy(2, this.wrG.computeSize());
        this.wrG.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(5, this.wrF);
      if (this.wrH != null)
        paramArrayOfObject.e(6, this.wrH);
      if (this.wrI != null)
        paramArrayOfObject.e(7, this.wrI);
      if (this.wrJ != null)
        paramArrayOfObject.e(8, this.wrJ);
      AppMethodBeat.o(80096);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label827;
    label827: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wrG != null)
        i = paramInt + e.a.a.a.ix(2, this.wrG.computeSize());
      i += e.a.a.b.b.a.bs(5, this.wrF);
      paramInt = i;
      if (this.wrH != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.wrH);
      i = paramInt;
      if (this.wrI != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.wrI);
      paramInt = i;
      if (this.wrJ != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.wrJ);
      AppMethodBeat.o(80096);
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
          AppMethodBeat.o(80096);
          throw paramArrayOfObject;
        }
        if (this.wrG == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: QRCode");
          AppMethodBeat.o(80096);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(80096);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        anb localanb = (anb)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        case 3:
        case 4:
        default:
          AppMethodBeat.o(80096);
          paramInt = -1;
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
            localanb.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(80096);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localanb.wrG = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(80096);
          paramInt = i;
          break;
        case 5:
          localanb.wrF = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80096);
          paramInt = i;
          break;
        case 6:
          localanb.wrH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80096);
          paramInt = i;
          break;
        case 7:
          localanb.wrI = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80096);
          paramInt = i;
          break;
        case 8:
          localanb.wrJ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(80096);
          paramInt = i;
          break;
        }
      }
      AppMethodBeat.o(80096);
      paramInt = -1;
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.anb
 * JD-Core Version:    0.6.2
 */