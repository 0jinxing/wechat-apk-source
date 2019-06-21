package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bsr;
import com.tencent.mm.protocal.protobuf.hl;
import e.a.a.b;
import java.util.LinkedList;

public final class ax extends bsr
{
  public String guW;
  public String nbs;
  public int nbt;
  public d nbu;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(116999);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.nbs == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Lang");
        AppMethodBeat.o(116999);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.nbs != null)
        paramArrayOfObject.e(2, this.nbs);
      if (this.guW != null)
        paramArrayOfObject.e(3, this.guW);
      paramArrayOfObject.iz(4, this.nbt);
      if (this.nbu != null)
      {
        paramArrayOfObject.iy(5, this.nbu.computeSize());
        this.nbu.writeFields(paramArrayOfObject);
      }
      AppMethodBeat.o(116999);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label703;
    label703: for (i = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; i = 0)
    {
      paramInt = i;
      if (this.nbs != null)
        paramInt = i + e.a.a.b.b.a.f(2, this.nbs);
      i = paramInt;
      if (this.guW != null)
        i = paramInt + e.a.a.b.b.a.f(3, this.guW);
      i += e.a.a.b.b.a.bs(4, this.nbt);
      paramInt = i;
      if (this.nbu != null)
        paramInt = i + e.a.a.a.ix(5, this.nbu.computeSize());
      AppMethodBeat.o(116999);
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
          AppMethodBeat.o(116999);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(116999);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        ax localax = (ax)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(116999);
          break;
        case 1:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new hl();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localax.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(116999);
          paramInt = i;
          break;
        case 2:
          localax.nbs = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(116999);
          paramInt = i;
          break;
        case 3:
          localax.guW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(116999);
          paramInt = i;
          break;
        case 4:
          localax.nbt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(116999);
          paramInt = i;
          break;
        case 5:
          localObject1 = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = ((LinkedList)localObject1).size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])((LinkedList)localObject1).get(paramInt);
            paramArrayOfObject = new d();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = paramArrayOfObject.populateBuilderWithField((e.a.a.a.a)localObject2, paramArrayOfObject, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localax.nbu = paramArrayOfObject;
          }
          AppMethodBeat.o(116999);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(116999);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes3-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.ax
 * JD-Core Version:    0.6.2
 */