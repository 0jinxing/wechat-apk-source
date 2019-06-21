package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class apo extends bsr
{
  public int Scene;
  public String mZr;
  public LinkedList<bts> vEg;
  public int wnW;

  public apo()
  {
    AppMethodBeat.i(28474);
    this.vEg = new LinkedList();
    AppMethodBeat.o(28474);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28475);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.mZr != null)
        paramArrayOfObject.e(2, this.mZr);
      paramArrayOfObject.iz(3, this.wnW);
      paramArrayOfObject.e(4, 8, this.vEg);
      paramArrayOfObject.iz(5, this.Scene);
      AppMethodBeat.o(28475);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label636;
    label636: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.mZr != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.mZr);
      paramInt = i + e.a.a.b.b.a.bs(3, this.wnW) + e.a.a.a.c(4, 8, this.vEg) + e.a.a.b.b.a.bs(5, this.Scene);
      AppMethodBeat.o(28475);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vEg.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28475);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        apo localapo = (apo)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28475);
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
            localapo.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(28475);
          paramInt = i;
          break;
        case 2:
          localapo.mZr = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28475);
          paramInt = i;
          break;
        case 3:
          localapo.wnW = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28475);
          paramInt = i;
          break;
        case 4:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new bts();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((bts)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localapo.vEg.add(localObject1);
          }
          AppMethodBeat.o(28475);
          paramInt = i;
          break;
        case 5:
          localapo.Scene = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28475);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28475);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.apo
 * JD-Core Version:    0.6.2
 */