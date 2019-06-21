package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class qj extends btd
{
  public int kCl;
  public String kCm;
  public String pMd;
  public String pMe;
  public String pMf;
  public String vHu;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48815);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(48815);
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
      if (this.pMd != null)
        paramArrayOfObject.e(4, this.pMd);
      if (this.pMe != null)
        paramArrayOfObject.e(5, this.pMe);
      if (this.pMf != null)
        paramArrayOfObject.e(6, this.pMf);
      if (this.vHu != null)
        paramArrayOfObject.e(7, this.vHu);
      AppMethodBeat.o(48815);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label741;
    label741: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.b.b.a.bs(2, this.kCl);
      i = paramInt;
      if (this.kCm != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.kCm);
      paramInt = i;
      if (this.pMd != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.pMd);
      i = paramInt;
      if (this.pMe != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.pMe);
      paramInt = i;
      if (this.pMf != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.pMf);
      i = paramInt;
      if (this.vHu != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.vHu);
      AppMethodBeat.o(48815);
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
          AppMethodBeat.o(48815);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(48815);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        qj localqj = (qj)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48815);
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
            localqj.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(48815);
          paramInt = i;
          break;
        case 2:
          localqj.kCl = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48815);
          paramInt = i;
          break;
        case 3:
          localqj.kCm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48815);
          paramInt = i;
          break;
        case 4:
          localqj.pMd = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48815);
          paramInt = i;
          break;
        case 5:
          localqj.pMe = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48815);
          paramInt = i;
          break;
        case 6:
          localqj.pMf = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48815);
          paramInt = i;
          break;
        case 7:
          localqj.vHu = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48815);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48815);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.qj
 * JD-Core Version:    0.6.2
 */