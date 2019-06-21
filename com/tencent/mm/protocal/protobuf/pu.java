package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class pu extends bsr
{
  public String desc;
  public boolean vWT;
  public boolean vWU;
  public LinkedList<Integer> vWt;

  public pu()
  {
    AppMethodBeat.i(48806);
    this.vWt = new LinkedList();
    AppMethodBeat.o(48806);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(48807);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(2, 2, this.vWt);
      if (this.desc != null)
        paramArrayOfObject.e(3, this.desc);
      paramArrayOfObject.aO(4, this.vWT);
      paramArrayOfObject.aO(5, this.vWU);
      AppMethodBeat.o(48807);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label543;
    label543: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.a.c(2, 2, this.vWt);
      paramInt = i;
      if (this.desc != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.desc);
      paramInt = paramInt + (e.a.a.b.b.a.fv(4) + 1) + (e.a.a.b.b.a.fv(5) + 1);
      AppMethodBeat.o(48807);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.vWt.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(48807);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        pu localpu = (pu)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(48807);
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
            localpu.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(48807);
          paramInt = i;
          break;
        case 2:
          localpu.vWt.add(Integer.valueOf(((e.a.a.a.a)localObject1).BTU.vd()));
          AppMethodBeat.o(48807);
          paramInt = i;
          break;
        case 3:
          localpu.desc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(48807);
          paramInt = i;
          break;
        case 4:
          localpu.vWT = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(48807);
          paramInt = i;
          break;
        case 5:
          localpu.vWU = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(48807);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(48807);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes6-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.pu
 * JD-Core Version:    0.6.2
 */