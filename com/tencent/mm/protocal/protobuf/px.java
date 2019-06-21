package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class px extends btd
{
  public int kCl;
  public String kCm;
  public String pWR;
  public String pWS;
  public String vWW;
  public boolean vWX;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48811);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(48811);
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
      if (this.vWW != null)
        paramArrayOfObject.e(4, this.vWW);
      if (this.pWR != null)
        paramArrayOfObject.e(5, this.pWR);
      paramArrayOfObject.aO(6, this.vWX);
      if (this.pWS != null)
        paramArrayOfObject.e(7, this.pWS);
      AppMethodBeat.o(48811);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label722;
    label722: for (paramInt = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.kCl);
      paramInt = i;
      if (this.kCm != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.kCm);
      i = paramInt;
      if (this.vWW != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.vWW);
      paramInt = i;
      if (this.pWR != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.pWR);
      i = paramInt + (e.a.a.b.b.a.fv(6) + 1);
      paramInt = i;
      if (this.pWS != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.pWS);
      AppMethodBeat.o(48811);
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
          AppMethodBeat.o(48811);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(48811);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        px localpx = (px)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48811);
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
            localpx.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(48811);
          paramInt = i;
          break;
        case 2:
          localpx.kCl = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(48811);
          paramInt = i;
          break;
        case 3:
          localpx.kCm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48811);
          paramInt = i;
          break;
        case 4:
          localpx.vWW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48811);
          paramInt = i;
          break;
        case 5:
          localpx.pWR = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48811);
          paramInt = i;
          break;
        case 6:
          localpx.vWX = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(48811);
          paramInt = i;
          break;
        case 7:
          localpx.pWS = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48811);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48811);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.px
 * JD-Core Version:    0.6.2
 */