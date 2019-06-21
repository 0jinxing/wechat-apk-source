package com.tencent.mm.plugin.downloader.c.a.a;

import com.tencent.matrix.trace.core.AppMethodBeat;
import com.tencent.mm.protocal.protobuf.bsr;
import com.tencent.mm.protocal.protobuf.hl;
import java.util.LinkedList;

public final class a extends bsr
{
  public LinkedList<String> kKk;
  public boolean kKl;
  public boolean kKm;
  public boolean kKn;

  public a()
  {
    AppMethodBeat.i(35506);
    this.kKk = new LinkedList();
    AppMethodBeat.o(35506);
  }

  public final int op(int paramInt, Object[] paramArrayOfObject)
  {
    int i = 0;
    AppMethodBeat.i(35507);
    if (paramInt == 0)
    {
      paramArrayOfObject = (e.a.a.c.a)paramArrayOfObject[0];
      if (this.BaseRequest != null)
      {
        paramArrayOfObject.iy(1, this.BaseRequest.computeSize());
        this.BaseRequest.writeFields(paramArrayOfObject);
      }
      paramArrayOfObject.e(2, 1, this.kKk);
      paramArrayOfObject.aO(3, this.kKl);
      paramArrayOfObject.aO(4, this.kKm);
      paramArrayOfObject.aO(5, this.kKn);
      AppMethodBeat.o(35507);
      paramInt = i;
      return paramInt;
    }
    if (paramInt == 1)
      if (this.BaseRequest == null)
        break label516;
    label516: for (paramInt = e.a.a.a.ix(1, this.BaseRequest.computeSize()) + 0; ; paramInt = 0)
    {
      paramInt = paramInt + e.a.a.a.c(2, 1, this.kKk) + (e.a.a.b.b.a.fv(3) + 1) + (e.a.a.b.b.a.fv(4) + 1) + (e.a.a.b.b.a.fv(5) + 1);
      AppMethodBeat.o(35507);
      break;
      if (paramInt == 2)
      {
        paramArrayOfObject = (byte[])paramArrayOfObject[0];
        this.kKk.clear();
        paramArrayOfObject = new e.a.a.a.a(paramArrayOfObject, unknownTagHandler);
        for (paramInt = bsr.getNextFieldNumber(paramArrayOfObject); paramInt > 0; paramInt = bsr.getNextFieldNumber(paramArrayOfObject))
          if (!super.populateBuilderWithField(paramArrayOfObject, this, paramInt))
            paramArrayOfObject.ems();
        AppMethodBeat.o(35507);
        paramInt = i;
        break;
      }
      if (paramInt == 3)
      {
        Object localObject1 = (e.a.a.a.a)paramArrayOfObject[0];
        a locala = (a)paramArrayOfObject[1];
        paramInt = ((Integer)paramArrayOfObject[2]).intValue();
        switch (paramInt)
        {
        default:
          paramInt = -1;
          AppMethodBeat.o(35507);
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
            locala.BaseRequest = ((hl)localObject1);
          }
          AppMethodBeat.o(35507);
          paramInt = i;
          break;
        case 2:
          locala.kKk.add(((e.a.a.a.a)localObject1).BTU.readString());
          AppMethodBeat.o(35507);
          paramInt = i;
          break;
        case 3:
          locala.kKl = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(35507);
          paramInt = i;
          break;
        case 4:
          locala.kKm = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(35507);
          paramInt = i;
          break;
        case 5:
          locala.kKn = ((e.a.a.a.a)localObject1).BTU.ehX();
          AppMethodBeat.o(35507);
          paramInt = i;
          break;
        }
      }
      paramInt = -1;
      AppMethodBeat.o(35507);
      break;
    }
  }
}

/* Location:           C:\Users\Lin\Downloads\dex-tools-2.1-SNAPSHOT\dex-tools-2.1-SNAPSHOT\classes7-dex2jar.jar
 * Qualified Name:     com.tencent.mm.plugin.downloader.c.a.a.a
 * JD-Core Version:    0.6.2
 */