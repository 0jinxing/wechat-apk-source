package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class aad extends bsr
{
  public int nbk;
  public String wfk;
  public String wfl;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(73704);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.nbk);
      if (this.wfk != null)
        paramArrayOfObject.e(3, this.wfk);
      if (this.wfl != null)
        paramArrayOfObject.e(4, this.wfl);
      AppMethodBeat.o(73704);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label501;
    label501: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.nbk);
      paramInt = i;
      if (this.wfk != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.wfk);
      i = paramInt;
      if (this.wfl != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.wfl);
      AppMethodBeat.o(73704);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(73704);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aad localaad = (aad)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(73704);
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
            localaad.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(73704);
          paramInt = i;
          break;
        case 2:
          localaad.nbk = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(73704);
          paramInt = i;
          break;
        case 3:
          localaad.wfk = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73704);
          paramInt = i;
          break;
        case 4:
          localaad.wfl = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73704);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(73704);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aad
 * JD-Core Version:    0.6.2
 */