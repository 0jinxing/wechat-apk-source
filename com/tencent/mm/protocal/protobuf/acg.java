package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class acg extends btd
{
  public int wjY;
  public String wjZ;
  public String wka;
  public int wkb;
  public String wkc;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56797);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(56797);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.wjY);
      if (this.wjZ != null)
        paramArrayOfObject.e(3, this.wjZ);
      if (this.wka != null)
        paramArrayOfObject.e(4, this.wka);
      paramArrayOfObject.iz(5, this.wkb);
      if (this.wkc != null)
        paramArrayOfObject.e(6, this.wkc);
      AppMethodBeat.o(56797);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label659;
    label659: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.wjY);
      paramInt = i;
      if (this.wjZ != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.wjZ);
      i = paramInt;
      if (this.wka != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.wka);
      i += e.a.a.b.b.a.bs(5, this.wkb);
      paramInt = i;
      if (this.wkc != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.wkc);
      AppMethodBeat.o(56797);
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
          AppMethodBeat.o(56797);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56797);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        acg localacg = (acg)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56797);
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
            localacg.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(56797);
          paramInt = i;
          break;
        case 2:
          localacg.wjY = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56797);
          paramInt = i;
          break;
        case 3:
          localacg.wjZ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56797);
          paramInt = i;
          break;
        case 4:
          localacg.wka = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56797);
          paramInt = i;
          break;
        case 5:
          localacg.wkb = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56797);
          paramInt = i;
          break;
        case 6:
          localacg.wkc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56797);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56797);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.acg
 * JD-Core Version:    0.6.2
 */