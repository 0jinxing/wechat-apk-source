package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bsr;
import com.tencent.mm.protocal.protobuf.hl;
import e.a.a.b;
import java.util.LinkedList;

public final class bn extends bsr
{
  public String guW;
  public String nbs;
  public int ncn;
  public int nco;
  public int ncv;
  public int ncw;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111616);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.nbs == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Lang");
        AppMethodBeat.o(111616);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(2, this.ncn);
      paramArrayOfObject.iz(3, this.nco);
      if (this.nbs != null)
        paramArrayOfObject.e(4, this.nbs);
      paramArrayOfObject.iz(5, this.ncv);
      paramArrayOfObject.iz(6, this.ncw);
      if (this.guW != null)
        paramArrayOfObject.e(7, this.guW);
      AppMethodBeat.o(111616);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label685;
    label685: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.ncn) + e.a.a.b.b.a.bs(3, this.nco);
      paramInt = i;
      if (this.nbs != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.nbs);
      i = paramInt + e.a.a.b.b.a.bs(5, this.ncv) + e.a.a.b.b.a.bs(6, this.ncw);
      paramInt = i;
      if (this.guW != null)
        paramInt = i + e.a.a.b.b.a.f(7, this.guW);
      AppMethodBeat.o(111616);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.nbs == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Lang");
          AppMethodBeat.o(111616);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(111616);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bn localbn = (bn)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111616);
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
            localbn.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(111616);
          paramInt = i;
          break;
        case 2:
          localbn.ncn = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(111616);
          paramInt = i;
          break;
        case 3:
          localbn.nco = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(111616);
          paramInt = i;
          break;
        case 4:
          localbn.nbs = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111616);
          paramInt = i;
          break;
        case 5:
          localbn.ncv = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(111616);
          paramInt = i;
          break;
        case 6:
          localbn.ncw = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(111616);
          paramInt = i;
          break;
        case 7:
          localbn.guW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111616);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111616);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes5-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.bn
 * JD-Core Version:    0.6.2
 */