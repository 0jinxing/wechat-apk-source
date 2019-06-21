package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class aah extends bsr
{
  public String csB;
  public int cvd;
  public int lSN;
  public float wfA;
  public int wfB;
  public String wfo;
  public long wfw;
  public String wfx;
  public String wfy;
  public int wfz;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(841);
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
      paramArrayOfObject.ai(3, this.wfw);
      if (this.wfo != null)
        paramArrayOfObject.e(4, this.wfo);
      if (this.wfx != null)
        paramArrayOfObject.e(5, this.wfx);
      if (this.wfy != null)
        paramArrayOfObject.e(6, this.wfy);
      paramArrayOfObject.iz(7, this.cvd);
      paramArrayOfObject.iz(8, this.wfz);
      paramArrayOfObject.iz(9, this.lSN);
      paramArrayOfObject.r(10, this.wfA);
      paramArrayOfObject.iz(11, this.wfB);
      AppMethodBeat.o(841);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label881;
    label881: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.csB != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.csB);
      paramInt = i + e.a.a.b.b.a.o(3, this.wfw);
      i = paramInt;
      if (this.wfo != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.wfo);
      paramInt = i;
      if (this.wfx != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.wfx);
      i = paramInt;
      if (this.wfy != null)
        i = paramInt + e.a.a.b.b.a.f(6, this.wfy);
      paramInt = i + e.a.a.b.b.a.bs(7, this.cvd) + e.a.a.b.b.a.bs(8, this.wfz) + e.a.a.b.b.a.bs(9, this.lSN) + (e.a.a.b.b.a.fv(10) + 4) + e.a.a.b.b.a.bs(11, this.wfB);
      AppMethodBeat.o(841);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(841);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        aah localaah = (aah)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(841);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          int j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localaah.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(841);
          paramInt = i;
          break;
        case 2:
          localaah.csB = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(841);
          paramInt = i;
          break;
        case 3:
          localaah.wfw = ((e.a.a.a.a)localObject1).BTU.ve();
          AppMethodBeat.o(841);
          paramInt = i;
          break;
        case 4:
          localaah.wfo = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(841);
          paramInt = i;
          break;
        case 5:
          localaah.wfx = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(841);
          paramInt = i;
          break;
        case 6:
          localaah.wfy = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(841);
          paramInt = i;
          break;
        case 7:
          localaah.cvd = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(841);
          paramInt = i;
          break;
        case 8:
          localaah.wfz = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(841);
          paramInt = i;
          break;
        case 9:
          localaah.lSN = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(841);
          paramInt = i;
          break;
        case 10:
          localaah.wfA = Float.intBitsToFloat(((e.a.a.a.a)localObject1).BTU.eia());
          AppMethodBeat.o(841);
          paramInt = i;
          break;
        case 11:
          localaah.wfB = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(841);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(841);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.aah
 * JD-Core Version:    0.6.2
 */