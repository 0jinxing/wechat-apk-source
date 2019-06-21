package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class acw extends bsr
{
  public String nbs;
  public String wkD;
  public LinkedList<String> wkE;

  public acw()
  {
    AppMethodBeat.i(112421);
    this.wkE = new LinkedList();
    AppMethodBeat.o(112421);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(112422);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.wkD != null)
        paramArrayOfObject.e(2, this.wkD);
      paramArrayOfObject.e(3, 1, this.wkE);
      if (this.nbs != null)
        paramArrayOfObject.e(4, this.nbs);
      AppMethodBeat.o(112422);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label513;
    label513: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.wkD != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.wkD);
      i += e.a.a.a.c(3, 1, this.wkE);
      paramInt = i;
      if (this.nbs != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.nbs);
      AppMethodBeat.o(112422);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.wkE.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(112422);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        acw localacw = (acw)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(112422);
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
            localacw.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(112422);
          paramInt = i;
          break;
        case 2:
          localacw.wkD = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(112422);
          paramInt = i;
          break;
        case 3:
          localacw.wkE.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(112422);
          paramInt = i;
          break;
        case 4:
          localacw.nbs = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(112422);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(112422);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.acw
 * JD-Core Version:    0.6.2
 */