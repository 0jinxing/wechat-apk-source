package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class aaa extends btd
{
  public int kCl;
  public String kCm;
  public String lvz;
  public String nSX;
  public String nUr;
  public String nUs;
  public int wfi;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56787);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(56787);
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
      if (this.nSX != null)
        paramArrayOfObject.e(4, this.nSX);
      if (this.lvz != null)
        paramArrayOfObject.e(5, this.lvz);
      paramArrayOfObject.iz(6, this.wfi);
      if (this.nUs != null)
        paramArrayOfObject.e(7, this.nUs);
      if (this.nUr != null)
        paramArrayOfObject.e(8, this.nUr);
      AppMethodBeat.o(56787);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label788;
    label788: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.kCl);
      paramInt = i;
      if (this.kCm != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.kCm);
      i = paramInt;
      if (this.nSX != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.nSX);
      paramInt = i;
      if (this.lvz != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.lvz);
      i = paramInt + e.a.a.b.b.a.bs(6, this.wfi);
      paramInt = i;
      if (this.nUs != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.nUs);
      i = paramInt;
      if (this.nUr != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.nUr);
      AppMethodBeat.o(56787);
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
          AppMethodBeat.o(56787);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56787);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aaa localaaa = (aaa)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56787);
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
            localaaa.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(56787);
          paramInt = i;
          break;
        case 2:
          localaaa.kCl = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56787);
          paramInt = i;
          break;
        case 3:
          localaaa.kCm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56787);
          paramInt = i;
          break;
        case 4:
          localaaa.nSX = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56787);
          paramInt = i;
          break;
        case 5:
          localaaa.lvz = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56787);
          paramInt = i;
          break;
        case 6:
          localaaa.wfi = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56787);
          paramInt = i;
          break;
        case 7:
          localaaa.nUs = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56787);
          paramInt = i;
          break;
        case 8:
          localaaa.nUr = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56787);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56787);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aaa
 * JD-Core Version:    0.6.2
 */