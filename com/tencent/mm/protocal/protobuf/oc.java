package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class oc extends com.tencent.mm.bt.a
{
  public String vTE;
  public String vTF;
  public String vTG;
  public int vTH;
  public String vTI;
  public ny vTJ;
  public String vTK;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(89038);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vTE != null)
        paramArrayOfObject.e(1, this.vTE);
      if (this.vTF != null)
        paramArrayOfObject.e(2, this.vTF);
      if (this.vTG != null)
        paramArrayOfObject.e(3, this.vTG);
      paramArrayOfObject.iz(4, this.vTH);
      if (this.vTI != null)
        paramArrayOfObject.e(5, this.vTI);
      if (this.vTJ != null)
      {
        paramArrayOfObject.iy(6, this.vTJ.computeSize());
        this.vTJ.writeFields(paramArrayOfObject);
      }
      if (this.vTK != null)
        paramArrayOfObject.e(7, this.vTK);
      AppMethodBeat.o(89038);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vTE == null)
        break label690;
    label690: for (i = e.a.a.b.b.a.f(1, this.vTE) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.vTF != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.vTF);
      i = paramInt;
      if (this.vTG != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.vTG);
      i += e.a.a.b.b.a.bs(4, this.vTH);
      paramInt = i;
      if (this.vTI != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.vTI);
      i = paramInt;
      if (this.vTJ != null)
        i = paramInt + e.a.a.a.ix(6, this.vTJ.computeSize());
      paramInt = i;
      if (this.vTK != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.vTK);
      AppMethodBeat.o(89038);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(89038);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        oc localoc = (oc)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(89038);
          break;
        case 1:
          localoc.vTE = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89038);
          paramInt = i;
          break;
        case 2:
          localoc.vTF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89038);
          paramInt = i;
          break;
        case 3:
          localoc.vTG = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89038);
          paramInt = i;
          break;
        case 4:
          localoc.vTH = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89038);
          paramInt = i;
          break;
        case 5:
          localoc.vTI = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89038);
          paramInt = i;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new ny();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((ny)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localoc.vTJ = ((ny)localObject1);
          }
          AppMethodBeat.o(89038);
          paramInt = i;
          break;
        case 7:
          localoc.vTK = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89038);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(89038);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.oc
 * JD-Core Version:    0.6.2
 */