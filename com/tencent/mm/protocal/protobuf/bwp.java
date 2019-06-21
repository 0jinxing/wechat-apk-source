package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bwp extends bsr
{
  public String Name;
  public String mZR;
  public String oRb;
  public String vEA;
  public String wXa;
  public String wXb;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(73758);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.mZR != null)
        paramArrayOfObject.e(2, this.mZR);
      if (this.wXa != null)
        paramArrayOfObject.e(3, this.wXa);
      if (this.oRb != null)
        paramArrayOfObject.e(5, this.oRb);
      if (this.Name != null)
        paramArrayOfObject.e(4, this.Name);
      if (this.vEA != null)
        paramArrayOfObject.e(6, this.vEA);
      if (this.wXb != null)
        paramArrayOfObject.e(7, this.wXb);
      AppMethodBeat.o(73758);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label714;
    label714: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.mZR != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.mZR);
      paramInt = i;
      if (this.wXa != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.wXa);
      i = paramInt;
      if (this.oRb != null)
        i = paramInt + e.a.a.b.b.a.f(5, this.oRb);
      int j = i;
      if (this.Name != null)
        j = i + e.a.a.b.b.a.f(4, this.Name);
      paramInt = j;
      if (this.vEA != null)
        paramInt = j + e.a.a.b.b.a.f(6, this.vEA);
      i = paramInt;
      if (this.wXb != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.wXb);
      AppMethodBeat.o(73758);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(73758);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bwp localbwp = (bwp)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(73758);
          break;
        case 1:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = ((hl)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbwp.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(73758);
          paramInt = i;
          break;
        case 2:
          localbwp.mZR = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73758);
          paramInt = i;
          break;
        case 3:
          localbwp.wXa = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73758);
          paramInt = i;
          break;
        case 5:
          localbwp.oRb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73758);
          paramInt = i;
          break;
        case 4:
          localbwp.Name = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73758);
          paramInt = i;
          break;
        case 6:
          localbwp.vEA = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73758);
          paramInt = i;
          break;
        case 7:
          localbwp.wXb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(73758);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(73758);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bwp
 * JD-Core Version:    0.6.2
 */