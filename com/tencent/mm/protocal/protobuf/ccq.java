package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class ccq extends bsr
{
  public String jSY;
  public String rOh;
  public int scene;
  public int xbY;
  public int xbZ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56977);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.scene);
      if (this.rOh != null)
        paramArrayOfObject.e(3, this.rOh);
      if (this.jSY != null)
        paramArrayOfObject.e(4, this.jSY);
      paramArrayOfObject.iz(5, this.xbY);
      paramArrayOfObject.iz(6, this.xbZ);
      AppMethodBeat.o(56977);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label591;
    label591: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.scene);
      paramInt = i;
      if (this.rOh != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.rOh);
      i = paramInt;
      if (this.jSY != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.jSY);
      paramInt = i + e.a.a.b.b.a.bs(5, this.xbY) + e.a.a.b.b.a.bs(6, this.xbZ);
      AppMethodBeat.o(56977);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56977);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ccq localccq = (ccq)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56977);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((hl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localccq.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(56977);
          paramInt = i;
          break;
        case 2:
          localccq.scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56977);
          paramInt = i;
          break;
        case 3:
          localccq.rOh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56977);
          paramInt = i;
          break;
        case 4:
          localccq.jSY = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56977);
          paramInt = i;
          break;
        case 5:
          localccq.xbY = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56977);
          paramInt = i;
          break;
        case 6:
          localccq.xbZ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56977);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56977);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.ccq
 * JD-Core Version:    0.6.2
 */