package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class bst extends btd
{
  public int kCl;
  public String kCm;
  public String nYX;
  public String nuL;
  public String pMe;
  public String pMf;
  public String vPX;
  public dc wUQ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48956);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(48956);
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
      if (this.nYX != null)
        paramArrayOfObject.e(4, this.nYX);
      if (this.vPX != null)
        paramArrayOfObject.e(5, this.vPX);
      if (this.pMe != null)
        paramArrayOfObject.e(6, this.pMe);
      if (this.pMf != null)
        paramArrayOfObject.e(7, this.pMf);
      if (this.nuL != null)
        paramArrayOfObject.e(8, this.nuL);
      if (this.wUQ != null)
      {
        paramArrayOfObject.iy(9, this.wUQ.computeSize());
        this.wUQ.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(48956);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label964;
    label964: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.kCl);
      paramInt = i;
      if (this.kCm != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.kCm);
      i = paramInt;
      if (this.nYX != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.nYX);
      paramInt = i;
      if (this.vPX != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.vPX);
      i = paramInt;
      if (this.pMe != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.pMe);
      paramInt = i;
      if (this.pMf != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.pMf);
      i = paramInt;
      if (this.nuL != null)
        i = paramInt + e.a.a.b.b.a.f(8, this.nuL);
      paramInt = i;
      if (this.wUQ != null)
        paramInt = i + e.a.a.a.ix(9, this.wUQ.computeSize());
      AppMethodBeat.o(48956);
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
          AppMethodBeat.o(48956);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(48956);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bst localbst = (bst)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48956);
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
            localbst.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(48956);
          paramInt = i;
          break;
        case 2:
          localbst.kCl = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48956);
          paramInt = i;
          break;
        case 3:
          localbst.kCm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48956);
          paramInt = i;
          break;
        case 4:
          localbst.nYX = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48956);
          paramInt = i;
          break;
        case 5:
          localbst.vPX = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48956);
          paramInt = i;
          break;
        case 6:
          localbst.pMe = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48956);
          paramInt = i;
          break;
        case 7:
          localbst.pMf = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48956);
          paramInt = i;
          break;
        case 8:
          localbst.nuL = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48956);
          paramInt = i;
          break;
        case 9:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new dc();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, btd.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbst.wUQ = paramArrayOfObject;
          }
          AppMethodBeat.o(48956);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48956);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bst
 * JD-Core Version:    0.6.2
 */