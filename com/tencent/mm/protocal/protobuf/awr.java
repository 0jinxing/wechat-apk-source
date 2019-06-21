package com.tencent.mm.protocal.protobuf;

import com.tencent.matrix.trace.core.AppMethodBeat;
import java.util.LinkedList;

public final class awr extends com.tencent.mm.bt.a
{
  public String cEh;
  public String nZb;
  public String nZc;
  public String title;
  public int ttd;
  public boolean wAV;
  public bqs wAW;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    AppMethodBeat.i(56846);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      paramArrayOfObject.iz(1, this.ttd);
      paramArrayOfObject.aO(2, this.wAV);
      if (this.cEh != null)
        paramArrayOfObject.e(3, this.cEh);
      if (this.nZb != null)
        paramArrayOfObject.e(4, this.nZb);
      if (this.nZc != null)
        paramArrayOfObject.e(5, this.nZc);
      if (this.wAW != null)
      {
        paramArrayOfObject.iy(6, this.wAW.computeSize());
        this.wAW.writeFields(paramArrayOfObject);
      }
      if (this.title != null)
        paramArrayOfObject.e(7, this.title);
      AppMethodBeat.o(56846);
      paramInt = 0;
    }
    while (true)
    {
      return paramInt;
      int i;
      if (paramInt == 1)
      {
        i = e.a.a.b.b.a.bs(1, this.ttd) + 0 + (e.a.a.b.b.a.fv(2) + 1);
        paramInt = i;
        if (this.cEh != null)
          paramInt = i + e.a.a.b.b.a.f(3, this.cEh);
        i = paramInt;
        if (this.nZb != null)
          i = paramInt + e.a.a.b.b.a.f(4, this.nZb);
        int j = i;
        if (this.nZc != null)
          j = i + e.a.a.b.b.a.f(5, this.nZc);
        paramInt = j;
        if (this.wAW != null)
          paramInt = j + e.a.a.a.ix(6, this.wAW.computeSize());
        i = paramInt;
        if (this.title != null)
          i = paramInt + e.a.a.b.b.a.f(7, this.title);
        AppMethodBeat.o(56846);
        paramInt = i;
      }
      else if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = com.tencent.mm.bt.a.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(56846);
        paramInt = 0;
      }
      else if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        awr localawr = (awr)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(56846);
          break;
        case 1:
          localawr.ttd = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(56846);
          paramInt = 0;
          break;
        case 2:
          localawr.wAV = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(56846);
          paramInt = 0;
          break;
        case 3:
          localawr.cEh = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56846);
          paramInt = 0;
          break;
        case 4:
          localawr.nZb = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56846);
          paramInt = 0;
          break;
        case 5:
          localawr.nZc = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56846);
          paramInt = 0;
          break;
        case 6:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          i = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < i; paramInt++)
          {
            Object localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new bqs();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (boolean bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, com.tencent.mm.bt.a.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localawr.wAW = paramArrayOfObject;
          }
          AppMethodBeat.o(56846);
          paramInt = 0;
          break;
        case 7:
          localawr.title = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(56846);
          paramInt = 0;
          break;
        }
      }
      else
      {
        paramInt = -1;
        AppMethodBeat.o(56846);
      }
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes2-dex2jar.jar
 * Qualified Name:     com.tencent.mm.protocal.protobuf.awr
 * JD-Core Version:    0.6.2
 */