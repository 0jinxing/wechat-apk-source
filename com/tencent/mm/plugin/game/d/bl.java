package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bsr;
import com.tencent.mm.protocal.protobuf.hl;
import e.a.a.b;
import java.util.LinkedList;

public final class bl extends bsr
{
  public String guW;
  public LinkedList<String> nbX;
  public String nbs;
  public int ncn;
  public int nco;
  public int ncp;
  public boolean ncq;

  public bl()
  {
    AppMethodBeat.i(111612);
    this.nbX = new LinkedList();
    AppMethodBeat.o(111612);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111613);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.nbs == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Lang");
        AppMethodBeat.o(111613);
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
      paramArrayOfObject.e(5, 1, this.nbX);
      if (this.guW != null)
        paramArrayOfObject.e(6, this.guW);
      paramArrayOfObject.iz(7, this.ncp);
      paramArrayOfObject.aO(8, this.ncq);
      AppMethodBeat.o(111613);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label748;
    label748: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt + e.a.a.b.b.a.bs(2, this.ncn) + e.a.a.b.b.a.bs(3, this.nco);
      paramInt = i;
      if (this.nbs != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.nbs);
      i = paramInt + e.a.a.a.c(5, 1, this.nbX);
      paramInt = i;
      if (this.guW != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.guW);
      paramInt = paramInt + e.a.a.b.b.a.bs(7, this.ncp) + (e.a.a.b.b.a.fv(8) + 1);
      AppMethodBeat.o(111613);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.nbX.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        if (this.nbs == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: Lang");
          AppMethodBeat.o(111613);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(111613);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bl localbl = (bl)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111613);
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
            localbl.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(111613);
          paramInt = i;
          break;
        case 2:
          localbl.ncn = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(111613);
          paramInt = i;
          break;
        case 3:
          localbl.nco = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(111613);
          paramInt = i;
          break;
        case 4:
          localbl.nbs = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111613);
          paramInt = i;
          break;
        case 5:
          localbl.nbX.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(111613);
          paramInt = i;
          break;
        case 6:
          localbl.guW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111613);
          paramInt = i;
          break;
        case 7:
          localbl.ncp = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(111613);
          paramInt = i;
          break;
        case 8:
          localbl.ncq = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(111613);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111613);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes8-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.bl
 * JD-Core Version:    0.6.2
 */