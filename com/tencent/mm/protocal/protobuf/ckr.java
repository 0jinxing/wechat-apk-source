package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class ckr extends btd
{
  public String fKh;
  public String fKk;
  public String jBB;
  public int pcX;
  public int ptw;
  public int ptx;
  public int pty;
  public String xit;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28688);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseResponse == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: BaseResponse");
        AppMethodBeat.o(28688);
        throw paramArrayOfObject;
      }
      if (this.BaseResponse != null)
      {
        paramArrayOfObject.iy(1, this.BaseResponse.computeSize());
        this.BaseResponse.writeFields(paramArrayOfObject);
      }
      if (this.fKh != null)
        paramArrayOfObject.e(2, this.fKh);
      if (this.fKk != null)
        paramArrayOfObject.e(3, this.fKk);
      if (this.xit != null)
        paramArrayOfObject.e(4, this.xit);
      if (this.jBB != null)
        paramArrayOfObject.e(5, this.jBB);
      paramArrayOfObject.iz(6, this.ptw);
      paramArrayOfObject.iz(7, this.ptx);
      paramArrayOfObject.iz(8, this.pty);
      paramArrayOfObject.iz(9, this.pcX);
      AppMethodBeat.o(28688);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseResponse == null)
        break label831;
    label831: for (i = e.a.a.a.ix(1, this.BaseResponse.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.fKh != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.fKh);
      i = paramInt;
      if (this.fKk != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.fKk);
      paramInt = i;
      if (this.xit != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.xit);
      i = paramInt;
      if (this.jBB != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.jBB);
      paramInt = i + e.a.a.b.b.a.bs(6, this.ptw) + e.a.a.b.b.a.bs(7, this.ptx) + e.a.a.b.b.a.bs(8, this.pty) + e.a.a.b.b.a.bs(9, this.pcX);
      AppMethodBeat.o(28688);
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
          AppMethodBeat.o(28688);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(28688);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ckr localckr = (ckr)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28688);
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
            localckr.BaseResponse = ((BaseResponse)localObject1);
          }
          AppMethodBeat.o(28688);
          paramInt = i;
          break;
        case 2:
          localckr.fKh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28688);
          paramInt = i;
          break;
        case 3:
          localckr.fKk = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28688);
          paramInt = i;
          break;
        case 4:
          localckr.xit = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28688);
          paramInt = i;
          break;
        case 5:
          localckr.jBB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28688);
          paramInt = i;
          break;
        case 6:
          localckr.ptw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28688);
          paramInt = i;
          break;
        case 7:
          localckr.ptx = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28688);
          paramInt = i;
          break;
        case 8:
          localckr.pty = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28688);
          paramInt = i;
          break;
        case 9:
          localckr.pcX = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28688);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28688);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ckr
 * JD-Core Version:    0.6.2
 */