package com.tencent.mm.plugin.game.d;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bsr;
import com.tencent.mm.protocal.protobuf.hl;
import java.util.LinkedList;

public final class au extends bsr
{
  public String mZr;
  public int nbj;
  public int nbk;
  public int nbl;
  public String nbm;
  public String nbn;

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(111590);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      if (this.mZr != null)
        paramArrayOfObject.e(2, this.mZr);
      paramArrayOfObject.iz(3, this.nbj);
      paramArrayOfObject.iz(4, this.nbk);
      paramArrayOfObject.iz(5, this.nbl);
      if (this.nbm != null)
        paramArrayOfObject.e(6, this.nbm);
      if (this.nbn != null)
        paramArrayOfObject.e(7, this.nbn);
      AppMethodBeat.o(111590);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label658;
    label658: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      i = paramInt;
      if (this.mZr != null)
        i = paramInt + e.a.a.b.b.a.f(2, this.mZr);
      i = i + e.a.a.b.b.a.bs(3, this.nbj) + e.a.a.b.b.a.bs(4, this.nbk) + e.a.a.b.b.a.bs(5, this.nbl);
      paramInt = i;
      if (this.nbm != null)
        paramInt = i + e.a.a.b.b.a.f(6, this.nbm);
      i = paramInt;
      if (this.nbn != null)
        i = paramInt + e.a.a.b.b.a.f(7, this.nbn);
      AppMethodBeat.o(111590);
      paramInt = i;
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = new e.a.a.a.a((byte[])paramArrayOfObject[0], unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(111590);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        au localau = (au)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(111590);
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
            localau.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(111590);
          paramInt = i;
          break;
        case 2:
          localau.mZr = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111590);
          paramInt = i;
          break;
        case 3:
          localau.nbj = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(111590);
          paramInt = i;
          break;
        case 4:
          localau.nbk = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(111590);
          paramInt = i;
          break;
        case 5:
          localau.nbl = ((e.a.a.a.a)localObject1).BTU.vd();
          AppMethodBeat.o(111590);
          paramInt = i;
          break;
        case 6:
          localau.nbm = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111590);
          paramInt = i;
          break;
        case 7:
          localau.nbn = ((e.a.a.a.a)localObject1).BTU.readString();
          AppMethodBeat.o(111590);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(111590);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes4-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.game.d.au
 * JD-Core Version:    0.6.2
 */