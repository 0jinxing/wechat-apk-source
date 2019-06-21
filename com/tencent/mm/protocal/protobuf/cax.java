package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cax extends bsr
{
  public int jCt;
  public int ptw;
  public int ptx;
  public String xac;
  public int xad;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(94573);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.ptx);
      paramArrayOfObject.iz(3, this.ptw);
      if (this.xac != null)
        paramArrayOfObject.e(4, this.xac);
      paramArrayOfObject.iz(5, this.jCt);
      paramArrayOfObject.iz(6, this.xad);
      AppMethodBeat.o(94573);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label574;
    label574: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.ptx) + e.a.a.b.b.a.bs(3, this.ptw);
      paramInt = i;
      if (this.xac != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.xac);
      paramInt = paramInt + e.a.a.b.b.a.bs(5, this.jCt) + e.a.a.b.b.a.bs(6, this.xad);
      AppMethodBeat.o(94573);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(94573);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cax localcax = (cax)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(94573);
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
            localcax.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(94573);
          paramInt = i;
          break;
        case 2:
          localcax.ptx = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94573);
          paramInt = i;
          break;
        case 3:
          localcax.ptw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94573);
          paramInt = i;
          break;
        case 4:
          localcax.xac = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(94573);
          paramInt = i;
          break;
        case 5:
          localcax.jCt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94573);
          paramInt = i;
          break;
        case 6:
          localcax.xad = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(94573);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(94573);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cax
 * JD-Core Version:    0.6.2
 */