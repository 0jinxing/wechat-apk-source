package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class aac extends btd
{
  public int kCl;
  public String kCm;
  public String nSX;
  public String nYX;
  public String nZe;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56789);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(56789);
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
      if (this.nYX != null)
        paramArrayOfObject.e(5, this.nYX);
      if (this.nZe != null)
        paramArrayOfObject.e(6, this.nZe);
      AppMethodBeat.o(56789);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label674;
    label674: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.kCl);
      paramInt = i;
      if (this.kCm != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.kCm);
      i = paramInt;
      if (this.nSX != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.nSX);
      paramInt = i;
      if (this.nYX != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.nYX);
      i = paramInt;
      if (this.nZe != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.nZe);
      AppMethodBeat.o(56789);
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
          AppMethodBeat.o(56789);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56789);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aac localaac = (aac)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56789);
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
            localaac.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(56789);
          paramInt = i;
          break;
        case 2:
          localaac.kCl = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56789);
          paramInt = i;
          break;
        case 3:
          localaac.kCm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56789);
          paramInt = i;
          break;
        case 4:
          localaac.nSX = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56789);
          paramInt = i;
          break;
        case 5:
          localaac.nYX = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56789);
          paramInt = i;
          break;
        case 6:
          localaac.nZe = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56789);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56789);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aac
 * JD-Core Version:    0.6.2
 */