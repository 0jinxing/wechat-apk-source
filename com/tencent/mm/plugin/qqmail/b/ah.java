package com.tencent.mm.plugin.qqmail.b;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.BaseResponse;
import com.tencent.mm.protocal.protobuf.btd;
import e.a.a.b;
import java.util.LinkedList;

public final class ah extends btd
{
  public String ptE;
  public String ptv;
  public int ptw;
  public int ptx;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(68074);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(68074);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.ptx);
      if (this.ptE != null)
        paramArrayOfObject.e(3, this.ptE);
      paramArrayOfObject.iz(4, this.ptw);
      if (this.ptv != null)
        paramArrayOfObject.e(5, this.ptv);
      AppMethodBeat.o(68074);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label592;
    label592: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.ptx);
      paramInt = i;
      if (this.ptE != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.ptE);
      i = paramInt + e.a.a.b.b.a.bs(4, this.ptw);
      paramInt = i;
      if (this.ptv != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.ptv);
      AppMethodBeat.o(68074);
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
          AppMethodBeat.o(68074);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(68074);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ah localah = (ah)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(68074);
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
            localah.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(68074);
          paramInt = i;
          break;
        case 2:
          localah.ptx = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(68074);
          paramInt = i;
          break;
        case 3:
          localah.ptE = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(68074);
          paramInt = i;
          break;
        case 4:
          localah.ptw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(68074);
          paramInt = i;
          break;
        case 5:
          localah.ptv = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(68074);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(68074);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.qqmail.b.ah
 * JD-Core Version:    0.6.2
 */