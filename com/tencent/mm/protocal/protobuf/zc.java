package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import d.a.a.g;
import java.util.LinkedList;

public final class zc extends btd
{
  public int kdT;
  public String kdU;
  public LinkedList<g> wew;
  public int wex;
  public d.a.a.a wey;

  public zc()
  {
    AppMethodBeat.i(56776);
    this.wew = new LinkedList();
    AppMethodBeat.o(56776);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56777);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.kdT);
      if (this.kdU != null)
        paramArrayOfObject.e(3, this.kdU);
      paramArrayOfObject.e(4, 8, this.wew);
      paramArrayOfObject.iz(5, this.wex);
      if (this.wey != null)
      {
        paramArrayOfObject.iy(6, this.wey.computeSize());
        this.wey.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(56777);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label784;
    label784: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.kdT);
      paramInt = i;
      if (this.kdU != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.kdU);
      i = paramInt + e.a.a.a.c(4, 8, this.wew) + e.a.a.b.b.a.bs(5, this.wex);
      paramInt = i;
      if (this.wey != null)
        paramInt = i + e.a.a.a.ix(6, this.wey.computeSize());
      AppMethodBeat.o(56777);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wew.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56777);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        zc localzc = (zc)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56777);
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
            localzc.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(56777);
          paramInt = i;
          break;
        case 2:
          localzc.kdT = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56777);
          paramInt = i;
          break;
        case 3:
          localzc.kdU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56777);
          paramInt = i;
          break;
        case 4:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new g();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localzc.wew.add(paramArrayOfObject);
          }
          AppMethodBeat.o(56777);
          paramInt = i;
          break;
        case 5:
          localzc.wex = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56777);
          paramInt = i;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new d.a.a.a();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((d.a.a.a)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localzc.wey = ((d.a.a.a)localObject1);
          }
          AppMethodBeat.o(56777);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56777);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.zc
 * JD-Core Version:    0.6.2
 */