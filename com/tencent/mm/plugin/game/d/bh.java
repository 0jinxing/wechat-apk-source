package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bsr;
import com.tencent.mm.protocal.protobuf.hl;
import e.a.a.b;
import java.util.LinkedList;

public final class bh extends bsr
{
  public String guW;
  public LinkedList<String> nbX;
  public t nbY;
  public int nbZ;
  public String nbs;
  public int nbt;
  public boolean nca;

  public bh()
  {
    AppMethodBeat.i(111606);
    this.nbX = new LinkedList();
    AppMethodBeat.o(111606);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111607);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.nbs == null)
      {
        paramArrayOfObject = new b("Not all required fields were included: Lang");
        AppMethodBeat.o(111607);
        throw paramArrayOfObject;
      }
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.nbs != null)
        paramArrayOfObject.e(2, this.nbs);
      paramArrayOfObject.e(3, 1, this.nbX);
      if (this.guW != null)
        paramArrayOfObject.e(4, this.guW);
      if (this.nbY != null)
      {
        paramArrayOfObject.iy(5, this.nbY.computeSize());
        this.nbY.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.iz(6, this.nbZ);
      paramArrayOfObject.aO(7, this.nca);
      paramArrayOfObject.iz(8, this.nbt);
      AppMethodBeat.o(111607);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label861;
    label861: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.nbs != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.nbs);
      i += e.a.a.a.c(3, 1, this.nbX);
      paramInt = i;
      if (this.guW != null)
        paramInt = i + e.a.a.b.b.a.f(4, this.guW);
      i = paramInt;
      if (this.nbY != null)
        i = paramInt + e.a.a.a.ix(5, this.nbY.computeSize());
      paramInt = i + e.a.a.b.b.a.bs(6, this.nbZ) + (e.a.a.b.b.a.fv(7) + 1) + e.a.a.b.b.a.bs(8, this.nbt);
      AppMethodBeat.o(111607);
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
          AppMethodBeat.o(111607);
          throw paramArrayOfObject;
        }
        AppMethodBeat.o(111607);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        bh localbh = (bh)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        int j;
        Object localObject2;
        boolean bool;
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111607);
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
            localbh.BaseRequest = paramArrayOfObject;
          }
          AppMethodBeat.o(111607);
          paramInt = i;
          break;
        case 2:
          localbh.nbs = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111607);
          paramInt = i;
          break;
        case 3:
          localbh.nbX.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(111607);
          paramInt = i;
          break;
        case 4:
          localbh.guW = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111607);
          paramInt = i;
          break;
        case 5:
          paramArrayOfObject = ((e.a.a.a.a)localObject1).Vh(paramInt);
          j = paramArrayOfObject.size();
          for (paramInt = 0; paramInt < j; paramInt++)
          {
            localObject2 = (byte[])paramArrayOfObject.get(paramInt);
            localObject1 = new t();
            localObject2 = new e.a.a.a.a((byte[])localObject2, unknownTagHandler);
            for (bool = true; bool; bool = ((t)localObject1).populateBuilderWithField((e.a.a.a.a)localObject2, (com.tencent.mm.bt.a)localObject1, bsr.getNextFieldNumber((e.a.a.a.a)localObject2)));
            localbh.nbY = ((t)localObject1);
          }
          AppMethodBeat.o(111607);
          paramInt = i;
          break;
        case 6:
          localbh.nbZ = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(111607);
          paramInt = i;
          break;
        case 7:
          localbh.nca = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(111607);
          paramInt = i;
          break;
        case 8:
          localbh.nbt = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(111607);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111607);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.bh
 * JD-Core Version:    0.6.2
 */