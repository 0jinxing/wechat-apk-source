package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bdc extends bsr
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
    AppMethodBeat.i(56860);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.vES);
      if (this.pbn != null)
        paramArrayOfObject.e(3, this.pbn);
      if (this.pck != null)
        paramArrayOfObject.e(4, this.pck);
      if (this.vEQ != null)
        paramArrayOfObject.e(5, this.vEQ);
      paramArrayOfObject.ai(6, this.cSh);
      paramArrayOfObject.iz(7, this.ehf);
      if (this.vER != null)
        paramArrayOfObject.e(8, this.vER);
      AppMethodBeat.o(56860);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label721;
    label721: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt += e.a.a.b.b.a.bs(2, this.vES);
      i = paramInt;
      if (this.pbn != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.pbn);
      paramInt = i;
      if (this.pck != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.pck);
      i = paramInt;
      if (this.vEQ != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.vEQ);
      i = i + e.a.a.b.b.a.o(6, this.cSh) + e.a.a.b.b.a.bs(7, this.ehf);
      paramInt = i;
      if (this.vER != null)
        paramInt = i + e.a.a.b.b.a.f(8, this.vER);
      AppMethodBeat.o(56860);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56860);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bdc localbdc = (bdc)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56860);
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
            localbdc.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(56860);
          paramInt = i;
          break;
        case 2:
          localbdc.vES = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56860);
          paramInt = i;
          break;
        case 3:
          localbdc.pbn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56860);
          paramInt = i;
          break;
        case 4:
          localbdc.pck = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56860);
          paramInt = i;
          break;
        case 5:
          localbdc.vEQ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56860);
          paramInt = i;
          break;
        case 6:
          localbdc.cSh = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(56860);
          paramInt = i;
          break;
        case 7:
          localbdc.ehf = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56860);
          paramInt = i;
          break;
        case 8:
          localbdc.vER = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56860);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56860);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bdc
 * JD-Core Version:    0.6.2
 */