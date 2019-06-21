package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class pj extends btd
{
  public int kCl;
  public String kCm;
  public int vWi;
  public com.tencent.mm.bt.b vWj;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56757);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new e.a.a.b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(56757);
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
      if (this.vWj != null)
        paramArrayOfObject.c(4, this.vWj);
      paramArrayOfObject.iz(5, this.vWi);
      AppMethodBeat.o(56757);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label591;
    label591: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.kCl);
      paramInt = i;
      if (this.kCm != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.kCm);
      i = paramInt;
      if (this.vWj != null)
        i = paramInt + e.a.a.b.b.a.b(4, this.vWj);
      paramInt = i + e.a.a.b.b.a.bs(5, this.vWi);
      AppMethodBeat.o(56757);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = btd.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = btd.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.BaseResponse == null)
        {
          paramArrayOfObject = new e.a.a.b("Not all required fields were included: BaseResponse");
          AppMethodBeat.o(56757);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(56757);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        pj localpj = (pj)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56757);
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
            localpj.BaseResponse = paramArrayOfObject;
          }
          AppMethodBeat.o(56757);
          paramInt = i;
          break;
        case 2:
          localpj.kCl = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56757);
          paramInt = i;
          break;
        case 3:
          localpj.kCm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56757);
          paramInt = i;
          break;
        case 4:
          localpj.vWj = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(56757);
          paramInt = i;
          break;
        case 5:
          localpj.vWi = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56757);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56757);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.pj
 * JD-Core Version:    0.6.2
 */