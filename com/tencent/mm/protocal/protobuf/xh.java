package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import e.a.a.b;
import java.util.LinkedList;

public final class xh extends bsr
{
  public int jCt;
  public int vOq;
  public bic wde;
  public int wdf;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(80048);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wde == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Package");
        AppMethodBeat.o(80048);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.wde != null)
      {
        paramArrayOfObject.iy(2, this.wde.computeSize());
        this.wde.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(3, this.vOq);
      paramArrayOfObject.iz(4, this.wdf);
      paramArrayOfObject.iz(5, this.jCt);
      AppMethodBeat.o(80048);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label669;
    label669: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wde != null)
        i = paramInt + e.a.a.a.ix(2, this.wde.computeSize());
      paramInt = i + e.a.a.b.b.a.bs(3, this.vOq) + e.a.a.b.b.a.bs(4, this.wdf) + e.a.a.b.b.a.bs(5, this.jCt);
      AppMethodBeat.o(80048);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.wde == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Package");
          AppMethodBeat.o(80048);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(80048);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        xh localxh = (xh)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(80048);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((hl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localxh.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(80048);
          paramInt = i;
          break;
        case 2:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bic();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bic)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localxh.wde = ((bic)localObject1);
          }
          AppMethodBeat.o(80048);
          paramInt = i;
          break;
        case 3:
          localxh.vOq = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80048);
          paramInt = i;
          break;
        case 4:
          localxh.wdf = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80048);
          paramInt = i;
          break;
        case 5:
          localxh.jCt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(80048);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(80048);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.xh
 * JD-Core Version:    0.6.2
 */