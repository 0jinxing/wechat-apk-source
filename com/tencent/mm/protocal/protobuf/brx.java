package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class brx extends bsr
{
  public String cMC;
  public String kbU;
  public double latitude;
  public double longitude;
  public int wTZ;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(89129);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.f(2, this.longitude);
      paramArrayOfObject.f(3, this.latitude);
      paramArrayOfObject.iz(4, this.wTZ);
      if (this.kbU != null)
        paramArrayOfObject.e(5, this.kbU);
      if (this.cMC != null)
        paramArrayOfObject.e(6, this.cMC);
      AppMethodBeat.o(89129);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label597;
    label597: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + (e.a.a.b.b.a.fv(2) + 8) + (e.a.a.b.b.a.fv(3) + 8) + e.a.a.b.b.a.bs(4, this.wTZ);
      paramInt = i;
      if (this.kbU != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.kbU);
      i = paramInt;
      if (this.cMC != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.cMC);
      AppMethodBeat.o(89129);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(89129);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        brx localbrx = (brx)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(89129);
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
            localbrx.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(89129);
          paramInt = i;
          break;
        case 2:
          localbrx.longitude = Double.longBitsToDouble(((e.a.a.a.a)localObject1).BTU.eib());
          AppMethodBeat.o(89129);
          paramInt = i;
          break;
        case 3:
          localbrx.latitude = Double.longBitsToDouble(((e.a.a.a.a)localObject1).BTU.eib());
          AppMethodBeat.o(89129);
          paramInt = i;
          break;
        case 4:
          localbrx.wTZ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(89129);
          paramInt = i;
          break;
        case 5:
          localbrx.kbU = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89129);
          paramInt = i;
          break;
        case 6:
          localbrx.cMC = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(89129);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(89129);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.brx
 * JD-Core Version:    0.6.2
 */