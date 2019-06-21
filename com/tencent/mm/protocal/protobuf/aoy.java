package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class aoy extends bsr
{
  public String csB;
  public int vSb;
  public String wsY;
  public String wsZ;
  public int wta;
  public int wtb = 4;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(96228);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.csB != null)
        paramArrayOfObject.e(2, this.csB);
      if (this.wsY != null)
        paramArrayOfObject.e(3, this.wsY);
      if (this.wsZ != null)
        paramArrayOfObject.e(4, this.wsZ);
      paramArrayOfObject.iz(5, this.vSb);
      paramArrayOfObject.iz(6, this.wta);
      paramArrayOfObject.iz(7, this.wtb);
      AppMethodBeat.o(96228);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label654;
    label654: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.csB != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.csB);
      i = paramInt;
      if (this.wsY != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wsY);
      paramInt = i;
      if (this.wsZ != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.wsZ);
      paramInt = paramInt + e.a.a.b.b.a.bs(5, this.vSb) + e.a.a.b.b.a.bs(6, this.wta) + e.a.a.b.b.a.bs(7, this.wtb);
      AppMethodBeat.o(96228);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(96228);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aoy localaoy = (aoy)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(96228);
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
            localaoy.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(96228);
          paramInt = i;
          break;
        case 2:
          localaoy.csB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96228);
          paramInt = i;
          break;
        case 3:
          localaoy.wsY = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96228);
          paramInt = i;
          break;
        case 4:
          localaoy.wsZ = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(96228);
          paramInt = i;
          break;
        case 5:
          localaoy.vSb = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96228);
          paramInt = i;
          break;
        case 6:
          localaoy.wta = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96228);
          paramInt = i;
          break;
        case 7:
          localaoy.wtb = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(96228);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(96228);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aoy
 * JD-Core Version:    0.6.2
 */