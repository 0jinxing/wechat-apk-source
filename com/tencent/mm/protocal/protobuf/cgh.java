package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cgh extends bsr
{
  public int Scene;
  public int vEr;
  public int wem;
  public long wen;
  public int wkB;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28663);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.wem);
      paramArrayOfObject.ai(3, this.wen);
      paramArrayOfObject.iz(4, this.wkB);
      paramArrayOfObject.iz(5, this.vEr);
      paramArrayOfObject.iz(6, this.Scene);
      AppMethodBeat.o(28663);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label566;
    label566: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.b.b.a.bs(2, this.wem) + e.a.a.b.b.a.o(3, this.wen) + e.a.a.b.b.a.bs(4, this.wkB) + e.a.a.b.b.a.bs(5, this.vEr) + e.a.a.b.b.a.bs(6, this.Scene);
      AppMethodBeat.o(28663);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28663);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cgh localcgh = (cgh)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28663);
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
            localcgh.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(28663);
          paramInt = i;
          break;
        case 2:
          localcgh.wem = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28663);
          paramInt = i;
          break;
        case 3:
          localcgh.wen = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(28663);
          paramInt = i;
          break;
        case 4:
          localcgh.wkB = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28663);
          paramInt = i;
          break;
        case 5:
          localcgh.vEr = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28663);
          paramInt = i;
          break;
        case 6:
          localcgh.Scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28663);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28663);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cgh
 * JD-Core Version:    0.6.2
 */