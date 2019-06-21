package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bnw extends btd
{
  public int kCl;
  public String kCm;
  public String mLd;
  public int nUf;
  public String pMf;
  public String pMg;
  public int state;
  public String wQY;
  public int wQZ;
  public String wRa;
  public String wRb;
  public String wRc;
  public String wRd;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48940);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(48940);
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
      paramArrayOfObject.iz(4, this.state);
      if (this.wQY != null)
        paramArrayOfObject.e(5, this.wQY);
      paramArrayOfObject.iz(6, this.nUf);
      paramArrayOfObject.iz(7, this.wQZ);
      if (this.pMf != null)
        paramArrayOfObject.e(8, this.pMf);
      if (this.wRa != null)
        paramArrayOfObject.e(9, this.wRa);
      if (this.pMg != null)
        paramArrayOfObject.e(10, this.pMg);
      if (this.wRb != null)
        paramArrayOfObject.e(11, this.wRb);
      if (this.wRc != null)
        paramArrayOfObject.e(12, this.wRc);
      if (this.wRd != null)
        paramArrayOfObject.e(14, this.wRd);
      if (this.mLd != null)
        paramArrayOfObject.e(15, this.mLd);
      AppMethodBeat.o(48940);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label1150;
    label1150: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.kCl);
      paramInt = i;
      if (this.kCm != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.kCm);
      i = paramInt + e.a.a.b.b.a.bs(4, this.state);
      paramInt = i;
      if (this.wQY != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.wQY);
      paramInt = paramInt + e.a.a.b.b.a.bs(6, this.nUf) + e.a.a.b.b.a.bs(7, this.wQZ);
      i = paramInt;
      if (this.pMf != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.pMf);
      paramInt = i;
      if (this.wRa != null)
        paramInt = i + e.a.a.b.b.a.f(9, this.wRa);
      i = paramInt;
      if (this.pMg != null)
        i = paramInt + e.a.a.b.b.a.f(10, this.pMg);
      paramInt = i;
      if (this.wRb != null)
        paramInt = i + e.a.a.b.b.a.f(11, this.wRb);
      i = paramInt;
      if (this.wRc != null)
        i = paramInt + e.a.a.b.b.a.f(12, this.wRc);
      paramInt = i;
      if (this.wRd != null)
        paramInt = i + e.a.a.b.b.a.f(14, this.wRd);
      i = paramInt;
      if (this.mLd != null)
        i = paramInt + e.a.a.b.b.a.f(15, this.mLd);
      AppMethodBeat.o(48940);
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
          AppMethodBeat.o(48940);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(48940);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bnw localbnw = (bnw)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        case 13:
        default:
          paramInt = -1;
          AppMethodBeat.o(48940);
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
            localbnw.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(48940);
          paramInt = i;
          break;
        case 2:
          localbnw.kCl = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48940);
          paramInt = i;
          break;
        case 3:
          localbnw.kCm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48940);
          paramInt = i;
          break;
        case 4:
          localbnw.state = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48940);
          paramInt = i;
          break;
        case 5:
          localbnw.wQY = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48940);
          paramInt = i;
          break;
        case 6:
          localbnw.nUf = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48940);
          paramInt = i;
          break;
        case 7:
          localbnw.wQZ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48940);
          paramInt = i;
          break;
        case 8:
          localbnw.pMf = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48940);
          paramInt = i;
          break;
        case 9:
          localbnw.wRa = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48940);
          paramInt = i;
          break;
        case 10:
          localbnw.pMg = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48940);
          paramInt = i;
          break;
        case 11:
          localbnw.wRb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48940);
          paramInt = i;
          break;
        case 12:
          localbnw.wRc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48940);
          paramInt = i;
          break;
        case 14:
          localbnw.wRd = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48940);
          paramInt = i;
          break;
        case 15:
          localbnw.mLd = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48940);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48940);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bnw
 * JD-Core Version:    0.6.2
 */