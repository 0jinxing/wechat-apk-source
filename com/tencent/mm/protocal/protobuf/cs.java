package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class cs extends bsr
{
  public long cSh;
  public int ehf;
  public String pbn;
  public String pck;
  public String vEQ;
  public String vER;
  public int vES;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56699);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.ai(2, this.cSh);
      if (this.pbn != null)
        paramArrayOfObject.e(3, this.pbn);
      if (this.pck != null)
        paramArrayOfObject.e(4, this.pck);
      if (this.vEQ != null)
        paramArrayOfObject.e(5, this.vEQ);
      paramArrayOfObject.iz(6, this.ehf);
      if (this.vER != null)
        paramArrayOfObject.e(7, this.vER);
      paramArrayOfObject.iz(8, this.vES);
      AppMethodBeat.o(56699);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label725;
    label725: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.o(2, this.cSh);
      paramInt = i;
      if (this.pbn != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.pbn);
      i = paramInt;
      if (this.pck != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.pck);
      paramInt = i;
      if (this.vEQ != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.vEQ);
      i = paramInt + e.a.a.b.b.a.bs(6, this.ehf);
      paramInt = i;
      if (this.vER != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.vER);
      paramInt += e.a.a.b.b.a.bs(8, this.vES);
      AppMethodBeat.o(56699);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56699);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        cs localcs = (cs)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56699);
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
            localcs.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(56699);
          paramInt = i;
          break;
        case 2:
          localcs.cSh = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56699);
          paramInt = i;
          break;
        case 3:
          localcs.pbn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56699);
          paramInt = i;
          break;
        case 4:
          localcs.pck = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56699);
          paramInt = i;
          break;
        case 5:
          localcs.vEQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56699);
          paramInt = i;
          break;
        case 6:
          localcs.ehf = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56699);
          paramInt = i;
          break;
        case 7:
          localcs.vER = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56699);
          paramInt = i;
          break;
        case 8:
          localcs.vES = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56699);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56699);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.cs
 * JD-Core Version:    0.6.2
 */