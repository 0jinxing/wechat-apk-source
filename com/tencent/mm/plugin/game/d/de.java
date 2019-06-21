package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bsr;
import com.tencent.mm.protocal.protobuf.hl;
import e.a.a.b;
import java.util.LinkedList;

public final class de extends bsr
{
  public String guW;
  public boolean mZD;
  public String mZo;
  public String mZr;
  public String nbs;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111671);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.nbs == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Lang");
        AppMethodBeat.o(111671);
        throw paramArrayOfObject;
      }
      if (this.mZr == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: AppID");
        AppMethodBeat.o(111671);
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
      if (this.mZo != null)
        paramArrayOfObject.e(4, this.mZo);
      if (this.guW != null)
        paramArrayOfObject.e(5, this.guW);
      paramArrayOfObject.aO(6, this.mZD);
      AppMethodBeat.o(111671);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label718;
    label718: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.nbs != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.nbs);
      paramInt = i;
      if (this.mZr != null)
        paramInt = i + e.a.a.b.b.a.f(3, this.mZr);
      i = paramInt;
      if (this.mZo != null)
        i = paramInt + e.a.a.b.b.a.f(4, this.mZo);
      paramInt = i;
      if (this.guW != null)
        paramInt = i + e.a.a.b.b.a.f(5, this.guW);
      paramInt += e.a.a.b.b.a.fv(6) + 1;
      AppMethodBeat.o(111671);
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
          AppMethodBeat.o(111671);
          throw paramArrayOfObject;
        }
        if (this.mZr == null)
        {
          paramArrayOfObject = new b("Not all required fields were included: AppID");
          AppMethodBeat.o(111671);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(111671);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        de localde = (de)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111671);
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
            localde.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(111671);
          paramInt = i;
          break;
        case 2:
          localde.nbs = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111671);
          paramInt = i;
          break;
        case 3:
          localde.mZr = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111671);
          paramInt = i;
          break;
        case 4:
          localde.mZo = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111671);
          paramInt = i;
          break;
        case 5:
          localde.guW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111671);
          paramInt = i;
          break;
        case 6:
          localde.mZD = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(111671);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111671);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.de
 * JD-Core Version:    0.6.2
 */