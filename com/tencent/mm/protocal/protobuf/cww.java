package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import java.util.LinkedList;

public final class cww extends bsr
{
  public b vMS;
  public String xfb;
  public String xsB;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(96333);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.xfb != null)
        paramArrayOfObject.e(2, this.xfb);
      if (this.vMS != null)
        paramArrayOfObject.c(3, this.vMS);
      if (this.xsB != null)
        paramArrayOfObject.e(4, this.xsB);
      AppMethodBeat.o(96333);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label516;
    label516: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.xfb != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.xfb);
      paramInt = i;
      if (this.vMS != null)
        paramInt = i + e.a.a.b.b.a.b(3, this.vMS);
      i = paramInt;
      if (this.xsB != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.xsB);
      AppMethodBeat.o(96333);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(96333);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cww localcww = (cww)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(96333);
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
            localcww.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(96333);
          paramInt = i;
          break;
        case 2:
          localcww.xfb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96333);
          paramInt = i;
          break;
        case 3:
          localcww.vMS = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(96333);
          paramInt = i;
          break;
        case 4:
          localcww.xsB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96333);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(96333);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cww
 * JD-Core Version:    0.6.2
 */