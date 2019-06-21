package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import java.util.LinkedList;

public final class caa extends btd
{
  public String wDM;
  public String wYV;
  public String wYW;
  public String wYX;
  public int wZh;
  public int wZi;
  public int wZj;
  public b wZk;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(124364);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.wYV != null)
        paramArrayOfObject.e(2, this.wYV);
      paramArrayOfObject.iz(3, this.wZh);
      paramArrayOfObject.iz(4, this.wZi);
      if (this.wYW != null)
        paramArrayOfObject.e(5, this.wYW);
      if (this.wYX != null)
        paramArrayOfObject.e(6, this.wYX);
      paramArrayOfObject.iz(7, this.wZj);
      if (this.wDM != null)
        paramArrayOfObject.e(8, this.wDM);
      if (this.wZk != null)
        paramArrayOfObject.c(9, this.wZk);
      AppMethodBeat.o(124364);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label788;
    label788: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wYV != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wYV);
      i = i + e.a.a.b.b.a.bs(3, this.wZh) + e.a.a.b.b.a.bs(4, this.wZi);
      paramInt = i;
      if (this.wYW != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.wYW);
      i = paramInt;
      if (this.wYX != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.wYX);
      i += e.a.a.b.b.a.bs(7, this.wZj);
      paramInt = i;
      if (this.wDM != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.wDM);
      i = paramInt;
      if (this.wZk != null)
        i = paramInt + e.a.a.b.b.a.b(9, this.wZk);
      AppMethodBeat.o(124364);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(124364);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        caa localcaa = (caa)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(124364);
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
            localcaa.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(124364);
          paramInt = i;
          break;
        case 2:
          localcaa.wYV = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(124364);
          paramInt = i;
          break;
        case 3:
          localcaa.wZh = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(124364);
          paramInt = i;
          break;
        case 4:
          localcaa.wZi = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(124364);
          paramInt = i;
          break;
        case 5:
          localcaa.wYW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(124364);
          paramInt = i;
          break;
        case 6:
          localcaa.wYX = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(124364);
          paramInt = i;
          break;
        case 7:
          localcaa.wZj = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(124364);
          paramInt = i;
          break;
        case 8:
          localcaa.wDM = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(124364);
          paramInt = i;
          break;
        case 9:
          localcaa.wZk = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(124364);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(124364);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.caa
 * JD-Core Version:    0.6.2
 */