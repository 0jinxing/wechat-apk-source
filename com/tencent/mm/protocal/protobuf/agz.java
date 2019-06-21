package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class agz extends com.tencent.mm.bt.a
{
  public String wno;
  public ph wnu;
  public String wnv;
  public boolean wnw;
  public int wnx;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(89091);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.wnu != null)
      {
        paramArrayOfObject.iy(1, this.wnu.computeSize());
        this.wnu.writeFields(paramArrayOfObject);
      }
      if (this.wno != null)
        paramArrayOfObject.e(2, this.wno);
      if (this.wnv != null)
        paramArrayOfObject.e(3, this.wnv);
      paramArrayOfObject.aO(4, this.wnw);
      paramArrayOfObject.iz(5, this.wnx);
      AppMethodBeat.o(89091);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.wnu == null)
        break label540;
    label540: for (i = e.a.a.a.ix(1, this.wnu.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.wno != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.wno);
      i = paramInt;
      if (this.wnv != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wnv);
      paramInt = i + (e.a.a.b.b.a.fv(4) + 1) + e.a.a.b.b.a.bs(5, this.wnx);
      AppMethodBeat.o(89091);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(89091);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        agz localagz = (agz)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(89091);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new ph();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((ph)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localagz.wnu = ((ph)localObject1);
          }
          AppMethodBeat.o(89091);
          paramInt = i;
          break;
        case 2:
          localagz.wno = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89091);
          paramInt = i;
          break;
        case 3:
          localagz.wnv = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89091);
          paramInt = i;
          break;
        case 4:
          localagz.wnw = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(89091);
          paramInt = i;
          break;
        case 5:
          localagz.wnx = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89091);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(89091);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.agz
 * JD-Core Version:    0.6.2
 */