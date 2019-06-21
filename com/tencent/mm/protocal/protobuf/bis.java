package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bis extends bsr
{
  public String pcU;
  public int pdc;
  public String pdn;
  public aw vRP;
  public int wMd;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(56880);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.wMd);
      if (this.pcU != null)
        paramArrayOfObject.e(3, this.pcU);
      paramArrayOfObject.iz(4, this.pdc);
      if (this.pdn != null)
        paramArrayOfObject.e(5, this.pdn);
      if (this.vRP != null)
      {
        paramArrayOfObject.iy(6, this.vRP.computeSize());
        this.vRP.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(56880);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label708;
    label708: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.wMd);
      paramInt = i;
      if (this.pcU != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.pcU);
      i = paramInt + e.a.a.b.b.a.bs(4, this.pdc);
      paramInt = i;
      if (this.pdn != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.pdn);
      i = paramInt;
      if (this.vRP != null)
        i = paramInt + e.a.a.a.ix(6, this.vRP.computeSize());
      AppMethodBeat.o(56880);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56880);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bis localbis = (bis)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56880);
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
            localbis.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(56880);
          paramInt = i;
          break;
        case 2:
          localbis.wMd = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56880);
          paramInt = i;
          break;
        case 3:
          localbis.pcU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56880);
          paramInt = i;
          break;
        case 4:
          localbis.pdc = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56880);
          paramInt = i;
          break;
        case 5:
          localbis.pdn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56880);
          paramInt = i;
          break;
        case 6:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new aw();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((aw)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbis.vRP = ((aw)localObject1);
          }
          AppMethodBeat.o(56880);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(56880);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bis
 * JD-Core Version:    0.6.2
 */