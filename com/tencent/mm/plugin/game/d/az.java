package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bsr;
import com.tencent.mm.protocal.protobuf.hl;
import e.a.a.b;
import java.util.LinkedList;

public final class az extends bsr
{
  public String guW;
  public String mZr;
  public boolean nbG;
  public boolean nbH;
  public boolean nbI;
  public String nbs;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111594);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.nbs == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Lang");
        AppMethodBeat.o(111594);
        throw paramArrayOfObject;
      }
      if (this.mZr == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: AppID");
        AppMethodBeat.o(111594);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.nbs != null)
        paramArrayOfObject.e(2, this.nbs);
      if (this.mZr != null)
        paramArrayOfObject.e(3, this.mZr);
      paramArrayOfObject.aO(4, this.nbG);
      if (this.guW != null)
        paramArrayOfObject.e(5, this.guW);
      paramArrayOfObject.aO(6, this.nbH);
      paramArrayOfObject.aO(7, this.nbI);
      AppMethodBeat.o(111594);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label745;
    label745: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.nbs != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.nbs);
      i = paramInt;
      if (this.mZr != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.mZr);
      i += e.a.a.b.b.a.fv(4) + 1;
      paramInt = i;
      if (this.guW != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.guW);
      paramInt = paramInt + (e.a.a.b.b.a.fv(6) + 1) + (e.a.a.b.b.a.fv(7) + 1);
      AppMethodBeat.o(111594);
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
          AppMethodBeat.o(111594);
          throw paramArrayOfObject;
        }
        if (this.mZr == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: AppID");
          AppMethodBeat.o(111594);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(111594);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        az localaz = (az)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111594);
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
            localaz.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(111594);
          paramInt = i;
          break;
        case 2:
          localaz.nbs = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111594);
          paramInt = i;
          break;
        case 3:
          localaz.mZr = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111594);
          paramInt = i;
          break;
        case 4:
          localaz.nbG = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(111594);
          paramInt = i;
          break;
        case 5:
          localaz.guW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111594);
          paramInt = i;
          break;
        case 6:
          localaz.nbH = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(111594);
          paramInt = i;
          break;
        case 7:
          localaz.nbI = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(111594);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111594);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.az
 * JD-Core Version:    0.6.2
 */