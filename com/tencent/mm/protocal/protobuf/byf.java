package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class byf extends bsr
{
  public String luH;
  public SKBuiltinBuffer_t vHH;
  public int wXE;
  public String wdB;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(123519);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.luH != null)
        paramArrayOfObject.e(2, this.luH);
      if (this.wdB != null)
        paramArrayOfObject.e(3, this.wdB);
      if (this.vHH != null)
      {
        paramArrayOfObject.iy(4, this.vHH.computeSize());
        this.vHH.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(5, this.wXE);
      AppMethodBeat.o(123519);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label656;
    label656: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.luH != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.luH);
      i = paramInt;
      if (this.wdB != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wdB);
      paramInt = i;
      if (this.vHH != null)
        paramInt = i + e.a.a.a.ix(4, this.vHH.computeSize());
      paramInt += e.a.a.b.b.a.bs(5, this.wXE);
      AppMethodBeat.o(123519);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(123519);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        byf localbyf = (byf)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(123519);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbyf.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(123519);
          paramInt = i;
          break;
        case 2:
          localbyf.luH = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(123519);
          paramInt = i;
          break;
        case 3:
          localbyf.wdB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(123519);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbyf.vHH = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(123519);
          paramInt = i;
          break;
        case 5:
          localbyf.wXE = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(123519);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(123519);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.byf
 * JD-Core Version:    0.6.2
 */