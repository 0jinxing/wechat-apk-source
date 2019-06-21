package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class ake extends btd
{
  public int wjY;
  public String wjZ;
  public String wka;
  public int wkb;
  public String wkc;
  public String wpF;
  public String wpG;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56815);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(56815);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.wpF != null)
        paramArrayOfObject.e(2, this.wpF);
      paramArrayOfObject.iz(3, this.wjY);
      if (this.wjZ != null)
        paramArrayOfObject.e(4, this.wjZ);
      if (this.wka != null)
        paramArrayOfObject.e(5, this.wka);
      paramArrayOfObject.iz(6, this.wkb);
      if (this.wkc != null)
        paramArrayOfObject.e(7, this.wkc);
      if (this.wpG != null)
        paramArrayOfObject.e(8, this.wpG);
      AppMethodBeat.o(56815);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label788;
    label788: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wpF != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wpF);
      i += e.a.a.b.b.a.bs(3, this.wjY);
      paramInt = i;
      if (this.wjZ != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.wjZ);
      i = paramInt;
      if (this.wka != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.wka);
      i += e.a.a.b.b.a.bs(6, this.wkb);
      paramInt = i;
      if (this.wkc != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.wkc);
      i = paramInt;
      if (this.wpG != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.wpG);
      AppMethodBeat.o(56815);
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
          AppMethodBeat.o(56815);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56815);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ake localake = (ake)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56815);
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
            localake.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(56815);
          paramInt = i;
          break;
        case 2:
          localake.wpF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56815);
          paramInt = i;
          break;
        case 3:
          localake.wjY = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56815);
          paramInt = i;
          break;
        case 4:
          localake.wjZ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56815);
          paramInt = i;
          break;
        case 5:
          localake.wka = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56815);
          paramInt = i;
          break;
        case 6:
          localake.wkb = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56815);
          paramInt = i;
          break;
        case 7:
          localake.wkc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56815);
          paramInt = i;
          break;
        case 8:
          localake.wpG = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56815);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56815);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ake
 * JD-Core Version:    0.6.2
 */