package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class bma extends bsr
{
  public String ndF;
  public String ndG;
  public int vZF;
  public long wOP;
  public int wOQ;
  public String wOR;
  public int wOY;
  public int wOZ;
  public int wPa;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(28581);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.ndG != null)
        paramArrayOfObject.e(2, this.ndG);
      if (this.wOR != null)
        paramArrayOfObject.e(3, this.wOR);
      paramArrayOfObject.iz(4, this.vZF);
      paramArrayOfObject.ai(5, this.wOP);
      paramArrayOfObject.iz(6, this.wOQ);
      if (this.ndF != null)
        paramArrayOfObject.e(7, this.ndF);
      paramArrayOfObject.iz(8, this.wOZ);
      paramArrayOfObject.iz(9, this.wOY);
      paramArrayOfObject.iz(10, this.wPa);
      AppMethodBeat.o(28581);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label815;
    label815: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.ndG != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.ndG);
      i = paramInt;
      if (this.wOR != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.wOR);
      i = i + e.a.a.b.b.a.bs(4, this.vZF) + e.a.a.b.b.a.o(5, this.wOP) + e.a.a.b.b.a.bs(6, this.wOQ);
      paramInt = i;
      if (this.ndF != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.ndF);
      paramInt = paramInt + e.a.a.b.b.a.bs(8, this.wOZ) + e.a.a.b.b.a.bs(9, this.wOY) + e.a.a.b.b.a.bs(10, this.wPa);
      AppMethodBeat.o(28581);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(28581);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bma localbma = (bma)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(28581);
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
            localbma.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(28581);
          paramInt = i;
          break;
        case 2:
          localbma.ndG = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28581);
          paramInt = i;
          break;
        case 3:
          localbma.wOR = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28581);
          paramInt = i;
          break;
        case 4:
          localbma.vZF = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28581);
          paramInt = i;
          break;
        case 5:
          localbma.wOP = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(28581);
          paramInt = i;
          break;
        case 6:
          localbma.wOQ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28581);
          paramInt = i;
          break;
        case 7:
          localbma.ndF = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(28581);
          paramInt = i;
          break;
        case 8:
          localbma.wOZ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28581);
          paramInt = i;
          break;
        case 9:
          localbma.wOY = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28581);
          paramInt = i;
          break;
        case 10:
          localbma.wPa = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(28581);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(28581);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.bma
 * JD-Core Version:    0.6.2
 */