package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.bt.b;
import java.util.LinkedList;

public final class oz extends bsr
{
  public String kCK;
  public int nUf;
  public b vWg;
  public b vWh;
  public int vWi;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56754);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.nUf);
      if (this.vWg != null)
        paramArrayOfObject.c(3, this.vWg);
      if (this.vWh != null)
        paramArrayOfObject.c(4, this.vWh);
      if (this.kCK != null)
        paramArrayOfObject.e(5, this.kCK);
      paramArrayOfObject.iz(6, this.vWi);
      AppMethodBeat.o(56754);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label611;
    label611: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.b.b.a.bs(2, this.nUf);
      i = paramInt;
      if (this.vWg != null)
        i = paramInt + e.a.a.b.b.a.b(3, this.vWg);
      paramInt = i;
      if (this.vWh != null)
        paramInt = i + e.a.a.b.b.a.b(4, this.vWh);
      i = paramInt;
      if (this.kCK != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.kCK);
      paramInt = i + e.a.a.b.b.a.bs(6, this.vWi);
      AppMethodBeat.o(56754);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56754);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        oz localoz = (oz)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56754);
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
            localoz.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(56754);
          paramInt = i;
          break;
        case 2:
          localoz.nUf = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56754);
          paramInt = i;
          break;
        case 3:
          localoz.vWg = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(56754);
          paramInt = i;
          break;
        case 4:
          localoz.vWh = ((e.a.a.a.a)localObject1).BTU.emu();
          AppMethodBeat.o(56754);
          paramInt = i;
          break;
        case 5:
          localoz.kCK = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56754);
          paramInt = i;
          break;
        case 6:
          localoz.vWi = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56754);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56754);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.oz
 * JD-Core Version:    0.6.2
 */