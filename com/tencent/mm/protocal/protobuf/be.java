package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class be extends com.tencent.mm.bt.a
{
  public int flags = -1;
  public int state = -1;
  public chm vDg;
  public String vDh = "";

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(73644);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.vDg != null)
      {
        paramArrayOfObject.iy(1, this.vDg.computeSize());
        this.vDg.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.flags);
      paramArrayOfObject.iz(3, this.state);
      if (this.vDh != null)
        paramArrayOfObject.e(4, this.vDh);
      AppMethodBeat.o(73644);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.vDg == null)
        break label480;
    label480: for (paramInt = e.a.a.a.ix(1, this.vDg.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.flags) + e.a.a.b.b.a.bs(3, this.state);
      paramInt = i;
      if (this.vDh != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.vDh);
      AppMethodBeat.o(73644);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(73644);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        be localbe = (be)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(73644);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new chm();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbe.vDg = paramArrayOfObject;
          }
          AppMethodBeat.o(73644);
          paramInt = i;
          break;
        case 2:
          localbe.flags = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73644);
          paramInt = i;
          break;
        case 3:
          localbe.state = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73644);
          paramInt = i;
          break;
        case 4:
          localbe.vDh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73644);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(73644);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.be
 * JD-Core Version:    0.6.2
 */