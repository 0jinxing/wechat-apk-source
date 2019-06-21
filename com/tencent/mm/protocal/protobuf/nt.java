package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class nt extends com.tencent.mm.bt.a
{
  public String vTj;
  public int vTk;
  public String vTl;
  public ny vTm;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(89027);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vTj != null)
        paramArrayOfObject.e(1, this.vTj);
      paramArrayOfObject.iz(2, this.vTk);
      if (this.vTl != null)
        paramArrayOfObject.e(3, this.vTl);
      if (this.vTm != null)
      {
        paramArrayOfObject.iy(4, this.vTm.computeSize());
        this.vTm.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(89027);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vTj == null)
        break label501;
    label501: for (paramInt = e.a.a.b.b.a.f(1, this.vTj) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.vTk);
      paramInt = i;
      if (this.vTl != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.vTl);
      i = paramInt;
      if (this.vTm != null)
        i = paramInt + e.a.a.a.ix(4, this.vTm.computeSize());
      AppMethodBeat.o(89027);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(89027);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        nt localnt = (nt)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(89027);
          break;
        case 1:
          localnt.vTj = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89027);
          paramInt = i;
          break;
        case 2:
          localnt.vTk = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89027);
          paramInt = i;
          break;
        case 3:
          localnt.vTl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89027);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new ny();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((ny)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localnt.vTm = ((ny)localObject1);
          }
          AppMethodBeat.o(89027);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(89027);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.nt
 * JD-Core Version:    0.6.2
 */