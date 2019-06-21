package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class amh extends btd
{
  public int kCl;
  public String kCm;
  public String ttP;
  public boolean ttQ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56828);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(56828);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.kCl);
      if (this.kCm != null)
        paramArrayOfObject.e(3, this.kCm);
      if (this.ttP != null)
        paramArrayOfObject.e(4, this.ttP);
      paramArrayOfObject.aO(5, this.ttQ);
      AppMethodBeat.o(56828);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label592;
    label592: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.kCl);
      paramInt = i;
      if (this.kCm != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.kCm);
      i = paramInt;
      if (this.ttP != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.ttP);
      paramInt = i + (e.a.a.b.b.a.fv(5) + 1);
      AppMethodBeat.o(56828);
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
          AppMethodBeat.o(56828);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56828);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        amh localamh = (amh)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56828);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new BaseResponse();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((BaseResponse)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localamh.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(56828);
          paramInt = i;
          break;
        case 2:
          localamh.kCl = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56828);
          paramInt = i;
          break;
        case 3:
          localamh.kCm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56828);
          paramInt = i;
          break;
        case 4:
          localamh.ttP = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56828);
          paramInt = i;
          break;
        case 5:
          localamh.ttQ = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(56828);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56828);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.amh
 * JD-Core Version:    0.6.2
 */