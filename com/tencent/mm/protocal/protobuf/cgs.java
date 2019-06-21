package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class cgs extends btd
{
  public int wNe;
  public String wNf;
  public SKBuiltinBuffer_t wxA;
  public int wxB;
  public String wxC;
  public int wxD;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56988);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(56988);
        throw paramArrayOfObject;
      }
      if (this.wxA == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: RetText");
        AppMethodBeat.o(56988);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.wxA != null)
      {
        paramArrayOfObject.iy(2, this.wxA.computeSize());
        this.wxA.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(3, this.wxB);
      if (this.wxC != null)
        paramArrayOfObject.e(4, this.wxC);
      paramArrayOfObject.iz(5, this.wxD);
      paramArrayOfObject.iz(6, this.wNe);
      if (this.wNf != null)
        paramArrayOfObject.e(7, this.wNf);
      AppMethodBeat.o(56988);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label845;
    label845: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wxA != null)
        i = paramInt + e.a.a.a.ix(2, this.wxA.computeSize());
      i += e.a.a.b.b.a.bs(3, this.wxB);
      paramInt = i;
      if (this.wxC != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.wxC);
      i = paramInt + e.a.a.b.b.a.bs(5, this.wxD) + e.a.a.b.b.a.bs(6, this.wNe);
      paramInt = i;
      if (this.wNf != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.wNf);
      AppMethodBeat.o(56988);
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
          AppMethodBeat.o(56988);
          throw paramArrayOfObject;
        }
        if (this.wxA == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: RetText");
          AppMethodBeat.o(56988);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56988);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cgs localcgs = (cgs)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56988);
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
            localcgs.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(56988);
          paramInt = i;
          break;
        case 2:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcgs.wxA = paramArrayOfObject;
          }
          AppMethodBeat.o(56988);
          paramInt = i;
          break;
        case 3:
          localcgs.wxB = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56988);
          paramInt = i;
          break;
        case 4:
          localcgs.wxC = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56988);
          paramInt = i;
          break;
        case 5:
          localcgs.wxD = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56988);
          paramInt = i;
          break;
        case 6:
          localcgs.wNe = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56988);
          paramInt = i;
          break;
        case 7:
          localcgs.wNf = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56988);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56988);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cgs
 * JD-Core Version:    0.6.2
 */