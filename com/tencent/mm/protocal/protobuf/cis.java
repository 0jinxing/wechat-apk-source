package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cis extends com.tencent.mm.bt.a
{
  public int Ret;
  public SKBuiltinBuffer_t wlw;
  public int xhA;
  public String xhD;
  public String xhE;
  public int xhF;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(28675);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.xhA);
      if (this.xhD != null)
        paramArrayOfObject.e(2, this.xhD);
      paramArrayOfObject.iz(3, this.Ret);
      if (this.xhE != null)
        paramArrayOfObject.e(4, this.xhE);
      if (this.wlw != null)
      {
        paramArrayOfObject.iy(5, this.wlw.computeSize());
        this.wlw.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(6, this.xhF);
      AppMethodBeat.o(28675);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.xhA) + 0;
        paramInt = i;
        if (this.xhD != null)
          paramInt = i + e.a.a.b.b.a.f(2, this.xhD);
        i = paramInt + e.a.a.b.b.a.bs(3, this.Ret);
        paramInt = i;
        if (this.xhE != null)
          paramInt = i + e.a.a.b.b.a.f(4, this.xhE);
        i = paramInt;
        if (this.wlw != null)
          i = paramInt + e.a.a.a.ix(5, this.wlw.computeSize());
        paramInt = i + e.a.a.b.b.a.bs(6, this.xhF);
        AppMethodBeat.o(28675);
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28675);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cis localcis = (cis)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28675);
          break;
        case 1:
          localcis.xhA = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28675);
          paramInt = 0;
          break;
        case 2:
          localcis.xhD = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28675);
          paramInt = 0;
          break;
        case 3:
          localcis.Ret = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28675);
          paramInt = 0;
          break;
        case 4:
          localcis.xhE = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28675);
          paramInt = 0;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new SKBuiltinBuffer_t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((SKBuiltinBuffer_t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localcis.wlw = ((SKBuiltinBuffer_t)localObject1);
          }
          AppMethodBeat.o(28675);
          paramInt = 0;
          break;
        case 6:
          localcis.xhF = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28675);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(28675);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cis
 * JD-Core Version:    0.6.2
 */