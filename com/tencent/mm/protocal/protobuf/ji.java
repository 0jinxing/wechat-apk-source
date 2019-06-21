package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class ji extends bsr
{
  public int vIJ;
  public String vLf;
  public int vLg;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(73691);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.vIJ);
      if (this.vLf != null)
        paramArrayOfObject.e(3, this.vLf);
      paramArrayOfObject.iz(4, this.vLg);
      AppMethodBeat.o(73691);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label480;
    label480: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.vIJ);
      paramInt = i;
      if (this.vLf != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.vLf);
      paramInt += e.a.a.b.b.a.bs(4, this.vLg);
      AppMethodBeat.o(73691);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(73691);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ji localji = (ji)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(73691);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localji.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(73691);
          paramInt = i;
          break;
        case 2:
          localji.vIJ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73691);
          paramInt = i;
          break;
        case 3:
          localji.vLf = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73691);
          paramInt = i;
          break;
        case 4:
          localji.vLg = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73691);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(73691);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ji
 * JD-Core Version:    0.6.2
 */